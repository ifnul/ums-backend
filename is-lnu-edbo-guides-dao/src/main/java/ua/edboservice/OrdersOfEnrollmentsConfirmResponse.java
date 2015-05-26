
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
 *         &lt;element name="OrdersOfEnrollmentsConfirmResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "ordersOfEnrollmentsConfirmResult"
})
@XmlRootElement(name = "OrdersOfEnrollmentsConfirmResponse")
public class OrdersOfEnrollmentsConfirmResponse {

    @XmlElement(name = "OrdersOfEnrollmentsConfirmResult")
    protected int ordersOfEnrollmentsConfirmResult;

    /**
     * Gets the value of the ordersOfEnrollmentsConfirmResult property.
     * 
     */
    public int getOrdersOfEnrollmentsConfirmResult() {
        return ordersOfEnrollmentsConfirmResult;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsConfirmResult property.
     * 
     */
    public void setOrdersOfEnrollmentsConfirmResult(int value) {
        this.ordersOfEnrollmentsConfirmResult = value;
    }

}
