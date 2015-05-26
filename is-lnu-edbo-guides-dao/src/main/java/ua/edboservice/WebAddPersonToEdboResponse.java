
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
 *         &lt;element name="WebAddPersonToEdboResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "webAddPersonToEdboResult"
})
@XmlRootElement(name = "WebAddPersonToEdboResponse")
public class WebAddPersonToEdboResponse {

    @XmlElement(name = "WebAddPersonToEdboResult")
    protected int webAddPersonToEdboResult;

    /**
     * Gets the value of the webAddPersonToEdboResult property.
     * 
     */
    public int getWebAddPersonToEdboResult() {
        return webAddPersonToEdboResult;
    }

    /**
     * Sets the value of the webAddPersonToEdboResult property.
     * 
     */
    public void setWebAddPersonToEdboResult(int value) {
        this.webAddPersonToEdboResult = value;
    }

}
