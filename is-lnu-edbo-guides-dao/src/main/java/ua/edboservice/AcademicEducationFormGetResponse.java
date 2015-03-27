
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
 *         &lt;element name="AcademicEducationFormGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducationForm" minOccurs="0"/>
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
    "academicEducationFormGetResult"
})
@XmlRootElement(name = "AcademicEducationFormGetResponse")
public class AcademicEducationFormGetResponse {

    @XmlElement(name = "AcademicEducationFormGetResult")
    protected ArrayOfDAcademicEducationForm academicEducationFormGetResult;

    /**
     * Gets the value of the academicEducationFormGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducationForm }
     *     
     */
    public ArrayOfDAcademicEducationForm getAcademicEducationFormGetResult() {
        return academicEducationFormGetResult;
    }

    /**
     * Sets the value of the academicEducationFormGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducationForm }
     *     
     */
    public void setAcademicEducationFormGetResult(ArrayOfDAcademicEducationForm value) {
        this.academicEducationFormGetResult = value;
    }

}
