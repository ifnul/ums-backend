
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
 *         &lt;element name="PersonsStudentsGrupsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonsStudentsGrups" minOccurs="0"/>
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
    "personsStudentsGrupsGetResult"
})
@XmlRootElement(name = "PersonsStudentsGrupsGetResponse")
public class PersonsStudentsGrupsGetResponse {

    @XmlElement(name = "PersonsStudentsGrupsGetResult")
    protected ArrayOfDPersonsStudentsGrups personsStudentsGrupsGetResult;

    /**
     * Gets the value of the personsStudentsGrupsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsStudentsGrups }
     *     
     */
    public ArrayOfDPersonsStudentsGrups getPersonsStudentsGrupsGetResult() {
        return personsStudentsGrupsGetResult;
    }

    /**
     * Sets the value of the personsStudentsGrupsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsStudentsGrups }
     *     
     */
    public void setPersonsStudentsGrupsGetResult(ArrayOfDPersonsStudentsGrups value) {
        this.personsStudentsGrupsGetResult = value;
    }

}
