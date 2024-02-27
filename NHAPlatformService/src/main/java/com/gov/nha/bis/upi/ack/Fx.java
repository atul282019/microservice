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
 * Class Fx.
 * 
 * @version $Revision$ $Date$
 */
public class Fx implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _baseAmount
     */
    private java.lang.String _baseAmount;

    /**
     * Field _baseCurr
     */
    private java.lang.String _baseCurr;

    /**
     * Field _active
     */
    private java.lang.String _active;

    /**
     * Field _fx
     */
    private java.lang.String _fx;

    /**
     * Field _mkup
     */
    private java.lang.String _mkup;

    /**
     * Field _lastModifedTs
     */
    private java.lang.String _lastModifedTs;


      //----------------/
     //- Constructors -/
    //----------------/

    public Fx() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.Fx()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'active'.
     * 
     * @return String
     * @return the value of field 'active'.
     */
    public java.lang.String getActive()
    {
        return this._active;
    } //-- java.lang.String getActive() 

    /**
     * Returns the value of field 'baseAmount'.
     * 
     * @return String
     * @return the value of field 'baseAmount'.
     */
    public java.lang.String getBaseAmount()
    {
        return this._baseAmount;
    } //-- java.lang.String getBaseAmount() 

    /**
     * Returns the value of field 'baseCurr'.
     * 
     * @return String
     * @return the value of field 'baseCurr'.
     */
    public java.lang.String getBaseCurr()
    {
        return this._baseCurr;
    } //-- java.lang.String getBaseCurr() 

    /**
     * Returns the value of field 'fx'.
     * 
     * @return String
     * @return the value of field 'fx'.
     */
    public java.lang.String getFx()
    {
        return this._fx;
    } //-- java.lang.String getFx() 

    /**
     * Returns the value of field 'lastModifedTs'.
     * 
     * @return String
     * @return the value of field 'lastModifedTs'.
     */
    public java.lang.String getLastModifedTs()
    {
        return this._lastModifedTs;
    } //-- java.lang.String getLastModifedTs() 

    /**
     * Returns the value of field 'mkup'.
     * 
     * @return String
     * @return the value of field 'mkup'.
     */
    public java.lang.String getMkup()
    {
        return this._mkup;
    } //-- java.lang.String getMkup() 

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
     * Sets the value of field 'active'.
     * 
     * @param active the value of field 'active'.
     */
    public void setActive(java.lang.String active)
    {
        this._active = active;
    } //-- void setActive(java.lang.String) 

    /**
     * Sets the value of field 'baseAmount'.
     * 
     * @param baseAmount the value of field 'baseAmount'.
     */
    public void setBaseAmount(java.lang.String baseAmount)
    {
        this._baseAmount = baseAmount;
    } //-- void setBaseAmount(java.lang.String) 

    /**
     * Sets the value of field 'baseCurr'.
     * 
     * @param baseCurr the value of field 'baseCurr'.
     */
    public void setBaseCurr(java.lang.String baseCurr)
    {
        this._baseCurr = baseCurr;
    } //-- void setBaseCurr(java.lang.String) 

    /**
     * Sets the value of field 'fx'.
     * 
     * @param fx the value of field 'fx'.
     */
    public void setFx(java.lang.String fx)
    {
        this._fx = fx;
    } //-- void setFx(java.lang.String) 

    /**
     * Sets the value of field 'lastModifedTs'.
     * 
     * @param lastModifedTs the value of field 'lastModifedTs'.
     */
    public void setLastModifedTs(java.lang.String lastModifedTs)
    {
        this._lastModifedTs = lastModifedTs;
    } //-- void setLastModifedTs(java.lang.String) 

    /**
     * Sets the value of field 'mkup'.
     * 
     * @param mkup the value of field 'mkup'.
     */
    public void setMkup(java.lang.String mkup)
    {
        this._mkup = mkup;
    } //-- void setMkup(java.lang.String) 

    /**
     * Method unmarshalFx
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalFx(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.Fx) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.Fx.class, reader);
    } //-- java.lang.Object unmarshalFx(java.io.Reader) 

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
