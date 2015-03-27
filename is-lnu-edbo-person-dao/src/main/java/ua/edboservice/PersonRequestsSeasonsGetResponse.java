
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
 *         &lt;element name="PersonRequestsSeasonsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestsSeasons" minOccurs="0"/>
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
    "personRequestsSeasonsGetResult"
})
@XmlRootElement(name = "PersonRequestsSeasonsGetResponse")
public class PersonRequestsSeasonsGetResponse {

    @XmlElement(name = "PersonRequestsSeasonsGetResult")
    protected ArrayOfDPersonRequestsSeasons personRequestsSeasonsGetResult;

    /**
     * Gets the value of the personRequestsSeasonsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestsSeasons }
     *     
     */
    public ArrayOfDPersonRequestsSeasons getPersonRequestsSeasonsGetResult() {
        return personRequestsSeasonsGetResult;
    }

    /**
     * Sets the value of the personRequestsSeasonsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestsSeasons }
     *     
     */
    public void setPersonRequestsSeasonsGetResult(ArrayOfDPersonRequestsSeasons value) {
        this.personRequestsSeasonsGetResult = value;
    }

}
