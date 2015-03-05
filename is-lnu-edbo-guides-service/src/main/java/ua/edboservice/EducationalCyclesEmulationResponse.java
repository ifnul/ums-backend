
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
 *         &lt;element name="EducationalCyclesEmulationResult" type="{http://edboservice.ua/}ArrayOfDEducationalCycles" minOccurs="0"/>
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
    "educationalCyclesEmulationResult"
})
@XmlRootElement(name = "EducationalCyclesEmulationResponse")
public class EducationalCyclesEmulationResponse {

    @XmlElement(name = "EducationalCyclesEmulationResult")
    protected ArrayOfDEducationalCycles educationalCyclesEmulationResult;

    /**
     * Gets the value of the educationalCyclesEmulationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCycles }
     *     
     */
    public ArrayOfDEducationalCycles getEducationalCyclesEmulationResult() {
        return educationalCyclesEmulationResult;
    }

    /**
     * Sets the value of the educationalCyclesEmulationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCycles }
     *     
     */
    public void setEducationalCyclesEmulationResult(ArrayOfDEducationalCycles value) {
        this.educationalCyclesEmulationResult = value;
    }

}
