
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityRoleTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityRoleTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityRoleType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityRoleTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityRoleTypes", propOrder = {
    "idUniversityRoleType",
    "universityRoleTypeName"
})
public class DUniversityRoleTypes {

    @XmlElement(name = "Id_UniversityRoleType")
    protected int idUniversityRoleType;
    @XmlElement(name = "UniversityRoleTypeName")
    protected String universityRoleTypeName;

    /**
     * Gets the value of the idUniversityRoleType property.
     * 
     */
    public int getIdUniversityRoleType() {
        return idUniversityRoleType;
    }

    /**
     * Sets the value of the idUniversityRoleType property.
     * 
     */
    public void setIdUniversityRoleType(int value) {
        this.idUniversityRoleType = value;
    }

    /**
     * Gets the value of the universityRoleTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityRoleTypeName() {
        return universityRoleTypeName;
    }

    /**
     * Sets the value of the universityRoleTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityRoleTypeName(String value) {
        this.universityRoleTypeName = value;
    }

}
