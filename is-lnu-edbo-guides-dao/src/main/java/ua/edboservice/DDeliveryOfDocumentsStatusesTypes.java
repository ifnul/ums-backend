
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dDeliveryOfDocumentsStatusesTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDeliveryOfDocumentsStatusesTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_DeliveryOfDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryOfDocumentStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDeliveryOfDocumentsStatusesTypes", propOrder = {
    "idDeliveryOfDocumentStatus",
    "deliveryOfDocumentStatusName"
})
public class DDeliveryOfDocumentsStatusesTypes {

    @XmlElement(name = "Id_DeliveryOfDocumentStatus")
    protected int idDeliveryOfDocumentStatus;
    @XmlElement(name = "DeliveryOfDocumentStatusName")
    protected String deliveryOfDocumentStatusName;

    /**
     * Gets the value of the idDeliveryOfDocumentStatus property.
     * 
     */
    public int getIdDeliveryOfDocumentStatus() {
        return idDeliveryOfDocumentStatus;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentStatus property.
     * 
     */
    public void setIdDeliveryOfDocumentStatus(int value) {
        this.idDeliveryOfDocumentStatus = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOfDocumentStatusName() {
        return deliveryOfDocumentStatusName;
    }

    /**
     * Sets the value of the deliveryOfDocumentStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOfDocumentStatusName(String value) {
        this.deliveryOfDocumentStatusName = value;
    }

}
