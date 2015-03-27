
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
 *         &lt;element name="UniversityBossOrderOrganisationGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityBossOrderOrganisation" minOccurs="0"/>
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
    "universityBossOrderOrganisationGetResult"
})
@XmlRootElement(name = "UniversityBossOrderOrganisationGetResponse")
public class UniversityBossOrderOrganisationGetResponse {

    @XmlElement(name = "UniversityBossOrderOrganisationGetResult")
    protected ArrayOfDUniversityBossOrderOrganisation universityBossOrderOrganisationGetResult;

    /**
     * Gets the value of the universityBossOrderOrganisationGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityBossOrderOrganisation }
     *     
     */
    public ArrayOfDUniversityBossOrderOrganisation getUniversityBossOrderOrganisationGetResult() {
        return universityBossOrderOrganisationGetResult;
    }

    /**
     * Sets the value of the universityBossOrderOrganisationGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityBossOrderOrganisation }
     *     
     */
    public void setUniversityBossOrderOrganisationGetResult(ArrayOfDUniversityBossOrderOrganisation value) {
        this.universityBossOrderOrganisationGetResult = value;
    }

}
