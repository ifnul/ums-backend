
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
 *         &lt;element name="PersonRequestCancellationEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestCancellationEditResult"
})
@XmlRootElement(name = "PersonRequestCancellationEditResponse")
public class PersonRequestCancellationEditResponse {

    @XmlElement(name = "PersonRequestCancellationEditResult")
    protected int personRequestCancellationEditResult;

    /**
     * Gets the value of the personRequestCancellationEditResult property.
     * 
     */
    public int getPersonRequestCancellationEditResult() {
        return personRequestCancellationEditResult;
    }

    /**
     * Sets the value of the personRequestCancellationEditResult property.
     * 
     */
    public void setPersonRequestCancellationEditResult(int value) {
        this.personRequestCancellationEditResult = value;
    }

}
