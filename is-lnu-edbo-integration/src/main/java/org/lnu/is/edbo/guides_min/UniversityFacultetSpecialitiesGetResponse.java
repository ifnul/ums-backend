
package org.lnu.is.edbo.guides_min;

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
 *         &lt;element name="UniversityFacultetSpecialitiesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetSpecialities" minOccurs="0"/>
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
    "universityFacultetSpecialitiesGetResult"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesGetResponse")
public class UniversityFacultetSpecialitiesGetResponse {

    @XmlElement(name = "UniversityFacultetSpecialitiesGetResult")
    protected ArrayOfDUniversityFacultetSpecialities universityFacultetSpecialitiesGetResult;

    /**
     * Gets the value of the universityFacultetSpecialitiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetSpecialities }
     *     
     */
    public ArrayOfDUniversityFacultetSpecialities getUniversityFacultetSpecialitiesGetResult() {
        return universityFacultetSpecialitiesGetResult;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetSpecialities }
     *     
     */
    public void setUniversityFacultetSpecialitiesGetResult(ArrayOfDUniversityFacultetSpecialities value) {
        this.universityFacultetSpecialitiesGetResult = value;
    }

}
