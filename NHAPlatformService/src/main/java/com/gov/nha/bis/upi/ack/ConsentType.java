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

import com.gov.nha.bis.upi.ack.types.ConsentTypeEnum;
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
 * Class ConsentType.
 * 
 * @version $Revision$ $Date$
 */
public class ConsentType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.ConsentTypeEnum _type;

    /**
     * Field _value
     */
    private java.lang.String _value;

    /**
     * Field _prevVpa
     */
    private java.lang.String _prevVpa;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsentType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.ConsentType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'prevVpa'.
     * 
     * @return String
     * @return the value of field 'prevVpa'.
     */
    public java.lang.String getPrevVpa()
    {
        return this._prevVpa;
    } //-- java.lang.String getPrevVpa() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return ConsentTypeEnum
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.ConsentTypeEnum getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.ConsentTypeEnum getType() 

    /**
     * Returns the value of field 'value'.
     * 
     * @return String
     * @return the value of field 'value'.
     */
    public java.lang.String getValue()
    {
        return this._value;
    } //-- java.lang.String getValue() 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'prevVpa'.
     * 
     * @param prevVpa the value of field 'prevVpa'.
     */
    public void setPrevVpa(java.lang.String prevVpa)
    {
        this._prevVpa = prevVpa;
    } //-- void setPrevVpa(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.ConsentTypeEnum type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.ConsentTypeEnum) 

    /**
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(java.lang.String value)
    {
        this._value = value;
    } //-- void setValue(java.lang.String) 

    /**
     * Method unmarshalConsentType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalConsentType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.ConsentType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.ConsentType.class, reader);
    } //-- java.lang.Object unmarshalConsentType(java.io.Reader) 

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
