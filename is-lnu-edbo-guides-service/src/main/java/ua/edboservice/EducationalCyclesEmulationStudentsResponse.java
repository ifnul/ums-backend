
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
 *         &lt;element name="EducationalCyclesEmulationStudentsResult" type="{http://edboservice.ua/}ArrayOfDEducationalCyclesEmulationStudent" minOccurs="0"/>
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
    "educationalCyclesEmulationStudentsResult"
})
@XmlRootElement(name = "EducationalCyclesEmulationStudentsResponse")
public class EducationalCyclesEmulationStudentsResponse {

    @XmlElement(name = "EducationalCyclesEmulationStudentsResult")
    protected ArrayOfDEducationalCyclesEmulationStudent educationalCyclesEmulationStudentsResult;

    /**
     * Gets the value of the educationalCyclesEmulationStudentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesEmulationStudent }
     *     
     */
    public ArrayOfDEducationalCyclesEmulationStudent getEducationalCyclesEmulationStudentsResult() {
        return educationalCyclesEmulationStudentsResult;
    }

    /**
     * Sets the value of the educationalCyclesEmulationStudentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesEmulationStudent }
     *     
     */
    public void setEducationalCyclesEmulationStudentsResult(ArrayOfDEducationalCyclesEmulationStudent value) {
        this.educationalCyclesEmulationStudentsResult = value;
    }

}
