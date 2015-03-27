
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_DeliveryOfDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DeliveryOfDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sessionGUID",
    "idDeliveryOfDocuments",
    "idDeliveryOfDocumentStatus"
})
@XmlRootElement(name = "DeliveryOfDocumentsStatusChange")
public class DeliveryOfDocumentsStatusChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_DeliveryOfDocuments")
    protected int idDeliveryOfDocuments;
    @XmlElement(name = "Id_DeliveryOfDocumentStatus")
    protected int idDeliveryOfDocumentStatus;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idDeliveryOfDocuments property.
     * 
     */
    public int getIdDeliveryOfDocuments() {
        return idDeliveryOfDocuments;
    }

    /**
     * Sets the value of the idDeliveryOfDocuments property.
     * 
     */
    public void setIdDeliveryOfDocuments(int value) {
        this.idDeliveryOfDocuments = value;
    }

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

}
