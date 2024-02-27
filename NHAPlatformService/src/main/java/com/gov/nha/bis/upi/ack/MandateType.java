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

import com.gov.nha.bis.upi.ack.types.BlockFund;
import com.gov.nha.bis.upi.ack.types.RevokeableType;
import com.gov.nha.bis.upi.ack.types.ShareToPayee;
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
 * Class MandateType.
 * 
 * @version $Revision$ $Date$
 */
public class MandateType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _txnId
     */
    private java.lang.String _txnId;

    /**
     * Field _umn
     */
    private java.lang.String _umn;

    /**
     * Field _ts
     */
    private java.lang.String _ts;

    /**
     * Field _revokeable
     */
    private com.gov.nha.bis.upi.ack.types.RevokeableType _revokeable;

    /**
     * Field _shareToPayee
     */
    private com.gov.nha.bis.upi.ack.types.ShareToPayee _shareToPayee;

    /**
     * Field _type
     */
    private java.lang.String _type;

    /**
     * Field _blockFund
     */
    private com.gov.nha.bis.upi.ack.types.BlockFund _blockFund;

    /**
     * Field _validity
     */
    private com.gov.nha.bis.upi.ack.Validity _validity;

    /**
     * Field _amount
     */
    private com.gov.nha.bis.upi.ack.Amount _amount;

    /**
     * Field _recurrence
     */
    private com.gov.nha.bis.upi.ack.RecurrenceType _recurrence;


      //----------------/
     //- Constructors -/
    //----------------/

    public MandateType() 
     {
        super();
    } //-- com.gov.nha.bis.upi.ack.MandateType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'amount'.
     * 
     * @return Amount
     * @return the value of field 'amount'.
     */
    public com.gov.nha.bis.upi.ack.Amount getAmount()
    {
        return this._amount;
    } //-- com.gov.nha.bis.upi.ack.Amount getAmount() 

    /**
     * Returns the value of field 'blockFund'.
     * 
     * @return BlockFund
     * @return the value of field 'blockFund'.
     */
    public com.gov.nha.bis.upi.ack.types.BlockFund getBlockFund()
    {
        return this._blockFund;
    } //-- com.gov.nha.bis.upi.ack.types.BlockFund getBlockFund() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'recurrence'.
     * 
     * @return RecurrenceType
     * @return the value of field 'recurrence'.
     */
    public com.gov.nha.bis.upi.ack.RecurrenceType getRecurrence()
    {
        return this._recurrence;
    } //-- com.gov.nha.bis.upi.ack.RecurrenceType getRecurrence() 

    /**
     * Returns the value of field 'revokeable'.
     * 
     * @return RevokeableType
     * @return the value of field 'revokeable'.
     */
    public com.gov.nha.bis.upi.ack.types.RevokeableType getRevokeable()
    {
        return this._revokeable;
    } //-- com.gov.nha.bis.upi.ack.types.RevokeableType getRevokeable() 

    /**
     * Returns the value of field 'shareToPayee'.
     * 
     * @return ShareToPayee
     * @return the value of field 'shareToPayee'.
     */
    public com.gov.nha.bis.upi.ack.types.ShareToPayee getShareToPayee()
    {
        return this._shareToPayee;
    } //-- com.gov.nha.bis.upi.ack.types.ShareToPayee getShareToPayee() 

    /**
     * Returns the value of field 'ts'.
     * 
     * @return String
     * @return the value of field 'ts'.
     */
    public java.lang.String getTs()
    {
        return this._ts;
    } //-- java.lang.String getTs() 

    /**
     * Returns the value of field 'txnId'.
     * 
     * @return String
     * @return the value of field 'txnId'.
     */
    public java.lang.String getTxnId()
    {
        return this._txnId;
    } //-- java.lang.String getTxnId() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return String
     * @return the value of field 'type'.
     */
    public java.lang.String getType()
    {
        return this._type;
    } //-- java.lang.String getType() 

    /**
     * Returns the value of field 'umn'.
     * 
     * @return String
     * @return the value of field 'umn'.
     */
    public java.lang.String getUmn()
    {
        return this._umn;
    } //-- java.lang.String getUmn() 

    /**
     * Returns the value of field 'validity'.
     * 
     * @return Validity
     * @return the value of field 'validity'.
     */
    public com.gov.nha.bis.upi.ack.Validity getValidity()
    {
        return this._validity;
    } //-- com.gov.nha.bis.upi.ack.Validity getValidity() 

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
     * Sets the value of field 'amount'.
     * 
     * @param amount the value of field 'amount'.
     */
    public void setAmount(com.gov.nha.bis.upi.ack.Amount amount)
    {
        this._amount = amount;
    } //-- void setAmount(com.gov.nha.bis.upi.ack.Amount) 

    /**
     * Sets the value of field 'blockFund'.
     * 
     * @param blockFund the value of field 'blockFund'.
     */
    public void setBlockFund(com.gov.nha.bis.upi.ack.types.BlockFund blockFund)
    {
        this._blockFund = blockFund;
    } //-- void setBlockFund(com.gov.nha.bis.upi.ack.types.BlockFund) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'recurrence'.
     * 
     * @param recurrence the value of field 'recurrence'.
     */
    public void setRecurrence(com.gov.nha.bis.upi.ack.RecurrenceType recurrence)
    {
        this._recurrence = recurrence;
    } //-- void setRecurrence(com.gov.nha.bis.upi.ack.RecurrenceType) 

    /**
     * Sets the value of field 'revokeable'.
     * 
     * @param revokeable the value of field 'revokeable'.
     */
    public void setRevokeable(com.gov.nha.bis.upi.ack.types.RevokeableType revokeable)
    {
        this._revokeable = revokeable;
    } //-- void setRevokeable(com.gov.nha.bis.upi.ack.types.RevokeableType) 

    /**
     * Sets the value of field 'shareToPayee'.
     * 
     * @param shareToPayee the value of field 'shareToPayee'.
     */
    public void setShareToPayee(com.gov.nha.bis.upi.ack.types.ShareToPayee shareToPayee)
    {
        this._shareToPayee = shareToPayee;
    } //-- void setShareToPayee(com.gov.nha.bis.upi.ack.types.ShareToPayee) 

    /**
     * Sets the value of field 'ts'.
     * 
     * @param ts the value of field 'ts'.
     */
    public void setTs(java.lang.String ts)
    {
        this._ts = ts;
    } //-- void setTs(java.lang.String) 

    /**
     * Sets the value of field 'txnId'.
     * 
     * @param txnId the value of field 'txnId'.
     */
    public void setTxnId(java.lang.String txnId)
    {
        this._txnId = txnId;
    } //-- void setTxnId(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(java.lang.String type)
    {
        this._type = type;
    } //-- void setType(java.lang.String) 

    /**
     * Sets the value of field 'umn'.
     * 
     * @param umn the value of field 'umn'.
     */
    public void setUmn(java.lang.String umn)
    {
        this._umn = umn;
    } //-- void setUmn(java.lang.String) 

    /**
     * Sets the value of field 'validity'.
     * 
     * @param validity the value of field 'validity'.
     */
    public void setValidity(com.gov.nha.bis.upi.ack.Validity validity)
    {
        this._validity = validity;
    } //-- void setValidity(com.gov.nha.bis.upi.ack.Validity) 

    /**
     * Method unmarshalMandateType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalMandateType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.MandateType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.MandateType.class, reader);
    } //-- java.lang.Object unmarshalMandateType(java.io.Reader) 

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
