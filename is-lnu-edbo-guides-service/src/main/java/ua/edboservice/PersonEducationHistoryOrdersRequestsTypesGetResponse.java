
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
 *         &lt;element name="PersonEducationHistoryOrdersRequestsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrdersRequestsTypes" minOccurs="0"/>
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
    "personEducationHistoryOrdersRequestsTypesGetResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersRequestsTypesGetResponse")
public class PersonEducationHistoryOrdersRequestsTypesGetResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersRequestsTypesGetResult")
    protected ArrayOfDPersonEducationHistoryOrdersRequestsTypes personEducationHistoryOrdersRequestsTypesGetResult;

    /**
     * Gets the value of the personEducationHistoryOrdersRequestsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersRequestsTypes }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrdersRequestsTypes getPersonEducationHistoryOrdersRequestsTypesGetResult() {
        return personEducationHistoryOrdersRequestsTypesGetResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersRequestsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersRequestsTypes }
     *     
     */
    public void setPersonEducationHistoryOrdersRequestsTypesGetResult(ArrayOfDPersonEducationHistoryOrdersRequestsTypes value) {
        this.personEducationHistoryOrdersRequestsTypesGetResult = value;
    }

}
