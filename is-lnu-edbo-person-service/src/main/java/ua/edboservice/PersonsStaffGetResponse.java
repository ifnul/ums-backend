
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
 *         &lt;element name="PersonsStaffGetResult" type="{http://edboservice.ua/}ArrayOfDPersonStuff" minOccurs="0"/>
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
    "personsStaffGetResult"
})
@XmlRootElement(name = "PersonsStaffGetResponse")
public class PersonsStaffGetResponse {

    @XmlElement(name = "PersonsStaffGetResult")
    protected ArrayOfDPersonStuff personsStaffGetResult;

    /**
     * Gets the value of the personsStaffGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonStuff }
     *     
     */
    public ArrayOfDPersonStuff getPersonsStaffGetResult() {
        return personsStaffGetResult;
    }

    /**
     * Sets the value of the personsStaffGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonStuff }
     *     
     */
    public void setPersonsStaffGetResult(ArrayOfDPersonStuff value) {
        this.personsStaffGetResult = value;
    }

}
