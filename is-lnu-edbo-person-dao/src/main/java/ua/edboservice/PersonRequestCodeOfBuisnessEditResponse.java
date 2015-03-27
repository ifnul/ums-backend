
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
 *         &lt;element name="PersonRequestCodeOfBuisnessEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestCodeOfBuisnessEditResult"
})
@XmlRootElement(name = "PersonRequestCodeOfBuisnessEditResponse")
public class PersonRequestCodeOfBuisnessEditResponse {

    @XmlElement(name = "PersonRequestCodeOfBuisnessEditResult")
    protected int personRequestCodeOfBuisnessEditResult;

    /**
     * Gets the value of the personRequestCodeOfBuisnessEditResult property.
     * 
     */
    public int getPersonRequestCodeOfBuisnessEditResult() {
        return personRequestCodeOfBuisnessEditResult;
    }

    /**
     * Sets the value of the personRequestCodeOfBuisnessEditResult property.
     * 
     */
    public void setPersonRequestCodeOfBuisnessEditResult(int value) {
        this.personRequestCodeOfBuisnessEditResult = value;
    }

}
