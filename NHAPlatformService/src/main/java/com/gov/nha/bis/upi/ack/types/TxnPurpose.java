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
 * Class TxnPurpose.
 * 
 * @version $Revision$ $Date$
 */
public class TxnPurpose implements java.io.Serializable {


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
    public static final TxnPurpose VALUE_0 = new TxnPurpose(VALUE_0_TYPE, "00");

    /**
     * The 01 type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the 01 type
     */
    public static final TxnPurpose VALUE_1 = new TxnPurpose(VALUE_1_TYPE, "01");

    /**
     * The 02 type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the 02 type
     */
    public static final TxnPurpose VALUE_2 = new TxnPurpose(VALUE_2_TYPE, "02");

    /**
     * The 03 type
     */
    public static final int VALUE_3_TYPE = 3;

    /**
     * The instance of the 03 type
     */
    public static final TxnPurpose VALUE_3 = new TxnPurpose(VALUE_3_TYPE, "03");

    /**
     * The 11 type
     */
    public static final int VALUE_11_TYPE = 4;

    /**
     * The instance of the 11 type
     */
    public static final TxnPurpose VALUE_11 = new TxnPurpose(VALUE_11_TYPE, "11");

    /**
     * The 12 type
     */
    public static final int VALUE_12_TYPE = 5;

    /**
     * The instance of the 12 type
     */
    public static final TxnPurpose VALUE_12 = new TxnPurpose(VALUE_12_TYPE, "12");

    /**
     * The 13 type
     */
    public static final int VALUE_13_TYPE = 6;

    /**
     * The instance of the 13 type
     */
    public static final TxnPurpose VALUE_13 = new TxnPurpose(VALUE_13_TYPE, "13");

    /**
     * The 19 type
     */
    public static final int VALUE_19_TYPE = 7;

    /**
     * The instance of the 19 type
     */
    public static final TxnPurpose VALUE_19 = new TxnPurpose(VALUE_19_TYPE, "19");

    /**
     * The A1 type
     */
    public static final int A1_TYPE = 8;

    /**
     * The instance of the A1 type
     */
    public static final TxnPurpose A1 = new TxnPurpose(A1_TYPE, "A1");

    /**
     * The A2 type
     */
    public static final int A2_TYPE = 9;

    /**
     * The instance of the A2 type
     */
    public static final TxnPurpose A2 = new TxnPurpose(A2_TYPE, "A2");

    /**
     * The A3 type
     */
    public static final int A3_TYPE = 10;

    /**
     * The instance of the A3 type
     */
    public static final TxnPurpose A3 = new TxnPurpose(A3_TYPE, "A3");

    /**
     * The A4 type
     */
    public static final int A4_TYPE = 11;

    /**
     * The instance of the A4 type
     */
    public static final TxnPurpose A4 = new TxnPurpose(A4_TYPE, "A4");

    /**
     * The A5 type
     */
    public static final int A5_TYPE = 12;

    /**
     * The instance of the A5 type
     */
    public static final TxnPurpose A5 = new TxnPurpose(A5_TYPE, "A5");

    /**
     * The A6 type
     */
    public static final int A6_TYPE = 13;

    /**
     * The instance of the A6 type
     */
    public static final TxnPurpose A6 = new TxnPurpose(A6_TYPE, "A6");

    /**
     * The A7 type
     */
    public static final int A7_TYPE = 14;

    /**
     * The instance of the A7 type
     */
    public static final TxnPurpose A7 = new TxnPurpose(A7_TYPE, "A7");

    /**
     * The A8 type
     */
    public static final int A8_TYPE = 15;

    /**
     * The instance of the A8 type
     */
    public static final TxnPurpose A8 = new TxnPurpose(A8_TYPE, "A8");

    /**
     * The A9 type
     */
    public static final int A9_TYPE = 16;

    /**
     * The instance of the A9 type
     */
    public static final TxnPurpose A9 = new TxnPurpose(A9_TYPE, "A9");

    /**
     * The A0 type
     */
    public static final int A0_TYPE = 17;

    /**
     * The instance of the A0 type
     */
    public static final TxnPurpose A0 = new TxnPurpose(A0_TYPE, "A0");

    /**
     * The B0 type
     */
    public static final int B0_TYPE = 18;

    /**
     * The instance of the B0 type
     */
    public static final TxnPurpose B0 = new TxnPurpose(B0_TYPE, "B0");

    /**
     * The B1 type
     */
    public static final int B1_TYPE = 19;

    /**
     * The instance of the B1 type
     */
    public static final TxnPurpose B1 = new TxnPurpose(B1_TYPE, "B1");

    /**
     * The B2 type
     */
    public static final int B2_TYPE = 20;

    /**
     * The instance of the B2 type
     */
    public static final TxnPurpose B2 = new TxnPurpose(B2_TYPE, "B2");

    /**
     * The B3 type
     */
    public static final int B3_TYPE = 21;

    /**
     * The instance of the B3 type
     */
    public static final TxnPurpose B3 = new TxnPurpose(B3_TYPE, "B3");

    /**
     * The B4 type
     */
    public static final int B4_TYPE = 22;

    /**
     * The instance of the B4 type
     */
    public static final TxnPurpose B4 = new TxnPurpose(B4_TYPE, "B4");

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

    private TxnPurpose(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.TxnPurpose(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * TxnPurpose
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
     * Returns the type of this TxnPurpose
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
        members.put("11", VALUE_11);
        members.put("12", VALUE_12);
        members.put("13", VALUE_13);
        members.put("19", VALUE_19);
        members.put("A1", A1);
        members.put("A2", A2);
        members.put("A3", A3);
        members.put("A4", A4);
        members.put("A5", A5);
        members.put("A6", A6);
        members.put("A7", A7);
        members.put("A8", A8);
        members.put("A9", A9);
        members.put("A0", A0);
        members.put("B0", B0);
        members.put("B1", B1);
        members.put("B2", B2);
        members.put("B3", B3);
        members.put("B4", B4);
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
     * Returns the String representation of this TxnPurpose
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
     * Returns a new TxnPurpose based on the given String value.
     * 
     * @param string
     * @return TxnPurpose
     */
    public static com.gov.nha.bis.upi.ack.types.TxnPurpose valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TxnPurpose";
            throw new IllegalArgumentException(err);
        }
        return (TxnPurpose) obj;
    } //-- com.gov.nha.bis.upi.ack.types.TxnPurpose valueOf(java.lang.String) 

}
