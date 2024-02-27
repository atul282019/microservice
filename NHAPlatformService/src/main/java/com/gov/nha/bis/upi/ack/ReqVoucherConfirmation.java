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
 * To confirm status of Mandate
 *  
 * 
 * @version $Revision$ $Date$
 */
public class ReqVoucherConfirmation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _head
     */
    private com.gov.nha.bis.upi.ack.HeadType _head;

    /**
     * Field _txn
     */
    private com.gov.nha.bis.upi.ack.PayTrans _txn;

    /**
     * Field _txnConfirmation
     */
    private com.gov.nha.bis.upi.ack.TxnConfDtl _txnConfirmation;

    /**
     * Field _mandate
     */
    private com.gov.nha.bis.upi.ack.MandateType _mandate;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReqVoucherConfirmation() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.ReqVoucherConfirmation()


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
     * Returns the value of field 'txnConfirmation'.
     * 
     * @return TxnConfDtl
     * @return the value of field 'txnConfirmation'.
     */
    public com.gov.nha.bis.upi.ack.TxnConfDtl getTxnConfirmation()
    {
        return this._txnConfirmation;
    } //-- com.gov.nha.bis.upi.ack.TxnConfDtl getTxnConfirmation() 

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
     * Sets the value of field 'txn'.
     * 
     * @param txn the value of field 'txn'.
     */
    public void setTxn(com.gov.nha.bis.upi.ack.PayTrans txn)
    {
        this._txn = txn;
    } //-- void setTxn(com.gov.nha.bis.upi.ack.PayTrans) 

    /**
     * Sets the value of field 'txnConfirmation'.
     * 
     * @param txnConfirmation the value of field 'txnConfirmation'.
     */
    public void setTxnConfirmation(com.gov.nha.bis.upi.ack.TxnConfDtl txnConfirmation)
    {
        this._txnConfirmation = txnConfirmation;
    } //-- void setTxnConfirmation(com.gov.nha.bis.upi.ack.TxnConfDtl) 

    /**
     * Method unmarshalReqVoucherConfirmation
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalReqVoucherConfirmation(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.ReqVoucherConfirmation) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.ReqVoucherConfirmation.class, reader);
    } //-- java.lang.Object unmarshalReqVoucherConfirmation(java.io.Reader) 

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
