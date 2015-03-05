
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
 *         &lt;element name="ExtAttestatsFindResult" type="{http://edboservice.ua/}ArrayOfDExtAttestats" minOccurs="0"/>
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
    "extAttestatsFindResult"
})
@XmlRootElement(name = "ExtAttestatsFindResponse")
public class ExtAttestatsFindResponse {

    @XmlElement(name = "ExtAttestatsFindResult")
    protected ArrayOfDExtAttestats extAttestatsFindResult;

    /**
     * Gets the value of the extAttestatsFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExtAttestats }
     *     
     */
    public ArrayOfDExtAttestats getExtAttestatsFindResult() {
        return extAttestatsFindResult;
    }

    /**
     * Sets the value of the extAttestatsFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExtAttestats }
     *     
     */
    public void setExtAttestatsFindResult(ArrayOfDExtAttestats value) {
        this.extAttestatsFindResult = value;
    }

}
