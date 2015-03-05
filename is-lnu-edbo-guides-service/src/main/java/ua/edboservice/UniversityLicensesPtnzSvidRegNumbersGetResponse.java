
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
 *         &lt;element name="UniversityLicensesPtnzSvidRegNumbersGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesPtnzSvidRegNumbers" minOccurs="0"/>
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
    "universityLicensesPtnzSvidRegNumbersGetResult"
})
@XmlRootElement(name = "UniversityLicensesPtnzSvidRegNumbersGetResponse")
public class UniversityLicensesPtnzSvidRegNumbersGetResponse {

    @XmlElement(name = "UniversityLicensesPtnzSvidRegNumbersGetResult")
    protected ArrayOfDUniversityLicensesPtnzSvidRegNumbers universityLicensesPtnzSvidRegNumbersGetResult;

    /**
     * Gets the value of the universityLicensesPtnzSvidRegNumbersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesPtnzSvidRegNumbers }
     *     
     */
    public ArrayOfDUniversityLicensesPtnzSvidRegNumbers getUniversityLicensesPtnzSvidRegNumbersGetResult() {
        return universityLicensesPtnzSvidRegNumbersGetResult;
    }

    /**
     * Sets the value of the universityLicensesPtnzSvidRegNumbersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesPtnzSvidRegNumbers }
     *     
     */
    public void setUniversityLicensesPtnzSvidRegNumbersGetResult(ArrayOfDUniversityLicensesPtnzSvidRegNumbers value) {
        this.universityLicensesPtnzSvidRegNumbersGetResult = value;
    }

}
