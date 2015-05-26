
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
 *         &lt;element name="OrderOfDocumentsGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocuments" minOccurs="0"/>
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
    "orderOfDocumentsGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsGetResponse")
public class OrderOfDocumentsGetResponse {

    @XmlElement(name = "OrderOfDocumentsGetResult")
    protected ArrayOfDOrderOfDocuments orderOfDocumentsGetResult;

    /**
     * Gets the value of the orderOfDocumentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocuments }
     *     
     */
    public ArrayOfDOrderOfDocuments getOrderOfDocumentsGetResult() {
        return orderOfDocumentsGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocuments }
     *     
     */
    public void setOrderOfDocumentsGetResult(ArrayOfDOrderOfDocuments value) {
        this.orderOfDocumentsGetResult = value;
    }

}
