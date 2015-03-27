
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
 *         &lt;element name="PersonsFind2Result" type="{http://edboservice.ua/}ArrayOfDPersonsFind2" minOccurs="0"/>
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
    "personsFind2Result"
})
@XmlRootElement(name = "PersonsFind2Response")
public class PersonsFind2Response {

    @XmlElement(name = "PersonsFind2Result")
    protected ArrayOfDPersonsFind2 personsFind2Result;

    /**
     * Gets the value of the personsFind2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsFind2 }
     *     
     */
    public ArrayOfDPersonsFind2 getPersonsFind2Result() {
        return personsFind2Result;
    }

    /**
     * Sets the value of the personsFind2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsFind2 }
     *     
     */
    public void setPersonsFind2Result(ArrayOfDPersonsFind2 value) {
        this.personsFind2Result = value;
    }

}
