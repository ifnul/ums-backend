
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
 *         &lt;element name="UniversityRegistrationsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityRegistrations" minOccurs="0"/>
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
    "universityRegistrationsGetResult"
})
@XmlRootElement(name = "UniversityRegistrationsGetResponse")
public class UniversityRegistrationsGetResponse {

    @XmlElement(name = "UniversityRegistrationsGetResult")
    protected ArrayOfDUniversityRegistrations universityRegistrationsGetResult;

    /**
     * Gets the value of the universityRegistrationsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityRegistrations }
     *     
     */
    public ArrayOfDUniversityRegistrations getUniversityRegistrationsGetResult() {
        return universityRegistrationsGetResult;
    }

    /**
     * Sets the value of the universityRegistrationsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityRegistrations }
     *     
     */
    public void setUniversityRegistrationsGetResult(ArrayOfDUniversityRegistrations value) {
        this.universityRegistrationsGetResult = value;
    }

}
