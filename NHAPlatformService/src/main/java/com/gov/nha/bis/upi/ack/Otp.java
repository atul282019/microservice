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
 * Class Otp.
 * 
 * @version $Revision$ $Date$
 */
public class Otp implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ts
     */
    private java.lang.String _ts;

    /**
     * Field _ac
     */
    private java.lang.String _ac;

    /**
     * Field _sa
     */
    private java.lang.String _sa;

    /**
     * Field _ver
     */
    private java.lang.String _ver;

    /**
     * Field _txn
     */
    private java.lang.String _txn;

    /**
     * Field _lk
     */
    private java.lang.String _lk;

    /**
     * Field _ch
     */
    private java.lang.String _ch;


      //----------------/
     //- Constructors -/
    //----------------/

    public Otp() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.Otp()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'ac'.
     * 
     * @return String
     * @return the value of field 'ac'.
     */
    public java.lang.String getAc()
    {
        return this._ac;
    } //-- java.lang.String getAc() 

    /**
     * Returns the value of field 'ch'.
     * 
     * @return String
     * @return the value of field 'ch'.
     */
    public java.lang.String getCh()
    {
        return this._ch;
    } //-- java.lang.String getCh() 

    /**
     * Returns the value of field 'lk'.
     * 
     * @return String
     * @return the value of field 'lk'.
     */
    public java.lang.String getLk()
    {
        return this._lk;
    } //-- java.lang.String getLk() 

    /**
     * Returns the value of field 'sa'.
     * 
     * @return String
     * @return the value of field 'sa'.
     */
    public java.lang.String getSa()
    {
        return this._sa;
    } //-- java.lang.String getSa() 

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
     * Returns the value of field 'txn'.
     * 
     * @return String
     * @return the value of field 'txn'.
     */
    public java.lang.String getTxn()
    {
        return this._txn;
    } //-- java.lang.String getTxn() 

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
     * Sets the value of field 'ac'.
     * 
     * @param ac the value of field 'ac'.
     */
    public void setAc(java.lang.String ac)
    {
        this._ac = ac;
    } //-- void setAc(java.lang.String) 

    /**
     * Sets the value of field 'ch'.
     * 
     * @param ch the value of field 'ch'.
     */
    public void setCh(java.lang.String ch)
    {
        this._ch = ch;
    } //-- void setCh(java.lang.String) 

    /**
     * Sets the value of field 'lk'.
     * 
     * @param lk the value of field 'lk'.
     */
    public void setLk(java.lang.String lk)
    {
        this._lk = lk;
    } //-- void setLk(java.lang.String) 

    /**
     * Sets the value of field 'sa'.
     * 
     * @param sa the value of field 'sa'.
     */
    public void setSa(java.lang.String sa)
    {
        this._sa = sa;
    } //-- void setSa(java.lang.String) 

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
     * Sets the value of field 'txn'.
     * 
     * @param txn the value of field 'txn'.
     */
    public void setTxn(java.lang.String txn)
    {
        this._txn = txn;
    } //-- void setTxn(java.lang.String) 

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
     * Method unmarshalOtp
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalOtp(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.Otp) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.Otp.class, reader);
    } //-- java.lang.Object unmarshalOtp(java.io.Reader) 

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
