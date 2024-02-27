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
 * Class OpType.
 * 
 * @version $Revision$ $Date$
 */
public class OpType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ADD type
     */
    public static final int ADD_TYPE = 0;

    /**
     * The instance of the ADD type
     */
    public static final OpType ADD = new OpType(ADD_TYPE, "ADD");

    /**
     * The MODIFY type
     */
    public static final int MODIFY_TYPE = 1;

    /**
     * The instance of the MODIFY type
     */
    public static final OpType MODIFY = new OpType(MODIFY_TYPE, "MODIFY");

    /**
     * The UPDATE type
     */
    public static final int UPDATE_TYPE = 2;

    /**
     * The instance of the UPDATE type
     */
    public static final OpType UPDATE = new OpType(UPDATE_TYPE, "UPDATE");

    /**
     * The REMOVE type
     */
    public static final int REMOVE_TYPE = 3;

    /**
     * The instance of the REMOVE type
     */
    public static final OpType REMOVE = new OpType(REMOVE_TYPE, "REMOVE");

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

    private OpType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.OpType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of OpType
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
     * Returns the type of this OpType
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
        members.put("ADD", ADD);
        members.put("MODIFY", MODIFY);
        members.put("UPDATE", UPDATE);
        members.put("REMOVE", REMOVE);
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
     * Returns the String representation of this OpType
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
     * Returns a new OpType based on the given String value.
     * 
     * @param string
     * @return OpType
     */
    public static com.gov.nha.bis.upi.ack.types.OpType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid OpType";
            throw new IllegalArgumentException(err);
        }
        return (OpType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.OpType valueOf(java.lang.String) 

}
