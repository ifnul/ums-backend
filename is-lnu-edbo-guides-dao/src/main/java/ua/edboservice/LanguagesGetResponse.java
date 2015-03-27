
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
 *         &lt;element name="LanguagesGetResult" type="{http://edboservice.ua/}ArrayOfDLanguages" minOccurs="0"/>
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
    "languagesGetResult"
})
@XmlRootElement(name = "LanguagesGetResponse")
public class LanguagesGetResponse {

    @XmlElement(name = "LanguagesGetResult")
    protected ArrayOfDLanguages languagesGetResult;

    /**
     * Gets the value of the languagesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDLanguages }
     *     
     */
    public ArrayOfDLanguages getLanguagesGetResult() {
        return languagesGetResult;
    }

    /**
     * Sets the value of the languagesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDLanguages }
     *     
     */
    public void setLanguagesGetResult(ArrayOfDLanguages value) {
        this.languagesGetResult = value;
    }

}
