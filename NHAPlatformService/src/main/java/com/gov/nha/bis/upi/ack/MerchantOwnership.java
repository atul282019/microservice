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

import com.gov.nha.bis.upi.ack.types.OwnershipType;
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
 * Class MerchantOwnership.
 * 
 * @version $Revision$ $Date$
 */
public class MerchantOwnership implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.OwnershipType _type;


      //----------------/
     //- Constructors -/
    //----------------/

    public MerchantOwnership() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.MerchantOwnership()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'type'.
     * 
     * @return OwnershipType
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.OwnershipType getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.OwnershipType getType() 

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
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.OwnershipType type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.OwnershipType) 

    /**
     * Method unmarshalMerchantOwnership
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalMerchantOwnership(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.MerchantOwnership) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.MerchantOwnership.class, reader);
    } //-- java.lang.Object unmarshalMerchantOwnership(java.io.Reader) 

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
