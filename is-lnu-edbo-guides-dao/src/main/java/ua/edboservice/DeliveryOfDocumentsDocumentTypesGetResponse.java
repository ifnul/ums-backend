
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
 *         &lt;element name="DeliveryOfDocumentsDocumentTypesGetResult" type="{http://edboservice.ua/}ArrayOfDDeliveryOfDocumentsDocumentTypes" minOccurs="0"/>
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
    "deliveryOfDocumentsDocumentTypesGetResult"
})
@XmlRootElement(name = "DeliveryOfDocumentsDocumentTypesGetResponse")
public class DeliveryOfDocumentsDocumentTypesGetResponse {

    @XmlElement(name = "DeliveryOfDocumentsDocumentTypesGetResult")
    protected ArrayOfDDeliveryOfDocumentsDocumentTypes deliveryOfDocumentsDocumentTypesGetResult;

    /**
     * Gets the value of the deliveryOfDocumentsDocumentTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDeliveryOfDocumentsDocumentTypes }
     *     
     */
    public ArrayOfDDeliveryOfDocumentsDocumentTypes getDeliveryOfDocumentsDocumentTypesGetResult() {
        return deliveryOfDocumentsDocumentTypesGetResult;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDocumentTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDeliveryOfDocumentsDocumentTypes }
     *     
     */
    public void setDeliveryOfDocumentsDocumentTypesGetResult(ArrayOfDDeliveryOfDocumentsDocumentTypes value) {
        this.deliveryOfDocumentsDocumentTypesGetResult = value;
    }

}
