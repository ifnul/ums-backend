
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
 *         &lt;element name="UniversityLicensesFindResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesFind" minOccurs="0"/>
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
    "universityLicensesFindResult"
})
@XmlRootElement(name = "UniversityLicensesFindResponse")
public class UniversityLicensesFindResponse {

    @XmlElement(name = "UniversityLicensesFindResult")
    protected ArrayOfDUniversityLicensesFind universityLicensesFindResult;

    /**
     * Gets the value of the universityLicensesFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesFind }
     *     
     */
    public ArrayOfDUniversityLicensesFind getUniversityLicensesFindResult() {
        return universityLicensesFindResult;
    }

    /**
     * Sets the value of the universityLicensesFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesFind }
     *     
     */
    public void setUniversityLicensesFindResult(ArrayOfDUniversityLicensesFind value) {
        this.universityLicensesFindResult = value;
    }

}
