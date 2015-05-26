
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
 *         &lt;element name="PersonsStudentsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonStudents" minOccurs="0"/>
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
    "personsStudentsGetResult"
})
@XmlRootElement(name = "PersonsStudentsGetResponse")
public class PersonsStudentsGetResponse {

    @XmlElement(name = "PersonsStudentsGetResult")
    protected ArrayOfDPersonStudents personsStudentsGetResult;

    /**
     * Gets the value of the personsStudentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonStudents }
     *     
     */
    public ArrayOfDPersonStudents getPersonsStudentsGetResult() {
        return personsStudentsGetResult;
    }

    /**
     * Sets the value of the personsStudentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonStudents }
     *     
     */
    public void setPersonsStudentsGetResult(ArrayOfDPersonStudents value) {
        this.personsStudentsGetResult = value;
    }

}
