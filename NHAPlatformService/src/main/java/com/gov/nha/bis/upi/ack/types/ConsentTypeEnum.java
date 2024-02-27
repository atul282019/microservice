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
 * Class ConsentTypeEnum.
 * 
 * @version $Revision$ $Date$
 */
public class ConsentTypeEnum implements java.io.Serializable {


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
    public static final ConsentTypeEnum PAN = new ConsentTypeEnum(PAN_TYPE, "PAN");

    /**
     * The AADHAAR type
     */
    public static final int AADHAAR_TYPE = 1;

    /**
     * The instance of the AADHAAR type
     */
    public static final ConsentTypeEnum AADHAAR = new ConsentTypeEnum(AADHAAR_TYPE, "AADHAAR");

    /**
     * The AADHAARTOKEN  type
     */
    public static final int AADHAARTOKEN__TYPE = 2;

    /**
     * The instance of the AADHAARTOKEN  type
     */
    public static final ConsentTypeEnum AADHAARTOKEN_ = new ConsentTypeEnum(AADHAARTOKEN__TYPE, "AADHAARTOKEN ");

    /**
     * The PASSPORT type
     */
    public static final int PASSPORT_TYPE = 3;

    /**
     * The instance of the PASSPORT type
     */
    public static final ConsentTypeEnum PASSPORT = new ConsentTypeEnum(PASSPORT_TYPE, "PASSPORT");

    /**
     * The VOTERID type
     */
    public static final int VOTERID_TYPE = 4;

    /**
     * The instance of the VOTERID type
     */
    public static final ConsentTypeEnum VOTERID = new ConsentTypeEnum(VOTERID_TYPE, "VOTERID");

    /**
     * The DRIVINGLICENSE type
     */
    public static final int DRIVINGLICENSE_TYPE = 5;

    /**
     * The instance of the DRIVINGLICENSE type
     */
    public static final ConsentTypeEnum DRIVINGLICENSE = new ConsentTypeEnum(DRIVINGLICENSE_TYPE, "DRIVINGLICENSE");

    /**
     * The GSTIN type
     */
    public static final int GSTIN_TYPE = 6;

    /**
     * The instance of the GSTIN type
     */
    public static final ConsentTypeEnum GSTIN = new ConsentTypeEnum(GSTIN_TYPE, "GSTIN");

    /**
     * The NUMERICID type
     */
    public static final int NUMERICID_TYPE = 7;

    /**
     * The instance of the NUMERICID type
     */
    public static final ConsentTypeEnum NUMERICID = new ConsentTypeEnum(NUMERICID_TYPE, "NUMERICID");

    /**
     * The MOBILE type
     */
    public static final int MOBILE_TYPE = 8;

    /**
     * The instance of the MOBILE type
     */
    public static final ConsentTypeEnum MOBILE = new ConsentTypeEnum(MOBILE_TYPE, "MOBILE");

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

    private ConsentTypeEnum(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.ConsentTypeEnum(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ConsentTypeEnum
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
     * Returns the type of this ConsentTypeEnum
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
        members.put("AADHAAR", AADHAAR);
        members.put("AADHAARTOKEN ", AADHAARTOKEN_);
        members.put("PASSPORT", PASSPORT);
        members.put("VOTERID", VOTERID);
        members.put("DRIVINGLICENSE", DRIVINGLICENSE);
        members.put("GSTIN", GSTIN);
        members.put("NUMERICID", NUMERICID);
        members.put("MOBILE", MOBILE);
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
     * Returns the String representation of this ConsentTypeEnum
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
     * Returns a new ConsentTypeEnum based on the given String
     * value.
     * 
     * @param string
     * @return ConsentTypeEnum
     */
    public static com.gov.nha.bis.upi.ack.types.ConsentTypeEnum valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConsentTypeEnum";
            throw new IllegalArgumentException(err);
        }
        return (ConsentTypeEnum) obj;
    } //-- com.gov.nha.bis.upi.ack.types.ConsentTypeEnum valueOf(java.lang.String) 

}
