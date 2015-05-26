
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
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersGetResult" type="{http://edboservice.ua/}ArrayOfDOrdersOfEnrollmentsAdditionalOrders" minOccurs="0"/>
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
    "ordersOfEnrollmentsAdditionalOrdersGetResult"
})
@XmlRootElement(name = "OrdersOfEnrollmentsAdditionalOrdersGetResponse")
public class OrdersOfEnrollmentsAdditionalOrdersGetResponse {

    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersGetResult")
    protected ArrayOfDOrdersOfEnrollmentsAdditionalOrders ordersOfEnrollmentsAdditionalOrdersGetResult;

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrdersOfEnrollmentsAdditionalOrders }
     *     
     */
    public ArrayOfDOrdersOfEnrollmentsAdditionalOrders getOrdersOfEnrollmentsAdditionalOrdersGetResult() {
        return ordersOfEnrollmentsAdditionalOrdersGetResult;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrdersOfEnrollmentsAdditionalOrders }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersGetResult(ArrayOfDOrdersOfEnrollmentsAdditionalOrders value) {
        this.ordersOfEnrollmentsAdditionalOrdersGetResult = value;
    }

}
