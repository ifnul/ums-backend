
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
 *         &lt;element name="EducationalCycles_ProgramEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "educationalCyclesProgramEditResult"
})
@XmlRootElement(name = "EducationalCycles_ProgramEditResponse")
public class EducationalCyclesProgramEditResponse {

    @XmlElement(name = "EducationalCycles_ProgramEditResult")
    protected int educationalCyclesProgramEditResult;

    /**
     * Gets the value of the educationalCyclesProgramEditResult property.
     * 
     */
    public int getEducationalCyclesProgramEditResult() {
        return educationalCyclesProgramEditResult;
    }

    /**
     * Sets the value of the educationalCyclesProgramEditResult property.
     * 
     */
    public void setEducationalCyclesProgramEditResult(int value) {
        this.educationalCyclesProgramEditResult = value;
    }

}
