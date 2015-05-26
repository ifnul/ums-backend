
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
 *         &lt;element name="PersonsStudentsGrupsPersonsFindResult" type="{http://edboservice.ua/}ArrayOfDPersonsStudentsGrupsPersonsFind" minOccurs="0"/>
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
    "personsStudentsGrupsPersonsFindResult"
})
@XmlRootElement(name = "PersonsStudentsGrupsPersonsFindResponse")
public class PersonsStudentsGrupsPersonsFindResponse {

    @XmlElement(name = "PersonsStudentsGrupsPersonsFindResult")
    protected ArrayOfDPersonsStudentsGrupsPersonsFind personsStudentsGrupsPersonsFindResult;

    /**
     * Gets the value of the personsStudentsGrupsPersonsFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersonsFind }
     *     
     */
    public ArrayOfDPersonsStudentsGrupsPersonsFind getPersonsStudentsGrupsPersonsFindResult() {
        return personsStudentsGrupsPersonsFindResult;
    }

    /**
     * Sets the value of the personsStudentsGrupsPersonsFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersonsFind }
     *     
     */
    public void setPersonsStudentsGrupsPersonsFindResult(ArrayOfDPersonsStudentsGrupsPersonsFind value) {
        this.personsStudentsGrupsPersonsFindResult = value;
    }

}
