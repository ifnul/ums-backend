
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
 *         &lt;element name="OrderOfDocumentsAddResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsAddRet" minOccurs="0"/>
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
    "orderOfDocumentsAddResult"
})
@XmlRootElement(name = "OrderOfDocumentsAddResponse")
public class OrderOfDocumentsAddResponse {

    @XmlElement(name = "OrderOfDocumentsAddResult")
    protected ArrayOfDOrderOfDocumentsAddRet orderOfDocumentsAddResult;

    /**
     * Gets the value of the orderOfDocumentsAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsAddRet }
     *     
     */
    public ArrayOfDOrderOfDocumentsAddRet getOrderOfDocumentsAddResult() {
        return orderOfDocumentsAddResult;
    }

    /**
     * Sets the value of the orderOfDocumentsAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsAddRet }
     *     
     */
    public void setOrderOfDocumentsAddResult(ArrayOfDOrderOfDocumentsAddRet value) {
        this.orderOfDocumentsAddResult = value;
    }

}
