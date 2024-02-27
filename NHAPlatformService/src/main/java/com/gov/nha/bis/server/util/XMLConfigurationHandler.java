/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class XMLConfigurationHandler extends XMLParsingHandler {
	
	private static final Log logger = LogFactory.getLog(XMLConfigurationHandler.class);		
	public static final String ELEMENT_IDENTIFIER = "property";
	public static final String ELEMENT_NAME = "name";
	public static final String ELEMENT_VALUE = "value";	
	protected final ArrayList<ConfigProperty> elements = new ArrayList<ConfigProperty>();	

	public XMLConfigurationHandler() {		
	}

	public void startElement(String namespaceURI, String localName, 
		String rawName, Attributes attributes) throws SAXException {
		if(rawName.equals(ELEMENT_IDENTIFIER)) {
			try {
				addProperty(attributes);
			} catch(Exception e) {
				logger.error("Error adding a new property", e);
				throw new SAXException(e.getMessage());
			}
		}
	}	
	
	public void endElement(String namespaceURI, 
		String localName, String rawName) throws SAXException {
		int location = this.elements.size() - 1;
		if (location > 0) {
			elements.remove(location);
		}			
	}	
	
	public ConfigElement getRootElement() {
		return this.elements.size() > 0 ? (ConfigElement)this.elements.get(0) : null;
	}

	public void error(SAXParseException exception) throws SAXException {
		throw exception;
	}

	public void warning(SAXParseException exception) throws SAXException {
		throw exception;
	}

	public void fatalError(SAXParseException exception) throws SAXException {
		throw exception;
	}	
	protected void addProperty(Attributes attributes) throws Exception {
		int location = this.elements.size() - 1;
		ConfigProperty parent = null;
		if (location >= 0) {
			parent = (ConfigProperty)elements.get(location);
		}
		ConfigProperty currentProperty = 
			new ConfigProperty(attributes.getValue(ELEMENT_NAME),attributes.getValue(ELEMENT_VALUE), parent);
		if (parent != null) {
			parent.addChild(currentProperty);
		}
		elements.add(currentProperty);
	}	

}
