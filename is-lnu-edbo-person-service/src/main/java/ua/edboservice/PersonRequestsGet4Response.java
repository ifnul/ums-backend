
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
 *         &lt;element name="PersonRequestsGet4Result" type="{http://edboservice.ua/}ArrayOfDPersonRequests4" minOccurs="0"/>
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
    "personRequestsGet4Result"
})
@XmlRootElement(name = "PersonRequestsGet4Response")
public class PersonRequestsGet4Response {

    @XmlElement(name = "PersonRequestsGet4Result")
    protected ArrayOfDPersonRequests4 personRequestsGet4Result;

    /**
     * Gets the value of the personRequestsGet4Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequests4 }
     *     
     */
    public ArrayOfDPersonRequests4 getPersonRequestsGet4Result() {
        return personRequestsGet4Result;
    }

    /**
     * Sets the value of the personRequestsGet4Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequests4 }
     *     
     */
    public void setPersonRequestsGet4Result(ArrayOfDPersonRequests4 value) {
        this.personRequestsGet4Result = value;
    }

}
