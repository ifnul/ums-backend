
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
 *         &lt;element name="ExtAttestatsUzFindResult" type="{http://edboservice.ua/}ArrayOfDExtAttestatsUz" minOccurs="0"/>
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
    "extAttestatsUzFindResult"
})
@XmlRootElement(name = "ExtAttestatsUzFindResponse")
public class ExtAttestatsUzFindResponse {

    @XmlElement(name = "ExtAttestatsUzFindResult")
    protected ArrayOfDExtAttestatsUz extAttestatsUzFindResult;

    /**
     * Gets the value of the extAttestatsUzFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExtAttestatsUz }
     *     
     */
    public ArrayOfDExtAttestatsUz getExtAttestatsUzFindResult() {
        return extAttestatsUzFindResult;
    }

    /**
     * Sets the value of the extAttestatsUzFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExtAttestatsUz }
     *     
     */
    public void setExtAttestatsUzFindResult(ArrayOfDExtAttestatsUz value) {
        this.extAttestatsUzFindResult = value;
    }

}
