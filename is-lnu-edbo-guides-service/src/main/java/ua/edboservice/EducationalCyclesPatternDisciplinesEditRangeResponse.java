
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
 *         &lt;element name="EducationalCyclesPatternDisciplinesEditRangeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "educationalCyclesPatternDisciplinesEditRangeResult"
})
@XmlRootElement(name = "EducationalCyclesPatternDisciplinesEditRangeResponse")
public class EducationalCyclesPatternDisciplinesEditRangeResponse {

    @XmlElement(name = "EducationalCyclesPatternDisciplinesEditRangeResult")
    protected String educationalCyclesPatternDisciplinesEditRangeResult;

    /**
     * Gets the value of the educationalCyclesPatternDisciplinesEditRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesPatternDisciplinesEditRangeResult() {
        return educationalCyclesPatternDisciplinesEditRangeResult;
    }

    /**
     * Sets the value of the educationalCyclesPatternDisciplinesEditRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesPatternDisciplinesEditRangeResult(String value) {
        this.educationalCyclesPatternDisciplinesEditRangeResult = value;
    }

}
