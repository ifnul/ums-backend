
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsForExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsForExport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAddition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData5Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Choose" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsProfile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectAdditianalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityFacultet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseCountDenna" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LicenseCountVechirnya" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LicenseCountZaochna" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TermEducationDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermEducationVechirnya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermEducationZaochna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Corse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsForExport", propOrder = {
    "idReceptionConditionAddition",
    "idReceptionConditionAdditionsTableData5",
    "specClasifierCode",
    "specSpecialityClasifierCode",
    "idQualification",
    "qualificationName",
    "idReceptionConditionAdditionsTableData5Subject",
    "subjectPosition",
    "choose",
    "isProfile",
    "subjectAdditianalName",
    "idSubject",
    "subjectName",
    "idUniversityFacultet",
    "universityFacultetFullName",
    "licenseCountDenna",
    "licenseCountVechirnya",
    "licenseCountZaochna",
    "termEducationDenna",
    "termEducationVechirnya",
    "termEducationZaochna",
    "specSpecialityName",
    "specDirectionName",
    "idCorse"
})
public class DReceptionConditionAdditionsForExport {

    @XmlElement(name = "Id_ReceptionConditionAddition")
    protected int idReceptionConditionAddition;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData5")
    protected int idReceptionConditionAdditionsTableData5;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData5Subject")
    protected int idReceptionConditionAdditionsTableData5Subject;
    @XmlElement(name = "SubjectPosition")
    protected int subjectPosition;
    @XmlElement(name = "Choose")
    protected int choose;
    @XmlElement(name = "IsProfile")
    protected int isProfile;
    @XmlElement(name = "SubjectAdditianalName")
    protected String subjectAdditianalName;
    @XmlElement(name = "Id_Subject")
    protected int idSubject;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "Id_UniversityFacultet")
    protected int idUniversityFacultet;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
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
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "Id_Corse")
    protected int idCorse;

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
     * Gets the value of the idReceptionConditionAdditionsTableData5 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData5() {
        return idReceptionConditionAdditionsTableData5;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData5 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData5(int value) {
        this.idReceptionConditionAdditionsTableData5 = value;
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
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
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
     * Gets the value of the idReceptionConditionAdditionsTableData5Subject property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData5Subject() {
        return idReceptionConditionAdditionsTableData5Subject;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData5Subject property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData5Subject(int value) {
        this.idReceptionConditionAdditionsTableData5Subject = value;
    }

    /**
     * Gets the value of the subjectPosition property.
     * 
     */
    public int getSubjectPosition() {
        return subjectPosition;
    }

    /**
     * Sets the value of the subjectPosition property.
     * 
     */
    public void setSubjectPosition(int value) {
        this.subjectPosition = value;
    }

    /**
     * Gets the value of the choose property.
     * 
     */
    public int getChoose() {
        return choose;
    }

    /**
     * Sets the value of the choose property.
     * 
     */
    public void setChoose(int value) {
        this.choose = value;
    }

    /**
     * Gets the value of the isProfile property.
     * 
     */
    public int getIsProfile() {
        return isProfile;
    }

    /**
     * Sets the value of the isProfile property.
     * 
     */
    public void setIsProfile(int value) {
        this.isProfile = value;
    }

    /**
     * Gets the value of the subjectAdditianalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectAdditianalName() {
        return subjectAdditianalName;
    }

    /**
     * Sets the value of the subjectAdditianalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectAdditianalName(String value) {
        this.subjectAdditianalName = value;
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
     * Gets the value of the idUniversityFacultet property.
     * 
     */
    public int getIdUniversityFacultet() {
        return idUniversityFacultet;
    }

    /**
     * Sets the value of the idUniversityFacultet property.
     * 
     */
    public void setIdUniversityFacultet(int value) {
        this.idUniversityFacultet = value;
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
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the idCorse property.
     * 
     */
    public int getIdCorse() {
        return idCorse;
    }

    /**
     * Sets the value of the idCorse property.
     * 
     */
    public void setIdCorse(int value) {
        this.idCorse = value;
    }

}
