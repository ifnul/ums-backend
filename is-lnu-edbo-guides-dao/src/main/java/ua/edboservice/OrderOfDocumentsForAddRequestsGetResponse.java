
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
 *         &lt;element name="OrderOfDocumentsForAddRequestsGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsForAddRequests" minOccurs="0"/>
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
    "orderOfDocumentsForAddRequestsGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsForAddRequestsGetResponse")
public class OrderOfDocumentsForAddRequestsGetResponse {

    @XmlElement(name = "OrderOfDocumentsForAddRequestsGetResult")
    protected ArrayOfDOrderOfDocumentsForAddRequests orderOfDocumentsForAddRequestsGetResult;

    /**
     * Gets the value of the orderOfDocumentsForAddRequestsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsForAddRequests }
     *     
     */
    public ArrayOfDOrderOfDocumentsForAddRequests getOrderOfDocumentsForAddRequestsGetResult() {
        return orderOfDocumentsForAddRequestsGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsForAddRequestsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsForAddRequests }
     *     
     */
    public void setOrderOfDocumentsForAddRequestsGetResult(ArrayOfDOrderOfDocumentsForAddRequests value) {
        this.orderOfDocumentsForAddRequestsGetResult = value;
    }

}
