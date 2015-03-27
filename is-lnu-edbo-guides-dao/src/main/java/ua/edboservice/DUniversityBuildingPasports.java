
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityBuildingPasports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBuildingPasports">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityBuildingPasport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuilding" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuildingTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBuildingTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityBuildingOwnerForms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBuildingOwnerFormsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCrate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "dUniversityBuildingPasports", propOrder = {
    "idUniversityBuildingPasport",
    "idUniversityBuilding",
    "idUniversityBuildingTypes",
    "universityBuildingTypesName",
    "idUniversityBuildingOwnerForms",
    "universityBuildingOwnerFormsName",
    "count",
    "area",
    "idUserAdd",
    "idUserEdit",
    "dateCrate",
    "dateLastChange",
    "universityBuildingOtherTypeName"
})
public class DUniversityBuildingPasports {

    @XmlElement(name = "Id_UniversityBuildingPasport")
    protected int idUniversityBuildingPasport;
    @XmlElement(name = "Id_UniversityBuilding")
    protected int idUniversityBuilding;
    @XmlElement(name = "Id_UniversityBuildingTypes")
    protected int idUniversityBuildingTypes;
    @XmlElement(name = "UniversityBuildingTypesName")
    protected String universityBuildingTypesName;
    @XmlElement(name = "Id_UniversityBuildingOwnerForms")
    protected int idUniversityBuildingOwnerForms;
    @XmlElement(name = "UniversityBuildingOwnerFormsName")
    protected String universityBuildingOwnerFormsName;
    @XmlElement(name = "Count", required = true)
    protected BigDecimal count;
    @XmlElement(name = "Area", required = true)
    protected BigDecimal area;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "Id_UserEdit")
    protected int idUserEdit;
    @XmlElement(name = "DateCrate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCrate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "UniversityBuildingOtherTypeName")
    protected String universityBuildingOtherTypeName;

    /**
     * Gets the value of the idUniversityBuildingPasport property.
     * 
     */
    public int getIdUniversityBuildingPasport() {
        return idUniversityBuildingPasport;
    }

    /**
     * Sets the value of the idUniversityBuildingPasport property.
     * 
     */
    public void setIdUniversityBuildingPasport(int value) {
        this.idUniversityBuildingPasport = value;
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

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCount(BigDecimal value) {
        this.count = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArea(BigDecimal value) {
        this.area = value;
    }

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
    }

    /**
     * Gets the value of the idUserEdit property.
     * 
     */
    public int getIdUserEdit() {
        return idUserEdit;
    }

    /**
     * Sets the value of the idUserEdit property.
     * 
     */
    public void setIdUserEdit(int value) {
        this.idUserEdit = value;
    }

    /**
     * Gets the value of the dateCrate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCrate() {
        return dateCrate;
    }

    /**
     * Sets the value of the dateCrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCrate(XMLGregorianCalendar value) {
        this.dateCrate = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
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
