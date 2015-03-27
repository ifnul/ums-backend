
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
 *         &lt;element name="SpecSpecialitiesGetResult" type="{http://edboservice.ua/}ArrayOfDSpecSpecialities" minOccurs="0"/>
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
    "specSpecialitiesGetResult"
})
@XmlRootElement(name = "SpecSpecialitiesGetResponse")
public class SpecSpecialitiesGetResponse {

    @XmlElement(name = "SpecSpecialitiesGetResult")
    protected ArrayOfDSpecSpecialities specSpecialitiesGetResult;

    /**
     * Gets the value of the specSpecialitiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecSpecialities }
     *     
     */
    public ArrayOfDSpecSpecialities getSpecSpecialitiesGetResult() {
        return specSpecialitiesGetResult;
    }

    /**
     * Sets the value of the specSpecialitiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecSpecialities }
     *     
     */
    public void setSpecSpecialitiesGetResult(ArrayOfDSpecSpecialities value) {
        this.specSpecialitiesGetResult = value;
    }

}
