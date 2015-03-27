
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonCourses2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonCourses2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonCourse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestSeasonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonsCourseNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UniversityCoursesStudentData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityCoursesStudent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCoursesValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UniversityCoursesStudentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonCourses2", propOrder = {
    "idPersonCourse",
    "idPerson",
    "universityCourseCode",
    "universityCourseName",
    "idSubject",
    "subjectName",
    "idPersonRequestSeasons",
    "personRequestSeasonName",
    "personsCourseNote",
    "dateLastChange",
    "idUniversityCoursesStudentData",
    "idUniversityCoursesStudent",
    "universityCoursesValue",
    "universityCoursesStudentName",
    "idUniversity",
    "universityFullName"
})
public class DPersonCourses2 {

    @XmlElement(name = "Id_PersonCourse")
    protected int idPersonCourse;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "UniversityCourseCode")
    protected String universityCourseCode;
    @XmlElement(name = "UniversityCourseName")
    protected String universityCourseName;
    @XmlElement(name = "Id_Subject")
    protected int idSubject;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "PersonRequestSeasonName")
    protected String personRequestSeasonName;
    @XmlElement(name = "PersonsCourseNote")
    protected String personsCourseNote;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_UniversityCoursesStudentData")
    protected int idUniversityCoursesStudentData;
    @XmlElement(name = "Id_UniversityCoursesStudent")
    protected int idUniversityCoursesStudent;
    @XmlElement(name = "UniversityCoursesValue", required = true)
    protected BigDecimal universityCoursesValue;
    @XmlElement(name = "UniversityCoursesStudentName")
    protected String universityCoursesStudentName;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;

    /**
     * Gets the value of the idPersonCourse property.
     * 
     */
    public int getIdPersonCourse() {
        return idPersonCourse;
    }

    /**
     * Sets the value of the idPersonCourse property.
     * 
     */
    public void setIdPersonCourse(int value) {
        this.idPersonCourse = value;
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
     * Gets the value of the universityCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCourseCode() {
        return universityCourseCode;
    }

    /**
     * Sets the value of the universityCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCourseCode(String value) {
        this.universityCourseCode = value;
    }

    /**
     * Gets the value of the universityCourseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCourseName() {
        return universityCourseName;
    }

    /**
     * Sets the value of the universityCourseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCourseName(String value) {
        this.universityCourseName = value;
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
     * Gets the value of the personRequestSeasonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestSeasonName() {
        return personRequestSeasonName;
    }

    /**
     * Sets the value of the personRequestSeasonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestSeasonName(String value) {
        this.personRequestSeasonName = value;
    }

    /**
     * Gets the value of the personsCourseNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonsCourseNote() {
        return personsCourseNote;
    }

    /**
     * Sets the value of the personsCourseNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonsCourseNote(String value) {
        this.personsCourseNote = value;
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
     * Gets the value of the idUniversityCoursesStudentData property.
     * 
     */
    public int getIdUniversityCoursesStudentData() {
        return idUniversityCoursesStudentData;
    }

    /**
     * Sets the value of the idUniversityCoursesStudentData property.
     * 
     */
    public void setIdUniversityCoursesStudentData(int value) {
        this.idUniversityCoursesStudentData = value;
    }

    /**
     * Gets the value of the idUniversityCoursesStudent property.
     * 
     */
    public int getIdUniversityCoursesStudent() {
        return idUniversityCoursesStudent;
    }

    /**
     * Sets the value of the idUniversityCoursesStudent property.
     * 
     */
    public void setIdUniversityCoursesStudent(int value) {
        this.idUniversityCoursesStudent = value;
    }

    /**
     * Gets the value of the universityCoursesValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUniversityCoursesValue() {
        return universityCoursesValue;
    }

    /**
     * Sets the value of the universityCoursesValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUniversityCoursesValue(BigDecimal value) {
        this.universityCoursesValue = value;
    }

    /**
     * Gets the value of the universityCoursesStudentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCoursesStudentName() {
        return universityCoursesStudentName;
    }

    /**
     * Sets the value of the universityCoursesStudentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCoursesStudentName(String value) {
        this.universityCoursesStudentName = value;
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

}
