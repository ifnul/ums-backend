
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
 *         &lt;element name="UniversityLicenseCertificateDataGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicenseCertificateData" minOccurs="0"/>
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
    "universityLicenseCertificateDataGetResult"
})
@XmlRootElement(name = "UniversityLicenseCertificateDataGetResponse")
public class UniversityLicenseCertificateDataGetResponse {

    @XmlElement(name = "UniversityLicenseCertificateDataGetResult")
    protected ArrayOfDUniversityLicenseCertificateData universityLicenseCertificateDataGetResult;

    /**
     * Gets the value of the universityLicenseCertificateDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicenseCertificateData }
     *     
     */
    public ArrayOfDUniversityLicenseCertificateData getUniversityLicenseCertificateDataGetResult() {
        return universityLicenseCertificateDataGetResult;
    }

    /**
     * Sets the value of the universityLicenseCertificateDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicenseCertificateData }
     *     
     */
    public void setUniversityLicenseCertificateDataGetResult(ArrayOfDUniversityLicenseCertificateData value) {
        this.universityLicenseCertificateDataGetResult = value;
    }

}
