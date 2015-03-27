
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
 *         &lt;element name="EducationalCyclesPatternsAllDisciplinesGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCyclesPatternsAllDisciplines" minOccurs="0"/>
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
    "educationalCyclesPatternsAllDisciplinesGetResult"
})
@XmlRootElement(name = "EducationalCyclesPatternsAllDisciplinesGetResponse")
public class EducationalCyclesPatternsAllDisciplinesGetResponse {

    @XmlElement(name = "EducationalCyclesPatternsAllDisciplinesGetResult")
    protected ArrayOfDEducationalCyclesPatternsAllDisciplines educationalCyclesPatternsAllDisciplinesGetResult;

    /**
     * Gets the value of the educationalCyclesPatternsAllDisciplinesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesPatternsAllDisciplines }
     *     
     */
    public ArrayOfDEducationalCyclesPatternsAllDisciplines getEducationalCyclesPatternsAllDisciplinesGetResult() {
        return educationalCyclesPatternsAllDisciplinesGetResult;
    }

    /**
     * Sets the value of the educationalCyclesPatternsAllDisciplinesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesPatternsAllDisciplines }
     *     
     */
    public void setEducationalCyclesPatternsAllDisciplinesGetResult(ArrayOfDEducationalCyclesPatternsAllDisciplines value) {
        this.educationalCyclesPatternsAllDisciplinesGetResult = value;
    }

}
