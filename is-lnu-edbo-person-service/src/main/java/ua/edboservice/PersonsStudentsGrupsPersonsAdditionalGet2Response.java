
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
 *         &lt;element name="PersonsStudentsGrupsPersonsAdditionalGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonsStudentsGrupsPersonsAdditional2" minOccurs="0"/>
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
    "personsStudentsGrupsPersonsAdditionalGet2Result"
})
@XmlRootElement(name = "PersonsStudentsGrupsPersonsAdditionalGet2Response")
public class PersonsStudentsGrupsPersonsAdditionalGet2Response {

    @XmlElement(name = "PersonsStudentsGrupsPersonsAdditionalGet2Result")
    protected ArrayOfDPersonsStudentsGrupsPersonsAdditional2 personsStudentsGrupsPersonsAdditionalGet2Result;

    /**
     * Gets the value of the personsStudentsGrupsPersonsAdditionalGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersonsAdditional2 }
     *     
     */
    public ArrayOfDPersonsStudentsGrupsPersonsAdditional2 getPersonsStudentsGrupsPersonsAdditionalGet2Result() {
        return personsStudentsGrupsPersonsAdditionalGet2Result;
    }

    /**
     * Sets the value of the personsStudentsGrupsPersonsAdditionalGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsStudentsGrupsPersonsAdditional2 }
     *     
     */
    public void setPersonsStudentsGrupsPersonsAdditionalGet2Result(ArrayOfDPersonsStudentsGrupsPersonsAdditional2 value) {
        this.personsStudentsGrupsPersonsAdditionalGet2Result = value;
    }

}
