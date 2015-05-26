
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
 *         &lt;element name="m23nkAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "m23NkAddResult"
})
@XmlRootElement(name = "m23nkAddResponse")
public class M23NkAddResponse {

    @XmlElement(name = "m23nkAddResult")
    protected int m23NkAddResult;

    /**
     * Gets the value of the m23NkAddResult property.
     * 
     */
    public int getM23NkAddResult() {
        return m23NkAddResult;
    }

    /**
     * Sets the value of the m23NkAddResult property.
     * 
     */
    public void setM23NkAddResult(int value) {
        this.m23NkAddResult = value;
    }

}
