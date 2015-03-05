
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
 *         &lt;element name="RisksEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "risksEditResult"
})
@XmlRootElement(name = "RisksEditResponse")
public class RisksEditResponse {

    @XmlElement(name = "RisksEditResult")
    protected int risksEditResult;

    /**
     * Gets the value of the risksEditResult property.
     * 
     */
    public int getRisksEditResult() {
        return risksEditResult;
    }

    /**
     * Sets the value of the risksEditResult property.
     * 
     */
    public void setRisksEditResult(int value) {
        this.risksEditResult = value;
    }

}
