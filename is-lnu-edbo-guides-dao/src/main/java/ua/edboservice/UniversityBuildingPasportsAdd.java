
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityBuilding" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuildingTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuildingOwnerForms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBuildingOtherTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionGUID",
    "idUniversityBuilding",
    "idUniversityBuildingTypes",
    "idUniversityBuildingOwnerForms",
    "count",
    "area",
    "universityBuildingOtherTypeName"
})
@XmlRootElement(name = "UniversityBuildingPasportsAdd")
public class UniversityBuildingPasportsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityBuilding")
    protected int idUniversityBuilding;
    @XmlElement(name = "Id_UniversityBuildingTypes")
    protected int idUniversityBuildingTypes;
    @XmlElement(name = "Id_UniversityBuildingOwnerForms")
    protected int idUniversityBuildingOwnerForms;
    @XmlElement(name = "Count")
    protected String count;
    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "UniversityBuildingOtherTypeName")
    protected String universityBuildingOtherTypeName;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idUniversityBuilding property.
     * 
     */
    public int getIdUniversityBuilding() {
        return idUniversityBuilding;
    }

    /**
     * Sets the value of the idUniversityBuilding property.
     * 
     */
    public void setIdUniversityBuilding(int value) {
        this.idUniversityBuilding = value;
    }

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
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the universityBuildingOtherTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingOtherTypeName() {
        return universityBuildingOtherTypeName;
    }

    /**
     * Sets the value of the universityBuildingOtherTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingOtherTypeName(String value) {
        this.universityBuildingOtherTypeName = value;
    }

}
