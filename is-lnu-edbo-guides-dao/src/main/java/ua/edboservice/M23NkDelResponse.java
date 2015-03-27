
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
 *         &lt;element name="m23nkDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "m23NkDelResult"
})
@XmlRootElement(name = "m23nkDelResponse")
public class M23NkDelResponse {

    @XmlElement(name = "m23nkDelResult")
    protected int m23NkDelResult;

    /**
     * Gets the value of the m23NkDelResult property.
     * 
     */
    public int getM23NkDelResult() {
        return m23NkDelResult;
    }

    /**
     * Sets the value of the m23NkDelResult property.
     * 
     */
    public void setM23NkDelResult(int value) {
        this.m23NkDelResult = value;
    }

}
