
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
 *         &lt;element name="SupportRequestAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "supportRequestAddResult"
})
@XmlRootElement(name = "SupportRequestAddResponse")
public class SupportRequestAddResponse {

    @XmlElement(name = "SupportRequestAddResult")
    protected int supportRequestAddResult;

    /**
     * Gets the value of the supportRequestAddResult property.
     * 
     */
    public int getSupportRequestAddResult() {
        return supportRequestAddResult;
    }

    /**
     * Sets the value of the supportRequestAddResult property.
     * 
     */
    public void setSupportRequestAddResult(int value) {
        this.supportRequestAddResult = value;
    }

}
