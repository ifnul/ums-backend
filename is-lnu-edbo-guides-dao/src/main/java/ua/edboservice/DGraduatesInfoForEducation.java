
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dGraduatesInfoForEducation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGraduatesInfoForEducation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonSexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Documents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disciplines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resident" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentsAwardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Prev_Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Prev_Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Prev_DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prev_DocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecSpeciality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Graduate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GraduatesData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Speciality_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qalification_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qalification_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentDateGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dGraduatesInfoForEducation", propOrder = {
    "lastName",
    "lastNameEn",
    "firstName",
    "firstNameEn",
    "middleName",
    "middleNameEn",
    "idPersonSex",
    "personSexName",
    "birthday",
    "documents",
    "disciplines",
    "idPersonDocumentType",
    "deliveryDocumentNumber",
    "deliveryDocumentSeries",
    "resident",
    "idPersonDocumentsAwardType",
    "prevIdPersonDocument",
    "prevIdPersonDocumentType",
    "prevDocumentSeries",
    "prevDocumentNumbers",
    "idQualification",
    "qualificationName",
    "specCode",
    "idSpecSpeciality",
    "specSpecialityCode",
    "specSpecialityName",
    "idGraduate",
    "idGraduatesData",
    "payment",
    "specialityPrevUK",
    "specialityPrevEN",
    "qalificationPrevUK",
    "qalificationPrevEN",
    "educationDateBegin",
    "educationDateEnd",
    "documentDateGive",
    "personEducationFormName",
    "universityFacultetFullName"
})
public class DGraduatesInfoForEducation {

    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "LastNameEn")
    protected String lastNameEn;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "FirstNameEn")
    protected String firstNameEn;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "MiddleNameEn")
    protected String middleNameEn;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "PersonSexName")
    protected String personSexName;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "Documents")
    protected String documents;
    @XmlElement(name = "Disciplines")
    protected String disciplines;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "DeliveryDocumentNumber")
    protected String deliveryDocumentNumber;
    @XmlElement(name = "DeliveryDocumentSeries")
    protected String deliveryDocumentSeries;
    @XmlElement(name = "Resident")
    protected int resident;
    @XmlElement(name = "Id_PersonDocumentsAwardType")
    protected int idPersonDocumentsAwardType;
    @XmlElement(name = "Prev_Id_PersonDocument")
    protected int prevIdPersonDocument;
    @XmlElement(name = "Prev_Id_PersonDocumentType")
    protected int prevIdPersonDocumentType;
    @XmlElement(name = "Prev_DocumentSeries")
    protected String prevDocumentSeries;
    @XmlElement(name = "Prev_DocumentNumbers")
    protected String prevDocumentNumbers;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "Id_SpecSpeciality")
    protected int idSpecSpeciality;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "Id_Graduate")
    protected int idGraduate;
    @XmlElement(name = "Id_GraduatesData")
    protected int idGraduatesData;
    @XmlElement(name = "Payment")
    protected int payment;
    @XmlElement(name = "Speciality_Prev_UK")
    protected String specialityPrevUK;
    @XmlElement(name = "Speciality_Prev_EN")
    protected String specialityPrevEN;
    @XmlElement(name = "Qalification_Prev_UK")
    protected String qalificationPrevUK;
    @XmlElement(name = "Qalification_Prev_EN")
    protected String qalificationPrevEN;
    @XmlElement(name = "EducationDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDateBegin;
    @XmlElement(name = "EducationDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDateEnd;
    @XmlElement(name = "DocumentDateGive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGive;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;

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
     * Gets the value of the personSexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSexName() {
        return personSexName;
    }

    /**
     * Sets the value of the personSexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSexName(String value) {
        this.personSexName = value;
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
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocuments(String value) {
        this.documents = value;
    }

    /**
     * Gets the value of the disciplines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplines() {
        return disciplines;
    }

    /**
     * Sets the value of the disciplines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplines(String value) {
        this.disciplines = value;
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
     * Gets the value of the deliveryDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDocumentNumber() {
        return deliveryDocumentNumber;
    }

    /**
     * Sets the value of the deliveryDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDocumentNumber(String value) {
        this.deliveryDocumentNumber = value;
    }

    /**
     * Gets the value of the deliveryDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDocumentSeries() {
        return deliveryDocumentSeries;
    }

    /**
     * Sets the value of the deliveryDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDocumentSeries(String value) {
        this.deliveryDocumentSeries = value;
    }

    /**
     * Gets the value of the resident property.
     * 
     */
    public int getResident() {
        return resident;
    }

    /**
     * Sets the value of the resident property.
     * 
     */
    public void setResident(int value) {
        this.resident = value;
    }

    /**
     * Gets the value of the idPersonDocumentsAwardType property.
     * 
     */
    public int getIdPersonDocumentsAwardType() {
        return idPersonDocumentsAwardType;
    }

    /**
     * Sets the value of the idPersonDocumentsAwardType property.
     * 
     */
    public void setIdPersonDocumentsAwardType(int value) {
        this.idPersonDocumentsAwardType = value;
    }

    /**
     * Gets the value of the prevIdPersonDocument property.
     * 
     */
    public int getPrevIdPersonDocument() {
        return prevIdPersonDocument;
    }

    /**
     * Sets the value of the prevIdPersonDocument property.
     * 
     */
    public void setPrevIdPersonDocument(int value) {
        this.prevIdPersonDocument = value;
    }

    /**
     * Gets the value of the prevIdPersonDocumentType property.
     * 
     */
    public int getPrevIdPersonDocumentType() {
        return prevIdPersonDocumentType;
    }

    /**
     * Sets the value of the prevIdPersonDocumentType property.
     * 
     */
    public void setPrevIdPersonDocumentType(int value) {
        this.prevIdPersonDocumentType = value;
    }

    /**
     * Gets the value of the prevDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevDocumentSeries() {
        return prevDocumentSeries;
    }

    /**
     * Sets the value of the prevDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevDocumentSeries(String value) {
        this.prevDocumentSeries = value;
    }

    /**
     * Gets the value of the prevDocumentNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevDocumentNumbers() {
        return prevDocumentNumbers;
    }

    /**
     * Sets the value of the prevDocumentNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevDocumentNumbers(String value) {
        this.prevDocumentNumbers = value;
    }

    /**
     * Gets the value of the idQualification property.
     * 
     */
    public int getIdQualification() {
        return idQualification;
    }

    /**
     * Sets the value of the idQualification property.
     * 
     */
    public void setIdQualification(int value) {
        this.idQualification = value;
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
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the idSpecSpeciality property.
     * 
     */
    public int getIdSpecSpeciality() {
        return idSpecSpeciality;
    }

    /**
     * Sets the value of the idSpecSpeciality property.
     * 
     */
    public void setIdSpecSpeciality(int value) {
        this.idSpecSpeciality = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
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
     * Gets the value of the idGraduate property.
     * 
     */
    public int getIdGraduate() {
        return idGraduate;
    }

    /**
     * Sets the value of the idGraduate property.
     * 
     */
    public void setIdGraduate(int value) {
        this.idGraduate = value;
    }

    /**
     * Gets the value of the idGraduatesData property.
     * 
     */
    public int getIdGraduatesData() {
        return idGraduatesData;
    }

    /**
     * Sets the value of the idGraduatesData property.
     * 
     */
    public void setIdGraduatesData(int value) {
        this.idGraduatesData = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     */
    public int getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     */
    public void setPayment(int value) {
        this.payment = value;
    }

    /**
     * Gets the value of the specialityPrevUK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityPrevUK() {
        return specialityPrevUK;
    }

    /**
     * Sets the value of the specialityPrevUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityPrevUK(String value) {
        this.specialityPrevUK = value;
    }

    /**
     * Gets the value of the specialityPrevEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityPrevEN() {
        return specialityPrevEN;
    }

    /**
     * Sets the value of the specialityPrevEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityPrevEN(String value) {
        this.specialityPrevEN = value;
    }

    /**
     * Gets the value of the qalificationPrevUK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQalificationPrevUK() {
        return qalificationPrevUK;
    }

    /**
     * Sets the value of the qalificationPrevUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQalificationPrevUK(String value) {
        this.qalificationPrevUK = value;
    }

    /**
     * Gets the value of the qalificationPrevEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQalificationPrevEN() {
        return qalificationPrevEN;
    }

    /**
     * Sets the value of the qalificationPrevEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQalificationPrevEN(String value) {
        this.qalificationPrevEN = value;
    }

    /**
     * Gets the value of the educationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationDateBegin() {
        return educationDateBegin;
    }

    /**
     * Sets the value of the educationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationDateBegin(XMLGregorianCalendar value) {
        this.educationDateBegin = value;
    }

    /**
     * Gets the value of the educationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationDateEnd() {
        return educationDateEnd;
    }

    /**
     * Sets the value of the educationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationDateEnd(XMLGregorianCalendar value) {
        this.educationDateEnd = value;
    }

    /**
     * Gets the value of the documentDateGive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDateGive() {
        return documentDateGive;
    }

    /**
     * Sets the value of the documentDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDateGive(XMLGregorianCalendar value) {
        this.documentDateGive = value;
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
