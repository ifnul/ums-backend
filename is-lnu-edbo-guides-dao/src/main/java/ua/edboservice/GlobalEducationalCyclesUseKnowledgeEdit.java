
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
 *         &lt;element name="Global_EducationalCycles_UseKnowledge_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledge_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledgeTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "globalEducationalCyclesUseKnowledgeName",
    "globalEducationalCyclesUseKnowledgeDescription",
    "globalEducationalCyclesUseKnowledgeText",
    "globalEducationalCyclesUseKnowledgeTextEn"
})
@XmlRootElement(name = "Global_EducationalCycles_UseKnowledgeEdit")
public class GlobalEducationalCyclesUseKnowledgeEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Global_EducationalCycles_UseKnowledge")
    protected int idGlobalEducationalCyclesUseKnowledge;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledge_Name")
    protected String globalEducationalCyclesUseKnowledgeName;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledge_Description")
    protected String globalEducationalCyclesUseKnowledgeDescription;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledgeText")
    protected String globalEducationalCyclesUseKnowledgeText;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledgeTextEn")
    protected String globalEducationalCyclesUseKnowledgeTextEn;

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

}
