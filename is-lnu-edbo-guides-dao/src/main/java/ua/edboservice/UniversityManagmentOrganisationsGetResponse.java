
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
 *         &lt;element name="UniversityManagmentOrganisationsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityManagmentOrganisations" minOccurs="0"/>
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
    "universityManagmentOrganisationsGetResult"
})
@XmlRootElement(name = "UniversityManagmentOrganisationsGetResponse")
public class UniversityManagmentOrganisationsGetResponse {

    @XmlElement(name = "UniversityManagmentOrganisationsGetResult")
    protected ArrayOfDUniversityManagmentOrganisations universityManagmentOrganisationsGetResult;

    /**
     * Gets the value of the universityManagmentOrganisationsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityManagmentOrganisations }
     *     
     */
    public ArrayOfDUniversityManagmentOrganisations getUniversityManagmentOrganisationsGetResult() {
        return universityManagmentOrganisationsGetResult;
    }

    /**
     * Sets the value of the universityManagmentOrganisationsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityManagmentOrganisations }
     *     
     */
    public void setUniversityManagmentOrganisationsGetResult(ArrayOfDUniversityManagmentOrganisations value) {
        this.universityManagmentOrganisationsGetResult = value;
    }

}
