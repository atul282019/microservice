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
 * Class AccountHolderType.
 * 
 * @version $Revision$ $Date$
 */
public class AccountHolderType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The PRIMARY type
     */
    public static final int PRIMARY_TYPE = 0;

    /**
     * The instance of the PRIMARY type
     */
    public static final AccountHolderType PRIMARY = new AccountHolderType(PRIMARY_TYPE, "PRIMARY");

    /**
     * The SECONDARY type
     */
    public static final int SECONDARY_TYPE = 1;

    /**
     * The instance of the SECONDARY type
     */
    public static final AccountHolderType SECONDARY = new AccountHolderType(SECONDARY_TYPE, "SECONDARY");

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

    private AccountHolderType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.AccountHolderType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * AccountHolderType
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
     * Returns the type of this AccountHolderType
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
        members.put("PRIMARY", PRIMARY);
        members.put("SECONDARY", SECONDARY);
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
     * Returns the String representation of this AccountHolderType
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
     * Returns a new AccountHolderType based on the given String
     * value.
     * 
     * @param string
     * @return AccountHolderType
     */
    public static com.gov.nha.bis.upi.ack.types.AccountHolderType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AccountHolderType";
            throw new IllegalArgumentException(err);
        }
        return (AccountHolderType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.AccountHolderType valueOf(java.lang.String) 

}
