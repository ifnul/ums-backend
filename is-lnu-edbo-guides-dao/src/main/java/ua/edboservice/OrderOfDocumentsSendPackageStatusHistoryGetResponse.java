
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
 *         &lt;element name="OrderOfDocumentsSendPackageStatusHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsSendPackageStatusHistory" minOccurs="0"/>
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
    "orderOfDocumentsSendPackageStatusHistoryGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsSendPackageStatusHistoryGetResponse")
public class OrderOfDocumentsSendPackageStatusHistoryGetResponse {

    @XmlElement(name = "OrderOfDocumentsSendPackageStatusHistoryGetResult")
    protected ArrayOfDOrderOfDocumentsSendPackageStatusHistory orderOfDocumentsSendPackageStatusHistoryGetResult;

    /**
     * Gets the value of the orderOfDocumentsSendPackageStatusHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsSendPackageStatusHistory }
     *     
     */
    public ArrayOfDOrderOfDocumentsSendPackageStatusHistory getOrderOfDocumentsSendPackageStatusHistoryGetResult() {
        return orderOfDocumentsSendPackageStatusHistoryGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackageStatusHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsSendPackageStatusHistory }
     *     
     */
    public void setOrderOfDocumentsSendPackageStatusHistoryGetResult(ArrayOfDOrderOfDocumentsSendPackageStatusHistory value) {
        this.orderOfDocumentsSendPackageStatusHistoryGetResult = value;
    }

}
