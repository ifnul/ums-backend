
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
 *         &lt;element name="AcademicEducationHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducationHistory" minOccurs="0"/>
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
    "academicEducationHistoryGetResult"
})
@XmlRootElement(name = "AcademicEducationHistoryGetResponse")
public class AcademicEducationHistoryGetResponse {

    @XmlElement(name = "AcademicEducationHistoryGetResult")
    protected ArrayOfDAcademicEducationHistory academicEducationHistoryGetResult;

    /**
     * Gets the value of the academicEducationHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducationHistory }
     *     
     */
    public ArrayOfDAcademicEducationHistory getAcademicEducationHistoryGetResult() {
        return academicEducationHistoryGetResult;
    }

    /**
     * Sets the value of the academicEducationHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducationHistory }
     *     
     */
    public void setAcademicEducationHistoryGetResult(ArrayOfDAcademicEducationHistory value) {
        this.academicEducationHistoryGetResult = value;
    }

}
