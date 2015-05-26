
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
 *         &lt;element name="DeliveryOfDocumentsDataPersonsFindResult" type="{http://edboservice.ua/}ArrayOfDDeliveryOfDocumentsData" minOccurs="0"/>
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
    "deliveryOfDocumentsDataPersonsFindResult"
})
@XmlRootElement(name = "DeliveryOfDocumentsDataPersonsFindResponse")
public class DeliveryOfDocumentsDataPersonsFindResponse {

    @XmlElement(name = "DeliveryOfDocumentsDataPersonsFindResult")
    protected ArrayOfDDeliveryOfDocumentsData deliveryOfDocumentsDataPersonsFindResult;

    /**
     * Gets the value of the deliveryOfDocumentsDataPersonsFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDeliveryOfDocumentsData }
     *     
     */
    public ArrayOfDDeliveryOfDocumentsData getDeliveryOfDocumentsDataPersonsFindResult() {
        return deliveryOfDocumentsDataPersonsFindResult;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDataPersonsFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDeliveryOfDocumentsData }
     *     
     */
    public void setDeliveryOfDocumentsDataPersonsFindResult(ArrayOfDDeliveryOfDocumentsData value) {
        this.deliveryOfDocumentsDataPersonsFindResult = value;
    }

}
