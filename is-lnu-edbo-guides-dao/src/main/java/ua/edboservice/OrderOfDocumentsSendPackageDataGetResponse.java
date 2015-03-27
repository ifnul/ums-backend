
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
 *         &lt;element name="OrderOfDocumentsSendPackageDataGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsSendPackageData" minOccurs="0"/>
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
    "orderOfDocumentsSendPackageDataGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsSendPackageDataGetResponse")
public class OrderOfDocumentsSendPackageDataGetResponse {

    @XmlElement(name = "OrderOfDocumentsSendPackageDataGetResult")
    protected ArrayOfDOrderOfDocumentsSendPackageData orderOfDocumentsSendPackageDataGetResult;

    /**
     * Gets the value of the orderOfDocumentsSendPackageDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsSendPackageData }
     *     
     */
    public ArrayOfDOrderOfDocumentsSendPackageData getOrderOfDocumentsSendPackageDataGetResult() {
        return orderOfDocumentsSendPackageDataGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackageDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsSendPackageData }
     *     
     */
    public void setOrderOfDocumentsSendPackageDataGetResult(ArrayOfDOrderOfDocumentsSendPackageData value) {
        this.orderOfDocumentsSendPackageDataGetResult = value;
    }

}
