
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
 *         &lt;element name="AcademicAttestationCaseGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicAttestationCase" minOccurs="0"/>
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
    "academicAttestationCaseGetResult"
})
@XmlRootElement(name = "AcademicAttestationCaseGetResponse")
public class AcademicAttestationCaseGetResponse {

    @XmlElement(name = "AcademicAttestationCaseGetResult")
    protected ArrayOfDAcademicAttestationCase academicAttestationCaseGetResult;

    /**
     * Gets the value of the academicAttestationCaseGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicAttestationCase }
     *     
     */
    public ArrayOfDAcademicAttestationCase getAcademicAttestationCaseGetResult() {
        return academicAttestationCaseGetResult;
    }

    /**
     * Sets the value of the academicAttestationCaseGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicAttestationCase }
     *     
     */
    public void setAcademicAttestationCaseGetResult(ArrayOfDAcademicAttestationCase value) {
        this.academicAttestationCaseGetResult = value;
    }

}
