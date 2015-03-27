
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
 *         &lt;element name="DeliveryOfDocumentsImportTypeGetResult" type="{http://edboservice.ua/}ArrayOfDDeliveryOfDocumentsImportType" minOccurs="0"/>
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
    "deliveryOfDocumentsImportTypeGetResult"
})
@XmlRootElement(name = "DeliveryOfDocumentsImportTypeGetResponse")
public class DeliveryOfDocumentsImportTypeGetResponse {

    @XmlElement(name = "DeliveryOfDocumentsImportTypeGetResult")
    protected ArrayOfDDeliveryOfDocumentsImportType deliveryOfDocumentsImportTypeGetResult;

    /**
     * Gets the value of the deliveryOfDocumentsImportTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDeliveryOfDocumentsImportType }
     *     
     */
    public ArrayOfDDeliveryOfDocumentsImportType getDeliveryOfDocumentsImportTypeGetResult() {
        return deliveryOfDocumentsImportTypeGetResult;
    }

    /**
     * Sets the value of the deliveryOfDocumentsImportTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDeliveryOfDocumentsImportType }
     *     
     */
    public void setDeliveryOfDocumentsImportTypeGetResult(ArrayOfDDeliveryOfDocumentsImportType value) {
        this.deliveryOfDocumentsImportTypeGetResult = value;
    }

}
