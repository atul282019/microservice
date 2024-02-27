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
 * Class CurrValType.
 * 
 * @version $Revision$ $Date$
 */
public class CurrValType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _baseCurr
     */
    private java.lang.String _baseCurr;

    /**
     * Field _uniQuotesId
     */
    private java.lang.String _uniQuotesId;

    /**
     * Field _valEndTs
     */
    private java.lang.String _valEndTs;

    /**
     * Field _fxRate
     */
    private java.lang.String _fxRate;

    /**
     * Field _markup
     */
    private java.lang.String _markup;

    /**
     * Field _contraAmt
     */
    private java.lang.String _contraAmt;

    /**
     * Field _txnAmt
     */
    private java.lang.String _txnAmt;

    /**
     * Field _valueDate
     */
    private java.lang.String _valueDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public CurrValType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.CurrValType()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'contraAmt'.
     * 
     * @return String
     * @return the value of field 'contraAmt'.
     */
    public java.lang.String getContraAmt()
    {
        return this._contraAmt;
    } //-- java.lang.String getContraAmt() 

    /**
     * Returns the value of field 'fxRate'.
     * 
     * @return String
     * @return the value of field 'fxRate'.
     */
    public java.lang.String getFxRate()
    {
        return this._fxRate;
    } //-- java.lang.String getFxRate() 

    /**
     * Returns the value of field 'markup'.
     * 
     * @return String
     * @return the value of field 'markup'.
     */
    public java.lang.String getMarkup()
    {
        return this._markup;
    } //-- java.lang.String getMarkup() 

    /**
     * Returns the value of field 'txnAmt'.
     * 
     * @return String
     * @return the value of field 'txnAmt'.
     */
    public java.lang.String getTxnAmt()
    {
        return this._txnAmt;
    } //-- java.lang.String getTxnAmt() 

    /**
     * Returns the value of field 'uniQuotesId'.
     * 
     * @return String
     * @return the value of field 'uniQuotesId'.
     */
    public java.lang.String getUniQuotesId()
    {
        return this._uniQuotesId;
    } //-- java.lang.String getUniQuotesId() 

    /**
     * Returns the value of field 'valEndTs'.
     * 
     * @return String
     * @return the value of field 'valEndTs'.
     */
    public java.lang.String getValEndTs()
    {
        return this._valEndTs;
    } //-- java.lang.String getValEndTs() 

    /**
     * Returns the value of field 'valueDate'.
     * 
     * @return String
     * @return the value of field 'valueDate'.
     */
    public java.lang.String getValueDate()
    {
        return this._valueDate;
    } //-- java.lang.String getValueDate() 

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
     * Sets the value of field 'baseCurr'.
     * 
     * @param baseCurr the value of field 'baseCurr'.
     */
    public void setBaseCurr(java.lang.String baseCurr)
    {
        this._baseCurr = baseCurr;
    } //-- void setBaseCurr(java.lang.String) 

    /**
     * Sets the value of field 'contraAmt'.
     * 
     * @param contraAmt the value of field 'contraAmt'.
     */
    public void setContraAmt(java.lang.String contraAmt)
    {
        this._contraAmt = contraAmt;
    } //-- void setContraAmt(java.lang.String) 

    /**
     * Sets the value of field 'fxRate'.
     * 
     * @param fxRate the value of field 'fxRate'.
     */
    public void setFxRate(java.lang.String fxRate)
    {
        this._fxRate = fxRate;
    } //-- void setFxRate(java.lang.String) 

    /**
     * Sets the value of field 'markup'.
     * 
     * @param markup the value of field 'markup'.
     */
    public void setMarkup(java.lang.String markup)
    {
        this._markup = markup;
    } //-- void setMarkup(java.lang.String) 

    /**
     * Sets the value of field 'txnAmt'.
     * 
     * @param txnAmt the value of field 'txnAmt'.
     */
    public void setTxnAmt(java.lang.String txnAmt)
    {
        this._txnAmt = txnAmt;
    } //-- void setTxnAmt(java.lang.String) 

    /**
     * Sets the value of field 'uniQuotesId'.
     * 
     * @param uniQuotesId the value of field 'uniQuotesId'.
     */
    public void setUniQuotesId(java.lang.String uniQuotesId)
    {
        this._uniQuotesId = uniQuotesId;
    } //-- void setUniQuotesId(java.lang.String) 

    /**
     * Sets the value of field 'valEndTs'.
     * 
     * @param valEndTs the value of field 'valEndTs'.
     */
    public void setValEndTs(java.lang.String valEndTs)
    {
        this._valEndTs = valEndTs;
    } //-- void setValEndTs(java.lang.String) 

    /**
     * Sets the value of field 'valueDate'.
     * 
     * @param valueDate the value of field 'valueDate'.
     */
    public void setValueDate(java.lang.String valueDate)
    {
        this._valueDate = valueDate;
    } //-- void setValueDate(java.lang.String) 

    /**
     * Method unmarshalCurrValType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalCurrValType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.CurrValType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.CurrValType.class, reader);
    } //-- java.lang.Object unmarshalCurrValType(java.io.Reader) 

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
