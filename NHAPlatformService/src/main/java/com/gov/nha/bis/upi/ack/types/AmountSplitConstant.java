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
 * Class AmountSplitConstant.
 * 
 * @version $Revision$ $Date$
 */
public class AmountSplitConstant implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The PURCHASE type
     */
    public static final int PURCHASE_TYPE = 0;

    /**
     * The instance of the PURCHASE type
     */
    public static final AmountSplitConstant PURCHASE = new AmountSplitConstant(PURCHASE_TYPE, "PURCHASE");

    /**
     * The CASHBACK type
     */
    public static final int CASHBACK_TYPE = 1;

    /**
     * The instance of the CASHBACK type
     */
    public static final AmountSplitConstant CASHBACK = new AmountSplitConstant(CASHBACK_TYPE, "CASHBACK");

    /**
     * The PARAMOUNT type
     */
    public static final int PARAMOUNT_TYPE = 2;

    /**
     * The instance of the PARAMOUNT type
     */
    public static final AmountSplitConstant PARAMOUNT = new AmountSplitConstant(PARAMOUNT_TYPE, "PARAMOUNT");

    /**
     * The GST type
     */
    public static final int GST_TYPE = 3;

    /**
     * The instance of the GST type
     */
    public static final AmountSplitConstant GST = new AmountSplitConstant(GST_TYPE, "GST");

    /**
     * The CGST type
     */
    public static final int CGST_TYPE = 4;

    /**
     * The instance of the CGST type
     */
    public static final AmountSplitConstant CGST = new AmountSplitConstant(CGST_TYPE, "CGST");

    /**
     * The SGST type
     */
    public static final int SGST_TYPE = 5;

    /**
     * The instance of the SGST type
     */
    public static final AmountSplitConstant SGST = new AmountSplitConstant(SGST_TYPE, "SGST");

    /**
     * The IGST type
     */
    public static final int IGST_TYPE = 6;

    /**
     * The instance of the IGST type
     */
    public static final AmountSplitConstant IGST = new AmountSplitConstant(IGST_TYPE, "IGST");

    /**
     * The CESS type
     */
    public static final int CESS_TYPE = 7;

    /**
     * The instance of the CESS type
     */
    public static final AmountSplitConstant CESS = new AmountSplitConstant(CESS_TYPE, "CESS");

    /**
     * The GSTINCENTIVE type
     */
    public static final int GSTINCENTIVE_TYPE = 8;

    /**
     * The instance of the GSTINCENTIVE type
     */
    public static final AmountSplitConstant GSTINCENTIVE = new AmountSplitConstant(GSTINCENTIVE_TYPE, "GSTINCENTIVE");

    /**
     * The GSTPCT type
     */
    public static final int GSTPCT_TYPE = 9;

    /**
     * The instance of the GSTPCT type
     */
    public static final AmountSplitConstant GSTPCT = new AmountSplitConstant(GSTPCT_TYPE, "GSTPCT");

    /**
     * The TIPS type
     */
    public static final int TIPS_TYPE = 10;

    /**
     * The instance of the TIPS type
     */
    public static final AmountSplitConstant TIPS = new AmountSplitConstant(TIPS_TYPE, "TIPS");

    /**
     * The CONFEE type
     */
    public static final int CONFEE_TYPE = 11;

    /**
     * The instance of the CONFEE type
     */
    public static final AmountSplitConstant CONFEE = new AmountSplitConstant(CONFEE_TYPE, "CONFEE");

    /**
     * The DISCPCT type
     */
    public static final int DISCPCT_TYPE = 12;

    /**
     * The instance of the DISCPCT type
     */
    public static final AmountSplitConstant DISCPCT = new AmountSplitConstant(DISCPCT_TYPE, "DISCPCT");

    /**
     * The CONPCT type
     */
    public static final int CONPCT_TYPE = 13;

    /**
     * The instance of the CONPCT type
     */
    public static final AmountSplitConstant CONPCT = new AmountSplitConstant(CONPCT_TYPE, "CONPCT");

    /**
     * The DISCOUNT type
     */
    public static final int DISCOUNT_TYPE = 14;

    /**
     * The instance of the DISCOUNT type
     */
    public static final AmountSplitConstant DISCOUNT = new AmountSplitConstant(DISCOUNT_TYPE, "DISCOUNT");

    /**
     * The baseAmount type
     */
    public static final int BASEAMOUNT_TYPE = 15;

    /**
     * The instance of the baseAmount type
     */
    public static final AmountSplitConstant BASEAMOUNT = new AmountSplitConstant(BASEAMOUNT_TYPE, "baseAmount");

    /**
     * The baseCurr type
     */
    public static final int BASECURR_TYPE = 16;

    /**
     * The instance of the baseCurr type
     */
    public static final AmountSplitConstant BASECURR = new AmountSplitConstant(BASECURR_TYPE, "baseCurr");

    /**
     * The FX type
     */
    public static final int FX_TYPE = 17;

    /**
     * The instance of the FX type
     */
    public static final AmountSplitConstant FX = new AmountSplitConstant(FX_TYPE, "FX");

    /**
     * The Mkup type
     */
    public static final int MKUP_TYPE = 18;

    /**
     * The instance of the Mkup type
     */
    public static final AmountSplitConstant MKUP = new AmountSplitConstant(MKUP_TYPE, "Mkup");

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

    private AmountSplitConstant(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.AmountSplitConstant(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * AmountSplitConstant
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
     * Returns the type of this AmountSplitConstant
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
        members.put("PURCHASE", PURCHASE);
        members.put("CASHBACK", CASHBACK);
        members.put("PARAMOUNT", PARAMOUNT);
        members.put("GST", GST);
        members.put("CGST", CGST);
        members.put("SGST", SGST);
        members.put("IGST", IGST);
        members.put("CESS", CESS);
        members.put("GSTINCENTIVE", GSTINCENTIVE);
        members.put("GSTPCT", GSTPCT);
        members.put("TIPS", TIPS);
        members.put("CONFEE", CONFEE);
        members.put("DISCPCT", DISCPCT);
        members.put("CONPCT", CONPCT);
        members.put("DISCOUNT", DISCOUNT);
        members.put("baseAmount", BASEAMOUNT);
        members.put("baseCurr", BASECURR);
        members.put("FX", FX);
        members.put("Mkup", MKUP);
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
     * Returns the String representation of this
     * AmountSplitConstant
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
     * Returns a new AmountSplitConstant based on the given String
     * value.
     * 
     * @param string
     * @return AmountSplitConstant
     */
    public static com.gov.nha.bis.upi.ack.types.AmountSplitConstant valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AmountSplitConstant";
            throw new IllegalArgumentException(err);
        }
        return (AmountSplitConstant) obj;
    } //-- com.gov.nha.bis.upi.ack.types.AmountSplitConstant valueOf(java.lang.String) 

}
