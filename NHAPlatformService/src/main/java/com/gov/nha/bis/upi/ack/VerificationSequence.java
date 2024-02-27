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
 * Class VerificationSequence.
 * 
 * @version $Revision$ $Date$
 */
public class VerificationSequence implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sendingTimestamp
     */
    private java.lang.String _sendingTimestamp;

    /**
     * Field _sequence
     */
    private int _sequence;

    /**
     * keeps track of state for field: _sequence
     */
    private boolean _has_sequence;

    /**
     * Field _chkTxnMsgId
     */
    private java.lang.String _chkTxnMsgId;

    /**
     * Field _respCode
     */
    private java.lang.String _respCode;

    /**
     * Field _iso8583Element
     */
    private com.gov.nha.bis.upi.ack.Iso8583Element _iso8583Element;


      //----------------/
     //- Constructors -/
    //----------------/

    public VerificationSequence() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.VerificationSequence()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteSequence
     * 
     */
    public void deleteSequence()
    {
        this._has_sequence= false;
    } //-- void deleteSequence() 

    /**
     * Returns the value of field 'chkTxnMsgId'.
     * 
     * @return String
     * @return the value of field 'chkTxnMsgId'.
     */
    public java.lang.String getChkTxnMsgId()
    {
        return this._chkTxnMsgId;
    } //-- java.lang.String getChkTxnMsgId() 

    /**
     * Returns the value of field 'iso8583Element'.
     * 
     * @return Iso8583Element
     * @return the value of field 'iso8583Element'.
     */
    public com.gov.nha.bis.upi.ack.Iso8583Element getIso8583Element()
    {
        return this._iso8583Element;
    } //-- com.gov.nha.bis.upi.ack.Iso8583Element getIso8583Element() 

    /**
     * Returns the value of field 'respCode'.
     * 
     * @return String
     * @return the value of field 'respCode'.
     */
    public java.lang.String getRespCode()
    {
        return this._respCode;
    } //-- java.lang.String getRespCode() 

    /**
     * Returns the value of field 'sendingTimestamp'.
     * 
     * @return String
     * @return the value of field 'sendingTimestamp'.
     */
    public java.lang.String getSendingTimestamp()
    {
        return this._sendingTimestamp;
    } //-- java.lang.String getSendingTimestamp() 

    /**
     * Returns the value of field 'sequence'.
     * 
     * @return int
     * @return the value of field 'sequence'.
     */
    public int getSequence()
    {
        return this._sequence;
    } //-- int getSequence() 

    /**
     * Method hasSequence
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSequence()
    {
        return this._has_sequence;
    } //-- boolean hasSequence() 

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
     * Sets the value of field 'chkTxnMsgId'.
     * 
     * @param chkTxnMsgId the value of field 'chkTxnMsgId'.
     */
    public void setChkTxnMsgId(java.lang.String chkTxnMsgId)
    {
        this._chkTxnMsgId = chkTxnMsgId;
    } //-- void setChkTxnMsgId(java.lang.String) 

    /**
     * Sets the value of field 'iso8583Element'.
     * 
     * @param iso8583Element the value of field 'iso8583Element'.
     */
    public void setIso8583Element(com.gov.nha.bis.upi.ack.Iso8583Element iso8583Element)
    {
        this._iso8583Element = iso8583Element;
    } //-- void setIso8583Element(com.gov.nha.bis.upi.ack.Iso8583Element) 

    /**
     * Sets the value of field 'respCode'.
     * 
     * @param respCode the value of field 'respCode'.
     */
    public void setRespCode(java.lang.String respCode)
    {
        this._respCode = respCode;
    } //-- void setRespCode(java.lang.String) 

    /**
     * Sets the value of field 'sendingTimestamp'.
     * 
     * @param sendingTimestamp the value of field 'sendingTimestamp'
     */
    public void setSendingTimestamp(java.lang.String sendingTimestamp)
    {
        this._sendingTimestamp = sendingTimestamp;
    } //-- void setSendingTimestamp(java.lang.String) 

    /**
     * Sets the value of field 'sequence'.
     * 
     * @param sequence the value of field 'sequence'.
     */
    public void setSequence(int sequence)
    {
        this._sequence = sequence;
        this._has_sequence = true;
    } //-- void setSequence(int) 

    /**
     * Method unmarshalVerificationSequence
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalVerificationSequence(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.VerificationSequence) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.VerificationSequence.class, reader);
    } //-- java.lang.Object unmarshalVerificationSequence(java.io.Reader) 

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
