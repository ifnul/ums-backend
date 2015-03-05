
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
 *         &lt;element name="PersonContactsAdd2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personContactsAdd2Result"
})
@XmlRootElement(name = "PersonContactsAdd2Response")
public class PersonContactsAdd2Response {

    @XmlElement(name = "PersonContactsAdd2Result")
    protected int personContactsAdd2Result;

    /**
     * Gets the value of the personContactsAdd2Result property.
     * 
     */
    public int getPersonContactsAdd2Result() {
        return personContactsAdd2Result;
    }

    /**
     * Sets the value of the personContactsAdd2Result property.
     * 
     */
    public void setPersonContactsAdd2Result(int value) {
        this.personContactsAdd2Result = value;
    }

}
