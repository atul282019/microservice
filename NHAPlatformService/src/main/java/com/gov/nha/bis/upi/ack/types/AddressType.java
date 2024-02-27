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
 * Class AddressType.
 * 
 * @version $Revision$ $Date$
 */
public class AddressType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The AADHAAR type
     */
    public static final int AADHAAR_TYPE = 0;

    /**
     * The instance of the AADHAAR type
     */
    public static final AddressType AADHAAR = new AddressType(AADHAAR_TYPE, "AADHAAR");

    /**
     * The ACCOUNT type
     */
    public static final int ACCOUNT_TYPE = 1;

    /**
     * The instance of the ACCOUNT type
     */
    public static final AddressType ACCOUNT = new AddressType(ACCOUNT_TYPE, "ACCOUNT");

    /**
     * The MOBILE type
     */
    public static final int MOBILE_TYPE = 2;

    /**
     * The instance of the MOBILE type
     */
    public static final AddressType MOBILE = new AddressType(MOBILE_TYPE, "MOBILE");

    /**
     * The CARD type
     */
    public static final int CARD_TYPE = 3;

    /**
     * The instance of the CARD type
     */
    public static final AddressType CARD = new AddressType(CARD_TYPE, "CARD");

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

    private AddressType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.AddressType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * AddressType
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
     * Returns the type of this AddressType
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
        members.put("AADHAAR", AADHAAR);
        members.put("ACCOUNT", ACCOUNT);
        members.put("MOBILE", MOBILE);
        members.put("CARD", CARD);
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
     * Returns the String representation of this AddressType
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
     * Returns a new AddressType based on the given String value.
     * 
     * @param string
     * @return AddressType
     */
    public static com.gov.nha.bis.upi.ack.types.AddressType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AddressType";
            throw new IllegalArgumentException(err);
        }
        return (AddressType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.AddressType valueOf(java.lang.String) 

}
