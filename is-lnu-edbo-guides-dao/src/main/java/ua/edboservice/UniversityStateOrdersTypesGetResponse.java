
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
 *         &lt;element name="UniversityStateOrdersTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityStateOrdersTypes" minOccurs="0"/>
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
    "universityStateOrdersTypesGetResult"
})
@XmlRootElement(name = "UniversityStateOrdersTypesGetResponse")
public class UniversityStateOrdersTypesGetResponse {

    @XmlElement(name = "UniversityStateOrdersTypesGetResult")
    protected ArrayOfDUniversityStateOrdersTypes universityStateOrdersTypesGetResult;

    /**
     * Gets the value of the universityStateOrdersTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityStateOrdersTypes }
     *     
     */
    public ArrayOfDUniversityStateOrdersTypes getUniversityStateOrdersTypesGetResult() {
        return universityStateOrdersTypesGetResult;
    }

    /**
     * Sets the value of the universityStateOrdersTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityStateOrdersTypes }
     *     
     */
    public void setUniversityStateOrdersTypesGetResult(ArrayOfDUniversityStateOrdersTypes value) {
        this.universityStateOrdersTypesGetResult = value;
    }

}
