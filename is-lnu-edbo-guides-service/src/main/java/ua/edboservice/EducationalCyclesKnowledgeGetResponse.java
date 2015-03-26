
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
 *         &lt;element name="EducationalCycles_KnowledgeGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCycles_Knowledge" minOccurs="0"/>
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
    "educationalCyclesKnowledgeGetResult"
})
@XmlRootElement(name = "EducationalCycles_KnowledgeGetResponse")
public class EducationalCyclesKnowledgeGetResponse {

    @XmlElement(name = "EducationalCycles_KnowledgeGetResult")
    protected ArrayOfDEducationalCyclesKnowledge educationalCyclesKnowledgeGetResult;

    /**
     * Gets the value of the educationalCyclesKnowledgeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesKnowledge }
     *     
     */
    public ArrayOfDEducationalCyclesKnowledge getEducationalCyclesKnowledgeGetResult() {
        return educationalCyclesKnowledgeGetResult;
    }

    /**
     * Sets the value of the educationalCyclesKnowledgeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesKnowledge }
     *     
     */
    public void setEducationalCyclesKnowledgeGetResult(ArrayOfDEducationalCyclesKnowledge value) {
        this.educationalCyclesKnowledgeGetResult = value;
    }

}
