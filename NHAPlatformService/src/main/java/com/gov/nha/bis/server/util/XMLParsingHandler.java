/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;


import org.xml.sax.helpers.DefaultHandler;


public abstract class XMLParsingHandler extends DefaultHandler {
	public abstract ConfigElement getRootElement();
}
