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
 * Class SignatoryTypeEnum.
 * 
 * @version $Revision$ $Date$
 */
public class SignatoryTypeEnum implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Signatory1 type
     */
    public static final int SIGNATORY1_TYPE = 0;

    /**
     * The instance of the Signatory1 type
     */
    public static final SignatoryTypeEnum SIGNATORY1 = new SignatoryTypeEnum(SIGNATORY1_TYPE, "Signatory1");

    /**
     * The Signatory2 type
     */
    public static final int SIGNATORY2_TYPE = 1;

    /**
     * The instance of the Signatory2 type
     */
    public static final SignatoryTypeEnum SIGNATORY2 = new SignatoryTypeEnum(SIGNATORY2_TYPE, "Signatory2");

    /**
     * The Signatory3 type
     */
    public static final int SIGNATORY3_TYPE = 2;

    /**
     * The instance of the Signatory3 type
     */
    public static final SignatoryTypeEnum SIGNATORY3 = new SignatoryTypeEnum(SIGNATORY3_TYPE, "Signatory3");

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

    private SignatoryTypeEnum(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.SignatoryTypeEnum(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * SignatoryTypeEnum
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
     * Returns the type of this SignatoryTypeEnum
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
        members.put("Signatory1", SIGNATORY1);
        members.put("Signatory2", SIGNATORY2);
        members.put("Signatory3", SIGNATORY3);
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
     * Returns the String representation of this SignatoryTypeEnum
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
     * Returns a new SignatoryTypeEnum based on the given String
     * value.
     * 
     * @param string
     * @return SignatoryTypeEnum
     */
    public static com.gov.nha.bis.upi.ack.types.SignatoryTypeEnum valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SignatoryTypeEnum";
            throw new IllegalArgumentException(err);
        }
        return (SignatoryTypeEnum) obj;
    } //-- com.gov.nha.bis.upi.ack.types.SignatoryTypeEnum valueOf(java.lang.String) 

}
