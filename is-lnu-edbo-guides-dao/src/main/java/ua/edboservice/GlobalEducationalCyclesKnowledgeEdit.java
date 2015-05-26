
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
 *         &lt;element name="Global_EducationalCycles_Knowledge_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_Knowledge_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_KnowledgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_KnowledgeTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "globalEducationalCyclesKnowledgeName",
    "globalEducationalCyclesKnowledgeDescription",
    "globalEducationalCyclesKnowledgeText",
    "globalEducationalCyclesKnowledgeTextEn"
})
@XmlRootElement(name = "Global_EducationalCycles_KnowledgeEdit")
public class GlobalEducationalCyclesKnowledgeEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Global_EducationalCycles_Knowledge")
    protected int idGlobalEducationalCyclesKnowledge;
    @XmlElement(name = "Global_EducationalCycles_Knowledge_Name")
    protected String globalEducationalCyclesKnowledgeName;
    @XmlElement(name = "Global_EducationalCycles_Knowledge_Description")
    protected String globalEducationalCyclesKnowledgeDescription;
    @XmlElement(name = "Global_EducationalCycles_KnowledgeText")
    protected String globalEducationalCyclesKnowledgeText;
    @XmlElement(name = "Global_EducationalCycles_KnowledgeTextEn")
    protected String globalEducationalCyclesKnowledgeTextEn;

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

}
