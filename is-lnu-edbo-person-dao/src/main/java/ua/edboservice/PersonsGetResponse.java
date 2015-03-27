
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
 *         &lt;element name="PersonsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonsGet" minOccurs="0"/>
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
    "personsGetResult"
})
@XmlRootElement(name = "PersonsGetResponse")
public class PersonsGetResponse {

    @XmlElement(name = "PersonsGetResult")
    protected ArrayOfDPersonsGet personsGetResult;

    /**
     * Gets the value of the personsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsGet }
     *     
     */
    public ArrayOfDPersonsGet getPersonsGetResult() {
        return personsGetResult;
    }

    /**
     * Sets the value of the personsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsGet }
     *     
     */
    public void setPersonsGetResult(ArrayOfDPersonsGet value) {
        this.personsGetResult = value;
    }

}
