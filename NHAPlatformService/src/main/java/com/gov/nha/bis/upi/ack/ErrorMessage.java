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
 * Class ErrorMessage.
 * 
 * @version $Revision$ $Date$
 */
public class ErrorMessage implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _errorCd
     */
    private java.lang.String _errorCd;

    /**
     * Field _errorDtl
     */
    private java.lang.String _errorDtl;


      //----------------/
     //- Constructors -/
    //----------------/

    public ErrorMessage() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.ErrorMessage()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'errorCd'.
     * 
     * @return String
     * @return the value of field 'errorCd'.
     */
    public java.lang.String getErrorCd()
    {
        return this._errorCd;
    } //-- java.lang.String getErrorCd() 

    /**
     * Returns the value of field 'errorDtl'.
     * 
     * @return String
     * @return the value of field 'errorDtl'.
     */
    public java.lang.String getErrorDtl()
    {
        return this._errorDtl;
    } //-- java.lang.String getErrorDtl() 

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
     * Sets the value of field 'errorCd'.
     * 
     * @param errorCd the value of field 'errorCd'.
     */
    public void setErrorCd(java.lang.String errorCd)
    {
        this._errorCd = errorCd;
    } //-- void setErrorCd(java.lang.String) 

    /**
     * Sets the value of field 'errorDtl'.
     * 
     * @param errorDtl the value of field 'errorDtl'.
     */
    public void setErrorDtl(java.lang.String errorDtl)
    {
        this._errorDtl = errorDtl;
    } //-- void setErrorDtl(java.lang.String) 

    /**
     * Method unmarshalErrorMessage
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalErrorMessage(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.ErrorMessage) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.ErrorMessage.class, reader);
    } //-- java.lang.Object unmarshalErrorMessage(java.io.Reader) 

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
