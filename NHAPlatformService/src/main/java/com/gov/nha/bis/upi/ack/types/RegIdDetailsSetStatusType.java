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
 * Class RegIdDetailsSetStatusType.
 * 
 * @version $Revision$ $Date$
 */
public class RegIdDetailsSetStatusType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ACTIVE type
     */
    public static final int ACTIVE_TYPE = 0;

    /**
     * The instance of the ACTIVE type
     */
    public static final RegIdDetailsSetStatusType ACTIVE = new RegIdDetailsSetStatusType(ACTIVE_TYPE, "ACTIVE");

    /**
     * The INACTIVE type
     */
    public static final int INACTIVE_TYPE = 1;

    /**
     * The instance of the INACTIVE type
     */
    public static final RegIdDetailsSetStatusType INACTIVE = new RegIdDetailsSetStatusType(INACTIVE_TYPE, "INACTIVE");

    /**
     * The BLOCK type
     */
    public static final int BLOCK_TYPE = 2;

    /**
     * The instance of the BLOCK type
     */
    public static final RegIdDetailsSetStatusType BLOCK = new RegIdDetailsSetStatusType(BLOCK_TYPE, "BLOCK");

    /**
     * The UNBLOCK type
     */
    public static final int UNBLOCK_TYPE = 3;

    /**
     * The instance of the UNBLOCK type
     */
    public static final RegIdDetailsSetStatusType UNBLOCK = new RegIdDetailsSetStatusType(UNBLOCK_TYPE, "UNBLOCK");

    /**
     * The DEREGISTER type
     */
    public static final int DEREGISTER_TYPE = 4;

    /**
     * The instance of the DEREGISTER type
     */
    public static final RegIdDetailsSetStatusType DEREGISTER = new RegIdDetailsSetStatusType(DEREGISTER_TYPE, "DEREGISTER");

    /**
     * The PORTED type
     */
    public static final int PORTED_TYPE = 5;

    /**
     * The instance of the PORTED type
     */
    public static final RegIdDetailsSetStatusType PORTED = new RegIdDetailsSetStatusType(PORTED_TYPE, "PORTED");

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

    private RegIdDetailsSetStatusType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.RegIdDetailsSetStatusType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * RegIdDetailsSetStatusType
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
     * Returns the type of this RegIdDetailsSetStatusType
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
        members.put("ACTIVE", ACTIVE);
        members.put("INACTIVE", INACTIVE);
        members.put("BLOCK", BLOCK);
        members.put("UNBLOCK", UNBLOCK);
        members.put("DEREGISTER", DEREGISTER);
        members.put("PORTED", PORTED);
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
     * Returns the String representation of this
     * RegIdDetailsSetStatusType
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
     * Returns a new RegIdDetailsSetStatusType based on the given
     * String value.
     * 
     * @param string
     * @return RegIdDetailsSetStatusType
     */
    public static com.gov.nha.bis.upi.ack.types.RegIdDetailsSetStatusType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RegIdDetailsSetStatusType";
            throw new IllegalArgumentException(err);
        }
        return (RegIdDetailsSetStatusType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.RegIdDetailsSetStatusType valueOf(java.lang.String) 

}
