
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
 *         &lt;element name="OrderOfDocumentsDatasGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsDatas" minOccurs="0"/>
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
    "orderOfDocumentsDatasGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsDatasGetResponse")
public class OrderOfDocumentsDatasGetResponse {

    @XmlElement(name = "OrderOfDocumentsDatasGetResult")
    protected ArrayOfDOrderOfDocumentsDatas orderOfDocumentsDatasGetResult;

    /**
     * Gets the value of the orderOfDocumentsDatasGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsDatas }
     *     
     */
    public ArrayOfDOrderOfDocumentsDatas getOrderOfDocumentsDatasGetResult() {
        return orderOfDocumentsDatasGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsDatasGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsDatas }
     *     
     */
    public void setOrderOfDocumentsDatasGetResult(ArrayOfDOrderOfDocumentsDatas value) {
        this.orderOfDocumentsDatasGetResult = value;
    }

}
