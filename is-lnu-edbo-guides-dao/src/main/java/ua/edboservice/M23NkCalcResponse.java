
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
 *         &lt;element name="m23nkCalcResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "m23NkCalcResult"
})
@XmlRootElement(name = "m23nkCalcResponse")
public class M23NkCalcResponse {

    @XmlElement(name = "m23nkCalcResult")
    protected int m23NkCalcResult;

    /**
     * Gets the value of the m23NkCalcResult property.
     * 
     */
    public int getM23NkCalcResult() {
        return m23NkCalcResult;
    }

    /**
     * Sets the value of the m23NkCalcResult property.
     * 
     */
    public void setM23NkCalcResult(int value) {
        this.m23NkCalcResult = value;
    }

}
