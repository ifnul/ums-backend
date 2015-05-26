
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
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idLanguage",
    "universityKode",
    "universityFacultetKode",
    "universityGroupFullName",
    "universityGroupShortName",
    "universityGroupDescription",
    "idAcademicYear",
    "idCourse",
    "idPersonEducationForm",
    "specCode",
    "universityGroupCode",
    "idQualification",
    "idQualificationGroup"
})
@XmlRootElement(name = "UniversityGroupsAdd")
public class UniversityGroupsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
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
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "UniversityGroupCode")
    protected String universityGroupCode;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;

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
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
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
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

}
