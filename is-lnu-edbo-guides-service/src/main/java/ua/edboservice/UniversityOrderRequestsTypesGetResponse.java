
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
 *         &lt;element name="UniversityOrderRequestsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityOrderRequestsTypes" minOccurs="0"/>
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
    "universityOrderRequestsTypesGetResult"
})
@XmlRootElement(name = "UniversityOrderRequestsTypesGetResponse")
public class UniversityOrderRequestsTypesGetResponse {

    @XmlElement(name = "UniversityOrderRequestsTypesGetResult")
    protected ArrayOfDUniversityOrderRequestsTypes universityOrderRequestsTypesGetResult;

    /**
     * Gets the value of the universityOrderRequestsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityOrderRequestsTypes }
     *     
     */
    public ArrayOfDUniversityOrderRequestsTypes getUniversityOrderRequestsTypesGetResult() {
        return universityOrderRequestsTypesGetResult;
    }

    /**
     * Sets the value of the universityOrderRequestsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityOrderRequestsTypes }
     *     
     */
    public void setUniversityOrderRequestsTypesGetResult(ArrayOfDUniversityOrderRequestsTypes value) {
        this.universityOrderRequestsTypesGetResult = value;
    }

}
