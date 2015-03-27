
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
 *         &lt;element name="SpecProfessionsRangGetResult" type="{http://edboservice.ua/}ArrayOfDSpecProfessionsRang" minOccurs="0"/>
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
    "specProfessionsRangGetResult"
})
@XmlRootElement(name = "SpecProfessionsRangGetResponse")
public class SpecProfessionsRangGetResponse {

    @XmlElement(name = "SpecProfessionsRangGetResult")
    protected ArrayOfDSpecProfessionsRang specProfessionsRangGetResult;

    /**
     * Gets the value of the specProfessionsRangGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecProfessionsRang }
     *     
     */
    public ArrayOfDSpecProfessionsRang getSpecProfessionsRangGetResult() {
        return specProfessionsRangGetResult;
    }

    /**
     * Sets the value of the specProfessionsRangGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecProfessionsRang }
     *     
     */
    public void setSpecProfessionsRangGetResult(ArrayOfDSpecProfessionsRang value) {
        this.specProfessionsRangGetResult = value;
    }

}
