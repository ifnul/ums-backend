
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
 *         &lt;element name="UniversityLicensesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicenses" minOccurs="0"/>
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
    "universityLicensesGetResult"
})
@XmlRootElement(name = "UniversityLicensesGetResponse")
public class UniversityLicensesGetResponse {

    @XmlElement(name = "UniversityLicensesGetResult")
    protected ArrayOfDUniversityLicenses universityLicensesGetResult;

    /**
     * Gets the value of the universityLicensesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicenses }
     *     
     */
    public ArrayOfDUniversityLicenses getUniversityLicensesGetResult() {
        return universityLicensesGetResult;
    }

    /**
     * Sets the value of the universityLicensesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicenses }
     *     
     */
    public void setUniversityLicensesGetResult(ArrayOfDUniversityLicenses value) {
        this.universityLicensesGetResult = value;
    }

}
