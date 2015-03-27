
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
 *         &lt;element name="EducationalCyclesPatternDisciplinesGroupsGetResult" type="{http://edboservice.ua/}ArrayOfDEducationalCyclesPatternDisciplinesGroups" minOccurs="0"/>
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
    "educationalCyclesPatternDisciplinesGroupsGetResult"
})
@XmlRootElement(name = "EducationalCyclesPatternDisciplinesGroupsGetResponse")
public class EducationalCyclesPatternDisciplinesGroupsGetResponse {

    @XmlElement(name = "EducationalCyclesPatternDisciplinesGroupsGetResult")
    protected ArrayOfDEducationalCyclesPatternDisciplinesGroups educationalCyclesPatternDisciplinesGroupsGetResult;

    /**
     * Gets the value of the educationalCyclesPatternDisciplinesGroupsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationalCyclesPatternDisciplinesGroups }
     *     
     */
    public ArrayOfDEducationalCyclesPatternDisciplinesGroups getEducationalCyclesPatternDisciplinesGroupsGetResult() {
        return educationalCyclesPatternDisciplinesGroupsGetResult;
    }

    /**
     * Sets the value of the educationalCyclesPatternDisciplinesGroupsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationalCyclesPatternDisciplinesGroups }
     *     
     */
    public void setEducationalCyclesPatternDisciplinesGroupsGetResult(ArrayOfDEducationalCyclesPatternDisciplinesGroups value) {
        this.educationalCyclesPatternDisciplinesGroupsGetResult = value;
    }

}
