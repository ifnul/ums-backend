
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
 *         &lt;element name="m23nkCheckResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "m23NkCheckResult"
})
@XmlRootElement(name = "m23nkCheckResponse")
public class M23NkCheckResponse {

    @XmlElement(name = "m23nkCheckResult")
    protected int m23NkCheckResult;

    /**
     * Gets the value of the m23NkCheckResult property.
     * 
     */
    public int getM23NkCheckResult() {
        return m23NkCheckResult;
    }

    /**
     * Sets the value of the m23NkCheckResult property.
     * 
     */
    public void setM23NkCheckResult(int value) {
        this.m23NkCheckResult = value;
    }

}
