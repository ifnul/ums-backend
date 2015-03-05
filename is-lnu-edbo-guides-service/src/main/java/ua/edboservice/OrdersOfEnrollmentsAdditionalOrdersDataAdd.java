
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
 *         &lt;element name="Id_OrderOfEnrollmentDatas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrdersDataCauseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDataCauseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idOrderOfEnrollmentDatas",
    "idOrdersOfEnrollmentsAdditionalOrdersDataCauseType",
    "ordersOfEnrollmentsAdditionalOrdersDataCauseDate"
})
@XmlRootElement(name = "OrdersOfEnrollmentsAdditionalOrdersDataAdd")
public class OrdersOfEnrollmentsAdditionalOrdersDataAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrders")
    protected int idOrdersOfEnrollmentsAdditionalOrders;
    @XmlElement(name = "Id_OrderOfEnrollmentDatas")
    protected String idOrderOfEnrollmentDatas;
    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrdersDataCauseType")
    protected int idOrdersOfEnrollmentsAdditionalOrdersDataCauseType;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDataCauseDate")
    protected String ordersOfEnrollmentsAdditionalOrdersDataCauseDate;

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
     * Gets the value of the idOrderOfEnrollmentDatas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOrderOfEnrollmentDatas() {
        return idOrderOfEnrollmentDatas;
    }

    /**
     * Sets the value of the idOrderOfEnrollmentDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOrderOfEnrollmentDatas(String value) {
        this.idOrderOfEnrollmentDatas = value;
    }

    /**
     * Gets the value of the idOrdersOfEnrollmentsAdditionalOrdersDataCauseType property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAdditionalOrdersDataCauseType() {
        return idOrdersOfEnrollmentsAdditionalOrdersDataCauseType;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAdditionalOrdersDataCauseType property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAdditionalOrdersDataCauseType(int value) {
        this.idOrdersOfEnrollmentsAdditionalOrdersDataCauseType = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersDataCauseDate() {
        return ordersOfEnrollmentsAdditionalOrdersDataCauseDate;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDataCauseDate(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersDataCauseDate = value;
    }

}
