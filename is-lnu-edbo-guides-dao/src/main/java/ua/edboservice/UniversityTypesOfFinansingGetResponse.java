
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
 *         &lt;element name="UniversityTypesOfFinansingGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityTypesOfFinansing" minOccurs="0"/>
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
    "universityTypesOfFinansingGetResult"
})
@XmlRootElement(name = "UniversityTypesOfFinansingGetResponse")
public class UniversityTypesOfFinansingGetResponse {

    @XmlElement(name = "UniversityTypesOfFinansingGetResult")
    protected ArrayOfDUniversityTypesOfFinansing universityTypesOfFinansingGetResult;

    /**
     * Gets the value of the universityTypesOfFinansingGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityTypesOfFinansing }
     *     
     */
    public ArrayOfDUniversityTypesOfFinansing getUniversityTypesOfFinansingGetResult() {
        return universityTypesOfFinansingGetResult;
    }

    /**
     * Sets the value of the universityTypesOfFinansingGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityTypesOfFinansing }
     *     
     */
    public void setUniversityTypesOfFinansingGetResult(ArrayOfDUniversityTypesOfFinansing value) {
        this.universityTypesOfFinansingGetResult = value;
    }

}
