
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
 *         &lt;element name="RequestsGetHistoryChangeResult" type="{http://edboservice.ua/}ArrayOfDRequestsGetHistoryChange" minOccurs="0"/>
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
    "requestsGetHistoryChangeResult"
})
@XmlRootElement(name = "RequestsGetHistoryChangeResponse")
public class RequestsGetHistoryChangeResponse {

    @XmlElement(name = "RequestsGetHistoryChangeResult")
    protected ArrayOfDRequestsGetHistoryChange requestsGetHistoryChangeResult;

    /**
     * Gets the value of the requestsGetHistoryChangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRequestsGetHistoryChange }
     *     
     */
    public ArrayOfDRequestsGetHistoryChange getRequestsGetHistoryChangeResult() {
        return requestsGetHistoryChangeResult;
    }

    /**
     * Sets the value of the requestsGetHistoryChangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRequestsGetHistoryChange }
     *     
     */
    public void setRequestsGetHistoryChangeResult(ArrayOfDRequestsGetHistoryChange value) {
        this.requestsGetHistoryChangeResult = value;
    }

}
