
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
 *         &lt;element name="OrdersOfEnrollmentsAcessesGetResult" type="{http://edboservice.ua/}ArrayOfDOrdersOfEnrollmentsAcesses" minOccurs="0"/>
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
    "ordersOfEnrollmentsAcessesGetResult"
})
@XmlRootElement(name = "OrdersOfEnrollmentsAcessesGetResponse")
public class OrdersOfEnrollmentsAcessesGetResponse {

    @XmlElement(name = "OrdersOfEnrollmentsAcessesGetResult")
    protected ArrayOfDOrdersOfEnrollmentsAcesses ordersOfEnrollmentsAcessesGetResult;

    /**
     * Gets the value of the ordersOfEnrollmentsAcessesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrdersOfEnrollmentsAcesses }
     *     
     */
    public ArrayOfDOrdersOfEnrollmentsAcesses getOrdersOfEnrollmentsAcessesGetResult() {
        return ordersOfEnrollmentsAcessesGetResult;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAcessesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrdersOfEnrollmentsAcesses }
     *     
     */
    public void setOrdersOfEnrollmentsAcessesGetResult(ArrayOfDOrdersOfEnrollmentsAcesses value) {
        this.ordersOfEnrollmentsAcessesGetResult = value;
    }

}
