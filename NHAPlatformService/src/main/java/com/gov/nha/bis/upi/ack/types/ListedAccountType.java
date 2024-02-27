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
 * Class ListedAccountType.
 * 
 * @version $Revision$ $Date$
 */
public class ListedAccountType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The SAVINGS type
     */
    public static final int SAVINGS_TYPE = 0;

    /**
     * The instance of the SAVINGS type
     */
    public static final ListedAccountType SAVINGS = new ListedAccountType(SAVINGS_TYPE, "SAVINGS");

    /**
     * The CURRENT type
     */
    public static final int CURRENT_TYPE = 1;

    /**
     * The instance of the CURRENT type
     */
    public static final ListedAccountType CURRENT = new ListedAccountType(CURRENT_TYPE, "CURRENT");

    /**
     * The DEFAULT type
     */
    public static final int DEFAULT_TYPE = 2;

    /**
     * The instance of the DEFAULT type
     */
    public static final ListedAccountType DEFAULT = new ListedAccountType(DEFAULT_TYPE, "DEFAULT");

    /**
     * The NRE type
     */
    public static final int NRE_TYPE = 3;

    /**
     * The instance of the NRE type
     */
    public static final ListedAccountType NRE = new ListedAccountType(NRE_TYPE, "NRE");

    /**
     * The NRO type
     */
    public static final int NRO_TYPE = 4;

    /**
     * The instance of the NRO type
     */
    public static final ListedAccountType NRO = new ListedAccountType(NRO_TYPE, "NRO");

    /**
     * The CREDIT type
     */
    public static final int CREDIT_TYPE = 5;

    /**
     * The instance of the CREDIT type
     */
    public static final ListedAccountType CREDIT = new ListedAccountType(CREDIT_TYPE, "CREDIT");

    /**
     * The PPIWALLET type
     */
    public static final int PPIWALLET_TYPE = 6;

    /**
     * The instance of the PPIWALLET type
     */
    public static final ListedAccountType PPIWALLET = new ListedAccountType(PPIWALLET_TYPE, "PPIWALLET");

    /**
     * The BANKWALLET type
     */
    public static final int BANKWALLET_TYPE = 7;

    /**
     * The instance of the BANKWALLET type
     */
    public static final ListedAccountType BANKWALLET = new ListedAccountType(BANKWALLET_TYPE, "BANKWALLET");

    /**
     * The SEMICLOSEDBANKWALLET type
     */
    public static final int SEMICLOSEDBANKWALLET_TYPE = 8;

    /**
     * The instance of the SEMICLOSEDBANKWALLET type
     */
    public static final ListedAccountType SEMICLOSEDBANKWALLET = new ListedAccountType(SEMICLOSEDBANKWALLET_TYPE, "SEMICLOSEDBANKWALLET");

    /**
     * The SEMICLOSEDPPIWALLET type
     */
    public static final int SEMICLOSEDPPIWALLET_TYPE = 9;

    /**
     * The instance of the SEMICLOSEDPPIWALLET type
     */
    public static final ListedAccountType SEMICLOSEDPPIWALLET = new ListedAccountType(SEMICLOSEDPPIWALLET_TYPE, "SEMICLOSEDPPIWALLET");

    /**
     * The SOD type
     */
    public static final int SOD_TYPE = 10;

    /**
     * The instance of the SOD type
     */
    public static final ListedAccountType SOD = new ListedAccountType(SOD_TYPE, "SOD");

    /**
     * The UOD type
     */
    public static final int UOD_TYPE = 11;

    /**
     * The instance of the UOD type
     */
    public static final ListedAccountType UOD = new ListedAccountType(UOD_TYPE, "UOD");

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

    private ListedAccountType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.gov.nha.bis.upi.ack.types.ListedAccountType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ListedAccountType
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
     * Returns the type of this ListedAccountType
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
        members.put("SAVINGS", SAVINGS);
        members.put("CURRENT", CURRENT);
        members.put("DEFAULT", DEFAULT);
        members.put("NRE", NRE);
        members.put("NRO", NRO);
        members.put("CREDIT", CREDIT);
        members.put("PPIWALLET", PPIWALLET);
        members.put("BANKWALLET", BANKWALLET);
        members.put("SEMICLOSEDBANKWALLET", SEMICLOSEDBANKWALLET);
        members.put("SEMICLOSEDPPIWALLET", SEMICLOSEDPPIWALLET);
        members.put("SOD", SOD);
        members.put("UOD", UOD);
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
     * Returns the String representation of this ListedAccountType
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
     * Returns a new ListedAccountType based on the given String
     * value.
     * 
     * @param string
     * @return ListedAccountType
     */
    public static com.gov.nha.bis.upi.ack.types.ListedAccountType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ListedAccountType";
            throw new IllegalArgumentException(err);
        }
        return (ListedAccountType) obj;
    } //-- com.gov.nha.bis.upi.ack.types.ListedAccountType valueOf(java.lang.String) 

}
