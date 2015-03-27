
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
 *         &lt;element name="SpecSpecializationRequestsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "specSpecializationRequestsAddResult"
})
@XmlRootElement(name = "SpecSpecializationRequestsAddResponse")
public class SpecSpecializationRequestsAddResponse {

    @XmlElement(name = "SpecSpecializationRequestsAddResult")
    protected int specSpecializationRequestsAddResult;

    /**
     * Gets the value of the specSpecializationRequestsAddResult property.
     * 
     */
    public int getSpecSpecializationRequestsAddResult() {
        return specSpecializationRequestsAddResult;
    }

    /**
     * Sets the value of the specSpecializationRequestsAddResult property.
     * 
     */
    public void setSpecSpecializationRequestsAddResult(int value) {
        this.specSpecializationRequestsAddResult = value;
    }

}
