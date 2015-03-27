
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
 *         &lt;element name="m23nkMONCheckChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "m23NkMONCheckChangeResult"
})
@XmlRootElement(name = "m23nkMONCheckChangeResponse")
public class M23NkMONCheckChangeResponse {

    @XmlElement(name = "m23nkMONCheckChangeResult")
    protected int m23NkMONCheckChangeResult;

    /**
     * Gets the value of the m23NkMONCheckChangeResult property.
     * 
     */
    public int getM23NkMONCheckChangeResult() {
        return m23NkMONCheckChangeResult;
    }

    /**
     * Sets the value of the m23NkMONCheckChangeResult property.
     * 
     */
    public void setM23NkMONCheckChangeResult(int value) {
        this.m23NkMONCheckChangeResult = value;
    }

}
