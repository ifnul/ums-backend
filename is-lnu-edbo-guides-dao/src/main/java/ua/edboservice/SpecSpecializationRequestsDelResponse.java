
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
 *         &lt;element name="SpecSpecializationRequestsDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "specSpecializationRequestsDelResult"
})
@XmlRootElement(name = "SpecSpecializationRequestsDelResponse")
public class SpecSpecializationRequestsDelResponse {

    @XmlElement(name = "SpecSpecializationRequestsDelResult")
    protected int specSpecializationRequestsDelResult;

    /**
     * Gets the value of the specSpecializationRequestsDelResult property.
     * 
     */
    public int getSpecSpecializationRequestsDelResult() {
        return specSpecializationRequestsDelResult;
    }

    /**
     * Sets the value of the specSpecializationRequestsDelResult property.
     * 
     */
    public void setSpecSpecializationRequestsDelResult(int value) {
        this.specSpecializationRequestsDelResult = value;
    }

}
