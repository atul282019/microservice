/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.7</a>, using an XML
 * Schema.
 * $Id$
 */

package com.gov.nha.bis.erupi.voucher.req;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Voucher.
 * 
 * @version $Revision$ $Date$
 */
public class Voucher implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txn_type
     */
    private java.lang.String _txn_type;

    /**
     * Field _txn_purpose
     */
    private java.lang.String _txn_purpose;

    /**
     * Field _mandate_name
     */
    private java.lang.String _mandate_name;

    /**
     * Field _validity_start
     */
    private java.lang.String _validity_start;

    /**
     * Field _validity_end
     */
    private java.lang.String _validity_end;

    /**
     * Field _amount
     */
    private java.lang.String _amount;

    /**
     * Field _payer_addr
     */
    private java.lang.String _payer_addr;

    /**
     * Field _payer_bank_code
     */
    private java.lang.String _payer_bank_code;

    /**
     * Field _mid
     */
    private java.lang.String _mid;

    /**
     * Field _sid
     */
    private java.lang.String _sid;

    /**
     * Field _tid
     */
    private java.lang.String _tid;

    /**
     * Field _payer_name
     */
    private java.lang.String _payer_name;

    /**
     * Field _ifsc
     */
    private java.lang.String _ifsc;

    /**
     * Field _acnum
     */
    private java.lang.String _acnum;

    /**
     * Field _actype
     */
    private java.lang.String _actype;

    /**
     * Field _payee_mobile
     */
    private java.lang.String _payee_mobile;

    /**
     * Field _payee_name
     */
    private java.lang.String _payee_name;

    /**
     * Field _payee_code
     */
    private java.lang.String _payee_code;

    /**
     * Field _payee_brand
     */
    private java.lang.String _payee_brand;

    /**
     * Field _org_txn_id
     */
    private java.lang.String _org_txn_id;

    /**
     * Field _voucher_redemption_type
     */
    private java.lang.String _voucher_redemption_type;

    /**
     * Field _state
     */
    private java.lang.String _state;


      //----------------/
     //- Constructors -/
    //----------------/

    public Voucher() 
     {
        super();
    } //-- com.gov.nha.bis.erupi.voucher.req.Voucher()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acnum'.
     * 
     * @return String
     * @return the value of field 'acnum'.
     */
    public java.lang.String getAcnum()
    {
        return this._acnum;
    } //-- java.lang.String getAcnum() 

    /**
     * Returns the value of field 'actype'.
     * 
     * @return String
     * @return the value of field 'actype'.
     */
    public java.lang.String getActype()
    {
        return this._actype;
    } //-- java.lang.String getActype() 

    /**
     * Returns the value of field 'amount'.
     * 
     * @return String
     * @return the value of field 'amount'.
     */
    public java.lang.String getAmount()
    {
        return this._amount;
    } //-- java.lang.String getAmount() 

    /**
     * Returns the value of field 'ifsc'.
     * 
     * @return String
     * @return the value of field 'ifsc'.
     */
    public java.lang.String getIfsc()
    {
        return this._ifsc;
    } //-- java.lang.String getIfsc() 

    /**
     * Returns the value of field 'mandate_name'.
     * 
     * @return String
     * @return the value of field 'mandate_name'.
     */
    public java.lang.String getMandate_name()
    {
        return this._mandate_name;
    } //-- java.lang.String getMandate_name() 

    /**
     * Returns the value of field 'mid'.
     * 
     * @return String
     * @return the value of field 'mid'.
     */
    public java.lang.String getMid()
    {
        return this._mid;
    } //-- java.lang.String getMid() 

    /**
     * Returns the value of field 'org_txn_id'.
     * 
     * @return String
     * @return the value of field 'org_txn_id'.
     */
    public java.lang.String getOrg_txn_id()
    {
        return this._org_txn_id;
    } //-- java.lang.String getOrg_txn_id() 

    /**
     * Returns the value of field 'payee_brand'.
     * 
     * @return String
     * @return the value of field 'payee_brand'.
     */
    public java.lang.String getPayee_brand()
    {
        return this._payee_brand;
    } //-- java.lang.String getPayee_brand() 

    /**
     * Returns the value of field 'payee_code'.
     * 
     * @return String
     * @return the value of field 'payee_code'.
     */
    public java.lang.String getPayee_code()
    {
        return this._payee_code;
    } //-- java.lang.String getPayee_code() 

    /**
     * Returns the value of field 'payee_mobile'.
     * 
     * @return String
     * @return the value of field 'payee_mobile'.
     */
    public java.lang.String getPayee_mobile()
    {
        return this._payee_mobile;
    } //-- java.lang.String getPayee_mobile() 

    /**
     * Returns the value of field 'payee_name'.
     * 
     * @return String
     * @return the value of field 'payee_name'.
     */
    public java.lang.String getPayee_name()
    {
        return this._payee_name;
    } //-- java.lang.String getPayee_name() 

    /**
     * Returns the value of field 'payer_addr'.
     * 
     * @return String
     * @return the value of field 'payer_addr'.
     */
    public java.lang.String getPayer_addr()
    {
        return this._payer_addr;
    } //-- java.lang.String getPayer_addr() 

    /**
     * Returns the value of field 'payer_bank_code'.
     * 
     * @return String
     * @return the value of field 'payer_bank_code'.
     */
    public java.lang.String getPayer_bank_code()
    {
        return this._payer_bank_code;
    } //-- java.lang.String getPayer_bank_code() 

    /**
     * Returns the value of field 'payer_name'.
     * 
     * @return String
     * @return the value of field 'payer_name'.
     */
    public java.lang.String getPayer_name()
    {
        return this._payer_name;
    } //-- java.lang.String getPayer_name() 

    /**
     * Returns the value of field 'sid'.
     * 
     * @return String
     * @return the value of field 'sid'.
     */
    public java.lang.String getSid()
    {
        return this._sid;
    } //-- java.lang.String getSid() 

    /**
     * Returns the value of field 'state'.
     * 
     * @return String
     * @return the value of field 'state'.
     */
    public java.lang.String getState()
    {
        return this._state;
    } //-- java.lang.String getState() 

    /**
     * Returns the value of field 'tid'.
     * 
     * @return String
     * @return the value of field 'tid'.
     */
    public java.lang.String getTid()
    {
        return this._tid;
    } //-- java.lang.String getTid() 

    /**
     * Returns the value of field 'txn_purpose'.
     * 
     * @return String
     * @return the value of field 'txn_purpose'.
     */
    public java.lang.String getTxn_purpose()
    {
        return this._txn_purpose;
    } //-- java.lang.String getTxn_purpose() 

    /**
     * Returns the value of field 'txn_type'.
     * 
     * @return String
     * @return the value of field 'txn_type'.
     */
    public java.lang.String getTxn_type()
    {
        return this._txn_type;
    } //-- java.lang.String getTxn_type() 

    /**
     * Returns the value of field 'validity_end'.
     * 
     * @return String
     * @return the value of field 'validity_end'.
     */
    public java.lang.String getValidity_end()
    {
        return this._validity_end;
    } //-- java.lang.String getValidity_end() 

    /**
     * Returns the value of field 'validity_start'.
     * 
     * @return String
     * @return the value of field 'validity_start'.
     */
    public java.lang.String getValidity_start()
    {
        return this._validity_start;
    } //-- java.lang.String getValidity_start() 

    /**
     * Returns the value of field 'voucher_redemption_type'.
     * 
     * @return String
     * @return the value of field 'voucher_redemption_type'.
     */
    public java.lang.String getVoucher_redemption_type()
    {
        return this._voucher_redemption_type;
    } //-- java.lang.String getVoucher_redemption_type() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'acnum'.
     * 
     * @param acnum the value of field 'acnum'.
     */
    public void setAcnum(java.lang.String acnum)
    {
        this._acnum = acnum;
    } //-- void setAcnum(java.lang.String) 

    /**
     * Sets the value of field 'actype'.
     * 
     * @param actype the value of field 'actype'.
     */
    public void setActype(java.lang.String actype)
    {
        this._actype = actype;
    } //-- void setActype(java.lang.String) 

    /**
     * Sets the value of field 'amount'.
     * 
     * @param amount the value of field 'amount'.
     */
    public void setAmount(java.lang.String amount)
    {
        this._amount = amount;
    } //-- void setAmount(java.lang.String) 

    /**
     * Sets the value of field 'ifsc'.
     * 
     * @param ifsc the value of field 'ifsc'.
     */
    public void setIfsc(java.lang.String ifsc)
    {
        this._ifsc = ifsc;
    } //-- void setIfsc(java.lang.String) 

    /**
     * Sets the value of field 'mandate_name'.
     * 
     * @param mandate_name the value of field 'mandate_name'.
     */
    public void setMandate_name(java.lang.String mandate_name)
    {
        this._mandate_name = mandate_name;
    } //-- void setMandate_name(java.lang.String) 

    /**
     * Sets the value of field 'mid'.
     * 
     * @param mid the value of field 'mid'.
     */
    public void setMid(java.lang.String mid)
    {
        this._mid = mid;
    } //-- void setMid(java.lang.String) 

    /**
     * Sets the value of field 'org_txn_id'.
     * 
     * @param org_txn_id the value of field 'org_txn_id'.
     */
    public void setOrg_txn_id(java.lang.String org_txn_id)
    {
        this._org_txn_id = org_txn_id;
    } //-- void setOrg_txn_id(java.lang.String) 

    /**
     * Sets the value of field 'payee_brand'.
     * 
     * @param payee_brand the value of field 'payee_brand'.
     */
    public void setPayee_brand(java.lang.String payee_brand)
    {
        this._payee_brand = payee_brand;
    } //-- void setPayee_brand(java.lang.String) 

    /**
     * Sets the value of field 'payee_code'.
     * 
     * @param payee_code the value of field 'payee_code'.
     */
    public void setPayee_code(java.lang.String payee_code)
    {
        this._payee_code = payee_code;
    } //-- void setPayee_code(java.lang.String) 

    /**
     * Sets the value of field 'payee_mobile'.
     * 
     * @param payee_mobile the value of field 'payee_mobile'.
     */
    public void setPayee_mobile(java.lang.String payee_mobile)
    {
        this._payee_mobile = payee_mobile;
    } //-- void setPayee_mobile(java.lang.String) 

    /**
     * Sets the value of field 'payee_name'.
     * 
     * @param payee_name the value of field 'payee_name'.
     */
    public void setPayee_name(java.lang.String payee_name)
    {
        this._payee_name = payee_name;
    } //-- void setPayee_name(java.lang.String) 

    /**
     * Sets the value of field 'payer_addr'.
     * 
     * @param payer_addr the value of field 'payer_addr'.
     */
    public void setPayer_addr(java.lang.String payer_addr)
    {
        this._payer_addr = payer_addr;
    } //-- void setPayer_addr(java.lang.String) 

    /**
     * Sets the value of field 'payer_bank_code'.
     * 
     * @param payer_bank_code the value of field 'payer_bank_code'.
     */
    public void setPayer_bank_code(java.lang.String payer_bank_code)
    {
        this._payer_bank_code = payer_bank_code;
    } //-- void setPayer_bank_code(java.lang.String) 

    /**
     * Sets the value of field 'payer_name'.
     * 
     * @param payer_name the value of field 'payer_name'.
     */
    public void setPayer_name(java.lang.String payer_name)
    {
        this._payer_name = payer_name;
    } //-- void setPayer_name(java.lang.String) 

    /**
     * Sets the value of field 'sid'.
     * 
     * @param sid the value of field 'sid'.
     */
    public void setSid(java.lang.String sid)
    {
        this._sid = sid;
    } //-- void setSid(java.lang.String) 

    /**
     * Sets the value of field 'state'.
     * 
     * @param state the value of field 'state'.
     */
    public void setState(java.lang.String state)
    {
        this._state = state;
    } //-- void setState(java.lang.String) 

    /**
     * Sets the value of field 'tid'.
     * 
     * @param tid the value of field 'tid'.
     */
    public void setTid(java.lang.String tid)
    {
        this._tid = tid;
    } //-- void setTid(java.lang.String) 

    /**
     * Sets the value of field 'txn_purpose'.
     * 
     * @param txn_purpose the value of field 'txn_purpose'.
     */
    public void setTxn_purpose(java.lang.String txn_purpose)
    {
        this._txn_purpose = txn_purpose;
    } //-- void setTxn_purpose(java.lang.String) 

    /**
     * Sets the value of field 'txn_type'.
     * 
     * @param txn_type the value of field 'txn_type'.
     */
    public void setTxn_type(java.lang.String txn_type)
    {
        this._txn_type = txn_type;
    } //-- void setTxn_type(java.lang.String) 

    /**
     * Sets the value of field 'validity_end'.
     * 
     * @param validity_end the value of field 'validity_end'.
     */
    public void setValidity_end(java.lang.String validity_end)
    {
        this._validity_end = validity_end;
    } //-- void setValidity_end(java.lang.String) 

    /**
     * Sets the value of field 'validity_start'.
     * 
     * @param validity_start the value of field 'validity_start'.
     */
    public void setValidity_start(java.lang.String validity_start)
    {
        this._validity_start = validity_start;
    } //-- void setValidity_start(java.lang.String) 

    /**
     * Sets the value of field 'voucher_redemption_type'.
     * 
     * @param voucher_redemption_type the value of field
     * 'voucher_redemption_type'.
     */
    public void setVoucher_redemption_type(java.lang.String voucher_redemption_type)
    {
        this._voucher_redemption_type = voucher_redemption_type;
    } //-- void setVoucher_redemption_type(java.lang.String) 

    /**
     * Method unmarshalVoucher
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalVoucher(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.erupi.voucher.req.Voucher) Unmarshaller.unmarshal(com.gov.nha.bis.erupi.voucher.req.Voucher.class, reader);
    } //-- java.lang.Object unmarshalVoucher(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
