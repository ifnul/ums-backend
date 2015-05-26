
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
 *         &lt;element name="OrdersOfEnrollmentsDataGetResult" type="{http://edboservice.ua/}ArrayOfDOrdersOfEnrollmentsData" minOccurs="0"/>
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
    "ordersOfEnrollmentsDataGetResult"
})
@XmlRootElement(name = "OrdersOfEnrollmentsDataGetResponse")
public class OrdersOfEnrollmentsDataGetResponse {

    @XmlElement(name = "OrdersOfEnrollmentsDataGetResult")
    protected ArrayOfDOrdersOfEnrollmentsData ordersOfEnrollmentsDataGetResult;

    /**
     * Gets the value of the ordersOfEnrollmentsDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrdersOfEnrollmentsData }
     *     
     */
    public ArrayOfDOrdersOfEnrollmentsData getOrdersOfEnrollmentsDataGetResult() {
        return ordersOfEnrollmentsDataGetResult;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrdersOfEnrollmentsData }
     *     
     */
    public void setOrdersOfEnrollmentsDataGetResult(ArrayOfDOrdersOfEnrollmentsData value) {
        this.ordersOfEnrollmentsDataGetResult = value;
    }

}
