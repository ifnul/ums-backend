
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
 *         &lt;element name="UniversityLicensesOrganisationsRishenGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesOrganisationsRishen" minOccurs="0"/>
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
    "universityLicensesOrganisationsRishenGetResult"
})
@XmlRootElement(name = "UniversityLicensesOrganisationsRishenGetResponse")
public class UniversityLicensesOrganisationsRishenGetResponse {

    @XmlElement(name = "UniversityLicensesOrganisationsRishenGetResult")
    protected ArrayOfDUniversityLicensesOrganisationsRishen universityLicensesOrganisationsRishenGetResult;

    /**
     * Gets the value of the universityLicensesOrganisationsRishenGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesOrganisationsRishen }
     *     
     */
    public ArrayOfDUniversityLicensesOrganisationsRishen getUniversityLicensesOrganisationsRishenGetResult() {
        return universityLicensesOrganisationsRishenGetResult;
    }

    /**
     * Sets the value of the universityLicensesOrganisationsRishenGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesOrganisationsRishen }
     *     
     */
    public void setUniversityLicensesOrganisationsRishenGetResult(ArrayOfDUniversityLicensesOrganisationsRishen value) {
        this.universityLicensesOrganisationsRishenGetResult = value;
    }

}
