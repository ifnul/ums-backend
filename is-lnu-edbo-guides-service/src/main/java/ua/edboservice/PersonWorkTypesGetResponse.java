
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
 *         &lt;element name="PersonWorkTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonWorkTypes" minOccurs="0"/>
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
    "personWorkTypesGetResult"
})
@XmlRootElement(name = "PersonWorkTypesGetResponse")
public class PersonWorkTypesGetResponse {

    @XmlElement(name = "PersonWorkTypesGetResult")
    protected ArrayOfDPersonWorkTypes personWorkTypesGetResult;

    /**
     * Gets the value of the personWorkTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonWorkTypes }
     *     
     */
    public ArrayOfDPersonWorkTypes getPersonWorkTypesGetResult() {
        return personWorkTypesGetResult;
    }

    /**
     * Sets the value of the personWorkTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonWorkTypes }
     *     
     */
    public void setPersonWorkTypesGetResult(ArrayOfDPersonWorkTypes value) {
        this.personWorkTypesGetResult = value;
    }

}
