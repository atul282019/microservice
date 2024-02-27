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
 * Class PayConstant.
 * 
 * @version $Revision$ $Date$
 */
public class PayConstant implements java.io.Serializable {


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
    public static final PayConstant PAY = new PayConstant(PAY_TYPE, "PAY");

    /**
     * The COLLECT type
     */
    public static final int COLLECT_TYPE = 1;

    /**
     * The instance of the COLLECT type
     */
    public static final PayConstant COLLECT = new PayConstant(COLLECT_TYPE, "COLLECT");

    /**
     * The REVERSAL type
     */
    public static final int REVERSAL_TYPE = 2;

    /**
     * The instance of the REVERSAL type
     */
    public static final PayConstant REVERSAL = new PayConstant(REVERSAL_TYPE, "REVERSAL");

    /**
     * The REFUND type
     */
    public static final int REFUND_TYPE = 3;

    /**
     * The instance of the REFUND type
     */
    public static final PayConstant REFUND = new PayConstant(REFUND_TYPE, "REFUND");

    /**
     * The CREDIT type
     */
    public static final int CREDIT_TYPE = 4;

    /**
     * The instance of the CREDIT type
     */
    public static final PayConstant CREDIT = new PayConstant(CREDIT_TYPE, "CREDIT");

    /**
     * The DEBIT type
     */
    public static final int DEBIT_TYPE = 5;

    /**
     * The instance of the DEBIT type
     */
    public static final PayConstant DEBIT = new PayConstant(DEBIT_TYPE, "DEBIT");

    /**
     * The BAL type
     */
    public static final int BAL_TYPE = 6;

    /**
     * The instance of the BAL type
     */
    public static final PayConstant BAL = new PayConstant(BAL_TYPE, "BAL");

    /**
     * The ListPsp type
     */
    public static final int LISTPSP_TYPE = 7;

    /**
     * The instance of the ListPsp type
     */
    public static final PayConstant LISTPSP = new PayConstant(LISTPSP_TYPE, "ListPsp");

    /**
     * The ListAccPvd type
     */
    public static final int LISTACCPVD_TYPE = 8;

    /**
     * The instance of the ListAccPvd type
     */
    public static final PayConstant LISTACCPVD = new PayConstant(LISTACCPVD_TYPE, "ListAccPvd");

    /**
     * The ListKeys type
     */
    public static final int LISTKEYS_TYPE = 9;

    /**
     * The instance of the ListKeys type
     */
    public static final PayConstant LISTKEYS = new PayConstant(LISTKEYS_TYPE, "ListKeys");

    /**
     * The GetToken type
     */
    public static final int GETTOKEN_TYPE = 10;

    /**
     * The instance of the GetToken type
     */
    public static final PayConstant GETTOKEN = new PayConstant(GETTOKEN_TYPE, "GetToken");

    /**
     * The ListAccount type
     */
    public static final int LISTACCOUNT_TYPE = 11;

    /**
     * The instance of the ListAccount type
     */
    public static final PayConstant LISTACCOUNT = new PayConstant(LISTACCOUNT_TYPE, "ListAccount");

    /**
     * The ListVae type
     */
    public static final int LISTVAE_TYPE = 12;

    /**
     * The instance of the ListVae type
     */
    public static final PayConstant LISTVAE = new PayConstant(LISTVAE_TYPE, "ListVae");

    /**
     * The ManageVae type
     */
    public static final int MANAGEVAE_TYPE = 13;

    /**
     * The instance of the ManageVae type
     */
    public static final PayConstant MANAGEVAE = new PayConstant(MANAGEVAE_TYPE, "ManageVae");

    /**
     * The ValAdd type
     */
    public static final int VALADD_TYPE = 14;

    /**
     * The instance of the ValAdd type
     */
    public static final PayConstant VALADD = new PayConstant(VALADD_TYPE, "ValAdd");

    /**
     * The SetCre type
     */
    public static final int SETCRE_TYPE = 15;

    /**
     * The instance of the SetCre type
     */
    public static final PayConstant SETCRE = new PayConstant(SETCRE_TYPE, "SetCre");

    /**
     * The ReqRegMob type
     */
    public static final int REQREGMOB_TYPE = 16;

    /**
     * The instance of the ReqRegMob type
     */
    public static final PayConstant REQREGMOB = new PayConstant(REQREGMOB_TYPE, "ReqRegMob");

    /**
     * The ResetRegMob type
     */
    public static final int RESETREGMOB_TYPE = 17;

    /**
     * The instance of the ResetRegMob type
     */
    public static final PayConstant RESETREGMOB = new PayConstant(RESETREGMOB_TYPE, "ResetRegMob");

    /**
     * The ChkTxn type
     */
    public static final int CHKTXN_TYPE = 18;

    /**
     * The instance of the ChkTxn type
     */
    public static final PayConstant CHKTXN = new PayConstant(CHKTXN_TYPE, "ChkTxn");

    /**
     * The Otp type
     */
    public static final int OTP_TYPE = 19;

    /**
     * The instance of the Otp type
     */
    public static final PayConstant OTP = new PayConstant(OTP_TYPE, "Otp");

    /**
     * The BalEnq type
     */
    public static final int BALENQ_TYPE = 20;

    /**
     * The instance of the BalEnq type
     */
    public static final PayConstant BALENQ = new PayConstant(BALENQ_TYPE, "BalEnq");

    /**
     * The Hbt type
     */
    public static final int HBT_TYPE = 21;

    /**
     * The instance of the Hbt type
     */
    public static final PayConstant HBT = new PayConstant(HBT_TYPE, "Hbt");

    /**
     * The PendingMsg type
     */
    public static final int PENDINGMSG_TYPE = 22;

    /**
     * The instance of the PendingMsg type
     */
    public static final PayConstant PENDINGMSG = new PayConstant(PENDINGMSG_TYPE, "PendingMsg");

    /**
     * The TxnConfirmation type
     */
    public static final int TXNCONFIRMATION_TYPE = 23;

    /**
     * The instance of the TxnConfirmation type
     */
    public static final PayConstant TXNCONFIRMATION = new PayConstant(TXNCONFIRMATION_TYPE, "TxnConfirmation");

    /**
     * The CREATE type
     */
    public static final int CREATE_TYPE = 24;

    /**
     * The instance of the CREATE type
     */
    public static final PayConstant CREATE = new PayConstant(CREATE_TYPE, "CREATE");

    /**
     * The REVOKE type
     */
    public static final int REVOKE_TYPE = 25;

    /**
     * The instance of the REVOKE type
     */
    public static final PayConstant REVOKE = new PayConstant(REVOKE_TYPE, "REVOKE");

    /**
     * The UPDATE type
     */
    public static final int UPDATE_TYPE = 26;

    /**
     * The instance of the UPDATE type
     */
    public static final PayConstant UPDATE = new PayConstant(UPDATE_TYPE, "UPDATE");

    /**
     * The ListPSPKeys type
     */
    public static final int LISTPSPKEYS_TYPE = 27;

    /**
     * The instance of the ListPSPKeys type
     */
    public static final PayConstant LISTPSPKEYS = new PayConstant(LISTPSPKEYS_TYPE, "ListPSPKeys");

    /**
     * The BalChk type
     */
    public static final int BALCHK_TYPE = 28;

    /**
     * The instance of the BalChk type
     */
    public static final PayConstant BALCHK = new PayConstant(BALCHK_TYPE, "BalChk");

    /**
     * The ReqActivation type
     */
    public static final int REQACTIVATION_TYPE = 29;

    /**
     * The instance of the ReqActivation type
     */
    public static final PayConstant REQACTIVATION = new PayConstant(REQACTIVATION_TYPE, "ReqActivation");

    /**
     * The International type
     */
    public static final int INTERNATIONAL_TYPE = 30;

    /**
     * The instance of the International type
     */
    public static final PayConstant INTERNATIONAL = new PayConstant(INTERNATIONAL_TYPE, "International");

    /**
     * The UPI Services type
     */
    public static final int UPI_SERVICES_TYPE = 31;

    /**
     * The instance of the UPI Services type
     */
    public static final PayConstant UPI_SERVICES = new PayConstant(UPI_SERVICES_TYPE, "UPI Services");

    /**
     * The IntlQr type
     */
    public static final int INTLQR_TYPE = 32;

    /**
     * The instance of the IntlQr type
     */
    public static final PayConstant INTLQR = new PayConstant(INTLQR_TYPE, "IntlQr");

    /**
     * The QrVal type
     */
    public static final int QRVAL_TYPE = 33;

    /**
     * The instance of the QrVal type
     */
    public static final PayConstant QRVAL = new PayConstant(QRVAL_TYPE, "QrVal");

    /**
     * The ReqFxRate type
     */
    public static final int REQFXRATE_TYPE = 34;

    /**
     * The instance of the ReqFxRate type
     */
    public static final PayConstant REQFXRATE = new PayConstant(REQFXRATE_TYPE, "ReqFxRate");

    /**
     * The RespFxRate type
     */
    public static final int RESPFXRATE_TYPE = 35;

    /**
     * The instance of the RespFxRate type
     */
    public static final PayConstant RESPFXRATE = new PayConstant(RESPFXRATE_TYPE, "RespFxRate");

    /**
     * The Booking type
     */
    public static final int BOOKING_TYPE = 36;

    /**
     * The instance of the Booking type
     */
    public static final PayConstant BOOKING = new PayConstant(BOOKING_TYPE, "Booking");

    /**
     * The ValCust type
     */
    public static final int VALCUST_TYPE = 37;

    /**
     * The instance of the ValCust type
     */
    public static final PayConstant VALCUST = new PayConstant(VALCUST_TYPE, "ValCust");

    /**
     * The ReqMapperConfirmation type
     */
    public static final int REQMAPPERCONFIRMATION_TYPE = 38;

    /**
     * The instance of the ReqMapperConfirmation type
     */
    public static final PayConstant REQMAPPERCONFIRMATION = new PayConstant(REQMAPPERCONFIRMATION_TYPE, "ReqMapperConfirmation");

    /**
     * The MandateNotification type
     */
    public static final int MANDATENOTIFICATION_TYPE = 39;

    /**
     * The instance of the MandateNotification type
     */
    public static final PayConstant MANDATENOTIFICATION = new PayConstant(MANDATENOTIFICATION_TYPE, "MandateNotification");

    /**
     * The RespKyc type
     */
    public static final int RESPKYC_TYPE = 41;

    /**
     * The instance of the RespKyc type
     */
    public static final PayConstant RESPKYC = new PayConstant(RESPKYC_TYPE, "RespKyc");

    /**
     * The ReqKyc type
     */
    public static final int REQKYC_TYPE = 42;

    /**
     * The instance of the ReqKyc type
     */
    public static final PayConstant REQKYC = new PayConstant(REQKYC_TYPE, "ReqKyc");

    /**
     * The AUTH type
     */
    public static final int AUTH_TYPE = 43;

    /**
     * The instance of the AUTH type
     */
    public static final PayConstant AUTH = new PayConstant(AUTH_TYPE, "AUTH");

    /**
     * The VR type
     */
    public static final int VR_TYPE = 46;

    /**
     * The instance of the VR type
     */
    public static final PayConstant VR = new PayConstant(VR_TYPE, "VR");

    /**
     * The ChkBankStatus type
     */
    public static final int CHKBANKSTATUS_TYPE = 47;

    /**
     * The instance of the ChkBankStatus type
     */
    public static final PayConstant CHKBANKSTATUS = new PayConstant(CHKBANKSTATUS_TYPE, "ChkBankStatus");

    /**
     * The NameEnq type
     */
    public static final int NAMEENQ_TYPE = 48;

    /**
     * The instance of the NameEnq type
     */
    public static final PayConstant NAMEENQ = new PayConstant(NAMEENQ_TYPE, "NameEnq");

    /**
     * The MiniStmt type
     */
    public static final int MINISTMT_TYPE = 49;

    /**
     * The instance of the MiniStmt type
     */
    public static final PayConstant MINISTMT = new PayConstant(MINISTMT_TYPE, "MiniStmt");

    /**
     * The BFD type
     */
    public static final int BFD_TYPE = 50;

    /**
     * The instance of the BFD type
     */
    public static final PayConstant BFD = new PayConstant(BFD_TYPE, "BFD");

    /**
     * The BIO-AUTH type
     */
    public static final int BIO_AUTH_TYPE = 51;

    /**
     * The instance of the BIO-AUTH type
     */
    public static final PayConstant BIO_AUTH = new PayConstant(BIO_AUTH_TYPE, "BIO-AUTH");

    /**
     * The DEMO-AUTH type
     */
    public static final int DEMO_AUTH_TYPE = 52;

    /**
     * The instance of the DEMO-AUTH type
     */
    public static final PayConstant DEMO_AUTH = new PayConstant(DEMO_AUTH_TYPE, "DEMO-AUTH");

    /**
     * The REQ-OTP type
     */
    public static final int REQ_OTP_TYPE = 53;

    /**
     * The instance of the REQ-OTP type
     */
    public static final PayConstant REQ_OTP = new PayConstant(REQ_OTP_TYPE, "REQ-OTP");

    /**
     * The ADVICE type
     */
    public static final int ADVICE_TYPE = 54;

    /**
     * The instance of the ADVICE type
     */
    public static final PayConstant ADVICE = new PayConstant(ADVICE_TYPE, "ADVICE");

    /**
     * The OTP-AUTH-UPDATE type
     */
    public static final int OTP_AUTH_UPDATE_TYPE = 55;

    /**
     * The instance of the OTP-AUTH-UPDATE type
     */
    public static final PayConstant OTP_AUTH_UPDATE = new PayConstant(OTP_AUTH_UPDATE_TYPE, "OTP-AUTH-UPDATE");

    /**
     * The EKYC type
     */
    public static final int EKYC_TYPE = 56;

    /**
     * The instance of the EKYC type
     */
    public static final PayConstant EKYC = new PayConstant(EKYC_TYPE, "EKYC");

    /**
     * The TKN type
     */
    public static final int TKN_TYPE = 57;

    /**
     * The instance of the TKN type
     */
    public static final PayConstant TKN = new PayConstant(TKN_TYPE, "TKN");

    /**
     * The PAUSE type
     */
    public static final int PAUSE_TYPE = 58;

    /**
     * The instance of the PAUSE type
     */
    public static final PayConstant PAUSE = new PayConstant(PAUSE_TYPE, "PAUSE");

    /**
     * The UNPAUSE type
     */
    public static final int UNPAUSE_TYPE = 59;

    /**
     * The instance of the UNPAUSE type
     */
    public static final PayConstant UNPAUSE = new PayConstant(UNPAUSE_TYPE, "UNPAUSE");

    /**
     * The COMPLAINT type
     */
    public static final int COMPLAINT_TYPE = 60;

    /**
     * The instance of the COMPLAINT type
     */
    public static final PayConstant COMPLAINT = new PayConstant(COMPLAINT_TYPE, "COMPLAINT");

    /**
     * The DISPUTE type
     */
    public static final int DISPUTE_TYPE = 61;

    /**
     * The instance of the DISPUTE type
     */
    public static final PayConstant DISPUTE = new PayConstant(DISPUTE_TYPE, "DISPUTE");

    /**
     * The STATUSUPDATE type
     */
    public static final int STATUSUPDATE_TYPE = 62;

    /**
     * The instance of the STATUSUPDATE type
     */
    public static final PayConstant STATUSUPDATE = new PayConstant(STATUSUPDATE_TYPE, "STATUSUPDATE");

    /**
     * The CHKSTATUS type
     */
    public static final int CHKSTATUS_TYPE = 63;

    /**
     * The instance of the CHKSTATUS type
     */
    public static final PayConstant CHKSTATUS = new PayConstant(CHKSTATUS_TYPE, "CHKSTATUS");

    /**
     * The STATUS type
     */
    public static final int STATUS_TYPE = 64;

    /**
     * The instance of the STATUS type
     */
    public static final PayConstant STATUS = new PayConstant(STATUS_TYPE, "STATUS");

    /**
     * The AUTOUPDATE type
     */
    public static final int AUTOUPDATE_TYPE = 65;

    /**
     * The instance of the AUTOUPDATE type
     */
    public static final PayConstant AUTOUPDATE = new PayConstant(AUTOUPDATE_TYPE, "AUTOUPDATE");

    /**
     * The BACKOFFICE type
     */
    public static final int BACKOFFICE_TYPE = 66;

    /**
     * The instance of the BACKOFFICE type
     */
    public static final PayConstant BACKOFFICE = new PayConstant(BACKOFFICE_TYPE, "BACKOFFICE");

    /**
     * The ITD type
     */
    public static final int ITD_TYPE = 67;

    /**
     * The instance of the ITD type
     */
    public static final PayConstant ITD = new PayConstant(ITD_TYPE, "ITD");

    /**
     * The CMREGISTRATION type
     */
    public static final int CMREGISTRATION_TYPE = 68;

    /**
     * The instance of the CMREGISTRATION type
     */
    public static final PayConstant CMREGISTRATION = new PayConstant(CMREGISTRATION_TYPE, "CMREGISTRATION");

    /**
     * The CHECK type
     */
    public static final int CHECK_TYPE = 69;

    /**
     * The instance of the CHECK type
     */
    public static final PayConstant CHECK = new PayConstant(CHECK_TYPE, "CHECK");

    /**
     * The HISTORY type
     */
    public static final int HISTORY_TYPE = 70;

    /**
     * The instance of the HISTORY type
     */
    public static final PayConstant HISTORY = new PayConstant(HISTORY_TYPE, "HISTORY");

    /**
     * The FETCH type
     */
    public static final int FETCH_TYPE = 71;

    /**
     * The instance of the FETCH type
     */
    public static final PayConstant FETCH = new PayConstant(FETCH_TYPE, "FETCH");

    /**
     * The PORT type
     */
    public static final int PORT_TYPE = 72;

    /**
     * The instance of the PORT type
     */
    public static final PayConstant PORT = new PayConstant(PORT_TYPE, "PORT");

    /**
     * The SHG type
     */
    public static final int SHG_TYPE = 73;

    /**
     * The instance of the SHG type
     */
    public static final PayConstant SHG = new PayConstant(SHG_TYPE, "SHG");

    /**
     * The Voucher type
     */
    public static final int VOUCHER_TYPE = 74;

    /**
     * The instance of the Voucher type
     */
    public static final PayConstant VOUCHER = new PayConstant(VOUCHER_TYPE, "Voucher");

    /**
     * The REDEEM type
     */
    public static final int REDEEM_TYPE = 75;

    /**
     * The instance of the REDEEM type
     */
    public static final PayConstant REDEEM = new PayConstant(REDEEM_TYPE, "REDEEM");

    /**
     * The EXPIRED type
     */
    public static final int EXPIRED_TYPE = 76;

    /**
     * The instance of the EXPIRED type
     */
    public static final PayConstant EXPIRED = new PayConstant(EXPIRED_TYPE, "EXPIRED");

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

    private PayConstant(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.PayConstant(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * PayConstant
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
     * Returns the type of this PayConstant
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
        members.put("REVERSAL", REVERSAL);
        members.put("REFUND", REFUND);
        members.put("CREDIT", CREDIT);
        members.put("DEBIT", DEBIT);
        members.put("BAL", BAL);
        members.put("ListPsp", LISTPSP);
        members.put("ListAccPvd", LISTACCPVD);
        members.put("ListKeys", LISTKEYS);
        members.put("GetToken", GETTOKEN);
        members.put("ListAccount", LISTACCOUNT);
        members.put("ListVae", LISTVAE);
        members.put("ManageVae", MANAGEVAE);
        members.put("ValAdd", VALADD);
        members.put("SetCre", SETCRE);
        members.put("ReqRegMob", REQREGMOB);
        members.put("ResetRegMob", RESETREGMOB);
        members.put("ChkTxn", CHKTXN);
        members.put("Otp", OTP);
        members.put("BalEnq", BALENQ);
        members.put("Hbt", HBT);
        members.put("PendingMsg", PENDINGMSG);
        members.put("TxnConfirmation", TXNCONFIRMATION);
        members.put("CREATE", CREATE);
        members.put("REVOKE", REVOKE);
        members.put("UPDATE", UPDATE);
        members.put("ListPSPKeys", LISTPSPKEYS);
        members.put("BalChk", BALCHK);
        members.put("ReqActivation", REQACTIVATION);
        members.put("International", INTERNATIONAL);
        members.put("UPI Services", UPI_SERVICES);
        members.put("IntlQr", INTLQR);
        members.put("QrVal", QRVAL);
        members.put("ReqFxRate", REQFXRATE);
        members.put("RespFxRate", RESPFXRATE);
        members.put("Booking", BOOKING);
        members.put("ValCust", VALCUST);
        members.put("ReqMapperConfirmation", REQMAPPERCONFIRMATION);
        members.put("MandateNotification", MANDATENOTIFICATION);
        members.put("FETCH", FETCH);
        members.put("RespKyc", RESPKYC);
        members.put("ReqKyc", REQKYC);
        members.put("AUTH", AUTH);
        members.put("PAUSE", PAUSE);
        members.put("UNPAUSE", UNPAUSE);
        members.put("VR", VR);
        members.put("ChkBankStatus", CHKBANKSTATUS);
        members.put("NameEnq", NAMEENQ);
        members.put("MiniStmt", MINISTMT);
        members.put("BFD", BFD);
        members.put("BIO-AUTH", BIO_AUTH);
        members.put("DEMO-AUTH", DEMO_AUTH);
        members.put("REQ-OTP", REQ_OTP);
        members.put("ADVICE", ADVICE);
        members.put("OTP-AUTH-UPDATE", OTP_AUTH_UPDATE);
        members.put("EKYC", EKYC);
        members.put("TKN", TKN);
        members.put("COMPLAINT", COMPLAINT);
        members.put("DISPUTE", DISPUTE);
        members.put("STATUSUPDATE", STATUSUPDATE);
        members.put("CHKSTATUS", CHKSTATUS);
        members.put("STATUS", STATUS);
        members.put("AUTOUPDATE", AUTOUPDATE);
        members.put("BACKOFFICE", BACKOFFICE);
        members.put("ITD", ITD);
        members.put("CMREGISTRATION", CMREGISTRATION);
        members.put("CHECK", CHECK);
        members.put("HISTORY", HISTORY);
        members.put("PORT", PORT);
        members.put("SHG", SHG);
        members.put("Voucher", VOUCHER);
        members.put("REDEEM", REDEEM);
        members.put("EXPIRED", EXPIRED);
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
     * Returns the String representation of this PayConstant
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
     * Returns a new PayConstant based on the given String value.
     * 
     * @param string
     * @return PayConstant
     */
    public static com.gov.nha.bis.upi.ack.types.PayConstant valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PayConstant";
            throw new IllegalArgumentException(err);
        }
        return (PayConstant) obj;
    } //-- com.gov.nha.bis.upi.ack.types.PayConstant valueOf(java.lang.String) 

}
