
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
 *         &lt;element name="UniversityLicensesPtnzSvidGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesPtnzSvid" minOccurs="0"/>
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
    "universityLicensesPtnzSvidGetResult"
})
@XmlRootElement(name = "UniversityLicensesPtnzSvidGetResponse")
public class UniversityLicensesPtnzSvidGetResponse {

    @XmlElement(name = "UniversityLicensesPtnzSvidGetResult")
    protected ArrayOfDUniversityLicensesPtnzSvid universityLicensesPtnzSvidGetResult;

    /**
     * Gets the value of the universityLicensesPtnzSvidGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesPtnzSvid }
     *     
     */
    public ArrayOfDUniversityLicensesPtnzSvid getUniversityLicensesPtnzSvidGetResult() {
        return universityLicensesPtnzSvidGetResult;
    }

    /**
     * Sets the value of the universityLicensesPtnzSvidGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesPtnzSvid }
     *     
     */
    public void setUniversityLicensesPtnzSvidGetResult(ArrayOfDUniversityLicensesPtnzSvid value) {
        this.universityLicensesPtnzSvidGetResult = value;
    }

}
