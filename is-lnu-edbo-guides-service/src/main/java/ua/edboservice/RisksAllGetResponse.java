
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
 *         &lt;element name="RisksAllGetResult" type="{http://edboservice.ua/}ArrayOfDRisksAll" minOccurs="0"/>
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
    "risksAllGetResult"
})
@XmlRootElement(name = "RisksAllGetResponse")
public class RisksAllGetResponse {

    @XmlElement(name = "RisksAllGetResult")
    protected ArrayOfDRisksAll risksAllGetResult;

    /**
     * Gets the value of the risksAllGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRisksAll }
     *     
     */
    public ArrayOfDRisksAll getRisksAllGetResult() {
        return risksAllGetResult;
    }

    /**
     * Sets the value of the risksAllGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRisksAll }
     *     
     */
    public void setRisksAllGetResult(ArrayOfDRisksAll value) {
        this.risksAllGetResult = value;
    }

}
