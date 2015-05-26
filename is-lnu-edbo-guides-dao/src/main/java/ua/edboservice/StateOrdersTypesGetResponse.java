
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
 *         &lt;element name="StateOrdersTypesGetResult" type="{http://edboservice.ua/}ArrayOfDStateOrdersTypes" minOccurs="0"/>
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
    "stateOrdersTypesGetResult"
})
@XmlRootElement(name = "StateOrdersTypesGetResponse")
public class StateOrdersTypesGetResponse {

    @XmlElement(name = "StateOrdersTypesGetResult")
    protected ArrayOfDStateOrdersTypes stateOrdersTypesGetResult;

    /**
     * Gets the value of the stateOrdersTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDStateOrdersTypes }
     *     
     */
    public ArrayOfDStateOrdersTypes getStateOrdersTypesGetResult() {
        return stateOrdersTypesGetResult;
    }

    /**
     * Sets the value of the stateOrdersTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDStateOrdersTypes }
     *     
     */
    public void setStateOrdersTypesGetResult(ArrayOfDStateOrdersTypes value) {
        this.stateOrdersTypesGetResult = value;
    }

}
