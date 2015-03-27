
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
 *         &lt;element name="UniversityRegistrationsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityRegistrationsTypes" minOccurs="0"/>
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
    "universityRegistrationsTypesGetResult"
})
@XmlRootElement(name = "UniversityRegistrationsTypesGetResponse")
public class UniversityRegistrationsTypesGetResponse {

    @XmlElement(name = "UniversityRegistrationsTypesGetResult")
    protected ArrayOfDUniversityRegistrationsTypes universityRegistrationsTypesGetResult;

    /**
     * Gets the value of the universityRegistrationsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityRegistrationsTypes }
     *     
     */
    public ArrayOfDUniversityRegistrationsTypes getUniversityRegistrationsTypesGetResult() {
        return universityRegistrationsTypesGetResult;
    }

    /**
     * Sets the value of the universityRegistrationsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityRegistrationsTypes }
     *     
     */
    public void setUniversityRegistrationsTypesGetResult(ArrayOfDUniversityRegistrationsTypes value) {
        this.universityRegistrationsTypesGetResult = value;
    }

}
