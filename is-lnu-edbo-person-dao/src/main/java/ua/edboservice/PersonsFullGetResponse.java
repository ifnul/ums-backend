
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
 *         &lt;element name="PersonsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonsGetFull" minOccurs="0"/>
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
    "personsFullGetResult"
})
@XmlRootElement(name = "PersonsFullGetResponse")
public class PersonsFullGetResponse {

    @XmlElement(name = "PersonsFullGetResult")
    protected ArrayOfDPersonsGetFull personsFullGetResult;

    /**
     * Gets the value of the personsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsGetFull }
     *     
     */
    public ArrayOfDPersonsGetFull getPersonsFullGetResult() {
        return personsFullGetResult;
    }

    /**
     * Sets the value of the personsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsGetFull }
     *     
     */
    public void setPersonsFullGetResult(ArrayOfDPersonsGetFull value) {
        this.personsFullGetResult = value;
    }

}
