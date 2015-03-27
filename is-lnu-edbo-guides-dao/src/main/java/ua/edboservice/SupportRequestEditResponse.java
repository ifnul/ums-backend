
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
 *         &lt;element name="SupportRequestEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "supportRequestEditResult"
})
@XmlRootElement(name = "SupportRequestEditResponse")
public class SupportRequestEditResponse {

    @XmlElement(name = "SupportRequestEditResult")
    protected int supportRequestEditResult;

    /**
     * Gets the value of the supportRequestEditResult property.
     * 
     */
    public int getSupportRequestEditResult() {
        return supportRequestEditResult;
    }

    /**
     * Sets the value of the supportRequestEditResult property.
     * 
     */
    public void setSupportRequestEditResult(int value) {
        this.supportRequestEditResult = value;
    }

}
