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
 * Class RiskScoresType.
 * 
 * @version $Revision$ $Date$
 */
public class RiskScoresType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _scoreList
     */
    private java.util.ArrayList _scoreList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RiskScoresType() 
     {
        super();
        _scoreList = new ArrayList();
    } //-- com.gov.nha.bis.upi.ack.RiskScoresType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addScore
     * 
     * 
     * 
     * @param vScore
     */
    public void addScore(com.gov.nha.bis.upi.ack.Score vScore)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_scoreList.size() < 5)) {
            throw new IndexOutOfBoundsException();
        }
        _scoreList.add(vScore);
    } //-- void addScore(com.gov.nha.bis.upi.ack.Score) 

    /**
     * Method addScore
     * 
     * 
     * 
     * @param index
     * @param vScore
     */
    public void addScore(int index, com.gov.nha.bis.upi.ack.Score vScore)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_scoreList.size() < 5)) {
            throw new IndexOutOfBoundsException();
        }
        _scoreList.add(index, vScore);
    } //-- void addScore(int, com.gov.nha.bis.upi.ack.Score) 

    /**
     * Method clearScore
     * 
     */
    public void clearScore()
    {
        _scoreList.clear();
    } //-- void clearScore() 

    /**
     * Method enumerateScore
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateScore()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_scoreList.iterator());
    } //-- java.util.Enumeration enumerateScore() 

    /**
     * Method getScore
     * 
     * 
     * 
     * @param index
     * @return Score
     */
    public com.gov.nha.bis.upi.ack.Score getScore(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _scoreList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.gov.nha.bis.upi.ack.Score) _scoreList.get(index);
    } //-- com.gov.nha.bis.upi.ack.Score getScore(int) 

    /**
     * Method getScore
     * 
     * 
     * 
     * @return Score
     */
    public com.gov.nha.bis.upi.ack.Score[] getScore()
    {
        int size = _scoreList.size();
        com.gov.nha.bis.upi.ack.Score[] mArray = new com.gov.nha.bis.upi.ack.Score[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.gov.nha.bis.upi.ack.Score) _scoreList.get(index);
        }
        return mArray;
    } //-- com.gov.nha.bis.upi.ack.Score[] getScore() 

    /**
     * Method getScoreCount
     * 
     * 
     * 
     * @return int
     */
    public int getScoreCount()
    {
        return _scoreList.size();
    } //-- int getScoreCount() 

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
     * Method removeScore
     * 
     * 
     * 
     * @param vScore
     * @return boolean
     */
    public boolean removeScore(com.gov.nha.bis.upi.ack.Score vScore)
    {
        boolean removed = _scoreList.remove(vScore);
        return removed;
    } //-- boolean removeScore(com.gov.nha.bis.upi.ack.Score) 

    /**
     * Method setScore
     * 
     * 
     * 
     * @param index
     * @param vScore
     */
    public void setScore(int index, com.gov.nha.bis.upi.ack.Score vScore)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _scoreList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 5)) {
            throw new IndexOutOfBoundsException();
        }
        _scoreList.set(index, vScore);
    } //-- void setScore(int, com.gov.nha.bis.upi.ack.Score) 

    /**
     * Method setScore
     * 
     * 
     * 
     * @param scoreArray
     */
    public void setScore(com.gov.nha.bis.upi.ack.Score[] scoreArray)
    {
        //-- copy array
        _scoreList.clear();
        for (int i = 0; i < scoreArray.length; i++) {
            _scoreList.add(scoreArray[i]);
        }
    } //-- void setScore(com.gov.nha.bis.upi.ack.Score) 

    /**
     * Method unmarshalRiskScoresType
     * 
     * 
     * 
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshalRiskScoresType(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.gov.nha.bis.upi.ack.RiskScoresType) Unmarshaller.unmarshal(com.gov.nha.bis.upi.ack.RiskScoresType.class, reader);
    } //-- java.lang.Object unmarshalRiskScoresType(java.io.Reader) 

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
