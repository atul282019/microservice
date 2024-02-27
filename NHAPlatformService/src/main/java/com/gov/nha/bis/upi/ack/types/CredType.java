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
 * Class CredType.
 * 
 * @version $Revision$ $Date$
 */
public class CredType implements java.io.Serializable {


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
    public static final CredType AADHAAR = new CredType(AADHAAR_TYPE, "AADHAAR");

    /**
     * The OTP type
     */
    public static final int OTP_TYPE = 1;

    /**
     * The instance of the OTP type
     */
    public static final CredType OTP = new CredType(OTP_TYPE, "OTP");

    /**
     * The PIN type
     */
    public static final int PIN_TYPE = 2;

    /**
     * The instance of the PIN type
     */
    public static final CredType PIN = new CredType(PIN_TYPE, "PIN");

    /**
     * The CARD type
     */
    public static final int CARD_TYPE = 3;

    /**
     * The instance of the CARD type
     */
    public static final CredType CARD = new CredType(CARD_TYPE, "CARD");

    /**
     * The PreApproved type
     */
    public static final int PREAPPROVED_TYPE = 4;

    /**
     * The instance of the PreApproved type
     */
    public static final CredType PREAPPROVED = new CredType(PREAPPROVED_TYPE, "PreApproved");

    /**
     * The PREAUTH type
     */
    public static final int PREAUTH_TYPE = 5;

    /**
     * The instance of the PREAUTH type
     */
    public static final CredType PREAUTH = new CredType(PREAUTH_TYPE, "PREAUTH");

    /**
     * The Challenge type
     */
    public static final int CHALLENGE_TYPE = 6;

    /**
     * The instance of the Challenge type
     */
    public static final CredType CHALLENGE = new CredType(CHALLENGE_TYPE, "Challenge");

    /**
     * The UPI-Mandate type
     */
    public static final int UPI_MANDATE_TYPE = 7;

    /**
     * The instance of the UPI-Mandate type
     */
    public static final CredType UPI_MANDATE = new CredType(UPI_MANDATE_TYPE, "UPI-Mandate");

    /**
     * The PostCredit type
     */
    public static final int POSTCREDIT_TYPE = 8;

    /**
     * The instance of the PostCredit type
     */
    public static final CredType POSTCREDIT = new CredType(POSTCREDIT_TYPE, "PostCredit");

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

    private CredType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.CredType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of CredType
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
     * Returns the type of this CredType
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
        members.put("OTP", OTP);
        members.put("PIN", PIN);
        members.put("CARD", CARD);
        members.put("PreApproved", PREAPPROVED);
        members.put("PREAUTH", PREAUTH);
        members.put("Challenge", CHALLENGE);
        members.put("UPI-Mandate", UPI_MANDATE);
        members.put("PostCredit", POSTCREDIT);
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
     * Returns the String representation of this CredType
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
     * Returns a new CredType based on the given String value.
     * 
     * @param string
     * @return CredType
     */
    public static com.gov.nha.bis.upi.ack.types.CredType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid CredType";
            throw new IllegalArgumentException(err);
        }
        return (CredType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.CredType valueOf(java.lang.String) 

}
