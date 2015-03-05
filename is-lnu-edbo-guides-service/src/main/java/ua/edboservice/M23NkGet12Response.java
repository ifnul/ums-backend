
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
 *         &lt;element name="m23nkGet_12Result" type="{http://edboservice.ua/}ArrayOfD23nk_12" minOccurs="0"/>
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
    "m23NkGet12Result"
})
@XmlRootElement(name = "m23nkGet_12Response")
public class M23NkGet12Response {

    @XmlElement(name = "m23nkGet_12Result")
    protected ArrayOfD23Nk12 m23NkGet12Result;

    /**
     * Gets the value of the m23NkGet12Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD23Nk12 }
     *     
     */
    public ArrayOfD23Nk12 getM23NkGet12Result() {
        return m23NkGet12Result;
    }

    /**
     * Sets the value of the m23NkGet12Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD23Nk12 }
     *     
     */
    public void setM23NkGet12Result(ArrayOfD23Nk12 value) {
        this.m23NkGet12Result = value;
    }

}
