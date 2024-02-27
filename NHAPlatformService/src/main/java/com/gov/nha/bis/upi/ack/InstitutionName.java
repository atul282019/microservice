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
 * Class InstitutionName.
 * 
 * @version $Revision$ $Date$
 */
public class InstitutionName implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _value
     */
    private java.lang.String _value;

    /**
     * Field _acNum
     */
    private java.lang.String _acNum;

    /**
     * Field _ifsc
     */
    private java.lang.String _ifsc;


      //----------------/
     //- Constructors -/
    //----------------/

    public InstitutionName() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.InstitutionName()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acNum'.
     * 
     * @return String
     * @return the value of field 'acNum'.
     */
    public java.lang.String getAcNum()
    {
        return this._acNum;
    } //-- java.lang.String getAcNum() 

    /**
     * Returns the value of field 'ifsc'.
     * 
     * @return String
     * @return the value of field 'ifsc'.
     */
    public java.lang.String getIfsc()
    {
        return this._ifsc;
    } //-- java.lang.String getIfsc() 

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
     * Sets the value of field 'acNum'.
     * 
     * @param acNum the value of field 'acNum'.
     */
    public void setAcNum(java.lang.String acNum)
    {
        this._acNum = acNum;
    } //-- void setAcNum(java.lang.String) 

    /**
     * Sets the value of field 'ifsc'.
     * 
     * @param ifsc the value of field 'ifsc'.
     */
    public void setIfsc(java.lang.String ifsc)
    {
        this._ifsc = ifsc;
    } //-- void setIfsc(java.lang.String) 

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
     * Method unmarshalInstitutionName
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalInstitutionName(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.InstitutionName) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.InstitutionName.class, reader);
    } //-- java.lang.Object unmarshalInstitutionName(java.io.Reader) 

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
