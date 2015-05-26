
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
 *         &lt;element name="AcademicEducationDegreDetailTypeGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducationDegreDetailType" minOccurs="0"/>
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
    "academicEducationDegreDetailTypeGetResult"
})
@XmlRootElement(name = "AcademicEducationDegreDetailTypeGetResponse")
public class AcademicEducationDegreDetailTypeGetResponse {

    @XmlElement(name = "AcademicEducationDegreDetailTypeGetResult")
    protected ArrayOfDAcademicEducationDegreDetailType academicEducationDegreDetailTypeGetResult;

    /**
     * Gets the value of the academicEducationDegreDetailTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducationDegreDetailType }
     *     
     */
    public ArrayOfDAcademicEducationDegreDetailType getAcademicEducationDegreDetailTypeGetResult() {
        return academicEducationDegreDetailTypeGetResult;
    }

    /**
     * Sets the value of the academicEducationDegreDetailTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducationDegreDetailType }
     *     
     */
    public void setAcademicEducationDegreDetailTypeGetResult(ArrayOfDAcademicEducationDegreDetailType value) {
        this.academicEducationDegreDetailTypeGetResult = value;
    }

}
