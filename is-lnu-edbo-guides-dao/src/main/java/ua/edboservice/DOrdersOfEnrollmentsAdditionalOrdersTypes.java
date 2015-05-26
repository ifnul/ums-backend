
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dOrdersOfEnrollmentsAdditionalOrdersTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrdersOfEnrollmentsAdditionalOrdersTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrdersTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrdersOfEnrollmentsAdditionalOrdersTypes", propOrder = {
    "idOrdersOfEnrollmentsAdditionalOrdersTypes",
    "ordersOfEnrollmentsAdditionalOrdersTypesName"
})
public class DOrdersOfEnrollmentsAdditionalOrdersTypes {

    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrdersTypes")
    protected int idOrdersOfEnrollmentsAdditionalOrdersTypes;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersTypesName")
    protected String ordersOfEnrollmentsAdditionalOrdersTypesName;

    /**
     * Gets the value of the idOrdersOfEnrollmentsAdditionalOrdersTypes property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAdditionalOrdersTypes() {
        return idOrdersOfEnrollmentsAdditionalOrdersTypes;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAdditionalOrdersTypes property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAdditionalOrdersTypes(int value) {
        this.idOrdersOfEnrollmentsAdditionalOrdersTypes = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersTypesName() {
        return ordersOfEnrollmentsAdditionalOrdersTypesName;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersTypesName(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersTypesName = value;
    }

}
