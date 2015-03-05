
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
 *         &lt;element name="PersonSexTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonSexTypes" minOccurs="0"/>
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
    "personSexTypesGetResult"
})
@XmlRootElement(name = "PersonSexTypesGetResponse")
public class PersonSexTypesGetResponse {

    @XmlElement(name = "PersonSexTypesGetResult")
    protected ArrayOfDPersonSexTypes personSexTypesGetResult;

    /**
     * Gets the value of the personSexTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonSexTypes }
     *     
     */
    public ArrayOfDPersonSexTypes getPersonSexTypesGetResult() {
        return personSexTypesGetResult;
    }

    /**
     * Sets the value of the personSexTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonSexTypes }
     *     
     */
    public void setPersonSexTypesGetResult(ArrayOfDPersonSexTypes value) {
        this.personSexTypesGetResult = value;
    }

}
