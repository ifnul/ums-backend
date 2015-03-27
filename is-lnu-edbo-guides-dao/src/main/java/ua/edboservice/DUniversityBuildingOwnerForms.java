
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityBuildingOwnerForms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBuildingOwnerForms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityBuildingOwnerForms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBuildingOwnerFormsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityBuildingOwnerForms", propOrder = {
    "idUniversityBuildingOwnerForms",
    "universityBuildingOwnerFormsName"
})
public class DUniversityBuildingOwnerForms {

    @XmlElement(name = "Id_UniversityBuildingOwnerForms")
    protected int idUniversityBuildingOwnerForms;
    @XmlElement(name = "UniversityBuildingOwnerFormsName")
    protected String universityBuildingOwnerFormsName;

    /**
     * Gets the value of the idUniversityBuildingOwnerForms property.
     * 
     */
    public int getIdUniversityBuildingOwnerForms() {
        return idUniversityBuildingOwnerForms;
    }

    /**
     * Sets the value of the idUniversityBuildingOwnerForms property.
     * 
     */
    public void setIdUniversityBuildingOwnerForms(int value) {
        this.idUniversityBuildingOwnerForms = value;
    }

    /**
     * Gets the value of the universityBuildingOwnerFormsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingOwnerFormsName() {
        return universityBuildingOwnerFormsName;
    }

    /**
     * Sets the value of the universityBuildingOwnerFormsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingOwnerFormsName(String value) {
        this.universityBuildingOwnerFormsName = value;
    }

}
