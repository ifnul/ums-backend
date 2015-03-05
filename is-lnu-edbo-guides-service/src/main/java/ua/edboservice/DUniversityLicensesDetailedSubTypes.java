
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicensesDetailedSubTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesDetailedSubTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicensesDetailedSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensesSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesSubTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicensesDetailedSubTypes", propOrder = {
    "idUniversityLicensesDetailedSubTypes",
    "idUniversityLicensesSubTypes",
    "idUniversityLicense",
    "universityLicensesSubTypesName"
})
public class DUniversityLicensesDetailedSubTypes {

    @XmlElement(name = "Id_UniversityLicensesDetailedSubTypes")
    protected int idUniversityLicensesDetailedSubTypes;
    @XmlElement(name = "Id_UniversityLicensesSubTypes")
    protected int idUniversityLicensesSubTypes;
    @XmlElement(name = "Id_UniversityLicense")
    protected int idUniversityLicense;
    @XmlElement(name = "UniversityLicensesSubTypesName")
    protected String universityLicensesSubTypesName;

    /**
     * Gets the value of the idUniversityLicensesDetailedSubTypes property.
     * 
     */
    public int getIdUniversityLicensesDetailedSubTypes() {
        return idUniversityLicensesDetailedSubTypes;
    }

    /**
     * Sets the value of the idUniversityLicensesDetailedSubTypes property.
     * 
     */
    public void setIdUniversityLicensesDetailedSubTypes(int value) {
        this.idUniversityLicensesDetailedSubTypes = value;
    }

    /**
     * Gets the value of the idUniversityLicensesSubTypes property.
     * 
     */
    public int getIdUniversityLicensesSubTypes() {
        return idUniversityLicensesSubTypes;
    }

    /**
     * Sets the value of the idUniversityLicensesSubTypes property.
     * 
     */
    public void setIdUniversityLicensesSubTypes(int value) {
        this.idUniversityLicensesSubTypes = value;
    }

    /**
     * Gets the value of the idUniversityLicense property.
     * 
     */
    public int getIdUniversityLicense() {
        return idUniversityLicense;
    }

    /**
     * Sets the value of the idUniversityLicense property.
     * 
     */
    public void setIdUniversityLicense(int value) {
        this.idUniversityLicense = value;
    }

    /**
     * Gets the value of the universityLicensesSubTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesSubTypesName() {
        return universityLicensesSubTypesName;
    }

    /**
     * Sets the value of the universityLicensesSubTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesSubTypesName(String value) {
        this.universityLicensesSubTypesName = value;
    }

}
