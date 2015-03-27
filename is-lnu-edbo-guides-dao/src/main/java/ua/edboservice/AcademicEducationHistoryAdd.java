
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
 *         &lt;element name="AcademicEducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationPaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU_Boss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationTitleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationDegreType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationHistoryDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationCancelationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationHistoryAcademicLeaveType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationHistory_From" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicLeaveDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "academicEducationDateBegin",
    "academicEducationDateEnd",
    "academicEducationDuration",
    "personCodeU",
    "idPersonDocument",
    "idPersonEducationForm",
    "idPersonEducationPaymentType",
    "idPersonRequestSeasons",
    "idAcademicEducationOrders",
    "scienceSpecialityCode",
    "personCodeUBoss",
    "universityFacultetKode",
    "academicEducationHistoryDescription",
    "academicEducationTitleName",
    "idAcademicEducationHistoryType",
    "idAcademicEducationForm",
    "idAcademicEducationDegreType",
    "academicEducationHistoryDateBegin",
    "idAcademicEducationCancelationType",
    "idAcademicEducation",
    "idAcademicEducationHistoryAcademicLeaveType",
    "yearNumber",
    "idAcademicYear",
    "idAcademicEducationHistoryFrom",
    "universityKodeFrom",
    "academicLeaveDateEnd"
})
@XmlRootElement(name = "AcademicEducationHistoryAdd")
public class AcademicEducationHistoryAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "AcademicEducationDateBegin")
    protected String academicEducationDateBegin;
    @XmlElement(name = "AcademicEducationDateEnd")
    protected String academicEducationDateEnd;
    @XmlElement(name = "AcademicEducationDuration")
    protected String academicEducationDuration;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "Id_PersonEducationPaymentType")
    protected int idPersonEducationPaymentType;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "Id_AcademicEducationOrders")
    protected int idAcademicEducationOrders;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "PersonCodeU_Boss")
    protected String personCodeUBoss;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "AcademicEducationHistoryDescription")
    protected String academicEducationHistoryDescription;
    @XmlElement(name = "AcademicEducationTitleName")
    protected String academicEducationTitleName;
    @XmlElement(name = "Id_AcademicEducationHistoryType")
    protected int idAcademicEducationHistoryType;
    @XmlElement(name = "Id_AcademicEducationForm")
    protected int idAcademicEducationForm;
    @XmlElement(name = "Id_AcademicEducationDegreType")
    protected int idAcademicEducationDegreType;
    @XmlElement(name = "AcademicEducationHistoryDateBegin")
    protected String academicEducationHistoryDateBegin;
    @XmlElement(name = "Id_AcademicEducationCancelationType")
    protected int idAcademicEducationCancelationType;
    @XmlElement(name = "Id_AcademicEducation")
    protected int idAcademicEducation;
    @XmlElement(name = "Id_AcademicEducationHistoryAcademicLeaveType")
    protected int idAcademicEducationHistoryAcademicLeaveType;
    @XmlElement(name = "YearNumber")
    protected int yearNumber;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_AcademicEducationHistory_From")
    protected int idAcademicEducationHistoryFrom;
    @XmlElement(name = "UniversityKodeFrom")
    protected String universityKodeFrom;
    @XmlElement(name = "AcademicLeaveDateEnd")
    protected String academicLeaveDateEnd;

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
     * Gets the value of the academicEducationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDateBegin() {
        return academicEducationDateBegin;
    }

    /**
     * Sets the value of the academicEducationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDateBegin(String value) {
        this.academicEducationDateBegin = value;
    }

    /**
     * Gets the value of the academicEducationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDateEnd() {
        return academicEducationDateEnd;
    }

    /**
     * Sets the value of the academicEducationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDateEnd(String value) {
        this.academicEducationDateEnd = value;
    }

    /**
     * Gets the value of the academicEducationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDuration() {
        return academicEducationDuration;
    }

    /**
     * Sets the value of the academicEducationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDuration(String value) {
        this.academicEducationDuration = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the idPersonDocument property.
     * 
     */
    public int getIdPersonDocument() {
        return idPersonDocument;
    }

    /**
     * Sets the value of the idPersonDocument property.
     * 
     */
    public void setIdPersonDocument(int value) {
        this.idPersonDocument = value;
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
     * Gets the value of the idPersonEducationPaymentType property.
     * 
     */
    public int getIdPersonEducationPaymentType() {
        return idPersonEducationPaymentType;
    }

    /**
     * Sets the value of the idPersonEducationPaymentType property.
     * 
     */
    public void setIdPersonEducationPaymentType(int value) {
        this.idPersonEducationPaymentType = value;
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
     * Gets the value of the idAcademicEducationOrders property.
     * 
     */
    public int getIdAcademicEducationOrders() {
        return idAcademicEducationOrders;
    }

    /**
     * Sets the value of the idAcademicEducationOrders property.
     * 
     */
    public void setIdAcademicEducationOrders(int value) {
        this.idAcademicEducationOrders = value;
    }

    /**
     * Gets the value of the scienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityCode() {
        return scienceSpecialityCode;
    }

    /**
     * Sets the value of the scienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityCode(String value) {
        this.scienceSpecialityCode = value;
    }

    /**
     * Gets the value of the personCodeUBoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeUBoss() {
        return personCodeUBoss;
    }

    /**
     * Sets the value of the personCodeUBoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeUBoss(String value) {
        this.personCodeUBoss = value;
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
     * Gets the value of the academicEducationHistoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationHistoryDescription() {
        return academicEducationHistoryDescription;
    }

    /**
     * Sets the value of the academicEducationHistoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationHistoryDescription(String value) {
        this.academicEducationHistoryDescription = value;
    }

    /**
     * Gets the value of the academicEducationTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationTitleName() {
        return academicEducationTitleName;
    }

    /**
     * Sets the value of the academicEducationTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationTitleName(String value) {
        this.academicEducationTitleName = value;
    }

    /**
     * Gets the value of the idAcademicEducationHistoryType property.
     * 
     */
    public int getIdAcademicEducationHistoryType() {
        return idAcademicEducationHistoryType;
    }

    /**
     * Sets the value of the idAcademicEducationHistoryType property.
     * 
     */
    public void setIdAcademicEducationHistoryType(int value) {
        this.idAcademicEducationHistoryType = value;
    }

    /**
     * Gets the value of the idAcademicEducationForm property.
     * 
     */
    public int getIdAcademicEducationForm() {
        return idAcademicEducationForm;
    }

    /**
     * Sets the value of the idAcademicEducationForm property.
     * 
     */
    public void setIdAcademicEducationForm(int value) {
        this.idAcademicEducationForm = value;
    }

    /**
     * Gets the value of the idAcademicEducationDegreType property.
     * 
     */
    public int getIdAcademicEducationDegreType() {
        return idAcademicEducationDegreType;
    }

    /**
     * Sets the value of the idAcademicEducationDegreType property.
     * 
     */
    public void setIdAcademicEducationDegreType(int value) {
        this.idAcademicEducationDegreType = value;
    }

    /**
     * Gets the value of the academicEducationHistoryDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationHistoryDateBegin() {
        return academicEducationHistoryDateBegin;
    }

    /**
     * Sets the value of the academicEducationHistoryDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationHistoryDateBegin(String value) {
        this.academicEducationHistoryDateBegin = value;
    }

    /**
     * Gets the value of the idAcademicEducationCancelationType property.
     * 
     */
    public int getIdAcademicEducationCancelationType() {
        return idAcademicEducationCancelationType;
    }

    /**
     * Sets the value of the idAcademicEducationCancelationType property.
     * 
     */
    public void setIdAcademicEducationCancelationType(int value) {
        this.idAcademicEducationCancelationType = value;
    }

    /**
     * Gets the value of the idAcademicEducation property.
     * 
     */
    public int getIdAcademicEducation() {
        return idAcademicEducation;
    }

    /**
     * Sets the value of the idAcademicEducation property.
     * 
     */
    public void setIdAcademicEducation(int value) {
        this.idAcademicEducation = value;
    }

    /**
     * Gets the value of the idAcademicEducationHistoryAcademicLeaveType property.
     * 
     */
    public int getIdAcademicEducationHistoryAcademicLeaveType() {
        return idAcademicEducationHistoryAcademicLeaveType;
    }

    /**
     * Sets the value of the idAcademicEducationHistoryAcademicLeaveType property.
     * 
     */
    public void setIdAcademicEducationHistoryAcademicLeaveType(int value) {
        this.idAcademicEducationHistoryAcademicLeaveType = value;
    }

    /**
     * Gets the value of the yearNumber property.
     * 
     */
    public int getYearNumber() {
        return yearNumber;
    }

    /**
     * Sets the value of the yearNumber property.
     * 
     */
    public void setYearNumber(int value) {
        this.yearNumber = value;
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
     * Gets the value of the idAcademicEducationHistoryFrom property.
     * 
     */
    public int getIdAcademicEducationHistoryFrom() {
        return idAcademicEducationHistoryFrom;
    }

    /**
     * Sets the value of the idAcademicEducationHistoryFrom property.
     * 
     */
    public void setIdAcademicEducationHistoryFrom(int value) {
        this.idAcademicEducationHistoryFrom = value;
    }

    /**
     * Gets the value of the universityKodeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeFrom() {
        return universityKodeFrom;
    }

    /**
     * Sets the value of the universityKodeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeFrom(String value) {
        this.universityKodeFrom = value;
    }

    /**
     * Gets the value of the academicLeaveDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicLeaveDateEnd() {
        return academicLeaveDateEnd;
    }

    /**
     * Sets the value of the academicLeaveDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicLeaveDateEnd(String value) {
        this.academicLeaveDateEnd = value;
    }

}
