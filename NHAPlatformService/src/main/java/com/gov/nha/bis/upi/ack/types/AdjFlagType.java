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
 * Class AdjFlagType.
 * 
 * @version $Revision$ $Date$
 */
public class AdjFlagType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The RRC type
     */
    public static final int RRC_TYPE = 0;

    /**
     * The instance of the RRC type
     */
    public static final AdjFlagType RRC = new AdjFlagType(RRC_TYPE, "RRC");

    /**
     * The RET type
     */
    public static final int RET_TYPE = 1;

    /**
     * The instance of the RET type
     */
    public static final AdjFlagType RET = new AdjFlagType(RET_TYPE, "RET");

    /**
     * The PBRB type
     */
    public static final int PBRB_TYPE = 2;

    /**
     * The instance of the PBRB type
     */
    public static final AdjFlagType PBRB = new AdjFlagType(PBRB_TYPE, "PBRB");

    /**
     * The TCC type
     */
    public static final int TCC_TYPE = 3;

    /**
     * The instance of the TCC type
     */
    public static final AdjFlagType TCC = new AdjFlagType(TCC_TYPE, "TCC");

    /**
     * The DRC type
     */
    public static final int DRC_TYPE = 4;

    /**
     * The instance of the DRC type
     */
    public static final AdjFlagType DRC = new AdjFlagType(DRC_TYPE, "DRC");

    /**
     * The NAC type
     */
    public static final int NAC_TYPE = 5;

    /**
     * The instance of the NAC type
     */
    public static final AdjFlagType NAC = new AdjFlagType(NAC_TYPE, "NAC");

    /**
     * The REF type
     */
    public static final int REF_TYPE = 6;

    /**
     * The instance of the REF type
     */
    public static final AdjFlagType REF = new AdjFlagType(REF_TYPE, "REF");

    /**
     * The BTO type
     */
    public static final int BTO_TYPE = 7;

    /**
     * The instance of the BTO type
     */
    public static final AdjFlagType BTO = new AdjFlagType(BTO_TYPE, "BTO");

    /**
     * The PTO type
     */
    public static final int PTO_TYPE = 8;

    /**
     * The instance of the PTO type
     */
    public static final AdjFlagType PTO = new AdjFlagType(PTO_TYPE, "PTO");

    /**
     * The BUU type
     */
    public static final int BUU_TYPE = 9;

    /**
     * The instance of the BUU type
     */
    public static final AdjFlagType BUU = new AdjFlagType(BUU_TYPE, "BUU");

    /**
     * The PUU type
     */
    public static final int PUU_TYPE = 10;

    /**
     * The instance of the PUU type
     */
    public static final AdjFlagType PUU = new AdjFlagType(PUU_TYPE, "PUU");

    /**
     * The RUU type
     */
    public static final int RUU_TYPE = 11;

    /**
     * The instance of the RUU type
     */
    public static final AdjFlagType RUU = new AdjFlagType(RUU_TYPE, "RUU");

    /**
     * The PR2C type
     */
    public static final int PR2C_TYPE = 12;

    /**
     * The instance of the PR2C type
     */
    public static final AdjFlagType PR2C = new AdjFlagType(PR2C_TYPE, "PR2C");

    /**
     * The UTO type
     */
    public static final int UTO_TYPE = 13;

    /**
     * The instance of the UTO type
     */
    public static final AdjFlagType UTO = new AdjFlagType(UTO_TYPE, "UTO");

    /**
     * The B type
     */
    public static final int B_TYPE = 14;

    /**
     * The instance of the B type
     */
    public static final AdjFlagType B = new AdjFlagType(B_TYPE, "B");

    /**
     * The A type
     */
    public static final int A_TYPE = 15;

    /**
     * The instance of the A type
     */
    public static final AdjFlagType A = new AdjFlagType(A_TYPE, "A");

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

    private AdjFlagType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.AdjFlagType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * AdjFlagType
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
     * Returns the type of this AdjFlagType
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
        members.put("RRC", RRC);
        members.put("RET", RET);
        members.put("PBRB", PBRB);
        members.put("TCC", TCC);
        members.put("DRC", DRC);
        members.put("NAC", NAC);
        members.put("REF", REF);
        members.put("BTO", BTO);
        members.put("PTO", PTO);
        members.put("BUU", BUU);
        members.put("PUU", PUU);
        members.put("RUU", RUU);
        members.put("PR2C", PR2C);
        members.put("UTO", UTO);
        members.put("B", B);
        members.put("A", A);
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
     * Returns the String representation of this AdjFlagType
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
     * Returns a new AdjFlagType based on the given String value.
     * 
     * @param string
     * @return AdjFlagType
     */
    public static com.gov.nha.bis.upi.ack.types.AdjFlagType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AdjFlagType";
            throw new IllegalArgumentException(err);
        }
        return (AdjFlagType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.AdjFlagType valueOf(java.lang.String) 

}
