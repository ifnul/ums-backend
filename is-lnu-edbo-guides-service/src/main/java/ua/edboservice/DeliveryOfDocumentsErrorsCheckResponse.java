
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
 *         &lt;element name="DeliveryOfDocumentsErrorsCheckResult" type="{http://edboservice.ua/}dDeliveryOfDocumentsErrors" minOccurs="0"/>
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
    "deliveryOfDocumentsErrorsCheckResult"
})
@XmlRootElement(name = "DeliveryOfDocumentsErrorsCheckResponse")
public class DeliveryOfDocumentsErrorsCheckResponse {

    @XmlElement(name = "DeliveryOfDocumentsErrorsCheckResult")
    protected DDeliveryOfDocumentsErrors deliveryOfDocumentsErrorsCheckResult;

    /**
     * Gets the value of the deliveryOfDocumentsErrorsCheckResult property.
     * 
     * @return
     *     possible object is
     *     {@link DDeliveryOfDocumentsErrors }
     *     
     */
    public DDeliveryOfDocumentsErrors getDeliveryOfDocumentsErrorsCheckResult() {
        return deliveryOfDocumentsErrorsCheckResult;
    }

    /**
     * Sets the value of the deliveryOfDocumentsErrorsCheckResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DDeliveryOfDocumentsErrors }
     *     
     */
    public void setDeliveryOfDocumentsErrorsCheckResult(DDeliveryOfDocumentsErrors value) {
        this.deliveryOfDocumentsErrorsCheckResult = value;
    }

}
