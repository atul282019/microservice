/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.7</a>, using an XML
 * Schema.
 * $Id$
 */

package com.gov.nha.bis.upi.ack.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class RecurrenceRuleType.
 * 
 * @version $Revision$ $Date$
 */
public class RecurrenceRuleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The BEFORE type
     */
    public static final int BEFORE_TYPE = 0;

    /**
     * The instance of the BEFORE type
     */
    public static final RecurrenceRuleType BEFORE = new RecurrenceRuleType(BEFORE_TYPE, "BEFORE");

    /**
     * The ON type
     */
    public static final int ON_TYPE = 1;

    /**
     * The instance of the ON type
     */
    public static final RecurrenceRuleType ON = new RecurrenceRuleType(ON_TYPE, "ON");

    /**
     * The AFTER type
     */
    public static final int AFTER_TYPE = 2;

    /**
     * The instance of the AFTER type
     */
    public static final RecurrenceRuleType AFTER = new RecurrenceRuleType(AFTER_TYPE, "AFTER");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private RecurrenceRuleType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.RecurrenceRuleType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * RecurrenceRuleType
     * 
     * @return Enumeration
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getType
     * 
     * Returns the type of this RecurrenceRuleType
     * 
     * @return int
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     * 
     * 
     * 
     * @return Hashtable
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("BEFORE", BEFORE);
        members.put("ON", ON);
        members.put("AFTER", AFTER);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method readResolve
     * 
     *  will be called during deserialization to replace the
     * deserialized object with the correct constant instance.
     * <br/>
     * 
     * @return Object
     */
    private java.lang.Object readResolve()
    {
        return valueOf(this.stringValue);
    } //-- java.lang.Object readResolve() 

    /**
     * Method toString
     * 
     * Returns the String representation of this RecurrenceRuleType
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOf
     * 
     * Returns a new RecurrenceRuleType based on the given String
     * value.
     * 
     * @param string
     * @return RecurrenceRuleType
     */
    public static com.gov.nha.bis.upi.ack.types.RecurrenceRuleType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RecurrenceRuleType";
            throw new IllegalArgumentException(err);
        }
        return (RecurrenceRuleType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.RecurrenceRuleType valueOf(java.lang.String) 

}
