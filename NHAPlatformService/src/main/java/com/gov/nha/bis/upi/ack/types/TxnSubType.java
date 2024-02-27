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
 * Class TxnSubType.
 * 
 * @version $Revision$ $Date$
 */
public class TxnSubType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The PAY type
     */
    public static final int PAY_TYPE = 0;

    /**
     * The instance of the PAY type
     */
    public static final TxnSubType PAY = new TxnSubType(PAY_TYPE, "PAY");

    /**
     * The COLLECT type
     */
    public static final int COLLECT_TYPE = 1;

    /**
     * The instance of the COLLECT type
     */
    public static final TxnSubType COLLECT = new TxnSubType(COLLECT_TYPE, "COLLECT");

    /**
     * The DEBIT type
     */
    public static final int DEBIT_TYPE = 2;

    /**
     * The instance of the DEBIT type
     */
    public static final TxnSubType DEBIT = new TxnSubType(DEBIT_TYPE, "DEBIT");

    /**
     * The CREDIT type
     */
    public static final int CREDIT_TYPE = 3;

    /**
     * The instance of the CREDIT type
     */
    public static final TxnSubType CREDIT = new TxnSubType(CREDIT_TYPE, "CREDIT");

    /**
     * The REFUND type
     */
    public static final int REFUND_TYPE = 4;

    /**
     * The instance of the REFUND type
     */
    public static final TxnSubType REFUND = new TxnSubType(REFUND_TYPE, "REFUND");

    /**
     * The REVERSAL type
     */
    public static final int REVERSAL_TYPE = 5;

    /**
     * The instance of the REVERSAL type
     */
    public static final TxnSubType REVERSAL = new TxnSubType(REVERSAL_TYPE, "REVERSAL");

    /**
     * The MANDATE type
     */
    public static final int MANDATE_TYPE = 6;

    /**
     * The instance of the MANDATE type
     */
    public static final TxnSubType MANDATE = new TxnSubType(MANDATE_TYPE, "MANDATE");

    /**
     * The CREATE type
     */
    public static final int CREATE_TYPE = 7;

    /**
     * The instance of the CREATE type
     */
    public static final TxnSubType CREATE = new TxnSubType(CREATE_TYPE, "CREATE");

    /**
     * The UPDATE type
     */
    public static final int UPDATE_TYPE = 8;

    /**
     * The instance of the UPDATE type
     */
    public static final TxnSubType UPDATE = new TxnSubType(UPDATE_TYPE, "UPDATE");

    /**
     * The REVOKE type
     */
    public static final int REVOKE_TYPE = 9;

    /**
     * The instance of the REVOKE type
     */
    public static final TxnSubType REVOKE = new TxnSubType(REVOKE_TYPE, "REVOKE");

    /**
     * The PAUSE type
     */
    public static final int PAUSE_TYPE = 10;

    /**
     * The instance of the PAUSE type
     */
    public static final TxnSubType PAUSE = new TxnSubType(PAUSE_TYPE, "PAUSE");

    /**
     * The UNPAUSE type
     */
    public static final int UNPAUSE_TYPE = 11;

    /**
     * The instance of the UNPAUSE type
     */
    public static final TxnSubType UNPAUSE = new TxnSubType(UNPAUSE_TYPE, "UNPAUSE");

    /**
     * The TXN type
     */
    public static final int TXN_TYPE = 12;

    /**
     * The instance of the TXN type
     */
    public static final TxnSubType TXN = new TxnSubType(TXN_TYPE, "TXN");

    /**
     * The DISPUTE type
     */
    public static final int DISPUTE_TYPE = 13;

    /**
     * The instance of the DISPUTE type
     */
    public static final TxnSubType DISPUTE = new TxnSubType(DISPUTE_TYPE, "DISPUTE");

    /**
     * The TXNDISPUTE type
     */
    public static final int TXNDISPUTE_TYPE = 14;

    /**
     * The instance of the TXNDISPUTE type
     */
    public static final TxnSubType TXNDISPUTE = new TxnSubType(TXNDISPUTE_TYPE, "TXNDISPUTE");

    /**
     * The PAYER type
     */
    public static final int PAYER_TYPE = 15;

    /**
     * The instance of the PAYER type
     */
    public static final TxnSubType PAYER = new TxnSubType(PAYER_TYPE, "PAYER");

    /**
     * The PAYEE type
     */
    public static final int PAYEE_TYPE = 16;

    /**
     * The instance of the PAYEE type
     */
    public static final TxnSubType PAYEE = new TxnSubType(PAYEE_TYPE, "PAYEE");

    /**
     * The REMITTER type
     */
    public static final int REMITTER_TYPE = 17;

    /**
     * The instance of the REMITTER type
     */
    public static final TxnSubType REMITTER = new TxnSubType(REMITTER_TYPE, "REMITTER");

    /**
     * The BENEFICIARY type
     */
    public static final int BENEFICIARY_TYPE = 18;

    /**
     * The instance of the BENEFICIARY type
     */
    public static final TxnSubType BENEFICIARY = new TxnSubType(BENEFICIARY_TYPE, "BENEFICIARY");

    /**
     * The DISPUTEHIST type
     */
    public static final int DISPUTEHIST_TYPE = 19;

    /**
     * The instance of the DISPUTEHIST type
     */
    public static final TxnSubType DISPUTEHIST = new TxnSubType(DISPUTEHIST_TYPE, "DISPUTEHIST");

    /**
     * The BANK-UIDAI type
     */
    public static final int BANK_UIDAI_TYPE = 20;

    /**
     * The instance of the BANK-UIDAI type
     */
    public static final TxnSubType BANK_UIDAI = new TxnSubType(BANK_UIDAI_TYPE, "BANK-UIDAI");

    /**
     * The BANK type
     */
    public static final int BANK_TYPE = 21;

    /**
     * The instance of the BANK type
     */
    public static final TxnSubType BANK = new TxnSubType(BANK_TYPE, "BANK");

    /**
     * The UIDAI type
     */
    public static final int UIDAI_TYPE = 22;

    /**
     * The instance of the UIDAI type
     */
    public static final TxnSubType UIDAI = new TxnSubType(UIDAI_TYPE, "UIDAI");

    /**
     * The PANAADHAAR type
     */
    public static final int PANAADHAAR_TYPE = 23;

    /**
     * The instance of the PANAADHAAR type
     */
    public static final TxnSubType PANAADHAAR = new TxnSubType(PANAADHAAR_TYPE, "PANAADHAAR");

    /**
     * The ADVICE type
     */
    public static final int ADVICE_TYPE = 24;

    /**
     * The instance of the ADVICE type
     */
    public static final TxnSubType ADVICE = new TxnSubType(ADVICE_TYPE, "ADVICE");

    /**
     * The ID type
     */
    public static final int ID_TYPE = 25;

    /**
     * The instance of the ID type
     */
    public static final TxnSubType ID = new TxnSubType(ID_TYPE, "ID");

    /**
     * The VPA type
     */
    public static final int VPA_TYPE = 26;

    /**
     * The instance of the VPA type
     */
    public static final TxnSubType VPA = new TxnSubType(VPA_TYPE, "VPA");

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

    private TxnSubType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.TxnSubType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * TxnSubType
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
     * Returns the type of this TxnSubType
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
        members.put("PAY", PAY);
        members.put("COLLECT", COLLECT);
        members.put("DEBIT", DEBIT);
        members.put("CREDIT", CREDIT);
        members.put("REFUND", REFUND);
        members.put("REVERSAL", REVERSAL);
        members.put("MANDATE", MANDATE);
        members.put("CREATE", CREATE);
        members.put("UPDATE", UPDATE);
        members.put("REVOKE", REVOKE);
        members.put("PAUSE", PAUSE);
        members.put("UNPAUSE", UNPAUSE);
        members.put("TXN", TXN);
        members.put("DISPUTE", DISPUTE);
        members.put("TXNDISPUTE", TXNDISPUTE);
        members.put("PAYER", PAYER);
        members.put("PAYEE", PAYEE);
        members.put("REMITTER", REMITTER);
        members.put("BENEFICIARY", BENEFICIARY);
        members.put("DISPUTEHIST", DISPUTEHIST);
        members.put("BANK-UIDAI", BANK_UIDAI);
        members.put("BANK", BANK);
        members.put("UIDAI", UIDAI);
        members.put("PANAADHAAR", PANAADHAAR);
        members.put("ADVICE", ADVICE);
        members.put("ID", ID);
        members.put("VPA", VPA);
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
     * Returns the String representation of this TxnSubType
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
     * Returns a new TxnSubType based on the given String value.
     * 
     * @param string
     * @return TxnSubType
     */
    public static com.gov.nha.bis.upi.ack.types.TxnSubType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TxnSubType";
            throw new IllegalArgumentException(err);
        }
        return (TxnSubType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.TxnSubType valueOf(java.lang.String) 

}
