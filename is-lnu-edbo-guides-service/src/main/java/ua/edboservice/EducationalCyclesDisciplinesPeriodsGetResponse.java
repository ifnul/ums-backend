
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
 *         &lt;element name="EducationalCyclesDisciplinesPeriodsGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCyclesDisciplinesPeriods" minOccurs="0"/>
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
    "educationalCyclesDisciplinesPeriodsGetResult"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesPeriodsGetResponse")
public class EducationalCyclesDisciplinesPeriodsGetResponse {

    @XmlElement(name = "EducationalCyclesDisciplinesPeriodsGetResult")
    protected ArrayOfDEducationalCyclesDisciplinesPeriods educationalCyclesDisciplinesPeriodsGetResult;

    /**
     * Gets the value of the educationalCyclesDisciplinesPeriodsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesDisciplinesPeriods }
     *     
     */
    public ArrayOfDEducationalCyclesDisciplinesPeriods getEducationalCyclesDisciplinesPeriodsGetResult() {
        return educationalCyclesDisciplinesPeriodsGetResult;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesPeriodsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesDisciplinesPeriods }
     *     
     */
    public void setEducationalCyclesDisciplinesPeriodsGetResult(ArrayOfDEducationalCyclesDisciplinesPeriods value) {
        this.educationalCyclesDisciplinesPeriodsGetResult = value;
    }

}
