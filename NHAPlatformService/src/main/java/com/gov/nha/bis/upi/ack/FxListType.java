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
 * Class FxListType.
 * 
 * @version $Revision$ $Date$
 */
public class FxListType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fxList
     */
    private java.util.ArrayList _fxList;


      //----------------/
     //- Constructors -/
    //----------------/

    public FxListType() 
     {
        super();
        _fxList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.FxListType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addFx
     * 
     * 
     * 
     * @param vFx
     */
    public void addFx(com.gov.nha.bis.upi.ack.Fx vFx)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_fxList.size() < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _fxList.add(vFx);
    } //-- void addFx(com.gov.nha.bis.upi.ack.Fx) 

    /**
     * Method addFx
     * 
     * 
     * 
     * @param index
     * @param vFx
     */
    public void addFx(int index, com.gov.nha.bis.upi.ack.Fx vFx)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_fxList.size() < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _fxList.add(index, vFx);
    } //-- void addFx(int, com.gov.nha.bis.upi.ack.Fx) 

    /**
     * Method clearFx
     * 
     */
    public void clearFx()
    {
        _fxList.clear();
    } //-- void clearFx() 

    /**
     * Method enumerateFx
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateFx()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_fxList.iterator());
    } //-- java.util.Enumeration enumerateFx() 

    /**
     * Method getFx
     * 
     * 
     * 
     * @param index
     * @return Fx
     */
    public com.gov.nha.bis.upi.ack.Fx getFx(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _fxList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Fx) _fxList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Fx getFx(int) 

    /**
     * Method getFx
     * 
     * 
     * 
     * @return Fx
     */
    public com.gov.nha.bis.upi.ack.Fx[] getFx()
    {
        int size = _fxList.size();
        com.gov.nha.bis.upi.ack.Fx[] mArray = new com.gov.nha.bis.upi.ack.Fx[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Fx) _fxList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Fx[] getFx() 

    /**
     * Method getFxCount
     * 
     * 
     * 
     * @return int
     */
    public int getFxCount()
    {
        return _fxList.size();
    } //-- int getFxCount() 

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
     * Method removeFx
     * 
     * 
     * 
     * @param vFx
     * @return boolean
     */
    public boolean removeFx(com.gov.nha.bis.upi.ack.Fx vFx)
    {
        boolean removed = _fxList.remove(vFx);
        return removed;
    } //-- boolean removeFx(com.gov.nha.bis.upi.ack.Fx) 

    /**
     * Method setFx
     * 
     * 
     * 
     * @param index
     * @param vFx
     */
    public void setFx(int index, com.gov.nha.bis.upi.ack.Fx vFx)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _fxList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _fxList.set(index, vFx);
    } //-- void setFx(int, com.gov.nha.bis.upi.ack.Fx) 

    /**
     * Method setFx
     * 
     * 
     * 
     * @param fxArray
     */
    public void setFx(com.gov.nha.bis.upi.ack.Fx[] fxArray)
    {
        //-- copy array
        _fxList.clear();
        for (int i = 0; i < fxArray.length; i++) {
            _fxList.add(fxArray[i]);
        }
    } //-- void setFx(com.gov.nha.bis.upi.ack.Fx) 

    /**
     * Method unmarshalFxListType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalFxListType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.FxListType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.FxListType.class, reader);
    } //-- java.lang.Object unmarshalFxListType(java.io.Reader) 

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
