
package org.lnu.is.edbo.guides_min;

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
 *         &lt;element name="SpecSpecializationFindResult" type="{http://edboservice.ua/}ArrayOfDSpecSpecialization" minOccurs="0"/>
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
    "specSpecializationFindResult"
})
@XmlRootElement(name = "SpecSpecializationFindResponse")
public class SpecSpecializationFindResponse {

    @XmlElement(name = "SpecSpecializationFindResult")
    protected ArrayOfDSpecSpecialization specSpecializationFindResult;

    /**
     * Gets the value of the specSpecializationFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecSpecialization }
     *     
     */
    public ArrayOfDSpecSpecialization getSpecSpecializationFindResult() {
        return specSpecializationFindResult;
    }

    /**
     * Sets the value of the specSpecializationFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecSpecialization }
     *     
     */
    public void setSpecSpecializationFindResult(ArrayOfDSpecSpecialization value) {
        this.specSpecializationFindResult = value;
    }

}
