
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
 *         &lt;element name="EducationalCyclesDisciplinesPeriodsGlobalGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCyclesDisciplinesPeriodsGlobal" minOccurs="0"/>
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
    "educationalCyclesDisciplinesPeriodsGlobalGetResult"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesPeriodsGlobalGetResponse")
public class EducationalCyclesDisciplinesPeriodsGlobalGetResponse {

    @XmlElement(name = "EducationalCyclesDisciplinesPeriodsGlobalGetResult")
    protected ArrayOfDEducationalCyclesDisciplinesPeriodsGlobal educationalCyclesDisciplinesPeriodsGlobalGetResult;

    /**
     * Gets the value of the educationalCyclesDisciplinesPeriodsGlobalGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesDisciplinesPeriodsGlobal }
     *     
     */
    public ArrayOfDEducationalCyclesDisciplinesPeriodsGlobal getEducationalCyclesDisciplinesPeriodsGlobalGetResult() {
        return educationalCyclesDisciplinesPeriodsGlobalGetResult;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesPeriodsGlobalGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesDisciplinesPeriodsGlobal }
     *     
     */
    public void setEducationalCyclesDisciplinesPeriodsGlobalGetResult(ArrayOfDEducationalCyclesDisciplinesPeriodsGlobal value) {
        this.educationalCyclesDisciplinesPeriodsGlobalGetResult = value;
    }

}
