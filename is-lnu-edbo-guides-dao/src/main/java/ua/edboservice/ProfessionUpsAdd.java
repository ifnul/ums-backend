
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
 *         &lt;element name="PersonEducationHistoryOrdersNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryOrdersDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationHistoryOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Qualification_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfessionCode_prof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession_CurRang_prof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession_NextRang_prof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecProfessionsRangType_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode_prof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGroup_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessionsRangType_Next_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationHistoryOrdersNumber",
    "personEducationHistoryOrdersDate",
    "universityKode",
    "idPersonEducationHistoryOrders",
    "idAcademicYear",
    "idQualificationProf",
    "idPersonEducationFormProf",
    "idCourseProf",
    "specProfessionCodeProf",
    "specProfessionCurRangProf",
    "specProfessionNextRangProf",
    "idSpecProfessionsRangTypeProf",
    "universityFacultetKodeProf",
    "idUniversityGroupProf",
    "idSpecProfessionsRangTypeNextProf"
})
@XmlRootElement(name = "ProfessionUpsAdd")
public class ProfessionUpsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "PersonEducationHistoryOrdersNumber")
    protected String personEducationHistoryOrdersNumber;
    @XmlElement(name = "PersonEducationHistoryOrdersDate")
    protected String personEducationHistoryOrdersDate;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_PersonEducationHistoryOrders")
    protected int idPersonEducationHistoryOrders;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_Qualification_prof")
    protected int idQualificationProf;
    @XmlElement(name = "Id_PersonEducationForm_prof")
    protected int idPersonEducationFormProf;
    @XmlElement(name = "Id_Course_prof")
    protected int idCourseProf;
    @XmlElement(name = "SpecProfessionCode_prof")
    protected String specProfessionCodeProf;
    @XmlElement(name = "SpecProfession_CurRang_prof")
    protected String specProfessionCurRangProf;
    @XmlElement(name = "SpecProfession_NextRang_prof")
    protected String specProfessionNextRangProf;
    @XmlElement(name = "Id_SpecProfessionsRangType_prof")
    protected int idSpecProfessionsRangTypeProf;
    @XmlElement(name = "UniversityFacultetKode_prof")
    protected String universityFacultetKodeProf;
    @XmlElement(name = "Id_UniversityGroup_prof")
    protected int idUniversityGroupProf;
    @XmlElement(name = "Id_SpecProfessionsRangType_Next_prof")
    protected int idSpecProfessionsRangTypeNextProf;

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
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryOrdersDate() {
        return personEducationHistoryOrdersDate;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryOrdersDate(String value) {
        this.personEducationHistoryOrdersDate = value;
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
     * Gets the value of the idQualificationProf property.
     * 
     */
    public int getIdQualificationProf() {
        return idQualificationProf;
    }

    /**
     * Sets the value of the idQualificationProf property.
     * 
     */
    public void setIdQualificationProf(int value) {
        this.idQualificationProf = value;
    }

    /**
     * Gets the value of the idPersonEducationFormProf property.
     * 
     */
    public int getIdPersonEducationFormProf() {
        return idPersonEducationFormProf;
    }

    /**
     * Sets the value of the idPersonEducationFormProf property.
     * 
     */
    public void setIdPersonEducationFormProf(int value) {
        this.idPersonEducationFormProf = value;
    }

    /**
     * Gets the value of the idCourseProf property.
     * 
     */
    public int getIdCourseProf() {
        return idCourseProf;
    }

    /**
     * Sets the value of the idCourseProf property.
     * 
     */
    public void setIdCourseProf(int value) {
        this.idCourseProf = value;
    }

    /**
     * Gets the value of the specProfessionCodeProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCodeProf() {
        return specProfessionCodeProf;
    }

    /**
     * Sets the value of the specProfessionCodeProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCodeProf(String value) {
        this.specProfessionCodeProf = value;
    }

    /**
     * Gets the value of the specProfessionCurRangProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCurRangProf() {
        return specProfessionCurRangProf;
    }

    /**
     * Sets the value of the specProfessionCurRangProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCurRangProf(String value) {
        this.specProfessionCurRangProf = value;
    }

    /**
     * Gets the value of the specProfessionNextRangProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionNextRangProf() {
        return specProfessionNextRangProf;
    }

    /**
     * Sets the value of the specProfessionNextRangProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionNextRangProf(String value) {
        this.specProfessionNextRangProf = value;
    }

    /**
     * Gets the value of the idSpecProfessionsRangTypeProf property.
     * 
     */
    public int getIdSpecProfessionsRangTypeProf() {
        return idSpecProfessionsRangTypeProf;
    }

    /**
     * Sets the value of the idSpecProfessionsRangTypeProf property.
     * 
     */
    public void setIdSpecProfessionsRangTypeProf(int value) {
        this.idSpecProfessionsRangTypeProf = value;
    }

    /**
     * Gets the value of the universityFacultetKodeProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKodeProf() {
        return universityFacultetKodeProf;
    }

    /**
     * Sets the value of the universityFacultetKodeProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKodeProf(String value) {
        this.universityFacultetKodeProf = value;
    }

    /**
     * Gets the value of the idUniversityGroupProf property.
     * 
     */
    public int getIdUniversityGroupProf() {
        return idUniversityGroupProf;
    }

    /**
     * Sets the value of the idUniversityGroupProf property.
     * 
     */
    public void setIdUniversityGroupProf(int value) {
        this.idUniversityGroupProf = value;
    }

    /**
     * Gets the value of the idSpecProfessionsRangTypeNextProf property.
     * 
     */
    public int getIdSpecProfessionsRangTypeNextProf() {
        return idSpecProfessionsRangTypeNextProf;
    }

    /**
     * Sets the value of the idSpecProfessionsRangTypeNextProf property.
     * 
     */
    public void setIdSpecProfessionsRangTypeNextProf(int value) {
        this.idSpecProfessionsRangTypeNextProf = value;
    }

}
