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
 * Class ComplaintType.
 * 
 * @version $Revision$ $Date$
 */
public class ComplaintType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reqAdjFlag
     */
    private com.gov.nha.bis.upi.ack.types.AdjFlagType _reqAdjFlag;

    /**
     * Field _reqAdjCode
     */
    private java.lang.String _reqAdjCode;

    /**
     * Field _reqAdjAmount
     */
    private java.lang.String _reqAdjAmount;

    /**
     * Field _orgSettRespCode
     */
    private java.lang.String _orgSettRespCode;

    /**
     * Field _currCycle
     */
    private java.lang.String _currCycle;

    /**
     * Field _creds
     */
    private com.gov.nha.bis.upi.ack.CredsType _creds;


      //----------------/
     //- Constructors -/
    //----------------/

    public ComplaintType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.ComplaintType()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'currCycle'.
     * 
     * @return String
     * @return the value of field 'currCycle'.
     */
    public java.lang.String getCurrCycle()
    {
        return this._currCycle;
    } //-- java.lang.String getCurrCycle() 

    /**
     * Returns the value of field 'orgSettRespCode'.
     * 
     * @return String
     * @return the value of field 'orgSettRespCode'.
     */
    public java.lang.String getOrgSettRespCode()
    {
        return this._orgSettRespCode;
    } //-- java.lang.String getOrgSettRespCode() 

    /**
     * Returns the value of field 'reqAdjAmount'.
     * 
     * @return String
     * @return the value of field 'reqAdjAmount'.
     */
    public java.lang.String getReqAdjAmount()
    {
        return this._reqAdjAmount;
    } //-- java.lang.String getReqAdjAmount() 

    /**
     * Returns the value of field 'reqAdjCode'.
     * 
     * @return String
     * @return the value of field 'reqAdjCode'.
     */
    public java.lang.String getReqAdjCode()
    {
        return this._reqAdjCode;
    } //-- java.lang.String getReqAdjCode() 

    /**
     * Returns the value of field 'reqAdjFlag'.
     * 
     * @return AdjFlagType
     * @return the value of field 'reqAdjFlag'.
     */
    public com.gov.nha.bis.upi.ack.types.AdjFlagType getReqAdjFlag()
    {
        return this._reqAdjFlag;
    } //-- com.gov.nha.bis.upi.ack.types.AdjFlagType getReqAdjFlag() 

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
     * Sets the value of field 'creds'.
     * 
     * @param creds the value of field 'creds'.
     */
    public void setCreds(com.gov.nha.bis.upi.ack.CredsType creds)
    {
        this._creds = creds;
    } //-- void setCreds(com.gov.nha.bis.upi.ack.CredsType) 

    /**
     * Sets the value of field 'currCycle'.
     * 
     * @param currCycle the value of field 'currCycle'.
     */
    public void setCurrCycle(java.lang.String currCycle)
    {
        this._currCycle = currCycle;
    } //-- void setCurrCycle(java.lang.String) 

    /**
     * Sets the value of field 'orgSettRespCode'.
     * 
     * @param orgSettRespCode the value of field 'orgSettRespCode'.
     */
    public void setOrgSettRespCode(java.lang.String orgSettRespCode)
    {
        this._orgSettRespCode = orgSettRespCode;
    } //-- void setOrgSettRespCode(java.lang.String) 

    /**
     * Sets the value of field 'reqAdjAmount'.
     * 
     * @param reqAdjAmount the value of field 'reqAdjAmount'.
     */
    public void setReqAdjAmount(java.lang.String reqAdjAmount)
    {
        this._reqAdjAmount = reqAdjAmount;
    } //-- void setReqAdjAmount(java.lang.String) 

    /**
     * Sets the value of field 'reqAdjCode'.
     * 
     * @param reqAdjCode the value of field 'reqAdjCode'.
     */
    public void setReqAdjCode(java.lang.String reqAdjCode)
    {
        this._reqAdjCode = reqAdjCode;
    } //-- void setReqAdjCode(java.lang.String) 

    /**
     * Sets the value of field 'reqAdjFlag'.
     * 
     * @param reqAdjFlag the value of field 'reqAdjFlag'.
     */
    public void setReqAdjFlag(com.gov.nha.bis.upi.ack.types.AdjFlagType reqAdjFlag)
    {
        this._reqAdjFlag = reqAdjFlag;
    } //-- void setReqAdjFlag(com.gov.nha.bis.upi.ack.types.AdjFlagType) 

    /**
     * Method unmarshalComplaintType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalComplaintType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.ComplaintType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.ComplaintType.class, reader);
    } //-- java.lang.Object unmarshalComplaintType(java.io.Reader) 

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
