
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
 *         &lt;element name="Global_EducationalCycles_UseKnowledgeGetResult" type="{http://edboservice.ua/}ArrayOfDGlobal_EducationalCycles_UseKnowledge" minOccurs="0"/>
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
    "globalEducationalCyclesUseKnowledgeGetResult"
})
@XmlRootElement(name = "Global_EducationalCycles_UseKnowledgeGetResponse")
public class GlobalEducationalCyclesUseKnowledgeGetResponse {

    @XmlElement(name = "Global_EducationalCycles_UseKnowledgeGetResult")
    protected ArrayOfDGlobalEducationalCyclesUseKnowledge globalEducationalCyclesUseKnowledgeGetResult;

    /**
     * Gets the value of the globalEducationalCyclesUseKnowledgeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGlobalEducationalCyclesUseKnowledge }
     *     
     */
    public ArrayOfDGlobalEducationalCyclesUseKnowledge getGlobalEducationalCyclesUseKnowledgeGetResult() {
        return globalEducationalCyclesUseKnowledgeGetResult;
    }

    /**
     * Sets the value of the globalEducationalCyclesUseKnowledgeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGlobalEducationalCyclesUseKnowledge }
     *     
     */
    public void setGlobalEducationalCyclesUseKnowledgeGetResult(ArrayOfDGlobalEducationalCyclesUseKnowledge value) {
        this.globalEducationalCyclesUseKnowledgeGetResult = value;
    }

}
