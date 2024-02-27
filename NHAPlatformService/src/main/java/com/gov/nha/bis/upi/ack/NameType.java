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
 * Class NameType.
 * 
 * @version $Revision$ $Date$
 */
public class NameType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _brand
     */
    private java.lang.String _brand;

    /**
     * Field _legal
     */
    private java.lang.String _legal;

    /**
     * Field _franchise
     */
    private java.lang.String _franchise;


      //----------------/
     //- Constructors -/
    //----------------/

    public NameType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.NameType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'brand'.
     * 
     * @return String
     * @return the value of field 'brand'.
     */
    public java.lang.String getBrand()
    {
        return this._brand;
    } //-- java.lang.String getBrand() 

    /**
     * Returns the value of field 'franchise'.
     * 
     * @return String
     * @return the value of field 'franchise'.
     */
    public java.lang.String getFranchise()
    {
        return this._franchise;
    } //-- java.lang.String getFranchise() 

    /**
     * Returns the value of field 'legal'.
     * 
     * @return String
     * @return the value of field 'legal'.
     */
    public java.lang.String getLegal()
    {
        return this._legal;
    } //-- java.lang.String getLegal() 

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
     * Sets the value of field 'brand'.
     * 
     * @param brand the value of field 'brand'.
     */
    public void setBrand(java.lang.String brand)
    {
        this._brand = brand;
    } //-- void setBrand(java.lang.String) 

    /**
     * Sets the value of field 'franchise'.
     * 
     * @param franchise the value of field 'franchise'.
     */
    public void setFranchise(java.lang.String franchise)
    {
        this._franchise = franchise;
    } //-- void setFranchise(java.lang.String) 

    /**
     * Sets the value of field 'legal'.
     * 
     * @param legal the value of field 'legal'.
     */
    public void setLegal(java.lang.String legal)
    {
        this._legal = legal;
    } //-- void setLegal(java.lang.String) 

    /**
     * Method unmarshalNameType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalNameType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.NameType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.NameType.class, reader);
    } //-- java.lang.Object unmarshalNameType(java.io.Reader) 

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
