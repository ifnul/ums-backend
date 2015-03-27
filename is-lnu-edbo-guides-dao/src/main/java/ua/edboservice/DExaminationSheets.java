
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dExaminationSheets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dExaminationSheets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ExaminationSheet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheetExamenType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheeValuesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheetStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitySpecialitiesSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExaminationSheetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExaminationSheetGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetStreemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetExaminer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExaminationSheetDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExaminationSheetExamenTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetValuesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DurationEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsSecondEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_LanguageEx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LanguageExName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dExaminationSheets", propOrder = {
    "idExaminationSheet",
    "idPersonRequestSeasons",
    "idExaminationSheetExamenType",
    "idExaminationSheeValuesType",
    "idExaminationSheetStatus",
    "idUniversitySpecialitiesSubject",
    "universityKode",
    "universitySpecialitiesKode",
    "examinationSheetDate",
    "examinationSheetNumber",
    "examinationSheetDateLastChange",
    "examinationSheetGroupName",
    "examinationSheetStreemName",
    "examinationSheetExaminer",
    "examinationSheetDateBegin",
    "examinationSheetDateEnd",
    "examinationSheetExamenTypeName",
    "examinationSheetValuesTypeName",
    "examinationSheetStatusName",
    "idSubject",
    "subjectName",
    "universitySpecialitiesSubjectsName",
    "universitySpecialitiesSubjectsDescription",
    "personEducationFormName",
    "idCourse",
    "durationEducation",
    "courseName",
    "educationDateBegin",
    "educationDateEnd",
    "isSecondEducation",
    "idQualification",
    "qualificationName",
    "specClasifierCode",
    "specDirectionName",
    "specSpecialityClasifierCode",
    "specSpecialityName",
    "specScecializationName",
    "universityFacultetFullName",
    "idLanguageEx",
    "languageExName"
})
public class DExaminationSheets {

    @XmlElement(name = "Id_ExaminationSheet")
    protected int idExaminationSheet;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "Id_ExaminationSheetExamenType")
    protected int idExaminationSheetExamenType;
    @XmlElement(name = "Id_ExaminationSheeValuesType")
    protected int idExaminationSheeValuesType;
    @XmlElement(name = "Id_ExaminationSheetStatus")
    protected int idExaminationSheetStatus;
    @XmlElement(name = "Id_UniversitySpecialitiesSubject")
    protected int idUniversitySpecialitiesSubject;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "ExaminationSheetDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar examinationSheetDate;
    @XmlElement(name = "ExaminationSheetNumber")
    protected String examinationSheetNumber;
    @XmlElement(name = "ExaminationSheetDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar examinationSheetDateLastChange;
    @XmlElement(name = "ExaminationSheetGroupName")
    protected String examinationSheetGroupName;
    @XmlElement(name = "ExaminationSheetStreemName")
    protected String examinationSheetStreemName;
    @XmlElement(name = "ExaminationSheetExaminer")
    protected String examinationSheetExaminer;
    @XmlElement(name = "ExaminationSheetDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar examinationSheetDateBegin;
    @XmlElement(name = "ExaminationSheetDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar examinationSheetDateEnd;
    @XmlElement(name = "ExaminationSheetExamenTypeName")
    protected String examinationSheetExamenTypeName;
    @XmlElement(name = "ExaminationSheetValuesTypeName")
    protected String examinationSheetValuesTypeName;
    @XmlElement(name = "ExaminationSheetStatusName")
    protected String examinationSheetStatusName;
    @XmlElement(name = "Id_Subject")
    protected int idSubject;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "UniversitySpecialitiesSubjectsName")
    protected String universitySpecialitiesSubjectsName;
    @XmlElement(name = "UniversitySpecialitiesSubjectsDescription")
    protected String universitySpecialitiesSubjectsDescription;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "DurationEducation")
    protected String durationEducation;
    @XmlElement(name = "CourseName")
    protected String courseName;
    @XmlElement(name = "EducationDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDateBegin;
    @XmlElement(name = "EducationDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDateEnd;
    @XmlElement(name = "IsSecondEducation")
    protected int isSecondEducation;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
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
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "Id_LanguageEx")
    protected int idLanguageEx;
    @XmlElement(name = "LanguageExName")
    protected String languageExName;

    /**
     * Gets the value of the idExaminationSheet property.
     * 
     */
    public int getIdExaminationSheet() {
        return idExaminationSheet;
    }

    /**
     * Sets the value of the idExaminationSheet property.
     * 
     */
    public void setIdExaminationSheet(int value) {
        this.idExaminationSheet = value;
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
     * Gets the value of the idExaminationSheetExamenType property.
     * 
     */
    public int getIdExaminationSheetExamenType() {
        return idExaminationSheetExamenType;
    }

    /**
     * Sets the value of the idExaminationSheetExamenType property.
     * 
     */
    public void setIdExaminationSheetExamenType(int value) {
        this.idExaminationSheetExamenType = value;
    }

    /**
     * Gets the value of the idExaminationSheeValuesType property.
     * 
     */
    public int getIdExaminationSheeValuesType() {
        return idExaminationSheeValuesType;
    }

    /**
     * Sets the value of the idExaminationSheeValuesType property.
     * 
     */
    public void setIdExaminationSheeValuesType(int value) {
        this.idExaminationSheeValuesType = value;
    }

    /**
     * Gets the value of the idExaminationSheetStatus property.
     * 
     */
    public int getIdExaminationSheetStatus() {
        return idExaminationSheetStatus;
    }

    /**
     * Sets the value of the idExaminationSheetStatus property.
     * 
     */
    public void setIdExaminationSheetStatus(int value) {
        this.idExaminationSheetStatus = value;
    }

    /**
     * Gets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public int getIdUniversitySpecialitiesSubject() {
        return idUniversitySpecialitiesSubject;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public void setIdUniversitySpecialitiesSubject(int value) {
        this.idUniversitySpecialitiesSubject = value;
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
     * Gets the value of the universitySpecialitiesKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKode() {
        return universitySpecialitiesKode;
    }

    /**
     * Sets the value of the universitySpecialitiesKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKode(String value) {
        this.universitySpecialitiesKode = value;
    }

    /**
     * Gets the value of the examinationSheetDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExaminationSheetDate() {
        return examinationSheetDate;
    }

    /**
     * Sets the value of the examinationSheetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExaminationSheetDate(XMLGregorianCalendar value) {
        this.examinationSheetDate = value;
    }

    /**
     * Gets the value of the examinationSheetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetNumber() {
        return examinationSheetNumber;
    }

    /**
     * Sets the value of the examinationSheetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetNumber(String value) {
        this.examinationSheetNumber = value;
    }

    /**
     * Gets the value of the examinationSheetDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExaminationSheetDateLastChange() {
        return examinationSheetDateLastChange;
    }

    /**
     * Sets the value of the examinationSheetDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExaminationSheetDateLastChange(XMLGregorianCalendar value) {
        this.examinationSheetDateLastChange = value;
    }

    /**
     * Gets the value of the examinationSheetGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetGroupName() {
        return examinationSheetGroupName;
    }

    /**
     * Sets the value of the examinationSheetGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetGroupName(String value) {
        this.examinationSheetGroupName = value;
    }

    /**
     * Gets the value of the examinationSheetStreemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetStreemName() {
        return examinationSheetStreemName;
    }

    /**
     * Sets the value of the examinationSheetStreemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetStreemName(String value) {
        this.examinationSheetStreemName = value;
    }

    /**
     * Gets the value of the examinationSheetExaminer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetExaminer() {
        return examinationSheetExaminer;
    }

    /**
     * Sets the value of the examinationSheetExaminer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetExaminer(String value) {
        this.examinationSheetExaminer = value;
    }

    /**
     * Gets the value of the examinationSheetDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExaminationSheetDateBegin() {
        return examinationSheetDateBegin;
    }

    /**
     * Sets the value of the examinationSheetDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExaminationSheetDateBegin(XMLGregorianCalendar value) {
        this.examinationSheetDateBegin = value;
    }

    /**
     * Gets the value of the examinationSheetDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExaminationSheetDateEnd() {
        return examinationSheetDateEnd;
    }

    /**
     * Sets the value of the examinationSheetDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExaminationSheetDateEnd(XMLGregorianCalendar value) {
        this.examinationSheetDateEnd = value;
    }

    /**
     * Gets the value of the examinationSheetExamenTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetExamenTypeName() {
        return examinationSheetExamenTypeName;
    }

    /**
     * Sets the value of the examinationSheetExamenTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetExamenTypeName(String value) {
        this.examinationSheetExamenTypeName = value;
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
     * Gets the value of the examinationSheetStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetStatusName() {
        return examinationSheetStatusName;
    }

    /**
     * Sets the value of the examinationSheetStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetStatusName(String value) {
        this.examinationSheetStatusName = value;
    }

    /**
     * Gets the value of the idSubject property.
     * 
     */
    public int getIdSubject() {
        return idSubject;
    }

    /**
     * Sets the value of the idSubject property.
     * 
     */
    public void setIdSubject(int value) {
        this.idSubject = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsName() {
        return universitySpecialitiesSubjectsName;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsName(String value) {
        this.universitySpecialitiesSubjectsName = value;
    }

    /**
     * Gets the value of the universitySpecialitiesSubjectsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsDescription() {
        return universitySpecialitiesSubjectsDescription;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsDescription(String value) {
        this.universitySpecialitiesSubjectsDescription = value;
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
     * Gets the value of the durationEducation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationEducation() {
        return durationEducation;
    }

    /**
     * Sets the value of the durationEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationEducation(String value) {
        this.durationEducation = value;
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
     * Gets the value of the isSecondEducation property.
     * 
     */
    public int getIsSecondEducation() {
        return isSecondEducation;
    }

    /**
     * Sets the value of the isSecondEducation property.
     * 
     */
    public void setIsSecondEducation(int value) {
        this.isSecondEducation = value;
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
     * Gets the value of the idLanguageEx property.
     * 
     */
    public int getIdLanguageEx() {
        return idLanguageEx;
    }

    /**
     * Sets the value of the idLanguageEx property.
     * 
     */
    public void setIdLanguageEx(int value) {
        this.idLanguageEx = value;
    }

    /**
     * Gets the value of the languageExName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageExName() {
        return languageExName;
    }

    /**
     * Sets the value of the languageExName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageExName(String value) {
        this.languageExName = value;
    }

}
