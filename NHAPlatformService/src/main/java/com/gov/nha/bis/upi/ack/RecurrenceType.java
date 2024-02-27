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

import com.gov.nha.bis.upi.ack.types.RecurrencePatternType;
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
 * Class RecurrenceType.
 * 
 * @version $Revision$ $Date$
 */
public class RecurrenceType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _pattern
     */
    private com.gov.nha.bis.upi.ack.types.RecurrencePatternType _pattern;

    /**
     * Field _rule
     */
    private com.gov.nha.bis.upi.ack.Rule _rule;


      //----------------/
     //- Constructors -/
    //----------------/

    public RecurrenceType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.RecurrenceType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'pattern'.
     * 
     * @return RecurrencePatternType
     * @return the value of field 'pattern'.
     */
    public com.gov.nha.bis.upi.ack.types.RecurrencePatternType getPattern()
    {
        return this._pattern;
    } //-- com.gov.nha.bis.upi.ack.types.RecurrencePatternType getPattern() 

    /**
     * Returns the value of field 'rule'.
     * 
     * @return Rule
     * @return the value of field 'rule'.
     */
    public com.gov.nha.bis.upi.ack.Rule getRule()
    {
        return this._rule;
    } //-- com.gov.nha.bis.upi.ack.Rule getRule() 

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
     * Sets the value of field 'pattern'.
     * 
     * @param pattern the value of field 'pattern'.
     */
    public void setPattern(com.gov.nha.bis.upi.ack.types.RecurrencePatternType pattern)
    {
        this._pattern = pattern;
    } //-- void setPattern(com.gov.nha.bis.upi.ack.types.RecurrencePatternType) 

    /**
     * Sets the value of field 'rule'.
     * 
     * @param rule the value of field 'rule'.
     */
    public void setRule(com.gov.nha.bis.upi.ack.Rule rule)
    {
        this._rule = rule;
    } //-- void setRule(com.gov.nha.bis.upi.ack.Rule) 

    /**
     * Method unmarshalRecurrenceType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRecurrenceType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RecurrenceType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RecurrenceType.class, reader);
    } //-- java.lang.Object unmarshalRecurrenceType(java.io.Reader) 

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
