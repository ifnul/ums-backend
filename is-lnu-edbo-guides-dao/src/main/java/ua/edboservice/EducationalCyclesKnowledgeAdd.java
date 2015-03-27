
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
 *         &lt;element name="Id_Global_EducationalCycles_Knowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCycles_KnowledgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCycles_KnowledgeTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idGlobalEducationalCyclesKnowledge",
    "idEducationalCycles",
    "educationalCyclesKnowledgeText",
    "educationalCyclesKnowledgeTextEn"
})
@XmlRootElement(name = "EducationalCycles_KnowledgeAdd")
public class EducationalCyclesKnowledgeAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Global_EducationalCycles_Knowledge")
    protected int idGlobalEducationalCyclesKnowledge;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "EducationalCycles_KnowledgeText")
    protected String educationalCyclesKnowledgeText;
    @XmlElement(name = "EducationalCycles_KnowledgeTextEn")
    protected String educationalCyclesKnowledgeTextEn;

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
     * Gets the value of the idGlobalEducationalCyclesKnowledge property.
     * 
     */
    public int getIdGlobalEducationalCyclesKnowledge() {
        return idGlobalEducationalCyclesKnowledge;
    }

    /**
     * Sets the value of the idGlobalEducationalCyclesKnowledge property.
     * 
     */
    public void setIdGlobalEducationalCyclesKnowledge(int value) {
        this.idGlobalEducationalCyclesKnowledge = value;
    }

    /**
     * Gets the value of the idEducationalCycles property.
     * 
     */
    public int getIdEducationalCycles() {
        return idEducationalCycles;
    }

    /**
     * Sets the value of the idEducationalCycles property.
     * 
     */
    public void setIdEducationalCycles(int value) {
        this.idEducationalCycles = value;
    }

    /**
     * Gets the value of the educationalCyclesKnowledgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesKnowledgeText() {
        return educationalCyclesKnowledgeText;
    }

    /**
     * Sets the value of the educationalCyclesKnowledgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesKnowledgeText(String value) {
        this.educationalCyclesKnowledgeText = value;
    }

    /**
     * Gets the value of the educationalCyclesKnowledgeTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesKnowledgeTextEn() {
        return educationalCyclesKnowledgeTextEn;
    }

    /**
     * Sets the value of the educationalCyclesKnowledgeTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesKnowledgeTextEn(String value) {
        this.educationalCyclesKnowledgeTextEn = value;
    }

}
