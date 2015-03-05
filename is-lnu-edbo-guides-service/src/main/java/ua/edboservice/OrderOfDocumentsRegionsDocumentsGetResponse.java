
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
 *         &lt;element name="OrderOfDocumentsRegionsDocumentsGetResult" type="{http://edboservice.ua/}ArrayOfDDictOrderOfDocumentsRegionsDocuments" minOccurs="0"/>
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
    "orderOfDocumentsRegionsDocumentsGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsRegionsDocumentsGetResponse")
public class OrderOfDocumentsRegionsDocumentsGetResponse {

    @XmlElement(name = "OrderOfDocumentsRegionsDocumentsGetResult")
    protected ArrayOfDDictOrderOfDocumentsRegionsDocuments orderOfDocumentsRegionsDocumentsGetResult;

    /**
     * Gets the value of the orderOfDocumentsRegionsDocumentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDictOrderOfDocumentsRegionsDocuments }
     *     
     */
    public ArrayOfDDictOrderOfDocumentsRegionsDocuments getOrderOfDocumentsRegionsDocumentsGetResult() {
        return orderOfDocumentsRegionsDocumentsGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsRegionsDocumentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDictOrderOfDocumentsRegionsDocuments }
     *     
     */
    public void setOrderOfDocumentsRegionsDocumentsGetResult(ArrayOfDDictOrderOfDocumentsRegionsDocuments value) {
        this.orderOfDocumentsRegionsDocumentsGetResult = value;
    }

}
