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
 * Class TenorConstants.
 * 
 * @version $Revision$ $Date$
 */
public class TenorConstants implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The TODAY type
     */
    public static final int TODAY_TYPE = 0;

    /**
     * The instance of the TODAY type
     */
    public static final TenorConstants TODAY = new TenorConstants(TODAY_TYPE, "TODAY");

    /**
     * The TOM type
     */
    public static final int TOM_TYPE = 1;

    /**
     * The instance of the TOM type
     */
    public static final TenorConstants TOM = new TenorConstants(TOM_TYPE, "TOM");

    /**
     * The SPOT type
     */
    public static final int SPOT_TYPE = 2;

    /**
     * The instance of the SPOT type
     */
    public static final TenorConstants SPOT = new TenorConstants(SPOT_TYPE, "SPOT");

    /**
     * The D1 type
     */
    public static final int D1_TYPE = 3;

    /**
     * The instance of the D1 type
     */
    public static final TenorConstants D1 = new TenorConstants(D1_TYPE, "D1");

    /**
     * The W1 type
     */
    public static final int W1_TYPE = 4;

    /**
     * The instance of the W1 type
     */
    public static final TenorConstants W1 = new TenorConstants(W1_TYPE, "W1");

    /**
     * The M1 type
     */
    public static final int M1_TYPE = 5;

    /**
     * The instance of the M1 type
     */
    public static final TenorConstants M1 = new TenorConstants(M1_TYPE, "M1");

    /**
     * The M2 type
     */
    public static final int M2_TYPE = 6;

    /**
     * The instance of the M2 type
     */
    public static final TenorConstants M2 = new TenorConstants(M2_TYPE, "M2");

    /**
     * The M3 type
     */
    public static final int M3_TYPE = 7;

    /**
     * The instance of the M3 type
     */
    public static final TenorConstants M3 = new TenorConstants(M3_TYPE, "M3");

    /**
     * The M4 type
     */
    public static final int M4_TYPE = 8;

    /**
     * The instance of the M4 type
     */
    public static final TenorConstants M4 = new TenorConstants(M4_TYPE, "M4");

    /**
     * The M5 type
     */
    public static final int M5_TYPE = 9;

    /**
     * The instance of the M5 type
     */
    public static final TenorConstants M5 = new TenorConstants(M5_TYPE, "M5");

    /**
     * The M6 type
     */
    public static final int M6_TYPE = 10;

    /**
     * The instance of the M6 type
     */
    public static final TenorConstants M6 = new TenorConstants(M6_TYPE, "M6");

    /**
     * The M9 type
     */
    public static final int M9_TYPE = 11;

    /**
     * The instance of the M9 type
     */
    public static final TenorConstants M9 = new TenorConstants(M9_TYPE, "M9");

    /**
     * The Y1 type
     */
    public static final int Y1_TYPE = 12;

    /**
     * The instance of the Y1 type
     */
    public static final TenorConstants Y1 = new TenorConstants(Y1_TYPE, "Y1");

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

    private TenorConstants(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.TenorConstants(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * TenorConstants
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
     * Returns the type of this TenorConstants
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
        members.put("TODAY", TODAY);
        members.put("TOM", TOM);
        members.put("SPOT", SPOT);
        members.put("D1", D1);
        members.put("W1", W1);
        members.put("M1", M1);
        members.put("M2", M2);
        members.put("M3", M3);
        members.put("M4", M4);
        members.put("M5", M5);
        members.put("M6", M6);
        members.put("M9", M9);
        members.put("Y1", Y1);
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
     * Returns the String representation of this TenorConstants
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
     * Returns a new TenorConstants based on the given String
     * value.
     * 
     * @param string
     * @return TenorConstants
     */
    public static com.gov.nha.bis.upi.ack.types.TenorConstants valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TenorConstants";
            throw new IllegalArgumentException(err);
        }
        return (TenorConstants) obj;
    } //-- com.gov.nha.bis.upi.ack.types.TenorConstants valueOf(java.lang.String) 

}
