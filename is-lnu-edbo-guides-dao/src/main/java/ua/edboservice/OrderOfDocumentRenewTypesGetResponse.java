
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
 *         &lt;element name="OrderOfDocumentRenewTypesGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentRenewTypes" minOccurs="0"/>
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
    "orderOfDocumentRenewTypesGetResult"
})
@XmlRootElement(name = "OrderOfDocumentRenewTypesGetResponse")
public class OrderOfDocumentRenewTypesGetResponse {

    @XmlElement(name = "OrderOfDocumentRenewTypesGetResult")
    protected ArrayOfDOrderOfDocumentRenewTypes orderOfDocumentRenewTypesGetResult;

    /**
     * Gets the value of the orderOfDocumentRenewTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentRenewTypes }
     *     
     */
    public ArrayOfDOrderOfDocumentRenewTypes getOrderOfDocumentRenewTypesGetResult() {
        return orderOfDocumentRenewTypesGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentRenewTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentRenewTypes }
     *     
     */
    public void setOrderOfDocumentRenewTypesGetResult(ArrayOfDOrderOfDocumentRenewTypes value) {
        this.orderOfDocumentRenewTypesGetResult = value;
    }

}
