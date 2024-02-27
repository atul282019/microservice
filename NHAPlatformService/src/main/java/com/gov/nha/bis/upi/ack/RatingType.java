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

import com.gov.nha.bis.upi.ack.types.WhiteListedConstant;
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
 * Class RatingType.
 * 
 * @version $Revision$ $Date$
 */
public class RatingType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * Field _verifiedAddress
     */
    private com.gov.nha.bis.upi.ack.types.WhiteListedConstant _verifiedAddress;


      //----------------/
     //- Constructors -/
    //----------------/

    public RatingType() 
     {
        super();
        setContent("");
    } //-- com.gov.nha.bis.upi.ack.RatingType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return String
     * @return the value of field 'content'.
     */
    public java.lang.String getContent()
    {
        return this._content;
    } //-- java.lang.String getContent() 

    /**
     * Returns the value of field 'verifiedAddress'.
     * 
     * @return WhiteListedConstant
     * @return the value of field 'verifiedAddress'.
     */
    public com.gov.nha.bis.upi.ack.types.WhiteListedConstant getVerifiedAddress()
    {
        return this._verifiedAddress;
    } //-- com.gov.nha.bis.upi.ack.types.WhiteListedConstant getVerifiedAddress() 

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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(java.lang.String content)
    {
        this._content = content;
    } //-- void setContent(java.lang.String) 

    /**
     * Sets the value of field 'verifiedAddress'.
     * 
     * @param verifiedAddress the value of field 'verifiedAddress'.
     */
    public void setVerifiedAddress(com.gov.nha.bis.upi.ack.types.WhiteListedConstant verifiedAddress)
    {
        this._verifiedAddress = verifiedAddress;
    } //-- void setVerifiedAddress(com.gov.nha.bis.upi.ack.types.WhiteListedConstant) 

    /**
     * Method unmarshalRatingType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRatingType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RatingType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RatingType.class, reader);
    } //-- java.lang.Object unmarshalRatingType(java.io.Reader) 

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
