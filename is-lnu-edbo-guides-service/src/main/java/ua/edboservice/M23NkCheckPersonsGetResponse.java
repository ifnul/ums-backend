
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
 *         &lt;element name="m23nkCheckPersonsGetResult" type="{http://edboservice.ua/}ArrayOfD23nkCheckPersons" minOccurs="0"/>
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
    "m23NkCheckPersonsGetResult"
})
@XmlRootElement(name = "m23nkCheckPersonsGetResponse")
public class M23NkCheckPersonsGetResponse {

    @XmlElement(name = "m23nkCheckPersonsGetResult")
    protected ArrayOfD23NkCheckPersons m23NkCheckPersonsGetResult;

    /**
     * Gets the value of the m23NkCheckPersonsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD23NkCheckPersons }
     *     
     */
    public ArrayOfD23NkCheckPersons getM23NkCheckPersonsGetResult() {
        return m23NkCheckPersonsGetResult;
    }

    /**
     * Sets the value of the m23NkCheckPersonsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD23NkCheckPersons }
     *     
     */
    public void setM23NkCheckPersonsGetResult(ArrayOfD23NkCheckPersons value) {
        this.m23NkCheckPersonsGetResult = value;
    }

}
