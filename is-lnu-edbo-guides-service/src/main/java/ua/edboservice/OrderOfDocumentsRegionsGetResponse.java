
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
 *         &lt;element name="OrderOfDocumentsRegionsGetResult" type="{http://edboservice.ua/}ArrayOfDDictOrderOfDocumentsRegions" minOccurs="0"/>
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
    "orderOfDocumentsRegionsGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsRegionsGetResponse")
public class OrderOfDocumentsRegionsGetResponse {

    @XmlElement(name = "OrderOfDocumentsRegionsGetResult")
    protected ArrayOfDDictOrderOfDocumentsRegions orderOfDocumentsRegionsGetResult;

    /**
     * Gets the value of the orderOfDocumentsRegionsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDictOrderOfDocumentsRegions }
     *     
     */
    public ArrayOfDDictOrderOfDocumentsRegions getOrderOfDocumentsRegionsGetResult() {
        return orderOfDocumentsRegionsGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsRegionsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDictOrderOfDocumentsRegions }
     *     
     */
    public void setOrderOfDocumentsRegionsGetResult(ArrayOfDDictOrderOfDocumentsRegions value) {
        this.orderOfDocumentsRegionsGetResult = value;
    }

}
