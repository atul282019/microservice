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

import com.gov.nha.bis.upi.ack.types.InstitutionOrginatorType;
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
 * Class InstitutionOriginator.
 * 
 * @version $Revision$ $Date$
 */
public class InstitutionOriginator implements java.io.Serializable {


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
    private com.gov.nha.bis.upi.ack.types.InstitutionOrginatorType _type;

    /**
     * Field _refNo
     */
    private java.lang.String _refNo;

    /**
     * Field _address
     */
    private com.gov.nha.bis.upi.ack.InstitutionOriginatorAddress _address;


      //----------------/
     //- Constructors -/
    //----------------/

    public InstitutionOriginator() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.InstitutionOriginator()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'address'.
     * 
     * @return InstitutionOriginatorAddress
     * @return the value of field 'address'.
     */
    public com.gov.nha.bis.upi.ack.InstitutionOriginatorAddress getAddress()
    {
        return this._address;
    } //-- com.gov.nha.bis.upi.ack.InstitutionOriginatorAddress getAddress() 

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
     * Returns the value of field 'refNo'.
     * 
     * @return String
     * @return the value of field 'refNo'.
     */
    public java.lang.String getRefNo()
    {
        return this._refNo;
    } //-- java.lang.String getRefNo() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return InstitutionOrginatorType
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.InstitutionOrginatorType getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.InstitutionOrginatorType getType() 

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
     * Sets the value of field 'address'.
     * 
     * @param address the value of field 'address'.
     */
    public void setAddress(com.gov.nha.bis.upi.ack.InstitutionOriginatorAddress address)
    {
        this._address = address;
    } //-- void setAddress(com.gov.nha.bis.upi.ack.InstitutionOriginatorAddress) 

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
     * Sets the value of field 'refNo'.
     * 
     * @param refNo the value of field 'refNo'.
     */
    public void setRefNo(java.lang.String refNo)
    {
        this._refNo = refNo;
    } //-- void setRefNo(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.InstitutionOrginatorType type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.InstitutionOrginatorType) 

    /**
     * Method unmarshalInstitutionOriginator
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalInstitutionOriginator(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.InstitutionOriginator) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.InstitutionOriginator.class, reader);
    } //-- java.lang.Object unmarshalInstitutionOriginator(java.io.Reader) 

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
