
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
 *         &lt;element name="SpecSpecializationsGetResult" type="{http://edboservice.ua/}ArrayOfDSpecSpecializations" minOccurs="0"/>
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
    "specSpecializationsGetResult"
})
@XmlRootElement(name = "SpecSpecializationsGetResponse")
public class SpecSpecializationsGetResponse {

    @XmlElement(name = "SpecSpecializationsGetResult")
    protected ArrayOfDSpecSpecializations specSpecializationsGetResult;

    /**
     * Gets the value of the specSpecializationsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecSpecializations }
     *     
     */
    public ArrayOfDSpecSpecializations getSpecSpecializationsGetResult() {
        return specSpecializationsGetResult;
    }

    /**
     * Sets the value of the specSpecializationsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecSpecializations }
     *     
     */
    public void setSpecSpecializationsGetResult(ArrayOfDSpecSpecializations value) {
        this.specSpecializationsGetResult = value;
    }

}
