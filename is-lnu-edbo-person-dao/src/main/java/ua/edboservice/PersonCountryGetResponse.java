
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
 *         &lt;element name="PersonCountryGetResult" type="{http://edboservice.ua/}ArrayOfDPersonCountry" minOccurs="0"/>
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
    "personCountryGetResult"
})
@XmlRootElement(name = "PersonCountryGetResponse")
public class PersonCountryGetResponse {

    @XmlElement(name = "PersonCountryGetResult")
    protected ArrayOfDPersonCountry personCountryGetResult;

    /**
     * Gets the value of the personCountryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonCountry }
     *     
     */
    public ArrayOfDPersonCountry getPersonCountryGetResult() {
        return personCountryGetResult;
    }

    /**
     * Sets the value of the personCountryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonCountry }
     *     
     */
    public void setPersonCountryGetResult(ArrayOfDPersonCountry value) {
        this.personCountryGetResult = value;
    }

}
