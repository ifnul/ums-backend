
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
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAddition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProfessionsSpecialitiesDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfessionalTextName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractEducationCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BudjetEducationCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalSpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentKoeficient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subjects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "type",
    "idReceptionConditionAddition",
    "idPersonEducationForm",
    "professionsSpecialitiesDirections",
    "specDirSpecialityClasifierCode",
    "professionalTextName",
    "idCourse",
    "educationDuration",
    "contractEducationCount",
    "budjetEducationCount",
    "universityFacultetKode",
    "additionalSpecName",
    "periods",
    "documentKoeficient",
    "idSubjects",
    "specScecializationCode"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData234Add")
public class ReceptionConditionAdditionsTableData234Add {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Type")
    protected int type;
    @XmlElement(name = "Id_ReceptionConditionAddition")
    protected int idReceptionConditionAddition;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "ProfessionsSpecialitiesDirections")
    protected String professionsSpecialitiesDirections;
    @XmlElement(name = "SpecDirSpecialityClasifierCode")
    protected String specDirSpecialityClasifierCode;
    @XmlElement(name = "ProfessionalTextName")
    protected String professionalTextName;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "EducationDuration")
    protected String educationDuration;
    @XmlElement(name = "ContractEducationCount")
    protected String contractEducationCount;
    @XmlElement(name = "BudjetEducationCount")
    protected String budjetEducationCount;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "AdditionalSpecName")
    protected String additionalSpecName;
    @XmlElement(name = "Periods")
    protected String periods;
    @XmlElement(name = "DocumentKoeficient")
    protected String documentKoeficient;
    @XmlElement(name = "Id_Subjects")
    protected String idSubjects;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;

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
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
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
     * Gets the value of the professionsSpecialitiesDirections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionsSpecialitiesDirections() {
        return professionsSpecialitiesDirections;
    }

    /**
     * Sets the value of the professionsSpecialitiesDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionsSpecialitiesDirections(String value) {
        this.professionsSpecialitiesDirections = value;
    }

    /**
     * Gets the value of the specDirSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirSpecialityClasifierCode() {
        return specDirSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specDirSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirSpecialityClasifierCode(String value) {
        this.specDirSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the professionalTextName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalTextName() {
        return professionalTextName;
    }

    /**
     * Sets the value of the professionalTextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalTextName(String value) {
        this.professionalTextName = value;
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
     * Gets the value of the contractEducationCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractEducationCount() {
        return contractEducationCount;
    }

    /**
     * Sets the value of the contractEducationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractEducationCount(String value) {
        this.contractEducationCount = value;
    }

    /**
     * Gets the value of the budjetEducationCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudjetEducationCount() {
        return budjetEducationCount;
    }

    /**
     * Sets the value of the budjetEducationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudjetEducationCount(String value) {
        this.budjetEducationCount = value;
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

    /**
     * Gets the value of the documentKoeficient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentKoeficient() {
        return documentKoeficient;
    }

    /**
     * Sets the value of the documentKoeficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentKoeficient(String value) {
        this.documentKoeficient = value;
    }

    /**
     * Gets the value of the idSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSubjects() {
        return idSubjects;
    }

    /**
     * Sets the value of the idSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSubjects(String value) {
        this.idSubjects = value;
    }

    /**
     * Gets the value of the specScecializationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationCode() {
        return specScecializationCode;
    }

    /**
     * Sets the value of the specScecializationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationCode(String value) {
        this.specScecializationCode = value;
    }

}
