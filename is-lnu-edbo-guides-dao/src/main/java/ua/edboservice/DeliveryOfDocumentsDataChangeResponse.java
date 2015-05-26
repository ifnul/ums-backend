
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
 *         &lt;element name="DeliveryOfDocumentsDataChangeResult" type="{http://edboservice.ua/}ArrayOfDDeliveryOfDocumentsRetun" minOccurs="0"/>
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
    "deliveryOfDocumentsDataChangeResult"
})
@XmlRootElement(name = "DeliveryOfDocumentsDataChangeResponse")
public class DeliveryOfDocumentsDataChangeResponse {

    @XmlElement(name = "DeliveryOfDocumentsDataChangeResult")
    protected ArrayOfDDeliveryOfDocumentsRetun deliveryOfDocumentsDataChangeResult;

    /**
     * Gets the value of the deliveryOfDocumentsDataChangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDeliveryOfDocumentsRetun }
     *     
     */
    public ArrayOfDDeliveryOfDocumentsRetun getDeliveryOfDocumentsDataChangeResult() {
        return deliveryOfDocumentsDataChangeResult;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDataChangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDeliveryOfDocumentsRetun }
     *     
     */
    public void setDeliveryOfDocumentsDataChangeResult(ArrayOfDDeliveryOfDocumentsRetun value) {
        this.deliveryOfDocumentsDataChangeResult = value;
    }

}
