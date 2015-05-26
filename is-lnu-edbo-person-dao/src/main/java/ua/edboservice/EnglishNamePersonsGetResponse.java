
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
 *         &lt;element name="EnglishNamePersonsGetResult" type="{http://edboservice.ua/}ArrayOfDEnglishNamePersons" minOccurs="0"/>
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
    "englishNamePersonsGetResult"
})
@XmlRootElement(name = "EnglishNamePersonsGetResponse")
public class EnglishNamePersonsGetResponse {

    @XmlElement(name = "EnglishNamePersonsGetResult")
    protected ArrayOfDEnglishNamePersons englishNamePersonsGetResult;

    /**
     * Gets the value of the englishNamePersonsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEnglishNamePersons }
     *     
     */
    public ArrayOfDEnglishNamePersons getEnglishNamePersonsGetResult() {
        return englishNamePersonsGetResult;
    }

    /**
     * Sets the value of the englishNamePersonsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEnglishNamePersons }
     *     
     */
    public void setEnglishNamePersonsGetResult(ArrayOfDEnglishNamePersons value) {
        this.englishNamePersonsGetResult = value;
    }

}
