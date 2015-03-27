
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
 *         &lt;element name="EducationalCyclesEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "educationalCyclesEditResult"
})
@XmlRootElement(name = "EducationalCyclesEditResponse")
public class EducationalCyclesEditResponse {

    @XmlElement(name = "EducationalCyclesEditResult")
    protected int educationalCyclesEditResult;

    /**
     * Gets the value of the educationalCyclesEditResult property.
     * 
     */
    public int getEducationalCyclesEditResult() {
        return educationalCyclesEditResult;
    }

    /**
     * Sets the value of the educationalCyclesEditResult property.
     * 
     */
    public void setEducationalCyclesEditResult(int value) {
        this.educationalCyclesEditResult = value;
    }

}
