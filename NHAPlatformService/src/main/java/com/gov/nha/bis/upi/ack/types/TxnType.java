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
 * Class TxnType.
 * 
 * @version $Revision$ $Date$
 */
public class TxnType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The CWD type
     */
    public static final int CWD_TYPE = 0;

    /**
     * The instance of the CWD type
     */
    public static final TxnType CWD = new TxnType(CWD_TYPE, "CWD");

    /**
     * The CD type
     */
    public static final int CD_TYPE = 1;

    /**
     * The instance of the CD type
     */
    public static final TxnType CD = new TxnType(CD_TYPE, "CD");

    /**
     * The RTGS type
     */
    public static final int RTGS_TYPE = 2;

    /**
     * The instance of the RTGS type
     */
    public static final TxnType RTGS = new TxnType(RTGS_TYPE, "RTGS");

    /**
     * The NEFT type
     */
    public static final int NEFT_TYPE = 3;

    /**
     * The instance of the NEFT type
     */
    public static final TxnType NEFT = new TxnType(NEFT_TYPE, "NEFT");

    /**
     * The UPI type
     */
    public static final int UPI_TYPE = 4;

    /**
     * The instance of the UPI type
     */
    public static final TxnType UPI = new TxnType(UPI_TYPE, "UPI");

    /**
     * The IMPS type
     */
    public static final int IMPS_TYPE = 5;

    /**
     * The instance of the IMPS type
     */
    public static final TxnType IMPS = new TxnType(IMPS_TYPE, "IMPS");

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

    private TxnType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.TxnType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of TxnType
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
     * Returns the type of this TxnType
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
        members.put("CWD", CWD);
        members.put("CD", CD);
        members.put("RTGS", RTGS);
        members.put("NEFT", NEFT);
        members.put("UPI", UPI);
        members.put("IMPS", IMPS);
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
     * Returns the String representation of this TxnType
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
     * Returns a new TxnType based on the given String value.
     * 
     * @param string
     * @return TxnType
     */
    public static com.gov.nha.bis.upi.ack.types.TxnType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TxnType";
            throw new IllegalArgumentException(err);
        }
        return (TxnType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.TxnType valueOf(java.lang.String) 

}
