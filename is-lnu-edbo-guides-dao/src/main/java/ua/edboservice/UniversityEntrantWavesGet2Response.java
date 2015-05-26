
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
 *         &lt;element name="UniversityEntrantWavesGet2Result" type="{http://edboservice.ua/}ArrayOfDUniversityEntrantWaves2" minOccurs="0"/>
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
    "universityEntrantWavesGet2Result"
})
@XmlRootElement(name = "UniversityEntrantWavesGet2Response")
public class UniversityEntrantWavesGet2Response {

    @XmlElement(name = "UniversityEntrantWavesGet2Result")
    protected ArrayOfDUniversityEntrantWaves2 universityEntrantWavesGet2Result;

    /**
     * Gets the value of the universityEntrantWavesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityEntrantWaves2 }
     *     
     */
    public ArrayOfDUniversityEntrantWaves2 getUniversityEntrantWavesGet2Result() {
        return universityEntrantWavesGet2Result;
    }

    /**
     * Sets the value of the universityEntrantWavesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityEntrantWaves2 }
     *     
     */
    public void setUniversityEntrantWavesGet2Result(ArrayOfDUniversityEntrantWaves2 value) {
        this.universityEntrantWavesGet2Result = value;
    }

}
