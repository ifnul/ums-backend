
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
 *         &lt;element name="UniversityStateOrdersGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityStateOrders" minOccurs="0"/>
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
    "universityStateOrdersGetResult"
})
@XmlRootElement(name = "UniversityStateOrdersGetResponse")
public class UniversityStateOrdersGetResponse {

    @XmlElement(name = "UniversityStateOrdersGetResult")
    protected ArrayOfDUniversityStateOrders universityStateOrdersGetResult;

    /**
     * Gets the value of the universityStateOrdersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityStateOrders }
     *     
     */
    public ArrayOfDUniversityStateOrders getUniversityStateOrdersGetResult() {
        return universityStateOrdersGetResult;
    }

    /**
     * Sets the value of the universityStateOrdersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityStateOrders }
     *     
     */
    public void setUniversityStateOrdersGetResult(ArrayOfDUniversityStateOrders value) {
        this.universityStateOrdersGetResult = value;
    }

}
