
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
 *         &lt;element name="EducationalCyclesDisciplinesUpdateResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "educationalCyclesDisciplinesUpdateResult"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesUpdateResponse")
public class EducationalCyclesDisciplinesUpdateResponse {

    @XmlElement(name = "EducationalCyclesDisciplinesUpdateResult")
    protected String educationalCyclesDisciplinesUpdateResult;

    /**
     * Gets the value of the educationalCyclesDisciplinesUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesDisciplinesUpdateResult() {
        return educationalCyclesDisciplinesUpdateResult;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesDisciplinesUpdateResult(String value) {
        this.educationalCyclesDisciplinesUpdateResult = value;
    }

}
