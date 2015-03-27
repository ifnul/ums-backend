
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
 *         &lt;element name="PersonsStudentsForRequestGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestAnketa" minOccurs="0"/>
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
    "personsStudentsForRequestGetResult"
})
@XmlRootElement(name = "PersonsStudentsForRequestGetResponse")
public class PersonsStudentsForRequestGetResponse {

    @XmlElement(name = "PersonsStudentsForRequestGetResult")
    protected ArrayOfDPersonRequestAnketa personsStudentsForRequestGetResult;

    /**
     * Gets the value of the personsStudentsForRequestGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestAnketa }
     *     
     */
    public ArrayOfDPersonRequestAnketa getPersonsStudentsForRequestGetResult() {
        return personsStudentsForRequestGetResult;
    }

    /**
     * Sets the value of the personsStudentsForRequestGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestAnketa }
     *     
     */
    public void setPersonsStudentsForRequestGetResult(ArrayOfDPersonRequestAnketa value) {
        this.personsStudentsForRequestGetResult = value;
    }

}
