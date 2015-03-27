
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationProgressOrdersType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressPeriodType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityDateCreate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversitiesDisciplines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheetValuesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateRun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeDegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressControlType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressControlCapasity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "universityKode",
    "idPersonEducationProgressOrdersType",
    "idPersonEducationProgressPeriodType",
    "idPersonEducationProgressPeriods",
    "idEducationalCycles",
    "idPersonEducationProgressType",
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
    "idPersonEducationProgressControlType",
    "idPersonEducationProgressControlCapasity",
    "idCourse",
    "idAcademicYear",
    "examinatorts",
    "teachers",
    "controlValue"
})
@XmlRootElement(name = "PersonEducationProgressOrdersAdd")
public class PersonEducationProgressOrdersAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
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
    @XmlElement(name = "UniversityDateCreate")
    protected String universityDateCreate;
    @XmlElement(name = "UniversityNumber")
    protected String universityNumber;
    @XmlElement(name = "Id_UniversitiesDisciplines")
    protected int idUniversitiesDisciplines;
    @XmlElement(name = "Id_PersonWork")
    protected int idPersonWork;
    @XmlElement(name = "Id_ExaminationSheetValuesType")
    protected int idExaminationSheetValuesType;
    @XmlElement(name = "DateRun")
    protected String dateRun;
    @XmlElement(name = "TimeDegin")
    protected String timeDegin;
    @XmlElement(name = "TimeEnd")
    protected String timeEnd;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "Id_PersonEducationProgressControlType")
    protected int idPersonEducationProgressControlType;
    @XmlElement(name = "Id_PersonEducationProgressControlCapasity")
    protected int idPersonEducationProgressControlCapasity;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Examinatorts")
    protected String examinatorts;
    @XmlElement(name = "Teachers")
    protected String teachers;
    @XmlElement(name = "ControlValue")
    protected String controlValue;

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
     * Gets the value of the universityDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDateCreate() {
        return universityDateCreate;
    }

    /**
     * Sets the value of the universityDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDateCreate(String value) {
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
     *     {@link String }
     *     
     */
    public String getDateRun() {
        return dateRun;
    }

    /**
     * Sets the value of the dateRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRun(String value) {
        this.dateRun = value;
    }

    /**
     * Gets the value of the timeDegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeDegin() {
        return timeDegin;
    }

    /**
     * Sets the value of the timeDegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeDegin(String value) {
        this.timeDegin = value;
    }

    /**
     * Gets the value of the timeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeEnd() {
        return timeEnd;
    }

    /**
     * Sets the value of the timeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeEnd(String value) {
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
