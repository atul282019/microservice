/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.7</a>, using an XML
 * Schema.
 * $Id$
 */

package com.gov.nha.bis.erupi.voucher.confirm;

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
 * Class VoucherConfReq.
 * 
 * @version $Revision$ $Date$
 */
public class VoucherConfReq implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _voucherTxn
     */
    private java.lang.String _voucherTxn;

    /**
     * Field _orgVoucherTxn
     */
    private java.lang.String _orgVoucherTxn;

    /**
     * Field _note
     */
    private java.lang.String _note;

    /**
     * Field _reqTxn
     */
    private java.lang.String _reqTxn;

    /**
     * Field _status
     */
    private java.lang.String _status;

    /**
     * Field _errorCode
     */
    private java.lang.String _errorCode;

    /**
     * Field _errorDesc
     */
    private java.lang.String _errorDesc;

    /**
     * Field _type
     */
    private java.lang.String _type;

    /**
     * Field _approvalNum
     */
    private java.lang.String _approvalNum;

    /**
     * Field _umn
     */
    private java.lang.String _umn;

    /**
     * Field _uuid
     */
    private java.lang.String _uuid;

    /**
     * Field _regName
     */
    private java.lang.String _regName;

    /**
     * Field _redeemVoucherAmount
     */
    private java.lang.String _redeemVoucherAmount;

    /**
     * Field _qrLink
     */
    private java.lang.String _qrLink;

    /**
     * Field _redeemType
     */
    private java.lang.String _redeemType;

    /**
     * Field _redeemSeq
     */
    private java.lang.String _redeemSeq;


      //----------------/
     //- Constructors -/
    //----------------/

    public VoucherConfReq() 
     {
        super();
    } //-- com.gov.nha.bis.erupi.voucher.confirm.VoucherConfReq()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'approvalNum'.
     * 
     * @return String
     * @return the value of field 'approvalNum'.
     */
    public java.lang.String getApprovalNum()
    {
        return this._approvalNum;
    } //-- java.lang.String getApprovalNum() 

    /**
     * Returns the value of field 'errorCode'.
     * 
     * @return String
     * @return the value of field 'errorCode'.
     */
    public java.lang.String getErrorCode()
    {
        return this._errorCode;
    } //-- java.lang.String getErrorCode() 

    /**
     * Returns the value of field 'errorDesc'.
     * 
     * @return String
     * @return the value of field 'errorDesc'.
     */
    public java.lang.String getErrorDesc()
    {
        return this._errorDesc;
    } //-- java.lang.String getErrorDesc() 

    /**
     * Returns the value of field 'note'.
     * 
     * @return String
     * @return the value of field 'note'.
     */
    public java.lang.String getNote()
    {
        return this._note;
    } //-- java.lang.String getNote() 

    /**
     * Returns the value of field 'orgVoucherTxn'.
     * 
     * @return String
     * @return the value of field 'orgVoucherTxn'.
     */
    public java.lang.String getOrgVoucherTxn()
    {
        return this._orgVoucherTxn;
    } //-- java.lang.String getOrgVoucherTxn() 

    /**
     * Returns the value of field 'qrLink'.
     * 
     * @return String
     * @return the value of field 'qrLink'.
     */
    public java.lang.String getQrLink()
    {
        return this._qrLink;
    } //-- java.lang.String getQrLink() 

    /**
     * Returns the value of field 'redeemSeq'.
     * 
     * @return String
     * @return the value of field 'redeemSeq'.
     */
    public java.lang.String getRedeemSeq()
    {
        return this._redeemSeq;
    } //-- java.lang.String getRedeemSeq() 

    /**
     * Returns the value of field 'redeemType'.
     * 
     * @return String
     * @return the value of field 'redeemType'.
     */
    public java.lang.String getRedeemType()
    {
        return this._redeemType;
    } //-- java.lang.String getRedeemType() 

    /**
     * Returns the value of field 'redeemVoucherAmount'.
     * 
     * @return String
     * @return the value of field 'redeemVoucherAmount'.
     */
    public java.lang.String getRedeemVoucherAmount()
    {
        return this._redeemVoucherAmount;
    } //-- java.lang.String getRedeemVoucherAmount() 

    /**
     * Returns the value of field 'regName'.
     * 
     * @return String
     * @return the value of field 'regName'.
     */
    public java.lang.String getRegName()
    {
        return this._regName;
    } //-- java.lang.String getRegName() 

    /**
     * Returns the value of field 'reqTxn'.
     * 
     * @return String
     * @return the value of field 'reqTxn'.
     */
    public java.lang.String getReqTxn()
    {
        return this._reqTxn;
    } //-- java.lang.String getReqTxn() 

    /**
     * Returns the value of field 'status'.
     * 
     * @return String
     * @return the value of field 'status'.
     */
    public java.lang.String getStatus()
    {
        return this._status;
    } //-- java.lang.String getStatus() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return String
     * @return the value of field 'type'.
     */
    public java.lang.String getType()
    {
        return this._type;
    } //-- java.lang.String getType() 

    /**
     * Returns the value of field 'umn'.
     * 
     * @return String
     * @return the value of field 'umn'.
     */
    public java.lang.String getUmn()
    {
        return this._umn;
    } //-- java.lang.String getUmn() 

    /**
     * Returns the value of field 'uuid'.
     * 
     * @return String
     * @return the value of field 'uuid'.
     */
    public java.lang.String getUuid()
    {
        return this._uuid;
    } //-- java.lang.String getUuid() 

    /**
     * Returns the value of field 'voucherTxn'.
     * 
     * @return String
     * @return the value of field 'voucherTxn'.
     */
    public java.lang.String getVoucherTxn()
    {
        return this._voucherTxn;
    } //-- java.lang.String getVoucherTxn() 

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
     * Sets the value of field 'approvalNum'.
     * 
     * @param approvalNum the value of field 'approvalNum'.
     */
    public void setApprovalNum(java.lang.String approvalNum)
    {
        this._approvalNum = approvalNum;
    } //-- void setApprovalNum(java.lang.String) 

    /**
     * Sets the value of field 'errorCode'.
     * 
     * @param errorCode the value of field 'errorCode'.
     */
    public void setErrorCode(java.lang.String errorCode)
    {
        this._errorCode = errorCode;
    } //-- void setErrorCode(java.lang.String) 

    /**
     * Sets the value of field 'errorDesc'.
     * 
     * @param errorDesc the value of field 'errorDesc'.
     */
    public void setErrorDesc(java.lang.String errorDesc)
    {
        this._errorDesc = errorDesc;
    } //-- void setErrorDesc(java.lang.String) 

    /**
     * Sets the value of field 'note'.
     * 
     * @param note the value of field 'note'.
     */
    public void setNote(java.lang.String note)
    {
        this._note = note;
    } //-- void setNote(java.lang.String) 

    /**
     * Sets the value of field 'orgVoucherTxn'.
     * 
     * @param orgVoucherTxn the value of field 'orgVoucherTxn'.
     */
    public void setOrgVoucherTxn(java.lang.String orgVoucherTxn)
    {
        this._orgVoucherTxn = orgVoucherTxn;
    } //-- void setOrgVoucherTxn(java.lang.String) 

    /**
     * Sets the value of field 'qrLink'.
     * 
     * @param qrLink the value of field 'qrLink'.
     */
    public void setQrLink(java.lang.String qrLink)
    {
        this._qrLink = qrLink;
    } //-- void setQrLink(java.lang.String) 

    /**
     * Sets the value of field 'redeemSeq'.
     * 
     * @param redeemSeq the value of field 'redeemSeq'.
     */
    public void setRedeemSeq(java.lang.String redeemSeq)
    {
        this._redeemSeq = redeemSeq;
    } //-- void setRedeemSeq(java.lang.String) 

    /**
     * Sets the value of field 'redeemType'.
     * 
     * @param redeemType the value of field 'redeemType'.
     */
    public void setRedeemType(java.lang.String redeemType)
    {
        this._redeemType = redeemType;
    } //-- void setRedeemType(java.lang.String) 

    /**
     * Sets the value of field 'redeemVoucherAmount'.
     * 
     * @param redeemVoucherAmount the value of field
     * 'redeemVoucherAmount'.
     */
    public void setRedeemVoucherAmount(java.lang.String redeemVoucherAmount)
    {
        this._redeemVoucherAmount = redeemVoucherAmount;
    } //-- void setRedeemVoucherAmount(java.lang.String) 

    /**
     * Sets the value of field 'regName'.
     * 
     * @param regName the value of field 'regName'.
     */
    public void setRegName(java.lang.String regName)
    {
        this._regName = regName;
    } //-- void setRegName(java.lang.String) 

    /**
     * Sets the value of field 'reqTxn'.
     * 
     * @param reqTxn the value of field 'reqTxn'.
     */
    public void setReqTxn(java.lang.String reqTxn)
    {
        this._reqTxn = reqTxn;
    } //-- void setReqTxn(java.lang.String) 

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(java.lang.String type)
    {
        this._type = type;
    } //-- void setType(java.lang.String) 

    /**
     * Sets the value of field 'umn'.
     * 
     * @param umn the value of field 'umn'.
     */
    public void setUmn(java.lang.String umn)
    {
        this._umn = umn;
    } //-- void setUmn(java.lang.String) 

    /**
     * Sets the value of field 'uuid'.
     * 
     * @param uuid the value of field 'uuid'.
     */
    public void setUuid(java.lang.String uuid)
    {
        this._uuid = uuid;
    } //-- void setUuid(java.lang.String) 

    /**
     * Sets the value of field 'voucherTxn'.
     * 
     * @param voucherTxn the value of field 'voucherTxn'.
     */
    public void setVoucherTxn(java.lang.String voucherTxn)
    {
        this._voucherTxn = voucherTxn;
    } //-- void setVoucherTxn(java.lang.String) 

    /**
     * Method unmarshalVoucherConfReq
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalVoucherConfReq(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.erupi.voucher.confirm.VoucherConfReq) Unmarshaller.unmarshal(com.gov.nha.bis.erupi.voucher.confirm.VoucherConfReq.class, reader);
    } //-- java.lang.Object unmarshalVoucherConfReq(java.io.Reader) 

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
