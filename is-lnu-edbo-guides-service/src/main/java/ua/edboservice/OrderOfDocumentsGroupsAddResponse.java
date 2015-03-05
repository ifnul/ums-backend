
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
 *         &lt;element name="OrderOfDocumentsGroupsAddResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsGroupsAddRet" minOccurs="0"/>
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
    "orderOfDocumentsGroupsAddResult"
})
@XmlRootElement(name = "OrderOfDocumentsGroupsAddResponse")
public class OrderOfDocumentsGroupsAddResponse {

    @XmlElement(name = "OrderOfDocumentsGroupsAddResult")
    protected ArrayOfDOrderOfDocumentsGroupsAddRet orderOfDocumentsGroupsAddResult;

    /**
     * Gets the value of the orderOfDocumentsGroupsAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsGroupsAddRet }
     *     
     */
    public ArrayOfDOrderOfDocumentsGroupsAddRet getOrderOfDocumentsGroupsAddResult() {
        return orderOfDocumentsGroupsAddResult;
    }

    /**
     * Sets the value of the orderOfDocumentsGroupsAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsGroupsAddRet }
     *     
     */
    public void setOrderOfDocumentsGroupsAddResult(ArrayOfDOrderOfDocumentsGroupsAddRet value) {
        this.orderOfDocumentsGroupsAddResult = value;
    }

}
