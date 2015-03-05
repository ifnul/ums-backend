
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
 *         &lt;element name="PersonsStudentsGrupsPersonsAdditionalGetResult" type="{http://edboservice.ua/}ArrayOfDPersonsStudentsGrupsPersonsAdditional" minOccurs="0"/>
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
    "personsStudentsGrupsPersonsAdditionalGetResult"
})
@XmlRootElement(name = "PersonsStudentsGrupsPersonsAdditionalGetResponse")
public class PersonsStudentsGrupsPersonsAdditionalGetResponse {

    @XmlElement(name = "PersonsStudentsGrupsPersonsAdditionalGetResult")
    protected ArrayOfDPersonsStudentsGrupsPersonsAdditional personsStudentsGrupsPersonsAdditionalGetResult;

    /**
     * Gets the value of the personsStudentsGrupsPersonsAdditionalGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersonsAdditional }
     *     
     */
    public ArrayOfDPersonsStudentsGrupsPersonsAdditional getPersonsStudentsGrupsPersonsAdditionalGetResult() {
        return personsStudentsGrupsPersonsAdditionalGetResult;
    }

    /**
     * Sets the value of the personsStudentsGrupsPersonsAdditionalGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersonsAdditional }
     *     
     */
    public void setPersonsStudentsGrupsPersonsAdditionalGetResult(ArrayOfDPersonsStudentsGrupsPersonsAdditional value) {
        this.personsStudentsGrupsPersonsAdditionalGetResult = value;
    }

}
