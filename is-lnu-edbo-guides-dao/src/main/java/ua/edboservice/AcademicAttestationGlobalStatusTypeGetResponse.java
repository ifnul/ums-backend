
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
 *         &lt;element name="AcademicAttestationGlobalStatusTypeGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicAttestationGlobalStatusType" minOccurs="0"/>
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
    "academicAttestationGlobalStatusTypeGetResult"
})
@XmlRootElement(name = "AcademicAttestationGlobalStatusTypeGetResponse")
public class AcademicAttestationGlobalStatusTypeGetResponse {

    @XmlElement(name = "AcademicAttestationGlobalStatusTypeGetResult")
    protected ArrayOfDAcademicAttestationGlobalStatusType academicAttestationGlobalStatusTypeGetResult;

    /**
     * Gets the value of the academicAttestationGlobalStatusTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicAttestationGlobalStatusType }
     *     
     */
    public ArrayOfDAcademicAttestationGlobalStatusType getAcademicAttestationGlobalStatusTypeGetResult() {
        return academicAttestationGlobalStatusTypeGetResult;
    }

    /**
     * Sets the value of the academicAttestationGlobalStatusTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicAttestationGlobalStatusType }
     *     
     */
    public void setAcademicAttestationGlobalStatusTypeGetResult(ArrayOfDAcademicAttestationGlobalStatusType value) {
        this.academicAttestationGlobalStatusTypeGetResult = value;
    }

}
