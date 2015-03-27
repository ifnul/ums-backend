
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
 *         &lt;element name="SpecProfessionsGetResult" type="{http://edboservice.ua/}ArrayOfDSpecProfessions" minOccurs="0"/>
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
    "specProfessionsGetResult"
})
@XmlRootElement(name = "SpecProfessionsGetResponse")
public class SpecProfessionsGetResponse {

    @XmlElement(name = "SpecProfessionsGetResult")
    protected ArrayOfDSpecProfessions specProfessionsGetResult;

    /**
     * Gets the value of the specProfessionsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecProfessions }
     *     
     */
    public ArrayOfDSpecProfessions getSpecProfessionsGetResult() {
        return specProfessionsGetResult;
    }

    /**
     * Sets the value of the specProfessionsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecProfessions }
     *     
     */
    public void setSpecProfessionsGetResult(ArrayOfDSpecProfessions value) {
        this.specProfessionsGetResult = value;
    }

}
