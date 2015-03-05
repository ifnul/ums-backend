
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
 *         &lt;element name="CountriesGetResult" type="{http://edboservice.ua/}ArrayOfDCountries" minOccurs="0"/>
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
    "countriesGetResult"
})
@XmlRootElement(name = "CountriesGetResponse")
public class CountriesGetResponse {

    @XmlElement(name = "CountriesGetResult")
    protected ArrayOfDCountries countriesGetResult;

    /**
     * Gets the value of the countriesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDCountries }
     *     
     */
    public ArrayOfDCountries getCountriesGetResult() {
        return countriesGetResult;
    }

    /**
     * Sets the value of the countriesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDCountries }
     *     
     */
    public void setCountriesGetResult(ArrayOfDCountries value) {
        this.countriesGetResult = value;
    }

}
