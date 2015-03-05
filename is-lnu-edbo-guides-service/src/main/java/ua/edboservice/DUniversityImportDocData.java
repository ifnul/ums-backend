
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityImportDocData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityImportDocData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityImportDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityImportDocType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityImportDocTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UniversityImportDocData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ImportDocData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentNumberInOsvita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDataInOsvita" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKodeInOsvita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityNameInOsvita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kvalification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EducationDocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDocumentDateGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EducationDocumentDateExpired" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCorrected" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocument_EDBOPasport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastName_EDBO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName_EDBO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName_EDBO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday_EDBO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PasportType_EDBO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportDocumentSeries_EDBO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportDocumentNumbers_EDBO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportDocumentDateGet_EDBO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationNotBindType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationNotBindTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecComplexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EduExist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityImportDocData", propOrder = {
    "idUniversityImportDoc",
    "universityKode",
    "idUniversityImportDocType",
    "universityImportDocTypeName",
    "idPersonDocumentType",
    "personDocumentTypeName",
    "idUser",
    "dateLastChange",
    "idUniversityImportDocData",
    "idImportDocData",
    "idPersonDocument",
    "documentNumberInOsvita",
    "documentDataInOsvita",
    "universityKodeInOsvita",
    "universityNameInOsvita",
    "specialityKode",
    "specialityName",
    "kvalification",
    "profession",
    "lastName",
    "firstName",
    "middleName",
    "idPersonSex",
    "birthday",
    "inn",
    "pasportType",
    "pasportSeries",
    "pasportNumbers",
    "pasportDateGet",
    "educationDocumentSeries",
    "educationDocumentNumber",
    "educationDocumentDateGive",
    "educationDocumentDateExpired",
    "operation",
    "isCorrected",
    "idPerson",
    "idPersonDocumentEDBOPasport",
    "lastNameEDBO",
    "firstNameEDBO",
    "middleNameEDBO",
    "birthdayEDBO",
    "pasportTypeEDBO",
    "pasportDocumentSeriesEDBO",
    "pasportDocumentNumbersEDBO",
    "pasportDocumentDateGetEDBO",
    "idPersonEducation",
    "personEducationNotBindType",
    "personEducationNotBindTypeName",
    "personCodeU",
    "personEducationFormName",
    "qualificationName",
    "idCourse",
    "specComplexName",
    "eduExist",
    "universityFacultetFullName"
})
public class DUniversityImportDocData {

    @XmlElement(name = "Id_UniversityImportDoc")
    protected int idUniversityImportDoc;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_UniversityImportDocType")
    protected int idUniversityImportDocType;
    @XmlElement(name = "UniversityImportDocTypeName")
    protected String universityImportDocTypeName;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "PersonDocumentTypeName")
    protected String personDocumentTypeName;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_UniversityImportDocData")
    protected int idUniversityImportDocData;
    @XmlElement(name = "Id_ImportDocData")
    protected int idImportDocData;
    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "DocumentNumberInOsvita")
    protected String documentNumberInOsvita;
    @XmlElement(name = "DocumentDataInOsvita", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDataInOsvita;
    @XmlElement(name = "UniversityKodeInOsvita")
    protected String universityKodeInOsvita;
    @XmlElement(name = "UniversityNameInOsvita")
    protected String universityNameInOsvita;
    @XmlElement(name = "SpecialityKode")
    protected String specialityKode;
    @XmlElement(name = "SpecialityName")
    protected String specialityName;
    @XmlElement(name = "Kvalification")
    protected String kvalification;
    @XmlElement(name = "Profession")
    protected String profession;
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
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "PasportType")
    protected String pasportType;
    @XmlElement(name = "PasportSeries")
    protected String pasportSeries;
    @XmlElement(name = "PasportNumbers")
    protected String pasportNumbers;
    @XmlElement(name = "PasportDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pasportDateGet;
    @XmlElement(name = "EducationDocumentSeries")
    protected String educationDocumentSeries;
    @XmlElement(name = "EducationDocumentNumber")
    protected String educationDocumentNumber;
    @XmlElement(name = "EducationDocumentDateGive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDocumentDateGive;
    @XmlElement(name = "EducationDocumentDateExpired", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDocumentDateExpired;
    @XmlElement(name = "Operation")
    protected String operation;
    @XmlElement(name = "IsCorrected")
    protected int isCorrected;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Id_PersonDocument_EDBOPasport")
    protected int idPersonDocumentEDBOPasport;
    @XmlElement(name = "LastName_EDBO")
    protected String lastNameEDBO;
    @XmlElement(name = "FirstName_EDBO")
    protected String firstNameEDBO;
    @XmlElement(name = "MiddleName_EDBO")
    protected String middleNameEDBO;
    @XmlElement(name = "Birthday_EDBO", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdayEDBO;
    @XmlElement(name = "PasportType_EDBO")
    protected String pasportTypeEDBO;
    @XmlElement(name = "PasportDocumentSeries_EDBO")
    protected String pasportDocumentSeriesEDBO;
    @XmlElement(name = "PasportDocumentNumbers_EDBO")
    protected String pasportDocumentNumbersEDBO;
    @XmlElement(name = "PasportDocumentDateGet_EDBO", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pasportDocumentDateGetEDBO;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "PersonEducationNotBindType")
    protected int personEducationNotBindType;
    @XmlElement(name = "PersonEducationNotBindTypeName")
    protected String personEducationNotBindTypeName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "SpecComplexName")
    protected String specComplexName;
    @XmlElement(name = "EduExist")
    protected int eduExist;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;

    /**
     * Gets the value of the idUniversityImportDoc property.
     * 
     */
    public int getIdUniversityImportDoc() {
        return idUniversityImportDoc;
    }

    /**
     * Sets the value of the idUniversityImportDoc property.
     * 
     */
    public void setIdUniversityImportDoc(int value) {
        this.idUniversityImportDoc = value;
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
     * Gets the value of the idUniversityImportDocType property.
     * 
     */
    public int getIdUniversityImportDocType() {
        return idUniversityImportDocType;
    }

    /**
     * Sets the value of the idUniversityImportDocType property.
     * 
     */
    public void setIdUniversityImportDocType(int value) {
        this.idUniversityImportDocType = value;
    }

    /**
     * Gets the value of the universityImportDocTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityImportDocTypeName() {
        return universityImportDocTypeName;
    }

    /**
     * Sets the value of the universityImportDocTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityImportDocTypeName(String value) {
        this.universityImportDocTypeName = value;
    }

    /**
     * Gets the value of the idPersonDocumentType property.
     * 
     */
    public int getIdPersonDocumentType() {
        return idPersonDocumentType;
    }

    /**
     * Sets the value of the idPersonDocumentType property.
     * 
     */
    public void setIdPersonDocumentType(int value) {
        this.idPersonDocumentType = value;
    }

    /**
     * Gets the value of the personDocumentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentTypeName() {
        return personDocumentTypeName;
    }

    /**
     * Sets the value of the personDocumentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentTypeName(String value) {
        this.personDocumentTypeName = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

    /**
     * Gets the value of the idUniversityImportDocData property.
     * 
     */
    public int getIdUniversityImportDocData() {
        return idUniversityImportDocData;
    }

    /**
     * Sets the value of the idUniversityImportDocData property.
     * 
     */
    public void setIdUniversityImportDocData(int value) {
        this.idUniversityImportDocData = value;
    }

    /**
     * Gets the value of the idImportDocData property.
     * 
     */
    public int getIdImportDocData() {
        return idImportDocData;
    }

    /**
     * Sets the value of the idImportDocData property.
     * 
     */
    public void setIdImportDocData(int value) {
        this.idImportDocData = value;
    }

    /**
     * Gets the value of the idPersonDocument property.
     * 
     */
    public int getIdPersonDocument() {
        return idPersonDocument;
    }

    /**
     * Sets the value of the idPersonDocument property.
     * 
     */
    public void setIdPersonDocument(int value) {
        this.idPersonDocument = value;
    }

    /**
     * Gets the value of the documentNumberInOsvita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumberInOsvita() {
        return documentNumberInOsvita;
    }

    /**
     * Sets the value of the documentNumberInOsvita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumberInOsvita(String value) {
        this.documentNumberInOsvita = value;
    }

    /**
     * Gets the value of the documentDataInOsvita property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDataInOsvita() {
        return documentDataInOsvita;
    }

    /**
     * Sets the value of the documentDataInOsvita property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDataInOsvita(XMLGregorianCalendar value) {
        this.documentDataInOsvita = value;
    }

    /**
     * Gets the value of the universityKodeInOsvita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeInOsvita() {
        return universityKodeInOsvita;
    }

    /**
     * Sets the value of the universityKodeInOsvita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeInOsvita(String value) {
        this.universityKodeInOsvita = value;
    }

    /**
     * Gets the value of the universityNameInOsvita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityNameInOsvita() {
        return universityNameInOsvita;
    }

    /**
     * Sets the value of the universityNameInOsvita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityNameInOsvita(String value) {
        this.universityNameInOsvita = value;
    }

    /**
     * Gets the value of the specialityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityKode() {
        return specialityKode;
    }

    /**
     * Sets the value of the specialityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityKode(String value) {
        this.specialityKode = value;
    }

    /**
     * Gets the value of the specialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityName() {
        return specialityName;
    }

    /**
     * Sets the value of the specialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityName(String value) {
        this.specialityName = value;
    }

    /**
     * Gets the value of the kvalification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvalification() {
        return kvalification;
    }

    /**
     * Sets the value of the kvalification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvalification(String value) {
        this.kvalification = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfession(String value) {
        this.profession = value;
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
     * Gets the value of the pasportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportType() {
        return pasportType;
    }

    /**
     * Sets the value of the pasportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportType(String value) {
        this.pasportType = value;
    }

    /**
     * Gets the value of the pasportSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportSeries() {
        return pasportSeries;
    }

    /**
     * Sets the value of the pasportSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportSeries(String value) {
        this.pasportSeries = value;
    }

    /**
     * Gets the value of the pasportNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportNumbers() {
        return pasportNumbers;
    }

    /**
     * Sets the value of the pasportNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportNumbers(String value) {
        this.pasportNumbers = value;
    }

    /**
     * Gets the value of the pasportDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasportDateGet() {
        return pasportDateGet;
    }

    /**
     * Sets the value of the pasportDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasportDateGet(XMLGregorianCalendar value) {
        this.pasportDateGet = value;
    }

    /**
     * Gets the value of the educationDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDocumentSeries() {
        return educationDocumentSeries;
    }

    /**
     * Sets the value of the educationDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDocumentSeries(String value) {
        this.educationDocumentSeries = value;
    }

    /**
     * Gets the value of the educationDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDocumentNumber() {
        return educationDocumentNumber;
    }

    /**
     * Sets the value of the educationDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDocumentNumber(String value) {
        this.educationDocumentNumber = value;
    }

    /**
     * Gets the value of the educationDocumentDateGive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationDocumentDateGive() {
        return educationDocumentDateGive;
    }

    /**
     * Sets the value of the educationDocumentDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationDocumentDateGive(XMLGregorianCalendar value) {
        this.educationDocumentDateGive = value;
    }

    /**
     * Gets the value of the educationDocumentDateExpired property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationDocumentDateExpired() {
        return educationDocumentDateExpired;
    }

    /**
     * Sets the value of the educationDocumentDateExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationDocumentDateExpired(XMLGregorianCalendar value) {
        this.educationDocumentDateExpired = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the isCorrected property.
     * 
     */
    public int getIsCorrected() {
        return isCorrected;
    }

    /**
     * Sets the value of the isCorrected property.
     * 
     */
    public void setIsCorrected(int value) {
        this.isCorrected = value;
    }

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the idPersonDocumentEDBOPasport property.
     * 
     */
    public int getIdPersonDocumentEDBOPasport() {
        return idPersonDocumentEDBOPasport;
    }

    /**
     * Sets the value of the idPersonDocumentEDBOPasport property.
     * 
     */
    public void setIdPersonDocumentEDBOPasport(int value) {
        this.idPersonDocumentEDBOPasport = value;
    }

    /**
     * Gets the value of the lastNameEDBO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameEDBO() {
        return lastNameEDBO;
    }

    /**
     * Sets the value of the lastNameEDBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameEDBO(String value) {
        this.lastNameEDBO = value;
    }

    /**
     * Gets the value of the firstNameEDBO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameEDBO() {
        return firstNameEDBO;
    }

    /**
     * Sets the value of the firstNameEDBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameEDBO(String value) {
        this.firstNameEDBO = value;
    }

    /**
     * Gets the value of the middleNameEDBO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleNameEDBO() {
        return middleNameEDBO;
    }

    /**
     * Sets the value of the middleNameEDBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleNameEDBO(String value) {
        this.middleNameEDBO = value;
    }

    /**
     * Gets the value of the birthdayEDBO property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdayEDBO() {
        return birthdayEDBO;
    }

    /**
     * Sets the value of the birthdayEDBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdayEDBO(XMLGregorianCalendar value) {
        this.birthdayEDBO = value;
    }

    /**
     * Gets the value of the pasportTypeEDBO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportTypeEDBO() {
        return pasportTypeEDBO;
    }

    /**
     * Sets the value of the pasportTypeEDBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportTypeEDBO(String value) {
        this.pasportTypeEDBO = value;
    }

    /**
     * Gets the value of the pasportDocumentSeriesEDBO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportDocumentSeriesEDBO() {
        return pasportDocumentSeriesEDBO;
    }

    /**
     * Sets the value of the pasportDocumentSeriesEDBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportDocumentSeriesEDBO(String value) {
        this.pasportDocumentSeriesEDBO = value;
    }

    /**
     * Gets the value of the pasportDocumentNumbersEDBO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportDocumentNumbersEDBO() {
        return pasportDocumentNumbersEDBO;
    }

    /**
     * Sets the value of the pasportDocumentNumbersEDBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportDocumentNumbersEDBO(String value) {
        this.pasportDocumentNumbersEDBO = value;
    }

    /**
     * Gets the value of the pasportDocumentDateGetEDBO property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasportDocumentDateGetEDBO() {
        return pasportDocumentDateGetEDBO;
    }

    /**
     * Sets the value of the pasportDocumentDateGetEDBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasportDocumentDateGetEDBO(XMLGregorianCalendar value) {
        this.pasportDocumentDateGetEDBO = value;
    }

    /**
     * Gets the value of the idPersonEducation property.
     * 
     */
    public int getIdPersonEducation() {
        return idPersonEducation;
    }

    /**
     * Sets the value of the idPersonEducation property.
     * 
     */
    public void setIdPersonEducation(int value) {
        this.idPersonEducation = value;
    }

    /**
     * Gets the value of the personEducationNotBindType property.
     * 
     */
    public int getPersonEducationNotBindType() {
        return personEducationNotBindType;
    }

    /**
     * Sets the value of the personEducationNotBindType property.
     * 
     */
    public void setPersonEducationNotBindType(int value) {
        this.personEducationNotBindType = value;
    }

    /**
     * Gets the value of the personEducationNotBindTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationNotBindTypeName() {
        return personEducationNotBindTypeName;
    }

    /**
     * Sets the value of the personEducationNotBindTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationNotBindTypeName(String value) {
        this.personEducationNotBindTypeName = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the personEducationFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationFormName() {
        return personEducationFormName;
    }

    /**
     * Sets the value of the personEducationFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationFormName(String value) {
        this.personEducationFormName = value;
    }

    /**
     * Gets the value of the qualificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationName() {
        return qualificationName;
    }

    /**
     * Sets the value of the qualificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationName(String value) {
        this.qualificationName = value;
    }

    /**
     * Gets the value of the idCourse property.
     * 
     */
    public int getIdCourse() {
        return idCourse;
    }

    /**
     * Sets the value of the idCourse property.
     * 
     */
    public void setIdCourse(int value) {
        this.idCourse = value;
    }

    /**
     * Gets the value of the specComplexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecComplexName() {
        return specComplexName;
    }

    /**
     * Sets the value of the specComplexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecComplexName(String value) {
        this.specComplexName = value;
    }

    /**
     * Gets the value of the eduExist property.
     * 
     */
    public int getEduExist() {
        return eduExist;
    }

    /**
     * Sets the value of the eduExist property.
     * 
     */
    public void setEduExist(int value) {
        this.eduExist = value;
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

}
