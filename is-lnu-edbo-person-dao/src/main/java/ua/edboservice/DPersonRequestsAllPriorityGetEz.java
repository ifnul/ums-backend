
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonRequestsAllPriorityGetEz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestsAllPriorityGetEz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestsAllPriorityGetEz", propOrder = {
    "requestPriority"
})
public class DPersonRequestsAllPriorityGetEz {

    @XmlElement(name = "RequestPriority")
    protected int requestPriority;

    /**
     * Gets the value of the requestPriority property.
     * 
     */
    public int getRequestPriority() {
        return requestPriority;
    }

    /**
     * Sets the value of the requestPriority property.
     * 
     */
    public void setRequestPriority(int value) {
        this.requestPriority = value;
    }

}
