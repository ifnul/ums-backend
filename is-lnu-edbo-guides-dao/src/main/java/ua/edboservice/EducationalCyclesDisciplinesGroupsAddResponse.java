
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
 *         &lt;element name="EducationalCyclesDisciplinesGroupsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "educationalCyclesDisciplinesGroupsAddResult"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesGroupsAddResponse")
public class EducationalCyclesDisciplinesGroupsAddResponse {

    @XmlElement(name = "EducationalCyclesDisciplinesGroupsAddResult")
    protected int educationalCyclesDisciplinesGroupsAddResult;

    /**
     * Gets the value of the educationalCyclesDisciplinesGroupsAddResult property.
     * 
     */
    public int getEducationalCyclesDisciplinesGroupsAddResult() {
        return educationalCyclesDisciplinesGroupsAddResult;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesGroupsAddResult property.
     * 
     */
    public void setEducationalCyclesDisciplinesGroupsAddResult(int value) {
        this.educationalCyclesDisciplinesGroupsAddResult = value;
    }

}
