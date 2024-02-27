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
import com.gov.nha.bis.upi.ack.types.RegIdDetailsSetStatusType;
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
 * Class MapperConfRefType.
 * 
 * @version $Revision$ $Date$
 */
public class MapperConfRefType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type
     */
    private java.lang.String _type;

    /**
     * Field _regName
     */
    private java.lang.String _regName;

    /**
     * Field _addr
     */
    private java.lang.String _addr;

    /**
     * Field _cmId
     */
    private java.lang.String _cmId;

    /**
     * Field _code
     */
    private java.lang.String _code;

    /**
     * Field _respCode
     */
    private java.lang.String _respCode;

    /**
     * Field _channel
     */
    private com.gov.nha.bis.upi.ack.types.ChannelType _channel;

    /**
     * Field _status
     */
    private com.gov.nha.bis.upi.ack.types.RegIdDetailsSetStatusType _status;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapperConfRefType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.MapperConfRefType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'addr'.
     * 
     * @return String
     * @return the value of field 'addr'.
     */
    public java.lang.String getAddr()
    {
        return this._addr;
    } //-- java.lang.String getAddr() 

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
     * Returns the value of field 'cmId'.
     * 
     * @return String
     * @return the value of field 'cmId'.
     */
    public java.lang.String getCmId()
    {
        return this._cmId;
    } //-- java.lang.String getCmId() 

    /**
     * Returns the value of field 'code'.
     * 
     * @return String
     * @return the value of field 'code'.
     */
    public java.lang.String getCode()
    {
        return this._code;
    } //-- java.lang.String getCode() 

    /**
     * Returns the value of field 'regName'.
     * 
     * @return String
     * @return the value of field 'regName'.
     */
    public java.lang.String getRegName()
    {
        return this._regName;
    } //-- java.lang.String getRegName() 

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
     * Returns the value of field 'status'.
     * 
     * @return RegIdDetailsSetStatusType
     * @return the value of field 'status'.
     */
    public com.gov.nha.bis.upi.ack.types.RegIdDetailsSetStatusType getStatus()
    {
        return this._status;
    } //-- com.gov.nha.bis.upi.ack.types.RegIdDetailsSetStatusType getStatus() 

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
     * Sets the value of field 'addr'.
     * 
     * @param addr the value of field 'addr'.
     */
    public void setAddr(java.lang.String addr)
    {
        this._addr = addr;
    } //-- void setAddr(java.lang.String) 

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
     * Sets the value of field 'cmId'.
     * 
     * @param cmId the value of field 'cmId'.
     */
    public void setCmId(java.lang.String cmId)
    {
        this._cmId = cmId;
    } //-- void setCmId(java.lang.String) 

    /**
     * Sets the value of field 'code'.
     * 
     * @param code the value of field 'code'.
     */
    public void setCode(java.lang.String code)
    {
        this._code = code;
    } //-- void setCode(java.lang.String) 

    /**
     * Sets the value of field 'regName'.
     * 
     * @param regName the value of field 'regName'.
     */
    public void setRegName(java.lang.String regName)
    {
        this._regName = regName;
    } //-- void setRegName(java.lang.String) 

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
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(com.gov.nha.bis.upi.ack.types.RegIdDetailsSetStatusType status)
    {
        this._status = status;
    } //-- void setStatus(com.gov.nha.bis.upi.ack.types.RegIdDetailsSetStatusType) 

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
     * Method unmarshalMapperConfRefType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalMapperConfRefType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.MapperConfRefType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.MapperConfRefType.class, reader);
    } //-- java.lang.Object unmarshalMapperConfRefType(java.io.Reader) 

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
