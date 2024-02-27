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
 * Class OwnershipType.
 * 
 * @version $Revision$ $Date$
 */
public class OwnershipType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The PROPRIETARY type
     */
    public static final int PROPRIETARY_TYPE = 0;

    /**
     * The instance of the PROPRIETARY type
     */
    public static final OwnershipType PROPRIETARY = new OwnershipType(PROPRIETARY_TYPE, "PROPRIETARY");

    /**
     * The PARTNERSHIP type
     */
    public static final int PARTNERSHIP_TYPE = 1;

    /**
     * The instance of the PARTNERSHIP type
     */
    public static final OwnershipType PARTNERSHIP = new OwnershipType(PARTNERSHIP_TYPE, "PARTNERSHIP");

    /**
     * The PRIVATE type
     */
    public static final int PRIVATE_TYPE = 2;

    /**
     * The instance of the PRIVATE type
     */
    public static final OwnershipType PRIVATE = new OwnershipType(PRIVATE_TYPE, "PRIVATE");

    /**
     * The PUBLIC type
     */
    public static final int PUBLIC_TYPE = 3;

    /**
     * The instance of the PUBLIC type
     */
    public static final OwnershipType PUBLIC = new OwnershipType(PUBLIC_TYPE, "PUBLIC");

    /**
     * The OTHERS type
     */
    public static final int OTHERS_TYPE = 4;

    /**
     * The instance of the OTHERS type
     */
    public static final OwnershipType OTHERS = new OwnershipType(OTHERS_TYPE, "OTHERS");

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

    private OwnershipType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.OwnershipType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * OwnershipType
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
     * Returns the type of this OwnershipType
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
        members.put("PROPRIETARY", PROPRIETARY);
        members.put("PARTNERSHIP", PARTNERSHIP);
        members.put("PRIVATE", PRIVATE);
        members.put("PUBLIC", PUBLIC);
        members.put("OTHERS", OTHERS);
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
     * Returns the String representation of this OwnershipType
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
     * Returns a new OwnershipType based on the given String value.
     * 
     * @param string
     * @return OwnershipType
     */
    public static com.gov.nha.bis.upi.ack.types.OwnershipType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid OwnershipType";
            throw new IllegalArgumentException(err);
        }
        return (OwnershipType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.OwnershipType valueOf(java.lang.String) 

}
