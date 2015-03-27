
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
 *         &lt;element name="Global_EducationalCycles_KnowledgeAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "globalEducationalCyclesKnowledgeAddResult"
})
@XmlRootElement(name = "Global_EducationalCycles_KnowledgeAddResponse")
public class GlobalEducationalCyclesKnowledgeAddResponse {

    @XmlElement(name = "Global_EducationalCycles_KnowledgeAddResult")
    protected int globalEducationalCyclesKnowledgeAddResult;

    /**
     * Gets the value of the globalEducationalCyclesKnowledgeAddResult property.
     * 
     */
    public int getGlobalEducationalCyclesKnowledgeAddResult() {
        return globalEducationalCyclesKnowledgeAddResult;
    }

    /**
     * Sets the value of the globalEducationalCyclesKnowledgeAddResult property.
     * 
     */
    public void setGlobalEducationalCyclesKnowledgeAddResult(int value) {
        this.globalEducationalCyclesKnowledgeAddResult = value;
    }

}
