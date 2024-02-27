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

import com.gov.nha.bis.upi.ack.types.OpType;
import com.gov.nha.bis.upi.ack.types.ResultType;
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
 * Class RespVaeRef.
 * 
 * @version $Revision$ $Date$
 */
public class RespVaeRef implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _op
     */
    private com.gov.nha.bis.upi.ack.types.OpType _op;

    /**
     * Field _seqNum
     */
    private java.lang.String _seqNum;

    /**
     * Field _addr
     */
    private java.lang.String _addr;

    /**
     * Field _respCode
     */
    private java.lang.String _respCode;

    /**
     * Field _result
     */
    private com.gov.nha.bis.upi.ack.types.ResultType _result;


      //----------------/
     //- Constructors -/
    //----------------/

    public RespVaeRef() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.RespVaeRef()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'op'.
     * 
     * @return OpType
     * @return the value of field 'op'.
     */
    public com.gov.nha.bis.upi.ack.types.OpType getOp()
    {
        return this._op;
    } //-- com.gov.nha.bis.upi.ack.types.OpType getOp() 

    /**
     * Returns the value of field 'respCode'.
     * 
     * @return String
     * @return the value of field 'respCode'.
     */
    public java.lang.String getRespCode()
    {
        return this._respCode;
    } //-- java.lang.String getRespCode() 

    /**
     * Returns the value of field 'result'.
     * 
     * @return ResultType
     * @return the value of field 'result'.
     */
    public com.gov.nha.bis.upi.ack.types.ResultType getResult()
    {
        return this._result;
    } //-- com.gov.nha.bis.upi.ack.types.ResultType getResult() 

    /**
     * Returns the value of field 'seqNum'.
     * 
     * @return String
     * @return the value of field 'seqNum'.
     */
    public java.lang.String getSeqNum()
    {
        return this._seqNum;
    } //-- java.lang.String getSeqNum() 

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
     * Sets the value of field 'addr'.
     * 
     * @param addr the value of field 'addr'.
     */
    public void setAddr(java.lang.String addr)
    {
        this._addr = addr;
    } //-- void setAddr(java.lang.String) 

    /**
     * Sets the value of field 'op'.
     * 
     * @param op the value of field 'op'.
     */
    public void setOp(com.gov.nha.bis.upi.ack.types.OpType op)
    {
        this._op = op;
    } //-- void setOp(com.gov.nha.bis.upi.ack.types.OpType) 

    /**
     * Sets the value of field 'respCode'.
     * 
     * @param respCode the value of field 'respCode'.
     */
    public void setRespCode(java.lang.String respCode)
    {
        this._respCode = respCode;
    } //-- void setRespCode(java.lang.String) 

    /**
     * Sets the value of field 'result'.
     * 
     * @param result the value of field 'result'.
     */
    public void setResult(com.gov.nha.bis.upi.ack.types.ResultType result)
    {
        this._result = result;
    } //-- void setResult(com.gov.nha.bis.upi.ack.types.ResultType) 

    /**
     * Sets the value of field 'seqNum'.
     * 
     * @param seqNum the value of field 'seqNum'.
     */
    public void setSeqNum(java.lang.String seqNum)
    {
        this._seqNum = seqNum;
    } //-- void setSeqNum(java.lang.String) 

    /**
     * Method unmarshalRespVaeRef
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRespVaeRef(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RespVaeRef) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RespVaeRef.class, reader);
    } //-- java.lang.Object unmarshalRespVaeRef(java.io.Reader) 

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
