
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
 *         &lt;element name="m23nkGet_1Result" type="{http://edboservice.ua/}ArrayOfD23nk_1" minOccurs="0"/>
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
    "m23NkGet1Result"
})
@XmlRootElement(name = "m23nkGet_1Response")
public class M23NkGet1Response {

    @XmlElement(name = "m23nkGet_1Result")
    protected ArrayOfD23Nk1 m23NkGet1Result;

    /**
     * Gets the value of the m23NkGet1Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD23Nk1 }
     *     
     */
    public ArrayOfD23Nk1 getM23NkGet1Result() {
        return m23NkGet1Result;
    }

    /**
     * Sets the value of the m23NkGet1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD23Nk1 }
     *     
     */
    public void setM23NkGet1Result(ArrayOfD23Nk1 value) {
        this.m23NkGet1Result = value;
    }

}
