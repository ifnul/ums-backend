
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicenseCertificateProlongationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicenseCertificateProlongationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicenseCertificateProlongationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicenseCertificateProlongationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicenseCertificateProlongationType", propOrder = {
    "idUniversityLicenseCertificateProlongationType",
    "universityLicenseCertificateProlongationTypeName"
})
public class DUniversityLicenseCertificateProlongationType {

    @XmlElement(name = "Id_UniversityLicenseCertificateProlongationType")
    protected int idUniversityLicenseCertificateProlongationType;
    @XmlElement(name = "UniversityLicenseCertificateProlongationTypeName")
    protected String universityLicenseCertificateProlongationTypeName;

    /**
     * Gets the value of the idUniversityLicenseCertificateProlongationType property.
     * 
     */
    public int getIdUniversityLicenseCertificateProlongationType() {
        return idUniversityLicenseCertificateProlongationType;
    }

    /**
     * Sets the value of the idUniversityLicenseCertificateProlongationType property.
     * 
     */
    public void setIdUniversityLicenseCertificateProlongationType(int value) {
        this.idUniversityLicenseCertificateProlongationType = value;
    }

    /**
     * Gets the value of the universityLicenseCertificateProlongationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseCertificateProlongationTypeName() {
        return universityLicenseCertificateProlongationTypeName;
    }

    /**
     * Sets the value of the universityLicenseCertificateProlongationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseCertificateProlongationTypeName(String value) {
        this.universityLicenseCertificateProlongationTypeName = value;
    }

}
