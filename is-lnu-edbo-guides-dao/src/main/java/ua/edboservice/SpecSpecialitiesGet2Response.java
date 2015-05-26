
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
 *         &lt;element name="SpecSpecialitiesGet2Result" type="{http://edboservice.ua/}ArrayOfDSpecSpecialities2" minOccurs="0"/>
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
    "specSpecialitiesGet2Result"
})
@XmlRootElement(name = "SpecSpecialitiesGet2Response")
public class SpecSpecialitiesGet2Response {

    @XmlElement(name = "SpecSpecialitiesGet2Result")
    protected ArrayOfDSpecSpecialities2 specSpecialitiesGet2Result;

    /**
     * Gets the value of the specSpecialitiesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecSpecialities2 }
     *     
     */
    public ArrayOfDSpecSpecialities2 getSpecSpecialitiesGet2Result() {
        return specSpecialitiesGet2Result;
    }

    /**
     * Sets the value of the specSpecialitiesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecSpecialities2 }
     *     
     */
    public void setSpecSpecialitiesGet2Result(ArrayOfDSpecSpecialities2 value) {
        this.specSpecialitiesGet2Result = value;
    }

}
