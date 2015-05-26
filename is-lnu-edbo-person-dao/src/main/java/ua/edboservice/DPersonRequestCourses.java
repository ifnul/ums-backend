
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonRequestCourses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestCourses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestCourse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonCourse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestCourseBonus" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DateLastChangePersonRequestCourse" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonsCourseNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestCourses", propOrder = {
    "idPersonRequestCourse",
    "idPersonRequest",
    "idPersonCourse",
    "personRequestCourseBonus",
    "dateLastChangePersonRequestCourse",
    "idPerson",
    "personsCourseNote",
    "universityKode",
    "universityCourseCode",
    "universityCourseName"
})
public class DPersonRequestCourses {

    @XmlElement(name = "Id_PersonRequestCourse")
    protected int idPersonRequestCourse;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_PersonCourse")
    protected int idPersonCourse;
    @XmlElement(name = "PersonRequestCourseBonus", required = true)
    protected BigDecimal personRequestCourseBonus;
    @XmlElement(name = "DateLastChangePersonRequestCourse", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChangePersonRequestCourse;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "PersonsCourseNote")
    protected String personsCourseNote;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityCourseCode")
    protected String universityCourseCode;
    @XmlElement(name = "UniversityCourseName")
    protected String universityCourseName;

    /**
     * Gets the value of the idPersonRequestCourse property.
     * 
     */
    public int getIdPersonRequestCourse() {
        return idPersonRequestCourse;
    }

    /**
     * Sets the value of the idPersonRequestCourse property.
     * 
     */
    public void setIdPersonRequestCourse(int value) {
        this.idPersonRequestCourse = value;
    }

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

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
     * Gets the value of the personRequestCourseBonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPersonRequestCourseBonus() {
        return personRequestCourseBonus;
    }

    /**
     * Sets the value of the personRequestCourseBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPersonRequestCourseBonus(BigDecimal value) {
        this.personRequestCourseBonus = value;
    }

    /**
     * Gets the value of the dateLastChangePersonRequestCourse property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChangePersonRequestCourse() {
        return dateLastChangePersonRequestCourse;
    }

    /**
     * Sets the value of the dateLastChangePersonRequestCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChangePersonRequestCourse(XMLGregorianCalendar value) {
        this.dateLastChangePersonRequestCourse = value;
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

}
