
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
 *         &lt;element name="AttestatCheckResult" type="{http://edboservice.ua/}dAttestatCheck" minOccurs="0"/>
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
    "attestatCheckResult"
})
@XmlRootElement(name = "AttestatCheckResponse")
public class AttestatCheckResponse {

    @XmlElement(name = "AttestatCheckResult")
    protected DAttestatCheck attestatCheckResult;

    /**
     * Gets the value of the attestatCheckResult property.
     * 
     * @return
     *     possible object is
     *     {@link DAttestatCheck }
     *     
     */
    public DAttestatCheck getAttestatCheckResult() {
        return attestatCheckResult;
    }

    /**
     * Sets the value of the attestatCheckResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DAttestatCheck }
     *     
     */
    public void setAttestatCheckResult(DAttestatCheck value) {
        this.attestatCheckResult = value;
    }

}
