
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
 *         &lt;element name="PersonRequestsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequests" minOccurs="0"/>
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
    "personRequestsGetResult"
})
@XmlRootElement(name = "PersonRequestsGetResponse")
public class PersonRequestsGetResponse {

    @XmlElement(name = "PersonRequestsGetResult")
    protected ArrayOfDPersonRequests personRequestsGetResult;

    /**
     * Gets the value of the personRequestsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequests }
     *     
     */
    public ArrayOfDPersonRequests getPersonRequestsGetResult() {
        return personRequestsGetResult;
    }

    /**
     * Sets the value of the personRequestsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequests }
     *     
     */
    public void setPersonRequestsGetResult(ArrayOfDPersonRequests value) {
        this.personRequestsGetResult = value;
    }

}
