
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicensesTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicensesTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicensesTypes", propOrder = {
    "idUniversityLicensesTypes",
    "universityLicensesTypesName"
})
public class DUniversityLicensesTypes {

    @XmlElement(name = "Id_UniversityLicensesTypes")
    protected int idUniversityLicensesTypes;
    @XmlElement(name = "UniversityLicensesTypesName")
    protected String universityLicensesTypesName;

    /**
     * Gets the value of the idUniversityLicensesTypes property.
     * 
     */
    public int getIdUniversityLicensesTypes() {
        return idUniversityLicensesTypes;
    }

    /**
     * Sets the value of the idUniversityLicensesTypes property.
     * 
     */
    public void setIdUniversityLicensesTypes(int value) {
        this.idUniversityLicensesTypes = value;
    }

    /**
     * Gets the value of the universityLicensesTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesTypesName() {
        return universityLicensesTypesName;
    }

    /**
     * Sets the value of the universityLicensesTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesTypesName(String value) {
        this.universityLicensesTypesName = value;
    }

}
