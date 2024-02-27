/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class ConfigProperty implements ConfigElement {

	private static final Log logger = LogFactory.getLog(ConfigProperty.class);

	private String name;

	private String value;

	private List<ConfigElement> children;

	private ConfigElement parent;

	public ConfigProperty(String name) {
		this(name, null, null);
	}

	public ConfigProperty(String name, String value, ConfigElement parent) {
		this.name = name;
		this.value = value;
		this.parent = parent;
		this.children = new ArrayList<ConfigElement>();
	}

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}

	public ConfigElement getParent() {
		return this.parent;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setParent(ConfigElement parent) {
		this.parent = parent;
	}

	public boolean doesChildExist(String name) {
		ConfigElement matchingElement = this.findMatchingChild(name, false);
		return (matchingElement == null) ? false : true;
	}

	public boolean doesChildExist(String name, boolean includeChildrenHierarchy) {
		ConfigElement matchingElement = this.findMatchingChild(name,
				includeChildrenHierarchy);
		return (matchingElement == null) ? false : true;
	}

	public ConfigElement getChild(String name) throws ConfigurationException {
		return this.getChild(name, false);
	}


	public ConfigElement getChild(String name, boolean includeChildrenHierarchy)
			throws ConfigurationException {
		ConfigElement matchingElement = this.findMatchingChild(name,
				includeChildrenHierarchy);
		if (matchingElement == null) {
			throw new ConfigurationException("Config Element by name : " + name
					+ " not found");
		} else {
			return matchingElement;
		}
	}
	public ConfigElement getChildAtIndex(int index)
			throws ConfigurationException {
		ConfigElement child = null;
		try {
			child = (ConfigElement) this.children.get(index);
		} catch (IndexOutOfBoundsException ioe) {
			logger.error(
					"Attempt to get child config element at invalid index : "
							+ index, ioe);
		}
		return child;
	}

	public int getChildrenCount() {
		return this.children.size();
	}

	public void addChild(ConfigElement child) {
		this.children.add(child);
	}

	public Iterator<ConfigElement> getChildren() {
		return this.children.iterator();
	}

	public boolean equals(Object obj) {
		return this.getName().equals(((ConfigElement) obj).getName());
	}
	public String toString() {
		return toString(0);
	}
	protected String toString(int indent) {
		StringBuffer buffer = new StringBuffer();
		char[] indentChars = new char[indent];
		for (int i = 0; i < indent; i++) {
			indentChars[i] = '-';
		}
		buffer.append(new String(indentChars));
		buffer.append("Name = ");
		buffer.append(this.getName());
		buffer.append(" Value= ");
		buffer.append(this.getValue());
		buffer.append("\n");
		Iterator<ConfigElement> iterator = this.getChildren();
		while (iterator.hasNext()) {
			buffer.append(((ConfigProperty) iterator.next())
					.toString(indent + 1));
		}
		return buffer.toString();
	}

	private ConfigProperty findMatchingChild(String name,
			boolean includeChildrenHierarchy) {
		ConfigProperty searchProperty = new ConfigProperty(name);
		if (!this.equals(searchProperty)) {
			Iterator<ConfigElement> iterator = this.getChildren();
			while (iterator.hasNext()) {
				ConfigProperty childProperty = (ConfigProperty) iterator.next();
				if (!childProperty.equals(searchProperty)) {
					if (includeChildrenHierarchy) {
						ConfigProperty matchingProperty = childProperty
								.findMatchingChild(name, true);
						if (matchingProperty != null) {
							return matchingProperty;
						}
					}
				} else {
					return childProperty;
				}
			}
		} else {
			return this;
		}
		return null;
	}

}
