
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
 *         &lt;element name="EducationalCycles_JudgmentsFillResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "educationalCyclesJudgmentsFillResult"
})
@XmlRootElement(name = "EducationalCycles_JudgmentsFillResponse")
public class EducationalCyclesJudgmentsFillResponse {

    @XmlElement(name = "EducationalCycles_JudgmentsFillResult")
    protected int educationalCyclesJudgmentsFillResult;

    /**
     * Gets the value of the educationalCyclesJudgmentsFillResult property.
     * 
     */
    public int getEducationalCyclesJudgmentsFillResult() {
        return educationalCyclesJudgmentsFillResult;
    }

    /**
     * Sets the value of the educationalCyclesJudgmentsFillResult property.
     * 
     */
    public void setEducationalCyclesJudgmentsFillResult(int value) {
        this.educationalCyclesJudgmentsFillResult = value;
    }

}
