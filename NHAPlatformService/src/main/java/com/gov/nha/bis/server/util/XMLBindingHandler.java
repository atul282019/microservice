/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


public class XMLBindingHandler extends XMLParsingHandler {
	
	private static final Log logger = LogFactory.getLog(XMLBindingHandler.class);	
	
	/** constant for the element name string */
	private static final String ELEMENT_BINDING = "castor:binding";
	private static final String ELEMENT_PACKAGE = "package";
    private static final String ELEMENT_NAME = "name";
    private static final String ELEMENT_NAMESPACE = "namespace";

    /** text stores text data of current element */
	private String text;
	
	/** NameSpace stores text data of current name space element */
    private String nameSpace;
    
    /** NameSpace stores text data of current name element */
	private String packageName;

	/** rootElement of binding file */
	private ConfigElement rootElement;
	
	/** no argument constructor of this class */
	public XMLBindingHandler() {
		text = "";
		nameSpace = "";
		packageName = "";
	}
	
	public void startElement(String namespaceURI, String localName, 
		String rawName, Attributes attributes) throws SAXException {
		if(rawName.equals(ELEMENT_BINDING)) {
			rootElement= new ConfigProperty(ELEMENT_BINDING);
		}
	}
	
	public void endElement(String namespaceURI, String localName, String rawName)
			throws SAXException {
		if (rawName.equals(ELEMENT_NAME)) {
			packageName = text;
		}
		if (rawName.equals(ELEMENT_NAMESPACE)) {
			nameSpace = text;
		}
		if (rawName.equals(ELEMENT_PACKAGE)) {
			if(!"".equals(nameSpace) && !"".equals(packageName)) {
				ConfigElement child= new ConfigProperty(nameSpace, packageName, rootElement);
				((ConfigProperty)rootElement).addChild(child);
			}
			nameSpace = "";
			packageName = "";
		}
		text = "";
	}

	public void characters(char[] ch, int start, int length)
			throws SAXException {
		text += new String(ch, start, length).trim();
	}
    
	public void warning(SAXParseException e) throws SAXException {
		logger.warn("XML Handler warning: " + e.getMessage());
	}

	public void error(SAXParseException e) throws SAXException {
		logger.error("XML Handler error: " + e.getMessage());
	}

	public void fatalError(SAXParseException e) throws SAXException {
		logger.fatal("XML Handler fatal error: " + e.getMessage());
	}
	public ConfigElement getRootElement() {
		return rootElement;
	}

}
