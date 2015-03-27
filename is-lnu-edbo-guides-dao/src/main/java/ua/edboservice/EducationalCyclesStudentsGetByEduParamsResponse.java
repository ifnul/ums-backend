
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
 *         &lt;element name="EducationalCyclesStudentsGetByEduParamsResult" type="{http://edboservice.ua/}ArrayOfDEducationalCyclesStudentsGetByEduParams" minOccurs="0"/>
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
    "educationalCyclesStudentsGetByEduParamsResult"
})
@XmlRootElement(name = "EducationalCyclesStudentsGetByEduParamsResponse")
public class EducationalCyclesStudentsGetByEduParamsResponse {

    @XmlElement(name = "EducationalCyclesStudentsGetByEduParamsResult")
    protected ArrayOfDEducationalCyclesStudentsGetByEduParams educationalCyclesStudentsGetByEduParamsResult;

    /**
     * Gets the value of the educationalCyclesStudentsGetByEduParamsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesStudentsGetByEduParams }
     *     
     */
    public ArrayOfDEducationalCyclesStudentsGetByEduParams getEducationalCyclesStudentsGetByEduParamsResult() {
        return educationalCyclesStudentsGetByEduParamsResult;
    }

    /**
     * Sets the value of the educationalCyclesStudentsGetByEduParamsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesStudentsGetByEduParams }
     *     
     */
    public void setEducationalCyclesStudentsGetByEduParamsResult(ArrayOfDEducationalCyclesStudentsGetByEduParams value) {
        this.educationalCyclesStudentsGetByEduParamsResult = value;
    }

}
