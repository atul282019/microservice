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
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Validity.
 * 
 * @version $Revision$ $Date$
 */
public class Validity implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _start
     */
    private java.lang.String _start;

    /**
     * Field _end
     */
    private java.lang.String _end;


      //----------------/
     //- Constructors -/
    //----------------/

    public Validity() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.Validity()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'end'.
     * 
     * @return String
     * @return the value of field 'end'.
     */
    public java.lang.String getEnd()
    {
        return this._end;
    } //-- java.lang.String getEnd() 

    /**
     * Returns the value of field 'start'.
     * 
     * @return String
     * @return the value of field 'start'.
     */
    public java.lang.String getStart()
    {
        return this._start;
    } //-- java.lang.String getStart() 

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
     * Sets the value of field 'end'.
     * 
     * @param end the value of field 'end'.
     */
    public void setEnd(java.lang.String end)
    {
        this._end = end;
    } //-- void setEnd(java.lang.String) 

    /**
     * Sets the value of field 'start'.
     * 
     * @param start the value of field 'start'.
     */
    public void setStart(java.lang.String start)
    {
        this._start = start;
    } //-- void setStart(java.lang.String) 

    /**
     * Method unmarshalValidity
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalValidity(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.Validity) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.Validity.class, reader);
    } //-- java.lang.Object unmarshalValidity(java.io.Reader) 

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
