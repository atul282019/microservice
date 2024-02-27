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
 * UPI ReqVoucher for creating or revoking e-rupee
 *  
 * 
 * @version $Revision$ $Date$
 */
public class ReqVoucher implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _head
     */
    private com.gov.nha.bis.upi.ack.HeadType _head;

    /**
     * Field _meta
     */
    private com.gov.nha.bis.upi.ack.Meta _meta;

    /**
     * Field _txn
     */
    private com.gov.nha.bis.upi.ack.PayTrans _txn;

    /**
     * Field _mandate
     */
    private com.gov.nha.bis.upi.ack.MandateType _mandate;

    /**
     * Field _payer
     */
    private com.gov.nha.bis.upi.ack.PayerType _payer;

    /**
     * Field _payees
     */
    private com.gov.nha.bis.upi.ack.PayeesType _payees;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReqVoucher() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.ReqVoucher()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'head'.
     * 
     * @return HeadType
     * @return the value of field 'head'.
     */
    public com.gov.nha.bis.upi.ack.HeadType getHead()
    {
        return this._head;
    } //-- com.gov.nha.bis.upi.ack.HeadType getHead() 

    /**
     * Returns the value of field 'mandate'.
     * 
     * @return MandateType
     * @return the value of field 'mandate'.
     */
    public com.gov.nha.bis.upi.ack.MandateType getMandate()
    {
        return this._mandate;
    } //-- com.gov.nha.bis.upi.ack.MandateType getMandate() 

    /**
     * Returns the value of field 'meta'.
     * 
     * @return Meta
     * @return the value of field 'meta'.
     */
    public com.gov.nha.bis.upi.ack.Meta getMeta()
    {
        return this._meta;
    } //-- com.gov.nha.bis.upi.ack.Meta getMeta() 

    /**
     * Returns the value of field 'payees'.
     * 
     * @return PayeesType
     * @return the value of field 'payees'.
     */
    public com.gov.nha.bis.upi.ack.PayeesType getPayees()
    {
        return this._payees;
    } //-- com.gov.nha.bis.upi.ack.PayeesType getPayees() 

    /**
     * Returns the value of field 'payer'.
     * 
     * @return PayerType
     * @return the value of field 'payer'.
     */
    public com.gov.nha.bis.upi.ack.PayerType getPayer()
    {
        return this._payer;
    } //-- com.gov.nha.bis.upi.ack.PayerType getPayer() 

    /**
     * Returns the value of field 'txn'.
     * 
     * @return PayTrans
     * @return the value of field 'txn'.
     */
    public com.gov.nha.bis.upi.ack.PayTrans getTxn()
    {
        return this._txn;
    } //-- com.gov.nha.bis.upi.ack.PayTrans getTxn() 

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
     * Sets the value of field 'head'.
     * 
     * @param head the value of field 'head'.
     */
    public void setHead(com.gov.nha.bis.upi.ack.HeadType head)
    {
        this._head = head;
    } //-- void setHead(com.gov.nha.bis.upi.ack.HeadType) 

    /**
     * Sets the value of field 'mandate'.
     * 
     * @param mandate the value of field 'mandate'.
     */
    public void setMandate(com.gov.nha.bis.upi.ack.MandateType mandate)
    {
        this._mandate = mandate;
    } //-- void setMandate(com.gov.nha.bis.upi.ack.MandateType) 

    /**
     * Sets the value of field 'meta'.
     * 
     * @param meta the value of field 'meta'.
     */
    public void setMeta(com.gov.nha.bis.upi.ack.Meta meta)
    {
        this._meta = meta;
    } //-- void setMeta(com.gov.nha.bis.upi.ack.Meta) 

    /**
     * Sets the value of field 'payees'.
     * 
     * @param payees the value of field 'payees'.
     */
    public void setPayees(com.gov.nha.bis.upi.ack.PayeesType payees)
    {
        this._payees = payees;
    } //-- void setPayees(com.gov.nha.bis.upi.ack.PayeesType) 

    /**
     * Sets the value of field 'payer'.
     * 
     * @param payer the value of field 'payer'.
     */
    public void setPayer(com.gov.nha.bis.upi.ack.PayerType payer)
    {
        this._payer = payer;
    } //-- void setPayer(com.gov.nha.bis.upi.ack.PayerType) 

    /**
     * Sets the value of field 'txn'.
     * 
     * @param txn the value of field 'txn'.
     */
    public void setTxn(com.gov.nha.bis.upi.ack.PayTrans txn)
    {
        this._txn = txn;
    } //-- void setTxn(com.gov.nha.bis.upi.ack.PayTrans) 

    /**
     * Method unmarshalReqVoucher
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalReqVoucher(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.ReqVoucher) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.ReqVoucher.class, reader);
    } //-- java.lang.Object unmarshalReqVoucher(java.io.Reader) 

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
