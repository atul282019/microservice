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
 * Class RespTypeValCust.
 * 
 * @version $Revision$ $Date$
 */
public class RespTypeValCust implements java.io.Serializable {


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
     * Field _respIdDetails
     */
    private com.gov.nha.bis.upi.ack.RespIdDetails _respIdDetails;

    /**
     * Field _amount
     */
    private com.gov.nha.bis.upi.ack.AmountType _amount;


      //----------------/
     //- Constructors -/
    //----------------/

    public RespTypeValCust() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.RespTypeValCust()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'respIdDetails'.
     * 
     * @return RespIdDetails
     * @return the value of field 'respIdDetails'.
     */
    public com.gov.nha.bis.upi.ack.RespIdDetails getRespIdDetails()
    {
        return this._respIdDetails;
    } //-- com.gov.nha.bis.upi.ack.RespIdDetails getRespIdDetails() 

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
     * Sets the value of field 'amount'.
     * 
     * @param amount the value of field 'amount'.
     */
    public void setAmount(com.gov.nha.bis.upi.ack.AmountType amount)
    {
        this._amount = amount;
    } //-- void setAmount(com.gov.nha.bis.upi.ack.AmountType) 

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
     * Sets the value of field 'reqMsgId'.
     * 
     * @param reqMsgId the value of field 'reqMsgId'.
     */
    public void setReqMsgId(java.lang.String reqMsgId)
    {
        this._reqMsgId = reqMsgId;
    } //-- void setReqMsgId(java.lang.String) 

    /**
     * Sets the value of field 'respIdDetails'.
     * 
     * @param respIdDetails the value of field 'respIdDetails'.
     */
    public void setRespIdDetails(com.gov.nha.bis.upi.ack.RespIdDetails respIdDetails)
    {
        this._respIdDetails = respIdDetails;
    } //-- void setRespIdDetails(com.gov.nha.bis.upi.ack.RespIdDetails) 

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
     * Method unmarshalRespTypeValCust
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRespTypeValCust(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RespTypeValCust) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RespTypeValCust.class, reader);
    } //-- java.lang.Object unmarshalRespTypeValCust(java.io.Reader) 

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
