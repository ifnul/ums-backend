
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
 *         &lt;element name="UniversityLicenseCertificateDataAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityLicenseCertificateDataAddResult"
})
@XmlRootElement(name = "UniversityLicenseCertificateDataAddResponse")
public class UniversityLicenseCertificateDataAddResponse {

    @XmlElement(name = "UniversityLicenseCertificateDataAddResult")
    protected int universityLicenseCertificateDataAddResult;

    /**
     * Gets the value of the universityLicenseCertificateDataAddResult property.
     * 
     */
    public int getUniversityLicenseCertificateDataAddResult() {
        return universityLicenseCertificateDataAddResult;
    }

    /**
     * Sets the value of the universityLicenseCertificateDataAddResult property.
     * 
     */
    public void setUniversityLicenseCertificateDataAddResult(int value) {
        this.universityLicenseCertificateDataAddResult = value;
    }

}
