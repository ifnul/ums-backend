
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
 *         &lt;element name="PersonWorkOrdersAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personWorkOrdersAddResult"
})
@XmlRootElement(name = "PersonWorkOrdersAddResponse")
public class PersonWorkOrdersAddResponse {

    @XmlElement(name = "PersonWorkOrdersAddResult")
    protected int personWorkOrdersAddResult;

    /**
     * Gets the value of the personWorkOrdersAddResult property.
     * 
     */
    public int getPersonWorkOrdersAddResult() {
        return personWorkOrdersAddResult;
    }

    /**
     * Sets the value of the personWorkOrdersAddResult property.
     * 
     */
    public void setPersonWorkOrdersAddResult(int value) {
        this.personWorkOrdersAddResult = value;
    }

}
