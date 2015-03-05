
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
 *         &lt;element name="PersonFindByAttestat2Result" type="{http://edboservice.ua/}ArrayOfDPersonFindByAttestat2" minOccurs="0"/>
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
    "personFindByAttestat2Result"
})
@XmlRootElement(name = "PersonFindByAttestat2Response")
public class PersonFindByAttestat2Response {

    @XmlElement(name = "PersonFindByAttestat2Result")
    protected ArrayOfDPersonFindByAttestat2 personFindByAttestat2Result;

    /**
     * Gets the value of the personFindByAttestat2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonFindByAttestat2 }
     *     
     */
    public ArrayOfDPersonFindByAttestat2 getPersonFindByAttestat2Result() {
        return personFindByAttestat2Result;
    }

    /**
     * Sets the value of the personFindByAttestat2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonFindByAttestat2 }
     *     
     */
    public void setPersonFindByAttestat2Result(ArrayOfDPersonFindByAttestat2 value) {
        this.personFindByAttestat2Result = value;
    }

}
