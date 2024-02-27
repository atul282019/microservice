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
 * Class TxnRefCategory.
 * 
 * @version $Revision$ $Date$
 */
public class TxnRefCategory implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The 00 type
     */
    public static final int VALUE_0_TYPE = 0;

    /**
     * The instance of the 00 type
     */
    public static final TxnRefCategory VALUE_0 = new TxnRefCategory(VALUE_0_TYPE, "00");

    /**
     * The 01 type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the 01 type
     */
    public static final TxnRefCategory VALUE_1 = new TxnRefCategory(VALUE_1_TYPE, "01");

    /**
     * The 02 type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the 02 type
     */
    public static final TxnRefCategory VALUE_2 = new TxnRefCategory(VALUE_2_TYPE, "02");

    /**
     * The 03 type
     */
    public static final int VALUE_3_TYPE = 3;

    /**
     * The instance of the 03 type
     */
    public static final TxnRefCategory VALUE_3 = new TxnRefCategory(VALUE_3_TYPE, "03");

    /**
     * The 04 type
     */
    public static final int VALUE_4_TYPE = 4;

    /**
     * The instance of the 04 type
     */
    public static final TxnRefCategory VALUE_4 = new TxnRefCategory(VALUE_4_TYPE, "04");

    /**
     * The 05 type
     */
    public static final int VALUE_5_TYPE = 5;

    /**
     * The instance of the 05 type
     */
    public static final TxnRefCategory VALUE_5 = new TxnRefCategory(VALUE_5_TYPE, "05");

    /**
     * The 06 type
     */
    public static final int VALUE_6_TYPE = 6;

    /**
     * The instance of the 06 type
     */
    public static final TxnRefCategory VALUE_6 = new TxnRefCategory(VALUE_6_TYPE, "06");

    /**
     * The 07 type
     */
    public static final int VALUE_7_TYPE = 7;

    /**
     * The instance of the 07 type
     */
    public static final TxnRefCategory VALUE_7 = new TxnRefCategory(VALUE_7_TYPE, "07");

    /**
     * The 08 type
     */
    public static final int VALUE_8_TYPE = 8;

    /**
     * The instance of the 08 type
     */
    public static final TxnRefCategory VALUE_8 = new TxnRefCategory(VALUE_8_TYPE, "08");

    /**
     * The 09 type
     */
    public static final int VALUE_9_TYPE = 9;

    /**
     * The instance of the 09 type
     */
    public static final TxnRefCategory VALUE_9 = new TxnRefCategory(VALUE_9_TYPE, "09");

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

    private TxnRefCategory(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.TxnRefCategory(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * TxnRefCategory
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
     * Returns the type of this TxnRefCategory
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
        members.put("00", VALUE_0);
        members.put("01", VALUE_1);
        members.put("02", VALUE_2);
        members.put("03", VALUE_3);
        members.put("04", VALUE_4);
        members.put("05", VALUE_5);
        members.put("06", VALUE_6);
        members.put("07", VALUE_7);
        members.put("08", VALUE_8);
        members.put("09", VALUE_9);
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
     * Returns the String representation of this TxnRefCategory
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
     * Returns a new TxnRefCategory based on the given String
     * value.
     * 
     * @param string
     * @return TxnRefCategory
     */
    public static com.gov.nha.bis.upi.ack.types.TxnRefCategory valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TxnRefCategory";
            throw new IllegalArgumentException(err);
        }
        return (TxnRefCategory) obj;
    } //-- com.gov.nha.bis.upi.ack.types.TxnRefCategory valueOf(java.lang.String) 

}
