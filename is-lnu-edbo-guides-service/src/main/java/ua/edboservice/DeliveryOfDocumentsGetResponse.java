
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
 *         &lt;element name="DeliveryOfDocumentsGetResult" type="{http://edboservice.ua/}ArrayOfDDeliveryOfDocuments" minOccurs="0"/>
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
    "deliveryOfDocumentsGetResult"
})
@XmlRootElement(name = "DeliveryOfDocumentsGetResponse")
public class DeliveryOfDocumentsGetResponse {

    @XmlElement(name = "DeliveryOfDocumentsGetResult")
    protected ArrayOfDDeliveryOfDocuments deliveryOfDocumentsGetResult;

    /**
     * Gets the value of the deliveryOfDocumentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDeliveryOfDocuments }
     *     
     */
    public ArrayOfDDeliveryOfDocuments getDeliveryOfDocumentsGetResult() {
        return deliveryOfDocumentsGetResult;
    }

    /**
     * Sets the value of the deliveryOfDocumentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDeliveryOfDocuments }
     *     
     */
    public void setDeliveryOfDocumentsGetResult(ArrayOfDDeliveryOfDocuments value) {
        this.deliveryOfDocumentsGetResult = value;
    }

}
