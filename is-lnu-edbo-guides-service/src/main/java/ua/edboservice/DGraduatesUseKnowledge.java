
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dGraduatesUseKnowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGraduatesUseKnowledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Graduates_UseKnowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Graduate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles_UseKnowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "dGraduatesUseKnowledge", propOrder = {
    "idGraduatesUseKnowledge",
    "idGraduate",
    "idEducationalCyclesUseKnowledge",
    "educationalCyclesUseKnowledgeText",
    "educationalCyclesUseKnowledgeTextEn"
})
public class DGraduatesUseKnowledge {

    @XmlElement(name = "Id_Graduates_UseKnowledge")
    protected int idGraduatesUseKnowledge;
    @XmlElement(name = "Id_Graduate")
    protected int idGraduate;
    @XmlElement(name = "Id_EducationalCycles_UseKnowledge")
    protected int idEducationalCyclesUseKnowledge;
    @XmlElement(name = "EducationalCycles_UseKnowledgeText")
    protected String educationalCyclesUseKnowledgeText;
    @XmlElement(name = "EducationalCycles_UseKnowledgeTextEn")
    protected String educationalCyclesUseKnowledgeTextEn;

    /**
     * Gets the value of the idGraduatesUseKnowledge property.
     * 
     */
    public int getIdGraduatesUseKnowledge() {
        return idGraduatesUseKnowledge;
    }

    /**
     * Sets the value of the idGraduatesUseKnowledge property.
     * 
     */
    public void setIdGraduatesUseKnowledge(int value) {
        this.idGraduatesUseKnowledge = value;
    }

    /**
     * Gets the value of the idGraduate property.
     * 
     */
    public int getIdGraduate() {
        return idGraduate;
    }

    /**
     * Sets the value of the idGraduate property.
     * 
     */
    public void setIdGraduate(int value) {
        this.idGraduate = value;
    }

    /**
     * Gets the value of the idEducationalCyclesUseKnowledge property.
     * 
     */
    public int getIdEducationalCyclesUseKnowledge() {
        return idEducationalCyclesUseKnowledge;
    }

    /**
     * Sets the value of the idEducationalCyclesUseKnowledge property.
     * 
     */
    public void setIdEducationalCyclesUseKnowledge(int value) {
        this.idEducationalCyclesUseKnowledge = value;
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
