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
 * Class CredsType.
 * 
 * @version $Revision$ $Date$
 */
public class CredsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ki
     */
    private java.lang.String _ki;

    /**
     * Field _credList
     */
    private java.util.ArrayList _credList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CredsType() 
     {
        super();
        _credList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.CredsType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCred
     * 
     * 
     * 
     * @param vCred
     */
    public void addCred(com.gov.nha.bis.upi.ack.Cred vCred)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_credList.size() < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _credList.add(vCred);
    } //-- void addCred(com.gov.nha.bis.upi.ack.Cred) 

    /**
     * Method addCred
     * 
     * 
     * 
     * @param index
     * @param vCred
     */
    public void addCred(int index, com.gov.nha.bis.upi.ack.Cred vCred)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_credList.size() < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _credList.add(index, vCred);
    } //-- void addCred(int, com.gov.nha.bis.upi.ack.Cred) 

    /**
     * Method clearCred
     * 
     */
    public void clearCred()
    {
        _credList.clear();
    } //-- void clearCred() 

    /**
     * Method enumerateCred
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateCred()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_credList.iterator());
    } //-- java.util.Enumeration enumerateCred() 

    /**
     * Method getCred
     * 
     * 
     * 
     * @param index
     * @return Cred
     */
    public com.gov.nha.bis.upi.ack.Cred getCred(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _credList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Cred) _credList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Cred getCred(int) 

    /**
     * Method getCred
     * 
     * 
     * 
     * @return Cred
     */
    public com.gov.nha.bis.upi.ack.Cred[] getCred()
    {
        int size = _credList.size();
        com.gov.nha.bis.upi.ack.Cred[] mArray = new com.gov.nha.bis.upi.ack.Cred[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Cred) _credList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Cred[] getCred() 

    /**
     * Method getCredCount
     * 
     * 
     * 
     * @return int
     */
    public int getCredCount()
    {
        return _credList.size();
    } //-- int getCredCount() 

    /**
     * Returns the value of field 'ki'.
     * 
     * @return String
     * @return the value of field 'ki'.
     */
    public java.lang.String getKi()
    {
        return this._ki;
    } //-- java.lang.String getKi() 

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
     * Method removeCred
     * 
     * 
     * 
     * @param vCred
     * @return boolean
     */
    public boolean removeCred(com.gov.nha.bis.upi.ack.Cred vCred)
    {
        boolean removed = _credList.remove(vCred);
        return removed;
    } //-- boolean removeCred(com.gov.nha.bis.upi.ack.Cred) 

    /**
     * Method setCred
     * 
     * 
     * 
     * @param index
     * @param vCred
     */
    public void setCred(int index, com.gov.nha.bis.upi.ack.Cred vCred)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _credList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _credList.set(index, vCred);
    } //-- void setCred(int, com.gov.nha.bis.upi.ack.Cred) 

    /**
     * Method setCred
     * 
     * 
     * 
     * @param credArray
     */
    public void setCred(com.gov.nha.bis.upi.ack.Cred[] credArray)
    {
        //-- copy array
        _credList.clear();
        for (int i = 0; i < credArray.length; i++) {
            _credList.add(credArray[i]);
        }
    } //-- void setCred(com.gov.nha.bis.upi.ack.Cred) 

    /**
     * Sets the value of field 'ki'.
     * 
     * @param ki the value of field 'ki'.
     */
    public void setKi(java.lang.String ki)
    {
        this._ki = ki;
    } //-- void setKi(java.lang.String) 

    /**
     * Method unmarshalCredsType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalCredsType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.CredsType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.CredsType.class, reader);
    } //-- java.lang.Object unmarshalCredsType(java.io.Reader) 

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
