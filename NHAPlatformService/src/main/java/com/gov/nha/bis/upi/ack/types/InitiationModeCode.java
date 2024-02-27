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
 * Class InitiationModeCode.
 * 
 * @version $Revision$ $Date$
 */
public class InitiationModeCode implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The 01 type
     */
    public static final int VALUE_1_TYPE = 0;

    /**
     * The instance of the 01 type
     */
    public static final InitiationModeCode VALUE_1 = new InitiationModeCode(VALUE_1_TYPE, "01");

    /**
     * The 02 type
     */
    public static final int VALUE_2_TYPE = 1;

    /**
     * The instance of the 02 type
     */
    public static final InitiationModeCode VALUE_2 = new InitiationModeCode(VALUE_2_TYPE, "02");

    /**
     * The 03 type
     */
    public static final int VALUE_3_TYPE = 2;

    /**
     * The instance of the 03 type
     */
    public static final InitiationModeCode VALUE_3 = new InitiationModeCode(VALUE_3_TYPE, "03");

    /**
     * The 04 type
     */
    public static final int VALUE_4_TYPE = 3;

    /**
     * The instance of the 04 type
     */
    public static final InitiationModeCode VALUE_4 = new InitiationModeCode(VALUE_4_TYPE, "04");

    /**
     * The 05 type
     */
    public static final int VALUE_5_TYPE = 4;

    /**
     * The instance of the 05 type
     */
    public static final InitiationModeCode VALUE_5 = new InitiationModeCode(VALUE_5_TYPE, "05");

    /**
     * The 06 type
     */
    public static final int VALUE_6_TYPE = 5;

    /**
     * The instance of the 06 type
     */
    public static final InitiationModeCode VALUE_6 = new InitiationModeCode(VALUE_6_TYPE, "06");

    /**
     * The 07 type
     */
    public static final int VALUE_7_TYPE = 6;

    /**
     * The instance of the 07 type
     */
    public static final InitiationModeCode VALUE_7 = new InitiationModeCode(VALUE_7_TYPE, "07");

    /**
     * The 08 type
     */
    public static final int VALUE_8_TYPE = 7;

    /**
     * The instance of the 08 type
     */
    public static final InitiationModeCode VALUE_8 = new InitiationModeCode(VALUE_8_TYPE, "08");

    /**
     * The 09 type
     */
    public static final int VALUE_9_TYPE = 8;

    /**
     * The instance of the 09 type
     */
    public static final InitiationModeCode VALUE_9 = new InitiationModeCode(VALUE_9_TYPE, "09");

    /**
     * The 10 type
     */
    public static final int VALUE_10_TYPE = 9;

    /**
     * The instance of the 10 type
     */
    public static final InitiationModeCode VALUE_10 = new InitiationModeCode(VALUE_10_TYPE, "10");

    /**
     * The 11 type
     */
    public static final int VALUE_11_TYPE = 10;

    /**
     * The instance of the 11 type
     */
    public static final InitiationModeCode VALUE_11 = new InitiationModeCode(VALUE_11_TYPE, "11");

    /**
     * The 12 type
     */
    public static final int VALUE_12_TYPE = 11;

    /**
     * The instance of the 12 type
     */
    public static final InitiationModeCode VALUE_12 = new InitiationModeCode(VALUE_12_TYPE, "12");

    /**
     * The 13 type
     */
    public static final int VALUE_13_TYPE = 12;

    /**
     * The instance of the 13 type
     */
    public static final InitiationModeCode VALUE_13 = new InitiationModeCode(VALUE_13_TYPE, "13");

    /**
     * The 14 type
     */
    public static final int VALUE_14_TYPE = 13;

    /**
     * The instance of the 14 type
     */
    public static final InitiationModeCode VALUE_14 = new InitiationModeCode(VALUE_14_TYPE, "14");

    /**
     * The 15 type
     */
    public static final int VALUE_15_TYPE = 14;

    /**
     * The instance of the 15 type
     */
    public static final InitiationModeCode VALUE_15 = new InitiationModeCode(VALUE_15_TYPE, "15");

    /**
     * The 18 type
     */
    public static final int VALUE_18_TYPE = 15;

    /**
     * The instance of the 18 type
     */
    public static final InitiationModeCode VALUE_18 = new InitiationModeCode(VALUE_18_TYPE, "18");

    /**
     * The 00 type
     */
    public static final int VALUE_0_TYPE = 16;

    /**
     * The instance of the 00 type
     */
    public static final InitiationModeCode VALUE_0 = new InitiationModeCode(VALUE_0_TYPE, "00");

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

    private InitiationModeCode(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.InitiationModeCode(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * InitiationModeCode
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
     * Returns the type of this InitiationModeCode
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
        members.put("01", VALUE_1);
        members.put("02", VALUE_2);
        members.put("03", VALUE_3);
        members.put("04", VALUE_4);
        members.put("05", VALUE_5);
        members.put("06", VALUE_6);
        members.put("07", VALUE_7);
        members.put("08", VALUE_8);
        members.put("09", VALUE_9);
        members.put("10", VALUE_10);
        members.put("11", VALUE_11);
        members.put("12", VALUE_12);
        members.put("13", VALUE_13);
        members.put("14", VALUE_14);
        members.put("15", VALUE_15);
        members.put("18", VALUE_18);
        members.put("00", VALUE_0);
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
     * Returns the String representation of this InitiationModeCode
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
     * Returns a new InitiationModeCode based on the given String
     * value.
     * 
     * @param string
     * @return InitiationModeCode
     */
    public static com.gov.nha.bis.upi.ack.types.InitiationModeCode valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid InitiationModeCode";
            throw new IllegalArgumentException(err);
        }
        return (InitiationModeCode) obj;
    } //-- com.gov.nha.bis.upi.ack.types.InitiationModeCode valueOf(java.lang.String) 

}
