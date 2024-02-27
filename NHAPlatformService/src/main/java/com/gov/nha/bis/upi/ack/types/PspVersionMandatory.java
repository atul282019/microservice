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
 * Class PspVersionMandatory.
 * 
 * @version $Revision$ $Date$
 */
public class PspVersionMandatory implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The TRUE type
     */
    public static final int TRUE_TYPE = 0;

    /**
     * The instance of the TRUE type
     */
    public static final PspVersionMandatory TRUE = new PspVersionMandatory(TRUE_TYPE, "TRUE");

    /**
     * The FALSE type
     */
    public static final int FALSE_TYPE = 1;

    /**
     * The instance of the FALSE type
     */
    public static final PspVersionMandatory FALSE = new PspVersionMandatory(FALSE_TYPE, "FALSE");

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

    private PspVersionMandatory(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.PspVersionMandatory(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * PspVersionMandatory
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
     * Returns the type of this PspVersionMandatory
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
        members.put("TRUE", TRUE);
        members.put("FALSE", FALSE);
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
     * PspVersionMandatory
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
     * Returns a new PspVersionMandatory based on the given String
     * value.
     * 
     * @param string
     * @return PspVersionMandatory
     */
    public static com.gov.nha.bis.upi.ack.types.PspVersionMandatory valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PspVersionMandatory";
            throw new IllegalArgumentException(err);
        }
        return (PspVersionMandatory) obj;
    } //-- com.gov.nha.bis.upi.ack.types.PspVersionMandatory valueOf(java.lang.String) 

}
