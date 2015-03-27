
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
 *         &lt;element name="PersonsStudentsGrupsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonsStudentsGrups2" minOccurs="0"/>
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
    "personsStudentsGrupsGet2Result"
})
@XmlRootElement(name = "PersonsStudentsGrupsGet2Response")
public class PersonsStudentsGrupsGet2Response {

    @XmlElement(name = "PersonsStudentsGrupsGet2Result")
    protected ArrayOfDPersonsStudentsGrups2 personsStudentsGrupsGet2Result;

    /**
     * Gets the value of the personsStudentsGrupsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsStudentsGrups2 }
     *     
     */
    public ArrayOfDPersonsStudentsGrups2 getPersonsStudentsGrupsGet2Result() {
        return personsStudentsGrupsGet2Result;
    }

    /**
     * Sets the value of the personsStudentsGrupsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsStudentsGrups2 }
     *     
     */
    public void setPersonsStudentsGrupsGet2Result(ArrayOfDPersonsStudentsGrups2 value) {
        this.personsStudentsGrupsGet2Result = value;
    }

}
