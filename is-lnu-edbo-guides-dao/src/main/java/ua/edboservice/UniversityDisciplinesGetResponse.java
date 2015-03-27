
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
 *         &lt;element name="UniversityDisciplinesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityDiscipline" minOccurs="0"/>
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
    "universityDisciplinesGetResult"
})
@XmlRootElement(name = "UniversityDisciplinesGetResponse")
public class UniversityDisciplinesGetResponse {

    @XmlElement(name = "UniversityDisciplinesGetResult")
    protected ArrayOfDUniversityDiscipline universityDisciplinesGetResult;

    /**
     * Gets the value of the universityDisciplinesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityDiscipline }
     *     
     */
    public ArrayOfDUniversityDiscipline getUniversityDisciplinesGetResult() {
        return universityDisciplinesGetResult;
    }

    /**
     * Sets the value of the universityDisciplinesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityDiscipline }
     *     
     */
    public void setUniversityDisciplinesGetResult(ArrayOfDUniversityDiscipline value) {
        this.universityDisciplinesGetResult = value;
    }

}
