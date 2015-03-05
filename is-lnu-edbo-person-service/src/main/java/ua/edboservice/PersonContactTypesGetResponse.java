
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
 *         &lt;element name="PersonContactTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonContactTypes" minOccurs="0"/>
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
    "personContactTypesGetResult"
})
@XmlRootElement(name = "PersonContactTypesGetResponse")
public class PersonContactTypesGetResponse {

    @XmlElement(name = "PersonContactTypesGetResult")
    protected ArrayOfDPersonContactTypes personContactTypesGetResult;

    /**
     * Gets the value of the personContactTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonContactTypes }
     *     
     */
    public ArrayOfDPersonContactTypes getPersonContactTypesGetResult() {
        return personContactTypesGetResult;
    }

    /**
     * Sets the value of the personContactTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonContactTypes }
     *     
     */
    public void setPersonContactTypesGetResult(ArrayOfDPersonContactTypes value) {
        this.personContactTypesGetResult = value;
    }

}
