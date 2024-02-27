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
 * Class MerchantIdentifierType.
 * 
 * @version $Revision$ $Date$
 */
public class MerchantIdentifierType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The SMALL type
     */
    public static final int SMALL_TYPE = 0;

    /**
     * The instance of the SMALL type
     */
    public static final MerchantIdentifierType SMALL = new MerchantIdentifierType(SMALL_TYPE, "SMALL");

    /**
     * The LARGE type
     */
    public static final int LARGE_TYPE = 1;

    /**
     * The instance of the LARGE type
     */
    public static final MerchantIdentifierType LARGE = new MerchantIdentifierType(LARGE_TYPE, "LARGE");

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

    private MerchantIdentifierType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.MerchantIdentifierType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * MerchantIdentifierType
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
     * Returns the type of this MerchantIdentifierType
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
        members.put("SMALL", SMALL);
        members.put("LARGE", LARGE);
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
     * MerchantIdentifierType
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
     * Returns a new MerchantIdentifierType based on the given
     * String value.
     * 
     * @param string
     * @return MerchantIdentifierType
     */
    public static com.gov.nha.bis.upi.ack.types.MerchantIdentifierType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MerchantIdentifierType";
            throw new IllegalArgumentException(err);
        }
        return (MerchantIdentifierType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.MerchantIdentifierType valueOf(java.lang.String) 

}
