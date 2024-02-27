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

import com.gov.nha.bis.upi.ack.types.ListedAccountType;
import com.gov.nha.bis.upi.ack.types.RespPType;
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
 * Class RespTypeValAddr.
 * 
 * @version $Revision$ $Date$
 */
public class RespTypeValAddr implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reqMsgId
     */
    private java.lang.String _reqMsgId;

    /**
     * Field _result
     */
    private java.lang.String _result;

    /**
     * Field _errCode
     */
    private java.lang.String _errCode;

    /**
     * Field _maskName
     */
    private java.lang.String _maskName;

    /**
     * Field _code
     */
    private java.lang.String _code;

    /**
     * Field _type
     */
    private java.lang.String _type;

    /**
     * Field _IFSC
     */
    private java.lang.String _IFSC;

    /**
     * Field _IIN
     */
    private java.lang.String _IIN;

    /**
     * Field _pType
     */
    private com.gov.nha.bis.upi.ack.types.RespPType _pType;

    /**
     * Field _accType
     */
    private com.gov.nha.bis.upi.ack.types.ListedAccountType _accType;

    /**
     * Field _acNum
     */
    private java.lang.String _acNum;

    /**
     * Field _approvalNum
     */
    private java.lang.String _approvalNum;

    /**
     * Field _actn
     */
    private java.lang.String _actn;

    /**
     * Field _authCode
     */
    private java.lang.String _authCode;

    /**
     * Field _cmId
     */
    private java.lang.String _cmId;

    /**
     * Field _addr
     */
    private java.lang.String _addr;

    /**
     * Field _channel
     */
    private java.lang.String _channel;

    /**
     * Field _merchant
     */
    private com.gov.nha.bis.upi.ack.MerchantType _merchant;

    /**
     * Field _featureSupported
     */
    private com.gov.nha.bis.upi.ack.FeatureSupported _featureSupported;

    /**
     * Field _amount
     */
    private com.gov.nha.bis.upi.ack.AmountType _amount;


      //----------------/
     //- Constructors -/
    //----------------/

    public RespTypeValAddr() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.RespTypeValAddr()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acNum'.
     * 
     * @return String
     * @return the value of field 'acNum'.
     */
    public java.lang.String getAcNum()
    {
        return this._acNum;
    } //-- java.lang.String getAcNum() 

    /**
     * Returns the value of field 'accType'.
     * 
     * @return ListedAccountType
     * @return the value of field 'accType'.
     */
    public com.gov.nha.bis.upi.ack.types.ListedAccountType getAccType()
    {
        return this._accType;
    } //-- com.gov.nha.bis.upi.ack.types.ListedAccountType getAccType() 

    /**
     * Returns the value of field 'actn'.
     * 
     * @return String
     * @return the value of field 'actn'.
     */
    public java.lang.String getActn()
    {
        return this._actn;
    } //-- java.lang.String getActn() 

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
     * Returns the value of field 'authCode'.
     * 
     * @return String
     * @return the value of field 'authCode'.
     */
    public java.lang.String getAuthCode()
    {
        return this._authCode;
    } //-- java.lang.String getAuthCode() 

    /**
     * Returns the value of field 'channel'.
     * 
     * @return String
     * @return the value of field 'channel'.
     */
    public java.lang.String getChannel()
    {
        return this._channel;
    } //-- java.lang.String getChannel() 

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
     * Returns the value of field 'errCode'.
     * 
     * @return String
     * @return the value of field 'errCode'.
     */
    public java.lang.String getErrCode()
    {
        return this._errCode;
    } //-- java.lang.String getErrCode() 

    /**
     * Returns the value of field 'featureSupported'.
     * 
     * @return FeatureSupported
     * @return the value of field 'featureSupported'.
     */
    public com.gov.nha.bis.upi.ack.FeatureSupported getFeatureSupported()
    {
        return this._featureSupported;
    } //-- com.gov.nha.bis.upi.ack.FeatureSupported getFeatureSupported() 

    /**
     * Returns the value of field 'IFSC'.
     * 
     * @return String
     * @return the value of field 'IFSC'.
     */
    public java.lang.String getIFSC()
    {
        return this._IFSC;
    } //-- java.lang.String getIFSC() 

    /**
     * Returns the value of field 'IIN'.
     * 
     * @return String
     * @return the value of field 'IIN'.
     */
    public java.lang.String getIIN()
    {
        return this._IIN;
    } //-- java.lang.String getIIN() 

    /**
     * Returns the value of field 'maskName'.
     * 
     * @return String
     * @return the value of field 'maskName'.
     */
    public java.lang.String getMaskName()
    {
        return this._maskName;
    } //-- java.lang.String getMaskName() 

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
     * Returns the value of field 'pType'.
     * 
     * @return RespPType
     * @return the value of field 'pType'.
     */
    public com.gov.nha.bis.upi.ack.types.RespPType getPType()
    {
        return this._pType;
    } //-- com.gov.nha.bis.upi.ack.types.RespPType getPType() 

    /**
     * Returns the value of field 'reqMsgId'.
     * 
     * @return String
     * @return the value of field 'reqMsgId'.
     */
    public java.lang.String getReqMsgId()
    {
        return this._reqMsgId;
    } //-- java.lang.String getReqMsgId() 

    /**
     * Returns the value of field 'result'.
     * 
     * @return String
     * @return the value of field 'result'.
     */
    public java.lang.String getResult()
    {
        return this._result;
    } //-- java.lang.String getResult() 

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
     * Sets the value of field 'acNum'.
     * 
     * @param acNum the value of field 'acNum'.
     */
    public void setAcNum(java.lang.String acNum)
    {
        this._acNum = acNum;
    } //-- void setAcNum(java.lang.String) 

    /**
     * Sets the value of field 'accType'.
     * 
     * @param accType the value of field 'accType'.
     */
    public void setAccType(com.gov.nha.bis.upi.ack.types.ListedAccountType accType)
    {
        this._accType = accType;
    } //-- void setAccType(com.gov.nha.bis.upi.ack.types.ListedAccountType) 

    /**
     * Sets the value of field 'actn'.
     * 
     * @param actn the value of field 'actn'.
     */
    public void setActn(java.lang.String actn)
    {
        this._actn = actn;
    } //-- void setActn(java.lang.String) 

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
     * Sets the value of field 'approvalNum'.
     * 
     * @param approvalNum the value of field 'approvalNum'.
     */
    public void setApprovalNum(java.lang.String approvalNum)
    {
        this._approvalNum = approvalNum;
    } //-- void setApprovalNum(java.lang.String) 

    /**
     * Sets the value of field 'authCode'.
     * 
     * @param authCode the value of field 'authCode'.
     */
    public void setAuthCode(java.lang.String authCode)
    {
        this._authCode = authCode;
    } //-- void setAuthCode(java.lang.String) 

    /**
     * Sets the value of field 'channel'.
     * 
     * @param channel the value of field 'channel'.
     */
    public void setChannel(java.lang.String channel)
    {
        this._channel = channel;
    } //-- void setChannel(java.lang.String) 

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
     * Sets the value of field 'errCode'.
     * 
     * @param errCode the value of field 'errCode'.
     */
    public void setErrCode(java.lang.String errCode)
    {
        this._errCode = errCode;
    } //-- void setErrCode(java.lang.String) 

    /**
     * Sets the value of field 'featureSupported'.
     * 
     * @param featureSupported the value of field 'featureSupported'
     */
    public void setFeatureSupported(com.gov.nha.bis.upi.ack.FeatureSupported featureSupported)
    {
        this._featureSupported = featureSupported;
    } //-- void setFeatureSupported(com.gov.nha.bis.upi.ack.FeatureSupported) 

    /**
     * Sets the value of field 'IFSC'.
     * 
     * @param IFSC the value of field 'IFSC'.
     */
    public void setIFSC(java.lang.String IFSC)
    {
        this._IFSC = IFSC;
    } //-- void setIFSC(java.lang.String) 

    /**
     * Sets the value of field 'IIN'.
     * 
     * @param IIN the value of field 'IIN'.
     */
    public void setIIN(java.lang.String IIN)
    {
        this._IIN = IIN;
    } //-- void setIIN(java.lang.String) 

    /**
     * Sets the value of field 'maskName'.
     * 
     * @param maskName the value of field 'maskName'.
     */
    public void setMaskName(java.lang.String maskName)
    {
        this._maskName = maskName;
    } //-- void setMaskName(java.lang.String) 

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
     * Sets the value of field 'pType'.
     * 
     * @param pType the value of field 'pType'.
     */
    public void setPType(com.gov.nha.bis.upi.ack.types.RespPType pType)
    {
        this._pType = pType;
    } //-- void setPType(com.gov.nha.bis.upi.ack.types.RespPType) 

    /**
     * Sets the value of field 'reqMsgId'.
     * 
     * @param reqMsgId the value of field 'reqMsgId'.
     */
    public void setReqMsgId(java.lang.String reqMsgId)
    {
        this._reqMsgId = reqMsgId;
    } //-- void setReqMsgId(java.lang.String) 

    /**
     * Sets the value of field 'result'.
     * 
     * @param result the value of field 'result'.
     */
    public void setResult(java.lang.String result)
    {
        this._result = result;
    } //-- void setResult(java.lang.String) 

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
     * Method unmarshalRespTypeValAddr
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRespTypeValAddr(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RespTypeValAddr) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RespTypeValAddr.class, reader);
    } //-- java.lang.Object unmarshalRespTypeValAddr(java.io.Reader) 

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
