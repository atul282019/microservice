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

import com.gov.nha.bis.upi.ack.types.MapperIdType;
import com.gov.nha.bis.upi.ack.types.OpType;
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
 * Class TxnConfirmationType.
 * 
 * @version $Revision$ $Date$
 */
public class TxnConfirmationType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _note
     */
    private java.lang.String _note;

    /**
     * Field _orgStatus
     */
    private java.lang.String _orgStatus;

    /**
     * Field _orgErrorCode
     */
    private java.lang.String _orgErrorCode;

    /**
     * Field _op
     */
    private com.gov.nha.bis.upi.ack.types.OpType _op;

    /**
     * Field _idType
     */
    private com.gov.nha.bis.upi.ack.types.MapperIdType _idType;

    /**
     * Field _refs
     */
    private com.gov.nha.bis.upi.ack.MapperConfRefType _refs;

    /**
     * Field _consent
     */
    private com.gov.nha.bis.upi.ack.ConsentType _consent;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnConfirmationType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.TxnConfirmationType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'consent'.
     * 
     * @return ConsentType
     * @return the value of field 'consent'.
     */
    public com.gov.nha.bis.upi.ack.ConsentType getConsent()
    {
        return this._consent;
    } //-- com.gov.nha.bis.upi.ack.ConsentType getConsent() 

    /**
     * Returns the value of field 'idType'.
     * 
     * @return MapperIdType
     * @return the value of field 'idType'.
     */
    public com.gov.nha.bis.upi.ack.types.MapperIdType getIdType()
    {
        return this._idType;
    } //-- com.gov.nha.bis.upi.ack.types.MapperIdType getIdType() 

    /**
     * Returns the value of field 'note'.
     * 
     * @return String
     * @return the value of field 'note'.
     */
    public java.lang.String getNote()
    {
        return this._note;
    } //-- java.lang.String getNote() 

    /**
     * Returns the value of field 'op'.
     * 
     * @return OpType
     * @return the value of field 'op'.
     */
    public com.gov.nha.bis.upi.ack.types.OpType getOp()
    {
        return this._op;
    } //-- com.gov.nha.bis.upi.ack.types.OpType getOp() 

    /**
     * Returns the value of field 'orgErrorCode'.
     * 
     * @return String
     * @return the value of field 'orgErrorCode'.
     */
    public java.lang.String getOrgErrorCode()
    {
        return this._orgErrorCode;
    } //-- java.lang.String getOrgErrorCode() 

    /**
     * Returns the value of field 'orgStatus'.
     * 
     * @return String
     * @return the value of field 'orgStatus'.
     */
    public java.lang.String getOrgStatus()
    {
        return this._orgStatus;
    } //-- java.lang.String getOrgStatus() 

    /**
     * Returns the value of field 'refs'.
     * 
     * @return MapperConfRefType
     * @return the value of field 'refs'.
     */
    public com.gov.nha.bis.upi.ack.MapperConfRefType getRefs()
    {
        return this._refs;
    } //-- com.gov.nha.bis.upi.ack.MapperConfRefType getRefs() 

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
     * Sets the value of field 'consent'.
     * 
     * @param consent the value of field 'consent'.
     */
    public void setConsent(com.gov.nha.bis.upi.ack.ConsentType consent)
    {
        this._consent = consent;
    } //-- void setConsent(com.gov.nha.bis.upi.ack.ConsentType) 

    /**
     * Sets the value of field 'idType'.
     * 
     * @param idType the value of field 'idType'.
     */
    public void setIdType(com.gov.nha.bis.upi.ack.types.MapperIdType idType)
    {
        this._idType = idType;
    } //-- void setIdType(com.gov.nha.bis.upi.ack.types.MapperIdType) 

    /**
     * Sets the value of field 'note'.
     * 
     * @param note the value of field 'note'.
     */
    public void setNote(java.lang.String note)
    {
        this._note = note;
    } //-- void setNote(java.lang.String) 

    /**
     * Sets the value of field 'op'.
     * 
     * @param op the value of field 'op'.
     */
    public void setOp(com.gov.nha.bis.upi.ack.types.OpType op)
    {
        this._op = op;
    } //-- void setOp(com.gov.nha.bis.upi.ack.types.OpType) 

    /**
     * Sets the value of field 'orgErrorCode'.
     * 
     * @param orgErrorCode the value of field 'orgErrorCode'.
     */
    public void setOrgErrorCode(java.lang.String orgErrorCode)
    {
        this._orgErrorCode = orgErrorCode;
    } //-- void setOrgErrorCode(java.lang.String) 

    /**
     * Sets the value of field 'orgStatus'.
     * 
     * @param orgStatus the value of field 'orgStatus'.
     */
    public void setOrgStatus(java.lang.String orgStatus)
    {
        this._orgStatus = orgStatus;
    } //-- void setOrgStatus(java.lang.String) 

    /**
     * Sets the value of field 'refs'.
     * 
     * @param refs the value of field 'refs'.
     */
    public void setRefs(com.gov.nha.bis.upi.ack.MapperConfRefType refs)
    {
        this._refs = refs;
    } //-- void setRefs(com.gov.nha.bis.upi.ack.MapperConfRefType) 

    /**
     * Method unmarshalTxnConfirmationType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalTxnConfirmationType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.TxnConfirmationType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.TxnConfirmationType.class, reader);
    } //-- java.lang.Object unmarshalTxnConfirmationType(java.io.Reader) 

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
