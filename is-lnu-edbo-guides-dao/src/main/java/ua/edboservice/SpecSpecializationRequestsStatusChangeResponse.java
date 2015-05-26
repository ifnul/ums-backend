
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
 *         &lt;element name="SpecSpecializationRequestsStatusChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "specSpecializationRequestsStatusChangeResult"
})
@XmlRootElement(name = "SpecSpecializationRequestsStatusChangeResponse")
public class SpecSpecializationRequestsStatusChangeResponse {

    @XmlElement(name = "SpecSpecializationRequestsStatusChangeResult")
    protected int specSpecializationRequestsStatusChangeResult;

    /**
     * Gets the value of the specSpecializationRequestsStatusChangeResult property.
     * 
     */
    public int getSpecSpecializationRequestsStatusChangeResult() {
        return specSpecializationRequestsStatusChangeResult;
    }

    /**
     * Sets the value of the specSpecializationRequestsStatusChangeResult property.
     * 
     */
    public void setSpecSpecializationRequestsStatusChangeResult(int value) {
        this.specSpecializationRequestsStatusChangeResult = value;
    }

}
