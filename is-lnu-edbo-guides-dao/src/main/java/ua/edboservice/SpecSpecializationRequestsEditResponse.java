
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
 *         &lt;element name="SpecSpecializationRequestsEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "specSpecializationRequestsEditResult"
})
@XmlRootElement(name = "SpecSpecializationRequestsEditResponse")
public class SpecSpecializationRequestsEditResponse {

    @XmlElement(name = "SpecSpecializationRequestsEditResult")
    protected int specSpecializationRequestsEditResult;

    /**
     * Gets the value of the specSpecializationRequestsEditResult property.
     * 
     */
    public int getSpecSpecializationRequestsEditResult() {
        return specSpecializationRequestsEditResult;
    }

    /**
     * Sets the value of the specSpecializationRequestsEditResult property.
     * 
     */
    public void setSpecSpecializationRequestsEditResult(int value) {
        this.specSpecializationRequestsEditResult = value;
    }

}
