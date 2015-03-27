
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
 *         &lt;element name="Id_Global_EducationalCycles_UseKnowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCycles_UseKnowledgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCycles_UseKnowledgeTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idGlobalEducationalCyclesUseKnowledge",
    "idEducationalCycles",
    "educationalCyclesUseKnowledgeText",
    "educationalCyclesUseKnowledgeTextEn"
})
@XmlRootElement(name = "EducationalCycles_UseKnowledgeAdd")
public class EducationalCyclesUseKnowledgeAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Global_EducationalCycles_UseKnowledge")
    protected int idGlobalEducationalCyclesUseKnowledge;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "EducationalCycles_UseKnowledgeText")
    protected String educationalCyclesUseKnowledgeText;
    @XmlElement(name = "EducationalCycles_UseKnowledgeTextEn")
    protected String educationalCyclesUseKnowledgeTextEn;

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
     * Gets the value of the idGlobalEducationalCyclesUseKnowledge property.
     * 
     */
    public int getIdGlobalEducationalCyclesUseKnowledge() {
        return idGlobalEducationalCyclesUseKnowledge;
    }

    /**
     * Sets the value of the idGlobalEducationalCyclesUseKnowledge property.
     * 
     */
    public void setIdGlobalEducationalCyclesUseKnowledge(int value) {
        this.idGlobalEducationalCyclesUseKnowledge = value;
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
     * Gets the value of the educationalCyclesUseKnowledgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesUseKnowledgeText() {
        return educationalCyclesUseKnowledgeText;
    }

    /**
     * Sets the value of the educationalCyclesUseKnowledgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesUseKnowledgeText(String value) {
        this.educationalCyclesUseKnowledgeText = value;
    }

    /**
     * Gets the value of the educationalCyclesUseKnowledgeTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesUseKnowledgeTextEn() {
        return educationalCyclesUseKnowledgeTextEn;
    }

    /**
     * Sets the value of the educationalCyclesUseKnowledgeTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesUseKnowledgeTextEn(String value) {
        this.educationalCyclesUseKnowledgeTextEn = value;
    }

}
