
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityOrderRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityOrderRequestsDescryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequestsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityChildKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityOrderRequestsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityOrderRequestsDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityOrderRequestsCalendar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequestsCategories" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "idUniversityOrderRequests",
    "lastName",
    "firstName",
    "middleName",
    "phone",
    "email",
    "universityOrderRequestsDescryption",
    "allCount",
    "idUniversityOrderRequestsType",
    "universityChildKode",
    "universityOrderRequestsNumber",
    "universityOrderRequestsDate",
    "idUniversityOrderRequestsCalendar",
    "idUniversityOrderRequestsCategories"
})
@XmlRootElement(name = "UniversityOrderRequestsEdit")
public class UniversityOrderRequestsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityOrderRequests")
    protected int idUniversityOrderRequests;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "UniversityOrderRequestsDescryption")
    protected String universityOrderRequestsDescryption;
    @XmlElement(name = "AllCount")
    protected int allCount;
    @XmlElement(name = "Id_UniversityOrderRequestsType")
    protected int idUniversityOrderRequestsType;
    @XmlElement(name = "UniversityChildKode")
    protected String universityChildKode;
    @XmlElement(name = "UniversityOrderRequestsNumber")
    protected String universityOrderRequestsNumber;
    @XmlElement(name = "UniversityOrderRequestsDate")
    protected String universityOrderRequestsDate;
    @XmlElement(name = "Id_UniversityOrderRequestsCalendar")
    protected int idUniversityOrderRequestsCalendar;
    @XmlElement(name = "Id_UniversityOrderRequestsCategories")
    protected int idUniversityOrderRequestsCategories;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequests property.
     * 
     */
    public int getIdUniversityOrderRequests() {
        return idUniversityOrderRequests;
    }

    /**
     * Sets the value of the idUniversityOrderRequests property.
     * 
     */
    public void setIdUniversityOrderRequests(int value) {
        this.idUniversityOrderRequests = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the universityOrderRequestsDescryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsDescryption() {
        return universityOrderRequestsDescryption;
    }

    /**
     * Sets the value of the universityOrderRequestsDescryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsDescryption(String value) {
        this.universityOrderRequestsDescryption = value;
    }

    /**
     * Gets the value of the allCount property.
     * 
     */
    public int getAllCount() {
        return allCount;
    }

    /**
     * Sets the value of the allCount property.
     * 
     */
    public void setAllCount(int value) {
        this.allCount = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequestsType property.
     * 
     */
    public int getIdUniversityOrderRequestsType() {
        return idUniversityOrderRequestsType;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsType property.
     * 
     */
    public void setIdUniversityOrderRequestsType(int value) {
        this.idUniversityOrderRequestsType = value;
    }

    /**
     * Gets the value of the universityChildKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityChildKode() {
        return universityChildKode;
    }

    /**
     * Sets the value of the universityChildKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityChildKode(String value) {
        this.universityChildKode = value;
    }

    /**
     * Gets the value of the universityOrderRequestsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsNumber() {
        return universityOrderRequestsNumber;
    }

    /**
     * Sets the value of the universityOrderRequestsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsNumber(String value) {
        this.universityOrderRequestsNumber = value;
    }

    /**
     * Gets the value of the universityOrderRequestsDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsDate() {
        return universityOrderRequestsDate;
    }

    /**
     * Sets the value of the universityOrderRequestsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsDate(String value) {
        this.universityOrderRequestsDate = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequestsCalendar property.
     * 
     */
    public int getIdUniversityOrderRequestsCalendar() {
        return idUniversityOrderRequestsCalendar;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsCalendar property.
     * 
     */
    public void setIdUniversityOrderRequestsCalendar(int value) {
        this.idUniversityOrderRequestsCalendar = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequestsCategories property.
     * 
     */
    public int getIdUniversityOrderRequestsCategories() {
        return idUniversityOrderRequestsCategories;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsCategories property.
     * 
     */
    public void setIdUniversityOrderRequestsCategories(int value) {
        this.idUniversityOrderRequestsCategories = value;
    }

}
