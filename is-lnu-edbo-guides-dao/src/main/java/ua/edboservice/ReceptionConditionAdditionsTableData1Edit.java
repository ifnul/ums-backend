
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
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsForeigner" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LicenseCountDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseCountVechirnya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseCountZaochna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermEducationDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermEducationVechirnya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermEducationZaochna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationCoastDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationCoastVechirnya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationCoastZaochna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalSpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idReceptionConditionAdditionsTableData1",
    "isForeigner",
    "licenseCountDenna",
    "licenseCountVechirnya",
    "licenseCountZaochna",
    "termEducationDenna",
    "termEducationVechirnya",
    "termEducationZaochna",
    "educationCoastDenna",
    "educationCoastVechirnya",
    "educationCoastZaochna",
    "universityFacultetKode",
    "additionalSpecName",
    "periods"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData1Edit")
public class ReceptionConditionAdditionsTableData1Edit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData1")
    protected int idReceptionConditionAdditionsTableData1;
    @XmlElement(name = "IsForeigner")
    protected int isForeigner;
    @XmlElement(name = "LicenseCountDenna")
    protected String licenseCountDenna;
    @XmlElement(name = "LicenseCountVechirnya")
    protected String licenseCountVechirnya;
    @XmlElement(name = "LicenseCountZaochna")
    protected String licenseCountZaochna;
    @XmlElement(name = "TermEducationDenna")
    protected String termEducationDenna;
    @XmlElement(name = "TermEducationVechirnya")
    protected String termEducationVechirnya;
    @XmlElement(name = "TermEducationZaochna")
    protected String termEducationZaochna;
    @XmlElement(name = "EducationCoastDenna")
    protected String educationCoastDenna;
    @XmlElement(name = "EducationCoastVechirnya")
    protected String educationCoastVechirnya;
    @XmlElement(name = "EducationCoastZaochna")
    protected String educationCoastZaochna;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "AdditionalSpecName")
    protected String additionalSpecName;
    @XmlElement(name = "Periods")
    protected String periods;

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
     * Gets the value of the idReceptionConditionAdditionsTableData1 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData1() {
        return idReceptionConditionAdditionsTableData1;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData1 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData1(int value) {
        this.idReceptionConditionAdditionsTableData1 = value;
    }

    /**
     * Gets the value of the isForeigner property.
     * 
     */
    public int getIsForeigner() {
        return isForeigner;
    }

    /**
     * Sets the value of the isForeigner property.
     * 
     */
    public void setIsForeigner(int value) {
        this.isForeigner = value;
    }

    /**
     * Gets the value of the licenseCountDenna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseCountDenna() {
        return licenseCountDenna;
    }

    /**
     * Sets the value of the licenseCountDenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseCountDenna(String value) {
        this.licenseCountDenna = value;
    }

    /**
     * Gets the value of the licenseCountVechirnya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseCountVechirnya() {
        return licenseCountVechirnya;
    }

    /**
     * Sets the value of the licenseCountVechirnya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseCountVechirnya(String value) {
        this.licenseCountVechirnya = value;
    }

    /**
     * Gets the value of the licenseCountZaochna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseCountZaochna() {
        return licenseCountZaochna;
    }

    /**
     * Sets the value of the licenseCountZaochna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseCountZaochna(String value) {
        this.licenseCountZaochna = value;
    }

    /**
     * Gets the value of the termEducationDenna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermEducationDenna() {
        return termEducationDenna;
    }

    /**
     * Sets the value of the termEducationDenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermEducationDenna(String value) {
        this.termEducationDenna = value;
    }

    /**
     * Gets the value of the termEducationVechirnya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermEducationVechirnya() {
        return termEducationVechirnya;
    }

    /**
     * Sets the value of the termEducationVechirnya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermEducationVechirnya(String value) {
        this.termEducationVechirnya = value;
    }

    /**
     * Gets the value of the termEducationZaochna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermEducationZaochna() {
        return termEducationZaochna;
    }

    /**
     * Sets the value of the termEducationZaochna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermEducationZaochna(String value) {
        this.termEducationZaochna = value;
    }

    /**
     * Gets the value of the educationCoastDenna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationCoastDenna() {
        return educationCoastDenna;
    }

    /**
     * Sets the value of the educationCoastDenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationCoastDenna(String value) {
        this.educationCoastDenna = value;
    }

    /**
     * Gets the value of the educationCoastVechirnya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationCoastVechirnya() {
        return educationCoastVechirnya;
    }

    /**
     * Sets the value of the educationCoastVechirnya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationCoastVechirnya(String value) {
        this.educationCoastVechirnya = value;
    }

    /**
     * Gets the value of the educationCoastZaochna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationCoastZaochna() {
        return educationCoastZaochna;
    }

    /**
     * Sets the value of the educationCoastZaochna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationCoastZaochna(String value) {
        this.educationCoastZaochna = value;
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
     * Gets the value of the additionalSpecName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalSpecName() {
        return additionalSpecName;
    }

    /**
     * Sets the value of the additionalSpecName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalSpecName(String value) {
        this.additionalSpecName = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriods() {
        return periods;
    }

    /**
     * Sets the value of the periods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriods(String value) {
        this.periods = value;
    }

}
