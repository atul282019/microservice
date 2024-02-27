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
 * Class RespType.
 * 
 * @version $Revision$ $Date$
 */
public class RespType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reqMsgId
     */
    private java.lang.String _reqMsgId;

    /**
     * Field _result
     */
    private java.lang.String _result;

    /**
     * Field _errCode
     */
    private java.lang.String _errCode;

    /**
     * Field _errDesc
     */
    private java.lang.String _errDesc;

    /**
     * Field _actn
     */
    private java.lang.String _actn;

    /**
     * Field _securePinUrl
     */
    private java.lang.String _securePinUrl;

    /**
     * Field _authCode
     */
    private java.lang.String _authCode;

    /**
     * Field _refList
     */
    private java.util.ArrayList _refList;

    /**
     * Field _payerInfo
     */
    private com.gov.nha.bis.upi.ack.PayerInfoType _payerInfo;

    /**
     * Field _regIdDetailsList
     */
    private java.util.ArrayList _regIdDetailsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RespType() 
     {
        super();
        _refList = new ArrayList();
        _regIdDetailsList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.RespType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addRef
     * 
     * 
     * 
     * @param vRef
     */
    public void addRef(com.gov.nha.bis.upi.ack.Ref vRef)
        throws java.lang.IndexOutOfBoundsException
    {
        _refList.add(vRef);
    } //-- void addRef(com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Method addRef
     * 
     * 
     * 
     * @param index
     * @param vRef
     */
    public void addRef(int index, com.gov.nha.bis.upi.ack.Ref vRef)
        throws java.lang.IndexOutOfBoundsException
    {
        _refList.add(index, vRef);
    } //-- void addRef(int, com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Method addRegIdDetails
     * 
     * 
     * 
     * @param vRegIdDetails
     */
    public void addRegIdDetails(com.gov.nha.bis.upi.ack.RegIdDetailsType vRegIdDetails)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_regIdDetailsList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _regIdDetailsList.add(vRegIdDetails);
    } //-- void addRegIdDetails(com.gov.nha.bis.upi.ack.RegIdDetailsType) 

    /**
     * Method addRegIdDetails
     * 
     * 
     * 
     * @param index
     * @param vRegIdDetails
     */
    public void addRegIdDetails(int index, com.gov.nha.bis.upi.ack.RegIdDetailsType vRegIdDetails)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_regIdDetailsList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _regIdDetailsList.add(index, vRegIdDetails);
    } //-- void addRegIdDetails(int, com.gov.nha.bis.upi.ack.RegIdDetailsType) 

    /**
     * Method clearRef
     * 
     */
    public void clearRef()
    {
        _refList.clear();
    } //-- void clearRef() 

    /**
     * Method clearRegIdDetails
     * 
     */
    public void clearRegIdDetails()
    {
        _regIdDetailsList.clear();
    } //-- void clearRegIdDetails() 

    /**
     * Method enumerateRef
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateRef()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_refList.iterator());
    } //-- java.util.Enumeration enumerateRef() 

    /**
     * Method enumerateRegIdDetails
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateRegIdDetails()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_regIdDetailsList.iterator());
    } //-- java.util.Enumeration enumerateRegIdDetails() 

    /**
     * Returns the value of field 'actn'.
     * 
     * @return String
     * @return the value of field 'actn'.
     */
    public java.lang.String getActn()
    {
        return this._actn;
    } //-- java.lang.String getActn() 

    /**
     * Returns the value of field 'authCode'.
     * 
     * @return String
     * @return the value of field 'authCode'.
     */
    public java.lang.String getAuthCode()
    {
        return this._authCode;
    } //-- java.lang.String getAuthCode() 

    /**
     * Returns the value of field 'errCode'.
     * 
     * @return String
     * @return the value of field 'errCode'.
     */
    public java.lang.String getErrCode()
    {
        return this._errCode;
    } //-- java.lang.String getErrCode() 

    /**
     * Returns the value of field 'errDesc'.
     * 
     * @return String
     * @return the value of field 'errDesc'.
     */
    public java.lang.String getErrDesc()
    {
        return this._errDesc;
    } //-- java.lang.String getErrDesc() 

    /**
     * Returns the value of field 'payerInfo'.
     * 
     * @return PayerInfoType
     * @return the value of field 'payerInfo'.
     */
    public com.gov.nha.bis.upi.ack.PayerInfoType getPayerInfo()
    {
        return this._payerInfo;
    } //-- com.gov.nha.bis.upi.ack.PayerInfoType getPayerInfo() 

    /**
     * Method getRef
     * 
     * 
     * 
     * @param index
     * @return Ref
     */
    public com.gov.nha.bis.upi.ack.Ref getRef(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _refList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Ref) _refList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Ref getRef(int) 

    /**
     * Method getRef
     * 
     * 
     * 
     * @return Ref
     */
    public com.gov.nha.bis.upi.ack.Ref[] getRef()
    {
        int size = _refList.size();
        com.gov.nha.bis.upi.ack.Ref[] mArray = new com.gov.nha.bis.upi.ack.Ref[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Ref) _refList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Ref[] getRef() 

    /**
     * Method getRefCount
     * 
     * 
     * 
     * @return int
     */
    public int getRefCount()
    {
        return _refList.size();
    } //-- int getRefCount() 

    /**
     * Method getRegIdDetails
     * 
     * 
     * 
     * @param index
     * @return RegIdDetailsType
     */
    public com.gov.nha.bis.upi.ack.RegIdDetailsType getRegIdDetails(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _regIdDetailsList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.RegIdDetailsType) _regIdDetailsList.get(index);
    } //-- com.gov.nha.bis.upi.ack.RegIdDetailsType getRegIdDetails(int) 

    /**
     * Method getRegIdDetails
     * 
     * 
     * 
     * @return RegIdDetailsType
     */
    public com.gov.nha.bis.upi.ack.RegIdDetailsType[] getRegIdDetails()
    {
        int size = _regIdDetailsList.size();
        com.gov.nha.bis.upi.ack.RegIdDetailsType[] mArray = new com.gov.nha.bis.upi.ack.RegIdDetailsType[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.RegIdDetailsType) _regIdDetailsList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.RegIdDetailsType[] getRegIdDetails() 

    /**
     * Method getRegIdDetailsCount
     * 
     * 
     * 
     * @return int
     */
    public int getRegIdDetailsCount()
    {
        return _regIdDetailsList.size();
    } //-- int getRegIdDetailsCount() 

    /**
     * Returns the value of field 'reqMsgId'.
     * 
     * @return String
     * @return the value of field 'reqMsgId'.
     */
    public java.lang.String getReqMsgId()
    {
        return this._reqMsgId;
    } //-- java.lang.String getReqMsgId() 

    /**
     * Returns the value of field 'result'.
     * 
     * @return String
     * @return the value of field 'result'.
     */
    public java.lang.String getResult()
    {
        return this._result;
    } //-- java.lang.String getResult() 

    /**
     * Returns the value of field 'securePinUrl'.
     * 
     * @return String
     * @return the value of field 'securePinUrl'.
     */
    public java.lang.String getSecurePinUrl()
    {
        return this._securePinUrl;
    } //-- java.lang.String getSecurePinUrl() 

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
     * Method removeRef
     * 
     * 
     * 
     * @param vRef
     * @return boolean
     */
    public boolean removeRef(com.gov.nha.bis.upi.ack.Ref vRef)
    {
        boolean removed = _refList.remove(vRef);
        return removed;
    } //-- boolean removeRef(com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Method removeRegIdDetails
     * 
     * 
     * 
     * @param vRegIdDetails
     * @return boolean
     */
    public boolean removeRegIdDetails(com.gov.nha.bis.upi.ack.RegIdDetailsType vRegIdDetails)
    {
        boolean removed = _regIdDetailsList.remove(vRegIdDetails);
        return removed;
    } //-- boolean removeRegIdDetails(com.gov.nha.bis.upi.ack.RegIdDetailsType) 

    /**
     * Sets the value of field 'actn'.
     * 
     * @param actn the value of field 'actn'.
     */
    public void setActn(java.lang.String actn)
    {
        this._actn = actn;
    } //-- void setActn(java.lang.String) 

    /**
     * Sets the value of field 'authCode'.
     * 
     * @param authCode the value of field 'authCode'.
     */
    public void setAuthCode(java.lang.String authCode)
    {
        this._authCode = authCode;
    } //-- void setAuthCode(java.lang.String) 

    /**
     * Sets the value of field 'errCode'.
     * 
     * @param errCode the value of field 'errCode'.
     */
    public void setErrCode(java.lang.String errCode)
    {
        this._errCode = errCode;
    } //-- void setErrCode(java.lang.String) 

    /**
     * Sets the value of field 'errDesc'.
     * 
     * @param errDesc the value of field 'errDesc'.
     */
    public void setErrDesc(java.lang.String errDesc)
    {
        this._errDesc = errDesc;
    } //-- void setErrDesc(java.lang.String) 

    /**
     * Sets the value of field 'payerInfo'.
     * 
     * @param payerInfo the value of field 'payerInfo'.
     */
    public void setPayerInfo(com.gov.nha.bis.upi.ack.PayerInfoType payerInfo)
    {
        this._payerInfo = payerInfo;
    } //-- void setPayerInfo(com.gov.nha.bis.upi.ack.PayerInfoType) 

    /**
     * Method setRef
     * 
     * 
     * 
     * @param index
     * @param vRef
     */
    public void setRef(int index, com.gov.nha.bis.upi.ack.Ref vRef)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _refList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _refList.set(index, vRef);
    } //-- void setRef(int, com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Method setRef
     * 
     * 
     * 
     * @param refArray
     */
    public void setRef(com.gov.nha.bis.upi.ack.Ref[] refArray)
    {
        //-- copy array
        _refList.clear();
        for (int i = 0; i < refArray.length; i++) {
            _refList.add(refArray[i]);
        }
    } //-- void setRef(com.gov.nha.bis.upi.ack.Ref) 

    /**
     * Method setRegIdDetails
     * 
     * 
     * 
     * @param index
     * @param vRegIdDetails
     */
    public void setRegIdDetails(int index, com.gov.nha.bis.upi.ack.RegIdDetailsType vRegIdDetails)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _regIdDetailsList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _regIdDetailsList.set(index, vRegIdDetails);
    } //-- void setRegIdDetails(int, com.gov.nha.bis.upi.ack.RegIdDetailsType) 

    /**
     * Method setRegIdDetails
     * 
     * 
     * 
     * @param regIdDetailsArray
     */
    public void setRegIdDetails(com.gov.nha.bis.upi.ack.RegIdDetailsType[] regIdDetailsArray)
    {
        //-- copy array
        _regIdDetailsList.clear();
        for (int i = 0; i < regIdDetailsArray.length; i++) {
            _regIdDetailsList.add(regIdDetailsArray[i]);
        }
    } //-- void setRegIdDetails(com.gov.nha.bis.upi.ack.RegIdDetailsType) 

    /**
     * Sets the value of field 'reqMsgId'.
     * 
     * @param reqMsgId the value of field 'reqMsgId'.
     */
    public void setReqMsgId(java.lang.String reqMsgId)
    {
        this._reqMsgId = reqMsgId;
    } //-- void setReqMsgId(java.lang.String) 

    /**
     * Sets the value of field 'result'.
     * 
     * @param result the value of field 'result'.
     */
    public void setResult(java.lang.String result)
    {
        this._result = result;
    } //-- void setResult(java.lang.String) 

    /**
     * Sets the value of field 'securePinUrl'.
     * 
     * @param securePinUrl the value of field 'securePinUrl'.
     */
    public void setSecurePinUrl(java.lang.String securePinUrl)
    {
        this._securePinUrl = securePinUrl;
    } //-- void setSecurePinUrl(java.lang.String) 

    /**
     * Method unmarshalRespType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRespType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RespType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RespType.class, reader);
    } //-- java.lang.Object unmarshalRespType(java.io.Reader) 

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
