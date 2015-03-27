
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
 *         &lt;element name="PersonAcademiesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonAcademiesGet" minOccurs="0"/>
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
    "personAcademiesGetResult"
})
@XmlRootElement(name = "PersonAcademiesGetResponse")
public class PersonAcademiesGetResponse {

    @XmlElement(name = "PersonAcademiesGetResult")
    protected ArrayOfDPersonAcademiesGet personAcademiesGetResult;

    /**
     * Gets the value of the personAcademiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAcademiesGet }
     *     
     */
    public ArrayOfDPersonAcademiesGet getPersonAcademiesGetResult() {
        return personAcademiesGetResult;
    }

    /**
     * Sets the value of the personAcademiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAcademiesGet }
     *     
     */
    public void setPersonAcademiesGetResult(ArrayOfDPersonAcademiesGet value) {
        this.personAcademiesGetResult = value;
    }

}
