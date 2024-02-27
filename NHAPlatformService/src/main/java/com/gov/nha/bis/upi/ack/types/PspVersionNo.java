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
 * Class PspVersionNo.
 * 
 * @version $Revision$ $Date$
 */
public class PspVersionNo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The 1.0 type
     */
    public static final int VALUE_0_TYPE = 0;

    /**
     * The instance of the 1.0 type
     */
    public static final PspVersionNo VALUE_0 = new PspVersionNo(VALUE_0_TYPE, "1.0");

    /**
     * The 2.0 type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the 2.0 type
     */
    public static final PspVersionNo VALUE_1 = new PspVersionNo(VALUE_1_TYPE, "2.0");

    /**
     * The 2.1 type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the 2.1 type
     */
    public static final PspVersionNo VALUE_2 = new PspVersionNo(VALUE_2_TYPE, "2.1");

    /**
     * The 2.2 type
     */
    public static final int VALUE_3_TYPE = 3;

    /**
     * The instance of the 2.2 type
     */
    public static final PspVersionNo VALUE_3 = new PspVersionNo(VALUE_3_TYPE, "2.2");

    /**
     * The 2.3 type
     */
    public static final int VALUE_4_TYPE = 4;

    /**
     * The instance of the 2.3 type
     */
    public static final PspVersionNo VALUE_4 = new PspVersionNo(VALUE_4_TYPE, "2.3");

    /**
     * The 2.4 type
     */
    public static final int VALUE_5_TYPE = 5;

    /**
     * The instance of the 2.4 type
     */
    public static final PspVersionNo VALUE_5 = new PspVersionNo(VALUE_5_TYPE, "2.4");

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

    private PspVersionNo(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.PspVersionNo(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * PspVersionNo
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
     * Returns the type of this PspVersionNo
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
        members.put("1.0", VALUE_0);
        members.put("2.0", VALUE_1);
        members.put("2.1", VALUE_2);
        members.put("2.2", VALUE_3);
        members.put("2.3", VALUE_4);
        members.put("2.4", VALUE_5);
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
     * Returns the String representation of this PspVersionNo
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
     * Returns a new PspVersionNo based on the given String value.
     * 
     * @param string
     * @return PspVersionNo
     */
    public static com.gov.nha.bis.upi.ack.types.PspVersionNo valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PspVersionNo";
            throw new IllegalArgumentException(err);
        }
        return (PspVersionNo) obj;
    } //-- com.gov.nha.bis.upi.ack.types.PspVersionNo valueOf(java.lang.String) 

}
