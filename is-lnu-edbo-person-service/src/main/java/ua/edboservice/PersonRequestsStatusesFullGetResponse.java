
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
 *         &lt;element name="PersonRequestsStatusesFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestsStatusesFull" minOccurs="0"/>
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
    "personRequestsStatusesFullGetResult"
})
@XmlRootElement(name = "PersonRequestsStatusesFullGetResponse")
public class PersonRequestsStatusesFullGetResponse {

    @XmlElement(name = "PersonRequestsStatusesFullGetResult")
    protected ArrayOfDPersonRequestsStatusesFull personRequestsStatusesFullGetResult;

    /**
     * Gets the value of the personRequestsStatusesFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestsStatusesFull }
     *     
     */
    public ArrayOfDPersonRequestsStatusesFull getPersonRequestsStatusesFullGetResult() {
        return personRequestsStatusesFullGetResult;
    }

    /**
     * Sets the value of the personRequestsStatusesFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestsStatusesFull }
     *     
     */
    public void setPersonRequestsStatusesFullGetResult(ArrayOfDPersonRequestsStatusesFull value) {
        this.personRequestsStatusesFullGetResult = value;
    }

}
