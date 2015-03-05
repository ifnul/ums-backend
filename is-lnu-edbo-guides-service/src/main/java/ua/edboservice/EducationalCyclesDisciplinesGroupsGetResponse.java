
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
 *         &lt;element name="EducationalCyclesDisciplinesGroupsGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCyclesDisciplinesGroups" minOccurs="0"/>
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
    "educationalCyclesDisciplinesGroupsGetResult"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesGroupsGetResponse")
public class EducationalCyclesDisciplinesGroupsGetResponse {

    @XmlElement(name = "EducationalCyclesDisciplinesGroupsGetResult")
    protected ArrayOfDEducationalCyclesDisciplinesGroups educationalCyclesDisciplinesGroupsGetResult;

    /**
     * Gets the value of the educationalCyclesDisciplinesGroupsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesDisciplinesGroups }
     *     
     */
    public ArrayOfDEducationalCyclesDisciplinesGroups getEducationalCyclesDisciplinesGroupsGetResult() {
        return educationalCyclesDisciplinesGroupsGetResult;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesGroupsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesDisciplinesGroups }
     *     
     */
    public void setEducationalCyclesDisciplinesGroupsGetResult(ArrayOfDEducationalCyclesDisciplinesGroups value) {
        this.educationalCyclesDisciplinesGroupsGetResult = value;
    }

}
