
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
 *         &lt;element name="PersonsStudentsGrupsPersonsFind2Result" type="{http://edboservice.ua/}ArrayOfDPersonsStudentsGrupsPersonsFind2" minOccurs="0"/>
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
    "personsStudentsGrupsPersonsFind2Result"
})
@XmlRootElement(name = "PersonsStudentsGrupsPersonsFind2Response")
public class PersonsStudentsGrupsPersonsFind2Response {

    @XmlElement(name = "PersonsStudentsGrupsPersonsFind2Result")
    protected ArrayOfDPersonsStudentsGrupsPersonsFind2 personsStudentsGrupsPersonsFind2Result;

    /**
     * Gets the value of the personsStudentsGrupsPersonsFind2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersonsFind2 }
     *     
     */
    public ArrayOfDPersonsStudentsGrupsPersonsFind2 getPersonsStudentsGrupsPersonsFind2Result() {
        return personsStudentsGrupsPersonsFind2Result;
    }

    /**
     * Sets the value of the personsStudentsGrupsPersonsFind2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersonsFind2 }
     *     
     */
    public void setPersonsStudentsGrupsPersonsFind2Result(ArrayOfDPersonsStudentsGrupsPersonsFind2 value) {
        this.personsStudentsGrupsPersonsFind2Result = value;
    }

}
