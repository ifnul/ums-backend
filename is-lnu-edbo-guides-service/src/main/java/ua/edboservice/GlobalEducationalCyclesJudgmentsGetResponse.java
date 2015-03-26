
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
 *         &lt;element name="Global_EducationalCycles_JudgmentsGetResult" type="{http://edboservice.ua/}ArrayOfDGlobal_EducationalCycles_Judgments" minOccurs="0"/>
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
    "globalEducationalCyclesJudgmentsGetResult"
})
@XmlRootElement(name = "Global_EducationalCycles_JudgmentsGetResponse")
public class GlobalEducationalCyclesJudgmentsGetResponse {

    @XmlElement(name = "Global_EducationalCycles_JudgmentsGetResult")
    protected ArrayOfDGlobalEducationalCyclesJudgments globalEducationalCyclesJudgmentsGetResult;

    /**
     * Gets the value of the globalEducationalCyclesJudgmentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGlobalEducationalCyclesJudgments }
     *     
     */
    public ArrayOfDGlobalEducationalCyclesJudgments getGlobalEducationalCyclesJudgmentsGetResult() {
        return globalEducationalCyclesJudgmentsGetResult;
    }

    /**
     * Sets the value of the globalEducationalCyclesJudgmentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGlobalEducationalCyclesJudgments }
     *     
     */
    public void setGlobalEducationalCyclesJudgmentsGetResult(ArrayOfDGlobalEducationalCyclesJudgments value) {
        this.globalEducationalCyclesJudgmentsGetResult = value;
    }

}
