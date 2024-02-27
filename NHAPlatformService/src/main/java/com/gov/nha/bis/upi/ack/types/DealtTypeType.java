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
 * Class DealtTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DealtTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The SPOT type
     */
    public static final int SPOT_TYPE = 0;

    /**
     * The instance of the SPOT type
     */
    public static final DealtTypeType SPOT = new DealtTypeType(SPOT_TYPE, "SPOT");

    /**
     * The FORWARD type
     */
    public static final int FORWARD_TYPE = 1;

    /**
     * The instance of the FORWARD type
     */
    public static final DealtTypeType FORWARD = new DealtTypeType(FORWARD_TYPE, "FORWARD");

    /**
     * The NDF type
     */
    public static final int NDF_TYPE = 2;

    /**
     * The instance of the NDF type
     */
    public static final DealtTypeType NDF = new DealtTypeType(NDF_TYPE, "NDF");

    /**
     * The SWAPS type
     */
    public static final int SWAPS_TYPE = 3;

    /**
     * The instance of the SWAPS type
     */
    public static final DealtTypeType SWAPS = new DealtTypeType(SWAPS_TYPE, "SWAPS");

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

    private DealtTypeType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.DealtTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * DealtTypeType
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
     * Returns the type of this DealtTypeType
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
        members.put("SPOT", SPOT);
        members.put("FORWARD", FORWARD);
        members.put("NDF", NDF);
        members.put("SWAPS", SWAPS);
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
     * Returns the String representation of this DealtTypeType
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
     * Returns a new DealtTypeType based on the given String value.
     * 
     * @param string
     * @return DealtTypeType
     */
    public static com.gov.nha.bis.upi.ack.types.DealtTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DealtTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DealtTypeType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.DealtTypeType valueOf(java.lang.String) 

}
