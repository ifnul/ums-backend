
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
 *         &lt;element name="UniversityStructureSpecialitiesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityStructureSpecialities" minOccurs="0"/>
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
    "universityStructureSpecialitiesGetResult"
})
@XmlRootElement(name = "UniversityStructureSpecialitiesGetResponse")
public class UniversityStructureSpecialitiesGetResponse {

    @XmlElement(name = "UniversityStructureSpecialitiesGetResult")
    protected ArrayOfDUniversityStructureSpecialities universityStructureSpecialitiesGetResult;

    /**
     * Gets the value of the universityStructureSpecialitiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityStructureSpecialities }
     *     
     */
    public ArrayOfDUniversityStructureSpecialities getUniversityStructureSpecialitiesGetResult() {
        return universityStructureSpecialitiesGetResult;
    }

    /**
     * Sets the value of the universityStructureSpecialitiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityStructureSpecialities }
     *     
     */
    public void setUniversityStructureSpecialitiesGetResult(ArrayOfDUniversityStructureSpecialities value) {
        this.universityStructureSpecialitiesGetResult = value;
    }

}
