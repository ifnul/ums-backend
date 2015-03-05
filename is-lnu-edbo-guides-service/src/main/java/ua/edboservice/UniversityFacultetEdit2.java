
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
 *         &lt;element name="Id_UniversityFacultet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityFacultetName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityFacultetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsAvailableForReceiptOfRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsAvailableForBindStudentPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsAvailableForBindStaffPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacultetPostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacultetStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacultetHouseNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPerepidgotovka" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversityFacultet",
    "universityFacultetDateBegin",
    "universityFacultetDateEnd",
    "idUniversityFacultetName",
    "universityFacultetFullName",
    "universityFacultetShortName",
    "description",
    "idLanguage",
    "idUniversityFacultetType",
    "isAvailableForReceiptOfRequest",
    "isAvailableForBindStudentPersons",
    "isAvailableForBindStaffPersons",
    "koatuuCode",
    "facultetPostIndex",
    "facultetStreetName",
    "facultetHouseNumbers",
    "isPerepidgotovka",
    "universityFacultetFullNameEn",
    "universityFacultetShortNameEn"
})
@XmlRootElement(name = "UniversityFacultetEdit2")
public class UniversityFacultetEdit2 {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityFacultet")
    protected int idUniversityFacultet;
    @XmlElement(name = "UniversityFacultetDateBegin")
    protected String universityFacultetDateBegin;
    @XmlElement(name = "UniversityFacultetDateEnd")
    protected String universityFacultetDateEnd;
    @XmlElement(name = "Id_UniversityFacultetName")
    protected int idUniversityFacultetName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityFacultetShortName")
    protected String universityFacultetShortName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_UniversityFacultetType")
    protected int idUniversityFacultetType;
    @XmlElement(name = "IsAvailableForReceiptOfRequest")
    protected int isAvailableForReceiptOfRequest;
    @XmlElement(name = "IsAvailableForBindStudentPersons")
    protected int isAvailableForBindStudentPersons;
    @XmlElement(name = "IsAvailableForBindStaffPersons")
    protected int isAvailableForBindStaffPersons;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "FacultetPostIndex")
    protected String facultetPostIndex;
    @XmlElement(name = "FacultetStreetName")
    protected String facultetStreetName;
    @XmlElement(name = "FacultetHouseNumbers")
    protected String facultetHouseNumbers;
    @XmlElement(name = "IsPerepidgotovka")
    protected int isPerepidgotovka;
    @XmlElement(name = "UniversityFacultetFullNameEn")
    protected String universityFacultetFullNameEn;
    @XmlElement(name = "UniversityFacultetShortNameEn")
    protected String universityFacultetShortNameEn;

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
     * Gets the value of the idUniversityFacultet property.
     * 
     */
    public int getIdUniversityFacultet() {
        return idUniversityFacultet;
    }

    /**
     * Sets the value of the idUniversityFacultet property.
     * 
     */
    public void setIdUniversityFacultet(int value) {
        this.idUniversityFacultet = value;
    }

    /**
     * Gets the value of the universityFacultetDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetDateBegin() {
        return universityFacultetDateBegin;
    }

    /**
     * Sets the value of the universityFacultetDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetDateBegin(String value) {
        this.universityFacultetDateBegin = value;
    }

    /**
     * Gets the value of the universityFacultetDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetDateEnd() {
        return universityFacultetDateEnd;
    }

    /**
     * Sets the value of the universityFacultetDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetDateEnd(String value) {
        this.universityFacultetDateEnd = value;
    }

    /**
     * Gets the value of the idUniversityFacultetName property.
     * 
     */
    public int getIdUniversityFacultetName() {
        return idUniversityFacultetName;
    }

    /**
     * Sets the value of the idUniversityFacultetName property.
     * 
     */
    public void setIdUniversityFacultetName(int value) {
        this.idUniversityFacultetName = value;
    }

    /**
     * Gets the value of the universityFacultetFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullName() {
        return universityFacultetFullName;
    }

    /**
     * Sets the value of the universityFacultetFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullName(String value) {
        this.universityFacultetFullName = value;
    }

    /**
     * Gets the value of the universityFacultetShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetShortName() {
        return universityFacultetShortName;
    }

    /**
     * Sets the value of the universityFacultetShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetShortName(String value) {
        this.universityFacultetShortName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the idUniversityFacultetType property.
     * 
     */
    public int getIdUniversityFacultetType() {
        return idUniversityFacultetType;
    }

    /**
     * Sets the value of the idUniversityFacultetType property.
     * 
     */
    public void setIdUniversityFacultetType(int value) {
        this.idUniversityFacultetType = value;
    }

    /**
     * Gets the value of the isAvailableForReceiptOfRequest property.
     * 
     */
    public int getIsAvailableForReceiptOfRequest() {
        return isAvailableForReceiptOfRequest;
    }

    /**
     * Sets the value of the isAvailableForReceiptOfRequest property.
     * 
     */
    public void setIsAvailableForReceiptOfRequest(int value) {
        this.isAvailableForReceiptOfRequest = value;
    }

    /**
     * Gets the value of the isAvailableForBindStudentPersons property.
     * 
     */
    public int getIsAvailableForBindStudentPersons() {
        return isAvailableForBindStudentPersons;
    }

    /**
     * Sets the value of the isAvailableForBindStudentPersons property.
     * 
     */
    public void setIsAvailableForBindStudentPersons(int value) {
        this.isAvailableForBindStudentPersons = value;
    }

    /**
     * Gets the value of the isAvailableForBindStaffPersons property.
     * 
     */
    public int getIsAvailableForBindStaffPersons() {
        return isAvailableForBindStaffPersons;
    }

    /**
     * Sets the value of the isAvailableForBindStaffPersons property.
     * 
     */
    public void setIsAvailableForBindStaffPersons(int value) {
        this.isAvailableForBindStaffPersons = value;
    }

    /**
     * Gets the value of the koatuuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCode() {
        return koatuuCode;
    }

    /**
     * Sets the value of the koatuuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCode(String value) {
        this.koatuuCode = value;
    }

    /**
     * Gets the value of the facultetPostIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultetPostIndex() {
        return facultetPostIndex;
    }

    /**
     * Sets the value of the facultetPostIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultetPostIndex(String value) {
        this.facultetPostIndex = value;
    }

    /**
     * Gets the value of the facultetStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultetStreetName() {
        return facultetStreetName;
    }

    /**
     * Sets the value of the facultetStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultetStreetName(String value) {
        this.facultetStreetName = value;
    }

    /**
     * Gets the value of the facultetHouseNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultetHouseNumbers() {
        return facultetHouseNumbers;
    }

    /**
     * Sets the value of the facultetHouseNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultetHouseNumbers(String value) {
        this.facultetHouseNumbers = value;
    }

    /**
     * Gets the value of the isPerepidgotovka property.
     * 
     */
    public int getIsPerepidgotovka() {
        return isPerepidgotovka;
    }

    /**
     * Sets the value of the isPerepidgotovka property.
     * 
     */
    public void setIsPerepidgotovka(int value) {
        this.isPerepidgotovka = value;
    }

    /**
     * Gets the value of the universityFacultetFullNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullNameEn() {
        return universityFacultetFullNameEn;
    }

    /**
     * Sets the value of the universityFacultetFullNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullNameEn(String value) {
        this.universityFacultetFullNameEn = value;
    }

    /**
     * Gets the value of the universityFacultetShortNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetShortNameEn() {
        return universityFacultetShortNameEn;
    }

    /**
     * Sets the value of the universityFacultetShortNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetShortNameEn(String value) {
        this.universityFacultetShortNameEn = value;
    }

}
