
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
 *         &lt;element name="PersonRequestsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestsFullGet" minOccurs="0"/>
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
    "personRequestsFullGetResult"
})
@XmlRootElement(name = "PersonRequestsFullGetResponse")
public class PersonRequestsFullGetResponse {

    @XmlElement(name = "PersonRequestsFullGetResult")
    protected ArrayOfDPersonRequestsFullGet personRequestsFullGetResult;

    /**
     * Gets the value of the personRequestsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestsFullGet }
     *     
     */
    public ArrayOfDPersonRequestsFullGet getPersonRequestsFullGetResult() {
        return personRequestsFullGetResult;
    }

    /**
     * Sets the value of the personRequestsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestsFullGet }
     *     
     */
    public void setPersonRequestsFullGetResult(ArrayOfDPersonRequestsFullGet value) {
        this.personRequestsFullGetResult = value;
    }

}
