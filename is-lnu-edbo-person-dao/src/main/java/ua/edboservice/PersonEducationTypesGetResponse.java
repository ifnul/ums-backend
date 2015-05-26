
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
 *         &lt;element name="PersonEducationTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationTypes" minOccurs="0"/>
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
    "personEducationTypesGetResult"
})
@XmlRootElement(name = "PersonEducationTypesGetResponse")
public class PersonEducationTypesGetResponse {

    @XmlElement(name = "PersonEducationTypesGetResult")
    protected ArrayOfDPersonEducationTypes personEducationTypesGetResult;

    /**
     * Gets the value of the personEducationTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationTypes }
     *     
     */
    public ArrayOfDPersonEducationTypes getPersonEducationTypesGetResult() {
        return personEducationTypesGetResult;
    }

    /**
     * Sets the value of the personEducationTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationTypes }
     *     
     */
    public void setPersonEducationTypesGetResult(ArrayOfDPersonEducationTypes value) {
        this.personEducationTypesGetResult = value;
    }

}
