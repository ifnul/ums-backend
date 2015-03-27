
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
 *         &lt;element name="PersonFindByAttestatResult" type="{http://edboservice.ua/}ArrayOfDPersonFindByAttestat" minOccurs="0"/>
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
    "personFindByAttestatResult"
})
@XmlRootElement(name = "PersonFindByAttestatResponse")
public class PersonFindByAttestatResponse {

    @XmlElement(name = "PersonFindByAttestatResult")
    protected ArrayOfDPersonFindByAttestat personFindByAttestatResult;

    /**
     * Gets the value of the personFindByAttestatResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonFindByAttestat }
     *     
     */
    public ArrayOfDPersonFindByAttestat getPersonFindByAttestatResult() {
        return personFindByAttestatResult;
    }

    /**
     * Sets the value of the personFindByAttestatResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonFindByAttestat }
     *     
     */
    public void setPersonFindByAttestatResult(ArrayOfDPersonFindByAttestat value) {
        this.personFindByAttestatResult = value;
    }

}
