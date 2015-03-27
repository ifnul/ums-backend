
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
 *         &lt;element name="PersonRequestsNewPriorityGetResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestsNewPriorityGetResult"
})
@XmlRootElement(name = "PersonRequestsNewPriorityGetResponse")
public class PersonRequestsNewPriorityGetResponse {

    @XmlElement(name = "PersonRequestsNewPriorityGetResult")
    protected int personRequestsNewPriorityGetResult;

    /**
     * Gets the value of the personRequestsNewPriorityGetResult property.
     * 
     */
    public int getPersonRequestsNewPriorityGetResult() {
        return personRequestsNewPriorityGetResult;
    }

    /**
     * Sets the value of the personRequestsNewPriorityGetResult property.
     * 
     */
    public void setPersonRequestsNewPriorityGetResult(int value) {
        this.personRequestsNewPriorityGetResult = value;
    }

}
