
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
 *         &lt;element name="PersonEducationsCancelEducationTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationsCancelEducationTypes" minOccurs="0"/>
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
    "personEducationsCancelEducationTypesGetResult"
})
@XmlRootElement(name = "PersonEducationsCancelEducationTypesGetResponse")
public class PersonEducationsCancelEducationTypesGetResponse {

    @XmlElement(name = "PersonEducationsCancelEducationTypesGetResult")
    protected ArrayOfDPersonEducationsCancelEducationTypes personEducationsCancelEducationTypesGetResult;

    /**
     * Gets the value of the personEducationsCancelEducationTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationsCancelEducationTypes }
     *     
     */
    public ArrayOfDPersonEducationsCancelEducationTypes getPersonEducationsCancelEducationTypesGetResult() {
        return personEducationsCancelEducationTypesGetResult;
    }

    /**
     * Sets the value of the personEducationsCancelEducationTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationsCancelEducationTypes }
     *     
     */
    public void setPersonEducationsCancelEducationTypesGetResult(ArrayOfDPersonEducationsCancelEducationTypes value) {
        this.personEducationsCancelEducationTypesGetResult = value;
    }

}
