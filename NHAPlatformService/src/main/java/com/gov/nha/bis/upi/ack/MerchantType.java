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
 * Class MerchantType.
 * 
 * @version $Revision$ $Date$
 */
public class MerchantType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _identifier
     */
    private com.gov.nha.bis.upi.ack.IdentifierType _identifier;

    /**
     * Field _name
     */
    private com.gov.nha.bis.upi.ack.NameType _name;

    /**
     * Field _ownership
     */
    private com.gov.nha.bis.upi.ack.MerchantOwnership _ownership;

    /**
     * Field _invoice
     */
    private com.gov.nha.bis.upi.ack.InvoiceType _invoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public MerchantType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.MerchantType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'identifier'.
     * 
     * @return IdentifierType
     * @return the value of field 'identifier'.
     */
    public com.gov.nha.bis.upi.ack.IdentifierType getIdentifier()
    {
        return this._identifier;
    } //-- com.gov.nha.bis.upi.ack.IdentifierType getIdentifier() 

    /**
     * Returns the value of field 'invoice'.
     * 
     * @return InvoiceType
     * @return the value of field 'invoice'.
     */
    public com.gov.nha.bis.upi.ack.InvoiceType getInvoice()
    {
        return this._invoice;
    } //-- com.gov.nha.bis.upi.ack.InvoiceType getInvoice() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return NameType
     * @return the value of field 'name'.
     */
    public com.gov.nha.bis.upi.ack.NameType getName()
    {
        return this._name;
    } //-- com.gov.nha.bis.upi.ack.NameType getName() 

    /**
     * Returns the value of field 'ownership'.
     * 
     * @return MerchantOwnership
     * @return the value of field 'ownership'.
     */
    public com.gov.nha.bis.upi.ack.MerchantOwnership getOwnership()
    {
        return this._ownership;
    } //-- com.gov.nha.bis.upi.ack.MerchantOwnership getOwnership() 

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
     * Sets the value of field 'identifier'.
     * 
     * @param identifier the value of field 'identifier'.
     */
    public void setIdentifier(com.gov.nha.bis.upi.ack.IdentifierType identifier)
    {
        this._identifier = identifier;
    } //-- void setIdentifier(com.gov.nha.bis.upi.ack.IdentifierType) 

    /**
     * Sets the value of field 'invoice'.
     * 
     * @param invoice the value of field 'invoice'.
     */
    public void setInvoice(com.gov.nha.bis.upi.ack.InvoiceType invoice)
    {
        this._invoice = invoice;
    } //-- void setInvoice(com.gov.nha.bis.upi.ack.InvoiceType) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(com.gov.nha.bis.upi.ack.NameType name)
    {
        this._name = name;
    } //-- void setName(com.gov.nha.bis.upi.ack.NameType) 

    /**
     * Sets the value of field 'ownership'.
     * 
     * @param ownership the value of field 'ownership'.
     */
    public void setOwnership(com.gov.nha.bis.upi.ack.MerchantOwnership ownership)
    {
        this._ownership = ownership;
    } //-- void setOwnership(com.gov.nha.bis.upi.ack.MerchantOwnership) 

    /**
     * Method unmarshalMerchantType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalMerchantType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.MerchantType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.MerchantType.class, reader);
    } //-- java.lang.Object unmarshalMerchantType(java.io.Reader) 

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
