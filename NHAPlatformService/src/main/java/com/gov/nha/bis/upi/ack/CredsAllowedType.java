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

import com.gov.nha.bis.upi.ack.types.CredDataTypeConstant;
import com.gov.nha.bis.upi.ack.types.CredSubType;
import com.gov.nha.bis.upi.ack.types.CredType;
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
 * Class CredsAllowedType.
 * 
 * @version $Revision$ $Date$
 */
public class CredsAllowedType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.CredType _type;

    /**
     * Field _subType
     */
    private com.gov.nha.bis.upi.ack.types.CredSubType _subType;

    /**
     * Field _dType
     */
    private com.gov.nha.bis.upi.ack.types.CredDataTypeConstant _dType;

    /**
     * Field _dLength
     */
    private int _dLength;

    /**
     * keeps track of state for field: _dLength
     */
    private boolean _has_dLength;


      //----------------/
     //- Constructors -/
    //----------------/

    public CredsAllowedType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.CredsAllowedType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteDLength
     * 
     */
    public void deleteDLength()
    {
        this._has_dLength= false;
    } //-- void deleteDLength() 

    /**
     * Returns the value of field 'dLength'.
     * 
     * @return int
     * @return the value of field 'dLength'.
     */
    public int getDLength()
    {
        return this._dLength;
    } //-- int getDLength() 

    /**
     * Returns the value of field 'dType'.
     * 
     * @return CredDataTypeConstant
     * @return the value of field 'dType'.
     */
    public com.gov.nha.bis.upi.ack.types.CredDataTypeConstant getDType()
    {
        return this._dType;
    } //-- com.gov.nha.bis.upi.ack.types.CredDataTypeConstant getDType() 

    /**
     * Returns the value of field 'subType'.
     * 
     * @return CredSubType
     * @return the value of field 'subType'.
     */
    public com.gov.nha.bis.upi.ack.types.CredSubType getSubType()
    {
        return this._subType;
    } //-- com.gov.nha.bis.upi.ack.types.CredSubType getSubType() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return CredType
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.CredType getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.CredType getType() 

    /**
     * Method hasDLength
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDLength()
    {
        return this._has_dLength;
    } //-- boolean hasDLength() 

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
     * Sets the value of field 'dLength'.
     * 
     * @param dLength the value of field 'dLength'.
     */
    public void setDLength(int dLength)
    {
        this._dLength = dLength;
        this._has_dLength = true;
    } //-- void setDLength(int) 

    /**
     * Sets the value of field 'dType'.
     * 
     * @param dType the value of field 'dType'.
     */
    public void setDType(com.gov.nha.bis.upi.ack.types.CredDataTypeConstant dType)
    {
        this._dType = dType;
    } //-- void setDType(com.gov.nha.bis.upi.ack.types.CredDataTypeConstant) 

    /**
     * Sets the value of field 'subType'.
     * 
     * @param subType the value of field 'subType'.
     */
    public void setSubType(com.gov.nha.bis.upi.ack.types.CredSubType subType)
    {
        this._subType = subType;
    } //-- void setSubType(com.gov.nha.bis.upi.ack.types.CredSubType) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.CredType type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.CredType) 

    /**
     * Method unmarshalCredsAllowedType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalCredsAllowedType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.CredsAllowedType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.CredsAllowedType.class, reader);
    } //-- java.lang.Object unmarshalCredsAllowedType(java.io.Reader) 

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
