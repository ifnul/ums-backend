
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
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDataGetResult" type="{http://edboservice.ua/}ArrayOfDOrdersOfEnrollmentsAdditionalOrdersData" minOccurs="0"/>
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
    "ordersOfEnrollmentsAdditionalOrdersDataGetResult"
})
@XmlRootElement(name = "OrdersOfEnrollmentsAdditionalOrdersDataGetResponse")
public class OrdersOfEnrollmentsAdditionalOrdersDataGetResponse {

    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDataGetResult")
    protected ArrayOfDOrdersOfEnrollmentsAdditionalOrdersData ordersOfEnrollmentsAdditionalOrdersDataGetResult;

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrdersOfEnrollmentsAdditionalOrdersData }
     *     
     */
    public ArrayOfDOrdersOfEnrollmentsAdditionalOrdersData getOrdersOfEnrollmentsAdditionalOrdersDataGetResult() {
        return ordersOfEnrollmentsAdditionalOrdersDataGetResult;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrdersOfEnrollmentsAdditionalOrdersData }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDataGetResult(ArrayOfDOrdersOfEnrollmentsAdditionalOrdersData value) {
        this.ordersOfEnrollmentsAdditionalOrdersDataGetResult = value;
    }

}
