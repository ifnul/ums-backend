
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
 *         &lt;element name="UniversityJuristyialTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityJuristyialTypes" minOccurs="0"/>
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
    "universityJuristyialTypesGetResult"
})
@XmlRootElement(name = "UniversityJuristyialTypesGetResponse")
public class UniversityJuristyialTypesGetResponse {

    @XmlElement(name = "UniversityJuristyialTypesGetResult")
    protected ArrayOfDUniversityJuristyialTypes universityJuristyialTypesGetResult;

    /**
     * Gets the value of the universityJuristyialTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityJuristyialTypes }
     *     
     */
    public ArrayOfDUniversityJuristyialTypes getUniversityJuristyialTypesGetResult() {
        return universityJuristyialTypesGetResult;
    }

    /**
     * Sets the value of the universityJuristyialTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityJuristyialTypes }
     *     
     */
    public void setUniversityJuristyialTypesGetResult(ArrayOfDUniversityJuristyialTypes value) {
        this.universityJuristyialTypesGetResult = value;
    }

}
