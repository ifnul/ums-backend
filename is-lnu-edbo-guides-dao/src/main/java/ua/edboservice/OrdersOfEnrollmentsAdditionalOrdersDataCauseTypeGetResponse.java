
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
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult" type="{http://edboservice.ua/}ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType" minOccurs="0"/>
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
    "ordersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult"
})
@XmlRootElement(name = "OrdersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResponse")
public class OrdersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResponse {

    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult")
    protected ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType ordersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult;

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType }
     *     
     */
    public ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType getOrdersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult() {
        return ordersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult(ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType value) {
        this.ordersOfEnrollmentsAdditionalOrdersDataCauseTypeGetResult = value;
    }

}
