
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
 *         &lt;element name="PersonsStudentsForRequestDPGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestAnketaDP" minOccurs="0"/>
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
    "personsStudentsForRequestDPGetResult"
})
@XmlRootElement(name = "PersonsStudentsForRequestDPGetResponse")
public class PersonsStudentsForRequestDPGetResponse {

    @XmlElement(name = "PersonsStudentsForRequestDPGetResult")
    protected ArrayOfDPersonRequestAnketaDP personsStudentsForRequestDPGetResult;

    /**
     * Gets the value of the personsStudentsForRequestDPGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestAnketaDP }
     *     
     */
    public ArrayOfDPersonRequestAnketaDP getPersonsStudentsForRequestDPGetResult() {
        return personsStudentsForRequestDPGetResult;
    }

    /**
     * Sets the value of the personsStudentsForRequestDPGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestAnketaDP }
     *     
     */
    public void setPersonsStudentsForRequestDPGetResult(ArrayOfDPersonRequestAnketaDP value) {
        this.personsStudentsForRequestDPGetResult = value;
    }

}
