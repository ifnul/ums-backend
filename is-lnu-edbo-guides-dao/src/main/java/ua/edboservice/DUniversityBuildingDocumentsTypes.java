
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityBuildingDocumentsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBuildingDocumentsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityBuildingDocumentsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBuildingDocumentsTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityBuildingDocumentsTypes", propOrder = {
    "idUniversityBuildingDocumentsTypes",
    "universityBuildingDocumentsTypeName"
})
public class DUniversityBuildingDocumentsTypes {

    @XmlElement(name = "Id_UniversityBuildingDocumentsTypes")
    protected int idUniversityBuildingDocumentsTypes;
    @XmlElement(name = "UniversityBuildingDocumentsTypeName")
    protected String universityBuildingDocumentsTypeName;

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
     * Gets the value of the universityBuildingDocumentsTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingDocumentsTypeName() {
        return universityBuildingDocumentsTypeName;
    }

    /**
     * Sets the value of the universityBuildingDocumentsTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingDocumentsTypeName(String value) {
        this.universityBuildingDocumentsTypeName = value;
    }

}
