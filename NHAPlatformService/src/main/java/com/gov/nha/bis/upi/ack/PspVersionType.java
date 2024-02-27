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

import com.gov.nha.bis.upi.ack.types.PspVersionDesc;
import com.gov.nha.bis.upi.ack.types.PspVersionMandatory;
import com.gov.nha.bis.upi.ack.types.PspVersionNo;
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
 * Class PspVersionType.
 * 
 * @version $Revision$ $Date$
 */
public class PspVersionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _no
     */
    private com.gov.nha.bis.upi.ack.types.PspVersionNo _no;

    /**
     * Field _description
     */
    private com.gov.nha.bis.upi.ack.types.PspVersionDesc _description;

    /**
     * Field _mandatory
     */
    private com.gov.nha.bis.upi.ack.types.PspVersionMandatory _mandatory;


      //----------------/
     //- Constructors -/
    //----------------/

    public PspVersionType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.PspVersionType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'description'.
     * 
     * @return PspVersionDesc
     * @return the value of field 'description'.
     */
    public com.gov.nha.bis.upi.ack.types.PspVersionDesc getDescription()
    {
        return this._description;
    } //-- com.gov.nha.bis.upi.ack.types.PspVersionDesc getDescription() 

    /**
     * Returns the value of field 'mandatory'.
     * 
     * @return PspVersionMandatory
     * @return the value of field 'mandatory'.
     */
    public com.gov.nha.bis.upi.ack.types.PspVersionMandatory getMandatory()
    {
        return this._mandatory;
    } //-- com.gov.nha.bis.upi.ack.types.PspVersionMandatory getMandatory() 

    /**
     * Returns the value of field 'no'.
     * 
     * @return PspVersionNo
     * @return the value of field 'no'.
     */
    public com.gov.nha.bis.upi.ack.types.PspVersionNo getNo()
    {
        return this._no;
    } //-- com.gov.nha.bis.upi.ack.types.PspVersionNo getNo() 

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
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(com.gov.nha.bis.upi.ack.types.PspVersionDesc description)
    {
        this._description = description;
    } //-- void setDescription(com.gov.nha.bis.upi.ack.types.PspVersionDesc) 

    /**
     * Sets the value of field 'mandatory'.
     * 
     * @param mandatory the value of field 'mandatory'.
     */
    public void setMandatory(com.gov.nha.bis.upi.ack.types.PspVersionMandatory mandatory)
    {
        this._mandatory = mandatory;
    } //-- void setMandatory(com.gov.nha.bis.upi.ack.types.PspVersionMandatory) 

    /**
     * Sets the value of field 'no'.
     * 
     * @param no the value of field 'no'.
     */
    public void setNo(com.gov.nha.bis.upi.ack.types.PspVersionNo no)
    {
        this._no = no;
    } //-- void setNo(com.gov.nha.bis.upi.ack.types.PspVersionNo) 

    /**
     * Method unmarshalPspVersionType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalPspVersionType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.PspVersionType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.PspVersionType.class, reader);
    } //-- java.lang.Object unmarshalPspVersionType(java.io.Reader) 

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
