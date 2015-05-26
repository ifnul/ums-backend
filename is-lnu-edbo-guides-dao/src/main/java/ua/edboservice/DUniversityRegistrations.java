
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityRegistrations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityRegistrations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityRegistration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityRegistrationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityRegistrationDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityRegistrationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityRegistrationDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityRegistrationIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityRegistrationusersCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityRegistrationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityCertificates" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCertificatesFilePasswordSendType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCertificatesBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityCertificatesExpiredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityCertificatesDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityRegistrations", propOrder = {
    "idUniversityRegistration",
    "idUniversityRegistrationType",
    "idRegulationDocument",
    "universityKode",
    "universityRegistrationDateBegin",
    "universityRegistrationDateEnd",
    "universityRegistrationDateLastChange",
    "universityRegistrationIsActive",
    "universityRegistrationusersCount",
    "universityRegistrationTypeName",
    "idUniversity",
    "universityFullName",
    "idUniversityCertificates",
    "universityCertificatesFilePasswordSendType",
    "universityCertificatesBeginDate",
    "universityCertificatesExpiredDate",
    "universityCertificatesDateLastChange",
    "number"
})
public class DUniversityRegistrations {

    @XmlElement(name = "Id_UniversityRegistration")
    protected int idUniversityRegistration;
    @XmlElement(name = "Id_UniversityRegistrationType")
    protected int idUniversityRegistrationType;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityRegistrationDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityRegistrationDateBegin;
    @XmlElement(name = "UniversityRegistrationDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityRegistrationDateEnd;
    @XmlElement(name = "UniversityRegistrationDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityRegistrationDateLastChange;
    @XmlElement(name = "UniversityRegistrationIsActive")
    protected int universityRegistrationIsActive;
    @XmlElement(name = "UniversityRegistrationusersCount")
    protected int universityRegistrationusersCount;
    @XmlElement(name = "UniversityRegistrationTypeName")
    protected String universityRegistrationTypeName;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Id_UniversityCertificates")
    protected int idUniversityCertificates;
    @XmlElement(name = "UniversityCertificatesFilePasswordSendType")
    protected int universityCertificatesFilePasswordSendType;
    @XmlElement(name = "UniversityCertificatesBeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityCertificatesBeginDate;
    @XmlElement(name = "UniversityCertificatesExpiredDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityCertificatesExpiredDate;
    @XmlElement(name = "UniversityCertificatesDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityCertificatesDateLastChange;
    @XmlElement(name = "Number")
    protected int number;

    /**
     * Gets the value of the idUniversityRegistration property.
     * 
     */
    public int getIdUniversityRegistration() {
        return idUniversityRegistration;
    }

    /**
     * Sets the value of the idUniversityRegistration property.
     * 
     */
    public void setIdUniversityRegistration(int value) {
        this.idUniversityRegistration = value;
    }

    /**
     * Gets the value of the idUniversityRegistrationType property.
     * 
     */
    public int getIdUniversityRegistrationType() {
        return idUniversityRegistrationType;
    }

    /**
     * Sets the value of the idUniversityRegistrationType property.
     * 
     */
    public void setIdUniversityRegistrationType(int value) {
        this.idUniversityRegistrationType = value;
    }

    /**
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the universityRegistrationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityRegistrationDateBegin() {
        return universityRegistrationDateBegin;
    }

    /**
     * Sets the value of the universityRegistrationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityRegistrationDateBegin(XMLGregorianCalendar value) {
        this.universityRegistrationDateBegin = value;
    }

    /**
     * Gets the value of the universityRegistrationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityRegistrationDateEnd() {
        return universityRegistrationDateEnd;
    }

    /**
     * Sets the value of the universityRegistrationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityRegistrationDateEnd(XMLGregorianCalendar value) {
        this.universityRegistrationDateEnd = value;
    }

    /**
     * Gets the value of the universityRegistrationDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityRegistrationDateLastChange() {
        return universityRegistrationDateLastChange;
    }

    /**
     * Sets the value of the universityRegistrationDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityRegistrationDateLastChange(XMLGregorianCalendar value) {
        this.universityRegistrationDateLastChange = value;
    }

    /**
     * Gets the value of the universityRegistrationIsActive property.
     * 
     */
    public int getUniversityRegistrationIsActive() {
        return universityRegistrationIsActive;
    }

    /**
     * Sets the value of the universityRegistrationIsActive property.
     * 
     */
    public void setUniversityRegistrationIsActive(int value) {
        this.universityRegistrationIsActive = value;
    }

    /**
     * Gets the value of the universityRegistrationusersCount property.
     * 
     */
    public int getUniversityRegistrationusersCount() {
        return universityRegistrationusersCount;
    }

    /**
     * Sets the value of the universityRegistrationusersCount property.
     * 
     */
    public void setUniversityRegistrationusersCount(int value) {
        this.universityRegistrationusersCount = value;
    }

    /**
     * Gets the value of the universityRegistrationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityRegistrationTypeName() {
        return universityRegistrationTypeName;
    }

    /**
     * Sets the value of the universityRegistrationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityRegistrationTypeName(String value) {
        this.universityRegistrationTypeName = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the idUniversityCertificates property.
     * 
     */
    public int getIdUniversityCertificates() {
        return idUniversityCertificates;
    }

    /**
     * Sets the value of the idUniversityCertificates property.
     * 
     */
    public void setIdUniversityCertificates(int value) {
        this.idUniversityCertificates = value;
    }

    /**
     * Gets the value of the universityCertificatesFilePasswordSendType property.
     * 
     */
    public int getUniversityCertificatesFilePasswordSendType() {
        return universityCertificatesFilePasswordSendType;
    }

    /**
     * Sets the value of the universityCertificatesFilePasswordSendType property.
     * 
     */
    public void setUniversityCertificatesFilePasswordSendType(int value) {
        this.universityCertificatesFilePasswordSendType = value;
    }

    /**
     * Gets the value of the universityCertificatesBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityCertificatesBeginDate() {
        return universityCertificatesBeginDate;
    }

    /**
     * Sets the value of the universityCertificatesBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityCertificatesBeginDate(XMLGregorianCalendar value) {
        this.universityCertificatesBeginDate = value;
    }

    /**
     * Gets the value of the universityCertificatesExpiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityCertificatesExpiredDate() {
        return universityCertificatesExpiredDate;
    }

    /**
     * Sets the value of the universityCertificatesExpiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityCertificatesExpiredDate(XMLGregorianCalendar value) {
        this.universityCertificatesExpiredDate = value;
    }

    /**
     * Gets the value of the universityCertificatesDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityCertificatesDateLastChange() {
        return universityCertificatesDateLastChange;
    }

    /**
     * Sets the value of the universityCertificatesDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityCertificatesDateLastChange(XMLGregorianCalendar value) {
        this.universityCertificatesDateLastChange = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

}
