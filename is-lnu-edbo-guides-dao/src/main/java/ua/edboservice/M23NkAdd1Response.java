
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
 *         &lt;element name="m23nkAdd_1Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "m23NkAdd1Result"
})
@XmlRootElement(name = "m23nkAdd_1Response")
public class M23NkAdd1Response {

    @XmlElement(name = "m23nkAdd_1Result")
    protected int m23NkAdd1Result;

    /**
     * Gets the value of the m23NkAdd1Result property.
     * 
     */
    public int getM23NkAdd1Result() {
        return m23NkAdd1Result;
    }

    /**
     * Sets the value of the m23NkAdd1Result property.
     * 
     */
    public void setM23NkAdd1Result(int value) {
        this.m23NkAdd1Result = value;
    }

}
