
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
 *         &lt;element name="PersonEducationHistoryOrdersRequestsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrdersRequests" minOccurs="0"/>
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
    "personEducationHistoryOrdersRequestsGetResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersRequestsGetResponse")
public class PersonEducationHistoryOrdersRequestsGetResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersRequestsGetResult")
    protected ArrayOfDPersonEducationHistoryOrdersRequests personEducationHistoryOrdersRequestsGetResult;

    /**
     * Gets the value of the personEducationHistoryOrdersRequestsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersRequests }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrdersRequests getPersonEducationHistoryOrdersRequestsGetResult() {
        return personEducationHistoryOrdersRequestsGetResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersRequestsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersRequests }
     *     
     */
    public void setPersonEducationHistoryOrdersRequestsGetResult(ArrayOfDPersonEducationHistoryOrdersRequests value) {
        this.personEducationHistoryOrdersRequestsGetResult = value;
    }

}
