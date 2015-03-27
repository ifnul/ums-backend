
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrderOfDocumentsSendPackageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrderOfDocumentsSendPackageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrderOfDocumentsSendPackageData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentsSendPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentsSendPackageDataStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_FinanceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistBenefits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EducationEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PhotoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentDataGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderOfDocumentDataExpires" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Graduated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddrPostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddrKOATUUKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumentsSendPackageDataStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataChanged" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrderOfDocumentsSendPackageData", propOrder = {
    "idOrderOfDocumentsSendPackageData",
    "idOrderOfDocumentsSendPackage",
    "idOrderOfDocumentsSendPackageDataStatusType",
    "lastName",
    "firstName",
    "middleName",
    "lastNameEn",
    "firstNameEn",
    "middleNameEn",
    "idPersonSex",
    "birthday",
    "personDocumentType",
    "documentSeries",
    "documentNumbers",
    "idFinanceType",
    "inn",
    "existBenefits",
    "educationBegin",
    "educationEnd",
    "photoName",
    "personEducationForm",
    "orderOfDocumentDataGive",
    "orderOfDocumentDataExpires",
    "universityFacultetFullName",
    "universityGroupFullName",
    "universityGroupShortName",
    "specClasifierCode",
    "specSpecialityName",
    "specScecializationName",
    "graduated",
    "documentDateGet",
    "documentIssued",
    "idCountry",
    "idState",
    "addressRegion",
    "addressStreet",
    "addressBuilding",
    "addressDistrict",
    "addressFlat",
    "addrPostIndex",
    "addrKOATUUKode",
    "statusTypeDescription",
    "orderOfDocumentsSendPackageDataStatusTypeName",
    "dataChanged"
})
public class DOrderOfDocumentsSendPackageData {

    @XmlElement(name = "Id_OrderOfDocumentsSendPackageData")
    protected int idOrderOfDocumentsSendPackageData;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackage")
    protected int idOrderOfDocumentsSendPackage;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackageDataStatusType")
    protected int idOrderOfDocumentsSendPackageDataStatusType;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastNameEn")
    protected String lastNameEn;
    @XmlElement(name = "FirstNameEn")
    protected String firstNameEn;
    @XmlElement(name = "MiddleNameEn")
    protected String middleNameEn;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "PersonDocumentType")
    protected int personDocumentType;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumbers")
    protected String documentNumbers;
    @XmlElement(name = "Id_FinanceType")
    protected int idFinanceType;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "ExistBenefits")
    protected int existBenefits;
    @XmlElement(name = "EducationBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationBegin;
    @XmlElement(name = "EducationEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationEnd;
    @XmlElement(name = "PhotoName")
    protected String photoName;
    @XmlElement(name = "PersonEducationForm")
    protected int personEducationForm;
    @XmlElement(name = "OrderOfDocumentDataGive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfDocumentDataGive;
    @XmlElement(name = "OrderOfDocumentDataExpires", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfDocumentDataExpires;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityGroupFullName")
    protected String universityGroupFullName;
    @XmlElement(name = "UniversityGroupShortName")
    protected String universityGroupShortName;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;
    @XmlElement(name = "Graduated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar graduated;
    @XmlElement(name = "DocumentDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGet;
    @XmlElement(name = "DocumentIssued")
    protected String documentIssued;
    @XmlElement(name = "IdCountry")
    protected int idCountry;
    @XmlElement(name = "IdState")
    protected int idState;
    @XmlElement(name = "AddressRegion")
    protected String addressRegion;
    @XmlElement(name = "AddressStreet")
    protected String addressStreet;
    @XmlElement(name = "AddressBuilding")
    protected String addressBuilding;
    @XmlElement(name = "AddressDistrict")
    protected String addressDistrict;
    @XmlElement(name = "AddressFlat")
    protected String addressFlat;
    @XmlElement(name = "AddrPostIndex")
    protected String addrPostIndex;
    @XmlElement(name = "AddrKOATUUKode")
    protected String addrKOATUUKode;
    @XmlElement(name = "StatusTypeDescription")
    protected String statusTypeDescription;
    @XmlElement(name = "OrderOfDocumentsSendPackageDataStatusTypeName")
    protected String orderOfDocumentsSendPackageDataStatusTypeName;
    @XmlElement(name = "DataChanged")
    protected int dataChanged;

    /**
     * Gets the value of the idOrderOfDocumentsSendPackageData property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackageData() {
        return idOrderOfDocumentsSendPackageData;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackageData property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackageData(int value) {
        this.idOrderOfDocumentsSendPackageData = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentsSendPackage property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackage() {
        return idOrderOfDocumentsSendPackage;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackage property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackage(int value) {
        this.idOrderOfDocumentsSendPackage = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentsSendPackageDataStatusType property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackageDataStatusType() {
        return idOrderOfDocumentsSendPackageDataStatusType;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackageDataStatusType property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackageDataStatusType(int value) {
        this.idOrderOfDocumentsSendPackageDataStatusType = value;
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
     * Gets the value of the lastNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameEn() {
        return lastNameEn;
    }

    /**
     * Sets the value of the lastNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameEn(String value) {
        this.lastNameEn = value;
    }

    /**
     * Gets the value of the firstNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameEn() {
        return firstNameEn;
    }

    /**
     * Sets the value of the firstNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameEn(String value) {
        this.firstNameEn = value;
    }

    /**
     * Gets the value of the middleNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleNameEn() {
        return middleNameEn;
    }

    /**
     * Sets the value of the middleNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleNameEn(String value) {
        this.middleNameEn = value;
    }

    /**
     * Gets the value of the idPersonSex property.
     * 
     */
    public int getIdPersonSex() {
        return idPersonSex;
    }

    /**
     * Sets the value of the idPersonSex property.
     * 
     */
    public void setIdPersonSex(int value) {
        this.idPersonSex = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the personDocumentType property.
     * 
     */
    public int getPersonDocumentType() {
        return personDocumentType;
    }

    /**
     * Sets the value of the personDocumentType property.
     * 
     */
    public void setPersonDocumentType(int value) {
        this.personDocumentType = value;
    }

    /**
     * Gets the value of the documentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSeries() {
        return documentSeries;
    }

    /**
     * Sets the value of the documentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSeries(String value) {
        this.documentSeries = value;
    }

    /**
     * Gets the value of the documentNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumbers() {
        return documentNumbers;
    }

    /**
     * Sets the value of the documentNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumbers(String value) {
        this.documentNumbers = value;
    }

    /**
     * Gets the value of the idFinanceType property.
     * 
     */
    public int getIdFinanceType() {
        return idFinanceType;
    }

    /**
     * Sets the value of the idFinanceType property.
     * 
     */
    public void setIdFinanceType(int value) {
        this.idFinanceType = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the existBenefits property.
     * 
     */
    public int getExistBenefits() {
        return existBenefits;
    }

    /**
     * Sets the value of the existBenefits property.
     * 
     */
    public void setExistBenefits(int value) {
        this.existBenefits = value;
    }

    /**
     * Gets the value of the educationBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationBegin() {
        return educationBegin;
    }

    /**
     * Sets the value of the educationBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationBegin(XMLGregorianCalendar value) {
        this.educationBegin = value;
    }

    /**
     * Gets the value of the educationEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationEnd() {
        return educationEnd;
    }

    /**
     * Sets the value of the educationEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationEnd(XMLGregorianCalendar value) {
        this.educationEnd = value;
    }

    /**
     * Gets the value of the photoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoName() {
        return photoName;
    }

    /**
     * Sets the value of the photoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoName(String value) {
        this.photoName = value;
    }

    /**
     * Gets the value of the personEducationForm property.
     * 
     */
    public int getPersonEducationForm() {
        return personEducationForm;
    }

    /**
     * Sets the value of the personEducationForm property.
     * 
     */
    public void setPersonEducationForm(int value) {
        this.personEducationForm = value;
    }

    /**
     * Gets the value of the orderOfDocumentDataGive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfDocumentDataGive() {
        return orderOfDocumentDataGive;
    }

    /**
     * Sets the value of the orderOfDocumentDataGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfDocumentDataGive(XMLGregorianCalendar value) {
        this.orderOfDocumentDataGive = value;
    }

    /**
     * Gets the value of the orderOfDocumentDataExpires property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfDocumentDataExpires() {
        return orderOfDocumentDataExpires;
    }

    /**
     * Sets the value of the orderOfDocumentDataExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfDocumentDataExpires(XMLGregorianCalendar value) {
        this.orderOfDocumentDataExpires = value;
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
     * Gets the value of the universityGroupFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupFullName() {
        return universityGroupFullName;
    }

    /**
     * Sets the value of the universityGroupFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupFullName(String value) {
        this.universityGroupFullName = value;
    }

    /**
     * Gets the value of the universityGroupShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupShortName() {
        return universityGroupShortName;
    }

    /**
     * Sets the value of the universityGroupShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupShortName(String value) {
        this.universityGroupShortName = value;
    }

    /**
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the specScecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationName() {
        return specScecializationName;
    }

    /**
     * Sets the value of the specScecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationName(String value) {
        this.specScecializationName = value;
    }

    /**
     * Gets the value of the graduated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraduated() {
        return graduated;
    }

    /**
     * Sets the value of the graduated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraduated(XMLGregorianCalendar value) {
        this.graduated = value;
    }

    /**
     * Gets the value of the documentDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDateGet() {
        return documentDateGet;
    }

    /**
     * Sets the value of the documentDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDateGet(XMLGregorianCalendar value) {
        this.documentDateGet = value;
    }

    /**
     * Gets the value of the documentIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssued() {
        return documentIssued;
    }

    /**
     * Sets the value of the documentIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssued(String value) {
        this.documentIssued = value;
    }

    /**
     * Gets the value of the idCountry property.
     * 
     */
    public int getIdCountry() {
        return idCountry;
    }

    /**
     * Sets the value of the idCountry property.
     * 
     */
    public void setIdCountry(int value) {
        this.idCountry = value;
    }

    /**
     * Gets the value of the idState property.
     * 
     */
    public int getIdState() {
        return idState;
    }

    /**
     * Sets the value of the idState property.
     * 
     */
    public void setIdState(int value) {
        this.idState = value;
    }

    /**
     * Gets the value of the addressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRegion() {
        return addressRegion;
    }

    /**
     * Sets the value of the addressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRegion(String value) {
        this.addressRegion = value;
    }

    /**
     * Gets the value of the addressStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * Sets the value of the addressStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreet(String value) {
        this.addressStreet = value;
    }

    /**
     * Gets the value of the addressBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressBuilding() {
        return addressBuilding;
    }

    /**
     * Sets the value of the addressBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressBuilding(String value) {
        this.addressBuilding = value;
    }

    /**
     * Gets the value of the addressDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDistrict() {
        return addressDistrict;
    }

    /**
     * Sets the value of the addressDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDistrict(String value) {
        this.addressDistrict = value;
    }

    /**
     * Gets the value of the addressFlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFlat() {
        return addressFlat;
    }

    /**
     * Sets the value of the addressFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFlat(String value) {
        this.addressFlat = value;
    }

    /**
     * Gets the value of the addrPostIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrPostIndex() {
        return addrPostIndex;
    }

    /**
     * Sets the value of the addrPostIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrPostIndex(String value) {
        this.addrPostIndex = value;
    }

    /**
     * Gets the value of the addrKOATUUKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrKOATUUKode() {
        return addrKOATUUKode;
    }

    /**
     * Sets the value of the addrKOATUUKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrKOATUUKode(String value) {
        this.addrKOATUUKode = value;
    }

    /**
     * Gets the value of the statusTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusTypeDescription() {
        return statusTypeDescription;
    }

    /**
     * Sets the value of the statusTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusTypeDescription(String value) {
        this.statusTypeDescription = value;
    }

    /**
     * Gets the value of the orderOfDocumentsSendPackageDataStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentsSendPackageDataStatusTypeName() {
        return orderOfDocumentsSendPackageDataStatusTypeName;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackageDataStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentsSendPackageDataStatusTypeName(String value) {
        this.orderOfDocumentsSendPackageDataStatusTypeName = value;
    }

    /**
     * Gets the value of the dataChanged property.
     * 
     */
    public int getDataChanged() {
        return dataChanged;
    }

    /**
     * Sets the value of the dataChanged property.
     * 
     */
    public void setDataChanged(int value) {
        this.dataChanged = value;
    }

}
