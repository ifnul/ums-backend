
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
 *         &lt;element name="EducationalCycles_UseKnowledgeGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCycles_UseKnowledge" minOccurs="0"/>
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
    "educationalCyclesUseKnowledgeGetResult"
})
@XmlRootElement(name = "EducationalCycles_UseKnowledgeGetResponse")
public class EducationalCyclesUseKnowledgeGetResponse {

    @XmlElement(name = "EducationalCycles_UseKnowledgeGetResult")
    protected ArrayOfDEducationalCyclesUseKnowledge educationalCyclesUseKnowledgeGetResult;

    /**
     * Gets the value of the educationalCyclesUseKnowledgeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesUseKnowledge }
     *     
     */
    public ArrayOfDEducationalCyclesUseKnowledge getEducationalCyclesUseKnowledgeGetResult() {
        return educationalCyclesUseKnowledgeGetResult;
    }

    /**
     * Sets the value of the educationalCyclesUseKnowledgeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesUseKnowledge }
     *     
     */
    public void setEducationalCyclesUseKnowledgeGetResult(ArrayOfDEducationalCyclesUseKnowledge value) {
        this.educationalCyclesUseKnowledgeGetResult = value;
    }

}
