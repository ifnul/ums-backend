
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
 *         &lt;element name="SpecSpecializationRequestsGroupStatusChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "specSpecializationRequestsGroupStatusChangeResult"
})
@XmlRootElement(name = "SpecSpecializationRequestsGroupStatusChangeResponse")
public class SpecSpecializationRequestsGroupStatusChangeResponse {

    @XmlElement(name = "SpecSpecializationRequestsGroupStatusChangeResult")
    protected int specSpecializationRequestsGroupStatusChangeResult;

    /**
     * Gets the value of the specSpecializationRequestsGroupStatusChangeResult property.
     * 
     */
    public int getSpecSpecializationRequestsGroupStatusChangeResult() {
        return specSpecializationRequestsGroupStatusChangeResult;
    }

    /**
     * Sets the value of the specSpecializationRequestsGroupStatusChangeResult property.
     * 
     */
    public void setSpecSpecializationRequestsGroupStatusChangeResult(int value) {
        this.specSpecializationRequestsGroupStatusChangeResult = value;
    }

}
