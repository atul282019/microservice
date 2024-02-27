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
 * Class DeviceTagNameType.
 * 
 * @version $Revision$ $Date$
 */
public class DeviceTagNameType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The MOBILE type
     */
    public static final int MOBILE_TYPE = 0;

    /**
     * The instance of the MOBILE type
     */
    public static final DeviceTagNameType MOBILE = new DeviceTagNameType(MOBILE_TYPE, "MOBILE");

    /**
     * The GEOCODE type
     */
    public static final int GEOCODE_TYPE = 1;

    /**
     * The instance of the GEOCODE type
     */
    public static final DeviceTagNameType GEOCODE = new DeviceTagNameType(GEOCODE_TYPE, "GEOCODE");

    /**
     * The LOCATION type
     */
    public static final int LOCATION_TYPE = 2;

    /**
     * The instance of the LOCATION type
     */
    public static final DeviceTagNameType LOCATION = new DeviceTagNameType(LOCATION_TYPE, "LOCATION");

    /**
     * The IP type
     */
    public static final int IP_TYPE = 3;

    /**
     * The instance of the IP type
     */
    public static final DeviceTagNameType IP = new DeviceTagNameType(IP_TYPE, "IP");

    /**
     * The TYPE type
     */
    public static final int TYPE_TYPE = 4;

    /**
     * The instance of the TYPE type
     */
    public static final DeviceTagNameType TYPE = new DeviceTagNameType(TYPE_TYPE, "TYPE");

    /**
     * The ID type
     */
    public static final int ID_TYPE = 5;

    /**
     * The instance of the ID type
     */
    public static final DeviceTagNameType ID = new DeviceTagNameType(ID_TYPE, "ID");

    /**
     * The OS type
     */
    public static final int OS_TYPE = 6;

    /**
     * The instance of the OS type
     */
    public static final DeviceTagNameType OS = new DeviceTagNameType(OS_TYPE, "OS");

    /**
     * The APP type
     */
    public static final int APP_TYPE = 7;

    /**
     * The instance of the APP type
     */
    public static final DeviceTagNameType APP = new DeviceTagNameType(APP_TYPE, "APP");

    /**
     * The CAPABILITY type
     */
    public static final int CAPABILITY_TYPE = 8;

    /**
     * The instance of the CAPABILITY type
     */
    public static final DeviceTagNameType CAPABILITY = new DeviceTagNameType(CAPABILITY_TYPE, "CAPABILITY");

    /**
     * The TELECOM type
     */
    public static final int TELECOM_TYPE = 9;

    /**
     * The instance of the TELECOM type
     */
    public static final DeviceTagNameType TELECOM = new DeviceTagNameType(TELECOM_TYPE, "TELECOM");

    /**
     * The cardAccpTrId type
     */
    public static final int CARDACCPTRID_TYPE = 10;

    /**
     * The instance of the cardAccpTrId type
     */
    public static final DeviceTagNameType CARDACCPTRID = new DeviceTagNameType(CARDACCPTRID_TYPE, "cardAccpTrId");

    /**
     * The cardAccIdCode type
     */
    public static final int CARDACCIDCODE_TYPE = 11;

    /**
     * The instance of the cardAccIdCode type
     */
    public static final DeviceTagNameType CARDACCIDCODE = new DeviceTagNameType(CARDACCIDCODE_TYPE, "cardAccIdCode");

    /**
     * The posEntryCode type
     */
    public static final int POSENTRYCODE_TYPE = 12;

    /**
     * The instance of the posEntryCode type
     */
    public static final DeviceTagNameType POSENTRYCODE = new DeviceTagNameType(POSENTRYCODE_TYPE, "posEntryCode");

    /**
     * The posServCdnCode type
     */
    public static final int POSSERVCDNCODE_TYPE = 13;

    /**
     * The instance of the posServCdnCode type
     */
    public static final DeviceTagNameType POSSERVCDNCODE = new DeviceTagNameType(POSSERVCDNCODE_TYPE, "posServCdnCode");

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

    private DeviceTagNameType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.DeviceTagNameType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * DeviceTagNameType
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
     * Returns the type of this DeviceTagNameType
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
        members.put("MOBILE", MOBILE);
        members.put("GEOCODE", GEOCODE);
        members.put("LOCATION", LOCATION);
        members.put("IP", IP);
        members.put("TYPE", TYPE);
        members.put("ID", ID);
        members.put("OS", OS);
        members.put("APP", APP);
        members.put("CAPABILITY", CAPABILITY);
        members.put("TELECOM", TELECOM);
        members.put("cardAccpTrId", CARDACCPTRID);
        members.put("cardAccIdCode", CARDACCIDCODE);
        members.put("posEntryCode", POSENTRYCODE);
        members.put("posServCdnCode", POSSERVCDNCODE);
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
     * Returns the String representation of this DeviceTagNameType
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
     * Returns a new DeviceTagNameType based on the given String
     * value.
     * 
     * @param string
     * @return DeviceTagNameType
     */
    public static com.gov.nha.bis.upi.ack.types.DeviceTagNameType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DeviceTagNameType";
            throw new IllegalArgumentException(err);
        }
        return (DeviceTagNameType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.DeviceTagNameType valueOf(java.lang.String) 

}
