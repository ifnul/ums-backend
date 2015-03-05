
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
 *         &lt;element name="StreetTypesGetResult" type="{http://edboservice.ua/}ArrayOfDStreetTypes" minOccurs="0"/>
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
    "streetTypesGetResult"
})
@XmlRootElement(name = "StreetTypesGetResponse")
public class StreetTypesGetResponse {

    @XmlElement(name = "StreetTypesGetResult")
    protected ArrayOfDStreetTypes streetTypesGetResult;

    /**
     * Gets the value of the streetTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDStreetTypes }
     *     
     */
    public ArrayOfDStreetTypes getStreetTypesGetResult() {
        return streetTypesGetResult;
    }

    /**
     * Sets the value of the streetTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDStreetTypes }
     *     
     */
    public void setStreetTypesGetResult(ArrayOfDStreetTypes value) {
        this.streetTypesGetResult = value;
    }

}
