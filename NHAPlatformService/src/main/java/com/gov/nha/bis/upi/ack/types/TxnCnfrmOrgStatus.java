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
 * Class TxnCnfrmOrgStatus.
 * 
 * @version $Revision$ $Date$
 */
public class TxnCnfrmOrgStatus implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The SUCCESS type
     */
    public static final int SUCCESS_TYPE = 0;

    /**
     * The instance of the SUCCESS type
     */
    public static final TxnCnfrmOrgStatus SUCCESS = new TxnCnfrmOrgStatus(SUCCESS_TYPE, "SUCCESS");

    /**
     * The FAILURE type
     */
    public static final int FAILURE_TYPE = 1;

    /**
     * The instance of the FAILURE type
     */
    public static final TxnCnfrmOrgStatus FAILURE = new TxnCnfrmOrgStatus(FAILURE_TYPE, "FAILURE");

    /**
     * The PENDING type
     */
    public static final int PENDING_TYPE = 2;

    /**
     * The instance of the PENDING type
     */
    public static final TxnCnfrmOrgStatus PENDING = new TxnCnfrmOrgStatus(PENDING_TYPE, "PENDING");

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

    private TxnCnfrmOrgStatus(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.TxnCnfrmOrgStatus(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * TxnCnfrmOrgStatus
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
     * Returns the type of this TxnCnfrmOrgStatus
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
        members.put("SUCCESS", SUCCESS);
        members.put("FAILURE", FAILURE);
        members.put("PENDING", PENDING);
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
     * Returns the String representation of this TxnCnfrmOrgStatus
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
     * Returns a new TxnCnfrmOrgStatus based on the given String
     * value.
     * 
     * @param string
     * @return TxnCnfrmOrgStatus
     */
    public static com.gov.nha.bis.upi.ack.types.TxnCnfrmOrgStatus valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TxnCnfrmOrgStatus";
            throw new IllegalArgumentException(err);
        }
        return (TxnCnfrmOrgStatus) obj;
    } //-- com.gov.nha.bis.upi.ack.types.TxnCnfrmOrgStatus valueOf(java.lang.String) 

}
