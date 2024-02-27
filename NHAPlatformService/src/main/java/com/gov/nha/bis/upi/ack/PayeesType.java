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
 * Class PayeesType.
 * 
 * @version $Revision$ $Date$
 */
public class PayeesType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _payeeList
     */
    private java.util.ArrayList _payeeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PayeesType() 
     {
        super();
        _payeeList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.PayeesType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPayee
     * 
     * 
     * 
     * @param vPayee
     */
    public void addPayee(com.gov.nha.bis.upi.ack.PayeeType vPayee)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_payeeList.size() < 50)) {
            throw new IndexOutOfBoundsException();
        }
        _payeeList.add(vPayee);
    } //-- void addPayee(com.gov.nha.bis.upi.ack.PayeeType) 

    /**
     * Method addPayee
     * 
     * 
     * 
     * @param index
     * @param vPayee
     */
    public void addPayee(int index, com.gov.nha.bis.upi.ack.PayeeType vPayee)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_payeeList.size() < 50)) {
            throw new IndexOutOfBoundsException();
        }
        _payeeList.add(index, vPayee);
    } //-- void addPayee(int, com.gov.nha.bis.upi.ack.PayeeType) 

    /**
     * Method clearPayee
     * 
     */
    public void clearPayee()
    {
        _payeeList.clear();
    } //-- void clearPayee() 

    /**
     * Method enumeratePayee
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumeratePayee()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_payeeList.iterator());
    } //-- java.util.Enumeration enumeratePayee() 

    /**
     * Method getPayee
     * 
     * 
     * 
     * @param index
     * @return PayeeType
     */
    public com.gov.nha.bis.upi.ack.PayeeType getPayee(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _payeeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.PayeeType) _payeeList.get(index);
    } //-- com.gov.nha.bis.upi.ack.PayeeType getPayee(int) 

    /**
     * Method getPayee
     * 
     * 
     * 
     * @return PayeeType
     */
    public com.gov.nha.bis.upi.ack.PayeeType[] getPayee()
    {
        int size = _payeeList.size();
        com.gov.nha.bis.upi.ack.PayeeType[] mArray = new com.gov.nha.bis.upi.ack.PayeeType[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.PayeeType) _payeeList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.PayeeType[] getPayee() 

    /**
     * Method getPayeeCount
     * 
     * 
     * 
     * @return int
     */
    public int getPayeeCount()
    {
        return _payeeList.size();
    } //-- int getPayeeCount() 

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
     * Method removePayee
     * 
     * 
     * 
     * @param vPayee
     * @return boolean
     */
    public boolean removePayee(com.gov.nha.bis.upi.ack.PayeeType vPayee)
    {
        boolean removed = _payeeList.remove(vPayee);
        return removed;
    } //-- boolean removePayee(com.gov.nha.bis.upi.ack.PayeeType) 

    /**
     * Method setPayee
     * 
     * 
     * 
     * @param index
     * @param vPayee
     */
    public void setPayee(int index, com.gov.nha.bis.upi.ack.PayeeType vPayee)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _payeeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 50)) {
            throw new IndexOutOfBoundsException();
        }
        _payeeList.set(index, vPayee);
    } //-- void setPayee(int, com.gov.nha.bis.upi.ack.PayeeType) 

    /**
     * Method setPayee
     * 
     * 
     * 
     * @param payeeArray
     */
    public void setPayee(com.gov.nha.bis.upi.ack.PayeeType[] payeeArray)
    {
        //-- copy array
        _payeeList.clear();
        for (int i = 0; i < payeeArray.length; i++) {
            _payeeList.add(payeeArray[i]);
        }
    } //-- void setPayee(com.gov.nha.bis.upi.ack.PayeeType) 

    /**
     * Method unmarshalPayeesType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalPayeesType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.PayeesType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.PayeesType.class, reader);
    } //-- java.lang.Object unmarshalPayeesType(java.io.Reader) 

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
