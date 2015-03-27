
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
 *         &lt;element name="PersonRequestsStatusChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestsStatusChangeResult"
})
@XmlRootElement(name = "PersonRequestsStatusChangeResponse")
public class PersonRequestsStatusChangeResponse {

    @XmlElement(name = "PersonRequestsStatusChangeResult")
    protected int personRequestsStatusChangeResult;

    /**
     * Gets the value of the personRequestsStatusChangeResult property.
     * 
     */
    public int getPersonRequestsStatusChangeResult() {
        return personRequestsStatusChangeResult;
    }

    /**
     * Sets the value of the personRequestsStatusChangeResult property.
     * 
     */
    public void setPersonRequestsStatusChangeResult(int value) {
        this.personRequestsStatusChangeResult = value;
    }

}
