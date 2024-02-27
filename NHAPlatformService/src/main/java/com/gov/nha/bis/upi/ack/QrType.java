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
 * Class QrType.
 * 
 * @version $Revision$ $Date$
 */
public class QrType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qVer
     */
    private java.lang.String _qVer;

    /**
     * Field _ts
     */
    private java.lang.String _ts;

    /**
     * Field _qrMedium
     */
    private java.lang.String _qrMedium;

    /**
     * Field _expireTs
     */
    private java.lang.String _expireTs;

    /**
     * Field _query
     */
    private java.lang.String _query;

    /**
     * Field _verToken
     */
    private java.lang.String _verToken;

    /**
     * Field _stan
     */
    private java.lang.String _stan;

    /**
     * Field _acqInstCode
     */
    private java.lang.String _acqInstCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public QrType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.QrType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acqInstCode'.
     * 
     * @return String
     * @return the value of field 'acqInstCode'.
     */
    public java.lang.String getAcqInstCode()
    {
        return this._acqInstCode;
    } //-- java.lang.String getAcqInstCode() 

    /**
     * Returns the value of field 'expireTs'.
     * 
     * @return String
     * @return the value of field 'expireTs'.
     */
    public java.lang.String getExpireTs()
    {
        return this._expireTs;
    } //-- java.lang.String getExpireTs() 

    /**
     * Returns the value of field 'qVer'.
     * 
     * @return String
     * @return the value of field 'qVer'.
     */
    public java.lang.String getQVer()
    {
        return this._qVer;
    } //-- java.lang.String getQVer() 

    /**
     * Returns the value of field 'qrMedium'.
     * 
     * @return String
     * @return the value of field 'qrMedium'.
     */
    public java.lang.String getQrMedium()
    {
        return this._qrMedium;
    } //-- java.lang.String getQrMedium() 

    /**
     * Returns the value of field 'query'.
     * 
     * @return String
     * @return the value of field 'query'.
     */
    public java.lang.String getQuery()
    {
        return this._query;
    } //-- java.lang.String getQuery() 

    /**
     * Returns the value of field 'stan'.
     * 
     * @return String
     * @return the value of field 'stan'.
     */
    public java.lang.String getStan()
    {
        return this._stan;
    } //-- java.lang.String getStan() 

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
     * Returns the value of field 'verToken'.
     * 
     * @return String
     * @return the value of field 'verToken'.
     */
    public java.lang.String getVerToken()
    {
        return this._verToken;
    } //-- java.lang.String getVerToken() 

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
     * Sets the value of field 'acqInstCode'.
     * 
     * @param acqInstCode the value of field 'acqInstCode'.
     */
    public void setAcqInstCode(java.lang.String acqInstCode)
    {
        this._acqInstCode = acqInstCode;
    } //-- void setAcqInstCode(java.lang.String) 

    /**
     * Sets the value of field 'expireTs'.
     * 
     * @param expireTs the value of field 'expireTs'.
     */
    public void setExpireTs(java.lang.String expireTs)
    {
        this._expireTs = expireTs;
    } //-- void setExpireTs(java.lang.String) 

    /**
     * Sets the value of field 'qVer'.
     * 
     * @param qVer the value of field 'qVer'.
     */
    public void setQVer(java.lang.String qVer)
    {
        this._qVer = qVer;
    } //-- void setQVer(java.lang.String) 

    /**
     * Sets the value of field 'qrMedium'.
     * 
     * @param qrMedium the value of field 'qrMedium'.
     */
    public void setQrMedium(java.lang.String qrMedium)
    {
        this._qrMedium = qrMedium;
    } //-- void setQrMedium(java.lang.String) 

    /**
     * Sets the value of field 'query'.
     * 
     * @param query the value of field 'query'.
     */
    public void setQuery(java.lang.String query)
    {
        this._query = query;
    } //-- void setQuery(java.lang.String) 

    /**
     * Sets the value of field 'stan'.
     * 
     * @param stan the value of field 'stan'.
     */
    public void setStan(java.lang.String stan)
    {
        this._stan = stan;
    } //-- void setStan(java.lang.String) 

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
     * Sets the value of field 'verToken'.
     * 
     * @param verToken the value of field 'verToken'.
     */
    public void setVerToken(java.lang.String verToken)
    {
        this._verToken = verToken;
    } //-- void setVerToken(java.lang.String) 

    /**
     * Method unmarshalQrType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalQrType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.QrType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.QrType.class, reader);
    } //-- java.lang.Object unmarshalQrType(java.io.Reader) 

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
