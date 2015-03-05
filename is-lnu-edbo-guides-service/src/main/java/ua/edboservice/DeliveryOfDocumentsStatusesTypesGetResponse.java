
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
 *         &lt;element name="DeliveryOfDocumentsStatusesTypesGetResult" type="{http://edboservice.ua/}ArrayOfDDeliveryOfDocumentsStatusesTypes" minOccurs="0"/>
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
    "deliveryOfDocumentsStatusesTypesGetResult"
})
@XmlRootElement(name = "DeliveryOfDocumentsStatusesTypesGetResponse")
public class DeliveryOfDocumentsStatusesTypesGetResponse {

    @XmlElement(name = "DeliveryOfDocumentsStatusesTypesGetResult")
    protected ArrayOfDDeliveryOfDocumentsStatusesTypes deliveryOfDocumentsStatusesTypesGetResult;

    /**
     * Gets the value of the deliveryOfDocumentsStatusesTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDeliveryOfDocumentsStatusesTypes }
     *     
     */
    public ArrayOfDDeliveryOfDocumentsStatusesTypes getDeliveryOfDocumentsStatusesTypesGetResult() {
        return deliveryOfDocumentsStatusesTypesGetResult;
    }

    /**
     * Sets the value of the deliveryOfDocumentsStatusesTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDeliveryOfDocumentsStatusesTypes }
     *     
     */
    public void setDeliveryOfDocumentsStatusesTypesGetResult(ArrayOfDDeliveryOfDocumentsStatusesTypes value) {
        this.deliveryOfDocumentsStatusesTypesGetResult = value;
    }

}
