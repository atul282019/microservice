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
 * Class Iso8583Element.
 * 
 * @version $Revision$ $Date$
 */
public class Iso8583Element implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _iso8583Payload
     */
    private byte[] _iso8583Payload;

    /**
     * Field _port
     */
    private java.lang.String _port;

    /**
     * Field _trackingId
     */
    private java.lang.String _trackingId;


      //----------------/
     //- Constructors -/
    //----------------/

    public Iso8583Element() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.Iso8583Element()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'iso8583Payload'.
     * 
     * @return byte
     * @return the value of field 'iso8583Payload'.
     */
    public byte[] getIso8583Payload()
    {
        return this._iso8583Payload;
    } //-- byte[] getIso8583Payload() 

    /**
     * Returns the value of field 'port'.
     * 
     * @return String
     * @return the value of field 'port'.
     */
    public java.lang.String getPort()
    {
        return this._port;
    } //-- java.lang.String getPort() 

    /**
     * Returns the value of field 'trackingId'.
     * 
     * @return String
     * @return the value of field 'trackingId'.
     */
    public java.lang.String getTrackingId()
    {
        return this._trackingId;
    } //-- java.lang.String getTrackingId() 

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
     * Sets the value of field 'iso8583Payload'.
     * 
     * @param iso8583Payload the value of field 'iso8583Payload'.
     */
    public void setIso8583Payload(byte[] iso8583Payload)
    {
        this._iso8583Payload = iso8583Payload;
    } //-- void setIso8583Payload(byte) 

    /**
     * Sets the value of field 'port'.
     * 
     * @param port the value of field 'port'.
     */
    public void setPort(java.lang.String port)
    {
        this._port = port;
    } //-- void setPort(java.lang.String) 

    /**
     * Sets the value of field 'trackingId'.
     * 
     * @param trackingId the value of field 'trackingId'.
     */
    public void setTrackingId(java.lang.String trackingId)
    {
        this._trackingId = trackingId;
    } //-- void setTrackingId(java.lang.String) 

    /**
     * Method unmarshalIso8583Element
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalIso8583Element(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.Iso8583Element) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.Iso8583Element.class, reader);
    } //-- java.lang.Object unmarshalIso8583Element(java.io.Reader) 

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
