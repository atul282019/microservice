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
 * Class PspVersionSupportedType.
 * 
 * @version $Revision$ $Date$
 */
public class PspVersionSupportedType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _version
     */
    private com.gov.nha.bis.upi.ack.PspVersionType _version;


      //----------------/
     //- Constructors -/
    //----------------/

    public PspVersionSupportedType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.PspVersionSupportedType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'version'.
     * 
     * @return PspVersionType
     * @return the value of field 'version'.
     */
    public com.gov.nha.bis.upi.ack.PspVersionType getVersion()
    {
        return this._version;
    } //-- com.gov.nha.bis.upi.ack.PspVersionType getVersion() 

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
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(com.gov.nha.bis.upi.ack.PspVersionType version)
    {
        this._version = version;
    } //-- void setVersion(com.gov.nha.bis.upi.ack.PspVersionType) 

    /**
     * Method unmarshalPspVersionSupportedType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalPspVersionSupportedType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.PspVersionSupportedType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.PspVersionSupportedType.class, reader);
    } //-- java.lang.Object unmarshalPspVersionSupportedType(java.io.Reader) 

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
