
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
 *         &lt;element name="EducationalCyclesStudentsGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCyclesStudent" minOccurs="0"/>
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
    "educationalCyclesStudentsGetResult"
})
@XmlRootElement(name = "EducationalCyclesStudentsGetResponse")
public class EducationalCyclesStudentsGetResponse {

    @XmlElement(name = "EducationalCyclesStudentsGetResult")
    protected ArrayOfDEducationalCyclesStudent educationalCyclesStudentsGetResult;

    /**
     * Gets the value of the educationalCyclesStudentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesStudent }
     *     
     */
    public ArrayOfDEducationalCyclesStudent getEducationalCyclesStudentsGetResult() {
        return educationalCyclesStudentsGetResult;
    }

    /**
     * Sets the value of the educationalCyclesStudentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesStudent }
     *     
     */
    public void setEducationalCyclesStudentsGetResult(ArrayOfDEducationalCyclesStudent value) {
        this.educationalCyclesStudentsGetResult = value;
    }

}
