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

import com.gov.nha.bis.upi.ack.types.ActionConstant;
import com.gov.nha.bis.upi.ack.types.DealtSideType;
import com.gov.nha.bis.upi.ack.types.DealtTypeType;
import com.gov.nha.bis.upi.ack.types.InitiatedByType;
import com.gov.nha.bis.upi.ack.types.InitiationModeCode;
import com.gov.nha.bis.upi.ack.types.OpType;
import com.gov.nha.bis.upi.ack.types.PayConstant;
import com.gov.nha.bis.upi.ack.types.TxnPurpose;
import com.gov.nha.bis.upi.ack.types.TxnRefCategory;
import com.gov.nha.bis.upi.ack.types.TxnSubType;
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
 * Class PayTrans.
 * 
 * @version $Revision$ $Date$
 */
public class PayTrans implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _id
     */
    private java.lang.String _id;

    /**
     * Field _note
     */
    private java.lang.String _note;

    /**
     * Field _successRefId
     */
    private java.lang.String _successRefId;

    /**
     * Field _successTs
     */
    private java.lang.String _successTs;

    /**
     * Field _refId
     */
    private java.lang.String _refId;

    /**
     * Field _refUrl
     */
    private java.lang.String _refUrl;

    /**
     * Field _ts
     */
    private java.lang.String _ts;

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.PayConstant _type;

    /**
     * Field _orgMsgId
     */
    private java.lang.String _orgMsgId;

    /**
     * Field _orgTxnId
     */
    private java.lang.String _orgTxnId;

    /**
     * Field _orgRespCode
     */
    private java.lang.String _orgRespCode;

    /**
     * Field _orgApprovalNum
     */
    private java.lang.String _orgApprovalNum;

    /**
     * Field _custRef
     */
    private java.lang.String _custRef;

    /**
     * Field _orgTxnDate
     */
    private java.lang.String _orgTxnDate;

    /**
     * Field _orgRrn
     */
    private java.lang.String _orgRrn;

    /**
     * Field _category
     */
    private java.lang.String _category;

    /**
     * Field _umn
     */
    private java.lang.String _umn;

    /**
     * Field _initiationMode
     */
    private com.gov.nha.bis.upi.ack.types.InitiationModeCode _initiationMode;

    /**
     * Field _subType
     */
    private com.gov.nha.bis.upi.ack.types.TxnSubType _subType;

    /**
     * Field _initiatedBy
     */
    private com.gov.nha.bis.upi.ack.types.InitiatedByType _initiatedBy;

    /**
     * Field _pspOrgId
     */
    private java.lang.String _pspOrgId;

    /**
     * Field _purpose
     */
    private com.gov.nha.bis.upi.ack.types.TxnPurpose _purpose;

    /**
     * Field _lastUpdTs
     */
    private java.lang.String _lastUpdTs;

    /**
     * Field _crtnTs
     */
    private java.lang.String _crtnTs;

    /**
     * Field _refCategory
     */
    private com.gov.nha.bis.upi.ack.types.TxnRefCategory _refCategory;

    /**
     * Field _action
     */
    private com.gov.nha.bis.upi.ack.types.ActionConstant _action;

    /**
     * Field _valStart
     */
    private java.lang.String _valStart;

    /**
     * Field _valEnd
     */
    private java.lang.String _valEnd;

    /**
     * Field _dealtType
     */
    private com.gov.nha.bis.upi.ack.types.DealtTypeType _dealtType;

    /**
     * Field _dealtSide
     */
    private com.gov.nha.bis.upi.ack.types.DealtSideType _dealtSide;

    /**
     * Field _umnExecTs
     */
    private java.lang.String _umnExecTs;

    /**
     * Field _orgRespMsg
     */
    private java.lang.String _orgRespMsg;

    /**
     * Field _depositId
     */
    private java.lang.String _depositId;

    /**
     * Field _orgTxnAmt
     */
    private java.lang.String _orgTxnAmt;

    /**
     * Field _op
     */
    private com.gov.nha.bis.upi.ack.types.OpType _op;

    /**
     * Field _addr
     */
    private java.lang.String _addr;

    /**
     * Field _shgId
     */
    private java.lang.String _shgId;

    /**
     * Field _riskScores
     */
    private com.gov.nha.bis.upi.ack.RiskScoresType _riskScores;

    /**
     * Field _rules
     */
    private com.gov.nha.bis.upi.ack.RulesType _rules;

    /**
     * Field _QR
     */
    private com.gov.nha.bis.upi.ack.QrType _QR;


      //----------------/
     //- Constructors -/
    //----------------/

    public PayTrans() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.PayTrans()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'action'.
     * 
     * @return ActionConstant
     * @return the value of field 'action'.
     */
    public com.gov.nha.bis.upi.ack.types.ActionConstant getAction()
    {
        return this._action;
    } //-- com.gov.nha.bis.upi.ack.types.ActionConstant getAction() 

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
     * Returns the value of field 'category'.
     * 
     * @return String
     * @return the value of field 'category'.
     */
    public java.lang.String getCategory()
    {
        return this._category;
    } //-- java.lang.String getCategory() 

    /**
     * Returns the value of field 'crtnTs'.
     * 
     * @return String
     * @return the value of field 'crtnTs'.
     */
    public java.lang.String getCrtnTs()
    {
        return this._crtnTs;
    } //-- java.lang.String getCrtnTs() 

    /**
     * Returns the value of field 'custRef'.
     * 
     * @return String
     * @return the value of field 'custRef'.
     */
    public java.lang.String getCustRef()
    {
        return this._custRef;
    } //-- java.lang.String getCustRef() 

    /**
     * Returns the value of field 'dealtSide'.
     * 
     * @return DealtSideType
     * @return the value of field 'dealtSide'.
     */
    public com.gov.nha.bis.upi.ack.types.DealtSideType getDealtSide()
    {
        return this._dealtSide;
    } //-- com.gov.nha.bis.upi.ack.types.DealtSideType getDealtSide() 

    /**
     * Returns the value of field 'dealtType'.
     * 
     * @return DealtTypeType
     * @return the value of field 'dealtType'.
     */
    public com.gov.nha.bis.upi.ack.types.DealtTypeType getDealtType()
    {
        return this._dealtType;
    } //-- com.gov.nha.bis.upi.ack.types.DealtTypeType getDealtType() 

    /**
     * Returns the value of field 'depositId'.
     * 
     * @return String
     * @return the value of field 'depositId'.
     */
    public java.lang.String getDepositId()
    {
        return this._depositId;
    } //-- java.lang.String getDepositId() 

    /**
     * Returns the value of field 'id'.
     * 
     * @return String
     * @return the value of field 'id'.
     */
    public java.lang.String getId()
    {
        return this._id;
    } //-- java.lang.String getId() 

    /**
     * Returns the value of field 'initiatedBy'.
     * 
     * @return InitiatedByType
     * @return the value of field 'initiatedBy'.
     */
    public com.gov.nha.bis.upi.ack.types.InitiatedByType getInitiatedBy()
    {
        return this._initiatedBy;
    } //-- com.gov.nha.bis.upi.ack.types.InitiatedByType getInitiatedBy() 

    /**
     * Returns the value of field 'initiationMode'.
     * 
     * @return InitiationModeCode
     * @return the value of field 'initiationMode'.
     */
    public com.gov.nha.bis.upi.ack.types.InitiationModeCode getInitiationMode()
    {
        return this._initiationMode;
    } //-- com.gov.nha.bis.upi.ack.types.InitiationModeCode getInitiationMode() 

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
     * Returns the value of field 'op'.
     * 
     * @return OpType
     * @return the value of field 'op'.
     */
    public com.gov.nha.bis.upi.ack.types.OpType getOp()
    {
        return this._op;
    } //-- com.gov.nha.bis.upi.ack.types.OpType getOp() 

    /**
     * Returns the value of field 'orgApprovalNum'.
     * 
     * @return String
     * @return the value of field 'orgApprovalNum'.
     */
    public java.lang.String getOrgApprovalNum()
    {
        return this._orgApprovalNum;
    } //-- java.lang.String getOrgApprovalNum() 

    /**
     * Returns the value of field 'orgMsgId'.
     * 
     * @return String
     * @return the value of field 'orgMsgId'.
     */
    public java.lang.String getOrgMsgId()
    {
        return this._orgMsgId;
    } //-- java.lang.String getOrgMsgId() 

    /**
     * Returns the value of field 'orgRespCode'.
     * 
     * @return String
     * @return the value of field 'orgRespCode'.
     */
    public java.lang.String getOrgRespCode()
    {
        return this._orgRespCode;
    } //-- java.lang.String getOrgRespCode() 

    /**
     * Returns the value of field 'orgRespMsg'.
     * 
     * @return String
     * @return the value of field 'orgRespMsg'.
     */
    public java.lang.String getOrgRespMsg()
    {
        return this._orgRespMsg;
    } //-- java.lang.String getOrgRespMsg() 

    /**
     * Returns the value of field 'orgRrn'.
     * 
     * @return String
     * @return the value of field 'orgRrn'.
     */
    public java.lang.String getOrgRrn()
    {
        return this._orgRrn;
    } //-- java.lang.String getOrgRrn() 

    /**
     * Returns the value of field 'orgTxnAmt'.
     * 
     * @return String
     * @return the value of field 'orgTxnAmt'.
     */
    public java.lang.String getOrgTxnAmt()
    {
        return this._orgTxnAmt;
    } //-- java.lang.String getOrgTxnAmt() 

    /**
     * Returns the value of field 'orgTxnDate'.
     * 
     * @return String
     * @return the value of field 'orgTxnDate'.
     */
    public java.lang.String getOrgTxnDate()
    {
        return this._orgTxnDate;
    } //-- java.lang.String getOrgTxnDate() 

    /**
     * Returns the value of field 'orgTxnId'.
     * 
     * @return String
     * @return the value of field 'orgTxnId'.
     */
    public java.lang.String getOrgTxnId()
    {
        return this._orgTxnId;
    } //-- java.lang.String getOrgTxnId() 

    /**
     * Returns the value of field 'pspOrgId'.
     * 
     * @return String
     * @return the value of field 'pspOrgId'.
     */
    public java.lang.String getPspOrgId()
    {
        return this._pspOrgId;
    } //-- java.lang.String getPspOrgId() 

    /**
     * Returns the value of field 'purpose'.
     * 
     * @return TxnPurpose
     * @return the value of field 'purpose'.
     */
    public com.gov.nha.bis.upi.ack.types.TxnPurpose getPurpose()
    {
        return this._purpose;
    } //-- com.gov.nha.bis.upi.ack.types.TxnPurpose getPurpose() 

    /**
     * Returns the value of field 'QR'.
     * 
     * @return QrType
     * @return the value of field 'QR'.
     */
    public com.gov.nha.bis.upi.ack.QrType getQR()
    {
        return this._QR;
    } //-- com.gov.nha.bis.upi.ack.QrType getQR() 

    /**
     * Returns the value of field 'refCategory'.
     * 
     * @return TxnRefCategory
     * @return the value of field 'refCategory'.
     */
    public com.gov.nha.bis.upi.ack.types.TxnRefCategory getRefCategory()
    {
        return this._refCategory;
    } //-- com.gov.nha.bis.upi.ack.types.TxnRefCategory getRefCategory() 

    /**
     * Returns the value of field 'refId'.
     * 
     * @return String
     * @return the value of field 'refId'.
     */
    public java.lang.String getRefId()
    {
        return this._refId;
    } //-- java.lang.String getRefId() 

    /**
     * Returns the value of field 'refUrl'.
     * 
     * @return String
     * @return the value of field 'refUrl'.
     */
    public java.lang.String getRefUrl()
    {
        return this._refUrl;
    } //-- java.lang.String getRefUrl() 

    /**
     * Returns the value of field 'riskScores'.
     * 
     * @return RiskScoresType
     * @return the value of field 'riskScores'.
     */
    public com.gov.nha.bis.upi.ack.RiskScoresType getRiskScores()
    {
        return this._riskScores;
    } //-- com.gov.nha.bis.upi.ack.RiskScoresType getRiskScores() 

    /**
     * Returns the value of field 'rules'.
     * 
     * @return RulesType
     * @return the value of field 'rules'.
     */
    public com.gov.nha.bis.upi.ack.RulesType getRules()
    {
        return this._rules;
    } //-- com.gov.nha.bis.upi.ack.RulesType getRules() 

    /**
     * Returns the value of field 'shgId'.
     * 
     * @return String
     * @return the value of field 'shgId'.
     */
    public java.lang.String getShgId()
    {
        return this._shgId;
    } //-- java.lang.String getShgId() 

    /**
     * Returns the value of field 'subType'.
     * 
     * @return TxnSubType
     * @return the value of field 'subType'.
     */
    public com.gov.nha.bis.upi.ack.types.TxnSubType getSubType()
    {
        return this._subType;
    } //-- com.gov.nha.bis.upi.ack.types.TxnSubType getSubType() 

    /**
     * Returns the value of field 'successRefId'.
     * 
     * @return String
     * @return the value of field 'successRefId'.
     */
    public java.lang.String getSuccessRefId()
    {
        return this._successRefId;
    } //-- java.lang.String getSuccessRefId() 

    /**
     * Returns the value of field 'successTs'.
     * 
     * @return String
     * @return the value of field 'successTs'.
     */
    public java.lang.String getSuccessTs()
    {
        return this._successTs;
    } //-- java.lang.String getSuccessTs() 

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
     * @return PayConstant
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.PayConstant getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.PayConstant getType() 

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
     * Returns the value of field 'umnExecTs'.
     * 
     * @return String
     * @return the value of field 'umnExecTs'.
     */
    public java.lang.String getUmnExecTs()
    {
        return this._umnExecTs;
    } //-- java.lang.String getUmnExecTs() 

    /**
     * Returns the value of field 'valEnd'.
     * 
     * @return String
     * @return the value of field 'valEnd'.
     */
    public java.lang.String getValEnd()
    {
        return this._valEnd;
    } //-- java.lang.String getValEnd() 

    /**
     * Returns the value of field 'valStart'.
     * 
     * @return String
     * @return the value of field 'valStart'.
     */
    public java.lang.String getValStart()
    {
        return this._valStart;
    } //-- java.lang.String getValStart() 

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
     * Sets the value of field 'action'.
     * 
     * @param action the value of field 'action'.
     */
    public void setAction(com.gov.nha.bis.upi.ack.types.ActionConstant action)
    {
        this._action = action;
    } //-- void setAction(com.gov.nha.bis.upi.ack.types.ActionConstant) 

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
     * Sets the value of field 'category'.
     * 
     * @param category the value of field 'category'.
     */
    public void setCategory(java.lang.String category)
    {
        this._category = category;
    } //-- void setCategory(java.lang.String) 

    /**
     * Sets the value of field 'crtnTs'.
     * 
     * @param crtnTs the value of field 'crtnTs'.
     */
    public void setCrtnTs(java.lang.String crtnTs)
    {
        this._crtnTs = crtnTs;
    } //-- void setCrtnTs(java.lang.String) 

    /**
     * Sets the value of field 'custRef'.
     * 
     * @param custRef the value of field 'custRef'.
     */
    public void setCustRef(java.lang.String custRef)
    {
        this._custRef = custRef;
    } //-- void setCustRef(java.lang.String) 

    /**
     * Sets the value of field 'dealtSide'.
     * 
     * @param dealtSide the value of field 'dealtSide'.
     */
    public void setDealtSide(com.gov.nha.bis.upi.ack.types.DealtSideType dealtSide)
    {
        this._dealtSide = dealtSide;
    } //-- void setDealtSide(com.gov.nha.bis.upi.ack.types.DealtSideType) 

    /**
     * Sets the value of field 'dealtType'.
     * 
     * @param dealtType the value of field 'dealtType'.
     */
    public void setDealtType(com.gov.nha.bis.upi.ack.types.DealtTypeType dealtType)
    {
        this._dealtType = dealtType;
    } //-- void setDealtType(com.gov.nha.bis.upi.ack.types.DealtTypeType) 

    /**
     * Sets the value of field 'depositId'.
     * 
     * @param depositId the value of field 'depositId'.
     */
    public void setDepositId(java.lang.String depositId)
    {
        this._depositId = depositId;
    } //-- void setDepositId(java.lang.String) 

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(java.lang.String id)
    {
        this._id = id;
    } //-- void setId(java.lang.String) 

    /**
     * Sets the value of field 'initiatedBy'.
     * 
     * @param initiatedBy the value of field 'initiatedBy'.
     */
    public void setInitiatedBy(com.gov.nha.bis.upi.ack.types.InitiatedByType initiatedBy)
    {
        this._initiatedBy = initiatedBy;
    } //-- void setInitiatedBy(com.gov.nha.bis.upi.ack.types.InitiatedByType) 

    /**
     * Sets the value of field 'initiationMode'.
     * 
     * @param initiationMode the value of field 'initiationMode'.
     */
    public void setInitiationMode(com.gov.nha.bis.upi.ack.types.InitiationModeCode initiationMode)
    {
        this._initiationMode = initiationMode;
    } //-- void setInitiationMode(com.gov.nha.bis.upi.ack.types.InitiationModeCode) 

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
     * Sets the value of field 'note'.
     * 
     * @param note the value of field 'note'.
     */
    public void setNote(java.lang.String note)
    {
        this._note = note;
    } //-- void setNote(java.lang.String) 

    /**
     * Sets the value of field 'op'.
     * 
     * @param op the value of field 'op'.
     */
    public void setOp(com.gov.nha.bis.upi.ack.types.OpType op)
    {
        this._op = op;
    } //-- void setOp(com.gov.nha.bis.upi.ack.types.OpType) 

    /**
     * Sets the value of field 'orgApprovalNum'.
     * 
     * @param orgApprovalNum the value of field 'orgApprovalNum'.
     */
    public void setOrgApprovalNum(java.lang.String orgApprovalNum)
    {
        this._orgApprovalNum = orgApprovalNum;
    } //-- void setOrgApprovalNum(java.lang.String) 

    /**
     * Sets the value of field 'orgMsgId'.
     * 
     * @param orgMsgId the value of field 'orgMsgId'.
     */
    public void setOrgMsgId(java.lang.String orgMsgId)
    {
        this._orgMsgId = orgMsgId;
    } //-- void setOrgMsgId(java.lang.String) 

    /**
     * Sets the value of field 'orgRespCode'.
     * 
     * @param orgRespCode the value of field 'orgRespCode'.
     */
    public void setOrgRespCode(java.lang.String orgRespCode)
    {
        this._orgRespCode = orgRespCode;
    } //-- void setOrgRespCode(java.lang.String) 

    /**
     * Sets the value of field 'orgRespMsg'.
     * 
     * @param orgRespMsg the value of field 'orgRespMsg'.
     */
    public void setOrgRespMsg(java.lang.String orgRespMsg)
    {
        this._orgRespMsg = orgRespMsg;
    } //-- void setOrgRespMsg(java.lang.String) 

    /**
     * Sets the value of field 'orgRrn'.
     * 
     * @param orgRrn the value of field 'orgRrn'.
     */
    public void setOrgRrn(java.lang.String orgRrn)
    {
        this._orgRrn = orgRrn;
    } //-- void setOrgRrn(java.lang.String) 

    /**
     * Sets the value of field 'orgTxnAmt'.
     * 
     * @param orgTxnAmt the value of field 'orgTxnAmt'.
     */
    public void setOrgTxnAmt(java.lang.String orgTxnAmt)
    {
        this._orgTxnAmt = orgTxnAmt;
    } //-- void setOrgTxnAmt(java.lang.String) 

    /**
     * Sets the value of field 'orgTxnDate'.
     * 
     * @param orgTxnDate the value of field 'orgTxnDate'.
     */
    public void setOrgTxnDate(java.lang.String orgTxnDate)
    {
        this._orgTxnDate = orgTxnDate;
    } //-- void setOrgTxnDate(java.lang.String) 

    /**
     * Sets the value of field 'orgTxnId'.
     * 
     * @param orgTxnId the value of field 'orgTxnId'.
     */
    public void setOrgTxnId(java.lang.String orgTxnId)
    {
        this._orgTxnId = orgTxnId;
    } //-- void setOrgTxnId(java.lang.String) 

    /**
     * Sets the value of field 'pspOrgId'.
     * 
     * @param pspOrgId the value of field 'pspOrgId'.
     */
    public void setPspOrgId(java.lang.String pspOrgId)
    {
        this._pspOrgId = pspOrgId;
    } //-- void setPspOrgId(java.lang.String) 

    /**
     * Sets the value of field 'purpose'.
     * 
     * @param purpose the value of field 'purpose'.
     */
    public void setPurpose(com.gov.nha.bis.upi.ack.types.TxnPurpose purpose)
    {
        this._purpose = purpose;
    } //-- void setPurpose(com.gov.nha.bis.upi.ack.types.TxnPurpose) 

    /**
     * Sets the value of field 'QR'.
     * 
     * @param QR the value of field 'QR'.
     */
    public void setQR(com.gov.nha.bis.upi.ack.QrType QR)
    {
        this._QR = QR;
    } //-- void setQR(com.gov.nha.bis.upi.ack.QrType) 

    /**
     * Sets the value of field 'refCategory'.
     * 
     * @param refCategory the value of field 'refCategory'.
     */
    public void setRefCategory(com.gov.nha.bis.upi.ack.types.TxnRefCategory refCategory)
    {
        this._refCategory = refCategory;
    } //-- void setRefCategory(com.gov.nha.bis.upi.ack.types.TxnRefCategory) 

    /**
     * Sets the value of field 'refId'.
     * 
     * @param refId the value of field 'refId'.
     */
    public void setRefId(java.lang.String refId)
    {
        this._refId = refId;
    } //-- void setRefId(java.lang.String) 

    /**
     * Sets the value of field 'refUrl'.
     * 
     * @param refUrl the value of field 'refUrl'.
     */
    public void setRefUrl(java.lang.String refUrl)
    {
        this._refUrl = refUrl;
    } //-- void setRefUrl(java.lang.String) 

    /**
     * Sets the value of field 'riskScores'.
     * 
     * @param riskScores the value of field 'riskScores'.
     */
    public void setRiskScores(com.gov.nha.bis.upi.ack.RiskScoresType riskScores)
    {
        this._riskScores = riskScores;
    } //-- void setRiskScores(com.gov.nha.bis.upi.ack.RiskScoresType) 

    /**
     * Sets the value of field 'rules'.
     * 
     * @param rules the value of field 'rules'.
     */
    public void setRules(com.gov.nha.bis.upi.ack.RulesType rules)
    {
        this._rules = rules;
    } //-- void setRules(com.gov.nha.bis.upi.ack.RulesType) 

    /**
     * Sets the value of field 'shgId'.
     * 
     * @param shgId the value of field 'shgId'.
     */
    public void setShgId(java.lang.String shgId)
    {
        this._shgId = shgId;
    } //-- void setShgId(java.lang.String) 

    /**
     * Sets the value of field 'subType'.
     * 
     * @param subType the value of field 'subType'.
     */
    public void setSubType(com.gov.nha.bis.upi.ack.types.TxnSubType subType)
    {
        this._subType = subType;
    } //-- void setSubType(com.gov.nha.bis.upi.ack.types.TxnSubType) 

    /**
     * Sets the value of field 'successRefId'.
     * 
     * @param successRefId the value of field 'successRefId'.
     */
    public void setSuccessRefId(java.lang.String successRefId)
    {
        this._successRefId = successRefId;
    } //-- void setSuccessRefId(java.lang.String) 

    /**
     * Sets the value of field 'successTs'.
     * 
     * @param successTs the value of field 'successTs'.
     */
    public void setSuccessTs(java.lang.String successTs)
    {
        this._successTs = successTs;
    } //-- void setSuccessTs(java.lang.String) 

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
    public void setType(com.gov.nha.bis.upi.ack.types.PayConstant type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.PayConstant) 

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
     * Sets the value of field 'umnExecTs'.
     * 
     * @param umnExecTs the value of field 'umnExecTs'.
     */
    public void setUmnExecTs(java.lang.String umnExecTs)
    {
        this._umnExecTs = umnExecTs;
    } //-- void setUmnExecTs(java.lang.String) 

    /**
     * Sets the value of field 'valEnd'.
     * 
     * @param valEnd the value of field 'valEnd'.
     */
    public void setValEnd(java.lang.String valEnd)
    {
        this._valEnd = valEnd;
    } //-- void setValEnd(java.lang.String) 

    /**
     * Sets the value of field 'valStart'.
     * 
     * @param valStart the value of field 'valStart'.
     */
    public void setValStart(java.lang.String valStart)
    {
        this._valStart = valStart;
    } //-- void setValStart(java.lang.String) 

    /**
     * Method unmarshalPayTrans
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalPayTrans(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.PayTrans) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.PayTrans.class, reader);
    } //-- java.lang.Object unmarshalPayTrans(java.io.Reader) 

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
