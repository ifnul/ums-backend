
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
 *         &lt;element name="PersonsFind3Result" type="{http://edboservice.ua/}ArrayOfDPersonsFind3" minOccurs="0"/>
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
    "personsFind3Result"
})
@XmlRootElement(name = "PersonsFind3Response")
public class PersonsFind3Response {

    @XmlElement(name = "PersonsFind3Result")
    protected ArrayOfDPersonsFind3 personsFind3Result;

    /**
     * Gets the value of the personsFind3Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsFind3 }
     *     
     */
    public ArrayOfDPersonsFind3 getPersonsFind3Result() {
        return personsFind3Result;
    }

    /**
     * Sets the value of the personsFind3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsFind3 }
     *     
     */
    public void setPersonsFind3Result(ArrayOfDPersonsFind3 value) {
        this.personsFind3Result = value;
    }

}
