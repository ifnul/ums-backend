
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
 *         &lt;element name="PersonBlockChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personBlockChangeResult"
})
@XmlRootElement(name = "PersonBlockChangeResponse")
public class PersonBlockChangeResponse {

    @XmlElement(name = "PersonBlockChangeResult")
    protected int personBlockChangeResult;

    /**
     * Gets the value of the personBlockChangeResult property.
     * 
     */
    public int getPersonBlockChangeResult() {
        return personBlockChangeResult;
    }

    /**
     * Sets the value of the personBlockChangeResult property.
     * 
     */
    public void setPersonBlockChangeResult(int value) {
        this.personBlockChangeResult = value;
    }

}
