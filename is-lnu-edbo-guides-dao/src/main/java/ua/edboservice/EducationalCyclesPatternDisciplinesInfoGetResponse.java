
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
 *         &lt;element name="EducationalCyclesPatternDisciplinesInfoGetResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "educationalCyclesPatternDisciplinesInfoGetResult"
})
@XmlRootElement(name = "EducationalCyclesPatternDisciplinesInfoGetResponse")
public class EducationalCyclesPatternDisciplinesInfoGetResponse {

    @XmlElement(name = "EducationalCyclesPatternDisciplinesInfoGetResult")
    protected String educationalCyclesPatternDisciplinesInfoGetResult;

    /**
     * Gets the value of the educationalCyclesPatternDisciplinesInfoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesPatternDisciplinesInfoGetResult() {
        return educationalCyclesPatternDisciplinesInfoGetResult;
    }

    /**
     * Sets the value of the educationalCyclesPatternDisciplinesInfoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesPatternDisciplinesInfoGetResult(String value) {
        this.educationalCyclesPatternDisciplinesInfoGetResult = value;
    }

}
