
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
 *         &lt;element name="EducationalCyclesPatternsGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCyclesPatterns" minOccurs="0"/>
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
    "educationalCyclesPatternsGetResult"
})
@XmlRootElement(name = "EducationalCyclesPatternsGetResponse")
public class EducationalCyclesPatternsGetResponse {

    @XmlElement(name = "EducationalCyclesPatternsGetResult")
    protected ArrayOfDEducationalCyclesPatterns educationalCyclesPatternsGetResult;

    /**
     * Gets the value of the educationalCyclesPatternsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesPatterns }
     *     
     */
    public ArrayOfDEducationalCyclesPatterns getEducationalCyclesPatternsGetResult() {
        return educationalCyclesPatternsGetResult;
    }

    /**
     * Sets the value of the educationalCyclesPatternsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesPatterns }
     *     
     */
    public void setEducationalCyclesPatternsGetResult(ArrayOfDEducationalCyclesPatterns value) {
        this.educationalCyclesPatternsGetResult = value;
    }

}
