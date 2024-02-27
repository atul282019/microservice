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
 * Class AmountType.
 * 
 * @version $Revision$ $Date$
 */
public class AmountType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _value
     */
    private java.lang.String _value;

    /**
     * Field _curr
     */
    private java.lang.String _curr;

    /**
     * Field _splitList
     */
    private java.util.ArrayList _splitList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AmountType() 
     {
        super();
        _splitList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.AmountType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSplit
     * 
     * 
     * 
     * @param vSplit
     */
    public void addSplit(com.gov.nha.bis.upi.ack.Split vSplit)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_splitList.size() < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _splitList.add(vSplit);
    } //-- void addSplit(com.gov.nha.bis.upi.ack.Split) 

    /**
     * Method addSplit
     * 
     * 
     * 
     * @param index
     * @param vSplit
     */
    public void addSplit(int index, com.gov.nha.bis.upi.ack.Split vSplit)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_splitList.size() < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _splitList.add(index, vSplit);
    } //-- void addSplit(int, com.gov.nha.bis.upi.ack.Split) 

    /**
     * Method clearSplit
     * 
     */
    public void clearSplit()
    {
        _splitList.clear();
    } //-- void clearSplit() 

    /**
     * Method enumerateSplit
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateSplit()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_splitList.iterator());
    } //-- java.util.Enumeration enumerateSplit() 

    /**
     * Returns the value of field 'curr'.
     * 
     * @return String
     * @return the value of field 'curr'.
     */
    public java.lang.String getCurr()
    {
        return this._curr;
    } //-- java.lang.String getCurr() 

    /**
     * Method getSplit
     * 
     * 
     * 
     * @param index
     * @return Split
     */
    public com.gov.nha.bis.upi.ack.Split getSplit(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _splitList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Split) _splitList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Split getSplit(int) 

    /**
     * Method getSplit
     * 
     * 
     * 
     * @return Split
     */
    public com.gov.nha.bis.upi.ack.Split[] getSplit()
    {
        int size = _splitList.size();
        com.gov.nha.bis.upi.ack.Split[] mArray = new com.gov.nha.bis.upi.ack.Split[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Split) _splitList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Split[] getSplit() 

    /**
     * Method getSplitCount
     * 
     * 
     * 
     * @return int
     */
    public int getSplitCount()
    {
        return _splitList.size();
    } //-- int getSplitCount() 

    /**
     * Returns the value of field 'value'.
     * 
     * @return String
     * @return the value of field 'value'.
     */
    public java.lang.String getValue()
    {
        return this._value;
    } //-- java.lang.String getValue() 

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
     * Method removeSplit
     * 
     * 
     * 
     * @param vSplit
     * @return boolean
     */
    public boolean removeSplit(com.gov.nha.bis.upi.ack.Split vSplit)
    {
        boolean removed = _splitList.remove(vSplit);
        return removed;
    } //-- boolean removeSplit(com.gov.nha.bis.upi.ack.Split) 

    /**
     * Sets the value of field 'curr'.
     * 
     * @param curr the value of field 'curr'.
     */
    public void setCurr(java.lang.String curr)
    {
        this._curr = curr;
    } //-- void setCurr(java.lang.String) 

    /**
     * Method setSplit
     * 
     * 
     * 
     * @param index
     * @param vSplit
     */
    public void setSplit(int index, com.gov.nha.bis.upi.ack.Split vSplit)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _splitList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 10)) {
            throw new IndexOutOfBoundsException();
        }
        _splitList.set(index, vSplit);
    } //-- void setSplit(int, com.gov.nha.bis.upi.ack.Split) 

    /**
     * Method setSplit
     * 
     * 
     * 
     * @param splitArray
     */
    public void setSplit(com.gov.nha.bis.upi.ack.Split[] splitArray)
    {
        //-- copy array
        _splitList.clear();
        for (int i = 0; i < splitArray.length; i++) {
            _splitList.add(splitArray[i]);
        }
    } //-- void setSplit(com.gov.nha.bis.upi.ack.Split) 

    /**
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(java.lang.String value)
    {
        this._value = value;
    } //-- void setValue(java.lang.String) 

    /**
     * Method unmarshalAmountType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalAmountType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.AmountType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.AmountType.class, reader);
    } //-- java.lang.Object unmarshalAmountType(java.io.Reader) 

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
