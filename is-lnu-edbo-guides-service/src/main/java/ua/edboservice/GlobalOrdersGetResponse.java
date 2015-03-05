
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
 *         &lt;element name="GlobalOrdersGetResult" type="{http://edboservice.ua/}ArrayOfDGlobalOrders" minOccurs="0"/>
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
    "globalOrdersGetResult"
})
@XmlRootElement(name = "GlobalOrdersGetResponse")
public class GlobalOrdersGetResponse {

    @XmlElement(name = "GlobalOrdersGetResult")
    protected ArrayOfDGlobalOrders globalOrdersGetResult;

    /**
     * Gets the value of the globalOrdersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGlobalOrders }
     *     
     */
    public ArrayOfDGlobalOrders getGlobalOrdersGetResult() {
        return globalOrdersGetResult;
    }

    /**
     * Sets the value of the globalOrdersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGlobalOrders }
     *     
     */
    public void setGlobalOrdersGetResult(ArrayOfDGlobalOrders value) {
        this.globalOrdersGetResult = value;
    }

}
