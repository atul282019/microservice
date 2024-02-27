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
 * Class CredSubType.
 * 
 * @version $Revision$ $Date$
 */
public class CredSubType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The IIR type
     */
    public static final int IIR_TYPE = 0;

    /**
     * The instance of the IIR type
     */
    public static final CredSubType IIR = new CredSubType(IIR_TYPE, "IIR");

    /**
     * The FMR type
     */
    public static final int FMR_TYPE = 1;

    /**
     * The instance of the FMR type
     */
    public static final CredSubType FMR = new CredSubType(FMR_TYPE, "FMR");

    /**
     * The FIR type
     */
    public static final int FIR_TYPE = 2;

    /**
     * The instance of the FIR type
     */
    public static final CredSubType FIR = new CredSubType(FIR_TYPE, "FIR");

    /**
     * The OTP type
     */
    public static final int OTP_TYPE = 3;

    /**
     * The instance of the OTP type
     */
    public static final CredSubType OTP = new CredSubType(OTP_TYPE, "OTP");

    /**
     * The SMS type
     */
    public static final int SMS_TYPE = 4;

    /**
     * The instance of the SMS type
     */
    public static final CredSubType SMS = new CredSubType(SMS_TYPE, "SMS");

    /**
     * The EMAIL type
     */
    public static final int EMAIL_TYPE = 5;

    /**
     * The instance of the EMAIL type
     */
    public static final CredSubType EMAIL = new CredSubType(EMAIL_TYPE, "EMAIL");

    /**
     * The HOTP type
     */
    public static final int HOTP_TYPE = 6;

    /**
     * The instance of the HOTP type
     */
    public static final CredSubType HOTP = new CredSubType(HOTP_TYPE, "HOTP");

    /**
     * The TOTP type
     */
    public static final int TOTP_TYPE = 7;

    /**
     * The instance of the TOTP type
     */
    public static final CredSubType TOTP = new CredSubType(TOTP_TYPE, "TOTP");

    /**
     * The MPIN type
     */
    public static final int MPIN_TYPE = 8;

    /**
     * The instance of the MPIN type
     */
    public static final CredSubType MPIN = new CredSubType(MPIN_TYPE, "MPIN");

    /**
     * The ATMPIN type
     */
    public static final int ATMPIN_TYPE = 9;

    /**
     * The instance of the ATMPIN type
     */
    public static final CredSubType ATMPIN = new CredSubType(ATMPIN_TYPE, "ATMPIN");

    /**
     * The CVV1 type
     */
    public static final int CVV1_TYPE = 10;

    /**
     * The instance of the CVV1 type
     */
    public static final CredSubType CVV1 = new CredSubType(CVV1_TYPE, "CVV1");

    /**
     * The CVV2 type
     */
    public static final int CVV2_TYPE = 11;

    /**
     * The instance of the CVV2 type
     */
    public static final CredSubType CVV2 = new CredSubType(CVV2_TYPE, "CVV2");

    /**
     * The EMV type
     */
    public static final int EMV_TYPE = 12;

    /**
     * The instance of the EMV type
     */
    public static final CredSubType EMV = new CredSubType(EMV_TYPE, "EMV");

    /**
     * The initial type
     */
    public static final int INITIAL_TYPE = 13;

    /**
     * The instance of the initial type
     */
    public static final CredSubType INITIAL = new CredSubType(INITIAL_TYPE, "initial");

    /**
     * The reset type
     */
    public static final int RESET_TYPE = 14;

    /**
     * The instance of the reset type
     */
    public static final CredSubType RESET = new CredSubType(RESET_TYPE, "reset");

    /**
     * The rotate type
     */
    public static final int ROTATE_TYPE = 15;

    /**
     * The instance of the rotate type
     */
    public static final CredSubType ROTATE = new CredSubType(ROTATE_TYPE, "rotate");

    /**
     * The NA type
     */
    public static final int NA_TYPE = 16;

    /**
     * The instance of the NA type
     */
    public static final CredSubType NA = new CredSubType(NA_TYPE, "NA");

    /**
     * The AADHAAR-BIO-FP type
     */
    public static final int AADHAAR_BIO_FP_TYPE = 17;

    /**
     * The instance of the AADHAAR-BIO-FP type
     */
    public static final CredSubType AADHAAR_BIO_FP = new CredSubType(AADHAAR_BIO_FP_TYPE, "AADHAAR-BIO-FP");

    /**
     * The AADHAAR-BIO-IRIS type
     */
    public static final int AADHAAR_BIO_IRIS_TYPE = 18;

    /**
     * The instance of the AADHAAR-BIO-IRIS type
     */
    public static final CredSubType AADHAAR_BIO_IRIS = new CredSubType(AADHAAR_BIO_IRIS_TYPE, "AADHAAR-BIO-IRIS");

    /**
     * The AADHAAR-BIO-OTP type
     */
    public static final int AADHAAR_BIO_OTP_TYPE = 19;

    /**
     * The instance of the AADHAAR-BIO-OTP type
     */
    public static final CredSubType AADHAAR_BIO_OTP = new CredSubType(AADHAAR_BIO_OTP_TYPE, "AADHAAR-BIO-OTP");

    /**
     * The DS type
     */
    public static final int DS_TYPE = 20;

    /**
     * The instance of the DS type
     */
    public static final CredSubType DS = new CredSubType(DS_TYPE, "DS");

    /**
     * The CARDDETAILS type
     */
    public static final int CARDDETAILS_TYPE = 21;

    /**
     * The instance of the CARDDETAILS type
     */
    public static final CredSubType CARDDETAILS = new CredSubType(CARDDETAILS_TYPE, "CARDDETAILS");

    /**
     * The FACEAUTH type
     */
    public static final int FACEAUTH_TYPE = 22;

    /**
     * The instance of the FACEAUTH type
     */
    public static final CredSubType FACEAUTH = new CredSubType(FACEAUTH_TYPE, "FACEAUTH");

    /**
     * The UIDAI-AUTH-CODE type
     */
    public static final int UIDAI_AUTH_CODE_TYPE = 23;

    /**
     * The instance of the UIDAI-AUTH-CODE type
     */
    public static final CredSubType UIDAI_AUTH_CODE = new CredSubType(UIDAI_AUTH_CODE_TYPE, "UIDAI-AUTH-CODE");

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

    private CredSubType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.CredSubType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * CredSubType
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
     * Returns the type of this CredSubType
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
        members.put("IIR", IIR);
        members.put("FMR", FMR);
        members.put("FIR", FIR);
        members.put("OTP", OTP);
        members.put("SMS", SMS);
        members.put("EMAIL", EMAIL);
        members.put("HOTP", HOTP);
        members.put("TOTP", TOTP);
        members.put("MPIN", MPIN);
        members.put("ATMPIN", ATMPIN);
        members.put("CVV1", CVV1);
        members.put("CVV2", CVV2);
        members.put("EMV", EMV);
        members.put("initial", INITIAL);
        members.put("reset", RESET);
        members.put("rotate", ROTATE);
        members.put("NA", NA);
        members.put("AADHAAR-BIO-FP", AADHAAR_BIO_FP);
        members.put("AADHAAR-BIO-IRIS", AADHAAR_BIO_IRIS);
        members.put("AADHAAR-BIO-OTP", AADHAAR_BIO_OTP);
        members.put("DS", DS);
        members.put("CARDDETAILS", CARDDETAILS);
        members.put("FACEAUTH", FACEAUTH);
        members.put("UIDAI-AUTH-CODE", UIDAI_AUTH_CODE);
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
     * Returns the String representation of this CredSubType
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
     * Returns a new CredSubType based on the given String value.
     * 
     * @param string
     * @return CredSubType
     */
    public static com.gov.nha.bis.upi.ack.types.CredSubType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid CredSubType";
            throw new IllegalArgumentException(err);
        }
        return (CredSubType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.CredSubType valueOf(java.lang.String) 

}
