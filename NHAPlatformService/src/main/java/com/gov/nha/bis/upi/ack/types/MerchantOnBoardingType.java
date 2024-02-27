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
 * Class MerchantOnBoardingType.
 * 
 * @version $Revision$ $Date$
 */
public class MerchantOnBoardingType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The BANK type
     */
    public static final int BANK_TYPE = 0;

    /**
     * The instance of the BANK type
     */
    public static final MerchantOnBoardingType BANK = new MerchantOnBoardingType(BANK_TYPE, "BANK");

    /**
     * The AGGREGATOR type
     */
    public static final int AGGREGATOR_TYPE = 1;

    /**
     * The instance of the AGGREGATOR type
     */
    public static final MerchantOnBoardingType AGGREGATOR = new MerchantOnBoardingType(AGGREGATOR_TYPE, "AGGREGATOR");

    /**
     * The NETWORK type
     */
    public static final int NETWORK_TYPE = 2;

    /**
     * The instance of the NETWORK type
     */
    public static final MerchantOnBoardingType NETWORK = new MerchantOnBoardingType(NETWORK_TYPE, "NETWORK");

    /**
     * The TPAP type
     */
    public static final int TPAP_TYPE = 3;

    /**
     * The instance of the TPAP type
     */
    public static final MerchantOnBoardingType TPAP = new MerchantOnBoardingType(TPAP_TYPE, "TPAP");

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

    private MerchantOnBoardingType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.MerchantOnBoardingType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * MerchantOnBoardingType
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
     * Returns the type of this MerchantOnBoardingType
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
        members.put("BANK", BANK);
        members.put("AGGREGATOR", AGGREGATOR);
        members.put("NETWORK", NETWORK);
        members.put("TPAP", TPAP);
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
     * MerchantOnBoardingType
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
     * Returns a new MerchantOnBoardingType based on the given
     * String value.
     * 
     * @param string
     * @return MerchantOnBoardingType
     */
    public static com.gov.nha.bis.upi.ack.types.MerchantOnBoardingType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MerchantOnBoardingType";
            throw new IllegalArgumentException(err);
        }
        return (MerchantOnBoardingType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.MerchantOnBoardingType valueOf(java.lang.String) 

}
