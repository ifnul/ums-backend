
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
 *         &lt;element name="OrdersOfEnrollmentsDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "ordersOfEnrollmentsDelResult"
})
@XmlRootElement(name = "OrdersOfEnrollmentsDelResponse")
public class OrdersOfEnrollmentsDelResponse {

    @XmlElement(name = "OrdersOfEnrollmentsDelResult")
    protected int ordersOfEnrollmentsDelResult;

    /**
     * Gets the value of the ordersOfEnrollmentsDelResult property.
     * 
     */
    public int getOrdersOfEnrollmentsDelResult() {
        return ordersOfEnrollmentsDelResult;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsDelResult property.
     * 
     */
    public void setOrdersOfEnrollmentsDelResult(int value) {
        this.ordersOfEnrollmentsDelResult = value;
    }

}
