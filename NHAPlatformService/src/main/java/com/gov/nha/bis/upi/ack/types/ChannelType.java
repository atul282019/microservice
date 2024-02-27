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
 * Class ChannelType.
 * 
 * @version $Revision$ $Date$
 */
public class ChannelType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The BRANCH type
     */
    public static final int BRANCH_TYPE = 0;

    /**
     * The instance of the BRANCH type
     */
    public static final ChannelType BRANCH = new ChannelType(BRANCH_TYPE, "BRANCH");

    /**
     * The MOBILE type
     */
    public static final int MOBILE_TYPE = 1;

    /**
     * The instance of the MOBILE type
     */
    public static final ChannelType MOBILE = new ChannelType(MOBILE_TYPE, "MOBILE");

    /**
     * The INB type
     */
    public static final int INB_TYPE = 2;

    /**
     * The instance of the INB type
     */
    public static final ChannelType INB = new ChannelType(INB_TYPE, "INB");

    /**
     * The CHQ type
     */
    public static final int CHQ_TYPE = 3;

    /**
     * The instance of the CHQ type
     */
    public static final ChannelType CHQ = new ChannelType(CHQ_TYPE, "CHQ");

    /**
     * The ATM type
     */
    public static final int ATM_TYPE = 4;

    /**
     * The instance of the ATM type
     */
    public static final ChannelType ATM = new ChannelType(ATM_TYPE, "ATM");

    /**
     * The IVR type
     */
    public static final int IVR_TYPE = 5;

    /**
     * The instance of the IVR type
     */
    public static final ChannelType IVR = new ChannelType(IVR_TYPE, "IVR");

    /**
     * The MOB type
     */
    public static final int MOB_TYPE = 6;

    /**
     * The instance of the MOB type
     */
    public static final ChannelType MOB = new ChannelType(MOB_TYPE, "MOB");

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

    private ChannelType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.ChannelType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ChannelType
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
     * Returns the type of this ChannelType
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
        members.put("BRANCH", BRANCH);
        members.put("MOBILE", MOBILE);
        members.put("INB", INB);
        members.put("CHQ", CHQ);
        members.put("ATM", ATM);
        members.put("IVR", IVR);
        members.put("MOB", MOB);
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
     * Returns the String representation of this ChannelType
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
     * Returns a new ChannelType based on the given String value.
     * 
     * @param string
     * @return ChannelType
     */
    public static com.gov.nha.bis.upi.ack.types.ChannelType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ChannelType";
            throw new IllegalArgumentException(err);
        }
        return (ChannelType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.ChannelType valueOf(java.lang.String) 

}
