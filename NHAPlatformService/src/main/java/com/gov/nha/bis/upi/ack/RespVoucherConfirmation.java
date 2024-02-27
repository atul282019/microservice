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
public class RespVoucherConfirmation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _head
     */
    private com.gov.nha.bis.upi.ack.HeadType _head;

    /**
     * Field _resp
     */
    private com.gov.nha.bis.upi.ack.RespType _resp;

    /**
     * Field _txn
     */
    private com.gov.nha.bis.upi.ack.PayTrans _txn;


      //----------------/
     //- Constructors -/
    //----------------/

    public RespVoucherConfirmation() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.RespVoucherConfirmation()


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
     * Returns the value of field 'resp'.
     * 
     * @return RespType
     * @return the value of field 'resp'.
     */
    public com.gov.nha.bis.upi.ack.RespType getResp()
    {
        return this._resp;
    } //-- com.gov.nha.bis.upi.ack.RespType getResp() 

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
     * Sets the value of field 'resp'.
     * 
     * @param resp the value of field 'resp'.
     */
    public void setResp(com.gov.nha.bis.upi.ack.RespType resp)
    {
        this._resp = resp;
    } //-- void setResp(com.gov.nha.bis.upi.ack.RespType) 

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
     * Method unmarshalRespVoucherConfirmation
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRespVoucherConfirmation(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RespVoucherConfirmation) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RespVoucherConfirmation.class, reader);
    } //-- java.lang.Object unmarshalRespVoucherConfirmation(java.io.Reader) 

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
