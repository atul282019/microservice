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
 * Class CurrentStatusResp.
 * 
 * @version $Revision$ $Date$
 */
public class CurrentStatusResp implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _voucherTxn
     */
    private java.lang.String _voucherTxn;

    /**
     * Field _type
     */
    private java.lang.String _type;

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
     * Field _txnDate
     */
    private java.lang.String _txnDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public CurrentStatusResp() 
     {
        super();
    } //-- com.gov.nha.bis.erupi.voucher.req.CurrentStatusResp()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'txnDate'.
     * 
     * @return String
     * @return the value of field 'txnDate'.
     */
    public java.lang.String getTxnDate()
    {
        return this._txnDate;
    } //-- java.lang.String getTxnDate() 

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
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * Sets the value of field 'txnDate'.
     * 
     * @param txnDate the value of field 'txnDate'.
     */
    public void setTxnDate(java.lang.String txnDate)
    {
        this._txnDate = txnDate;
    } //-- void setTxnDate(java.lang.String) 

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
     * Sets the value of field 'voucherTxn'.
     * 
     * @param voucherTxn the value of field 'voucherTxn'.
     */
    public void setVoucherTxn(java.lang.String voucherTxn)
    {
        this._voucherTxn = voucherTxn;
    } //-- void setVoucherTxn(java.lang.String) 

    /**
     * Method unmarshalCurrentStatusResp
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalCurrentStatusResp(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.erupi.voucher.req.CurrentStatusResp) Unmarshaller.unmarshal(com.gov.nha.bis.erupi.voucher.req.CurrentStatusResp.class, reader);
    } //-- java.lang.Object unmarshalCurrentStatusResp(java.io.Reader) 

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
