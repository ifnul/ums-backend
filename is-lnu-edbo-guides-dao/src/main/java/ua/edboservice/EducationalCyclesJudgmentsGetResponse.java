
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
 *         &lt;element name="EducationalCycles_JudgmentsGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCycles_Judgments" minOccurs="0"/>
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
    "educationalCyclesJudgmentsGetResult"
})
@XmlRootElement(name = "EducationalCycles_JudgmentsGetResponse")
public class EducationalCyclesJudgmentsGetResponse {

    @XmlElement(name = "EducationalCycles_JudgmentsGetResult")
    protected ArrayOfDEducationalCyclesJudgments educationalCyclesJudgmentsGetResult;

    /**
     * Gets the value of the educationalCyclesJudgmentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesJudgments }
     *     
     */
    public ArrayOfDEducationalCyclesJudgments getEducationalCyclesJudgmentsGetResult() {
        return educationalCyclesJudgmentsGetResult;
    }

    /**
     * Sets the value of the educationalCyclesJudgmentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesJudgments }
     *     
     */
    public void setEducationalCyclesJudgmentsGetResult(ArrayOfDEducationalCyclesJudgments value) {
        this.educationalCyclesJudgmentsGetResult = value;
    }

}
