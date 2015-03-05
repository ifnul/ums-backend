
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
 *         &lt;element name="PersonRequestsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonRequests2" minOccurs="0"/>
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
    "personRequestsGet2Result"
})
@XmlRootElement(name = "PersonRequestsGet2Response")
public class PersonRequestsGet2Response {

    @XmlElement(name = "PersonRequestsGet2Result")
    protected ArrayOfDPersonRequests2 personRequestsGet2Result;

    /**
     * Gets the value of the personRequestsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequests2 }
     *     
     */
    public ArrayOfDPersonRequests2 getPersonRequestsGet2Result() {
        return personRequestsGet2Result;
    }

    /**
     * Sets the value of the personRequestsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequests2 }
     *     
     */
    public void setPersonRequestsGet2Result(ArrayOfDPersonRequests2 value) {
        this.personRequestsGet2Result = value;
    }

}
