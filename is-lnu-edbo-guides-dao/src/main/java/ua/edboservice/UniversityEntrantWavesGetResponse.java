
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
 *         &lt;element name="UniversityEntrantWavesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityEntrantWaves" minOccurs="0"/>
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
    "universityEntrantWavesGetResult"
})
@XmlRootElement(name = "UniversityEntrantWavesGetResponse")
public class UniversityEntrantWavesGetResponse {

    @XmlElement(name = "UniversityEntrantWavesGetResult")
    protected ArrayOfDUniversityEntrantWaves universityEntrantWavesGetResult;

    /**
     * Gets the value of the universityEntrantWavesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityEntrantWaves }
     *     
     */
    public ArrayOfDUniversityEntrantWaves getUniversityEntrantWavesGetResult() {
        return universityEntrantWavesGetResult;
    }

    /**
     * Sets the value of the universityEntrantWavesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityEntrantWaves }
     *     
     */
    public void setUniversityEntrantWavesGetResult(ArrayOfDUniversityEntrantWaves value) {
        this.universityEntrantWavesGetResult = value;
    }

}
