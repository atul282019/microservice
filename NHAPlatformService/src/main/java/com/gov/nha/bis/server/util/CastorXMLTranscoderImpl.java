/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.ClassDescriptorResolver;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.util.ClassDescriptorResolverImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.gov.nha.bis.security.exception.BisException;

public class CastorXMLTranscoderImpl implements XMLTranscoder {

	private static final Log logger = LogFactory.getLog(CastorXMLTranscoderImpl.class);

	private URL[] castorBindingFiles;

	private ConfigElement[] rootConfigElements;

	private static ThreadLocal<DocumentBuilder> documentBuilderThreadLocal = new ThreadLocal<DocumentBuilder>() {
		@Override
		protected DocumentBuilder initialValue() {
			try {
				DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
				documentBuilderFactory.setExpandEntityReferences(false);
				documentBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
				documentBuilderFactory.setNamespaceAware(true);
				return documentBuilderFactory.newDocumentBuilder();
				
			} catch (ParserConfigurationException e) {
				logger.error("Error while configuring DigitalSignatureHelper", e);
				throw new RuntimeException("Error while configuring DigitalSignatureHelper", e);
			}
		}
	};
	
	private static ClassDescriptorResolver cdr = new ClassDescriptorResolverImpl();

	public CastorXMLTranscoderImpl(URL[] castorBindingFiles) {
		this.castorBindingFiles = castorBindingFiles;
		this.rootConfigElements = getRootConfigElements();
	}

	public String marshal(Object object) throws BisException {
		return marshal(object, true, false);
	}

	public String marshal(Object object, boolean isValidationRequired, boolean suppressNamespaces) throws BisException {
		return marshal(object, isValidationRequired, suppressNamespaces, null);
	}

	public String marshal(Object object, boolean isValidationRequired, boolean suppressNamespaces, Helper helper) throws BisException {
		StringWriter stringWriter = new StringWriter();
		try {
			Marshaller marshaller = new Marshaller(stringWriter);

			marshaller.setResolver(cdr);
			marshaller.setValidation(isValidationRequired);
			marshaller.setSuppressNamespaces(suppressNamespaces);
			marshaller.setEncoding(NhaBisConstants.DEFAULT_ENCODING_TYPE);
			
			if (helper != null && helper instanceof CastorHelper) {
				marshaller.setMapping(((CastorHelper) helper).getMapping());
			}
			
			marshaller.marshal(object);
			
		} catch (MappingException e) {
			logger.error("MappingException is occrred in coverting java object to XML", e);
			throw new BisException(e);
		} catch (IOException e) {
			logger.error("IOException is occrred in coverting java object to XML", e);
			throw new BisException(e);
		} catch (MarshalException e) {
			logger.error("MarshalException is occrred in coverting java object to XML", e);
			throw new BisException(e);
		} catch (ValidationException e) {
			logger.error("ValidationException is occrred in coverting java object to XML", e);
			throw new BisException(e);
		}

		return stringWriter.toString();
	}

	public Object unmarshal(String xml) throws BisException {
		return unmarshal(xml, true, false);
	}

	public Object unmarshal(Element xmlElement, boolean ignoreExtraElementsAndAttributes) throws BisException {
		return unmarshal(xmlElement, true, ignoreExtraElementsAndAttributes);
	}
	
	public Object unmarshal(Element xmlElement) throws BisException {
		return unmarshal(xmlElement, true, false);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object unmarshal(Element xmlElement, Class clazz) throws BisException {
		return unmarshal(xmlElement, clazz, true, false, false);
	}
	public Object unmarshal(String xml, boolean isValidationRequired, boolean ignoreExtraElementsAndAttributes) throws BisException {
		@SuppressWarnings("unused")
		Object object = null;
		Element xmlElement = stringToElement(xml);
		return unmarshal(xmlElement, isValidationRequired, ignoreExtraElementsAndAttributes);
	}
	public Object unmarshal(Element xmlElement, boolean isValidationRequired, boolean ignoreExtraElementsAndAttributes) throws BisException {
		Object object = null;
		try {
			String className = getClassNameForElement(xmlElement);
			if (className != null) {
				Unmarshaller unmarshaller = new Unmarshaller(Class.forName(className));
				unmarshaller.setIgnoreExtraElements(ignoreExtraElementsAndAttributes);
				unmarshaller.setValidation(isValidationRequired);
				unmarshaller.setResolver(cdr);
				object = unmarshaller.unmarshal(xmlElement);
			}
		} catch (Exception e) {
			logger.error("ClassNotFoundException is occrred in coverting XML to Java Object.\n " + xmlElement.toString(), e);
			throw new BisException(e);
		} 
		return object;
	}
	
	@SuppressWarnings("rawtypes")
	private Object unmarshal(Element xmlElement, Class clazz, boolean isValidationRequired, boolean ignoreExtraElementsAndAttributes) throws BisException {
		Object object = null;
		try {
			Unmarshaller unmarshaller = new Unmarshaller(clazz);
			unmarshaller.setIgnoreExtraElements(ignoreExtraElementsAndAttributes);
			unmarshaller.setValidation(isValidationRequired);
			unmarshaller.setResolver(cdr);
			object = unmarshaller.unmarshal(xmlElement);
		} catch (MarshalException e) {
			logger.error("UnmarshalException is occrred in coverting XML to Java Object.\n " + xmlElement.toString(), e);
			throw new BisException(e);
		} catch (ValidationException e) {
			logger.error("ValidationException is occrred in coverting XML to Java Object.\n " + xmlElement.toString(), e);
			throw new BisException(e);
		}
		return object;
	}
	
	@SuppressWarnings("rawtypes")
	private Object unmarshal(Element xmlElement, Class clazz, boolean isValidationRequired, boolean ignoreExtraElements, boolean ignoreExtraAttributes) throws BisException {
		Object object = null;
		try {
			Unmarshaller unmarshaller = new Unmarshaller(clazz);
			unmarshaller.setIgnoreExtraElements(ignoreExtraElements);
			unmarshaller.setIgnoreExtraAttributes(ignoreExtraAttributes);
			unmarshaller.setValidation(isValidationRequired);
			unmarshaller.setResolver(cdr);
			object = unmarshaller.unmarshal(xmlElement);
		} catch (MarshalException e) {
			logger.error("UnmarshalException is occrred in coverting XML to Java Object.\n " + xmlElement.toString(), e);
			throw new BisException(e);
		} catch (ValidationException e) {
			logger.error("ValidationException is occrred in coverting XML to Java Object.\n " + xmlElement.toString(), e);
			throw new BisException(e);
		}
		return object;
	}

	/**
	 * Interface method implementation
	 * 
	 * @see in.gov.uidai.platform.spi.transcoder.XMLTranscoder#unmarshal(java.lang.String)
	 */
	public <T> T unmarshal(String xml, Class<T> clazz) throws BisException {
		return unmarshal(xml, clazz, true, false);
	}

	/**
	 * Parses a given XML String as an object of specified class
	 * 
	 * @param xml
	 *            XML String to unmarshal
	 * @param clazz
	 *            Target class of the generated object
	 * @param isValidationRequired
	 *            If true, validates with XML Schema
	 * @param ignoreExtraElementsAndAttributes
	 *            If true, ignores extra elements and attributes
	 * @return Java object of type clazz
	 * @throws BisException
	 */
	@SuppressWarnings({ "unchecked" })
	public <T> T unmarshal(String xml, Class<T> clazz, boolean isValidationRequired, boolean ignoreExtraElementsAndAttributes) throws BisException {
		T object = null;
		try {
			Element xmlElement = stringToElement(xml);
			Unmarshaller unmarshaller = new Unmarshaller(clazz);
			unmarshaller.setIgnoreExtraElements(ignoreExtraElementsAndAttributes);
			unmarshaller.setIgnoreExtraAttributes(ignoreExtraElementsAndAttributes);
			unmarshaller.setValidation(isValidationRequired);
			unmarshaller.setResolver(cdr);
			object = (T) unmarshaller.unmarshal(xmlElement);
		} catch (MarshalException e) {
			logger.error("UnmarshalException is occrred in coverting XML to Java Object.\n " + xml, e);
			throw new BisException(e);
		} catch (ValidationException e) {
			logger.error("ValidationException is occrred in coverting XML to Java Object.\n " + xml, e);
			throw new BisException(e);
		}
		return object;
	}

	/**
	 * This method converts specified XML String to an equivalent XML DOM
	 * Element
	 * 
	 * @return Element DOM Element equivalent to specified XML
	 * @throws BisException
	 *             throws if SAXExcpetion, ParsingConfigurationException or
	 *             IOException was thrown
	 */
	public Element stringToElement(String xml) throws BisException {
		Document document = null;
		try {
			StringReader stringReader = new StringReader(xml);
			documentBuilderThreadLocal.get().reset();
			document = documentBuilderThreadLocal.get().parse(new InputSource(stringReader));
		} catch (SAXException e) {
			logger.error("SAXException is caught while parsing XML String:\n " + xml, e);
			throw new BisException(e);
		} catch (IOException e) {
			logger.error("IOException is caught while parsing XML String:\n " + xml, e);
			throw new BisException(e);
		}
		return document.getDocumentElement();
	}

	/**
	 * This method converts specified XML String to an equivalent XML DOM
	 * Element
	 * 
	 * @return Element DOM Element equivalent to specified XML
	 * @throws BisException
	 *             throws if SAXExcpetion, ParsingConfigurationException or
	 *             IOException was thrown
	 */
	@SuppressWarnings("static-access")
	public Element byteArrayToElement(byte[] xmldata) throws BisException {
		Document document = null;
		try {
			ByteArrayInputStream bin = new ByteArrayInputStream(xmldata);
			documentBuilderThreadLocal.get().reset();
			document = this.documentBuilderThreadLocal.get().parse(new InputSource(bin));
		} catch (SAXException e) {
			logger.error("SAXException is caught while parsing XML String:\n ", e);
			throw new BisException(e);
		} catch (IOException e) {
			logger.error("IOException is caught while parsing XML String:\n ", e);
			throw new BisException(e);
		}
		return document.getDocumentElement();
	}

	/**
	 * Gets the all root ConfigElements using XMLBindingHandler
	 * 
	 * @return ConfigElement[] null or root ConfigElements
	 */
	private ConfigElement[] getRootConfigElements() {
		ConfigElement[] rootConfigElements = null;
		XMLConfigurationParser parser = new XMLConfigurationParser(new XMLBindingHandler(), false);
		try {
			rootConfigElements = parser.buildFromFile(this.castorBindingFiles);
		} catch (ConfigurationException e) {
			logger.error("getRootElements(): Configuration Exception is caught: ", e);
		}
		return rootConfigElements;
	}

	/**
	 * This method gets class name from root node name and name space URI using
	 * XMLBindingHandler
	 * 
	 * @param Element
	 *            xmlElement represents root element of document
	 * @return String null or class name
	 * @throws ConfigurationException
	 *             thrown if name space is not found in any binding.xml.
	 */
	private String getClassNameForElement(Element xmlElement) throws ConfigurationException {
		String className = null;
		String nodeName = xmlElement.getNodeName();
		String nameSpaceURI = xmlElement.getNamespaceURI();

		String splitNames[] = nodeName.split("-");
		StringBuffer nodeNameCapilatized = new StringBuffer();
		for (int index = 0; index < splitNames.length; index++) {
			nodeNameCapilatized.append(splitNames[index].substring(0, 1).toUpperCase() + splitNames[index].substring(1));
		}

		// nodeName = nodeName.substring(0,1).toUpperCase() +
		// nodeName.substring(1);
		String packageName = null;
		if (rootConfigElements != null) {
			for (ConfigElement rootConfigElement : rootConfigElements) {
				try {
					packageName = rootConfigElement.getChild(nameSpaceURI, true).getValue();
				} catch (ConfigurationException e) {
					// skip the exception to check next binding.xml file
				}
				if (packageName != null) {
					className = packageName + "." + nodeNameCapilatized.toString();
					break;
				}
			}
		}
		if (className == null) {
			logger.error(nameSpaceURI + " is not found in any of Castor " + NhaBisConstants.BINDING_XML_FILE_NAME + " files");
			throw new ConfigurationException("Namespace is not found in any of Castor binding files");
		}
		return className;
	}

	public String getNamespace(String xml) throws BisException {
		Element xmlElement = stringToElement(xml);
		return getNamespace(xmlElement);
	}

	public String getNamespace(Element xmlElement) throws BisException {
		return xmlElement.getNamespaceURI();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.gov.uidai.platform.spi.transcoder.XMLTranscoder#marshal(java.lang.Object,
	 *      java.io.OutputStream)
	 */
	@Override
	public String marshal(Object objectToMarshal, OutputStream destination) throws BisException {
		try {
			Writer writer = new BufferedWriter(new OutputStreamWriter(destination, NhaBisConstants.DEFAULT_ENCODING_TYPE));
			Marshaller marshaller = new Marshaller(writer);
			marshaller.setEncoding(NhaBisConstants.DEFAULT_ENCODING_TYPE);
			marshaller.setResolver(cdr);
			marshaller.marshal(objectToMarshal);
		} catch (IOException e) {
			logger.error("IOException is occrred in coverting java object to XML", e);
			throw new BisException(e);
		} catch (MarshalException e) {
			logger.error("MarshalException is occrred in coverting java object to XML", e);
			throw new BisException(e);
		} catch (ValidationException e) {
			logger.error("ValidationException is occrred in coverting java object to XML", e);
			throw new BisException(e);
		}

		return null;
	}

	@SuppressWarnings({ "rawtypes", "static-access", "unchecked" })
	@Override
	public Object unmarshal(Class clazz, InputStream source, boolean isValidationRequired, boolean ignoreExtraElements) throws BisException {
		try {
			Reader reader = new BufferedReader(new InputStreamReader(source, NhaBisConstants.DEFAULT_ENCODING_TYPE));

			Unmarshaller unmarshaller = new Unmarshaller();
			unmarshaller.setValidation(isValidationRequired);
			unmarshaller.setIgnoreExtraElements(ignoreExtraElements);
			unmarshaller.setResolver(cdr);
			
			return unmarshaller.unmarshal(clazz, reader);

		} catch (MarshalException e) {
			logger.error("UnmarshalException is occurred in coverting XML to Java Object.\n ", e);
			throw new BisException(e);
		} catch (ValidationException e) {
			logger.error("ValidationException is occurred in coverting XML to Java Object.\n ", e);
			throw new BisException(e);
		} catch (UnsupportedEncodingException e) {
			logger.error("UnsupportedEncodingException is occurred in coverting XML to Java Object.\n ", e);
			throw new BisException(e);
		}
	}

	@Override
	public String getNamespace(byte[] xmldata) throws BisException {
		Element xmlElement = byteArrayToElement(xmldata);
		return getNamespace(xmlElement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(byte[] xmldata) throws BisException {
		@SuppressWarnings("unused")
		Object object = null;
		Element xmlElement = byteArrayToElement(xmldata);
		return unmarshal(xmlElement, true, false);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(byte[] xmldata, boolean isValidationRequired, boolean ignoreExtraElements) throws BisException {
		@SuppressWarnings("unused")		
		Object object = null;
		Element xmlElement = byteArrayToElement(xmldata);
		return unmarshal(xmlElement, isValidationRequired, ignoreExtraElements);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(@SuppressWarnings("rawtypes") Class clazz, byte[] xmldata) throws BisException {
		return unmarshal(clazz, new ByteArrayInputStream(xmldata), false, false);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(@SuppressWarnings("rawtypes") Class clazz, byte[] xmldata, boolean ignoreExtraElements) throws BisException {
		Element xmlElement = byteArrayToElement(xmldata);
		return unmarshal(xmlElement, clazz, true, ignoreExtraElements);
	}

	@SuppressWarnings("unchecked")
	public Object unmarshal(byte[] xmldata, boolean ignoreExtraElements) throws BisException {
		Element xmlElement = byteArrayToElement(xmldata);
		return unmarshal(xmlElement, true, ignoreExtraElements);
	}
}
