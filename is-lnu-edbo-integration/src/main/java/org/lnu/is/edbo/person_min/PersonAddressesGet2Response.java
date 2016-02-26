
package org.lnu.is.edbo.person_min;

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
 *         &lt;element name="PersonAddressesGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonAddresses2" minOccurs="0"/>
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
    "personAddressesGet2Result"
})
@XmlRootElement(name = "PersonAddressesGet2Response")
public class PersonAddressesGet2Response {

    @XmlElement(name = "PersonAddressesGet2Result")
    protected ArrayOfDPersonAddresses2 personAddressesGet2Result;

    /**
     * Gets the value of the personAddressesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAddresses2 }
     *     
     */
    public ArrayOfDPersonAddresses2 getPersonAddressesGet2Result() {
        return personAddressesGet2Result;
    }

    /**
     * Sets the value of the personAddressesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAddresses2 }
     *     
     */
    public void setPersonAddressesGet2Result(ArrayOfDPersonAddresses2 value) {
        this.personAddressesGet2Result = value;
    }

}
