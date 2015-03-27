
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
 *         &lt;element name="UniversityLicensesOrganisationsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesOrganisations" minOccurs="0"/>
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
    "universityLicensesOrganisationsGetResult"
})
@XmlRootElement(name = "UniversityLicensesOrganisationsGetResponse")
public class UniversityLicensesOrganisationsGetResponse {

    @XmlElement(name = "UniversityLicensesOrganisationsGetResult")
    protected ArrayOfDUniversityLicensesOrganisations universityLicensesOrganisationsGetResult;

    /**
     * Gets the value of the universityLicensesOrganisationsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesOrganisations }
     *     
     */
    public ArrayOfDUniversityLicensesOrganisations getUniversityLicensesOrganisationsGetResult() {
        return universityLicensesOrganisationsGetResult;
    }

    /**
     * Sets the value of the universityLicensesOrganisationsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesOrganisations }
     *     
     */
    public void setUniversityLicensesOrganisationsGetResult(ArrayOfDUniversityLicensesOrganisations value) {
        this.universityLicensesOrganisationsGetResult = value;
    }

}
