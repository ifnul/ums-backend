
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicensesPtnzSvidDetailedSubTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesPtnzSvidDetailedSubTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicensesPtnzSvidDetailedSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensesSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensePtnzSvid" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "dUniversityLicensesPtnzSvidDetailedSubTypes", propOrder = {
    "idUniversityLicensesPtnzSvidDetailedSubTypes",
    "idUniversityLicensesSubTypes",
    "idUniversityLicensePtnzSvid",
    "universityLicensesSubTypesName"
})
public class DUniversityLicensesPtnzSvidDetailedSubTypes {

    @XmlElement(name = "Id_UniversityLicensesPtnzSvidDetailedSubTypes")
    protected int idUniversityLicensesPtnzSvidDetailedSubTypes;
    @XmlElement(name = "Id_UniversityLicensesSubTypes")
    protected int idUniversityLicensesSubTypes;
    @XmlElement(name = "Id_UniversityLicensePtnzSvid")
    protected int idUniversityLicensePtnzSvid;
    @XmlElement(name = "UniversityLicensesSubTypesName")
    protected String universityLicensesSubTypesName;

    /**
     * Gets the value of the idUniversityLicensesPtnzSvidDetailedSubTypes property.
     * 
     */
    public int getIdUniversityLicensesPtnzSvidDetailedSubTypes() {
        return idUniversityLicensesPtnzSvidDetailedSubTypes;
    }

    /**
     * Sets the value of the idUniversityLicensesPtnzSvidDetailedSubTypes property.
     * 
     */
    public void setIdUniversityLicensesPtnzSvidDetailedSubTypes(int value) {
        this.idUniversityLicensesPtnzSvidDetailedSubTypes = value;
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
     * Gets the value of the idUniversityLicensePtnzSvid property.
     * 
     */
    public int getIdUniversityLicensePtnzSvid() {
        return idUniversityLicensePtnzSvid;
    }

    /**
     * Sets the value of the idUniversityLicensePtnzSvid property.
     * 
     */
    public void setIdUniversityLicensePtnzSvid(int value) {
        this.idUniversityLicensePtnzSvid = value;
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
