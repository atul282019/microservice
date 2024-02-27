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
 * Class AccountDetailType.
 * 
 * @version $Revision$ $Date$
 */
public class AccountDetailType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The IIN type
     */
    public static final int IIN_TYPE = 0;

    /**
     * The instance of the IIN type
     */
    public static final AccountDetailType IIN = new AccountDetailType(IIN_TYPE, "IIN");

    /**
     * The UIDNUM type
     */
    public static final int UIDNUM_TYPE = 1;

    /**
     * The instance of the UIDNUM type
     */
    public static final AccountDetailType UIDNUM = new AccountDetailType(UIDNUM_TYPE, "UIDNUM");

    /**
     * The IFSC type
     */
    public static final int IFSC_TYPE = 2;

    /**
     * The instance of the IFSC type
     */
    public static final AccountDetailType IFSC = new AccountDetailType(IFSC_TYPE, "IFSC");

    /**
     * The ACTYPE type
     */
    public static final int ACTYPE_TYPE = 3;

    /**
     * The instance of the ACTYPE type
     */
    public static final AccountDetailType ACTYPE = new AccountDetailType(ACTYPE_TYPE, "ACTYPE");

    /**
     * The ACNUM type
     */
    public static final int ACNUM_TYPE = 4;

    /**
     * The instance of the ACNUM type
     */
    public static final AccountDetailType ACNUM = new AccountDetailType(ACNUM_TYPE, "ACNUM");

    /**
     * The MMID type
     */
    public static final int MMID_TYPE = 5;

    /**
     * The instance of the MMID type
     */
    public static final AccountDetailType MMID = new AccountDetailType(MMID_TYPE, "MMID");

    /**
     * The MOBNUM type
     */
    public static final int MOBNUM_TYPE = 6;

    /**
     * The instance of the MOBNUM type
     */
    public static final AccountDetailType MOBNUM = new AccountDetailType(MOBNUM_TYPE, "MOBNUM");

    /**
     * The CARDNUM type
     */
    public static final int CARDNUM_TYPE = 7;

    /**
     * The instance of the CARDNUM type
     */
    public static final AccountDetailType CARDNUM = new AccountDetailType(CARDNUM_TYPE, "CARDNUM");

    /**
     * The CREDIT type
     */
    public static final int CREDIT_TYPE = 8;

    /**
     * The instance of the CREDIT type
     */
    public static final AccountDetailType CREDIT = new AccountDetailType(CREDIT_TYPE, "CREDIT");

    /**
     * The PPIWALLET type
     */
    public static final int PPIWALLET_TYPE = 9;

    /**
     * The instance of the PPIWALLET type
     */
    public static final AccountDetailType PPIWALLET = new AccountDetailType(PPIWALLET_TYPE, "PPIWALLET");

    /**
     * The BANKWALLET type
     */
    public static final int BANKWALLET_TYPE = 10;

    /**
     * The instance of the BANKWALLET type
     */
    public static final AccountDetailType BANKWALLET = new AccountDetailType(BANKWALLET_TYPE, "BANKWALLET");

    /**
     * The SEMICLOSEDBANKWALLET type
     */
    public static final int SEMICLOSEDBANKWALLET_TYPE = 11;

    /**
     * The instance of the SEMICLOSEDBANKWALLET type
     */
    public static final AccountDetailType SEMICLOSEDBANKWALLET = new AccountDetailType(SEMICLOSEDBANKWALLET_TYPE, "SEMICLOSEDBANKWALLET");

    /**
     * The SEMICLOSEDPPIWALLET type
     */
    public static final int SEMICLOSEDPPIWALLET_TYPE = 12;

    /**
     * The instance of the SEMICLOSEDPPIWALLET type
     */
    public static final AccountDetailType SEMICLOSEDPPIWALLET = new AccountDetailType(SEMICLOSEDPPIWALLET_TYPE, "SEMICLOSEDPPIWALLET");

    /**
     * The NRO type
     */
    public static final int NRO_TYPE = 13;

    /**
     * The instance of the NRO type
     */
    public static final AccountDetailType NRO = new AccountDetailType(NRO_TYPE, "NRO");

    /**
     * The UIDTOKEN type
     */
    public static final int UIDTOKEN_TYPE = 14;

    /**
     * The instance of the UIDTOKEN type
     */
    public static final AccountDetailType UIDTOKEN = new AccountDetailType(UIDTOKEN_TYPE, "UIDTOKEN");

    /**
     * The VID type
     */
    public static final int VID_TYPE = 15;

    /**
     * The instance of the VID type
     */
    public static final AccountDetailType VID = new AccountDetailType(VID_TYPE, "VID");

    /**
     * The REFKEY type
     */
    public static final int REFKEY_TYPE = 16;

    /**
     * The instance of the REFKEY type
     */
    public static final AccountDetailType REFKEY = new AccountDetailType(REFKEY_TYPE, "REFKEY");

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

    private AccountDetailType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.AccountDetailType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * AccountDetailType
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
     * Returns the type of this AccountDetailType
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
        members.put("IIN", IIN);
        members.put("UIDNUM", UIDNUM);
        members.put("IFSC", IFSC);
        members.put("ACTYPE", ACTYPE);
        members.put("ACNUM", ACNUM);
        members.put("MMID", MMID);
        members.put("MOBNUM", MOBNUM);
        members.put("CARDNUM", CARDNUM);
        members.put("CREDIT", CREDIT);
        members.put("PPIWALLET", PPIWALLET);
        members.put("BANKWALLET", BANKWALLET);
        members.put("SEMICLOSEDBANKWALLET", SEMICLOSEDBANKWALLET);
        members.put("SEMICLOSEDPPIWALLET", SEMICLOSEDPPIWALLET);
        members.put("NRO", NRO);
        members.put("UIDTOKEN", UIDTOKEN);
        members.put("VID", VID);
        members.put("REFKEY", REFKEY);
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
     * Returns the String representation of this AccountDetailType
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
     * Returns a new AccountDetailType based on the given String
     * value.
     * 
     * @param string
     * @return AccountDetailType
     */
    public static com.gov.nha.bis.upi.ack.types.AccountDetailType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AccountDetailType";
            throw new IllegalArgumentException(err);
        }
        return (AccountDetailType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.AccountDetailType valueOf(java.lang.String) 

}
