
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityBuildingTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBuildingTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityBuildingTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBuildingTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityBuildingTypes", propOrder = {
    "idUniversityBuildingTypes",
    "universityBuildingTypesName"
})
public class DUniversityBuildingTypes {

    @XmlElement(name = "Id_UniversityBuildingTypes")
    protected int idUniversityBuildingTypes;
    @XmlElement(name = "UniversityBuildingTypesName")
    protected String universityBuildingTypesName;

    /**
     * Gets the value of the idUniversityBuildingTypes property.
     * 
     */
    public int getIdUniversityBuildingTypes() {
        return idUniversityBuildingTypes;
    }

    /**
     * Sets the value of the idUniversityBuildingTypes property.
     * 
     */
    public void setIdUniversityBuildingTypes(int value) {
        this.idUniversityBuildingTypes = value;
    }

    /**
     * Gets the value of the universityBuildingTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingTypesName() {
        return universityBuildingTypesName;
    }

    /**
     * Sets the value of the universityBuildingTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingTypesName(String value) {
        this.universityBuildingTypesName = value;
    }

}
