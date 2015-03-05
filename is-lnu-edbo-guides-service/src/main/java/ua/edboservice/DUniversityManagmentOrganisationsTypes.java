
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityManagmentOrganisationsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityManagmentOrganisationsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityManagmentOrganisationsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityManagmentOrganisationsTypesTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityManagmentOrganisationsTypes", propOrder = {
    "idUniversityManagmentOrganisationsTypes",
    "universityManagmentOrganisationsTypesTypes"
})
public class DUniversityManagmentOrganisationsTypes {

    @XmlElement(name = "Id_UniversityManagmentOrganisationsTypes")
    protected int idUniversityManagmentOrganisationsTypes;
    @XmlElement(name = "UniversityManagmentOrganisationsTypesTypes")
    protected String universityManagmentOrganisationsTypesTypes;

    /**
     * Gets the value of the idUniversityManagmentOrganisationsTypes property.
     * 
     */
    public int getIdUniversityManagmentOrganisationsTypes() {
        return idUniversityManagmentOrganisationsTypes;
    }

    /**
     * Sets the value of the idUniversityManagmentOrganisationsTypes property.
     * 
     */
    public void setIdUniversityManagmentOrganisationsTypes(int value) {
        this.idUniversityManagmentOrganisationsTypes = value;
    }

    /**
     * Gets the value of the universityManagmentOrganisationsTypesTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityManagmentOrganisationsTypesTypes() {
        return universityManagmentOrganisationsTypesTypes;
    }

    /**
     * Sets the value of the universityManagmentOrganisationsTypesTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityManagmentOrganisationsTypesTypes(String value) {
        this.universityManagmentOrganisationsTypesTypes = value;
    }

}
