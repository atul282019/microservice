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
import java.util.ArrayList;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Ack.
 * 
 * @version $Revision$ $Date$
 */
public class Ack implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _api
     */
    private java.lang.String _api;

    /**
     * Field _reqMsgId
     */
    private java.lang.String _reqMsgId;

    /**
     * Field _err
     */
    private java.lang.String _err;

    /**
     * Field _ts
     */
    private java.lang.String _ts;

    /**
     * Field _errorMessagesList
     */
    private java.util.ArrayList _errorMessagesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ack() 
     {
        super();
        _errorMessagesList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.Ack()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addErrorMessages
     * 
     * 
     * 
     * @param vErrorMessages
     */
    public void addErrorMessages(com.gov.nha.bis.upi.ack.ErrorMessage vErrorMessages)
        throws java.lang.IndexOutOfBoundsException
    {
        _errorMessagesList.add(vErrorMessages);
    } //-- void addErrorMessages(com.gov.nha.bis.upi.ack.ErrorMessage) 

    /**
     * Method addErrorMessages
     * 
     * 
     * 
     * @param index
     * @param vErrorMessages
     */
    public void addErrorMessages(int index, com.gov.nha.bis.upi.ack.ErrorMessage vErrorMessages)
        throws java.lang.IndexOutOfBoundsException
    {
        _errorMessagesList.add(index, vErrorMessages);
    } //-- void addErrorMessages(int, com.gov.nha.bis.upi.ack.ErrorMessage) 

    /**
     * Method clearErrorMessages
     * 
     */
    public void clearErrorMessages()
    {
        _errorMessagesList.clear();
    } //-- void clearErrorMessages() 

    /**
     * Method enumerateErrorMessages
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateErrorMessages()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_errorMessagesList.iterator());
    } //-- java.util.Enumeration enumerateErrorMessages() 

    /**
     * Returns the value of field 'api'.
     * 
     * @return String
     * @return the value of field 'api'.
     */
    public java.lang.String getApi()
    {
        return this._api;
    } //-- java.lang.String getApi() 

    /**
     * Returns the value of field 'err'.
     * 
     * @return String
     * @return the value of field 'err'.
     */
    public java.lang.String getErr()
    {
        return this._err;
    } //-- java.lang.String getErr() 

    /**
     * Method getErrorMessages
     * 
     * 
     * 
     * @param index
     * @return ErrorMessage
     */
    public com.gov.nha.bis.upi.ack.ErrorMessage getErrorMessages(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _errorMessagesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.ErrorMessage) _errorMessagesList.get(index);
    } //-- com.gov.nha.bis.upi.ack.ErrorMessage getErrorMessages(int) 

    /**
     * Method getErrorMessages
     * 
     * 
     * 
     * @return ErrorMessage
     */
    public com.gov.nha.bis.upi.ack.ErrorMessage[] getErrorMessages()
    {
        int size = _errorMessagesList.size();
        com.gov.nha.bis.upi.ack.ErrorMessage[] mArray = new com.gov.nha.bis.upi.ack.ErrorMessage[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.ErrorMessage) _errorMessagesList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.ErrorMessage[] getErrorMessages() 

    /**
     * Method getErrorMessagesCount
     * 
     * 
     * 
     * @return int
     */
    public int getErrorMessagesCount()
    {
        return _errorMessagesList.size();
    } //-- int getErrorMessagesCount() 

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
     * Method removeErrorMessages
     * 
     * 
     * 
     * @param vErrorMessages
     * @return boolean
     */
    public boolean removeErrorMessages(com.gov.nha.bis.upi.ack.ErrorMessage vErrorMessages)
    {
        boolean removed = _errorMessagesList.remove(vErrorMessages);
        return removed;
    } //-- boolean removeErrorMessages(com.gov.nha.bis.upi.ack.ErrorMessage) 

    /**
     * Sets the value of field 'api'.
     * 
     * @param api the value of field 'api'.
     */
    public void setApi(java.lang.String api)
    {
        this._api = api;
    } //-- void setApi(java.lang.String) 

    /**
     * Sets the value of field 'err'.
     * 
     * @param err the value of field 'err'.
     */
    public void setErr(java.lang.String err)
    {
        this._err = err;
    } //-- void setErr(java.lang.String) 

    /**
     * Method setErrorMessages
     * 
     * 
     * 
     * @param index
     * @param vErrorMessages
     */
    public void setErrorMessages(int index, com.gov.nha.bis.upi.ack.ErrorMessage vErrorMessages)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _errorMessagesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _errorMessagesList.set(index, vErrorMessages);
    } //-- void setErrorMessages(int, com.gov.nha.bis.upi.ack.ErrorMessage) 

    /**
     * Method setErrorMessages
     * 
     * 
     * 
     * @param errorMessagesArray
     */
    public void setErrorMessages(com.gov.nha.bis.upi.ack.ErrorMessage[] errorMessagesArray)
    {
        //-- copy array
        _errorMessagesList.clear();
        for (int i = 0; i < errorMessagesArray.length; i++) {
            _errorMessagesList.add(errorMessagesArray[i]);
        }
    } //-- void setErrorMessages(com.gov.nha.bis.upi.ack.ErrorMessage) 

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
     * Sets the value of field 'ts'.
     * 
     * @param ts the value of field 'ts'.
     */
    public void setTs(java.lang.String ts)
    {
        this._ts = ts;
    } //-- void setTs(java.lang.String) 

    /**
     * Method unmarshalAck
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalAck(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.Ack) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.Ack.class, reader);
    } //-- java.lang.Object unmarshalAck(java.io.Reader) 

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
