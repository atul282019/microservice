/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

public abstract interface NhaBisConstants {

	
	/**
	 * Constants for file names
	 */
	public static final String LOGGING_FILE_XML = "log4j.xml";
	
	public static final String LOGGING_FILE_PROP = "log4j.properties";
	
	/**
	 * Constant to identify the resource folder names under different projects
	 */
	public static final String RESOURCES_SUFFIX = "resources";

	public static final String EXTERNAL_RESOURCES_SUFFIX = "external";
	
	/** UTF 8 Encoding type*/
	public static final String ENCODING_TYPE_UTF_8 = "UTF-8";	
	
	/** Default Encoding type */
	public static final String DEFAULT_ENCODING_TYPE = ENCODING_TYPE_UTF_8;	

	/** Constant for system line separator */
	public static final String LINE_SEPARATOR_VALUE = "line.separator";

	/** Constant for system file seperator */
	public static final String FILE_SEPARATOR_VALUE = "file.separator";
	
	/** Castor binding xml file name */
	public static final String BINDING_XML_FILE_NAME = "packaged/binding.xml";
	
	/** The Application name identifier JVM system property*/
	public static final String UID_APP_NAME="in.gov.uidai.application.name";
	
	/** The generic logger name for performanace metrics*/
	public static final String PERF_LOGGER_CATEGORY="in.gov.uidai.platform.common.performance.PerformanceLogger";
	
	/**
	 * These are the possible values for db dialect configured at the platform
	 * installation instance
	 */
	public static final String ORACLE_DIALECT = "ORACLE";

	public static final String MY_SQL_DIALECT = "MYSQL";
	
	public static final String POSTGRESQL_DIALECT="POSTGRESQL";
	
	/** 
	 * This constant is a system level policy control to allow max search results on resident database.
	 * Used by Advance Search API and other APIs doing partial attribute searches...
	 */
	public static final int MAX_SEARCH_RESULTS_ALLOWED_POLICY = 19;
	public static final String HTTP_PROTOCOL="http:";
	public static final String FILE_PROTOCOL="file:";



}
