
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionGUID",
    "idOrdersOfEnrollmentsAdditionalOrders",
    "ordersOfEnrollmentsAdditionalOrdersNumber",
    "ordersOfEnrollmentsAdditionalOrdersDate"
})
@XmlRootElement(name = "OrdersOfEnrollmentsAdditionalOrdersEdit")
public class OrdersOfEnrollmentsAdditionalOrdersEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrders")
    protected int idOrdersOfEnrollmentsAdditionalOrders;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersNumber")
    protected String ordersOfEnrollmentsAdditionalOrdersNumber;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDate")
    protected String ordersOfEnrollmentsAdditionalOrdersDate;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idOrdersOfEnrollmentsAdditionalOrders property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAdditionalOrders() {
        return idOrdersOfEnrollmentsAdditionalOrders;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAdditionalOrders property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAdditionalOrders(int value) {
        this.idOrdersOfEnrollmentsAdditionalOrders = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersNumber() {
        return ordersOfEnrollmentsAdditionalOrdersNumber;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersNumber(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersNumber = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersDate() {
        return ordersOfEnrollmentsAdditionalOrdersDate;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDate(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersDate = value;
    }

}
