
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
 *         &lt;element name="AcademicAttestationCaseTypeGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicAttestationCaseType" minOccurs="0"/>
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
    "academicAttestationCaseTypeGetResult"
})
@XmlRootElement(name = "AcademicAttestationCaseTypeGetResponse")
public class AcademicAttestationCaseTypeGetResponse {

    @XmlElement(name = "AcademicAttestationCaseTypeGetResult")
    protected ArrayOfDAcademicAttestationCaseType academicAttestationCaseTypeGetResult;

    /**
     * Gets the value of the academicAttestationCaseTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicAttestationCaseType }
     *     
     */
    public ArrayOfDAcademicAttestationCaseType getAcademicAttestationCaseTypeGetResult() {
        return academicAttestationCaseTypeGetResult;
    }

    /**
     * Sets the value of the academicAttestationCaseTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicAttestationCaseType }
     *     
     */
    public void setAcademicAttestationCaseTypeGetResult(ArrayOfDAcademicAttestationCaseType value) {
        this.academicAttestationCaseTypeGetResult = value;
    }

}
