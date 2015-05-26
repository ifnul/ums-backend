
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
 *         &lt;element name="m23nkGetResult" type="{http://edboservice.ua/}ArrayOfD23nk" minOccurs="0"/>
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
    "m23NkGetResult"
})
@XmlRootElement(name = "m23nkGetResponse")
public class M23NkGetResponse {

    @XmlElement(name = "m23nkGetResult")
    protected ArrayOfD23Nk m23NkGetResult;

    /**
     * Gets the value of the m23NkGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD23Nk }
     *     
     */
    public ArrayOfD23Nk getM23NkGetResult() {
        return m23NkGetResult;
    }

    /**
     * Sets the value of the m23NkGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD23Nk }
     *     
     */
    public void setM23NkGetResult(ArrayOfD23Nk value) {
        this.m23NkGetResult = value;
    }

}
