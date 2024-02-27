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
 * Class RegIdStatusType.
 * 
 * @version $Revision$ $Date$
 */
public class RegIdStatusType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The BLOCKED type
     */
    public static final int BLOCKED_TYPE = 0;

    /**
     * The instance of the BLOCKED type
     */
    public static final RegIdStatusType BLOCKED = new RegIdStatusType(BLOCKED_TYPE, "BLOCKED");

    /**
     * The ACTIVE type
     */
    public static final int ACTIVE_TYPE = 1;

    /**
     * The instance of the ACTIVE type
     */
    public static final RegIdStatusType ACTIVE = new RegIdStatusType(ACTIVE_TYPE, "ACTIVE");

    /**
     * The INACTIVE type
     */
    public static final int INACTIVE_TYPE = 2;

    /**
     * The instance of the INACTIVE type
     */
    public static final RegIdStatusType INACTIVE = new RegIdStatusType(INACTIVE_TYPE, "INACTIVE");

    /**
     * The NEW type
     */
    public static final int NEW_TYPE = 3;

    /**
     * The instance of the NEW type
     */
    public static final RegIdStatusType NEW = new RegIdStatusType(NEW_TYPE, "NEW");

    /**
     * The DEREGISTER type
     */
    public static final int DEREGISTER_TYPE = 4;

    /**
     * The instance of the DEREGISTER type
     */
    public static final RegIdStatusType DEREGISTER = new RegIdStatusType(DEREGISTER_TYPE, "DEREGISTER");

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

    private RegIdStatusType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.RegIdStatusType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * RegIdStatusType
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
     * Returns the type of this RegIdStatusType
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
        members.put("BLOCKED", BLOCKED);
        members.put("ACTIVE", ACTIVE);
        members.put("INACTIVE", INACTIVE);
        members.put("NEW", NEW);
        members.put("DEREGISTER", DEREGISTER);
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
     * Returns the String representation of this RegIdStatusType
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
     * Returns a new RegIdStatusType based on the given String
     * value.
     * 
     * @param string
     * @return RegIdStatusType
     */
    public static com.gov.nha.bis.upi.ack.types.RegIdStatusType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RegIdStatusType";
            throw new IllegalArgumentException(err);
        }
        return (RegIdStatusType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.RegIdStatusType valueOf(java.lang.String) 

}
