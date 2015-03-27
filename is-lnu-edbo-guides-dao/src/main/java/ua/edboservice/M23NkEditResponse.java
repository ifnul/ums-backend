
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
 *         &lt;element name="m23nkEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "m23NkEditResult"
})
@XmlRootElement(name = "m23nkEditResponse")
public class M23NkEditResponse {

    @XmlElement(name = "m23nkEditResult")
    protected int m23NkEditResult;

    /**
     * Gets the value of the m23NkEditResult property.
     * 
     */
    public int getM23NkEditResult() {
        return m23NkEditResult;
    }

    /**
     * Sets the value of the m23NkEditResult property.
     * 
     */
    public void setM23NkEditResult(int value) {
        this.m23NkEditResult = value;
    }

}
