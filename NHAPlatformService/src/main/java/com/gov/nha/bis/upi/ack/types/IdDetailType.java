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
 * Class IdDetailType.
 * 
 * @version $Revision$ $Date$
 */
public class IdDetailType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ACNUM type
     */
    public static final int ACNUM_TYPE = 0;

    /**
     * The instance of the ACNUM type
     */
    public static final IdDetailType ACNUM = new IdDetailType(ACNUM_TYPE, "ACNUM");

    /**
     * The MASKNAME type
     */
    public static final int MASKNAME_TYPE = 1;

    /**
     * The instance of the MASKNAME type
     */
    public static final IdDetailType MASKNAME = new IdDetailType(MASKNAME_TYPE, "MASKNAME");

    /**
     * The IFSC type
     */
    public static final int IFSC_TYPE = 2;

    /**
     * The instance of the IFSC type
     */
    public static final IdDetailType IFSC = new IdDetailType(IFSC_TYPE, "IFSC");

    /**
     * The ACTYPE type
     */
    public static final int ACTYPE_TYPE = 3;

    /**
     * The instance of the ACTYPE type
     */
    public static final IdDetailType ACTYPE = new IdDetailType(ACTYPE_TYPE, "ACTYPE");

    /**
     * The ACNATURE type
     */
    public static final int ACNATURE_TYPE = 4;

    /**
     * The instance of the ACNATURE type
     */
    public static final IdDetailType ACNATURE = new IdDetailType(ACNATURE_TYPE, "ACNATURE");

    /**
     * The ACHOLDER type
     */
    public static final int ACHOLDER_TYPE = 5;

    /**
     * The instance of the ACHOLDER type
     */
    public static final IdDetailType ACHOLDER = new IdDetailType(ACHOLDER_TYPE, "ACHOLDER");

    /**
     * The CODE type
     */
    public static final int CODE_TYPE = 6;

    /**
     * The instance of the CODE type
     */
    public static final IdDetailType CODE = new IdDetailType(CODE_TYPE, "CODE");

    /**
     * The TYPE type
     */
    public static final int TYPE_TYPE = 7;

    /**
     * The instance of the TYPE type
     */
    public static final IdDetailType TYPE = new IdDetailType(TYPE_TYPE, "TYPE");

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

    private IdDetailType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.IdDetailType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * IdDetailType
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
     * Returns the type of this IdDetailType
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
        members.put("ACNUM", ACNUM);
        members.put("MASKNAME", MASKNAME);
        members.put("IFSC", IFSC);
        members.put("ACTYPE", ACTYPE);
        members.put("ACNATURE", ACNATURE);
        members.put("ACHOLDER", ACHOLDER);
        members.put("CODE", CODE);
        members.put("TYPE", TYPE);
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
     * Returns the String representation of this IdDetailType
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
     * Returns a new IdDetailType based on the given String value.
     * 
     * @param string
     * @return IdDetailType
     */
    public static com.gov.nha.bis.upi.ack.types.IdDetailType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid IdDetailType";
            throw new IllegalArgumentException(err);
        }
        return (IdDetailType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.IdDetailType valueOf(java.lang.String) 

}
