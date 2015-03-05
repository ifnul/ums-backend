
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
 *         &lt;element name="GraduateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraduateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qalification_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qalification_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "graduateDate",
    "graduateNumber",
    "idAcademicYear",
    "idCourse",
    "qualificationName",
    "qualificationNameEn",
    "documentDateGive",
    "qalificationPrevUK",
    "qalificationPrevEN",
    "specialityPrevUK",
    "specialityPrevEN"
})
@XmlRootElement(name = "GraduatesAdd")
public class GraduatesAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "GraduateDate")
    protected String graduateDate;
    @XmlElement(name = "GraduateNumber")
    protected String graduateNumber;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "QualificationNameEn")
    protected String qualificationNameEn;
    @XmlElement(name = "DocumentDateGive")
    protected String documentDateGive;
    @XmlElement(name = "Qalification_Prev_UK")
    protected String qalificationPrevUK;
    @XmlElement(name = "Qalification_Prev_EN")
    protected String qalificationPrevEN;
    @XmlElement(name = "Speciality_Prev_UK")
    protected String specialityPrevUK;
    @XmlElement(name = "Speciality_Prev_EN")
    protected String specialityPrevEN;

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
     * Gets the value of the graduateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduateDate() {
        return graduateDate;
    }

    /**
     * Sets the value of the graduateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduateDate(String value) {
        this.graduateDate = value;
    }

    /**
     * Gets the value of the graduateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduateNumber() {
        return graduateNumber;
    }

    /**
     * Sets the value of the graduateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduateNumber(String value) {
        this.graduateNumber = value;
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
     * Gets the value of the qualificationNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationNameEn() {
        return qualificationNameEn;
    }

    /**
     * Sets the value of the qualificationNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationNameEn(String value) {
        this.qualificationNameEn = value;
    }

    /**
     * Gets the value of the documentDateGive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDateGive() {
        return documentDateGive;
    }

    /**
     * Sets the value of the documentDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDateGive(String value) {
        this.documentDateGive = value;
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

}
