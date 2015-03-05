
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcademicEducation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicEducation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademicEducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicEducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicEducationDuration" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationPaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationPaymentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationHistoryIsBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationHistoryIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU_Boss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonName_Boss" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO_Boos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationTitleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationDegreType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationDegreTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationHistoryDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicEducationHistoryDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationHistoryDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_AcademicEducationCancelationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationCancelationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationHistoryAcademicLeaveType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationHistoryAcademicLeaveTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationHistory_From" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicLeaveDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicEducation", propOrder = {
    "academicEducationDateBegin",
    "academicEducationDateEnd",
    "academicEducationDuration",
    "personCodeU",
    "idPersonDocument",
    "documentSeries",
    "documentNumbers",
    "documentDateGet",
    "documentIssued",
    "personDocumentTypeName",
    "idAcademicEducationHistory",
    "idAcademicEducation",
    "idPersonEducationForm",
    "idPersonEducationFormName",
    "idPersonEducationPaymentType",
    "personEducationPaymentTypeName",
    "idPersonRequestSeasons",
    "academicEducationHistoryIsBegin",
    "idAcademicEducationOrders",
    "academicEducationHistoryIsActive",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "idPersonName",
    "fio",
    "personCodeUBoss",
    "idPersonNameBoss",
    "fioBoos",
    "universityFacultetKode",
    "universityFacultetFullName",
    "academicEducationHistoryDescription",
    "academicEducationTitleName",
    "idAcademicEducationHistoryType",
    "idAcademicEducationForm",
    "academicEducationFormName",
    "idAcademicEducationDegreType",
    "academicEducationDegreTypeName",
    "academicEducationHistoryDateBegin",
    "academicEducationHistoryDateEnd",
    "idUserAdd",
    "academicEducationHistoryDateLastChange",
    "idAcademicEducationCancelationType",
    "academicEducationCancelationTypeName",
    "firstName",
    "middleName",
    "lastName",
    "idAcademicEducationHistoryAcademicLeaveType",
    "academicEducationHistoryAcademicLeaveTypeName",
    "yearNumber",
    "idAcademicYear",
    "academicYearName",
    "idAcademicEducationHistoryFrom",
    "universityKodeFrom",
    "academicLeaveDateEnd"
})
public class DAcademicEducation {

    @XmlElement(name = "AcademicEducationDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicEducationDateBegin;
    @XmlElement(name = "AcademicEducationDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicEducationDateEnd;
    @XmlElement(name = "AcademicEducationDuration", required = true)
    protected BigDecimal academicEducationDuration;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumbers")
    protected String documentNumbers;
    @XmlElement(name = "DocumentDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGet;
    @XmlElement(name = "DocumentIssued")
    protected String documentIssued;
    @XmlElement(name = "PersonDocumentTypeName")
    protected String personDocumentTypeName;
    @XmlElement(name = "Id_AcademicEducationHistory")
    protected int idAcademicEducationHistory;
    @XmlElement(name = "Id_AcademicEducation")
    protected int idAcademicEducation;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "Id_PersonEducationFormName")
    protected int idPersonEducationFormName;
    @XmlElement(name = "Id_PersonEducationPaymentType")
    protected int idPersonEducationPaymentType;
    @XmlElement(name = "PersonEducationPaymentTypeName")
    protected String personEducationPaymentTypeName;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "AcademicEducationHistoryIsBegin")
    protected int academicEducationHistoryIsBegin;
    @XmlElement(name = "Id_AcademicEducationOrders")
    protected int idAcademicEducationOrders;
    @XmlElement(name = "AcademicEducationHistoryIsActive")
    protected int academicEducationHistoryIsActive;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "PersonCodeU_Boss")
    protected String personCodeUBoss;
    @XmlElement(name = "Id_PersonName_Boss")
    protected int idPersonNameBoss;
    @XmlElement(name = "FIO_Boos")
    protected String fioBoos;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "AcademicEducationHistoryDescription")
    protected String academicEducationHistoryDescription;
    @XmlElement(name = "AcademicEducationTitleName")
    protected String academicEducationTitleName;
    @XmlElement(name = "Id_AcademicEducationHistoryType")
    protected int idAcademicEducationHistoryType;
    @XmlElement(name = "Id_AcademicEducationForm")
    protected int idAcademicEducationForm;
    @XmlElement(name = "AcademicEducationFormName")
    protected String academicEducationFormName;
    @XmlElement(name = "Id_AcademicEducationDegreType")
    protected int idAcademicEducationDegreType;
    @XmlElement(name = "AcademicEducationDegreTypeName")
    protected String academicEducationDegreTypeName;
    @XmlElement(name = "AcademicEducationHistoryDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicEducationHistoryDateBegin;
    @XmlElement(name = "AcademicEducationHistoryDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicEducationHistoryDateEnd;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "AcademicEducationHistoryDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicEducationHistoryDateLastChange;
    @XmlElement(name = "Id_AcademicEducationCancelationType")
    protected int idAcademicEducationCancelationType;
    @XmlElement(name = "AcademicEducationCancelationTypeName")
    protected String academicEducationCancelationTypeName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Id_AcademicEducationHistoryAcademicLeaveType")
    protected int idAcademicEducationHistoryAcademicLeaveType;
    @XmlElement(name = "AcademicEducationHistoryAcademicLeaveTypeName")
    protected String academicEducationHistoryAcademicLeaveTypeName;
    @XmlElement(name = "YearNumber")
    protected int yearNumber;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "Id_AcademicEducationHistory_From")
    protected int idAcademicEducationHistoryFrom;
    @XmlElement(name = "UniversityKodeFrom")
    protected String universityKodeFrom;
    @XmlElement(name = "AcademicLeaveDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicLeaveDateEnd;

    /**
     * Gets the value of the academicEducationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicEducationDateBegin() {
        return academicEducationDateBegin;
    }

    /**
     * Sets the value of the academicEducationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicEducationDateBegin(XMLGregorianCalendar value) {
        this.academicEducationDateBegin = value;
    }

    /**
     * Gets the value of the academicEducationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicEducationDateEnd() {
        return academicEducationDateEnd;
    }

    /**
     * Sets the value of the academicEducationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicEducationDateEnd(XMLGregorianCalendar value) {
        this.academicEducationDateEnd = value;
    }

    /**
     * Gets the value of the academicEducationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcademicEducationDuration() {
        return academicEducationDuration;
    }

    /**
     * Sets the value of the academicEducationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcademicEducationDuration(BigDecimal value) {
        this.academicEducationDuration = value;
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
     * Gets the value of the idAcademicEducationHistory property.
     * 
     */
    public int getIdAcademicEducationHistory() {
        return idAcademicEducationHistory;
    }

    /**
     * Sets the value of the idAcademicEducationHistory property.
     * 
     */
    public void setIdAcademicEducationHistory(int value) {
        this.idAcademicEducationHistory = value;
    }

    /**
     * Gets the value of the idAcademicEducation property.
     * 
     */
    public int getIdAcademicEducation() {
        return idAcademicEducation;
    }

    /**
     * Sets the value of the idAcademicEducation property.
     * 
     */
    public void setIdAcademicEducation(int value) {
        this.idAcademicEducation = value;
    }

    /**
     * Gets the value of the idPersonEducationForm property.
     * 
     */
    public int getIdPersonEducationForm() {
        return idPersonEducationForm;
    }

    /**
     * Sets the value of the idPersonEducationForm property.
     * 
     */
    public void setIdPersonEducationForm(int value) {
        this.idPersonEducationForm = value;
    }

    /**
     * Gets the value of the idPersonEducationFormName property.
     * 
     */
    public int getIdPersonEducationFormName() {
        return idPersonEducationFormName;
    }

    /**
     * Sets the value of the idPersonEducationFormName property.
     * 
     */
    public void setIdPersonEducationFormName(int value) {
        this.idPersonEducationFormName = value;
    }

    /**
     * Gets the value of the idPersonEducationPaymentType property.
     * 
     */
    public int getIdPersonEducationPaymentType() {
        return idPersonEducationPaymentType;
    }

    /**
     * Sets the value of the idPersonEducationPaymentType property.
     * 
     */
    public void setIdPersonEducationPaymentType(int value) {
        this.idPersonEducationPaymentType = value;
    }

    /**
     * Gets the value of the personEducationPaymentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationPaymentTypeName() {
        return personEducationPaymentTypeName;
    }

    /**
     * Sets the value of the personEducationPaymentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationPaymentTypeName(String value) {
        this.personEducationPaymentTypeName = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
    }

    /**
     * Gets the value of the academicEducationHistoryIsBegin property.
     * 
     */
    public int getAcademicEducationHistoryIsBegin() {
        return academicEducationHistoryIsBegin;
    }

    /**
     * Sets the value of the academicEducationHistoryIsBegin property.
     * 
     */
    public void setAcademicEducationHistoryIsBegin(int value) {
        this.academicEducationHistoryIsBegin = value;
    }

    /**
     * Gets the value of the idAcademicEducationOrders property.
     * 
     */
    public int getIdAcademicEducationOrders() {
        return idAcademicEducationOrders;
    }

    /**
     * Sets the value of the idAcademicEducationOrders property.
     * 
     */
    public void setIdAcademicEducationOrders(int value) {
        this.idAcademicEducationOrders = value;
    }

    /**
     * Gets the value of the academicEducationHistoryIsActive property.
     * 
     */
    public int getAcademicEducationHistoryIsActive() {
        return academicEducationHistoryIsActive;
    }

    /**
     * Sets the value of the academicEducationHistoryIsActive property.
     * 
     */
    public void setAcademicEducationHistoryIsActive(int value) {
        this.academicEducationHistoryIsActive = value;
    }

    /**
     * Gets the value of the scienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityCode() {
        return scienceSpecialityCode;
    }

    /**
     * Sets the value of the scienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityCode(String value) {
        this.scienceSpecialityCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityClasifierCode() {
        return scienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the scienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityClasifierCode(String value) {
        this.scienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityName() {
        return scienceSpecialityName;
    }

    /**
     * Sets the value of the scienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityName(String value) {
        this.scienceSpecialityName = value;
    }

    /**
     * Gets the value of the idPersonName property.
     * 
     */
    public int getIdPersonName() {
        return idPersonName;
    }

    /**
     * Sets the value of the idPersonName property.
     * 
     */
    public void setIdPersonName(int value) {
        this.idPersonName = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the personCodeUBoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeUBoss() {
        return personCodeUBoss;
    }

    /**
     * Sets the value of the personCodeUBoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeUBoss(String value) {
        this.personCodeUBoss = value;
    }

    /**
     * Gets the value of the idPersonNameBoss property.
     * 
     */
    public int getIdPersonNameBoss() {
        return idPersonNameBoss;
    }

    /**
     * Sets the value of the idPersonNameBoss property.
     * 
     */
    public void setIdPersonNameBoss(int value) {
        this.idPersonNameBoss = value;
    }

    /**
     * Gets the value of the fioBoos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOBoos() {
        return fioBoos;
    }

    /**
     * Sets the value of the fioBoos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOBoos(String value) {
        this.fioBoos = value;
    }

    /**
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
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
     * Gets the value of the academicEducationHistoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationHistoryDescription() {
        return academicEducationHistoryDescription;
    }

    /**
     * Sets the value of the academicEducationHistoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationHistoryDescription(String value) {
        this.academicEducationHistoryDescription = value;
    }

    /**
     * Gets the value of the academicEducationTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationTitleName() {
        return academicEducationTitleName;
    }

    /**
     * Sets the value of the academicEducationTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationTitleName(String value) {
        this.academicEducationTitleName = value;
    }

    /**
     * Gets the value of the idAcademicEducationHistoryType property.
     * 
     */
    public int getIdAcademicEducationHistoryType() {
        return idAcademicEducationHistoryType;
    }

    /**
     * Sets the value of the idAcademicEducationHistoryType property.
     * 
     */
    public void setIdAcademicEducationHistoryType(int value) {
        this.idAcademicEducationHistoryType = value;
    }

    /**
     * Gets the value of the idAcademicEducationForm property.
     * 
     */
    public int getIdAcademicEducationForm() {
        return idAcademicEducationForm;
    }

    /**
     * Sets the value of the idAcademicEducationForm property.
     * 
     */
    public void setIdAcademicEducationForm(int value) {
        this.idAcademicEducationForm = value;
    }

    /**
     * Gets the value of the academicEducationFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationFormName() {
        return academicEducationFormName;
    }

    /**
     * Sets the value of the academicEducationFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationFormName(String value) {
        this.academicEducationFormName = value;
    }

    /**
     * Gets the value of the idAcademicEducationDegreType property.
     * 
     */
    public int getIdAcademicEducationDegreType() {
        return idAcademicEducationDegreType;
    }

    /**
     * Sets the value of the idAcademicEducationDegreType property.
     * 
     */
    public void setIdAcademicEducationDegreType(int value) {
        this.idAcademicEducationDegreType = value;
    }

    /**
     * Gets the value of the academicEducationDegreTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreTypeName() {
        return academicEducationDegreTypeName;
    }

    /**
     * Sets the value of the academicEducationDegreTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreTypeName(String value) {
        this.academicEducationDegreTypeName = value;
    }

    /**
     * Gets the value of the academicEducationHistoryDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicEducationHistoryDateBegin() {
        return academicEducationHistoryDateBegin;
    }

    /**
     * Sets the value of the academicEducationHistoryDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicEducationHistoryDateBegin(XMLGregorianCalendar value) {
        this.academicEducationHistoryDateBegin = value;
    }

    /**
     * Gets the value of the academicEducationHistoryDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicEducationHistoryDateEnd() {
        return academicEducationHistoryDateEnd;
    }

    /**
     * Sets the value of the academicEducationHistoryDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicEducationHistoryDateEnd(XMLGregorianCalendar value) {
        this.academicEducationHistoryDateEnd = value;
    }

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
    }

    /**
     * Gets the value of the academicEducationHistoryDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicEducationHistoryDateLastChange() {
        return academicEducationHistoryDateLastChange;
    }

    /**
     * Sets the value of the academicEducationHistoryDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicEducationHistoryDateLastChange(XMLGregorianCalendar value) {
        this.academicEducationHistoryDateLastChange = value;
    }

    /**
     * Gets the value of the idAcademicEducationCancelationType property.
     * 
     */
    public int getIdAcademicEducationCancelationType() {
        return idAcademicEducationCancelationType;
    }

    /**
     * Sets the value of the idAcademicEducationCancelationType property.
     * 
     */
    public void setIdAcademicEducationCancelationType(int value) {
        this.idAcademicEducationCancelationType = value;
    }

    /**
     * Gets the value of the academicEducationCancelationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationCancelationTypeName() {
        return academicEducationCancelationTypeName;
    }

    /**
     * Sets the value of the academicEducationCancelationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationCancelationTypeName(String value) {
        this.academicEducationCancelationTypeName = value;
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
     * Gets the value of the idAcademicEducationHistoryAcademicLeaveType property.
     * 
     */
    public int getIdAcademicEducationHistoryAcademicLeaveType() {
        return idAcademicEducationHistoryAcademicLeaveType;
    }

    /**
     * Sets the value of the idAcademicEducationHistoryAcademicLeaveType property.
     * 
     */
    public void setIdAcademicEducationHistoryAcademicLeaveType(int value) {
        this.idAcademicEducationHistoryAcademicLeaveType = value;
    }

    /**
     * Gets the value of the academicEducationHistoryAcademicLeaveTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationHistoryAcademicLeaveTypeName() {
        return academicEducationHistoryAcademicLeaveTypeName;
    }

    /**
     * Sets the value of the academicEducationHistoryAcademicLeaveTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationHistoryAcademicLeaveTypeName(String value) {
        this.academicEducationHistoryAcademicLeaveTypeName = value;
    }

    /**
     * Gets the value of the yearNumber property.
     * 
     */
    public int getYearNumber() {
        return yearNumber;
    }

    /**
     * Sets the value of the yearNumber property.
     * 
     */
    public void setYearNumber(int value) {
        this.yearNumber = value;
    }

    /**
     * Gets the value of the idAcademicYear property.
     * 
     */
    public int getIdAcademicYear() {
        return idAcademicYear;
    }

    /**
     * Sets the value of the idAcademicYear property.
     * 
     */
    public void setIdAcademicYear(int value) {
        this.idAcademicYear = value;
    }

    /**
     * Gets the value of the academicYearName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearName() {
        return academicYearName;
    }

    /**
     * Sets the value of the academicYearName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearName(String value) {
        this.academicYearName = value;
    }

    /**
     * Gets the value of the idAcademicEducationHistoryFrom property.
     * 
     */
    public int getIdAcademicEducationHistoryFrom() {
        return idAcademicEducationHistoryFrom;
    }

    /**
     * Sets the value of the idAcademicEducationHistoryFrom property.
     * 
     */
    public void setIdAcademicEducationHistoryFrom(int value) {
        this.idAcademicEducationHistoryFrom = value;
    }

    /**
     * Gets the value of the universityKodeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeFrom() {
        return universityKodeFrom;
    }

    /**
     * Sets the value of the universityKodeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeFrom(String value) {
        this.universityKodeFrom = value;
    }

    /**
     * Gets the value of the academicLeaveDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicLeaveDateEnd() {
        return academicLeaveDateEnd;
    }

    /**
     * Sets the value of the academicLeaveDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicLeaveDateEnd(XMLGregorianCalendar value) {
        this.academicLeaveDateEnd = value;
    }

}
