
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
 *         &lt;element name="PersonContactsEdit2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personContactsEdit2Result"
})
@XmlRootElement(name = "PersonContactsEdit2Response")
public class PersonContactsEdit2Response {

    @XmlElement(name = "PersonContactsEdit2Result")
    protected int personContactsEdit2Result;

    /**
     * Gets the value of the personContactsEdit2Result property.
     * 
     */
    public int getPersonContactsEdit2Result() {
        return personContactsEdit2Result;
    }

    /**
     * Sets the value of the personContactsEdit2Result property.
     * 
     */
    public void setPersonContactsEdit2Result(int value) {
        this.personContactsEdit2Result = value;
    }

}
