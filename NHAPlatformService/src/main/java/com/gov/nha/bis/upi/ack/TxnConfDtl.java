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

import com.gov.nha.bis.upi.ack.types.PayConstant;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class TxnConfDtl.
 * 
 * @version $Revision$ $Date$
 */
public class TxnConfDtl implements java.io.Serializable {


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
     * Field _orgErrCode
     */
    private java.lang.String _orgErrCode;

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.PayConstant _type;

    /**
     * Field _actn
     */
    private java.lang.String _actn;

    /**
     * Field _refList
     */
    private java.util.ArrayList _refList;

    /**
     * Field _consent
     */
    private com.gov.nha.bis.upi.ack.ConsentType _consent;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnConfDtl() 
     {
        super();
        _refList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.TxnConfDtl()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addRef
     * 
     * 
     * 
     * @param vRef
     */
    public void addRef(com.gov.nha.bis.upi.ack.Ref vRef)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_refList.size() < 50)) {
            throw new IndexOutOfBoundsException();
        }
        _refList.add(vRef);
    } //-- void addRef(com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Method addRef
     * 
     * 
     * 
     * @param index
     * @param vRef
     */
    public void addRef(int index, com.gov.nha.bis.upi.ack.Ref vRef)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_refList.size() < 50)) {
            throw new IndexOutOfBoundsException();
        }
        _refList.add(index, vRef);
    } //-- void addRef(int, com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Method clearRef
     * 
     */
    public void clearRef()
    {
        _refList.clear();
    } //-- void clearRef() 

    /**
     * Method enumerateRef
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateRef()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_refList.iterator());
    } //-- java.util.Enumeration enumerateRef() 

    /**
     * Returns the value of field 'actn'.
     * 
     * @return String
     * @return the value of field 'actn'.
     */
    public java.lang.String getActn()
    {
        return this._actn;
    } //-- java.lang.String getActn() 

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
     * Returns the value of field 'orgErrCode'.
     * 
     * @return String
     * @return the value of field 'orgErrCode'.
     */
    public java.lang.String getOrgErrCode()
    {
        return this._orgErrCode;
    } //-- java.lang.String getOrgErrCode() 

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
     * Method getRef
     * 
     * 
     * 
     * @param index
     * @return Ref
     */
    public com.gov.nha.bis.upi.ack.Ref getRef(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _refList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Ref) _refList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Ref getRef(int) 

    /**
     * Method getRef
     * 
     * 
     * 
     * @return Ref
     */
    public com.gov.nha.bis.upi.ack.Ref[] getRef()
    {
        int size = _refList.size();
        com.gov.nha.bis.upi.ack.Ref[] mArray = new com.gov.nha.bis.upi.ack.Ref[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Ref) _refList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Ref[] getRef() 

    /**
     * Method getRefCount
     * 
     * 
     * 
     * @return int
     */
    public int getRefCount()
    {
        return _refList.size();
    } //-- int getRefCount() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return PayConstant
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.PayConstant getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.PayConstant getType() 

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
     * Method removeRef
     * 
     * 
     * 
     * @param vRef
     * @return boolean
     */
    public boolean removeRef(com.gov.nha.bis.upi.ack.Ref vRef)
    {
        boolean removed = _refList.remove(vRef);
        return removed;
    } //-- boolean removeRef(com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Sets the value of field 'actn'.
     * 
     * @param actn the value of field 'actn'.
     */
    public void setActn(java.lang.String actn)
    {
        this._actn = actn;
    } //-- void setActn(java.lang.String) 

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
     * Sets the value of field 'note'.
     * 
     * @param note the value of field 'note'.
     */
    public void setNote(java.lang.String note)
    {
        this._note = note;
    } //-- void setNote(java.lang.String) 

    /**
     * Sets the value of field 'orgErrCode'.
     * 
     * @param orgErrCode the value of field 'orgErrCode'.
     */
    public void setOrgErrCode(java.lang.String orgErrCode)
    {
        this._orgErrCode = orgErrCode;
    } //-- void setOrgErrCode(java.lang.String) 

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
     * Method setRef
     * 
     * 
     * 
     * @param index
     * @param vRef
     */
    public void setRef(int index, com.gov.nha.bis.upi.ack.Ref vRef)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _refList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 50)) {
            throw new IndexOutOfBoundsException();
        }
        _refList.set(index, vRef);
    } //-- void setRef(int, com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Method setRef
     * 
     * 
     * 
     * @param refArray
     */
    public void setRef(com.gov.nha.bis.upi.ack.Ref[] refArray)
    {
        //-- copy array
        _refList.clear();
        for (int i = 0; i < refArray.length; i++) {
            _refList.add(refArray[i]);
        }
    } //-- void setRef(com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.PayConstant type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.PayConstant) 

    /**
     * Method unmarshalTxnConfDtl
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalTxnConfDtl(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.TxnConfDtl) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.TxnConfDtl.class, reader);
    } //-- java.lang.Object unmarshalTxnConfDtl(java.io.Reader) 

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
