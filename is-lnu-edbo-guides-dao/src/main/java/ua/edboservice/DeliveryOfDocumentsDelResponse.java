
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
 *         &lt;element name="DeliveryOfDocumentsDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "deliveryOfDocumentsDelResult"
})
@XmlRootElement(name = "DeliveryOfDocumentsDelResponse")
public class DeliveryOfDocumentsDelResponse {

    @XmlElement(name = "DeliveryOfDocumentsDelResult")
    protected int deliveryOfDocumentsDelResult;

    /**
     * Gets the value of the deliveryOfDocumentsDelResult property.
     * 
     */
    public int getDeliveryOfDocumentsDelResult() {
        return deliveryOfDocumentsDelResult;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDelResult property.
     * 
     */
    public void setDeliveryOfDocumentsDelResult(int value) {
        this.deliveryOfDocumentsDelResult = value;
    }

}
