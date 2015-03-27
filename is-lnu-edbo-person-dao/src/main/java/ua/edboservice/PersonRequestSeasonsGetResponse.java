
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
 *         &lt;element name="PersonRequestSeasonsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestSeasons" minOccurs="0"/>
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
    "personRequestSeasonsGetResult"
})
@XmlRootElement(name = "PersonRequestSeasonsGetResponse")
public class PersonRequestSeasonsGetResponse {

    @XmlElement(name = "PersonRequestSeasonsGetResult")
    protected ArrayOfDPersonRequestSeasons personRequestSeasonsGetResult;

    /**
     * Gets the value of the personRequestSeasonsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestSeasons }
     *     
     */
    public ArrayOfDPersonRequestSeasons getPersonRequestSeasonsGetResult() {
        return personRequestSeasonsGetResult;
    }

    /**
     * Sets the value of the personRequestSeasonsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestSeasons }
     *     
     */
    public void setPersonRequestSeasonsGetResult(ArrayOfDPersonRequestSeasons value) {
        this.personRequestSeasonsGetResult = value;
    }

}
