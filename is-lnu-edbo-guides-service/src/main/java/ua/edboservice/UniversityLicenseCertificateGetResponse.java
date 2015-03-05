
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
 *         &lt;element name="UniversityLicenseCertificateGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicenseCertificate" minOccurs="0"/>
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
    "universityLicenseCertificateGetResult"
})
@XmlRootElement(name = "UniversityLicenseCertificateGetResponse")
public class UniversityLicenseCertificateGetResponse {

    @XmlElement(name = "UniversityLicenseCertificateGetResult")
    protected ArrayOfDUniversityLicenseCertificate universityLicenseCertificateGetResult;

    /**
     * Gets the value of the universityLicenseCertificateGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicenseCertificate }
     *     
     */
    public ArrayOfDUniversityLicenseCertificate getUniversityLicenseCertificateGetResult() {
        return universityLicenseCertificateGetResult;
    }

    /**
     * Sets the value of the universityLicenseCertificateGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicenseCertificate }
     *     
     */
    public void setUniversityLicenseCertificateGetResult(ArrayOfDUniversityLicenseCertificate value) {
        this.universityLicenseCertificateGetResult = value;
    }

}
