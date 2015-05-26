
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonEducationProgressOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationProgressOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationProgressOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressOrdersType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressPeriodType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityDateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversitiesDisciplines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheetValuesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateRun" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeDegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonEducationProgressControlType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressControlCapasity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressOrdersTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationProgressTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationProgressPeriodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationProgressControlTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationProgressControlCapasityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecComplexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesSmallName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIOPerepod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkPostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetValuesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullNameEducationCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationProgressPeriodTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examinatorts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Teachers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationProgressOrders", propOrder = {
    "idPersonEducationProgressOrders",
    "idPersonEducationProgressOrdersType",
    "idPersonEducationProgressPeriodType",
    "idPersonEducationProgressPeriods",
    "idEducationalCycles",
    "idPersonEducationProgressType",
    "dateCreate",
    "universityDateCreate",
    "universityNumber",
    "idUniversitiesDisciplines",
    "idPersonWork",
    "idExaminationSheetValuesType",
    "dateRun",
    "timeDegin",
    "timeEnd",
    "universityFacultetKode",
    "idUniversityGroup",
    "idUserAdd",
    "dateLastChange",
    "idPersonEducationProgressControlType",
    "idPersonEducationProgressControlCapasity",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "personEducationProgressOrdersTypeName",
    "personEducationProgressTypeName",
    "personEducationProgressPeriodsName",
    "personEducationProgressControlTypeName",
    "personEducationProgressControlCapasityName",
    "specComplexName",
    "qualificationName",
    "personEducationFormName",
    "universitiesDisciplinesFullName",
    "universitiesDisciplinesSmallName",
    "fioPerepod",
    "personWorkPostName",
    "examinationSheetValuesTypeName",
    "universityFacultetFullName",
    "universityGroupFullName",
    "universityGroupShortName",
    "universityFacultetFullNameEducationCycle",
    "idCourse",
    "idAcademicYear",
    "academicYearName",
    "universityKode",
    "personEducationProgressPeriodTypeName",
    "examinatorts",
    "teachers",
    "controlValue"
})
public class DPersonEducationProgressOrders {

    @XmlElement(name = "Id_PersonEducationProgressOrders")
    protected int idPersonEducationProgressOrders;
    @XmlElement(name = "Id_PersonEducationProgressOrdersType")
    protected int idPersonEducationProgressOrdersType;
    @XmlElement(name = "Id_PersonEducationProgressPeriodType")
    protected int idPersonEducationProgressPeriodType;
    @XmlElement(name = "Id_PersonEducationProgressPeriods")
    protected int idPersonEducationProgressPeriods;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "Id_PersonEducationProgressType")
    protected int idPersonEducationProgressType;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "UniversityDateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityDateCreate;
    @XmlElement(name = "UniversityNumber")
    protected String universityNumber;
    @XmlElement(name = "Id_UniversitiesDisciplines")
    protected int idUniversitiesDisciplines;
    @XmlElement(name = "Id_PersonWork")
    protected int idPersonWork;
    @XmlElement(name = "Id_ExaminationSheetValuesType")
    protected int idExaminationSheetValuesType;
    @XmlElement(name = "DateRun", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRun;
    @XmlElement(name = "TimeDegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeDegin;
    @XmlElement(name = "TimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeEnd;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_PersonEducationProgressControlType")
    protected int idPersonEducationProgressControlType;
    @XmlElement(name = "Id_PersonEducationProgressControlCapasity")
    protected int idPersonEducationProgressControlCapasity;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "IsVerified")
    protected int isVerified;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistoryType")
    protected int idRegulationDocumentVerificationHistoryType;
    @XmlElement(name = "RegulationDocumentVerificationHistoryTypeName")
    protected String regulationDocumentVerificationHistoryTypeName;
    @XmlElement(name = "IsExistFile")
    protected int isExistFile;
    @XmlElement(name = "PersonEducationProgressOrdersTypeName")
    protected String personEducationProgressOrdersTypeName;
    @XmlElement(name = "PersonEducationProgressTypeName")
    protected String personEducationProgressTypeName;
    @XmlElement(name = "PersonEducationProgressPeriodsName")
    protected String personEducationProgressPeriodsName;
    @XmlElement(name = "PersonEducationProgressControlTypeName")
    protected String personEducationProgressControlTypeName;
    @XmlElement(name = "PersonEducationProgressControlCapasityName")
    protected String personEducationProgressControlCapasityName;
    @XmlElement(name = "SpecComplexName")
    protected String specComplexName;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "UniversitiesDisciplinesFullName")
    protected String universitiesDisciplinesFullName;
    @XmlElement(name = "UniversitiesDisciplinesSmallName")
    protected String universitiesDisciplinesSmallName;
    @XmlElement(name = "FIOPerepod")
    protected String fioPerepod;
    @XmlElement(name = "PersonWorkPostName")
    protected String personWorkPostName;
    @XmlElement(name = "ExaminationSheetValuesTypeName")
    protected String examinationSheetValuesTypeName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityGroupFullName")
    protected String universityGroupFullName;
    @XmlElement(name = "UniversityGroupShortName")
    protected String universityGroupShortName;
    @XmlElement(name = "UniversityFacultetFullNameEducationCycle")
    protected String universityFacultetFullNameEducationCycle;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "PersonEducationProgressPeriodTypeName")
    protected String personEducationProgressPeriodTypeName;
    @XmlElement(name = "Examinatorts")
    protected String examinatorts;
    @XmlElement(name = "Teachers")
    protected String teachers;
    @XmlElement(name = "ControlValue")
    protected String controlValue;

    /**
     * Gets the value of the idPersonEducationProgressOrders property.
     * 
     */
    public int getIdPersonEducationProgressOrders() {
        return idPersonEducationProgressOrders;
    }

    /**
     * Sets the value of the idPersonEducationProgressOrders property.
     * 
     */
    public void setIdPersonEducationProgressOrders(int value) {
        this.idPersonEducationProgressOrders = value;
    }

    /**
     * Gets the value of the idPersonEducationProgressOrdersType property.
     * 
     */
    public int getIdPersonEducationProgressOrdersType() {
        return idPersonEducationProgressOrdersType;
    }

    /**
     * Sets the value of the idPersonEducationProgressOrdersType property.
     * 
     */
    public void setIdPersonEducationProgressOrdersType(int value) {
        this.idPersonEducationProgressOrdersType = value;
    }

    /**
     * Gets the value of the idPersonEducationProgressPeriodType property.
     * 
     */
    public int getIdPersonEducationProgressPeriodType() {
        return idPersonEducationProgressPeriodType;
    }

    /**
     * Sets the value of the idPersonEducationProgressPeriodType property.
     * 
     */
    public void setIdPersonEducationProgressPeriodType(int value) {
        this.idPersonEducationProgressPeriodType = value;
    }

    /**
     * Gets the value of the idPersonEducationProgressPeriods property.
     * 
     */
    public int getIdPersonEducationProgressPeriods() {
        return idPersonEducationProgressPeriods;
    }

    /**
     * Sets the value of the idPersonEducationProgressPeriods property.
     * 
     */
    public void setIdPersonEducationProgressPeriods(int value) {
        this.idPersonEducationProgressPeriods = value;
    }

    /**
     * Gets the value of the idEducationalCycles property.
     * 
     */
    public int getIdEducationalCycles() {
        return idEducationalCycles;
    }

    /**
     * Sets the value of the idEducationalCycles property.
     * 
     */
    public void setIdEducationalCycles(int value) {
        this.idEducationalCycles = value;
    }

    /**
     * Gets the value of the idPersonEducationProgressType property.
     * 
     */
    public int getIdPersonEducationProgressType() {
        return idPersonEducationProgressType;
    }

    /**
     * Sets the value of the idPersonEducationProgressType property.
     * 
     */
    public void setIdPersonEducationProgressType(int value) {
        this.idPersonEducationProgressType = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the universityDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityDateCreate() {
        return universityDateCreate;
    }

    /**
     * Sets the value of the universityDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityDateCreate(XMLGregorianCalendar value) {
        this.universityDateCreate = value;
    }

    /**
     * Gets the value of the universityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityNumber() {
        return universityNumber;
    }

    /**
     * Sets the value of the universityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityNumber(String value) {
        this.universityNumber = value;
    }

    /**
     * Gets the value of the idUniversitiesDisciplines property.
     * 
     */
    public int getIdUniversitiesDisciplines() {
        return idUniversitiesDisciplines;
    }

    /**
     * Sets the value of the idUniversitiesDisciplines property.
     * 
     */
    public void setIdUniversitiesDisciplines(int value) {
        this.idUniversitiesDisciplines = value;
    }

    /**
     * Gets the value of the idPersonWork property.
     * 
     */
    public int getIdPersonWork() {
        return idPersonWork;
    }

    /**
     * Sets the value of the idPersonWork property.
     * 
     */
    public void setIdPersonWork(int value) {
        this.idPersonWork = value;
    }

    /**
     * Gets the value of the idExaminationSheetValuesType property.
     * 
     */
    public int getIdExaminationSheetValuesType() {
        return idExaminationSheetValuesType;
    }

    /**
     * Sets the value of the idExaminationSheetValuesType property.
     * 
     */
    public void setIdExaminationSheetValuesType(int value) {
        this.idExaminationSheetValuesType = value;
    }

    /**
     * Gets the value of the dateRun property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRun() {
        return dateRun;
    }

    /**
     * Sets the value of the dateRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRun(XMLGregorianCalendar value) {
        this.dateRun = value;
    }

    /**
     * Gets the value of the timeDegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeDegin() {
        return timeDegin;
    }

    /**
     * Sets the value of the timeDegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeDegin(XMLGregorianCalendar value) {
        this.timeDegin = value;
    }

    /**
     * Gets the value of the timeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeEnd() {
        return timeEnd;
    }

    /**
     * Sets the value of the timeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeEnd(XMLGregorianCalendar value) {
        this.timeEnd = value;
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
     * Gets the value of the idPersonEducationProgressControlType property.
     * 
     */
    public int getIdPersonEducationProgressControlType() {
        return idPersonEducationProgressControlType;
    }

    /**
     * Sets the value of the idPersonEducationProgressControlType property.
     * 
     */
    public void setIdPersonEducationProgressControlType(int value) {
        this.idPersonEducationProgressControlType = value;
    }

    /**
     * Gets the value of the idPersonEducationProgressControlCapasity property.
     * 
     */
    public int getIdPersonEducationProgressControlCapasity() {
        return idPersonEducationProgressControlCapasity;
    }

    /**
     * Sets the value of the idPersonEducationProgressControlCapasity property.
     * 
     */
    public void setIdPersonEducationProgressControlCapasity(int value) {
        this.idPersonEducationProgressControlCapasity = value;
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
     * Gets the value of the isVerified property.
     * 
     */
    public int getIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     */
    public void setIsVerified(int value) {
        this.isVerified = value;
    }

    /**
     * Gets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public int getIdRegulationDocumentVerificationHistoryType() {
        return idRegulationDocumentVerificationHistoryType;
    }

    /**
     * Sets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public void setIdRegulationDocumentVerificationHistoryType(int value) {
        this.idRegulationDocumentVerificationHistoryType = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryTypeName() {
        return regulationDocumentVerificationHistoryTypeName;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryTypeName(String value) {
        this.regulationDocumentVerificationHistoryTypeName = value;
    }

    /**
     * Gets the value of the isExistFile property.
     * 
     */
    public int getIsExistFile() {
        return isExistFile;
    }

    /**
     * Sets the value of the isExistFile property.
     * 
     */
    public void setIsExistFile(int value) {
        this.isExistFile = value;
    }

    /**
     * Gets the value of the personEducationProgressOrdersTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressOrdersTypeName() {
        return personEducationProgressOrdersTypeName;
    }

    /**
     * Sets the value of the personEducationProgressOrdersTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressOrdersTypeName(String value) {
        this.personEducationProgressOrdersTypeName = value;
    }

    /**
     * Gets the value of the personEducationProgressTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressTypeName() {
        return personEducationProgressTypeName;
    }

    /**
     * Sets the value of the personEducationProgressTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressTypeName(String value) {
        this.personEducationProgressTypeName = value;
    }

    /**
     * Gets the value of the personEducationProgressPeriodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressPeriodsName() {
        return personEducationProgressPeriodsName;
    }

    /**
     * Sets the value of the personEducationProgressPeriodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressPeriodsName(String value) {
        this.personEducationProgressPeriodsName = value;
    }

    /**
     * Gets the value of the personEducationProgressControlTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressControlTypeName() {
        return personEducationProgressControlTypeName;
    }

    /**
     * Sets the value of the personEducationProgressControlTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressControlTypeName(String value) {
        this.personEducationProgressControlTypeName = value;
    }

    /**
     * Gets the value of the personEducationProgressControlCapasityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressControlCapasityName() {
        return personEducationProgressControlCapasityName;
    }

    /**
     * Sets the value of the personEducationProgressControlCapasityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressControlCapasityName(String value) {
        this.personEducationProgressControlCapasityName = value;
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
     * Gets the value of the universitiesDisciplinesFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesFullName() {
        return universitiesDisciplinesFullName;
    }

    /**
     * Sets the value of the universitiesDisciplinesFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesFullName(String value) {
        this.universitiesDisciplinesFullName = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesSmallName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesSmallName() {
        return universitiesDisciplinesSmallName;
    }

    /**
     * Sets the value of the universitiesDisciplinesSmallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesSmallName(String value) {
        this.universitiesDisciplinesSmallName = value;
    }

    /**
     * Gets the value of the fioPerepod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOPerepod() {
        return fioPerepod;
    }

    /**
     * Sets the value of the fioPerepod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOPerepod(String value) {
        this.fioPerepod = value;
    }

    /**
     * Gets the value of the personWorkPostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkPostName() {
        return personWorkPostName;
    }

    /**
     * Sets the value of the personWorkPostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkPostName(String value) {
        this.personWorkPostName = value;
    }

    /**
     * Gets the value of the examinationSheetValuesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetValuesTypeName() {
        return examinationSheetValuesTypeName;
    }

    /**
     * Sets the value of the examinationSheetValuesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetValuesTypeName(String value) {
        this.examinationSheetValuesTypeName = value;
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
     * Gets the value of the universityFacultetFullNameEducationCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullNameEducationCycle() {
        return universityFacultetFullNameEducationCycle;
    }

    /**
     * Sets the value of the universityFacultetFullNameEducationCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullNameEducationCycle(String value) {
        this.universityFacultetFullNameEducationCycle = value;
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
     * Gets the value of the personEducationProgressPeriodTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressPeriodTypeName() {
        return personEducationProgressPeriodTypeName;
    }

    /**
     * Sets the value of the personEducationProgressPeriodTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressPeriodTypeName(String value) {
        this.personEducationProgressPeriodTypeName = value;
    }

    /**
     * Gets the value of the examinatorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminatorts() {
        return examinatorts;
    }

    /**
     * Sets the value of the examinatorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminatorts(String value) {
        this.examinatorts = value;
    }

    /**
     * Gets the value of the teachers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeachers() {
        return teachers;
    }

    /**
     * Sets the value of the teachers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeachers(String value) {
        this.teachers = value;
    }

    /**
     * Gets the value of the controlValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlValue() {
        return controlValue;
    }

    /**
     * Sets the value of the controlValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlValue(String value) {
        this.controlValue = value;
    }

}
