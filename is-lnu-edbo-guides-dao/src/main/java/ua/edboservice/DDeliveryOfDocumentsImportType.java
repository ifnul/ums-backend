
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dDeliveryOfDocumentsImportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDeliveryOfDocumentsImportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_DeliveryOfDocumentsImportType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryOfDocumentsImportTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDeliveryOfDocumentsImportType", propOrder = {
    "idDeliveryOfDocumentsImportType",
    "deliveryOfDocumentsImportTypeName"
})
public class DDeliveryOfDocumentsImportType {

    @XmlElement(name = "Id_DeliveryOfDocumentsImportType")
    protected int idDeliveryOfDocumentsImportType;
    @XmlElement(name = "DeliveryOfDocumentsImportTypeName")
    protected String deliveryOfDocumentsImportTypeName;

    /**
     * Gets the value of the idDeliveryOfDocumentsImportType property.
     * 
     */
    public int getIdDeliveryOfDocumentsImportType() {
        return idDeliveryOfDocumentsImportType;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsImportType property.
     * 
     */
    public void setIdDeliveryOfDocumentsImportType(int value) {
        this.idDeliveryOfDocumentsImportType = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsImportTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOfDocumentsImportTypeName() {
        return deliveryOfDocumentsImportTypeName;
    }

    /**
     * Sets the value of the deliveryOfDocumentsImportTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOfDocumentsImportTypeName(String value) {
        this.deliveryOfDocumentsImportTypeName = value;
    }

}
