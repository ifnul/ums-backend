
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
 *         &lt;element name="Global_EducationalCycles_UseKnowledge_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledge_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledgeTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "globalEducationalCyclesUseKnowledgeName",
    "globalEducationalCyclesUseKnowledgeDescription",
    "globalEducationalCyclesUseKnowledgeText",
    "globalEducationalCyclesUseKnowledgeTextEn",
    "idQualificationGroup",
    "specDirectionsCode",
    "specSpecialityCode",
    "universityKode"
})
@XmlRootElement(name = "Global_EducationalCycles_UseKnowledgeAdd")
public class GlobalEducationalCyclesUseKnowledgeAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledge_Name")
    protected String globalEducationalCyclesUseKnowledgeName;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledge_Description")
    protected String globalEducationalCyclesUseKnowledgeDescription;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledgeText")
    protected String globalEducationalCyclesUseKnowledgeText;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledgeTextEn")
    protected String globalEducationalCyclesUseKnowledgeTextEn;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;

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
     * Gets the value of the globalEducationalCyclesUseKnowledgeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesUseKnowledgeName() {
        return globalEducationalCyclesUseKnowledgeName;
    }

    /**
     * Sets the value of the globalEducationalCyclesUseKnowledgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesUseKnowledgeName(String value) {
        this.globalEducationalCyclesUseKnowledgeName = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesUseKnowledgeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesUseKnowledgeDescription() {
        return globalEducationalCyclesUseKnowledgeDescription;
    }

    /**
     * Sets the value of the globalEducationalCyclesUseKnowledgeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesUseKnowledgeDescription(String value) {
        this.globalEducationalCyclesUseKnowledgeDescription = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesUseKnowledgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesUseKnowledgeText() {
        return globalEducationalCyclesUseKnowledgeText;
    }

    /**
     * Sets the value of the globalEducationalCyclesUseKnowledgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesUseKnowledgeText(String value) {
        this.globalEducationalCyclesUseKnowledgeText = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesUseKnowledgeTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesUseKnowledgeTextEn() {
        return globalEducationalCyclesUseKnowledgeTextEn;
    }

    /**
     * Sets the value of the globalEducationalCyclesUseKnowledgeTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesUseKnowledgeTextEn(String value) {
        this.globalEducationalCyclesUseKnowledgeTextEn = value;
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
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
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

}
