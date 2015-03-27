
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
 *         &lt;element name="Global_EducationalCycles_KnowledgeDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "globalEducationalCyclesKnowledgeDelResult"
})
@XmlRootElement(name = "Global_EducationalCycles_KnowledgeDelResponse")
public class GlobalEducationalCyclesKnowledgeDelResponse {

    @XmlElement(name = "Global_EducationalCycles_KnowledgeDelResult")
    protected int globalEducationalCyclesKnowledgeDelResult;

    /**
     * Gets the value of the globalEducationalCyclesKnowledgeDelResult property.
     * 
     */
    public int getGlobalEducationalCyclesKnowledgeDelResult() {
        return globalEducationalCyclesKnowledgeDelResult;
    }

    /**
     * Sets the value of the globalEducationalCyclesKnowledgeDelResult property.
     * 
     */
    public void setGlobalEducationalCyclesKnowledgeDelResult(int value) {
        this.globalEducationalCyclesKnowledgeDelResult = value;
    }

}
