
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
 *         &lt;element name="OrderOfDocumentsForAddRequestsFindResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsForAddRequestsFind" minOccurs="0"/>
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
    "orderOfDocumentsForAddRequestsFindResult"
})
@XmlRootElement(name = "OrderOfDocumentsForAddRequestsFindResponse")
public class OrderOfDocumentsForAddRequestsFindResponse {

    @XmlElement(name = "OrderOfDocumentsForAddRequestsFindResult")
    protected ArrayOfDOrderOfDocumentsForAddRequestsFind orderOfDocumentsForAddRequestsFindResult;

    /**
     * Gets the value of the orderOfDocumentsForAddRequestsFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsForAddRequestsFind }
     *     
     */
    public ArrayOfDOrderOfDocumentsForAddRequestsFind getOrderOfDocumentsForAddRequestsFindResult() {
        return orderOfDocumentsForAddRequestsFindResult;
    }

    /**
     * Sets the value of the orderOfDocumentsForAddRequestsFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsForAddRequestsFind }
     *     
     */
    public void setOrderOfDocumentsForAddRequestsFindResult(ArrayOfDOrderOfDocumentsForAddRequestsFind value) {
        this.orderOfDocumentsForAddRequestsFindResult = value;
    }

}
