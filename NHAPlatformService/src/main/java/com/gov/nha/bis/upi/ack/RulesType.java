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
 * Class RulesType.
 * 
 * @version $Revision$ $Date$
 */
public class RulesType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ruleList
     */
    private java.util.ArrayList _ruleList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RulesType() 
     {
        super();
        _ruleList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.RulesType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addRule
     * 
     * 
     * 
     * @param vRule
     */
    public void addRule(com.gov.nha.bis.upi.ack.Rule vRule)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ruleList.size() < 5)) {
            throw new IndexOutOfBoundsException();
        }
        _ruleList.add(vRule);
    } //-- void addRule(com.gov.nha.bis.upi.ack.Rule) 

    /**
     * Method addRule
     * 
     * 
     * 
     * @param index
     * @param vRule
     */
    public void addRule(int index, com.gov.nha.bis.upi.ack.Rule vRule)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ruleList.size() < 5)) {
            throw new IndexOutOfBoundsException();
        }
        _ruleList.add(index, vRule);
    } //-- void addRule(int, com.gov.nha.bis.upi.ack.Rule) 

    /**
     * Method clearRule
     * 
     */
    public void clearRule()
    {
        _ruleList.clear();
    } //-- void clearRule() 

    /**
     * Method enumerateRule
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateRule()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_ruleList.iterator());
    } //-- java.util.Enumeration enumerateRule() 

    /**
     * Method getRule
     * 
     * 
     * 
     * @param index
     * @return Rule
     */
    public com.gov.nha.bis.upi.ack.Rule getRule(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _ruleList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Rule) _ruleList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Rule getRule(int) 

    /**
     * Method getRule
     * 
     * 
     * 
     * @return Rule
     */
    public com.gov.nha.bis.upi.ack.Rule[] getRule()
    {
        int size = _ruleList.size();
        com.gov.nha.bis.upi.ack.Rule[] mArray = new com.gov.nha.bis.upi.ack.Rule[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Rule) _ruleList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Rule[] getRule() 

    /**
     * Method getRuleCount
     * 
     * 
     * 
     * @return int
     */
    public int getRuleCount()
    {
        return _ruleList.size();
    } //-- int getRuleCount() 

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
     * Method removeRule
     * 
     * 
     * 
     * @param vRule
     * @return boolean
     */
    public boolean removeRule(com.gov.nha.bis.upi.ack.Rule vRule)
    {
        boolean removed = _ruleList.remove(vRule);
        return removed;
    } //-- boolean removeRule(com.gov.nha.bis.upi.ack.Rule) 

    /**
     * Method setRule
     * 
     * 
     * 
     * @param index
     * @param vRule
     */
    public void setRule(int index, com.gov.nha.bis.upi.ack.Rule vRule)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _ruleList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 5)) {
            throw new IndexOutOfBoundsException();
        }
        _ruleList.set(index, vRule);
    } //-- void setRule(int, com.gov.nha.bis.upi.ack.Rule) 

    /**
     * Method setRule
     * 
     * 
     * 
     * @param ruleArray
     */
    public void setRule(com.gov.nha.bis.upi.ack.Rule[] ruleArray)
    {
        //-- copy array
        _ruleList.clear();
        for (int i = 0; i < ruleArray.length; i++) {
            _ruleList.add(ruleArray[i]);
        }
    } //-- void setRule(com.gov.nha.bis.upi.ack.Rule) 

    /**
     * Method unmarshalRulesType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRulesType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RulesType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RulesType.class, reader);
    } //-- java.lang.Object unmarshalRulesType(java.io.Reader) 

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
