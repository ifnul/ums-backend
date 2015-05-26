
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
 *         &lt;element name="OrderOfDocumentsSendPackageGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsSendPackage" minOccurs="0"/>
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
    "orderOfDocumentsSendPackageGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsSendPackageGetResponse")
public class OrderOfDocumentsSendPackageGetResponse {

    @XmlElement(name = "OrderOfDocumentsSendPackageGetResult")
    protected ArrayOfDOrderOfDocumentsSendPackage orderOfDocumentsSendPackageGetResult;

    /**
     * Gets the value of the orderOfDocumentsSendPackageGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsSendPackage }
     *     
     */
    public ArrayOfDOrderOfDocumentsSendPackage getOrderOfDocumentsSendPackageGetResult() {
        return orderOfDocumentsSendPackageGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackageGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsSendPackage }
     *     
     */
    public void setOrderOfDocumentsSendPackageGetResult(ArrayOfDOrderOfDocumentsSendPackage value) {
        this.orderOfDocumentsSendPackageGetResult = value;
    }

}
