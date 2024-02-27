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

import com.gov.nha.bis.upi.ack.types.PayerConstant;
import com.gov.nha.bis.upi.ack.types.RegIdStatusType;
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
 * Class RegIdDetailsType.
 * 
 * @version $Revision$ $Date$
 */
public class RegIdDetailsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _addr
     */
    private java.lang.String _addr;

    /**
     * Field _type
     */
    private com.gov.nha.bis.upi.ack.types.PayerConstant _type;

    /**
     * Field _idStatus
     */
    private com.gov.nha.bis.upi.ack.types.RegIdStatusType _idStatus;

    /**
     * Field _lastUpdatedTs
     */
    private java.lang.String _lastUpdatedTs;

    /**
     * Field _channel
     */
    private java.lang.String _channel;

    /**
     * Field _idList
     */
    private java.util.ArrayList _idList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RegIdDetailsType() 
     {
        super();
        _idList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.RegIdDetailsType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addId
     * 
     * 
     * 
     * @param vId
     */
    public void addId(com.gov.nha.bis.upi.ack.Id vId)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_idList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _idList.add(vId);
    } //-- void addId(com.gov.nha.bis.upi.ack.Id) 

    /**
     * Method addId
     * 
     * 
     * 
     * @param index
     * @param vId
     */
    public void addId(int index, com.gov.nha.bis.upi.ack.Id vId)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_idList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _idList.add(index, vId);
    } //-- void addId(int, com.gov.nha.bis.upi.ack.Id) 

    /**
     * Method clearId
     * 
     */
    public void clearId()
    {
        _idList.clear();
    } //-- void clearId() 

    /**
     * Method enumerateId
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateId()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_idList.iterator());
    } //-- java.util.Enumeration enumerateId() 

    /**
     * Returns the value of field 'addr'.
     * 
     * @return String
     * @return the value of field 'addr'.
     */
    public java.lang.String getAddr()
    {
        return this._addr;
    } //-- java.lang.String getAddr() 

    /**
     * Returns the value of field 'channel'.
     * 
     * @return String
     * @return the value of field 'channel'.
     */
    public java.lang.String getChannel()
    {
        return this._channel;
    } //-- java.lang.String getChannel() 

    /**
     * Method getId
     * 
     * 
     * 
     * @param index
     * @return Id
     */
    public com.gov.nha.bis.upi.ack.Id getId(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _idList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Id) _idList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Id getId(int) 

    /**
     * Method getId
     * 
     * 
     * 
     * @return Id
     */
    public com.gov.nha.bis.upi.ack.Id[] getId()
    {
        int size = _idList.size();
        com.gov.nha.bis.upi.ack.Id[] mArray = new com.gov.nha.bis.upi.ack.Id[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Id) _idList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Id[] getId() 

    /**
     * Method getIdCount
     * 
     * 
     * 
     * @return int
     */
    public int getIdCount()
    {
        return _idList.size();
    } //-- int getIdCount() 

    /**
     * Returns the value of field 'idStatus'.
     * 
     * @return RegIdStatusType
     * @return the value of field 'idStatus'.
     */
    public com.gov.nha.bis.upi.ack.types.RegIdStatusType getIdStatus()
    {
        return this._idStatus;
    } //-- com.gov.nha.bis.upi.ack.types.RegIdStatusType getIdStatus() 

    /**
     * Returns the value of field 'lastUpdatedTs'.
     * 
     * @return String
     * @return the value of field 'lastUpdatedTs'.
     */
    public java.lang.String getLastUpdatedTs()
    {
        return this._lastUpdatedTs;
    } //-- java.lang.String getLastUpdatedTs() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return PayerConstant
     * @return the value of field 'type'.
     */
    public com.gov.nha.bis.upi.ack.types.PayerConstant getType()
    {
        return this._type;
    } //-- com.gov.nha.bis.upi.ack.types.PayerConstant getType() 

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
     * Method removeId
     * 
     * 
     * 
     * @param vId
     * @return boolean
     */
    public boolean removeId(com.gov.nha.bis.upi.ack.Id vId)
    {
        boolean removed = _idList.remove(vId);
        return removed;
    } //-- boolean removeId(com.gov.nha.bis.upi.ack.Id) 

    /**
     * Sets the value of field 'addr'.
     * 
     * @param addr the value of field 'addr'.
     */
    public void setAddr(java.lang.String addr)
    {
        this._addr = addr;
    } //-- void setAddr(java.lang.String) 

    /**
     * Sets the value of field 'channel'.
     * 
     * @param channel the value of field 'channel'.
     */
    public void setChannel(java.lang.String channel)
    {
        this._channel = channel;
    } //-- void setChannel(java.lang.String) 

    /**
     * Method setId
     * 
     * 
     * 
     * @param index
     * @param vId
     */
    public void setId(int index, com.gov.nha.bis.upi.ack.Id vId)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _idList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _idList.set(index, vId);
    } //-- void setId(int, com.gov.nha.bis.upi.ack.Id) 

    /**
     * Method setId
     * 
     * 
     * 
     * @param idArray
     */
    public void setId(com.gov.nha.bis.upi.ack.Id[] idArray)
    {
        //-- copy array
        _idList.clear();
        for (int i = 0; i < idArray.length; i++) {
            _idList.add(idArray[i]);
        }
    } //-- void setId(com.gov.nha.bis.upi.ack.Id) 

    /**
     * Sets the value of field 'idStatus'.
     * 
     * @param idStatus the value of field 'idStatus'.
     */
    public void setIdStatus(com.gov.nha.bis.upi.ack.types.RegIdStatusType idStatus)
    {
        this._idStatus = idStatus;
    } //-- void setIdStatus(com.gov.nha.bis.upi.ack.types.RegIdStatusType) 

    /**
     * Sets the value of field 'lastUpdatedTs'.
     * 
     * @param lastUpdatedTs the value of field 'lastUpdatedTs'.
     */
    public void setLastUpdatedTs(java.lang.String lastUpdatedTs)
    {
        this._lastUpdatedTs = lastUpdatedTs;
    } //-- void setLastUpdatedTs(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(com.gov.nha.bis.upi.ack.types.PayerConstant type)
    {
        this._type = type;
    } //-- void setType(com.gov.nha.bis.upi.ack.types.PayerConstant) 

    /**
     * Method unmarshalRegIdDetailsType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRegIdDetailsType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RegIdDetailsType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RegIdDetailsType.class, reader);
    } //-- java.lang.Object unmarshalRegIdDetailsType(java.io.Reader) 

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
