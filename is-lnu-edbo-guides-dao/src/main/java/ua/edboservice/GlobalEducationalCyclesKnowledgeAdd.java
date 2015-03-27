
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
 *         &lt;element name="Global_EducationalCycles_Knowledge_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_Knowledge_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_KnowledgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_KnowledgeTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "globalEducationalCyclesKnowledgeName",
    "globalEducationalCyclesKnowledgeDescription",
    "globalEducationalCyclesKnowledgeText",
    "globalEducationalCyclesKnowledgeTextEn",
    "idQualificationGroup",
    "specDirectionsCode",
    "specSpecialityCode",
    "universityKode"
})
@XmlRootElement(name = "Global_EducationalCycles_KnowledgeAdd")
public class GlobalEducationalCyclesKnowledgeAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Global_EducationalCycles_Knowledge_Name")
    protected String globalEducationalCyclesKnowledgeName;
    @XmlElement(name = "Global_EducationalCycles_Knowledge_Description")
    protected String globalEducationalCyclesKnowledgeDescription;
    @XmlElement(name = "Global_EducationalCycles_KnowledgeText")
    protected String globalEducationalCyclesKnowledgeText;
    @XmlElement(name = "Global_EducationalCycles_KnowledgeTextEn")
    protected String globalEducationalCyclesKnowledgeTextEn;
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
     * Gets the value of the globalEducationalCyclesKnowledgeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesKnowledgeName() {
        return globalEducationalCyclesKnowledgeName;
    }

    /**
     * Sets the value of the globalEducationalCyclesKnowledgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesKnowledgeName(String value) {
        this.globalEducationalCyclesKnowledgeName = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesKnowledgeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesKnowledgeDescription() {
        return globalEducationalCyclesKnowledgeDescription;
    }

    /**
     * Sets the value of the globalEducationalCyclesKnowledgeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesKnowledgeDescription(String value) {
        this.globalEducationalCyclesKnowledgeDescription = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesKnowledgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesKnowledgeText() {
        return globalEducationalCyclesKnowledgeText;
    }

    /**
     * Sets the value of the globalEducationalCyclesKnowledgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesKnowledgeText(String value) {
        this.globalEducationalCyclesKnowledgeText = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesKnowledgeTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesKnowledgeTextEn() {
        return globalEducationalCyclesKnowledgeTextEn;
    }

    /**
     * Sets the value of the globalEducationalCyclesKnowledgeTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesKnowledgeTextEn(String value) {
        this.globalEducationalCyclesKnowledgeTextEn = value;
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
