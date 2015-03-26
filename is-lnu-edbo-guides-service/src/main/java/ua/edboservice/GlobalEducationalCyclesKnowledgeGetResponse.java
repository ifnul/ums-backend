
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
 *         &lt;element name="Global_EducationalCycles_KnowledgeGetResult" type="{http://edboservice.ua/}ArrayOfDGlobal_EducationalCycles_Knowledge" minOccurs="0"/>
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
    "globalEducationalCyclesKnowledgeGetResult"
})
@XmlRootElement(name = "Global_EducationalCycles_KnowledgeGetResponse")
public class GlobalEducationalCyclesKnowledgeGetResponse {

    @XmlElement(name = "Global_EducationalCycles_KnowledgeGetResult")
    protected ArrayOfDGlobalEducationalCyclesKnowledge globalEducationalCyclesKnowledgeGetResult;

    /**
     * Gets the value of the globalEducationalCyclesKnowledgeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGlobalEducationalCyclesKnowledge }
     *     
     */
    public ArrayOfDGlobalEducationalCyclesKnowledge getGlobalEducationalCyclesKnowledgeGetResult() {
        return globalEducationalCyclesKnowledgeGetResult;
    }

    /**
     * Sets the value of the globalEducationalCyclesKnowledgeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGlobalEducationalCyclesKnowledge }
     *     
     */
    public void setGlobalEducationalCyclesKnowledgeGetResult(ArrayOfDGlobalEducationalCyclesKnowledge value) {
        this.globalEducationalCyclesKnowledgeGetResult = value;
    }

}
