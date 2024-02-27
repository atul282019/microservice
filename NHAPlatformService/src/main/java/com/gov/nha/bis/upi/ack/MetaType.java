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
 * Class MetaType.
 * 
 * @version $Revision$ $Date$
 */
public class MetaType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _lk
     */
    private java.lang.String _lk;

    /**
     * Field _ac
     */
    private java.lang.String _ac;

    /**
     * Field _sa
     */
    private java.lang.String _sa;

    /**
     * Field _uid
     */
    private java.lang.String _uid;

    /**
     * Field _ver
     */
    private java.lang.String _ver;


      //----------------/
     //- Constructors -/
    //----------------/

    public MetaType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.MetaType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'ac'.
     * 
     * @return String
     * @return the value of field 'ac'.
     */
    public java.lang.String getAc()
    {
        return this._ac;
    } //-- java.lang.String getAc() 

    /**
     * Returns the value of field 'lk'.
     * 
     * @return String
     * @return the value of field 'lk'.
     */
    public java.lang.String getLk()
    {
        return this._lk;
    } //-- java.lang.String getLk() 

    /**
     * Returns the value of field 'sa'.
     * 
     * @return String
     * @return the value of field 'sa'.
     */
    public java.lang.String getSa()
    {
        return this._sa;
    } //-- java.lang.String getSa() 

    /**
     * Returns the value of field 'uid'.
     * 
     * @return String
     * @return the value of field 'uid'.
     */
    public java.lang.String getUid()
    {
        return this._uid;
    } //-- java.lang.String getUid() 

    /**
     * Returns the value of field 'ver'.
     * 
     * @return String
     * @return the value of field 'ver'.
     */
    public java.lang.String getVer()
    {
        return this._ver;
    } //-- java.lang.String getVer() 

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
     * Sets the value of field 'ac'.
     * 
     * @param ac the value of field 'ac'.
     */
    public void setAc(java.lang.String ac)
    {
        this._ac = ac;
    } //-- void setAc(java.lang.String) 

    /**
     * Sets the value of field 'lk'.
     * 
     * @param lk the value of field 'lk'.
     */
    public void setLk(java.lang.String lk)
    {
        this._lk = lk;
    } //-- void setLk(java.lang.String) 

    /**
     * Sets the value of field 'sa'.
     * 
     * @param sa the value of field 'sa'.
     */
    public void setSa(java.lang.String sa)
    {
        this._sa = sa;
    } //-- void setSa(java.lang.String) 

    /**
     * Sets the value of field 'uid'.
     * 
     * @param uid the value of field 'uid'.
     */
    public void setUid(java.lang.String uid)
    {
        this._uid = uid;
    } //-- void setUid(java.lang.String) 

    /**
     * Sets the value of field 'ver'.
     * 
     * @param ver the value of field 'ver'.
     */
    public void setVer(java.lang.String ver)
    {
        this._ver = ver;
    } //-- void setVer(java.lang.String) 

    /**
     * Method unmarshalMetaType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalMetaType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.MetaType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.MetaType.class, reader);
    } //-- java.lang.Object unmarshalMetaType(java.io.Reader) 

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
