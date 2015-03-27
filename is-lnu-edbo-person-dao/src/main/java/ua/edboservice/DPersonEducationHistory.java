
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonEducationHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationPaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryDesciption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationPaymentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonEducationHistoryDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_OrderOfEnrollment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationHistoryOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryOrdersNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryOrdersDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsConfirmed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicLeaveType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicLeaveTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationHistoryCorrected" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsCorrected" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationsCancelEducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationsCancelEducationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationHistory", propOrder = {
    "idPersonEducationHistory",
    "idPersonEducationHistoryType",
    "idPersonEducation",
    "idPersonEducationPaymentType",
    "idUniversityGroup",
    "dateLastChange",
    "isActive",
    "personEducationHistoryDesciption",
    "universityGroupCode",
    "universityGroupFullName",
    "universityGroupShortName",
    "universityGroupDescription",
    "idAcademicYear",
    "idCourse",
    "idPersonEducationForm",
    "universityFacultetKode",
    "specCode",
    "universityKode",
    "idQualification",
    "academicYearName",
    "courseName",
    "personEducationFormName",
    "universityFullName",
    "universityShortName",
    "universityFacultetFullName",
    "universityFacultetShortName",
    "qualificationName",
    "personEducationPaymentTypeName",
    "personEducationHistoryTypeName",
    "personCodeU",
    "personEducationHistoryDateBegin",
    "personEducationHistoryDateEnd",
    "idOrderOfEnrollment",
    "idPersonEducationHistoryOrders",
    "specClasifierCode",
    "specDirectionName",
    "specSpecialityClasifierCode",
    "specSpecialityName",
    "specScecializationName",
    "personEducationHistoryOrdersNumber",
    "personEducationHistoryOrdersDate",
    "isConfirmed",
    "idAcademicLeaveType",
    "academicLeaveTypeName",
    "universityKodeFrom",
    "idUniversityFrom",
    "universityFullNameFrom",
    "userFIO",
    "idPersonEducationHistoryCorrected",
    "isCorrected",
    "idPersonEducationsCancelEducationType",
    "personEducationsCancelEducationTypeName",
    "idPersonName",
    "fio"
})
public class DPersonEducationHistory {

    @XmlElement(name = "Id_PersonEducationHistory")
    protected int idPersonEducationHistory;
    @XmlElement(name = "Id_PersonEducationHistoryType")
    protected int idPersonEducationHistoryType;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "Id_PersonEducationPaymentType")
    protected int idPersonEducationPaymentType;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "PersonEducationHistoryDesciption")
    protected String personEducationHistoryDesciption;
    @XmlElement(name = "UniversityGroupCode")
    protected String universityGroupCode;
    @XmlElement(name = "UniversityGroupFullName")
    protected String universityGroupFullName;
    @XmlElement(name = "UniversityGroupShortName")
    protected String universityGroupShortName;
    @XmlElement(name = "UniversityGroupDescription")
    protected String universityGroupDescription;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "CourseName")
    protected String courseName;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityShortName")
    protected String universityShortName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityFacultetShortName")
    protected String universityFacultetShortName;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "PersonEducationPaymentTypeName")
    protected String personEducationPaymentTypeName;
    @XmlElement(name = "PersonEducationHistoryTypeName")
    protected String personEducationHistoryTypeName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "PersonEducationHistoryDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationHistoryDateBegin;
    @XmlElement(name = "PersonEducationHistoryDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationHistoryDateEnd;
    @XmlElement(name = "Id_OrderOfEnrollment")
    protected int idOrderOfEnrollment;
    @XmlElement(name = "Id_PersonEducationHistoryOrders")
    protected int idPersonEducationHistoryOrders;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;
    @XmlElement(name = "PersonEducationHistoryOrdersNumber")
    protected String personEducationHistoryOrdersNumber;
    @XmlElement(name = "PersonEducationHistoryOrdersDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationHistoryOrdersDate;
    @XmlElement(name = "IsConfirmed")
    protected int isConfirmed;
    @XmlElement(name = "Id_AcademicLeaveType")
    protected int idAcademicLeaveType;
    @XmlElement(name = "AcademicLeaveTypeName")
    protected String academicLeaveTypeName;
    @XmlElement(name = "UniversityKodeFrom")
    protected String universityKodeFrom;
    @XmlElement(name = "Id_UniversityFrom")
    protected int idUniversityFrom;
    @XmlElement(name = "UniversityFullNameFrom")
    protected String universityFullNameFrom;
    @XmlElement(name = "UserFIO")
    protected String userFIO;
    @XmlElement(name = "Id_PersonEducationHistoryCorrected")
    protected int idPersonEducationHistoryCorrected;
    @XmlElement(name = "IsCorrected")
    protected int isCorrected;
    @XmlElement(name = "Id_PersonEducationsCancelEducationType")
    protected int idPersonEducationsCancelEducationType;
    @XmlElement(name = "PersonEducationsCancelEducationTypeName")
    protected String personEducationsCancelEducationTypeName;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "FIO")
    protected String fio;

    /**
     * Gets the value of the idPersonEducationHistory property.
     * 
     */
    public int getIdPersonEducationHistory() {
        return idPersonEducationHistory;
    }

    /**
     * Sets the value of the idPersonEducationHistory property.
     * 
     */
    public void setIdPersonEducationHistory(int value) {
        this.idPersonEducationHistory = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryType property.
     * 
     */
    public int getIdPersonEducationHistoryType() {
        return idPersonEducationHistoryType;
    }

    /**
     * Sets the value of the idPersonEducationHistoryType property.
     * 
     */
    public void setIdPersonEducationHistoryType(int value) {
        this.idPersonEducationHistoryType = value;
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
     * Gets the value of the idUniversityGroup property.
     * 
     */
    public int getIdUniversityGroup() {
        return idUniversityGroup;
    }

    /**
     * Sets the value of the idUniversityGroup property.
     * 
     */
    public void setIdUniversityGroup(int value) {
        this.idUniversityGroup = value;
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
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the personEducationHistoryDesciption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryDesciption() {
        return personEducationHistoryDesciption;
    }

    /**
     * Sets the value of the personEducationHistoryDesciption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryDesciption(String value) {
        this.personEducationHistoryDesciption = value;
    }

    /**
     * Gets the value of the universityGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupCode() {
        return universityGroupCode;
    }

    /**
     * Sets the value of the universityGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupCode(String value) {
        this.universityGroupCode = value;
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
     * Gets the value of the universityGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupDescription() {
        return universityGroupDescription;
    }

    /**
     * Sets the value of the universityGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupDescription(String value) {
        this.universityGroupDescription = value;
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
     * Gets the value of the courseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the value of the courseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseName(String value) {
        this.courseName = value;
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
     * Gets the value of the universityShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityShortName() {
        return universityShortName;
    }

    /**
     * Sets the value of the universityShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityShortName(String value) {
        this.universityShortName = value;
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
     * Gets the value of the personEducationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryTypeName() {
        return personEducationHistoryTypeName;
    }

    /**
     * Sets the value of the personEducationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryTypeName(String value) {
        this.personEducationHistoryTypeName = value;
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
     * Gets the value of the personEducationHistoryDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationHistoryDateBegin() {
        return personEducationHistoryDateBegin;
    }

    /**
     * Sets the value of the personEducationHistoryDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationHistoryDateBegin(XMLGregorianCalendar value) {
        this.personEducationHistoryDateBegin = value;
    }

    /**
     * Gets the value of the personEducationHistoryDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationHistoryDateEnd() {
        return personEducationHistoryDateEnd;
    }

    /**
     * Sets the value of the personEducationHistoryDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationHistoryDateEnd(XMLGregorianCalendar value) {
        this.personEducationHistoryDateEnd = value;
    }

    /**
     * Gets the value of the idOrderOfEnrollment property.
     * 
     */
    public int getIdOrderOfEnrollment() {
        return idOrderOfEnrollment;
    }

    /**
     * Sets the value of the idOrderOfEnrollment property.
     * 
     */
    public void setIdOrderOfEnrollment(int value) {
        this.idOrderOfEnrollment = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public int getIdPersonEducationHistoryOrders() {
        return idPersonEducationHistoryOrders;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public void setIdPersonEducationHistoryOrders(int value) {
        this.idPersonEducationHistoryOrders = value;
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
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
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
     * Gets the value of the personEducationHistoryOrdersNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryOrdersNumber() {
        return personEducationHistoryOrdersNumber;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryOrdersNumber(String value) {
        this.personEducationHistoryOrdersNumber = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrdersDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationHistoryOrdersDate() {
        return personEducationHistoryOrdersDate;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationHistoryOrdersDate(XMLGregorianCalendar value) {
        this.personEducationHistoryOrdersDate = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     */
    public int getIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     */
    public void setIsConfirmed(int value) {
        this.isConfirmed = value;
    }

    /**
     * Gets the value of the idAcademicLeaveType property.
     * 
     */
    public int getIdAcademicLeaveType() {
        return idAcademicLeaveType;
    }

    /**
     * Sets the value of the idAcademicLeaveType property.
     * 
     */
    public void setIdAcademicLeaveType(int value) {
        this.idAcademicLeaveType = value;
    }

    /**
     * Gets the value of the academicLeaveTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicLeaveTypeName() {
        return academicLeaveTypeName;
    }

    /**
     * Sets the value of the academicLeaveTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicLeaveTypeName(String value) {
        this.academicLeaveTypeName = value;
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
     * Gets the value of the idUniversityFrom property.
     * 
     */
    public int getIdUniversityFrom() {
        return idUniversityFrom;
    }

    /**
     * Sets the value of the idUniversityFrom property.
     * 
     */
    public void setIdUniversityFrom(int value) {
        this.idUniversityFrom = value;
    }

    /**
     * Gets the value of the universityFullNameFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameFrom() {
        return universityFullNameFrom;
    }

    /**
     * Sets the value of the universityFullNameFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameFrom(String value) {
        this.universityFullNameFrom = value;
    }

    /**
     * Gets the value of the userFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFIO() {
        return userFIO;
    }

    /**
     * Sets the value of the userFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFIO(String value) {
        this.userFIO = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryCorrected property.
     * 
     */
    public int getIdPersonEducationHistoryCorrected() {
        return idPersonEducationHistoryCorrected;
    }

    /**
     * Sets the value of the idPersonEducationHistoryCorrected property.
     * 
     */
    public void setIdPersonEducationHistoryCorrected(int value) {
        this.idPersonEducationHistoryCorrected = value;
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
     * Gets the value of the idPersonEducationsCancelEducationType property.
     * 
     */
    public int getIdPersonEducationsCancelEducationType() {
        return idPersonEducationsCancelEducationType;
    }

    /**
     * Sets the value of the idPersonEducationsCancelEducationType property.
     * 
     */
    public void setIdPersonEducationsCancelEducationType(int value) {
        this.idPersonEducationsCancelEducationType = value;
    }

    /**
     * Gets the value of the personEducationsCancelEducationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsCancelEducationTypeName() {
        return personEducationsCancelEducationTypeName;
    }

    /**
     * Sets the value of the personEducationsCancelEducationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsCancelEducationTypeName(String value) {
        this.personEducationsCancelEducationTypeName = value;
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

}
