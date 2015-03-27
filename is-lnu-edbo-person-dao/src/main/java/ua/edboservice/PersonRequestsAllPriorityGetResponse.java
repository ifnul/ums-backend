
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
 *         &lt;element name="PersonRequestsAllPriorityGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestsAllPriority" minOccurs="0"/>
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
    "personRequestsAllPriorityGetResult"
})
@XmlRootElement(name = "PersonRequestsAllPriorityGetResponse")
public class PersonRequestsAllPriorityGetResponse {

    @XmlElement(name = "PersonRequestsAllPriorityGetResult")
    protected ArrayOfDPersonRequestsAllPriority personRequestsAllPriorityGetResult;

    /**
     * Gets the value of the personRequestsAllPriorityGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestsAllPriority }
     *     
     */
    public ArrayOfDPersonRequestsAllPriority getPersonRequestsAllPriorityGetResult() {
        return personRequestsAllPriorityGetResult;
    }

    /**
     * Sets the value of the personRequestsAllPriorityGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestsAllPriority }
     *     
     */
    public void setPersonRequestsAllPriorityGetResult(ArrayOfDPersonRequestsAllPriority value) {
        this.personRequestsAllPriorityGetResult = value;
    }

}
