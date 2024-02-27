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
 * Class SHGInfo.
 * 
 * @version $Revision$ $Date$
 */
public class SHGInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _detailList
     */
    private java.util.ArrayList _detailList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SHGInfo() 
     {
        super();
        _detailList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.SHGInfo()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDetail
     * 
     * 
     * 
     * @param vDetail
     */
    public void addDetail(com.gov.nha.bis.upi.ack.Detail vDetail)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_detailList.size() < 50)) {
            throw new IndexOutOfBoundsException();
        }
        _detailList.add(vDetail);
    } //-- void addDetail(com.gov.nha.bis.upi.ack.Detail) 

    /**
     * Method addDetail
     * 
     * 
     * 
     * @param index
     * @param vDetail
     */
    public void addDetail(int index, com.gov.nha.bis.upi.ack.Detail vDetail)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_detailList.size() < 50)) {
            throw new IndexOutOfBoundsException();
        }
        _detailList.add(index, vDetail);
    } //-- void addDetail(int, com.gov.nha.bis.upi.ack.Detail) 

    /**
     * Method clearDetail
     * 
     */
    public void clearDetail()
    {
        _detailList.clear();
    } //-- void clearDetail() 

    /**
     * Method enumerateDetail
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateDetail()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_detailList.iterator());
    } //-- java.util.Enumeration enumerateDetail() 

    /**
     * Method getDetail
     * 
     * 
     * 
     * @param index
     * @return Detail
     */
    public com.gov.nha.bis.upi.ack.Detail getDetail(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _detailList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Detail) _detailList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Detail getDetail(int) 

    /**
     * Method getDetail
     * 
     * 
     * 
     * @return Detail
     */
    public com.gov.nha.bis.upi.ack.Detail[] getDetail()
    {
        int size = _detailList.size();
        com.gov.nha.bis.upi.ack.Detail[] mArray = new com.gov.nha.bis.upi.ack.Detail[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Detail) _detailList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Detail[] getDetail() 

    /**
     * Method getDetailCount
     * 
     * 
     * 
     * @return int
     */
    public int getDetailCount()
    {
        return _detailList.size();
    } //-- int getDetailCount() 

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
     * Method removeDetail
     * 
     * 
     * 
     * @param vDetail
     * @return boolean
     */
    public boolean removeDetail(com.gov.nha.bis.upi.ack.Detail vDetail)
    {
        boolean removed = _detailList.remove(vDetail);
        return removed;
    } //-- boolean removeDetail(com.gov.nha.bis.upi.ack.Detail) 

    /**
     * Method setDetail
     * 
     * 
     * 
     * @param index
     * @param vDetail
     */
    public void setDetail(int index, com.gov.nha.bis.upi.ack.Detail vDetail)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _detailList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 50)) {
            throw new IndexOutOfBoundsException();
        }
        _detailList.set(index, vDetail);
    } //-- void setDetail(int, com.gov.nha.bis.upi.ack.Detail) 

    /**
     * Method setDetail
     * 
     * 
     * 
     * @param detailArray
     */
    public void setDetail(com.gov.nha.bis.upi.ack.Detail[] detailArray)
    {
        //-- copy array
        _detailList.clear();
        for (int i = 0; i < detailArray.length; i++) {
            _detailList.add(detailArray[i]);
        }
    } //-- void setDetail(com.gov.nha.bis.upi.ack.Detail) 

    /**
     * Method unmarshalSHGInfo
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalSHGInfo(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.SHGInfo) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.SHGInfo.class, reader);
    } //-- java.lang.Object unmarshalSHGInfo(java.io.Reader) 

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
