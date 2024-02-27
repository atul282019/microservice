/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.7</a>, using an XML
 * Schema.
 * $Id$
 */

package com.gov.nha.bis.upi.ack.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ResultType.
 * 
 * @version $Revision$ $Date$
 */
public class ResultType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The SUCCESS type
     */
    public static final int SUCCESS_TYPE = 0;

    /**
     * The instance of the SUCCESS type
     */
    public static final ResultType SUCCESS = new ResultType(SUCCESS_TYPE, "SUCCESS");

    /**
     * The FAILURE type
     */
    public static final int FAILURE_TYPE = 1;

    /**
     * The instance of the FAILURE type
     */
    public static final ResultType FAILURE = new ResultType(FAILURE_TYPE, "FAILURE");

    /**
     * The PARTIAL type
     */
    public static final int PARTIAL_TYPE = 2;

    /**
     * The instance of the PARTIAL type
     */
    public static final ResultType PARTIAL = new ResultType(PARTIAL_TYPE, "PARTIAL");

    /**
     * The DEEMED type
     */
    public static final int DEEMED_TYPE = 3;

    /**
     * The instance of the DEEMED type
     */
    public static final ResultType DEEMED = new ResultType(DEEMED_TYPE, "DEEMED");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private ResultType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.ResultType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ResultType
     * 
     * @return Enumeration
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getType
     * 
     * Returns the type of this ResultType
     * 
     * @return int
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     * 
     * 
     * 
     * @return Hashtable
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("SUCCESS", SUCCESS);
        members.put("FAILURE", FAILURE);
        members.put("PARTIAL", PARTIAL);
        members.put("DEEMED", DEEMED);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method readResolve
     * 
     *  will be called during deserialization to replace the
     * deserialized object with the correct constant instance.
     * <br/>
     * 
     * @return Object
     */
    private java.lang.Object readResolve()
    {
        return valueOf(this.stringValue);
    } //-- java.lang.Object readResolve() 

    /**
     * Method toString
     * 
     * Returns the String representation of this ResultType
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOf
     * 
     * Returns a new ResultType based on the given String value.
     * 
     * @param string
     * @return ResultType
     */
    public static com.gov.nha.bis.upi.ack.types.ResultType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ResultType";
            throw new IllegalArgumentException(err);
        }
        return (ResultType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.ResultType valueOf(java.lang.String) 

}
