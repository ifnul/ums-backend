
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
 *         &lt;element name="EducationalCycles_KnowledgeAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "educationalCyclesKnowledgeAddResult"
})
@XmlRootElement(name = "EducationalCycles_KnowledgeAddResponse")
public class EducationalCyclesKnowledgeAddResponse {

    @XmlElement(name = "EducationalCycles_KnowledgeAddResult")
    protected int educationalCyclesKnowledgeAddResult;

    /**
     * Gets the value of the educationalCyclesKnowledgeAddResult property.
     * 
     */
    public int getEducationalCyclesKnowledgeAddResult() {
        return educationalCyclesKnowledgeAddResult;
    }

    /**
     * Sets the value of the educationalCyclesKnowledgeAddResult property.
     * 
     */
    public void setEducationalCyclesKnowledgeAddResult(int value) {
        this.educationalCyclesKnowledgeAddResult = value;
    }

}
