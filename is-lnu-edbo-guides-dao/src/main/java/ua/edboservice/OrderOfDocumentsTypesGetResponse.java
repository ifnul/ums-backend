
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
 *         &lt;element name="OrderOfDocumentsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsTypes" minOccurs="0"/>
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
    "orderOfDocumentsTypesGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsTypesGetResponse")
public class OrderOfDocumentsTypesGetResponse {

    @XmlElement(name = "OrderOfDocumentsTypesGetResult")
    protected ArrayOfDOrderOfDocumentsTypes orderOfDocumentsTypesGetResult;

    /**
     * Gets the value of the orderOfDocumentsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsTypes }
     *     
     */
    public ArrayOfDOrderOfDocumentsTypes getOrderOfDocumentsTypesGetResult() {
        return orderOfDocumentsTypesGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsTypes }
     *     
     */
    public void setOrderOfDocumentsTypesGetResult(ArrayOfDOrderOfDocumentsTypes value) {
        this.orderOfDocumentsTypesGetResult = value;
    }

}
