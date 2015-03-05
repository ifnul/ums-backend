
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
 *         &lt;element name="StateOrdersDataGetResult" type="{http://edboservice.ua/}ArrayOfDStateOrdersData" minOccurs="0"/>
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
    "stateOrdersDataGetResult"
})
@XmlRootElement(name = "StateOrdersDataGetResponse")
public class StateOrdersDataGetResponse {

    @XmlElement(name = "StateOrdersDataGetResult")
    protected ArrayOfDStateOrdersData stateOrdersDataGetResult;

    /**
     * Gets the value of the stateOrdersDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDStateOrdersData }
     *     
     */
    public ArrayOfDStateOrdersData getStateOrdersDataGetResult() {
        return stateOrdersDataGetResult;
    }

    /**
     * Sets the value of the stateOrdersDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDStateOrdersData }
     *     
     */
    public void setStateOrdersDataGetResult(ArrayOfDStateOrdersData value) {
        this.stateOrdersDataGetResult = value;
    }

}
