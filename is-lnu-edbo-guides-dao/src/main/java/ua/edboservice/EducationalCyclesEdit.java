
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
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_CourseBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_CourseEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYearBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYearEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Decryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idEducationalCycles",
    "educationDateBegin",
    "educationDateEnd",
    "educationDuration",
    "idCourseBegin",
    "idCourseEnd",
    "idAcademicYearBegin",
    "idAcademicYearEnd",
    "decryption"
})
@XmlRootElement(name = "EducationalCyclesEdit")
public class EducationalCyclesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "EducationDateBegin")
    protected String educationDateBegin;
    @XmlElement(name = "EducationDateEnd")
    protected String educationDateEnd;
    @XmlElement(name = "EducationDuration")
    protected String educationDuration;
    @XmlElement(name = "Id_CourseBegin")
    protected int idCourseBegin;
    @XmlElement(name = "Id_CourseEnd")
    protected int idCourseEnd;
    @XmlElement(name = "Id_AcademicYearBegin")
    protected int idAcademicYearBegin;
    @XmlElement(name = "Id_AcademicYearEnd")
    protected int idAcademicYearEnd;
    @XmlElement(name = "Decryption")
    protected String decryption;

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
     * Gets the value of the educationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDateBegin() {
        return educationDateBegin;
    }

    /**
     * Sets the value of the educationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDateBegin(String value) {
        this.educationDateBegin = value;
    }

    /**
     * Gets the value of the educationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDateEnd() {
        return educationDateEnd;
    }

    /**
     * Sets the value of the educationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDateEnd(String value) {
        this.educationDateEnd = value;
    }

    /**
     * Gets the value of the educationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDuration() {
        return educationDuration;
    }

    /**
     * Sets the value of the educationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDuration(String value) {
        this.educationDuration = value;
    }

    /**
     * Gets the value of the idCourseBegin property.
     * 
     */
    public int getIdCourseBegin() {
        return idCourseBegin;
    }

    /**
     * Sets the value of the idCourseBegin property.
     * 
     */
    public void setIdCourseBegin(int value) {
        this.idCourseBegin = value;
    }

    /**
     * Gets the value of the idCourseEnd property.
     * 
     */
    public int getIdCourseEnd() {
        return idCourseEnd;
    }

    /**
     * Sets the value of the idCourseEnd property.
     * 
     */
    public void setIdCourseEnd(int value) {
        this.idCourseEnd = value;
    }

    /**
     * Gets the value of the idAcademicYearBegin property.
     * 
     */
    public int getIdAcademicYearBegin() {
        return idAcademicYearBegin;
    }

    /**
     * Sets the value of the idAcademicYearBegin property.
     * 
     */
    public void setIdAcademicYearBegin(int value) {
        this.idAcademicYearBegin = value;
    }

    /**
     * Gets the value of the idAcademicYearEnd property.
     * 
     */
    public int getIdAcademicYearEnd() {
        return idAcademicYearEnd;
    }

    /**
     * Sets the value of the idAcademicYearEnd property.
     * 
     */
    public void setIdAcademicYearEnd(int value) {
        this.idAcademicYearEnd = value;
    }

    /**
     * Gets the value of the decryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryption() {
        return decryption;
    }

    /**
     * Sets the value of the decryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryption(String value) {
        this.decryption = value;
    }

}
