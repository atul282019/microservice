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

import com.gov.nha.bis.upi.ack.types.ChannelType;
import com.gov.nha.bis.upi.ack.types.FndIndi;
import com.gov.nha.bis.upi.ack.types.TxnType;
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
 * Class ReInfoType.
 * 
 * @version $Revision$ $Date$
 */
public class ReInfoType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _repId
     */
    private java.lang.String _repId;

    /**
     * Field _repName
     */
    private java.lang.String _repName;

    /**
     * Field _authId
     */
    private java.lang.String _authId;

    /**
     * Field _authName
     */
    private java.lang.String _authName;

    /**
     * Field _txnType
     */
    private com.gov.nha.bis.upi.ack.types.TxnType _txnType;

    /**
     * Field _amt
     */
    private java.lang.String _amt;

    /**
     * Field _fndIndi
     */
    private com.gov.nha.bis.upi.ack.types.FndIndi _fndIndi;

    /**
     * Field _channel
     */
    private com.gov.nha.bis.upi.ack.types.ChannelType _channel;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReInfoType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.ReInfoType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'amt'.
     * 
     * @return String
     * @return the value of field 'amt'.
     */
    public java.lang.String getAmt()
    {
        return this._amt;
    } //-- java.lang.String getAmt() 

    /**
     * Returns the value of field 'authId'.
     * 
     * @return String
     * @return the value of field 'authId'.
     */
    public java.lang.String getAuthId()
    {
        return this._authId;
    } //-- java.lang.String getAuthId() 

    /**
     * Returns the value of field 'authName'.
     * 
     * @return String
     * @return the value of field 'authName'.
     */
    public java.lang.String getAuthName()
    {
        return this._authName;
    } //-- java.lang.String getAuthName() 

    /**
     * Returns the value of field 'channel'.
     * 
     * @return ChannelType
     * @return the value of field 'channel'.
     */
    public com.gov.nha.bis.upi.ack.types.ChannelType getChannel()
    {
        return this._channel;
    } //-- com.gov.nha.bis.upi.ack.types.ChannelType getChannel() 

    /**
     * Returns the value of field 'fndIndi'.
     * 
     * @return FndIndi
     * @return the value of field 'fndIndi'.
     */
    public com.gov.nha.bis.upi.ack.types.FndIndi getFndIndi()
    {
        return this._fndIndi;
    } //-- com.gov.nha.bis.upi.ack.types.FndIndi getFndIndi() 

    /**
     * Returns the value of field 'repId'.
     * 
     * @return String
     * @return the value of field 'repId'.
     */
    public java.lang.String getRepId()
    {
        return this._repId;
    } //-- java.lang.String getRepId() 

    /**
     * Returns the value of field 'repName'.
     * 
     * @return String
     * @return the value of field 'repName'.
     */
    public java.lang.String getRepName()
    {
        return this._repName;
    } //-- java.lang.String getRepName() 

    /**
     * Returns the value of field 'txnType'.
     * 
     * @return TxnType
     * @return the value of field 'txnType'.
     */
    public com.gov.nha.bis.upi.ack.types.TxnType getTxnType()
    {
        return this._txnType;
    } //-- com.gov.nha.bis.upi.ack.types.TxnType getTxnType() 

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
     * Sets the value of field 'amt'.
     * 
     * @param amt the value of field 'amt'.
     */
    public void setAmt(java.lang.String amt)
    {
        this._amt = amt;
    } //-- void setAmt(java.lang.String) 

    /**
     * Sets the value of field 'authId'.
     * 
     * @param authId the value of field 'authId'.
     */
    public void setAuthId(java.lang.String authId)
    {
        this._authId = authId;
    } //-- void setAuthId(java.lang.String) 

    /**
     * Sets the value of field 'authName'.
     * 
     * @param authName the value of field 'authName'.
     */
    public void setAuthName(java.lang.String authName)
    {
        this._authName = authName;
    } //-- void setAuthName(java.lang.String) 

    /**
     * Sets the value of field 'channel'.
     * 
     * @param channel the value of field 'channel'.
     */
    public void setChannel(com.gov.nha.bis.upi.ack.types.ChannelType channel)
    {
        this._channel = channel;
    } //-- void setChannel(com.gov.nha.bis.upi.ack.types.ChannelType) 

    /**
     * Sets the value of field 'fndIndi'.
     * 
     * @param fndIndi the value of field 'fndIndi'.
     */
    public void setFndIndi(com.gov.nha.bis.upi.ack.types.FndIndi fndIndi)
    {
        this._fndIndi = fndIndi;
    } //-- void setFndIndi(com.gov.nha.bis.upi.ack.types.FndIndi) 

    /**
     * Sets the value of field 'repId'.
     * 
     * @param repId the value of field 'repId'.
     */
    public void setRepId(java.lang.String repId)
    {
        this._repId = repId;
    } //-- void setRepId(java.lang.String) 

    /**
     * Sets the value of field 'repName'.
     * 
     * @param repName the value of field 'repName'.
     */
    public void setRepName(java.lang.String repName)
    {
        this._repName = repName;
    } //-- void setRepName(java.lang.String) 

    /**
     * Sets the value of field 'txnType'.
     * 
     * @param txnType the value of field 'txnType'.
     */
    public void setTxnType(com.gov.nha.bis.upi.ack.types.TxnType txnType)
    {
        this._txnType = txnType;
    } //-- void setTxnType(com.gov.nha.bis.upi.ack.types.TxnType) 

    /**
     * Method unmarshalReInfoType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalReInfoType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.ReInfoType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.ReInfoType.class, reader);
    } //-- java.lang.Object unmarshalReInfoType(java.io.Reader) 

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
