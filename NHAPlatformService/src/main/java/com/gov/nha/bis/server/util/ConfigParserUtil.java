/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.StringTokenizer;

public class ConfigParserUtil {
	public static Properties getProperties(String xpath,
			ConfigElement rootElement) throws ConfigurationException {
		ConfigElement element = getElement(xpath, rootElement);
		return getElementProperties(element.getChildren());
	}

	public static ConfigElement getElement(String xpath,
			ConfigElement rootElement) throws ConfigurationException {
		if (xpath.equals(rootElement.getName())) {
			return rootElement;
		}
		XPath path = new XPath(xpath);
		if (path.getCount() < 2) {
			return null;
		}

		ConfigElement element = rootElement;
		while (path.hasMoreTokens()) {
			String nextToken = path.nextToken();
			String tokenVal = path.tokenValue();
			if (tokenVal == null) {
				element = element.getChild(nextToken, true);
			} else {
				element = getChildWithValue(element.getChildren(), nextToken,
						tokenVal);
			}
		}
		return element;
	}


	public static ConfigElement[] getElements(String xpath, String elementName,
			ConfigElement rootElelement) throws ConfigurationException {
		ConfigElement element = getElement(xpath, rootElelement);
		ArrayList<ConfigElement> matchingElements = new ArrayList<ConfigElement>();
		Iterator<ConfigElement> it = element.getChildren();
		while (it.hasNext()) {
			ConfigElement child = it.next();
			if (child.getName().equals(elementName)) {
				matchingElements.add(child);
			}
		}
		return (ConfigElement[]) matchingElements.toArray(new ConfigElement[0]);
	}

	private static Properties getElementProperties(Iterator<ConfigElement> it) {
		Properties props = new Properties();
		while (it.hasNext()) {
			ConfigElement child = it.next();
			if (child.getChildrenCount() == 0 && child.getValue() != null) {
				props.setProperty(child.getName(), child.getValue());
			}
		}
		return props;
	}

	private static ConfigElement getChildWithValue(Iterator<ConfigElement> it, String name,
			String value) {
		while (it.hasNext()) {
			ConfigElement child =  it.next();
			if (child.getName().equals(name) && value.equals(child.getValue())) {
				return child;
			}
		}
		return null;
	}

	private static class XPath {

		private StringTokenizer st = null;

		private String tokenVal = null;

		public XPath(String path) {
			st = new StringTokenizer(path, "/");
		}

		public int getCount() {
			return st.countTokens();
		}

		public String nextToken() {
			tokenVal = null;
			String token = st.nextToken();
			int index = token.indexOf("{");
			if (index != -1) {
				tokenVal = token.substring(index + 1, token.length() - 1);
				token = token.substring(0, index);
			}
			return token;
		}

		public String tokenValue() {
			return tokenVal;
		}

		public boolean hasMoreTokens() {
			return st.hasMoreTokens();
		}
	}
}
