
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
 *         &lt;element name="PersonWorkCancelationTypeGetResult" type="{http://edboservice.ua/}ArrayOfDPersonWorkCancelationType" minOccurs="0"/>
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
    "personWorkCancelationTypeGetResult"
})
@XmlRootElement(name = "PersonWorkCancelationTypeGetResponse")
public class PersonWorkCancelationTypeGetResponse {

    @XmlElement(name = "PersonWorkCancelationTypeGetResult")
    protected ArrayOfDPersonWorkCancelationType personWorkCancelationTypeGetResult;

    /**
     * Gets the value of the personWorkCancelationTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonWorkCancelationType }
     *     
     */
    public ArrayOfDPersonWorkCancelationType getPersonWorkCancelationTypeGetResult() {
        return personWorkCancelationTypeGetResult;
    }

    /**
     * Sets the value of the personWorkCancelationTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonWorkCancelationType }
     *     
     */
    public void setPersonWorkCancelationTypeGetResult(ArrayOfDPersonWorkCancelationType value) {
        this.personWorkCancelationTypeGetResult = value;
    }

}
