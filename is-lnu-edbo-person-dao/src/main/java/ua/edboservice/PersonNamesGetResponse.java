
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
 *         &lt;element name="PersonNamesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonNames" minOccurs="0"/>
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
    "personNamesGetResult"
})
@XmlRootElement(name = "PersonNamesGetResponse")
public class PersonNamesGetResponse {

    @XmlElement(name = "PersonNamesGetResult")
    protected ArrayOfDPersonNames personNamesGetResult;

    /**
     * Gets the value of the personNamesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonNames }
     *     
     */
    public ArrayOfDPersonNames getPersonNamesGetResult() {
        return personNamesGetResult;
    }

    /**
     * Sets the value of the personNamesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonNames }
     *     
     */
    public void setPersonNamesGetResult(ArrayOfDPersonNames value) {
        this.personNamesGetResult = value;
    }

}
