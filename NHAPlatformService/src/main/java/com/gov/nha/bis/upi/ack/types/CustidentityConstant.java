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
 * Class CustidentityConstant.
 * 
 * @version $Revision$ $Date$
 */
public class CustidentityConstant implements java.io.Serializable {


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
    public static final CustidentityConstant PAN = new CustidentityConstant(PAN_TYPE, "PAN");

    /**
     * The VOTERID type
     */
    public static final int VOTERID_TYPE = 1;

    /**
     * The instance of the VOTERID type
     */
    public static final CustidentityConstant VOTERID = new CustidentityConstant(VOTERID_TYPE, "VOTERID");

    /**
     * The DRIVINGLICENSE type
     */
    public static final int DRIVINGLICENSE_TYPE = 2;

    /**
     * The instance of the DRIVINGLICENSE type
     */
    public static final CustidentityConstant DRIVINGLICENSE = new CustidentityConstant(DRIVINGLICENSE_TYPE, "DRIVINGLICENSE");

    /**
     * The AADHAAR type
     */
    public static final int AADHAAR_TYPE = 3;

    /**
     * The instance of the AADHAAR type
     */
    public static final CustidentityConstant AADHAAR = new CustidentityConstant(AADHAAR_TYPE, "AADHAAR");

    /**
     * The UMN type
     */
    public static final int UMN_TYPE = 4;

    /**
     * The instance of the UMN type
     */
    public static final CustidentityConstant UMN = new CustidentityConstant(UMN_TYPE, "UMN");

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

    private CustidentityConstant(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.CustidentityConstant(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * CustidentityConstant
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
     * Returns the type of this CustidentityConstant
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
        members.put("VOTERID", VOTERID);
        members.put("DRIVINGLICENSE", DRIVINGLICENSE);
        members.put("AADHAAR", AADHAAR);
        members.put("UMN", UMN);
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
     * CustidentityConstant
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
     * Returns a new CustidentityConstant based on the given String
     * value.
     * 
     * @param string
     * @return CustidentityConstant
     */
    public static com.gov.nha.bis.upi.ack.types.CustidentityConstant valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid CustidentityConstant";
            throw new IllegalArgumentException(err);
        }
        return (CustidentityConstant) obj;
    } //-- com.gov.nha.bis.upi.ack.types.CustidentityConstant valueOf(java.lang.String) 

}
