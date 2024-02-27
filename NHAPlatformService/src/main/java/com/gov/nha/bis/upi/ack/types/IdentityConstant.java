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
 * Class IdentityConstant.
 * 
 * @version $Revision$ $Date$
 */
public class IdentityConstant implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The PAN type
     */
    public static final int PAN_TYPE = 0;

    /**
     * The instance of the PAN type
     */
    public static final IdentityConstant PAN = new IdentityConstant(PAN_TYPE, "PAN");

    /**
     * The BANK type
     */
    public static final int BANK_TYPE = 1;

    /**
     * The instance of the BANK type
     */
    public static final IdentityConstant BANK = new IdentityConstant(BANK_TYPE, "BANK");

    /**
     * The AADHAAR type
     */
    public static final int AADHAAR_TYPE = 2;

    /**
     * The instance of the AADHAAR type
     */
    public static final IdentityConstant AADHAAR = new IdentityConstant(AADHAAR_TYPE, "AADHAAR");

    /**
     * The ACCOUNT type
     */
    public static final int ACCOUNT_TYPE = 3;

    /**
     * The instance of the ACCOUNT type
     */
    public static final IdentityConstant ACCOUNT = new IdentityConstant(ACCOUNT_TYPE, "ACCOUNT");

    /**
     * The GSTIN type
     */
    public static final int GSTIN_TYPE = 4;

    /**
     * The instance of the GSTIN type
     */
    public static final IdentityConstant GSTIN = new IdentityConstant(GSTIN_TYPE, "GSTIN");

    /**
     * The PASSPORT type
     */
    public static final int PASSPORT_TYPE = 5;

    /**
     * The instance of the PASSPORT type
     */
    public static final IdentityConstant PASSPORT = new IdentityConstant(PASSPORT_TYPE, "PASSPORT");

    /**
     * The VOTERID type
     */
    public static final int VOTERID_TYPE = 6;

    /**
     * The instance of the VOTERID type
     */
    public static final IdentityConstant VOTERID = new IdentityConstant(VOTERID_TYPE, "VOTERID");

    /**
     * The DRIVINGLICENSE type
     */
    public static final int DRIVINGLICENSE_TYPE = 7;

    /**
     * The instance of the DRIVINGLICENSE type
     */
    public static final IdentityConstant DRIVINGLICENSE = new IdentityConstant(DRIVINGLICENSE_TYPE, "DRIVINGLICENSE");

    /**
     * The SHGACC type
     */
    public static final int SHGACC_TYPE = 8;

    /**
     * The instance of the SHGACC type
     */
    public static final IdentityConstant SHGACC = new IdentityConstant(SHGACC_TYPE, "SHGACC");

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

    private IdentityConstant(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.IdentityConstant(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * IdentityConstant
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
     * Returns the type of this IdentityConstant
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
        members.put("PAN", PAN);
        members.put("BANK", BANK);
        members.put("AADHAAR", AADHAAR);
        members.put("ACCOUNT", ACCOUNT);
        members.put("GSTIN", GSTIN);
        members.put("PASSPORT", PASSPORT);
        members.put("VOTERID", VOTERID);
        members.put("DRIVINGLICENSE", DRIVINGLICENSE);
        members.put("SHGACC", SHGACC);
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
     * Returns the String representation of this IdentityConstant
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
     * Returns a new IdentityConstant based on the given String
     * value.
     * 
     * @param string
     * @return IdentityConstant
     */
    public static com.gov.nha.bis.upi.ack.types.IdentityConstant valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid IdentityConstant";
            throw new IllegalArgumentException(err);
        }
        return (IdentityConstant) obj;
    } //-- com.gov.nha.bis.upi.ack.types.IdentityConstant valueOf(java.lang.String) 

}
