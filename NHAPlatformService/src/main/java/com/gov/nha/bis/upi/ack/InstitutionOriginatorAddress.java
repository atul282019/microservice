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
 * Class InstitutionOriginatorAddress.
 * 
 * @version $Revision$ $Date$
 */
public class InstitutionOriginatorAddress implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _location
     */
    private java.lang.String _location;

    /**
     * Field _city
     */
    private java.lang.String _city;

    /**
     * Field _country
     */
    private java.lang.String _country;

    /**
     * Field _geocode
     */
    private java.lang.String _geocode;


      //----------------/
     //- Constructors -/
    //----------------/

    public InstitutionOriginatorAddress() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.InstitutionOriginatorAddress()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'city'.
     * 
     * @return String
     * @return the value of field 'city'.
     */
    public java.lang.String getCity()
    {
        return this._city;
    } //-- java.lang.String getCity() 

    /**
     * Returns the value of field 'country'.
     * 
     * @return String
     * @return the value of field 'country'.
     */
    public java.lang.String getCountry()
    {
        return this._country;
    } //-- java.lang.String getCountry() 

    /**
     * Returns the value of field 'geocode'.
     * 
     * @return String
     * @return the value of field 'geocode'.
     */
    public java.lang.String getGeocode()
    {
        return this._geocode;
    } //-- java.lang.String getGeocode() 

    /**
     * Returns the value of field 'location'.
     * 
     * @return String
     * @return the value of field 'location'.
     */
    public java.lang.String getLocation()
    {
        return this._location;
    } //-- java.lang.String getLocation() 

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
     * Sets the value of field 'city'.
     * 
     * @param city the value of field 'city'.
     */
    public void setCity(java.lang.String city)
    {
        this._city = city;
    } //-- void setCity(java.lang.String) 

    /**
     * Sets the value of field 'country'.
     * 
     * @param country the value of field 'country'.
     */
    public void setCountry(java.lang.String country)
    {
        this._country = country;
    } //-- void setCountry(java.lang.String) 

    /**
     * Sets the value of field 'geocode'.
     * 
     * @param geocode the value of field 'geocode'.
     */
    public void setGeocode(java.lang.String geocode)
    {
        this._geocode = geocode;
    } //-- void setGeocode(java.lang.String) 

    /**
     * Sets the value of field 'location'.
     * 
     * @param location the value of field 'location'.
     */
    public void setLocation(java.lang.String location)
    {
        this._location = location;
    } //-- void setLocation(java.lang.String) 

    /**
     * Method unmarshalInstitutionOriginatorAddress
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalInstitutionOriginatorAddress(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.InstitutionOriginatorAddress) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.InstitutionOriginatorAddress.class, reader);
    } //-- java.lang.Object unmarshalInstitutionOriginatorAddress(java.io.Reader) 

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
