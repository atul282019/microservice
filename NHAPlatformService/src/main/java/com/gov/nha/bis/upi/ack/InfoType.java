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
 * Class InfoType.
 * 
 * @version $Revision$ $Date$
 */
public class InfoType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _identity
     */
    private com.gov.nha.bis.upi.ack.IdentityType _identity;

    /**
     * Field _rating
     */
    private com.gov.nha.bis.upi.ack.RatingType _rating;


      //----------------/
     //- Constructors -/
    //----------------/

    public InfoType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.InfoType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'identity'.
     * 
     * @return IdentityType
     * @return the value of field 'identity'.
     */
    public com.gov.nha.bis.upi.ack.IdentityType getIdentity()
    {
        return this._identity;
    } //-- com.gov.nha.bis.upi.ack.IdentityType getIdentity() 

    /**
     * Returns the value of field 'rating'.
     * 
     * @return RatingType
     * @return the value of field 'rating'.
     */
    public com.gov.nha.bis.upi.ack.RatingType getRating()
    {
        return this._rating;
    } //-- com.gov.nha.bis.upi.ack.RatingType getRating() 

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
     * Sets the value of field 'identity'.
     * 
     * @param identity the value of field 'identity'.
     */
    public void setIdentity(com.gov.nha.bis.upi.ack.IdentityType identity)
    {
        this._identity = identity;
    } //-- void setIdentity(com.gov.nha.bis.upi.ack.IdentityType) 

    /**
     * Sets the value of field 'rating'.
     * 
     * @param rating the value of field 'rating'.
     */
    public void setRating(com.gov.nha.bis.upi.ack.RatingType rating)
    {
        this._rating = rating;
    } //-- void setRating(com.gov.nha.bis.upi.ack.RatingType) 

    /**
     * Method unmarshalInfoType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalInfoType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.InfoType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.InfoType.class, reader);
    } //-- java.lang.Object unmarshalInfoType(java.io.Reader) 

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
