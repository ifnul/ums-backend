
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrderOfDocumentsDatasExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrderOfDocumentsDatasExport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Descr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentDataGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderOfDocumentDataExpires" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Graduated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrderOfDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonPhotoBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Houce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rayon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Korpus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrDocType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntrDocSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumenDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentsPaymentSystemTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsForeinghEntrantDocumet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentDataDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionClasifierCodeXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCodeXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionNameXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityNameXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionNameEnXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityNameEnXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrderOfDocumentsDatasExport", propOrder = {
    "lastName",
    "firstName",
    "middleName",
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
    "descr1",
    "descr2",
    "descr3",
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
    "city",
    "adress",
    "homeNumber",
    "idOrderOfDocument",
    "idOrderOfDocumentGroup",
    "idUniversity",
    "personPhotoBase64String",
    "houce",
    "rayon",
    "korpus",
    "entrDocType",
    "entrDocSeries",
    "entrDocNumber",
    "lastNameEn",
    "firstNameEn",
    "middleNameEn",
    "orderOfDocumenDescription",
    "bankName",
    "documentsPaymentSystemTypeName",
    "isForeinghEntrantDocumet",
    "orderOfDocumentDataDescription",
    "specSpecialityNameEn",
    "district",
    "idQualificationGroup",
    "specDirectionClasifierCodeXML",
    "specSpecialityClasifierCodeXML",
    "specDirectionNameXML",
    "specSpecialityNameXML",
    "specDirectionNameEnXML",
    "specSpecialityNameEnXML",
    "universityFacultetFullNameEn",
    "specScecializationNameEn"
})
public class DOrderOfDocumentsDatasExport {

    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
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
    @XmlElement(name = "Descr1")
    protected String descr1;
    @XmlElement(name = "Descr2")
    protected String descr2;
    @XmlElement(name = "Descr3")
    protected String descr3;
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
    @XmlElement(name = "Graduated")
    protected String graduated;
    @XmlElement(name = "DocumentDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGet;
    @XmlElement(name = "DocumentIssued")
    protected String documentIssued;
    @XmlElement(name = "IdCountry")
    protected int idCountry;
    @XmlElement(name = "IdState")
    protected String idState;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Adress")
    protected String adress;
    @XmlElement(name = "HomeNumber")
    protected String homeNumber;
    @XmlElement(name = "Id_OrderOfDocument")
    protected int idOrderOfDocument;
    @XmlElement(name = "Id_OrderOfDocumentGroup")
    protected int idOrderOfDocumentGroup;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "PersonPhotoBase64String")
    protected String personPhotoBase64String;
    @XmlElement(name = "Houce")
    protected String houce;
    @XmlElement(name = "Rayon")
    protected String rayon;
    @XmlElement(name = "Korpus")
    protected String korpus;
    @XmlElement(name = "EntrDocType")
    protected int entrDocType;
    @XmlElement(name = "EntrDocSeries")
    protected String entrDocSeries;
    @XmlElement(name = "EntrDocNumber")
    protected String entrDocNumber;
    @XmlElement(name = "LastNameEn")
    protected String lastNameEn;
    @XmlElement(name = "FirstNameEn")
    protected String firstNameEn;
    @XmlElement(name = "MiddleNameEn")
    protected String middleNameEn;
    @XmlElement(name = "OrderOfDocumenDescription")
    protected String orderOfDocumenDescription;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "DocumentsPaymentSystemTypeName")
    protected String documentsPaymentSystemTypeName;
    @XmlElement(name = "IsForeinghEntrantDocumet")
    protected int isForeinghEntrantDocumet;
    @XmlElement(name = "OrderOfDocumentDataDescription")
    protected String orderOfDocumentDataDescription;
    @XmlElement(name = "SpecSpecialityNameEn")
    protected String specSpecialityNameEn;
    @XmlElement(name = "District")
    protected String district;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "SpecDirectionClasifierCodeXML")
    protected String specDirectionClasifierCodeXML;
    @XmlElement(name = "SpecSpecialityClasifierCodeXML")
    protected String specSpecialityClasifierCodeXML;
    @XmlElement(name = "SpecDirectionNameXML")
    protected String specDirectionNameXML;
    @XmlElement(name = "SpecSpecialityNameXML")
    protected String specSpecialityNameXML;
    @XmlElement(name = "SpecDirectionNameEnXML")
    protected String specDirectionNameEnXML;
    @XmlElement(name = "SpecSpecialityNameEnXML")
    protected String specSpecialityNameEnXML;
    @XmlElement(name = "UniversityFacultetFullNameEn")
    protected String universityFacultetFullNameEn;
    @XmlElement(name = "SpecScecializationNameEn")
    protected String specScecializationNameEn;

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
     * Gets the value of the descr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescr1() {
        return descr1;
    }

    /**
     * Sets the value of the descr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescr1(String value) {
        this.descr1 = value;
    }

    /**
     * Gets the value of the descr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescr2() {
        return descr2;
    }

    /**
     * Sets the value of the descr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescr2(String value) {
        this.descr2 = value;
    }

    /**
     * Gets the value of the descr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescr3() {
        return descr3;
    }

    /**
     * Sets the value of the descr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescr3(String value) {
        this.descr3 = value;
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
     *     {@link String }
     *     
     */
    public String getGraduated() {
        return graduated;
    }

    /**
     * Sets the value of the graduated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduated(String value) {
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdState() {
        return idState;
    }

    /**
     * Sets the value of the idState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdState(String value) {
        this.idState = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the adress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the value of the adress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdress(String value) {
        this.adress = value;
    }

    /**
     * Gets the value of the homeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeNumber() {
        return homeNumber;
    }

    /**
     * Sets the value of the homeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeNumber(String value) {
        this.homeNumber = value;
    }

    /**
     * Gets the value of the idOrderOfDocument property.
     * 
     */
    public int getIdOrderOfDocument() {
        return idOrderOfDocument;
    }

    /**
     * Sets the value of the idOrderOfDocument property.
     * 
     */
    public void setIdOrderOfDocument(int value) {
        this.idOrderOfDocument = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentGroup property.
     * 
     */
    public int getIdOrderOfDocumentGroup() {
        return idOrderOfDocumentGroup;
    }

    /**
     * Sets the value of the idOrderOfDocumentGroup property.
     * 
     */
    public void setIdOrderOfDocumentGroup(int value) {
        this.idOrderOfDocumentGroup = value;
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
     * Gets the value of the personPhotoBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonPhotoBase64String() {
        return personPhotoBase64String;
    }

    /**
     * Sets the value of the personPhotoBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonPhotoBase64String(String value) {
        this.personPhotoBase64String = value;
    }

    /**
     * Gets the value of the houce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouce() {
        return houce;
    }

    /**
     * Sets the value of the houce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouce(String value) {
        this.houce = value;
    }

    /**
     * Gets the value of the rayon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRayon() {
        return rayon;
    }

    /**
     * Sets the value of the rayon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRayon(String value) {
        this.rayon = value;
    }

    /**
     * Gets the value of the korpus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKorpus() {
        return korpus;
    }

    /**
     * Sets the value of the korpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKorpus(String value) {
        this.korpus = value;
    }

    /**
     * Gets the value of the entrDocType property.
     * 
     */
    public int getEntrDocType() {
        return entrDocType;
    }

    /**
     * Sets the value of the entrDocType property.
     * 
     */
    public void setEntrDocType(int value) {
        this.entrDocType = value;
    }

    /**
     * Gets the value of the entrDocSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrDocSeries() {
        return entrDocSeries;
    }

    /**
     * Sets the value of the entrDocSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrDocSeries(String value) {
        this.entrDocSeries = value;
    }

    /**
     * Gets the value of the entrDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrDocNumber() {
        return entrDocNumber;
    }

    /**
     * Sets the value of the entrDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrDocNumber(String value) {
        this.entrDocNumber = value;
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
     * Gets the value of the orderOfDocumenDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumenDescription() {
        return orderOfDocumenDescription;
    }

    /**
     * Sets the value of the orderOfDocumenDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumenDescription(String value) {
        this.orderOfDocumenDescription = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the documentsPaymentSystemTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsPaymentSystemTypeName() {
        return documentsPaymentSystemTypeName;
    }

    /**
     * Sets the value of the documentsPaymentSystemTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsPaymentSystemTypeName(String value) {
        this.documentsPaymentSystemTypeName = value;
    }

    /**
     * Gets the value of the isForeinghEntrantDocumet property.
     * 
     */
    public int getIsForeinghEntrantDocumet() {
        return isForeinghEntrantDocumet;
    }

    /**
     * Sets the value of the isForeinghEntrantDocumet property.
     * 
     */
    public void setIsForeinghEntrantDocumet(int value) {
        this.isForeinghEntrantDocumet = value;
    }

    /**
     * Gets the value of the orderOfDocumentDataDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentDataDescription() {
        return orderOfDocumentDataDescription;
    }

    /**
     * Sets the value of the orderOfDocumentDataDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentDataDescription(String value) {
        this.orderOfDocumentDataDescription = value;
    }

    /**
     * Gets the value of the specSpecialityNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityNameEn() {
        return specSpecialityNameEn;
    }

    /**
     * Sets the value of the specSpecialityNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityNameEn(String value) {
        this.specSpecialityNameEn = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

    /**
     * Gets the value of the specDirectionClasifierCodeXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionClasifierCodeXML() {
        return specDirectionClasifierCodeXML;
    }

    /**
     * Sets the value of the specDirectionClasifierCodeXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionClasifierCodeXML(String value) {
        this.specDirectionClasifierCodeXML = value;
    }

    /**
     * Gets the value of the specSpecialityClasifierCodeXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCodeXML() {
        return specSpecialityClasifierCodeXML;
    }

    /**
     * Sets the value of the specSpecialityClasifierCodeXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCodeXML(String value) {
        this.specSpecialityClasifierCodeXML = value;
    }

    /**
     * Gets the value of the specDirectionNameXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionNameXML() {
        return specDirectionNameXML;
    }

    /**
     * Sets the value of the specDirectionNameXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionNameXML(String value) {
        this.specDirectionNameXML = value;
    }

    /**
     * Gets the value of the specSpecialityNameXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityNameXML() {
        return specSpecialityNameXML;
    }

    /**
     * Sets the value of the specSpecialityNameXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityNameXML(String value) {
        this.specSpecialityNameXML = value;
    }

    /**
     * Gets the value of the specDirectionNameEnXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionNameEnXML() {
        return specDirectionNameEnXML;
    }

    /**
     * Sets the value of the specDirectionNameEnXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionNameEnXML(String value) {
        this.specDirectionNameEnXML = value;
    }

    /**
     * Gets the value of the specSpecialityNameEnXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityNameEnXML() {
        return specSpecialityNameEnXML;
    }

    /**
     * Sets the value of the specSpecialityNameEnXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityNameEnXML(String value) {
        this.specSpecialityNameEnXML = value;
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
     * Gets the value of the specScecializationNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationNameEn() {
        return specScecializationNameEn;
    }

    /**
     * Sets the value of the specScecializationNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationNameEn(String value) {
        this.specScecializationNameEn = value;
    }

}
