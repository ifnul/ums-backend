
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
 *         &lt;element name="PersonsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonsGet2" minOccurs="0"/>
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
    "personsGet2Result"
})
@XmlRootElement(name = "PersonsGet2Response")
public class PersonsGet2Response {

    @XmlElement(name = "PersonsGet2Result")
    protected ArrayOfDPersonsGet2 personsGet2Result;

    /**
     * Gets the value of the personsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsGet2 }
     *     
     */
    public ArrayOfDPersonsGet2 getPersonsGet2Result() {
        return personsGet2Result;
    }

    /**
     * Sets the value of the personsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsGet2 }
     *     
     */
    public void setPersonsGet2Result(ArrayOfDPersonsGet2 value) {
        this.personsGet2Result = value;
    }

}
