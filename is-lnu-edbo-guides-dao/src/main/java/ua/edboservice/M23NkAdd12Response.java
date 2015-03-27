
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
 *         &lt;element name="m23nkAdd_12Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "m23NkAdd12Result"
})
@XmlRootElement(name = "m23nkAdd_12Response")
public class M23NkAdd12Response {

    @XmlElement(name = "m23nkAdd_12Result")
    protected int m23NkAdd12Result;

    /**
     * Gets the value of the m23NkAdd12Result property.
     * 
     */
    public int getM23NkAdd12Result() {
        return m23NkAdd12Result;
    }

    /**
     * Sets the value of the m23NkAdd12Result property.
     * 
     */
    public void setM23NkAdd12Result(int value) {
        this.m23NkAdd12Result = value;
    }

}
