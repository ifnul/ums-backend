
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
 *         &lt;element name="Id_ReceptionConditionAddition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData5Group" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Subjects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalSpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentKoeficient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idReceptionConditionAddition",
    "idReceptionConditionAdditionsTableData5Group",
    "specDirectionClasifierCode",
    "specSpecialityClasifierCode",
    "quota",
    "idQualification",
    "idSubjects",
    "universityFacultetKode",
    "additionalSpecName",
    "specScecializationCode",
    "documentKoeficient"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5Add")
public class ReceptionConditionAdditionsTableData5Add {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ReceptionConditionAddition")
    protected int idReceptionConditionAddition;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData5Group")
    protected int idReceptionConditionAdditionsTableData5Group;
    @XmlElement(name = "SpecDirectionClasifierCode")
    protected String specDirectionClasifierCode;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;
    @XmlElement(name = "Quota")
    protected String quota;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "Id_Subjects")
    protected String idSubjects;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "AdditionalSpecName")
    protected String additionalSpecName;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;
    @XmlElement(name = "DocumentKoeficient")
    protected String documentKoeficient;

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
     * Gets the value of the idReceptionConditionAdditionsTableData5Group property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData5Group() {
        return idReceptionConditionAdditionsTableData5Group;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData5Group property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData5Group(int value) {
        this.idReceptionConditionAdditionsTableData5Group = value;
    }

    /**
     * Gets the value of the specDirectionClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionClasifierCode() {
        return specDirectionClasifierCode;
    }

    /**
     * Sets the value of the specDirectionClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionClasifierCode(String value) {
        this.specDirectionClasifierCode = value;
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
     * Gets the value of the quota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuota(String value) {
        this.quota = value;
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

}
