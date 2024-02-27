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
 * Class ExpireRuleConstant.
 * 
 * @version $Revision$ $Date$
 */
public class ExpireRuleConstant implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The EXPIREAFTER type
     */
    public static final int EXPIREAFTER_TYPE = 0;

    /**
     * The instance of the EXPIREAFTER type
     */
    public static final ExpireRuleConstant EXPIREAFTER = new ExpireRuleConstant(EXPIREAFTER_TYPE, "EXPIREAFTER");

    /**
     * The MINAMOUNT type
     */
    public static final int MINAMOUNT_TYPE = 1;

    /**
     * The instance of the MINAMOUNT type
     */
    public static final ExpireRuleConstant MINAMOUNT = new ExpireRuleConstant(MINAMOUNT_TYPE, "MINAMOUNT");

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

    private ExpireRuleConstant(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.ExpireRuleConstant(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ExpireRuleConstant
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
     * Returns the type of this ExpireRuleConstant
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
        members.put("EXPIREAFTER", EXPIREAFTER);
        members.put("MINAMOUNT", MINAMOUNT);
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
     * Returns the String representation of this ExpireRuleConstant
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
     * Returns a new ExpireRuleConstant based on the given String
     * value.
     * 
     * @param string
     * @return ExpireRuleConstant
     */
    public static com.gov.nha.bis.upi.ack.types.ExpireRuleConstant valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ExpireRuleConstant";
            throw new IllegalArgumentException(err);
        }
        return (ExpireRuleConstant) obj;
    } //-- com.gov.nha.bis.upi.ack.types.ExpireRuleConstant valueOf(java.lang.String) 

}
