
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
 *         &lt;element name="PersonAddressesEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personAddressesEditResult"
})
@XmlRootElement(name = "PersonAddressesEditResponse")
public class PersonAddressesEditResponse {

    @XmlElement(name = "PersonAddressesEditResult")
    protected int personAddressesEditResult;

    /**
     * Gets the value of the personAddressesEditResult property.
     * 
     */
    public int getPersonAddressesEditResult() {
        return personAddressesEditResult;
    }

    /**
     * Sets the value of the personAddressesEditResult property.
     * 
     */
    public void setPersonAddressesEditResult(int value) {
        this.personAddressesEditResult = value;
    }

}
