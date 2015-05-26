
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
 *         &lt;element name="PersonRequestForeignGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestForeign" minOccurs="0"/>
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
    "personRequestForeignGetResult"
})
@XmlRootElement(name = "PersonRequestForeignGetResponse")
public class PersonRequestForeignGetResponse {

    @XmlElement(name = "PersonRequestForeignGetResult")
    protected ArrayOfDPersonRequestForeign personRequestForeignGetResult;

    /**
     * Gets the value of the personRequestForeignGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestForeign }
     *     
     */
    public ArrayOfDPersonRequestForeign getPersonRequestForeignGetResult() {
        return personRequestForeignGetResult;
    }

    /**
     * Sets the value of the personRequestForeignGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestForeign }
     *     
     */
    public void setPersonRequestForeignGetResult(ArrayOfDPersonRequestForeign value) {
        this.personRequestForeignGetResult = value;
    }

}
