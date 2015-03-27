
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsTableData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsTableData1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAddition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsForeigner" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecIndastryClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseCountDenna" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LicenseCountVechirnya" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LicenseCountZaochna" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TermEducationDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermEducationVechirnya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermEducationZaochna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationCoastDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationCoastVechirnya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationCoastZaochna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalSpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsTableData1", propOrder = {
    "idReceptionConditionAdditionsTableData1",
    "idReceptionConditionAddition",
    "isForeigner",
    "specIndastryClasifierCode",
    "specIndastryName",
    "specClasifierCode",
    "specName",
    "idQualificationGroup",
    "qualificationGroupName",
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
    "universityFacultetFullName",
    "additionalSpecName"
})
public class DReceptionConditionAdditionsTableData1 {

    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData1")
    protected int idReceptionConditionAdditionsTableData1;
    @XmlElement(name = "Id_ReceptionConditionAddition")
    protected int idReceptionConditionAddition;
    @XmlElement(name = "IsForeigner")
    protected int isForeigner;
    @XmlElement(name = "SpecIndastryClasifierCode")
    protected String specIndastryClasifierCode;
    @XmlElement(name = "SpecIndastryName")
    protected String specIndastryName;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecName")
    protected String specName;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "QualificationGroupName")
    protected String qualificationGroupName;
    @XmlElement(name = "LicenseCountDenna", required = true)
    protected BigDecimal licenseCountDenna;
    @XmlElement(name = "LicenseCountVechirnya", required = true)
    protected BigDecimal licenseCountVechirnya;
    @XmlElement(name = "LicenseCountZaochna", required = true)
    protected BigDecimal licenseCountZaochna;
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
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "AdditionalSpecName")
    protected String additionalSpecName;

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
     * Gets the value of the idReceptionConditionAddition property.
     * 
     */
    public int getIdReceptionConditionAddition() {
        return idReceptionConditionAddition;
    }

    /**
     * Sets the value of the idReceptionConditionAddition property.
     * 
     */
    public void setIdReceptionConditionAddition(int value) {
        this.idReceptionConditionAddition = value;
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
     * Gets the value of the specIndastryClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryClasifierCode() {
        return specIndastryClasifierCode;
    }

    /**
     * Sets the value of the specIndastryClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryClasifierCode(String value) {
        this.specIndastryClasifierCode = value;
    }

    /**
     * Gets the value of the specIndastryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryName() {
        return specIndastryName;
    }

    /**
     * Sets the value of the specIndastryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryName(String value) {
        this.specIndastryName = value;
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
     * Gets the value of the specName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * Sets the value of the specName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecName(String value) {
        this.specName = value;
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

    /**
     * Gets the value of the qualificationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationGroupName() {
        return qualificationGroupName;
    }

    /**
     * Sets the value of the qualificationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationGroupName(String value) {
        this.qualificationGroupName = value;
    }

    /**
     * Gets the value of the licenseCountDenna property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLicenseCountDenna() {
        return licenseCountDenna;
    }

    /**
     * Sets the value of the licenseCountDenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLicenseCountDenna(BigDecimal value) {
        this.licenseCountDenna = value;
    }

    /**
     * Gets the value of the licenseCountVechirnya property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLicenseCountVechirnya() {
        return licenseCountVechirnya;
    }

    /**
     * Sets the value of the licenseCountVechirnya property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLicenseCountVechirnya(BigDecimal value) {
        this.licenseCountVechirnya = value;
    }

    /**
     * Gets the value of the licenseCountZaochna property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLicenseCountZaochna() {
        return licenseCountZaochna;
    }

    /**
     * Sets the value of the licenseCountZaochna property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLicenseCountZaochna(BigDecimal value) {
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

}
