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
 * Class RecurrencePatternType.
 * 
 * @version $Revision$ $Date$
 */
public class RecurrencePatternType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ONETIME type
     */
    public static final int ONETIME_TYPE = 0;

    /**
     * The instance of the ONETIME type
     */
    public static final RecurrencePatternType ONETIME = new RecurrencePatternType(ONETIME_TYPE, "ONETIME");

    /**
     * The DAILY type
     */
    public static final int DAILY_TYPE = 1;

    /**
     * The instance of the DAILY type
     */
    public static final RecurrencePatternType DAILY = new RecurrencePatternType(DAILY_TYPE, "DAILY");

    /**
     * The WEEKLY type
     */
    public static final int WEEKLY_TYPE = 2;

    /**
     * The instance of the WEEKLY type
     */
    public static final RecurrencePatternType WEEKLY = new RecurrencePatternType(WEEKLY_TYPE, "WEEKLY");

    /**
     * The FORTNIGHTLY type
     */
    public static final int FORTNIGHTLY_TYPE = 3;

    /**
     * The instance of the FORTNIGHTLY type
     */
    public static final RecurrencePatternType FORTNIGHTLY = new RecurrencePatternType(FORTNIGHTLY_TYPE, "FORTNIGHTLY");

    /**
     * The MONTHLY type
     */
    public static final int MONTHLY_TYPE = 4;

    /**
     * The instance of the MONTHLY type
     */
    public static final RecurrencePatternType MONTHLY = new RecurrencePatternType(MONTHLY_TYPE, "MONTHLY");

    /**
     * The BIMONTHLY type
     */
    public static final int BIMONTHLY_TYPE = 5;

    /**
     * The instance of the BIMONTHLY type
     */
    public static final RecurrencePatternType BIMONTHLY = new RecurrencePatternType(BIMONTHLY_TYPE, "BIMONTHLY");

    /**
     * The QUARTERLY type
     */
    public static final int QUARTERLY_TYPE = 6;

    /**
     * The instance of the QUARTERLY type
     */
    public static final RecurrencePatternType QUARTERLY = new RecurrencePatternType(QUARTERLY_TYPE, "QUARTERLY");

    /**
     * The HALFYEARLY type
     */
    public static final int HALFYEARLY_TYPE = 7;

    /**
     * The instance of the HALFYEARLY type
     */
    public static final RecurrencePatternType HALFYEARLY = new RecurrencePatternType(HALFYEARLY_TYPE, "HALFYEARLY");

    /**
     * The YEARLY type
     */
    public static final int YEARLY_TYPE = 8;

    /**
     * The instance of the YEARLY type
     */
    public static final RecurrencePatternType YEARLY = new RecurrencePatternType(YEARLY_TYPE, "YEARLY");

    /**
     * The ASPRESENTED type
     */
    public static final int ASPRESENTED_TYPE = 9;

    /**
     * The instance of the ASPRESENTED type
     */
    public static final RecurrencePatternType ASPRESENTED = new RecurrencePatternType(ASPRESENTED_TYPE, "ASPRESENTED");

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

    private RecurrencePatternType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.RecurrencePatternType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * RecurrencePatternType
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
     * Returns the type of this RecurrencePatternType
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
        members.put("ONETIME", ONETIME);
        members.put("DAILY", DAILY);
        members.put("WEEKLY", WEEKLY);
        members.put("FORTNIGHTLY", FORTNIGHTLY);
        members.put("MONTHLY", MONTHLY);
        members.put("BIMONTHLY", BIMONTHLY);
        members.put("QUARTERLY", QUARTERLY);
        members.put("HALFYEARLY", HALFYEARLY);
        members.put("YEARLY", YEARLY);
        members.put("ASPRESENTED", ASPRESENTED);
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
     * Returns the String representation of this
     * RecurrencePatternType
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
     * Returns a new RecurrencePatternType based on the given
     * String value.
     * 
     * @param string
     * @return RecurrencePatternType
     */
    public static com.gov.nha.bis.upi.ack.types.RecurrencePatternType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RecurrencePatternType";
            throw new IllegalArgumentException(err);
        }
        return (RecurrencePatternType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.RecurrencePatternType valueOf(java.lang.String) 

}
