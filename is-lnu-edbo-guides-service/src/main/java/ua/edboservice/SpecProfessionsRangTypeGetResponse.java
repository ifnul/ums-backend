
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
 *         &lt;element name="SpecProfessionsRangTypeGetResult" type="{http://edboservice.ua/}ArrayOfDSpecProfessionsRangType" minOccurs="0"/>
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
    "specProfessionsRangTypeGetResult"
})
@XmlRootElement(name = "SpecProfessionsRangTypeGetResponse")
public class SpecProfessionsRangTypeGetResponse {

    @XmlElement(name = "SpecProfessionsRangTypeGetResult")
    protected ArrayOfDSpecProfessionsRangType specProfessionsRangTypeGetResult;

    /**
     * Gets the value of the specProfessionsRangTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecProfessionsRangType }
     *     
     */
    public ArrayOfDSpecProfessionsRangType getSpecProfessionsRangTypeGetResult() {
        return specProfessionsRangTypeGetResult;
    }

    /**
     * Sets the value of the specProfessionsRangTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecProfessionsRangType }
     *     
     */
    public void setSpecProfessionsRangTypeGetResult(ArrayOfDSpecProfessionsRangType value) {
        this.specProfessionsRangTypeGetResult = value;
    }

}
