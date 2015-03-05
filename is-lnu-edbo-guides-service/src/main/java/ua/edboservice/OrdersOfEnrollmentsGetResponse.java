
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
 *         &lt;element name="OrdersOfEnrollmentsGetResult" type="{http://edboservice.ua/}ArrayOfDOrdersOfEnrollments" minOccurs="0"/>
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
    "ordersOfEnrollmentsGetResult"
})
@XmlRootElement(name = "OrdersOfEnrollmentsGetResponse")
public class OrdersOfEnrollmentsGetResponse {

    @XmlElement(name = "OrdersOfEnrollmentsGetResult")
    protected ArrayOfDOrdersOfEnrollments ordersOfEnrollmentsGetResult;

    /**
     * Gets the value of the ordersOfEnrollmentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrdersOfEnrollments }
     *     
     */
    public ArrayOfDOrdersOfEnrollments getOrdersOfEnrollmentsGetResult() {
        return ordersOfEnrollmentsGetResult;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrdersOfEnrollments }
     *     
     */
    public void setOrdersOfEnrollmentsGetResult(ArrayOfDOrdersOfEnrollments value) {
        this.ordersOfEnrollmentsGetResult = value;
    }

}
