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
 * Class RefProcStatus.
 * 
 * @version $Revision$ $Date$
 */
public class RefProcStatus implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The COMPLETED type
     */
    public static final int COMPLETED_TYPE = 0;

    /**
     * The instance of the COMPLETED type
     */
    public static final RefProcStatus COMPLETED = new RefProcStatus(COMPLETED_TYPE, "COMPLETED");

    /**
     * The TIMEOUT type
     */
    public static final int TIMEOUT_TYPE = 1;

    /**
     * The instance of the TIMEOUT type
     */
    public static final RefProcStatus TIMEOUT = new RefProcStatus(TIMEOUT_TYPE, "TIMEOUT");

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

    private RefProcStatus(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.RefProcStatus(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * RefProcStatus
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
     * Returns the type of this RefProcStatus
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
        members.put("COMPLETED", COMPLETED);
        members.put("TIMEOUT", TIMEOUT);
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
     * Returns the String representation of this RefProcStatus
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
     * Returns a new RefProcStatus based on the given String value.
     * 
     * @param string
     * @return RefProcStatus
     */
    public static com.gov.nha.bis.upi.ack.types.RefProcStatus valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid RefProcStatus";
            throw new IllegalArgumentException(err);
        }
        return (RefProcStatus) obj;
    } //-- com.gov.nha.bis.upi.ack.types.RefProcStatus valueOf(java.lang.String) 

}
