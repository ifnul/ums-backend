
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
 *         &lt;element name="PersonsStudentsGrupsPersonsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonsStudentsGrupsPersons2" minOccurs="0"/>
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
    "personsStudentsGrupsPersonsGet2Result"
})
@XmlRootElement(name = "PersonsStudentsGrupsPersonsGet2Response")
public class PersonsStudentsGrupsPersonsGet2Response {

    @XmlElement(name = "PersonsStudentsGrupsPersonsGet2Result")
    protected ArrayOfDPersonsStudentsGrupsPersons2 personsStudentsGrupsPersonsGet2Result;

    /**
     * Gets the value of the personsStudentsGrupsPersonsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersons2 }
     *     
     */
    public ArrayOfDPersonsStudentsGrupsPersons2 getPersonsStudentsGrupsPersonsGet2Result() {
        return personsStudentsGrupsPersonsGet2Result;
    }

    /**
     * Sets the value of the personsStudentsGrupsPersonsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersons2 }
     *     
     */
    public void setPersonsStudentsGrupsPersonsGet2Result(ArrayOfDPersonsStudentsGrupsPersons2 value) {
        this.personsStudentsGrupsPersonsGet2Result = value;
    }

}
