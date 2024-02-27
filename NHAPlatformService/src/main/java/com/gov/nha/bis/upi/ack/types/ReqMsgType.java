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
 * Class ReqMsgType.
 * 
 * @version $Revision$ $Date$
 */
public class ReqMsgType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The MOBILE type
     */
    public static final int MOBILE_TYPE = 0;

    /**
     * The instance of the MOBILE type
     */
    public static final ReqMsgType MOBILE = new ReqMsgType(MOBILE_TYPE, "MOBILE");

    /**
     * The AADHAAR type
     */
    public static final int AADHAAR_TYPE = 1;

    /**
     * The instance of the AADHAAR type
     */
    public static final ReqMsgType AADHAAR = new ReqMsgType(AADHAAR_TYPE, "AADHAAR");

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

    private ReqMsgType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.ReqMsgType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ReqMsgType
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
     * Returns the type of this ReqMsgType
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
        members.put("MOBILE", MOBILE);
        members.put("AADHAAR", AADHAAR);
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
     * Returns the String representation of this ReqMsgType
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
     * Returns a new ReqMsgType based on the given String value.
     * 
     * @param string
     * @return ReqMsgType
     */
    public static com.gov.nha.bis.upi.ack.types.ReqMsgType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ReqMsgType";
            throw new IllegalArgumentException(err);
        }
        return (ReqMsgType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.ReqMsgType valueOf(java.lang.String) 

}
