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
 * Class ActionConstant.
 * 
 * @version $Revision$ $Date$
 */
public class ActionConstant implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Activation type
     */
    public static final int ACTIVATION_TYPE = 0;

    /**
     * The instance of the Activation type
     */
    public static final ActionConstant ACTIVATION = new ActionConstant(ACTIVATION_TYPE, "Activation");

    /**
     * The Update type
     */
    public static final int UPDATE_TYPE = 1;

    /**
     * The instance of the Update type
     */
    public static final ActionConstant UPDATE = new ActionConstant(UPDATE_TYPE, "Update");

    /**
     * The Deactivation type
     */
    public static final int DEACTIVATION_TYPE = 2;

    /**
     * The instance of the Deactivation type
     */
    public static final ActionConstant DEACTIVATION = new ActionConstant(DEACTIVATION_TYPE, "Deactivation");

    /**
     * The Query type
     */
    public static final int QUERY_TYPE = 3;

    /**
     * The instance of the Query type
     */
    public static final ActionConstant QUERY = new ActionConstant(QUERY_TYPE, "Query");

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

    private ActionConstant(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.ActionConstant(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ActionConstant
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
     * Returns the type of this ActionConstant
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
        members.put("Activation", ACTIVATION);
        members.put("Update", UPDATE);
        members.put("Deactivation", DEACTIVATION);
        members.put("Query", QUERY);
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
     * Returns the String representation of this ActionConstant
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
     * Returns a new ActionConstant based on the given String
     * value.
     * 
     * @param string
     * @return ActionConstant
     */
    public static com.gov.nha.bis.upi.ack.types.ActionConstant valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ActionConstant";
            throw new IllegalArgumentException(err);
        }
        return (ActionConstant) obj;
    } //-- com.gov.nha.bis.upi.ack.types.ActionConstant valueOf(java.lang.String) 

}
