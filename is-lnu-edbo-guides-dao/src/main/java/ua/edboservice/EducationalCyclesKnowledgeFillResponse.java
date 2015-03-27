
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
 *         &lt;element name="EducationalCycles_KnowledgeFillResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "educationalCyclesKnowledgeFillResult"
})
@XmlRootElement(name = "EducationalCycles_KnowledgeFillResponse")
public class EducationalCyclesKnowledgeFillResponse {

    @XmlElement(name = "EducationalCycles_KnowledgeFillResult")
    protected int educationalCyclesKnowledgeFillResult;

    /**
     * Gets the value of the educationalCyclesKnowledgeFillResult property.
     * 
     */
    public int getEducationalCyclesKnowledgeFillResult() {
        return educationalCyclesKnowledgeFillResult;
    }

    /**
     * Sets the value of the educationalCyclesKnowledgeFillResult property.
     * 
     */
    public void setEducationalCyclesKnowledgeFillResult(int value) {
        this.educationalCyclesKnowledgeFillResult = value;
    }

}
