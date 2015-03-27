
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
 *         &lt;element name="StateOrdersGetResult" type="{http://edboservice.ua/}ArrayOfDStateOrders" minOccurs="0"/>
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
    "stateOrdersGetResult"
})
@XmlRootElement(name = "StateOrdersGetResponse")
public class StateOrdersGetResponse {

    @XmlElement(name = "StateOrdersGetResult")
    protected ArrayOfDStateOrders stateOrdersGetResult;

    /**
     * Gets the value of the stateOrdersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDStateOrders }
     *     
     */
    public ArrayOfDStateOrders getStateOrdersGetResult() {
        return stateOrdersGetResult;
    }

    /**
     * Sets the value of the stateOrdersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDStateOrders }
     *     
     */
    public void setStateOrdersGetResult(ArrayOfDStateOrders value) {
        this.stateOrdersGetResult = value;
    }

}
