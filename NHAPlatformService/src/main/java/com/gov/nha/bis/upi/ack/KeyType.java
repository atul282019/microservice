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
 * Class KeyType.
 * 
 * @version $Revision$ $Date$
 */
public class KeyType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _code
     */
    private java.lang.String _code;

    /**
     * Field _type
     */
    private java.lang.String _type;

    /**
     * Field _ki
     */
    private java.lang.String _ki;

    /**
     * Field _keyValue
     */
    private java.lang.String _keyValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public KeyType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.KeyType()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'keyValue'.
     * 
     * @return String
     * @return the value of field 'keyValue'.
     */
    public java.lang.String getKeyValue()
    {
        return this._keyValue;
    } //-- java.lang.String getKeyValue() 

    /**
     * Returns the value of field 'ki'.
     * 
     * @return String
     * @return the value of field 'ki'.
     */
    public java.lang.String getKi()
    {
        return this._ki;
    } //-- java.lang.String getKi() 

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
     * Sets the value of field 'code'.
     * 
     * @param code the value of field 'code'.
     */
    public void setCode(java.lang.String code)
    {
        this._code = code;
    } //-- void setCode(java.lang.String) 

    /**
     * Sets the value of field 'keyValue'.
     * 
     * @param keyValue the value of field 'keyValue'.
     */
    public void setKeyValue(java.lang.String keyValue)
    {
        this._keyValue = keyValue;
    } //-- void setKeyValue(java.lang.String) 

    /**
     * Sets the value of field 'ki'.
     * 
     * @param ki the value of field 'ki'.
     */
    public void setKi(java.lang.String ki)
    {
        this._ki = ki;
    } //-- void setKi(java.lang.String) 

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
     * Method unmarshalKeyType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalKeyType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.KeyType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.KeyType.class, reader);
    } //-- java.lang.Object unmarshalKeyType(java.io.Reader) 

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
