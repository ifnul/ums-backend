
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
 *         &lt;element name="PersonRequestsAllPriorityGetEzResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestsAllPriorityGetEz" minOccurs="0"/>
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
    "personRequestsAllPriorityGetEzResult"
})
@XmlRootElement(name = "PersonRequestsAllPriorityGetEzResponse")
public class PersonRequestsAllPriorityGetEzResponse {

    @XmlElement(name = "PersonRequestsAllPriorityGetEzResult")
    protected ArrayOfDPersonRequestsAllPriorityGetEz personRequestsAllPriorityGetEzResult;

    /**
     * Gets the value of the personRequestsAllPriorityGetEzResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestsAllPriorityGetEz }
     *     
     */
    public ArrayOfDPersonRequestsAllPriorityGetEz getPersonRequestsAllPriorityGetEzResult() {
        return personRequestsAllPriorityGetEzResult;
    }

    /**
     * Sets the value of the personRequestsAllPriorityGetEzResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestsAllPriorityGetEz }
     *     
     */
    public void setPersonRequestsAllPriorityGetEzResult(ArrayOfDPersonRequestsAllPriorityGetEz value) {
        this.personRequestsAllPriorityGetEzResult = value;
    }

}
