
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
 *         &lt;element name="DeliveryOfDocumentsDataFindResult" type="{http://edboservice.ua/}ArrayOfDDeliveryOfDocumentsData" minOccurs="0"/>
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
    "deliveryOfDocumentsDataFindResult"
})
@XmlRootElement(name = "DeliveryOfDocumentsDataFindResponse")
public class DeliveryOfDocumentsDataFindResponse {

    @XmlElement(name = "DeliveryOfDocumentsDataFindResult")
    protected ArrayOfDDeliveryOfDocumentsData deliveryOfDocumentsDataFindResult;

    /**
     * Gets the value of the deliveryOfDocumentsDataFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDeliveryOfDocumentsData }
     *     
     */
    public ArrayOfDDeliveryOfDocumentsData getDeliveryOfDocumentsDataFindResult() {
        return deliveryOfDocumentsDataFindResult;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDataFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDeliveryOfDocumentsData }
     *     
     */
    public void setDeliveryOfDocumentsDataFindResult(ArrayOfDDeliveryOfDocumentsData value) {
        this.deliveryOfDocumentsDataFindResult = value;
    }

}
