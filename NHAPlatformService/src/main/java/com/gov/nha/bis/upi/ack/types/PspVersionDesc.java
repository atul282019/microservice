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
 * Class PspVersionDesc.
 * 
 * @version $Revision$ $Date$
 */
public class PspVersionDesc implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Basic UPI 1.0 version type
     */
    public static final int BASIC_UPI_1_0_VERSION_TYPE = 0;

    /**
     * The instance of the Basic UPI 1.0 version type
     */
    public static final PspVersionDesc BASIC_UPI_1_0_VERSION = new PspVersionDesc(BASIC_UPI_1_0_VERSION_TYPE, "Basic UPI 1.0 version");

    /**
     * The UPI 2.0 version: All tag level changes type
     */
    public static final int UPI_2_0_VERSION__ALL_TAG_LEVEL_CHANGES_TYPE = 1;

    /**
     * The instance of the UPI 2.0 version: All tag level changes
     * type
     */
    public static final PspVersionDesc UPI_2_0_VERSION__ALL_TAG_LEVEL_CHANGES = new PspVersionDesc(UPI_2_0_VERSION__ALL_TAG_LEVEL_CHANGES_TYPE, "UPI 2.0 version: All tag level changes");

    /**
     * The UPI 2.0 Mandate type
     */
    public static final int UPI_2_0_MANDATE_TYPE = 2;

    /**
     * The instance of the UPI 2.0 Mandate type
     */
    public static final PspVersionDesc UPI_2_0_MANDATE = new PspVersionDesc(UPI_2_0_MANDATE_TYPE, "UPI 2.0 Mandate");

    /**
     * The REFUND type
     */
    public static final int REFUND_TYPE = 3;

    /**
     * The instance of the REFUND type
     */
    public static final PspVersionDesc REFUND = new PspVersionDesc(REFUND_TYPE, "REFUND");

    /**
     * The AADHAAR type
     */
    public static final int AADHAAR_TYPE = 4;

    /**
     * The instance of the AADHAAR type
     */
    public static final PspVersionDesc AADHAAR = new PspVersionDesc(AADHAAR_TYPE, "AADHAAR");

    /**
     * The VALCUST type
     */
    public static final int VALCUST_TYPE = 5;

    /**
     * The instance of the VALCUST type
     */
    public static final PspVersionDesc VALCUST = new PspVersionDesc(VALCUST_TYPE, "VALCUST");

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

    private PspVersionDesc(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.PspVersionDesc(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * PspVersionDesc
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
     * Returns the type of this PspVersionDesc
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
        members.put("Basic UPI 1.0 version", BASIC_UPI_1_0_VERSION);
        members.put("UPI 2.0 version: All tag level changes", UPI_2_0_VERSION__ALL_TAG_LEVEL_CHANGES);
        members.put("UPI 2.0 Mandate", UPI_2_0_MANDATE);
        members.put("REFUND", REFUND);
        members.put("AADHAAR", AADHAAR);
        members.put("VALCUST", VALCUST);
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
     * Returns the String representation of this PspVersionDesc
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
     * Returns a new PspVersionDesc based on the given String
     * value.
     * 
     * @param string
     * @return PspVersionDesc
     */
    public static com.gov.nha.bis.upi.ack.types.PspVersionDesc valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PspVersionDesc";
            throw new IllegalArgumentException(err);
        }
        return (PspVersionDesc) obj;
    } //-- com.gov.nha.bis.upi.ack.types.PspVersionDesc valueOf(java.lang.String) 

}
