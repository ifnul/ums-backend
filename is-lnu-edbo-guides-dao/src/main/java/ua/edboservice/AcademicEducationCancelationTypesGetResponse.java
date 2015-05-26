
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
 *         &lt;element name="AcademicEducationCancelationTypesGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducationCancelationTypes" minOccurs="0"/>
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
    "academicEducationCancelationTypesGetResult"
})
@XmlRootElement(name = "AcademicEducationCancelationTypesGetResponse")
public class AcademicEducationCancelationTypesGetResponse {

    @XmlElement(name = "AcademicEducationCancelationTypesGetResult")
    protected ArrayOfDAcademicEducationCancelationTypes academicEducationCancelationTypesGetResult;

    /**
     * Gets the value of the academicEducationCancelationTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducationCancelationTypes }
     *     
     */
    public ArrayOfDAcademicEducationCancelationTypes getAcademicEducationCancelationTypesGetResult() {
        return academicEducationCancelationTypesGetResult;
    }

    /**
     * Sets the value of the academicEducationCancelationTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducationCancelationTypes }
     *     
     */
    public void setAcademicEducationCancelationTypesGetResult(ArrayOfDAcademicEducationCancelationTypes value) {
        this.academicEducationCancelationTypesGetResult = value;
    }

}
