
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
 *         &lt;element name="AcademicCouncilPersonsGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicCouncilPersons" minOccurs="0"/>
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
    "academicCouncilPersonsGetResult"
})
@XmlRootElement(name = "AcademicCouncilPersonsGetResponse")
public class AcademicCouncilPersonsGetResponse {

    @XmlElement(name = "AcademicCouncilPersonsGetResult")
    protected ArrayOfDAcademicCouncilPersons academicCouncilPersonsGetResult;

    /**
     * Gets the value of the academicCouncilPersonsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicCouncilPersons }
     *     
     */
    public ArrayOfDAcademicCouncilPersons getAcademicCouncilPersonsGetResult() {
        return academicCouncilPersonsGetResult;
    }

    /**
     * Sets the value of the academicCouncilPersonsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicCouncilPersons }
     *     
     */
    public void setAcademicCouncilPersonsGetResult(ArrayOfDAcademicCouncilPersons value) {
        this.academicCouncilPersonsGetResult = value;
    }

}
