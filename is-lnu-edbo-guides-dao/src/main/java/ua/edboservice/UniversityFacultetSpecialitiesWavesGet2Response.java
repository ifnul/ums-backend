
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
 *         &lt;element name="UniversityFacultetSpecialitiesWavesGet2Result" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetSpecialitiesWaves2" minOccurs="0"/>
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
    "universityFacultetSpecialitiesWavesGet2Result"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesWavesGet2Response")
public class UniversityFacultetSpecialitiesWavesGet2Response {

    @XmlElement(name = "UniversityFacultetSpecialitiesWavesGet2Result")
    protected ArrayOfDUniversityFacultetSpecialitiesWaves2 universityFacultetSpecialitiesWavesGet2Result;

    /**
     * Gets the value of the universityFacultetSpecialitiesWavesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesWaves2 }
     *     
     */
    public ArrayOfDUniversityFacultetSpecialitiesWaves2 getUniversityFacultetSpecialitiesWavesGet2Result() {
        return universityFacultetSpecialitiesWavesGet2Result;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesWavesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesWaves2 }
     *     
     */
    public void setUniversityFacultetSpecialitiesWavesGet2Result(ArrayOfDUniversityFacultetSpecialitiesWaves2 value) {
        this.universityFacultetSpecialitiesWavesGet2Result = value;
    }

}
