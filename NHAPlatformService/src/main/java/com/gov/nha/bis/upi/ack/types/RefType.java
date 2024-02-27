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
 * Class RefType.
 * 
 * @version $Revision$ $Date$
 */
public class RefType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The PAYER type
     */
    public static final int PAYER_TYPE = 0;

    /**
     * The instance of the PAYER type
     */
    public static final RefType PAYER = new RefType(PAYER_TYPE, "PAYER");

    /**
     * The PAYEE type
     */
    public static final int PAYEE_TYPE = 1;

    /**
     * The instance of the PAYEE type
     */
    public static final RefType PAYEE = new RefType(PAYEE_TYPE, "PAYEE");

    /**
     * The BENEFICIARY type
     */
    public static final int BENEFICIARY_TYPE = 2;

    /**
     * The instance of the BENEFICIARY type
     */
    public static final RefType BENEFICIARY = new RefType(BENEFICIARY_TYPE, "BENEFICIARY");

    /**
     * The REMITTER type
     */
    public static final int REMITTER_TYPE = 3;

    /**
     * The instance of the REMITTER type
     */
    public static final RefType REMITTER = new RefType(REMITTER_TYPE, "REMITTER");

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

    private RefType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.RefType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of RefType
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
     * Returns the type of this RefType
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
        members.put("PAYER", PAYER);
        members.put("PAYEE", PAYEE);
        members.put("BENEFICIARY", BENEFICIARY);
        members.put("REMITTER", REMITTER);
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
     * Returns the String representation of this RefType
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
     * Returns a new RefType based on the given String value.
     * 
     * @param string
     * @return RefType
     */
    public static com.gov.nha.bis.upi.ack.types.RefType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RefType";
            throw new IllegalArgumentException(err);
        }
        return (RefType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.RefType valueOf(java.lang.String) 

}
