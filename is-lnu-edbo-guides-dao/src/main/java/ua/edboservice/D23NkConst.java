
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for d23nk_const complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="d23nk_const">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Constants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "d23nk_const", propOrder = {
    "constants"
})
public class D23NkConst {

    @XmlElement(name = "Constants")
    protected String constants;

    /**
     * Gets the value of the constants property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstants() {
        return constants;
    }

    /**
     * Sets the value of the constants property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstants(String value) {
        this.constants = value;
    }

}
