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
 * Class HeadType.
 * 
 * @version $Revision$ $Date$
 */
public class HeadType implements java.io.Serializable {


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
     * Field _orgId
     */
    private java.lang.String _orgId;

    /**
     * Field _msgId
     */
    private java.lang.String _msgId;

    /**
     * Field _prodType
     */
    private java.lang.String _prodType;

    /**
     * Field _destinationOrgId
     */
    private java.lang.String _destinationOrgId;

    /**
     * Field _aepsOld
     */
    private boolean _aepsOld;

    /**
     * keeps track of state for field: _aepsOld
     */
    private boolean _has_aepsOld;

    /**
     * Field _iso8583Element
     */
    private com.gov.nha.bis.upi.ack.Iso8583Element _iso8583Element;


      //----------------/
     //- Constructors -/
    //----------------/

    public HeadType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.HeadType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAepsOld
     * 
     */
    public void deleteAepsOld()
    {
        this._has_aepsOld= false;
    } //-- void deleteAepsOld() 

    /**
     * Returns the value of field 'aepsOld'.
     * 
     * @return boolean
     * @return the value of field 'aepsOld'.
     */
    public boolean getAepsOld()
    {
        return this._aepsOld;
    } //-- boolean getAepsOld() 

    /**
     * Returns the value of field 'destinationOrgId'.
     * 
     * @return String
     * @return the value of field 'destinationOrgId'.
     */
    public java.lang.String getDestinationOrgId()
    {
        return this._destinationOrgId;
    } //-- java.lang.String getDestinationOrgId() 

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
     * Returns the value of field 'msgId'.
     * 
     * @return String
     * @return the value of field 'msgId'.
     */
    public java.lang.String getMsgId()
    {
        return this._msgId;
    } //-- java.lang.String getMsgId() 

    /**
     * Returns the value of field 'orgId'.
     * 
     * @return String
     * @return the value of field 'orgId'.
     */
    public java.lang.String getOrgId()
    {
        return this._orgId;
    } //-- java.lang.String getOrgId() 

    /**
     * Returns the value of field 'prodType'.
     * 
     * @return String
     * @return the value of field 'prodType'.
     */
    public java.lang.String getProdType()
    {
        return this._prodType;
    } //-- java.lang.String getProdType() 

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
     * Method hasAepsOld
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAepsOld()
    {
        return this._has_aepsOld;
    } //-- boolean hasAepsOld() 

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
     * Sets the value of field 'aepsOld'.
     * 
     * @param aepsOld the value of field 'aepsOld'.
     */
    public void setAepsOld(boolean aepsOld)
    {
        this._aepsOld = aepsOld;
        this._has_aepsOld = true;
    } //-- void setAepsOld(boolean) 

    /**
     * Sets the value of field 'destinationOrgId'.
     * 
     * @param destinationOrgId the value of field 'destinationOrgId'
     */
    public void setDestinationOrgId(java.lang.String destinationOrgId)
    {
        this._destinationOrgId = destinationOrgId;
    } //-- void setDestinationOrgId(java.lang.String) 

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
     * Sets the value of field 'msgId'.
     * 
     * @param msgId the value of field 'msgId'.
     */
    public void setMsgId(java.lang.String msgId)
    {
        this._msgId = msgId;
    } //-- void setMsgId(java.lang.String) 

    /**
     * Sets the value of field 'orgId'.
     * 
     * @param orgId the value of field 'orgId'.
     */
    public void setOrgId(java.lang.String orgId)
    {
        this._orgId = orgId;
    } //-- void setOrgId(java.lang.String) 

    /**
     * Sets the value of field 'prodType'.
     * 
     * @param prodType the value of field 'prodType'.
     */
    public void setProdType(java.lang.String prodType)
    {
        this._prodType = prodType;
    } //-- void setProdType(java.lang.String) 

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
     * Method unmarshalHeadType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalHeadType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.HeadType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.HeadType.class, reader);
    } //-- java.lang.Object unmarshalHeadType(java.io.Reader) 

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
