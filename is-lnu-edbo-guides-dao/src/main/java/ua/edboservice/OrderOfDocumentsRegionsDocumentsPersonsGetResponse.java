
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
 *         &lt;element name="OrderOfDocumentsRegionsDocumentsPersonsGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsRegionsDocumentsPersons" minOccurs="0"/>
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
    "orderOfDocumentsRegionsDocumentsPersonsGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsRegionsDocumentsPersonsGetResponse")
public class OrderOfDocumentsRegionsDocumentsPersonsGetResponse {

    @XmlElement(name = "OrderOfDocumentsRegionsDocumentsPersonsGetResult")
    protected ArrayOfDOrderOfDocumentsRegionsDocumentsPersons orderOfDocumentsRegionsDocumentsPersonsGetResult;

    /**
     * Gets the value of the orderOfDocumentsRegionsDocumentsPersonsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsRegionsDocumentsPersons }
     *     
     */
    public ArrayOfDOrderOfDocumentsRegionsDocumentsPersons getOrderOfDocumentsRegionsDocumentsPersonsGetResult() {
        return orderOfDocumentsRegionsDocumentsPersonsGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsRegionsDocumentsPersonsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsRegionsDocumentsPersons }
     *     
     */
    public void setOrderOfDocumentsRegionsDocumentsPersonsGetResult(ArrayOfDOrderOfDocumentsRegionsDocumentsPersons value) {
        this.orderOfDocumentsRegionsDocumentsPersonsGetResult = value;
    }

}
