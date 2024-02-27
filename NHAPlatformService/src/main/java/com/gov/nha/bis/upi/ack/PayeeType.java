/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.7</a>, using an XML
 * Schema.
 * $Id$
 */

package com.gov.nha.bis.upi.ack;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.gov.nha.bis.upi.ack.types.PayerConstant;
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
 * Class PayeeType.
 * 
 * @version $Revision$ $Date$
 */
public class PayeeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _addr
     */
    private java.lang.String _addr;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _seqNum
     */
    private java.lang.String _seqNum;

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.PayerConstant _type;

    /**
     * Field _code
     */
    private java.lang.String _code;

    /**
     * Field _note
     */
    private java.lang.String _note;

    /**
     * Field _ts
     */
    private java.lang.String _ts;

    /**
     * Field _cmId
     */
    private java.lang.String _cmId;

    /**
     * Field _info
     */
    private com.gov.nha.bis.upi.ack.InfoType _info;

    /**
     * Field _device
     */
    private com.gov.nha.bis.upi.ack.DeviceType _device;

    /**
     * Field _ac
     */
    private com.gov.nha.bis.upi.ack.AccountType _ac;

    /**
     * Field _amount
     */
    private com.gov.nha.bis.upi.ack.AmountType _amount;

    /**
     * Field _merchant
     */
    private com.gov.nha.bis.upi.ack.MerchantType _merchant;

    /**
     * Field _institution
     */
    private com.gov.nha.bis.upi.ack.InstitutionType _institution;

    /**
     * Field _fxList
     */
    private com.gov.nha.bis.upi.ack.FxListType _fxList;

    /**
     * Field _consent
     */
    private com.gov.nha.bis.upi.ack.ConsentType _consent;

    /**
     * Field _reqIdDetails
     */
    private com.gov.nha.bis.upi.ack.ReqIdDetails _reqIdDetails;

    /**
     * Field _creds
     */
    private com.gov.nha.bis.upi.ack.CredsType _creds;


      //----------------/
     //- Constructors -/
    //----------------/

    public PayeeType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.PayeeType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'ac'.
     * 
     * @return AccountType
     * @return the value of field 'ac'.
     */
    public com.gov.nha.bis.upi.ack.AccountType getAc()
    {
        return this._ac;
    } //-- com.gov.nha.bis.upi.ack.AccountType getAc() 

    /**
     * Returns the value of field 'addr'.
     * 
     * @return String
     * @return the value of field 'addr'.
     */
    public java.lang.String getAddr()
    {
        return this._addr;
    } //-- java.lang.String getAddr() 

    /**
     * Returns the value of field 'amount'.
     * 
     * @return AmountType
     * @return the value of field 'amount'.
     */
    public com.gov.nha.bis.upi.ack.AmountType getAmount()
    {
        return this._amount;
    } //-- com.gov.nha.bis.upi.ack.AmountType getAmount() 

    /**
     * Returns the value of field 'cmId'.
     * 
     * @return String
     * @return the value of field 'cmId'.
     */
    public java.lang.String getCmId()
    {
        return this._cmId;
    } //-- java.lang.String getCmId() 

    /**
     * Returns the value of field 'code'.
     * 
     * @return String
     * @return the value of field 'code'.
     */
    public java.lang.String getCode()
    {
        return this._code;
    } //-- java.lang.String getCode() 

    /**
     * Returns the value of field 'consent'.
     * 
     * @return ConsentType
     * @return the value of field 'consent'.
     */
    public com.gov.nha.bis.upi.ack.ConsentType getConsent()
    {
        return this._consent;
    } //-- com.gov.nha.bis.upi.ack.ConsentType getConsent() 

    /**
     * Returns the value of field 'creds'.
     * 
     * @return CredsType
     * @return the value of field 'creds'.
     */
    public com.gov.nha.bis.upi.ack.CredsType getCreds()
    {
        return this._creds;
    } //-- com.gov.nha.bis.upi.ack.CredsType getCreds() 

    /**
     * Returns the value of field 'device'.
     * 
     * @return DeviceType
     * @return the value of field 'device'.
     */
    public com.gov.nha.bis.upi.ack.DeviceType getDevice()
    {
        return this._device;
    } //-- com.gov.nha.bis.upi.ack.DeviceType getDevice() 

    /**
     * Returns the value of field 'fxList'.
     * 
     * @return FxListType
     * @return the value of field 'fxList'.
     */
    public com.gov.nha.bis.upi.ack.FxListType getFxList()
    {
        return this._fxList;
    } //-- com.gov.nha.bis.upi.ack.FxListType getFxList() 

    /**
     * Returns the value of field 'info'.
     * 
     * @return InfoType
     * @return the value of field 'info'.
     */
    public com.gov.nha.bis.upi.ack.InfoType getInfo()
    {
        return this._info;
    } //-- com.gov.nha.bis.upi.ack.InfoType getInfo() 

    /**
     * Returns the value of field 'institution'.
     * 
     * @return InstitutionType
     * @return the value of field 'institution'.
     */
    public com.gov.nha.bis.upi.ack.InstitutionType getInstitution()
    {
        return this._institution;
    } //-- com.gov.nha.bis.upi.ack.InstitutionType getInstitution() 

    /**
     * Returns the value of field 'merchant'.
     * 
     * @return MerchantType
     * @return the value of field 'merchant'.
     */
    public com.gov.nha.bis.upi.ack.MerchantType getMerchant()
    {
        return this._merchant;
    } //-- com.gov.nha.bis.upi.ack.MerchantType getMerchant() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

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
     * Returns the value of field 'reqIdDetails'.
     * 
     * @return ReqIdDetails
     * @return the value of field 'reqIdDetails'.
     */
    public com.gov.nha.bis.upi.ack.ReqIdDetails getReqIdDetails()
    {
        return this._reqIdDetails;
    } //-- com.gov.nha.bis.upi.ack.ReqIdDetails getReqIdDetails() 

    /**
     * Returns the value of field 'seqNum'.
     * 
     * @return String
     * @return the value of field 'seqNum'.
     */
    public java.lang.String getSeqNum()
    {
        return this._seqNum;
    } //-- java.lang.String getSeqNum() 

    /**
     * Returns the value of field 'ts'.
     * 
     * @return String
     * @return the value of field 'ts'.
     */
    public java.lang.String getTs()
    {
        return this._ts;
    } //-- java.lang.String getTs() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return PayerConstant
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.PayerConstant getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.PayerConstant getType() 

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
     * Sets the value of field 'ac'.
     * 
     * @param ac the value of field 'ac'.
     */
    public void setAc(com.gov.nha.bis.upi.ack.AccountType ac)
    {
        this._ac = ac;
    } //-- void setAc(com.gov.nha.bis.upi.ack.AccountType) 

    /**
     * Sets the value of field 'addr'.
     * 
     * @param addr the value of field 'addr'.
     */
    public void setAddr(java.lang.String addr)
    {
        this._addr = addr;
    } //-- void setAddr(java.lang.String) 

    /**
     * Sets the value of field 'amount'.
     * 
     * @param amount the value of field 'amount'.
     */
    public void setAmount(com.gov.nha.bis.upi.ack.AmountType amount)
    {
        this._amount = amount;
    } //-- void setAmount(com.gov.nha.bis.upi.ack.AmountType) 

    /**
     * Sets the value of field 'cmId'.
     * 
     * @param cmId the value of field 'cmId'.
     */
    public void setCmId(java.lang.String cmId)
    {
        this._cmId = cmId;
    } //-- void setCmId(java.lang.String) 

    /**
     * Sets the value of field 'code'.
     * 
     * @param code the value of field 'code'.
     */
    public void setCode(java.lang.String code)
    {
        this._code = code;
    } //-- void setCode(java.lang.String) 

    /**
     * Sets the value of field 'consent'.
     * 
     * @param consent the value of field 'consent'.
     */
    public void setConsent(com.gov.nha.bis.upi.ack.ConsentType consent)
    {
        this._consent = consent;
    } //-- void setConsent(com.gov.nha.bis.upi.ack.ConsentType) 

    /**
     * Sets the value of field 'creds'.
     * 
     * @param creds the value of field 'creds'.
     */
    public void setCreds(com.gov.nha.bis.upi.ack.CredsType creds)
    {
        this._creds = creds;
    } //-- void setCreds(com.gov.nha.bis.upi.ack.CredsType) 

    /**
     * Sets the value of field 'device'.
     * 
     * @param device the value of field 'device'.
     */
    public void setDevice(com.gov.nha.bis.upi.ack.DeviceType device)
    {
        this._device = device;
    } //-- void setDevice(com.gov.nha.bis.upi.ack.DeviceType) 

    /**
     * Sets the value of field 'fxList'.
     * 
     * @param fxList the value of field 'fxList'.
     */
    public void setFxList(com.gov.nha.bis.upi.ack.FxListType fxList)
    {
        this._fxList = fxList;
    } //-- void setFxList(com.gov.nha.bis.upi.ack.FxListType) 

    /**
     * Sets the value of field 'info'.
     * 
     * @param info the value of field 'info'.
     */
    public void setInfo(com.gov.nha.bis.upi.ack.InfoType info)
    {
        this._info = info;
    } //-- void setInfo(com.gov.nha.bis.upi.ack.InfoType) 

    /**
     * Sets the value of field 'institution'.
     * 
     * @param institution the value of field 'institution'.
     */
    public void setInstitution(com.gov.nha.bis.upi.ack.InstitutionType institution)
    {
        this._institution = institution;
    } //-- void setInstitution(com.gov.nha.bis.upi.ack.InstitutionType) 

    /**
     * Sets the value of field 'merchant'.
     * 
     * @param merchant the value of field 'merchant'.
     */
    public void setMerchant(com.gov.nha.bis.upi.ack.MerchantType merchant)
    {
        this._merchant = merchant;
    } //-- void setMerchant(com.gov.nha.bis.upi.ack.MerchantType) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

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
     * Sets the value of field 'reqIdDetails'.
     * 
     * @param reqIdDetails the value of field 'reqIdDetails'.
     */
    public void setReqIdDetails(com.gov.nha.bis.upi.ack.ReqIdDetails reqIdDetails)
    {
        this._reqIdDetails = reqIdDetails;
    } //-- void setReqIdDetails(com.gov.nha.bis.upi.ack.ReqIdDetails) 

    /**
     * Sets the value of field 'seqNum'.
     * 
     * @param seqNum the value of field 'seqNum'.
     */
    public void setSeqNum(java.lang.String seqNum)
    {
        this._seqNum = seqNum;
    } //-- void setSeqNum(java.lang.String) 

    /**
     * Sets the value of field 'ts'.
     * 
     * @param ts the value of field 'ts'.
     */
    public void setTs(java.lang.String ts)
    {
        this._ts = ts;
    } //-- void setTs(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.PayerConstant type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.PayerConstant) 

    /**
     * Method unmarshalPayeeType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalPayeeType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.PayeeType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.PayeeType.class, reader);
    } //-- java.lang.Object unmarshalPayeeType(java.io.Reader) 

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
