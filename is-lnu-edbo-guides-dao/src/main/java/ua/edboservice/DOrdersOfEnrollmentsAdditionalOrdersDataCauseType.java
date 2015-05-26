
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dOrdersOfEnrollmentsAdditionalOrdersDataCauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrdersOfEnrollmentsAdditionalOrdersDataCauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrdersDataCauseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDataCauseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrdersOfEnrollmentsAdditionalOrdersDataCauseType", propOrder = {
    "idOrdersOfEnrollmentsAdditionalOrdersDataCauseType",
    "ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName"
})
public class DOrdersOfEnrollmentsAdditionalOrdersDataCauseType {

    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrdersDataCauseType")
    protected int idOrdersOfEnrollmentsAdditionalOrdersDataCauseType;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDataCauseTypeName")
    protected String ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName;

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
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersDataCauseTypeName() {
        return ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDataCauseTypeName(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName = value;
    }

}
