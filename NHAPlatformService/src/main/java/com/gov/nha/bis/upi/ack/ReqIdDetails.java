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
import java.util.ArrayList;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ReqIdDetails.
 * 
 * @version $Revision$ $Date$
 */
public class ReqIdDetails implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _idList
     */
    private java.util.ArrayList _idList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReqIdDetails() 
     {
        super();
        _idList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.ReqIdDetails()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addId
     * 
     * 
     * 
     * @param vId
     */
    public void addId(com.gov.nha.bis.upi.ack.Id vId)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_idList.size() < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _idList.add(vId);
    } //-- void addId(com.gov.nha.bis.upi.ack.Id) 

    /**
     * Method addId
     * 
     * 
     * 
     * @param index
     * @param vId
     */
    public void addId(int index, com.gov.nha.bis.upi.ack.Id vId)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_idList.size() < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _idList.add(index, vId);
    } //-- void addId(int, com.gov.nha.bis.upi.ack.Id) 

    /**
     * Method clearId
     * 
     */
    public void clearId()
    {
        _idList.clear();
    } //-- void clearId() 

    /**
     * Method enumerateId
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateId()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_idList.iterator());
    } //-- java.util.Enumeration enumerateId() 

    /**
     * Method getId
     * 
     * 
     * 
     * @param index
     * @return Id
     */
    public com.gov.nha.bis.upi.ack.Id getId(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _idList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Id) _idList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Id getId(int) 

    /**
     * Method getId
     * 
     * 
     * 
     * @return Id
     */
    public com.gov.nha.bis.upi.ack.Id[] getId()
    {
        int size = _idList.size();
        com.gov.nha.bis.upi.ack.Id[] mArray = new com.gov.nha.bis.upi.ack.Id[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Id) _idList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Id[] getId() 

    /**
     * Method getIdCount
     * 
     * 
     * 
     * @return int
     */
    public int getIdCount()
    {
        return _idList.size();
    } //-- int getIdCount() 

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
     * Method removeId
     * 
     * 
     * 
     * @param vId
     * @return boolean
     */
    public boolean removeId(com.gov.nha.bis.upi.ack.Id vId)
    {
        boolean removed = _idList.remove(vId);
        return removed;
    } //-- boolean removeId(com.gov.nha.bis.upi.ack.Id) 

    /**
     * Method setId
     * 
     * 
     * 
     * @param index
     * @param vId
     */
    public void setId(int index, com.gov.nha.bis.upi.ack.Id vId)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _idList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _idList.set(index, vId);
    } //-- void setId(int, com.gov.nha.bis.upi.ack.Id) 

    /**
     * Method setId
     * 
     * 
     * 
     * @param idArray
     */
    public void setId(com.gov.nha.bis.upi.ack.Id[] idArray)
    {
        //-- copy array
        _idList.clear();
        for (int i = 0; i < idArray.length; i++) {
            _idList.add(idArray[i]);
        }
    } //-- void setId(com.gov.nha.bis.upi.ack.Id) 

    /**
     * Method unmarshalReqIdDetails
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalReqIdDetails(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.ReqIdDetails) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.ReqIdDetails.class, reader);
    } //-- java.lang.Object unmarshalReqIdDetails(java.io.Reader) 

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
