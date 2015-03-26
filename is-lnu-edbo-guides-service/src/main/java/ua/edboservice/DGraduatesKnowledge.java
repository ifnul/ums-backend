
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dGraduatesKnowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGraduatesKnowledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Graduates_Knowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Graduate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles_Knowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "dGraduatesKnowledge", propOrder = {
    "idGraduatesKnowledge",
    "idGraduate",
    "idEducationalCyclesKnowledge",
    "educationalCyclesKnowledgeText",
    "educationalCyclesKnowledgeTextEn"
})
public class DGraduatesKnowledge {

    @XmlElement(name = "Id_Graduates_Knowledge")
    protected int idGraduatesKnowledge;
    @XmlElement(name = "Id_Graduate")
    protected int idGraduate;
    @XmlElement(name = "Id_EducationalCycles_Knowledge")
    protected int idEducationalCyclesKnowledge;
    @XmlElement(name = "EducationalCycles_KnowledgeText")
    protected String educationalCyclesKnowledgeText;
    @XmlElement(name = "EducationalCycles_KnowledgeTextEn")
    protected String educationalCyclesKnowledgeTextEn;

    /**
     * Gets the value of the idGraduatesKnowledge property.
     * 
     */
    public int getIdGraduatesKnowledge() {
        return idGraduatesKnowledge;
    }

    /**
     * Sets the value of the idGraduatesKnowledge property.
     * 
     */
    public void setIdGraduatesKnowledge(int value) {
        this.idGraduatesKnowledge = value;
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
     * Gets the value of the idEducationalCyclesKnowledge property.
     * 
     */
    public int getIdEducationalCyclesKnowledge() {
        return idEducationalCyclesKnowledge;
    }

    /**
     * Sets the value of the idEducationalCyclesKnowledge property.
     * 
     */
    public void setIdEducationalCyclesKnowledge(int value) {
        this.idEducationalCyclesKnowledge = value;
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
