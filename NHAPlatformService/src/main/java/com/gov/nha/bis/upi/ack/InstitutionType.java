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

import com.gov.nha.bis.upi.ack.types.InstitutionAttrType;
import com.gov.nha.bis.upi.ack.types.InstitutionRoute;
import com.gov.nha.bis.upi.ack.types.TenorConstants;
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
 * Class InstitutionType.
 * 
 * @version $Revision$ $Date$
 */
public class InstitutionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.InstitutionAttrType _type;

    /**
     * Field _route
     */
    private com.gov.nha.bis.upi.ack.types.InstitutionRoute _route;

    /**
     * Field _netInstId
     */
    private java.lang.String _netInstId;

    /**
     * Field _qrPayLoad
     */
    private java.lang.String _qrPayLoad;

    /**
     * Field _conCode
     */
    private java.lang.String _conCode;

    /**
     * Field _baseCurr
     */
    private java.lang.String _baseCurr;

    /**
     * Field _tenor
     */
    private com.gov.nha.bis.upi.ack.types.TenorConstants _tenor;

    /**
     * Field _validity
     */
    private java.lang.String _validity;

    /**
     * Field _name
     */
    private com.gov.nha.bis.upi.ack.InstitutionName _name;

    /**
     * Field _purpose
     */
    private com.gov.nha.bis.upi.ack.InstitutionPurpose _purpose;

    /**
     * Field _originator
     */
    private com.gov.nha.bis.upi.ack.InstitutionOriginator _originator;

    /**
     * Field _beneficiary
     */
    private com.gov.nha.bis.upi.ack.InstitutionBeneficiary _beneficiary;

    /**
     * Field _currVal
     */
    private com.gov.nha.bis.upi.ack.CurrValType _currVal;


      //----------------/
     //- Constructors -/
    //----------------/

    public InstitutionType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.InstitutionType()


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
     * Returns the value of field 'beneficiary'.
     * 
     * @return InstitutionBeneficiary
     * @return the value of field 'beneficiary'.
     */
    public com.gov.nha.bis.upi.ack.InstitutionBeneficiary getBeneficiary()
    {
        return this._beneficiary;
    } //-- com.gov.nha.bis.upi.ack.InstitutionBeneficiary getBeneficiary() 

    /**
     * Returns the value of field 'conCode'.
     * 
     * @return String
     * @return the value of field 'conCode'.
     */
    public java.lang.String getConCode()
    {
        return this._conCode;
    } //-- java.lang.String getConCode() 

    /**
     * Returns the value of field 'currVal'.
     * 
     * @return CurrValType
     * @return the value of field 'currVal'.
     */
    public com.gov.nha.bis.upi.ack.CurrValType getCurrVal()
    {
        return this._currVal;
    } //-- com.gov.nha.bis.upi.ack.CurrValType getCurrVal() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return InstitutionName
     * @return the value of field 'name'.
     */
    public com.gov.nha.bis.upi.ack.InstitutionName getName()
    {
        return this._name;
    } //-- com.gov.nha.bis.upi.ack.InstitutionName getName() 

    /**
     * Returns the value of field 'netInstId'.
     * 
     * @return String
     * @return the value of field 'netInstId'.
     */
    public java.lang.String getNetInstId()
    {
        return this._netInstId;
    } //-- java.lang.String getNetInstId() 

    /**
     * Returns the value of field 'originator'.
     * 
     * @return InstitutionOriginator
     * @return the value of field 'originator'.
     */
    public com.gov.nha.bis.upi.ack.InstitutionOriginator getOriginator()
    {
        return this._originator;
    } //-- com.gov.nha.bis.upi.ack.InstitutionOriginator getOriginator() 

    /**
     * Returns the value of field 'purpose'.
     * 
     * @return InstitutionPurpose
     * @return the value of field 'purpose'.
     */
    public com.gov.nha.bis.upi.ack.InstitutionPurpose getPurpose()
    {
        return this._purpose;
    } //-- com.gov.nha.bis.upi.ack.InstitutionPurpose getPurpose() 

    /**
     * Returns the value of field 'qrPayLoad'.
     * 
     * @return String
     * @return the value of field 'qrPayLoad'.
     */
    public java.lang.String getQrPayLoad()
    {
        return this._qrPayLoad;
    } //-- java.lang.String getQrPayLoad() 

    /**
     * Returns the value of field 'route'.
     * 
     * @return InstitutionRoute
     * @return the value of field 'route'.
     */
    public com.gov.nha.bis.upi.ack.types.InstitutionRoute getRoute()
    {
        return this._route;
    } //-- com.gov.nha.bis.upi.ack.types.InstitutionRoute getRoute() 

    /**
     * Returns the value of field 'tenor'.
     * 
     * @return TenorConstants
     * @return the value of field 'tenor'.
     */
    public com.gov.nha.bis.upi.ack.types.TenorConstants getTenor()
    {
        return this._tenor;
    } //-- com.gov.nha.bis.upi.ack.types.TenorConstants getTenor() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return InstitutionAttrType
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.InstitutionAttrType getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.InstitutionAttrType getType() 

    /**
     * Returns the value of field 'validity'.
     * 
     * @return String
     * @return the value of field 'validity'.
     */
    public java.lang.String getValidity()
    {
        return this._validity;
    } //-- java.lang.String getValidity() 

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
     * Sets the value of field 'beneficiary'.
     * 
     * @param beneficiary the value of field 'beneficiary'.
     */
    public void setBeneficiary(com.gov.nha.bis.upi.ack.InstitutionBeneficiary beneficiary)
    {
        this._beneficiary = beneficiary;
    } //-- void setBeneficiary(com.gov.nha.bis.upi.ack.InstitutionBeneficiary) 

    /**
     * Sets the value of field 'conCode'.
     * 
     * @param conCode the value of field 'conCode'.
     */
    public void setConCode(java.lang.String conCode)
    {
        this._conCode = conCode;
    } //-- void setConCode(java.lang.String) 

    /**
     * Sets the value of field 'currVal'.
     * 
     * @param currVal the value of field 'currVal'.
     */
    public void setCurrVal(com.gov.nha.bis.upi.ack.CurrValType currVal)
    {
        this._currVal = currVal;
    } //-- void setCurrVal(com.gov.nha.bis.upi.ack.CurrValType) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(com.gov.nha.bis.upi.ack.InstitutionName name)
    {
        this._name = name;
    } //-- void setName(com.gov.nha.bis.upi.ack.InstitutionName) 

    /**
     * Sets the value of field 'netInstId'.
     * 
     * @param netInstId the value of field 'netInstId'.
     */
    public void setNetInstId(java.lang.String netInstId)
    {
        this._netInstId = netInstId;
    } //-- void setNetInstId(java.lang.String) 

    /**
     * Sets the value of field 'originator'.
     * 
     * @param originator the value of field 'originator'.
     */
    public void setOriginator(com.gov.nha.bis.upi.ack.InstitutionOriginator originator)
    {
        this._originator = originator;
    } //-- void setOriginator(com.gov.nha.bis.upi.ack.InstitutionOriginator) 

    /**
     * Sets the value of field 'purpose'.
     * 
     * @param purpose the value of field 'purpose'.
     */
    public void setPurpose(com.gov.nha.bis.upi.ack.InstitutionPurpose purpose)
    {
        this._purpose = purpose;
    } //-- void setPurpose(com.gov.nha.bis.upi.ack.InstitutionPurpose) 

    /**
     * Sets the value of field 'qrPayLoad'.
     * 
     * @param qrPayLoad the value of field 'qrPayLoad'.
     */
    public void setQrPayLoad(java.lang.String qrPayLoad)
    {
        this._qrPayLoad = qrPayLoad;
    } //-- void setQrPayLoad(java.lang.String) 

    /**
     * Sets the value of field 'route'.
     * 
     * @param route the value of field 'route'.
     */
    public void setRoute(com.gov.nha.bis.upi.ack.types.InstitutionRoute route)
    {
        this._route = route;
    } //-- void setRoute(com.gov.nha.bis.upi.ack.types.InstitutionRoute) 

    /**
     * Sets the value of field 'tenor'.
     * 
     * @param tenor the value of field 'tenor'.
     */
    public void setTenor(com.gov.nha.bis.upi.ack.types.TenorConstants tenor)
    {
        this._tenor = tenor;
    } //-- void setTenor(com.gov.nha.bis.upi.ack.types.TenorConstants) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.InstitutionAttrType type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.InstitutionAttrType) 

    /**
     * Sets the value of field 'validity'.
     * 
     * @param validity the value of field 'validity'.
     */
    public void setValidity(java.lang.String validity)
    {
        this._validity = validity;
    } //-- void setValidity(java.lang.String) 

    /**
     * Method unmarshalInstitutionType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalInstitutionType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.InstitutionType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.InstitutionType.class, reader);
    } //-- java.lang.Object unmarshalInstitutionType(java.io.Reader) 

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
