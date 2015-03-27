
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
 *         &lt;element name="PersonRequestsStatusesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestsStatuses" minOccurs="0"/>
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
    "personRequestsStatusesGetResult"
})
@XmlRootElement(name = "PersonRequestsStatusesGetResponse")
public class PersonRequestsStatusesGetResponse {

    @XmlElement(name = "PersonRequestsStatusesGetResult")
    protected ArrayOfDPersonRequestsStatuses personRequestsStatusesGetResult;

    /**
     * Gets the value of the personRequestsStatusesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestsStatuses }
     *     
     */
    public ArrayOfDPersonRequestsStatuses getPersonRequestsStatusesGetResult() {
        return personRequestsStatusesGetResult;
    }

    /**
     * Sets the value of the personRequestsStatusesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestsStatuses }
     *     
     */
    public void setPersonRequestsStatusesGetResult(ArrayOfDPersonRequestsStatuses value) {
        this.personRequestsStatusesGetResult = value;
    }

}
