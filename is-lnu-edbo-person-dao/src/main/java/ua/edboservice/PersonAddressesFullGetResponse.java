
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
 *         &lt;element name="PersonAddressesFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonAddressesFull" minOccurs="0"/>
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
    "personAddressesFullGetResult"
})
@XmlRootElement(name = "PersonAddressesFullGetResponse")
public class PersonAddressesFullGetResponse {

    @XmlElement(name = "PersonAddressesFullGetResult")
    protected ArrayOfDPersonAddressesFull personAddressesFullGetResult;

    /**
     * Gets the value of the personAddressesFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAddressesFull }
     *     
     */
    public ArrayOfDPersonAddressesFull getPersonAddressesFullGetResult() {
        return personAddressesFullGetResult;
    }

    /**
     * Sets the value of the personAddressesFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAddressesFull }
     *     
     */
    public void setPersonAddressesFullGetResult(ArrayOfDPersonAddressesFull value) {
        this.personAddressesFullGetResult = value;
    }

}
