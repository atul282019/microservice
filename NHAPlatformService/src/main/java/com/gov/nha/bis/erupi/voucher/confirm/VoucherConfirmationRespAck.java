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
 * Class VoucherConfirmationRespAck.
 * 
 * @version $Revision$ $Date$
 */
public class VoucherConfirmationRespAck implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ver
     */
    private java.lang.String _ver;

    /**
     * Field _ts
     */
    private java.lang.String _ts;

    /**
     * Field _erupiCode
     */
    private java.lang.String _erupiCode;

    /**
     * Field _reqTxn
     */
    private java.lang.String _reqTxn;

    /**
     * Field _confResp
     */
    private com.gov.nha.bis.erupi.voucher.confirm.ConfResp _confResp;


      //----------------/
     //- Constructors -/
    //----------------/

    public VoucherConfirmationRespAck() 
     {
        super();
    } //-- com.gov.nha.bis.erupi.voucher.confirm.VoucherConfirmationRespAck()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'confResp'.
     * 
     * @return ConfResp
     * @return the value of field 'confResp'.
     */
    public com.gov.nha.bis.erupi.voucher.confirm.ConfResp getConfResp()
    {
        return this._confResp;
    } //-- com.gov.nha.bis.erupi.voucher.confirm.ConfResp getConfResp() 

    /**
     * Returns the value of field 'erupiCode'.
     * 
     * @return String
     * @return the value of field 'erupiCode'.
     */
    public java.lang.String getErupiCode()
    {
        return this._erupiCode;
    } //-- java.lang.String getErupiCode() 

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
     * Returns the value of field 'ver'.
     * 
     * @return String
     * @return the value of field 'ver'.
     */
    public java.lang.String getVer()
    {
        return this._ver;
    } //-- java.lang.String getVer() 

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
     * Sets the value of field 'confResp'.
     * 
     * @param confResp the value of field 'confResp'.
     */
    public void setConfResp(com.gov.nha.bis.erupi.voucher.confirm.ConfResp confResp)
    {
        this._confResp = confResp;
    } //-- void setConfResp(com.gov.nha.bis.erupi.voucher.confirm.ConfResp) 

    /**
     * Sets the value of field 'erupiCode'.
     * 
     * @param erupiCode the value of field 'erupiCode'.
     */
    public void setErupiCode(java.lang.String erupiCode)
    {
        this._erupiCode = erupiCode;
    } //-- void setErupiCode(java.lang.String) 

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
     * Sets the value of field 'ts'.
     * 
     * @param ts the value of field 'ts'.
     */
    public void setTs(java.lang.String ts)
    {
        this._ts = ts;
    } //-- void setTs(java.lang.String) 

    /**
     * Sets the value of field 'ver'.
     * 
     * @param ver the value of field 'ver'.
     */
    public void setVer(java.lang.String ver)
    {
        this._ver = ver;
    } //-- void setVer(java.lang.String) 

    /**
     * Method unmarshalVoucherConfirmationRespAck
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalVoucherConfirmationRespAck(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.erupi.voucher.confirm.VoucherConfirmationRespAck) Unmarshaller.unmarshal(com.gov.nha.bis.erupi.voucher.confirm.VoucherConfirmationRespAck.class, reader);
    } //-- java.lang.Object unmarshalVoucherConfirmationRespAck(java.io.Reader) 

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
