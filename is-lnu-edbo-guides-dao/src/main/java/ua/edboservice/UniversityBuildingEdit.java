
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
 *         &lt;element name="UniversityBuildingFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBuildingSmallName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Korpus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityTypeOfFinfnsing" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuildingOwnerForms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsRent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "universityBuildingFullName",
    "universityBuildingSmallName",
    "ownerFullName",
    "edrpo",
    "idCountry",
    "koatuuCode",
    "idStreetType",
    "streetName",
    "building",
    "korpus",
    "flat",
    "idUniversityTypeOfFinfnsing",
    "idUniversityBuildingOwnerForms",
    "isRent",
    "area",
    "fullAddress",
    "postIndex"
})
@XmlRootElement(name = "UniversityBuildingEdit")
public class UniversityBuildingEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityBuilding")
    protected int idUniversityBuilding;
    @XmlElement(name = "UniversityBuildingFullName")
    protected String universityBuildingFullName;
    @XmlElement(name = "UniversityBuildingSmallName")
    protected String universityBuildingSmallName;
    @XmlElement(name = "OwnerFullName")
    protected String ownerFullName;
    @XmlElement(name = "EDRPO")
    protected String edrpo;
    @XmlElement(name = "Id_Country")
    protected int idCountry;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "Id_StreetType")
    protected int idStreetType;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Korpus")
    protected String korpus;
    @XmlElement(name = "Flat")
    protected String flat;
    @XmlElement(name = "Id_UniversityTypeOfFinfnsing")
    protected int idUniversityTypeOfFinfnsing;
    @XmlElement(name = "Id_UniversityBuildingOwnerForms")
    protected int idUniversityBuildingOwnerForms;
    @XmlElement(name = "IsRent")
    protected int isRent;
    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "FullAddress")
    protected String fullAddress;
    @XmlElement(name = "PostIndex")
    protected String postIndex;

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
     * Gets the value of the universityBuildingFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingFullName() {
        return universityBuildingFullName;
    }

    /**
     * Sets the value of the universityBuildingFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingFullName(String value) {
        this.universityBuildingFullName = value;
    }

    /**
     * Gets the value of the universityBuildingSmallName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingSmallName() {
        return universityBuildingSmallName;
    }

    /**
     * Sets the value of the universityBuildingSmallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingSmallName(String value) {
        this.universityBuildingSmallName = value;
    }

    /**
     * Gets the value of the ownerFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets the value of the ownerFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerFullName(String value) {
        this.ownerFullName = value;
    }

    /**
     * Gets the value of the edrpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDRPO() {
        return edrpo;
    }

    /**
     * Sets the value of the edrpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDRPO(String value) {
        this.edrpo = value;
    }

    /**
     * Gets the value of the idCountry property.
     * 
     */
    public int getIdCountry() {
        return idCountry;
    }

    /**
     * Sets the value of the idCountry property.
     * 
     */
    public void setIdCountry(int value) {
        this.idCountry = value;
    }

    /**
     * Gets the value of the koatuuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCode() {
        return koatuuCode;
    }

    /**
     * Sets the value of the koatuuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCode(String value) {
        this.koatuuCode = value;
    }

    /**
     * Gets the value of the idStreetType property.
     * 
     */
    public int getIdStreetType() {
        return idStreetType;
    }

    /**
     * Sets the value of the idStreetType property.
     * 
     */
    public void setIdStreetType(int value) {
        this.idStreetType = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the korpus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKorpus() {
        return korpus;
    }

    /**
     * Sets the value of the korpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKorpus(String value) {
        this.korpus = value;
    }

    /**
     * Gets the value of the flat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlat() {
        return flat;
    }

    /**
     * Sets the value of the flat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlat(String value) {
        this.flat = value;
    }

    /**
     * Gets the value of the idUniversityTypeOfFinfnsing property.
     * 
     */
    public int getIdUniversityTypeOfFinfnsing() {
        return idUniversityTypeOfFinfnsing;
    }

    /**
     * Sets the value of the idUniversityTypeOfFinfnsing property.
     * 
     */
    public void setIdUniversityTypeOfFinfnsing(int value) {
        this.idUniversityTypeOfFinfnsing = value;
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
     * Gets the value of the isRent property.
     * 
     */
    public int getIsRent() {
        return isRent;
    }

    /**
     * Sets the value of the isRent property.
     * 
     */
    public void setIsRent(int value) {
        this.isRent = value;
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
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the postIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostIndex() {
        return postIndex;
    }

    /**
     * Sets the value of the postIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostIndex(String value) {
        this.postIndex = value;
    }

}
