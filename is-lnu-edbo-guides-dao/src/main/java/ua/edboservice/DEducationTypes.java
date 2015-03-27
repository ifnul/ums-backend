
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dEducationTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationClass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationTypeName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationOrganizationFullTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationOrganizationShortTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EducationClassName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationOrganizationClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEducationTypes", propOrder = {
    "idEducationType",
    "idEducationClass",
    "idEducationTypeName",
    "educationOrganizationFullTypeName",
    "educationOrganizationShortTypeName",
    "idEducationClassName",
    "educationOrganizationClassName",
    "idLanguage",
    "idUniversityType"
})
public class DEducationTypes {

    @XmlElement(name = "Id_EducationType")
    protected int idEducationType;
    @XmlElement(name = "Id_EducationClass")
    protected int idEducationClass;
    @XmlElement(name = "Id_EducationTypeName")
    protected int idEducationTypeName;
    @XmlElement(name = "EducationOrganizationFullTypeName")
    protected String educationOrganizationFullTypeName;
    @XmlElement(name = "EducationOrganizationShortTypeName")
    protected String educationOrganizationShortTypeName;
    @XmlElement(name = "Id_EducationClassName")
    protected int idEducationClassName;
    @XmlElement(name = "EducationOrganizationClassName")
    protected String educationOrganizationClassName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_UniversityType")
    protected int idUniversityType;

    /**
     * Gets the value of the idEducationType property.
     * 
     */
    public int getIdEducationType() {
        return idEducationType;
    }

    /**
     * Sets the value of the idEducationType property.
     * 
     */
    public void setIdEducationType(int value) {
        this.idEducationType = value;
    }

    /**
     * Gets the value of the idEducationClass property.
     * 
     */
    public int getIdEducationClass() {
        return idEducationClass;
    }

    /**
     * Sets the value of the idEducationClass property.
     * 
     */
    public void setIdEducationClass(int value) {
        this.idEducationClass = value;
    }

    /**
     * Gets the value of the idEducationTypeName property.
     * 
     */
    public int getIdEducationTypeName() {
        return idEducationTypeName;
    }

    /**
     * Sets the value of the idEducationTypeName property.
     * 
     */
    public void setIdEducationTypeName(int value) {
        this.idEducationTypeName = value;
    }

    /**
     * Gets the value of the educationOrganizationFullTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationFullTypeName() {
        return educationOrganizationFullTypeName;
    }

    /**
     * Sets the value of the educationOrganizationFullTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationFullTypeName(String value) {
        this.educationOrganizationFullTypeName = value;
    }

    /**
     * Gets the value of the educationOrganizationShortTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationShortTypeName() {
        return educationOrganizationShortTypeName;
    }

    /**
     * Sets the value of the educationOrganizationShortTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationShortTypeName(String value) {
        this.educationOrganizationShortTypeName = value;
    }

    /**
     * Gets the value of the idEducationClassName property.
     * 
     */
    public int getIdEducationClassName() {
        return idEducationClassName;
    }

    /**
     * Sets the value of the idEducationClassName property.
     * 
     */
    public void setIdEducationClassName(int value) {
        this.idEducationClassName = value;
    }

    /**
     * Gets the value of the educationOrganizationClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationClassName() {
        return educationOrganizationClassName;
    }

    /**
     * Sets the value of the educationOrganizationClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationClassName(String value) {
        this.educationOrganizationClassName = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the idUniversityType property.
     * 
     */
    public int getIdUniversityType() {
        return idUniversityType;
    }

    /**
     * Sets the value of the idUniversityType property.
     * 
     */
    public void setIdUniversityType(int value) {
        this.idUniversityType = value;
    }

}
