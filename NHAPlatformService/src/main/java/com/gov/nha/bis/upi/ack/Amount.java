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

import com.gov.nha.bis.upi.ack.types.AmtRuleType;
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
 * Class Amount.
 * 
 * @version $Revision$ $Date$
 */
public class Amount implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _value
     */
    private java.lang.String _value;

    /**
     * Field _rule
     */
    private com.gov.nha.bis.upi.ack.types.AmtRuleType _rule;


      //----------------/
     //- Constructors -/
    //----------------/

    public Amount() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.Amount()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'rule'.
     * 
     * @return AmtRuleType
     * @return the value of field 'rule'.
     */
    public com.gov.nha.bis.upi.ack.types.AmtRuleType getRule()
    {
        return this._rule;
    } //-- com.gov.nha.bis.upi.ack.types.AmtRuleType getRule() 

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
     * Sets the value of field 'rule'.
     * 
     * @param rule the value of field 'rule'.
     */
    public void setRule(com.gov.nha.bis.upi.ack.types.AmtRuleType rule)
    {
        this._rule = rule;
    } //-- void setRule(com.gov.nha.bis.upi.ack.types.AmtRuleType) 

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
     * Method unmarshalAmount
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalAmount(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.Amount) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.Amount.class, reader);
    } //-- java.lang.Object unmarshalAmount(java.io.Reader) 

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
