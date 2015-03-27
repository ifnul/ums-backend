
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
 *         &lt;element name="EducationalCycles_ProgramGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCycles_Program" minOccurs="0"/>
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
    "educationalCyclesProgramGetResult"
})
@XmlRootElement(name = "EducationalCycles_ProgramGetResponse")
public class EducationalCyclesProgramGetResponse {

    @XmlElement(name = "EducationalCycles_ProgramGetResult")
    protected ArrayOfDEducationalCyclesProgram educationalCyclesProgramGetResult;

    /**
     * Gets the value of the educationalCyclesProgramGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesProgram }
     *     
     */
    public ArrayOfDEducationalCyclesProgram getEducationalCyclesProgramGetResult() {
        return educationalCyclesProgramGetResult;
    }

    /**
     * Sets the value of the educationalCyclesProgramGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesProgram }
     *     
     */
    public void setEducationalCyclesProgramGetResult(ArrayOfDEducationalCyclesProgram value) {
        this.educationalCyclesProgramGetResult = value;
    }

}
