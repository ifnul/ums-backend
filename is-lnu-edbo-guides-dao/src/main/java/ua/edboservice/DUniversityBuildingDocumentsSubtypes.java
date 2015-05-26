
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityBuildingDocumentsSubtypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBuildingDocumentsSubtypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityBuildingDocumentsSubtypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuildingDocumentsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBuildingDocumentsSubtypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityBuildingDocumentsSubtypes", propOrder = {
    "idUniversityBuildingDocumentsSubtypes",
    "idUniversityBuildingDocumentsTypes",
    "universityBuildingDocumentsSubtypesName"
})
public class DUniversityBuildingDocumentsSubtypes {

    @XmlElement(name = "Id_UniversityBuildingDocumentsSubtypes")
    protected int idUniversityBuildingDocumentsSubtypes;
    @XmlElement(name = "Id_UniversityBuildingDocumentsTypes")
    protected int idUniversityBuildingDocumentsTypes;
    @XmlElement(name = "UniversityBuildingDocumentsSubtypesName")
    protected String universityBuildingDocumentsSubtypesName;

    /**
     * Gets the value of the idUniversityBuildingDocumentsSubtypes property.
     * 
     */
    public int getIdUniversityBuildingDocumentsSubtypes() {
        return idUniversityBuildingDocumentsSubtypes;
    }

    /**
     * Sets the value of the idUniversityBuildingDocumentsSubtypes property.
     * 
     */
    public void setIdUniversityBuildingDocumentsSubtypes(int value) {
        this.idUniversityBuildingDocumentsSubtypes = value;
    }

    /**
     * Gets the value of the idUniversityBuildingDocumentsTypes property.
     * 
     */
    public int getIdUniversityBuildingDocumentsTypes() {
        return idUniversityBuildingDocumentsTypes;
    }

    /**
     * Sets the value of the idUniversityBuildingDocumentsTypes property.
     * 
     */
    public void setIdUniversityBuildingDocumentsTypes(int value) {
        this.idUniversityBuildingDocumentsTypes = value;
    }

    /**
     * Gets the value of the universityBuildingDocumentsSubtypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingDocumentsSubtypesName() {
        return universityBuildingDocumentsSubtypesName;
    }

    /**
     * Sets the value of the universityBuildingDocumentsSubtypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingDocumentsSubtypesName(String value) {
        this.universityBuildingDocumentsSubtypesName = value;
    }

}
