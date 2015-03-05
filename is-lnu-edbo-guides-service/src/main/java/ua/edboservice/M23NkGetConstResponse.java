
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
 *         &lt;element name="m23nkGet_constResult" type="{http://edboservice.ua/}ArrayOfD23nk_const" minOccurs="0"/>
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
    "m23NkGetConstResult"
})
@XmlRootElement(name = "m23nkGet_constResponse")
public class M23NkGetConstResponse {

    @XmlElement(name = "m23nkGet_constResult")
    protected ArrayOfD23NkConst m23NkGetConstResult;

    /**
     * Gets the value of the m23NkGetConstResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD23NkConst }
     *     
     */
    public ArrayOfD23NkConst getM23NkGetConstResult() {
        return m23NkGetConstResult;
    }

    /**
     * Sets the value of the m23NkGetConstResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD23NkConst }
     *     
     */
    public void setM23NkGetConstResult(ArrayOfD23NkConst value) {
        this.m23NkGetConstResult = value;
    }

}
