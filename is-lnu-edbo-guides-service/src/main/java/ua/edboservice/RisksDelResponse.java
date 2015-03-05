
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
 *         &lt;element name="RisksDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "risksDelResult"
})
@XmlRootElement(name = "RisksDelResponse")
public class RisksDelResponse {

    @XmlElement(name = "RisksDelResult")
    protected int risksDelResult;

    /**
     * Gets the value of the risksDelResult property.
     * 
     */
    public int getRisksDelResult() {
        return risksDelResult;
    }

    /**
     * Sets the value of the risksDelResult property.
     * 
     */
    public void setRisksDelResult(int value) {
        this.risksDelResult = value;
    }

}
