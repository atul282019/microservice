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

import com.gov.nha.bis.upi.ack.types.IdentityConstant;
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
 * Class IdentityType.
 * 
 * @version $Revision$ $Date$
 */
public class IdentityType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.IdentityConstant _type;

    /**
     * Field _verifiedName
     */
    private java.lang.String _verifiedName;

    /**
     * Field _id
     */
    private java.lang.String _id;


      //----------------/
     //- Constructors -/
    //----------------/

    public IdentityType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.IdentityType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'id'.
     * 
     * @return String
     * @return the value of field 'id'.
     */
    public java.lang.String getId()
    {
        return this._id;
    } //-- java.lang.String getId() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return IdentityConstant
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.IdentityConstant getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.IdentityConstant getType() 

    /**
     * Returns the value of field 'verifiedName'.
     * 
     * @return String
     * @return the value of field 'verifiedName'.
     */
    public java.lang.String getVerifiedName()
    {
        return this._verifiedName;
    } //-- java.lang.String getVerifiedName() 

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
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(java.lang.String id)
    {
        this._id = id;
    } //-- void setId(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.IdentityConstant type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.IdentityConstant) 

    /**
     * Sets the value of field 'verifiedName'.
     * 
     * @param verifiedName the value of field 'verifiedName'.
     */
    public void setVerifiedName(java.lang.String verifiedName)
    {
        this._verifiedName = verifiedName;
    } //-- void setVerifiedName(java.lang.String) 

    /**
     * Method unmarshalIdentityType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalIdentityType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.IdentityType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.IdentityType.class, reader);
    } //-- java.lang.Object unmarshalIdentityType(java.io.Reader) 

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
