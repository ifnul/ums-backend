
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
 *         &lt;element name="AcademicEducationGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducation" minOccurs="0"/>
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
    "academicEducationGetResult"
})
@XmlRootElement(name = "AcademicEducationGetResponse")
public class AcademicEducationGetResponse {

    @XmlElement(name = "AcademicEducationGetResult")
    protected ArrayOfDAcademicEducation academicEducationGetResult;

    /**
     * Gets the value of the academicEducationGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducation }
     *     
     */
    public ArrayOfDAcademicEducation getAcademicEducationGetResult() {
        return academicEducationGetResult;
    }

    /**
     * Sets the value of the academicEducationGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducation }
     *     
     */
    public void setAcademicEducationGetResult(ArrayOfDAcademicEducation value) {
        this.academicEducationGetResult = value;
    }

}
