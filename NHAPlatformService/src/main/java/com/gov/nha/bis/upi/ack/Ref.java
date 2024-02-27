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

import com.gov.nha.bis.upi.ack.types.AdjFlagType;
import com.gov.nha.bis.upi.ack.types.ListedAccountType;
import com.gov.nha.bis.upi.ack.types.PayConstant;
import com.gov.nha.bis.upi.ack.types.RefProcStatus;
import com.gov.nha.bis.upi.ack.types.RefType;
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
 * Class Ref.
 * 
 * @version $Revision$ $Date$
 */
public class Ref implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.RefType _type;

    /**
     * Field _seqNum
     */
    private java.lang.String _seqNum;

    /**
     * Field _addr
     */
    private java.lang.String _addr;

    /**
     * Field _settAmount
     */
    private java.lang.String _settAmount;

    /**
     * Field _settCurrency
     */
    private java.lang.String _settCurrency;

    /**
     * Field _approvalNum
     */
    private java.lang.String _approvalNum;

    /**
     * Field _respCode
     */
    private java.lang.String _respCode;

    /**
     * Field _regName
     */
    private java.lang.String _regName;

    /**
     * Field _reversalRespCode
     */
    private java.lang.String _reversalRespCode;

    /**
     * Field _orgAmount
     */
    private java.lang.String _orgAmount;

    /**
     * Field _acNum
     */
    private java.lang.String _acNum;

    /**
     * Field _IFSC
     */
    private java.lang.String _IFSC;

    /**
     * Field _code
     */
    private java.lang.String _code;

    /**
     * Field _actn
     */
    private java.lang.String _actn;

    /**
     * Field _accType
     */
    private com.gov.nha.bis.upi.ack.types.ListedAccountType _accType;

    /**
     * Field _opType
     */
    private com.gov.nha.bis.upi.ack.types.PayConstant _opType;

    /**
     * Field _iin
     */
    private java.lang.String _iin;

    /**
     * Field _respMsg
     */
    private java.lang.String _respMsg;

    /**
     * Field _bankName
     */
    private java.lang.String _bankName;

    /**
     * Field _linkStatus
     */
    private java.lang.String _linkStatus;

    /**
     * Field _lastUpdTs
     */
    private java.lang.String _lastUpdTs;

    /**
     * Field _balAmt
     */
    private java.lang.String _balAmt;

    /**
     * Field _procStatus
     */
    private com.gov.nha.bis.upi.ack.types.RefProcStatus _procStatus;

    /**
     * Field _adjAmt
     */
    private java.lang.String _adjAmt;

    /**
     * Field _adjTs
     */
    private java.lang.String _adjTs;

    /**
     * Field _adjRefId
     */
    private java.lang.String _adjRefId;

    /**
     * Field _adjFlag
     */
    private com.gov.nha.bis.upi.ack.types.AdjFlagType _adjFlag;

    /**
     * Field _adjCode
     */
    private java.lang.String _adjCode;

    /**
     * Field _adjRemarks
     */
    private java.lang.String _adjRemarks;

    /**
     * Field _rejReason
     */
    private java.lang.String _rejReason;

    /**
     * Field _cmId
     */
    private java.lang.String _cmId;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ref() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.Ref()


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
     * Returns the value of field 'adjAmt'.
     * 
     * @return String
     * @return the value of field 'adjAmt'.
     */
    public java.lang.String getAdjAmt()
    {
        return this._adjAmt;
    } //-- java.lang.String getAdjAmt() 

    /**
     * Returns the value of field 'adjCode'.
     * 
     * @return String
     * @return the value of field 'adjCode'.
     */
    public java.lang.String getAdjCode()
    {
        return this._adjCode;
    } //-- java.lang.String getAdjCode() 

    /**
     * Returns the value of field 'adjFlag'.
     * 
     * @return AdjFlagType
     * @return the value of field 'adjFlag'.
     */
    public com.gov.nha.bis.upi.ack.types.AdjFlagType getAdjFlag()
    {
        return this._adjFlag;
    } //-- com.gov.nha.bis.upi.ack.types.AdjFlagType getAdjFlag() 

    /**
     * Returns the value of field 'adjRefId'.
     * 
     * @return String
     * @return the value of field 'adjRefId'.
     */
    public java.lang.String getAdjRefId()
    {
        return this._adjRefId;
    } //-- java.lang.String getAdjRefId() 

    /**
     * Returns the value of field 'adjRemarks'.
     * 
     * @return String
     * @return the value of field 'adjRemarks'.
     */
    public java.lang.String getAdjRemarks()
    {
        return this._adjRemarks;
    } //-- java.lang.String getAdjRemarks() 

    /**
     * Returns the value of field 'adjTs'.
     * 
     * @return String
     * @return the value of field 'adjTs'.
     */
    public java.lang.String getAdjTs()
    {
        return this._adjTs;
    } //-- java.lang.String getAdjTs() 

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
     * Returns the value of field 'balAmt'.
     * 
     * @return String
     * @return the value of field 'balAmt'.
     */
    public java.lang.String getBalAmt()
    {
        return this._balAmt;
    } //-- java.lang.String getBalAmt() 

    /**
     * Returns the value of field 'bankName'.
     * 
     * @return String
     * @return the value of field 'bankName'.
     */
    public java.lang.String getBankName()
    {
        return this._bankName;
    } //-- java.lang.String getBankName() 

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
     * Returns the value of field 'iin'.
     * 
     * @return String
     * @return the value of field 'iin'.
     */
    public java.lang.String getIin()
    {
        return this._iin;
    } //-- java.lang.String getIin() 

    /**
     * Returns the value of field 'lastUpdTs'.
     * 
     * @return String
     * @return the value of field 'lastUpdTs'.
     */
    public java.lang.String getLastUpdTs()
    {
        return this._lastUpdTs;
    } //-- java.lang.String getLastUpdTs() 

    /**
     * Returns the value of field 'linkStatus'.
     * 
     * @return String
     * @return the value of field 'linkStatus'.
     */
    public java.lang.String getLinkStatus()
    {
        return this._linkStatus;
    } //-- java.lang.String getLinkStatus() 

    /**
     * Returns the value of field 'opType'.
     * 
     * @return PayConstant
     * @return the value of field 'opType'.
     */
    public com.gov.nha.bis.upi.ack.types.PayConstant getOpType()
    {
        return this._opType;
    } //-- com.gov.nha.bis.upi.ack.types.PayConstant getOpType() 

    /**
     * Returns the value of field 'orgAmount'.
     * 
     * @return String
     * @return the value of field 'orgAmount'.
     */
    public java.lang.String getOrgAmount()
    {
        return this._orgAmount;
    } //-- java.lang.String getOrgAmount() 

    /**
     * Returns the value of field 'procStatus'.
     * 
     * @return RefProcStatus
     * @return the value of field 'procStatus'.
     */
    public com.gov.nha.bis.upi.ack.types.RefProcStatus getProcStatus()
    {
        return this._procStatus;
    } //-- com.gov.nha.bis.upi.ack.types.RefProcStatus getProcStatus() 

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
     * Returns the value of field 'rejReason'.
     * 
     * @return String
     * @return the value of field 'rejReason'.
     */
    public java.lang.String getRejReason()
    {
        return this._rejReason;
    } //-- java.lang.String getRejReason() 

    /**
     * Returns the value of field 'respCode'.
     * 
     * @return String
     * @return the value of field 'respCode'.
     */
    public java.lang.String getRespCode()
    {
        return this._respCode;
    } //-- java.lang.String getRespCode() 

    /**
     * Returns the value of field 'respMsg'.
     * 
     * @return String
     * @return the value of field 'respMsg'.
     */
    public java.lang.String getRespMsg()
    {
        return this._respMsg;
    } //-- java.lang.String getRespMsg() 

    /**
     * Returns the value of field 'reversalRespCode'.
     * 
     * @return String
     * @return the value of field 'reversalRespCode'.
     */
    public java.lang.String getReversalRespCode()
    {
        return this._reversalRespCode;
    } //-- java.lang.String getReversalRespCode() 

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
     * Returns the value of field 'settAmount'.
     * 
     * @return String
     * @return the value of field 'settAmount'.
     */
    public java.lang.String getSettAmount()
    {
        return this._settAmount;
    } //-- java.lang.String getSettAmount() 

    /**
     * Returns the value of field 'settCurrency'.
     * 
     * @return String
     * @return the value of field 'settCurrency'.
     */
    public java.lang.String getSettCurrency()
    {
        return this._settCurrency;
    } //-- java.lang.String getSettCurrency() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return RefType
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.RefType getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.RefType getType() 

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
     * Sets the value of field 'adjAmt'.
     * 
     * @param adjAmt the value of field 'adjAmt'.
     */
    public void setAdjAmt(java.lang.String adjAmt)
    {
        this._adjAmt = adjAmt;
    } //-- void setAdjAmt(java.lang.String) 

    /**
     * Sets the value of field 'adjCode'.
     * 
     * @param adjCode the value of field 'adjCode'.
     */
    public void setAdjCode(java.lang.String adjCode)
    {
        this._adjCode = adjCode;
    } //-- void setAdjCode(java.lang.String) 

    /**
     * Sets the value of field 'adjFlag'.
     * 
     * @param adjFlag the value of field 'adjFlag'.
     */
    public void setAdjFlag(com.gov.nha.bis.upi.ack.types.AdjFlagType adjFlag)
    {
        this._adjFlag = adjFlag;
    } //-- void setAdjFlag(com.gov.nha.bis.upi.ack.types.AdjFlagType) 

    /**
     * Sets the value of field 'adjRefId'.
     * 
     * @param adjRefId the value of field 'adjRefId'.
     */
    public void setAdjRefId(java.lang.String adjRefId)
    {
        this._adjRefId = adjRefId;
    } //-- void setAdjRefId(java.lang.String) 

    /**
     * Sets the value of field 'adjRemarks'.
     * 
     * @param adjRemarks the value of field 'adjRemarks'.
     */
    public void setAdjRemarks(java.lang.String adjRemarks)
    {
        this._adjRemarks = adjRemarks;
    } //-- void setAdjRemarks(java.lang.String) 

    /**
     * Sets the value of field 'adjTs'.
     * 
     * @param adjTs the value of field 'adjTs'.
     */
    public void setAdjTs(java.lang.String adjTs)
    {
        this._adjTs = adjTs;
    } //-- void setAdjTs(java.lang.String) 

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
     * Sets the value of field 'balAmt'.
     * 
     * @param balAmt the value of field 'balAmt'.
     */
    public void setBalAmt(java.lang.String balAmt)
    {
        this._balAmt = balAmt;
    } //-- void setBalAmt(java.lang.String) 

    /**
     * Sets the value of field 'bankName'.
     * 
     * @param bankName the value of field 'bankName'.
     */
    public void setBankName(java.lang.String bankName)
    {
        this._bankName = bankName;
    } //-- void setBankName(java.lang.String) 

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
     * Sets the value of field 'IFSC'.
     * 
     * @param IFSC the value of field 'IFSC'.
     */
    public void setIFSC(java.lang.String IFSC)
    {
        this._IFSC = IFSC;
    } //-- void setIFSC(java.lang.String) 

    /**
     * Sets the value of field 'iin'.
     * 
     * @param iin the value of field 'iin'.
     */
    public void setIin(java.lang.String iin)
    {
        this._iin = iin;
    } //-- void setIin(java.lang.String) 

    /**
     * Sets the value of field 'lastUpdTs'.
     * 
     * @param lastUpdTs the value of field 'lastUpdTs'.
     */
    public void setLastUpdTs(java.lang.String lastUpdTs)
    {
        this._lastUpdTs = lastUpdTs;
    } //-- void setLastUpdTs(java.lang.String) 

    /**
     * Sets the value of field 'linkStatus'.
     * 
     * @param linkStatus the value of field 'linkStatus'.
     */
    public void setLinkStatus(java.lang.String linkStatus)
    {
        this._linkStatus = linkStatus;
    } //-- void setLinkStatus(java.lang.String) 

    /**
     * Sets the value of field 'opType'.
     * 
     * @param opType the value of field 'opType'.
     */
    public void setOpType(com.gov.nha.bis.upi.ack.types.PayConstant opType)
    {
        this._opType = opType;
    } //-- void setOpType(com.gov.nha.bis.upi.ack.types.PayConstant) 

    /**
     * Sets the value of field 'orgAmount'.
     * 
     * @param orgAmount the value of field 'orgAmount'.
     */
    public void setOrgAmount(java.lang.String orgAmount)
    {
        this._orgAmount = orgAmount;
    } //-- void setOrgAmount(java.lang.String) 

    /**
     * Sets the value of field 'procStatus'.
     * 
     * @param procStatus the value of field 'procStatus'.
     */
    public void setProcStatus(com.gov.nha.bis.upi.ack.types.RefProcStatus procStatus)
    {
        this._procStatus = procStatus;
    } //-- void setProcStatus(com.gov.nha.bis.upi.ack.types.RefProcStatus) 

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
     * Sets the value of field 'rejReason'.
     * 
     * @param rejReason the value of field 'rejReason'.
     */
    public void setRejReason(java.lang.String rejReason)
    {
        this._rejReason = rejReason;
    } //-- void setRejReason(java.lang.String) 

    /**
     * Sets the value of field 'respCode'.
     * 
     * @param respCode the value of field 'respCode'.
     */
    public void setRespCode(java.lang.String respCode)
    {
        this._respCode = respCode;
    } //-- void setRespCode(java.lang.String) 

    /**
     * Sets the value of field 'respMsg'.
     * 
     * @param respMsg the value of field 'respMsg'.
     */
    public void setRespMsg(java.lang.String respMsg)
    {
        this._respMsg = respMsg;
    } //-- void setRespMsg(java.lang.String) 

    /**
     * Sets the value of field 'reversalRespCode'.
     * 
     * @param reversalRespCode the value of field 'reversalRespCode'
     */
    public void setReversalRespCode(java.lang.String reversalRespCode)
    {
        this._reversalRespCode = reversalRespCode;
    } //-- void setReversalRespCode(java.lang.String) 

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
     * Sets the value of field 'settAmount'.
     * 
     * @param settAmount the value of field 'settAmount'.
     */
    public void setSettAmount(java.lang.String settAmount)
    {
        this._settAmount = settAmount;
    } //-- void setSettAmount(java.lang.String) 

    /**
     * Sets the value of field 'settCurrency'.
     * 
     * @param settCurrency the value of field 'settCurrency'.
     */
    public void setSettCurrency(java.lang.String settCurrency)
    {
        this._settCurrency = settCurrency;
    } //-- void setSettCurrency(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.RefType type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.RefType) 

    /**
     * Method unmarshalRef
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRef(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.Ref) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.Ref.class, reader);
    } //-- java.lang.Object unmarshalRef(java.io.Reader) 

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
