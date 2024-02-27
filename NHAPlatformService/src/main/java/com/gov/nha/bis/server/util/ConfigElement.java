/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.util.Iterator;


public interface ConfigElement {
	public String getName();
	
	public String getValue();
	
	public ConfigElement getParent();

	public boolean doesChildExist(String name);

	public boolean doesChildExist(String name, boolean includeChildrenHierarchy);

	public ConfigElement getChild(String name) throws ConfigurationException;
	
	public ConfigElement getChild(String name, boolean includeChildrenHierarchy) throws ConfigurationException;
	public ConfigElement getChildAtIndex(int index) throws ConfigurationException;
	
	public int getChildrenCount();
	
	public Iterator<ConfigElement> getChildren();
	
}
