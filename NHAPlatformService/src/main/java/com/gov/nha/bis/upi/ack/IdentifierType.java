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

import com.gov.nha.bis.upi.ack.types.MerchantGenreType;
import com.gov.nha.bis.upi.ack.types.MerchantIdentifierType;
import com.gov.nha.bis.upi.ack.types.MerchantOnBoardingType;
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
 * Class IdentifierType.
 * 
 * @version $Revision$ $Date$
 */
public class IdentifierType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _subCode
     */
    private java.lang.String _subCode;

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
     * Field _merchantType
     */
    private com.gov.nha.bis.upi.ack.types.MerchantIdentifierType _merchantType;

    /**
     * Field _merchantGenre
     */
    private com.gov.nha.bis.upi.ack.types.MerchantGenreType _merchantGenre;

    /**
     * Field _onBoardingType
     */
    private com.gov.nha.bis.upi.ack.types.MerchantOnBoardingType _onBoardingType;

    /**
     * Field _regId
     */
    private java.lang.String _regId;

    /**
     * Field _pinCode
     */
    private java.lang.String _pinCode;

    /**
     * Field _tier
     */
    private java.lang.String _tier;

    /**
     * Field _merchantLoc
     */
    private java.lang.String _merchantLoc;

    /**
     * Field _merchantInstCode
     */
    private java.lang.String _merchantInstCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public IdentifierType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.IdentifierType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'merchantGenre'.
     * 
     * @return MerchantGenreType
     * @return the value of field 'merchantGenre'.
     */
    public com.gov.nha.bis.upi.ack.types.MerchantGenreType getMerchantGenre()
    {
        return this._merchantGenre;
    } //-- com.gov.nha.bis.upi.ack.types.MerchantGenreType getMerchantGenre() 

    /**
     * Returns the value of field 'merchantInstCode'.
     * 
     * @return String
     * @return the value of field 'merchantInstCode'.
     */
    public java.lang.String getMerchantInstCode()
    {
        return this._merchantInstCode;
    } //-- java.lang.String getMerchantInstCode() 

    /**
     * Returns the value of field 'merchantLoc'.
     * 
     * @return String
     * @return the value of field 'merchantLoc'.
     */
    public java.lang.String getMerchantLoc()
    {
        return this._merchantLoc;
    } //-- java.lang.String getMerchantLoc() 

    /**
     * Returns the value of field 'merchantType'.
     * 
     * @return MerchantIdentifierType
     * @return the value of field 'merchantType'.
     */
    public com.gov.nha.bis.upi.ack.types.MerchantIdentifierType getMerchantType()
    {
        return this._merchantType;
    } //-- com.gov.nha.bis.upi.ack.types.MerchantIdentifierType getMerchantType() 

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
     * Returns the value of field 'onBoardingType'.
     * 
     * @return MerchantOnBoardingType
     * @return the value of field 'onBoardingType'.
     */
    public com.gov.nha.bis.upi.ack.types.MerchantOnBoardingType getOnBoardingType()
    {
        return this._onBoardingType;
    } //-- com.gov.nha.bis.upi.ack.types.MerchantOnBoardingType getOnBoardingType() 

    /**
     * Returns the value of field 'pinCode'.
     * 
     * @return String
     * @return the value of field 'pinCode'.
     */
    public java.lang.String getPinCode()
    {
        return this._pinCode;
    } //-- java.lang.String getPinCode() 

    /**
     * Returns the value of field 'regId'.
     * 
     * @return String
     * @return the value of field 'regId'.
     */
    public java.lang.String getRegId()
    {
        return this._regId;
    } //-- java.lang.String getRegId() 

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
     * Returns the value of field 'subCode'.
     * 
     * @return String
     * @return the value of field 'subCode'.
     */
    public java.lang.String getSubCode()
    {
        return this._subCode;
    } //-- java.lang.String getSubCode() 

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
     * Returns the value of field 'tier'.
     * 
     * @return String
     * @return the value of field 'tier'.
     */
    public java.lang.String getTier()
    {
        return this._tier;
    } //-- java.lang.String getTier() 

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
     * Sets the value of field 'merchantGenre'.
     * 
     * @param merchantGenre the value of field 'merchantGenre'.
     */
    public void setMerchantGenre(com.gov.nha.bis.upi.ack.types.MerchantGenreType merchantGenre)
    {
        this._merchantGenre = merchantGenre;
    } //-- void setMerchantGenre(com.gov.nha.bis.upi.ack.types.MerchantGenreType) 

    /**
     * Sets the value of field 'merchantInstCode'.
     * 
     * @param merchantInstCode the value of field 'merchantInstCode'
     */
    public void setMerchantInstCode(java.lang.String merchantInstCode)
    {
        this._merchantInstCode = merchantInstCode;
    } //-- void setMerchantInstCode(java.lang.String) 

    /**
     * Sets the value of field 'merchantLoc'.
     * 
     * @param merchantLoc the value of field 'merchantLoc'.
     */
    public void setMerchantLoc(java.lang.String merchantLoc)
    {
        this._merchantLoc = merchantLoc;
    } //-- void setMerchantLoc(java.lang.String) 

    /**
     * Sets the value of field 'merchantType'.
     * 
     * @param merchantType the value of field 'merchantType'.
     */
    public void setMerchantType(com.gov.nha.bis.upi.ack.types.MerchantIdentifierType merchantType)
    {
        this._merchantType = merchantType;
    } //-- void setMerchantType(com.gov.nha.bis.upi.ack.types.MerchantIdentifierType) 

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
     * Sets the value of field 'onBoardingType'.
     * 
     * @param onBoardingType the value of field 'onBoardingType'.
     */
    public void setOnBoardingType(com.gov.nha.bis.upi.ack.types.MerchantOnBoardingType onBoardingType)
    {
        this._onBoardingType = onBoardingType;
    } //-- void setOnBoardingType(com.gov.nha.bis.upi.ack.types.MerchantOnBoardingType) 

    /**
     * Sets the value of field 'pinCode'.
     * 
     * @param pinCode the value of field 'pinCode'.
     */
    public void setPinCode(java.lang.String pinCode)
    {
        this._pinCode = pinCode;
    } //-- void setPinCode(java.lang.String) 

    /**
     * Sets the value of field 'regId'.
     * 
     * @param regId the value of field 'regId'.
     */
    public void setRegId(java.lang.String regId)
    {
        this._regId = regId;
    } //-- void setRegId(java.lang.String) 

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
     * Sets the value of field 'subCode'.
     * 
     * @param subCode the value of field 'subCode'.
     */
    public void setSubCode(java.lang.String subCode)
    {
        this._subCode = subCode;
    } //-- void setSubCode(java.lang.String) 

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
     * Sets the value of field 'tier'.
     * 
     * @param tier the value of field 'tier'.
     */
    public void setTier(java.lang.String tier)
    {
        this._tier = tier;
    } //-- void setTier(java.lang.String) 

    /**
     * Method unmarshalIdentifierType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalIdentifierType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.IdentifierType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.IdentifierType.class, reader);
    } //-- java.lang.Object unmarshalIdentifierType(java.io.Reader) 

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
