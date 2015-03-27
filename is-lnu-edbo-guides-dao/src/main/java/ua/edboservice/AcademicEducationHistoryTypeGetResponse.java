
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
 *         &lt;element name="AcademicEducationHistoryTypeGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducationHistoryType" minOccurs="0"/>
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
    "academicEducationHistoryTypeGetResult"
})
@XmlRootElement(name = "AcademicEducationHistoryTypeGetResponse")
public class AcademicEducationHistoryTypeGetResponse {

    @XmlElement(name = "AcademicEducationHistoryTypeGetResult")
    protected ArrayOfDAcademicEducationHistoryType academicEducationHistoryTypeGetResult;

    /**
     * Gets the value of the academicEducationHistoryTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducationHistoryType }
     *     
     */
    public ArrayOfDAcademicEducationHistoryType getAcademicEducationHistoryTypeGetResult() {
        return academicEducationHistoryTypeGetResult;
    }

    /**
     * Sets the value of the academicEducationHistoryTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducationHistoryType }
     *     
     */
    public void setAcademicEducationHistoryTypeGetResult(ArrayOfDAcademicEducationHistoryType value) {
        this.academicEducationHistoryTypeGetResult = value;
    }

}
