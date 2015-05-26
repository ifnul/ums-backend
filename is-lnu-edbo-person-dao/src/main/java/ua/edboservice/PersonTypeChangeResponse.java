
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
 *         &lt;element name="PersonTypeChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personTypeChangeResult"
})
@XmlRootElement(name = "PersonTypeChangeResponse")
public class PersonTypeChangeResponse {

    @XmlElement(name = "PersonTypeChangeResult")
    protected int personTypeChangeResult;

    /**
     * Gets the value of the personTypeChangeResult property.
     * 
     */
    public int getPersonTypeChangeResult() {
        return personTypeChangeResult;
    }

    /**
     * Sets the value of the personTypeChangeResult property.
     * 
     */
    public void setPersonTypeChangeResult(int value) {
        this.personTypeChangeResult = value;
    }

}
