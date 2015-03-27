
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
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfessionCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecProfessions1RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions2RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions3RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions4RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions5RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfession1_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession2_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession3_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession4_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession5_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_CourseBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_CourseEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYearBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYearEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Decryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EducationalCyclesPattern" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearShift" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "specCode",
    "universityFacultetKode",
    "idQualification",
    "idPersonEducationForm",
    "specProfessionCode1",
    "specProfessionCode2",
    "specProfessionCode3",
    "specProfessionCode4",
    "specProfessionCode5",
    "idSpecProfessions1RangType",
    "idSpecProfessions2RangType",
    "idSpecProfessions3RangType",
    "idSpecProfessions4RangType",
    "idSpecProfessions5RangType",
    "specProfession1MaxRang",
    "specProfession2MaxRang",
    "specProfession3MaxRang",
    "specProfession4MaxRang",
    "specProfession5MaxRang",
    "educationDateBegin",
    "educationDateEnd",
    "educationDuration",
    "idCourseBegin",
    "idCourseEnd",
    "idAcademicYearBegin",
    "idAcademicYearEnd",
    "decryption",
    "idEducationalCyclesPattern",
    "yearShift"
})
@XmlRootElement(name = "EducationalCyclesAdd")
public class EducationalCyclesAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "SpecProfessionCode1")
    protected String specProfessionCode1;
    @XmlElement(name = "SpecProfessionCode2")
    protected String specProfessionCode2;
    @XmlElement(name = "SpecProfessionCode3")
    protected String specProfessionCode3;
    @XmlElement(name = "SpecProfessionCode4")
    protected String specProfessionCode4;
    @XmlElement(name = "SpecProfessionCode5")
    protected String specProfessionCode5;
    @XmlElement(name = "Id_SpecProfessions1RangType")
    protected int idSpecProfessions1RangType;
    @XmlElement(name = "Id_SpecProfessions2RangType")
    protected int idSpecProfessions2RangType;
    @XmlElement(name = "Id_SpecProfessions3RangType")
    protected int idSpecProfessions3RangType;
    @XmlElement(name = "Id_SpecProfessions4RangType")
    protected int idSpecProfessions4RangType;
    @XmlElement(name = "Id_SpecProfessions5RangType")
    protected int idSpecProfessions5RangType;
    @XmlElement(name = "SpecProfession1_MaxRang")
    protected String specProfession1MaxRang;
    @XmlElement(name = "SpecProfession2_MaxRang")
    protected String specProfession2MaxRang;
    @XmlElement(name = "SpecProfession3_MaxRang")
    protected String specProfession3MaxRang;
    @XmlElement(name = "SpecProfession4_MaxRang")
    protected String specProfession4MaxRang;
    @XmlElement(name = "SpecProfession5_MaxRang")
    protected String specProfession5MaxRang;
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
    @XmlElement(name = "Id_EducationalCyclesPattern")
    protected int idEducationalCyclesPattern;
    @XmlElement(name = "YearShift")
    protected int yearShift;

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
     * Gets the value of the specProfessionCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode1() {
        return specProfessionCode1;
    }

    /**
     * Sets the value of the specProfessionCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode1(String value) {
        this.specProfessionCode1 = value;
    }

    /**
     * Gets the value of the specProfessionCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode2() {
        return specProfessionCode2;
    }

    /**
     * Sets the value of the specProfessionCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode2(String value) {
        this.specProfessionCode2 = value;
    }

    /**
     * Gets the value of the specProfessionCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode3() {
        return specProfessionCode3;
    }

    /**
     * Sets the value of the specProfessionCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode3(String value) {
        this.specProfessionCode3 = value;
    }

    /**
     * Gets the value of the specProfessionCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode4() {
        return specProfessionCode4;
    }

    /**
     * Sets the value of the specProfessionCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode4(String value) {
        this.specProfessionCode4 = value;
    }

    /**
     * Gets the value of the specProfessionCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode5() {
        return specProfessionCode5;
    }

    /**
     * Sets the value of the specProfessionCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode5(String value) {
        this.specProfessionCode5 = value;
    }

    /**
     * Gets the value of the idSpecProfessions1RangType property.
     * 
     */
    public int getIdSpecProfessions1RangType() {
        return idSpecProfessions1RangType;
    }

    /**
     * Sets the value of the idSpecProfessions1RangType property.
     * 
     */
    public void setIdSpecProfessions1RangType(int value) {
        this.idSpecProfessions1RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions2RangType property.
     * 
     */
    public int getIdSpecProfessions2RangType() {
        return idSpecProfessions2RangType;
    }

    /**
     * Sets the value of the idSpecProfessions2RangType property.
     * 
     */
    public void setIdSpecProfessions2RangType(int value) {
        this.idSpecProfessions2RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions3RangType property.
     * 
     */
    public int getIdSpecProfessions3RangType() {
        return idSpecProfessions3RangType;
    }

    /**
     * Sets the value of the idSpecProfessions3RangType property.
     * 
     */
    public void setIdSpecProfessions3RangType(int value) {
        this.idSpecProfessions3RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions4RangType property.
     * 
     */
    public int getIdSpecProfessions4RangType() {
        return idSpecProfessions4RangType;
    }

    /**
     * Sets the value of the idSpecProfessions4RangType property.
     * 
     */
    public void setIdSpecProfessions4RangType(int value) {
        this.idSpecProfessions4RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions5RangType property.
     * 
     */
    public int getIdSpecProfessions5RangType() {
        return idSpecProfessions5RangType;
    }

    /**
     * Sets the value of the idSpecProfessions5RangType property.
     * 
     */
    public void setIdSpecProfessions5RangType(int value) {
        this.idSpecProfessions5RangType = value;
    }

    /**
     * Gets the value of the specProfession1MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession1MaxRang() {
        return specProfession1MaxRang;
    }

    /**
     * Sets the value of the specProfession1MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession1MaxRang(String value) {
        this.specProfession1MaxRang = value;
    }

    /**
     * Gets the value of the specProfession2MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession2MaxRang() {
        return specProfession2MaxRang;
    }

    /**
     * Sets the value of the specProfession2MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession2MaxRang(String value) {
        this.specProfession2MaxRang = value;
    }

    /**
     * Gets the value of the specProfession3MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession3MaxRang() {
        return specProfession3MaxRang;
    }

    /**
     * Sets the value of the specProfession3MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession3MaxRang(String value) {
        this.specProfession3MaxRang = value;
    }

    /**
     * Gets the value of the specProfession4MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession4MaxRang() {
        return specProfession4MaxRang;
    }

    /**
     * Sets the value of the specProfession4MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession4MaxRang(String value) {
        this.specProfession4MaxRang = value;
    }

    /**
     * Gets the value of the specProfession5MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession5MaxRang() {
        return specProfession5MaxRang;
    }

    /**
     * Sets the value of the specProfession5MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession5MaxRang(String value) {
        this.specProfession5MaxRang = value;
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

    /**
     * Gets the value of the idEducationalCyclesPattern property.
     * 
     */
    public int getIdEducationalCyclesPattern() {
        return idEducationalCyclesPattern;
    }

    /**
     * Sets the value of the idEducationalCyclesPattern property.
     * 
     */
    public void setIdEducationalCyclesPattern(int value) {
        this.idEducationalCyclesPattern = value;
    }

    /**
     * Gets the value of the yearShift property.
     * 
     */
    public int getYearShift() {
        return yearShift;
    }

    /**
     * Sets the value of the yearShift property.
     * 
     */
    public void setYearShift(int value) {
        this.yearShift = value;
    }

}
