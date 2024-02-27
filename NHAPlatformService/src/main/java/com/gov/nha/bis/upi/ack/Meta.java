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
 * Class Meta.
 * 
 * @version $Revision$ $Date$
 */
public class Meta implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tagList
     */
    private java.util.ArrayList _tagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Meta() 
     {
        super();
        _tagList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.Meta()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTag
     * 
     * 
     * 
     * @param vTag
     */
    public void addTag(com.gov.nha.bis.upi.ack.Tag vTag)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_tagList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _tagList.add(vTag);
    } //-- void addTag(com.gov.nha.bis.upi.ack.Tag) 

    /**
     * Method addTag
     * 
     * 
     * 
     * @param index
     * @param vTag
     */
    public void addTag(int index, com.gov.nha.bis.upi.ack.Tag vTag)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_tagList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _tagList.add(index, vTag);
    } //-- void addTag(int, com.gov.nha.bis.upi.ack.Tag) 

    /**
     * Method clearTag
     * 
     */
    public void clearTag()
    {
        _tagList.clear();
    } //-- void clearTag() 

    /**
     * Method enumerateTag
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateTag()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_tagList.iterator());
    } //-- java.util.Enumeration enumerateTag() 

    /**
     * Method getTag
     * 
     * 
     * 
     * @param index
     * @return Tag
     */
    public com.gov.nha.bis.upi.ack.Tag getTag(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _tagList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Tag) _tagList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Tag getTag(int) 

    /**
     * Method getTag
     * 
     * 
     * 
     * @return Tag
     */
    public com.gov.nha.bis.upi.ack.Tag[] getTag()
    {
        int size = _tagList.size();
        com.gov.nha.bis.upi.ack.Tag[] mArray = new com.gov.nha.bis.upi.ack.Tag[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Tag) _tagList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Tag[] getTag() 

    /**
     * Method getTagCount
     * 
     * 
     * 
     * @return int
     */
    public int getTagCount()
    {
        return _tagList.size();
    } //-- int getTagCount() 

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
     * Method removeTag
     * 
     * 
     * 
     * @param vTag
     * @return boolean
     */
    public boolean removeTag(com.gov.nha.bis.upi.ack.Tag vTag)
    {
        boolean removed = _tagList.remove(vTag);
        return removed;
    } //-- boolean removeTag(com.gov.nha.bis.upi.ack.Tag) 

    /**
     * Method setTag
     * 
     * 
     * 
     * @param index
     * @param vTag
     */
    public void setTag(int index, com.gov.nha.bis.upi.ack.Tag vTag)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _tagList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _tagList.set(index, vTag);
    } //-- void setTag(int, com.gov.nha.bis.upi.ack.Tag) 

    /**
     * Method setTag
     * 
     * 
     * 
     * @param tagArray
     */
    public void setTag(com.gov.nha.bis.upi.ack.Tag[] tagArray)
    {
        //-- copy array
        _tagList.clear();
        for (int i = 0; i < tagArray.length; i++) {
            _tagList.add(tagArray[i]);
        }
    } //-- void setTag(com.gov.nha.bis.upi.ack.Tag) 

    /**
     * Method unmarshalMeta
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalMeta(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.Meta) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.Meta.class, reader);
    } //-- java.lang.Object unmarshalMeta(java.io.Reader) 

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
