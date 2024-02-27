/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class XMLConfigurationParser {
	
	private static final Log logger = LogFactory.getLog(XMLConfigurationParser.class);			
    	
	private static final String APACHE_SAX_PARSER = "org.apache.xerces.parsers.SAXParser";
	
	private static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
	private static final String VALIDATAION_FEATURE = "http://xml.org/sax/features/validation";
	private static final String VALIDATAION_SCHEMA_FEATURE = "http://apache.org/xml/features/validation/schema";
	private static final String VALIDATAION_SCHEMA_FULL_CHECKING_FEATURE = "http://apache.org/xml/features/validation/schema-full-checking";
	
	private XMLReader parser;
	
	private XMLParsingHandler handler;
		
	public XMLConfigurationParser() {
		this(new XMLConfigurationHandler(), false);			
	}
	
	public XMLConfigurationParser(XMLParsingHandler handler, boolean isValidateXMLWithXSD) {
		try {
			this.parser = XMLReaderFactory.createXMLReader(APACHE_SAX_PARSER);
			if(isValidateXMLWithXSD) {
				parser.setFeature(NAMESPACES_FEATURE, true);
				parser.setFeature(VALIDATAION_FEATURE, true);
				parser.setFeature(VALIDATAION_SCHEMA_FEATURE, true);
				parser.setFeature(VALIDATAION_SCHEMA_FULL_CHECKING_FEATURE, true);
			}
			this.handler = handler;						
			this.parser.setContentHandler(this.handler);
			this.parser.setErrorHandler(this.handler);
		} catch(Exception se) {
			logger.error("Unable to setup SAX parser : " + se.getMessage(), se);
			throw new RuntimeException("Unable to setup SAX parser : " + se.getMessage());
		}
	}
	
	public ConfigElement buildFromFile(URL aFile) throws ConfigurationException {
		try	{
			parser.parse(new InputSource(aFile.openStream()));
		} catch(SAXException sax) {
			logger.error("Error parsing XML from file: " + aFile.toString(), sax);
			throw new ConfigurationException("Error parsing XML: " + sax.getMessage());
		} catch (IOException e) {
			logger.error("Error parsing XML from file: " + aFile.toString(), e);
			throw new ConfigurationException("Error parsing XML: " + e.getMessage());
		}
		return handler.getRootElement();
	}	
	
	public ConfigElement[] buildFromFile(URL[] aFile) throws ConfigurationException {
		ConfigElement[] rootElements = null;
		if(aFile != null && aFile.length != 0) {
			rootElements = new ConfigElement[aFile.length];
			ConfigElement rootConfigElement;
		    for(int i=0; i<aFile.length; i++) {
				rootConfigElement = buildFromFile(aFile[i]);
				if(rootConfigElement != null) {
					rootElements[i] = rootConfigElement;
				}
			}
		}
		return rootElements;
	}
	
	public static Log getLogger() {
		return logger;
	}

	@SuppressWarnings("unused")
	private void checkFile(File file) throws ConfigurationException {
		if(!file.exists()) {
			throw new ConfigurationException("File " + file.getAbsolutePath() + " does not exist.");
		} else {
			return;
		}
	}	
	
	/*
	 * public static void main(String[] args) { XMLConfigurationParser parser = new
	 * XMLConfigurationParser(new XMLConfigurationHandler(), false); try {
	 * logger.info(parser.buildFromFile(new URL(args[0]))); } catch
	 * (ConfigurationException e) { logger.error(e); } catch (MalformedURLException
	 * e) { logger.error(e); } }
	 */

}
