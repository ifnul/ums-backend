
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
 *         &lt;element name="UniversityFacultetSpecialitiesWavesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetSpecialitiesWaves" minOccurs="0"/>
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
    "universityFacultetSpecialitiesWavesGetResult"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesWavesGetResponse")
public class UniversityFacultetSpecialitiesWavesGetResponse {

    @XmlElement(name = "UniversityFacultetSpecialitiesWavesGetResult")
    protected ArrayOfDUniversityFacultetSpecialitiesWaves universityFacultetSpecialitiesWavesGetResult;

    /**
     * Gets the value of the universityFacultetSpecialitiesWavesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesWaves }
     *     
     */
    public ArrayOfDUniversityFacultetSpecialitiesWaves getUniversityFacultetSpecialitiesWavesGetResult() {
        return universityFacultetSpecialitiesWavesGetResult;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesWavesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesWaves }
     *     
     */
    public void setUniversityFacultetSpecialitiesWavesGetResult(ArrayOfDUniversityFacultetSpecialitiesWaves value) {
        this.universityFacultetSpecialitiesWavesGetResult = value;
    }

}
