
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
 *         &lt;element name="PersonsStudentsForRequestDSGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestAnketaDS" minOccurs="0"/>
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
    "personsStudentsForRequestDSGetResult"
})
@XmlRootElement(name = "PersonsStudentsForRequestDSGetResponse")
public class PersonsStudentsForRequestDSGetResponse {

    @XmlElement(name = "PersonsStudentsForRequestDSGetResult")
    protected ArrayOfDPersonRequestAnketaDS personsStudentsForRequestDSGetResult;

    /**
     * Gets the value of the personsStudentsForRequestDSGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestAnketaDS }
     *     
     */
    public ArrayOfDPersonRequestAnketaDS getPersonsStudentsForRequestDSGetResult() {
        return personsStudentsForRequestDSGetResult;
    }

    /**
     * Sets the value of the personsStudentsForRequestDSGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestAnketaDS }
     *     
     */
    public void setPersonsStudentsForRequestDSGetResult(ArrayOfDPersonRequestAnketaDS value) {
        this.personsStudentsForRequestDSGetResult = value;
    }

}
