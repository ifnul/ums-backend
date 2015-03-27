
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dEducationalCyclesDisciplinesPeriodsGlobal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationalCyclesDisciplinesPeriodsGlobal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationalCyclesDiscipline" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesDisciplinesFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesDisciplinesGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesDisciplinesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscilineCOunt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEducationalCyclesDisciplinesPeriodsGlobal", propOrder = {
    "idEducationalCyclesDiscipline",
    "universitiesDisciplinesFullName",
    "idEducationalCyclesDisciplinesGroup",
    "educationalCyclesDisciplinesGroupName",
    "idEducationalCyclesDisciplinesTypes",
    "educationalCyclesDisciplinesTypeName",
    "discilineCOunt"
})
public class DEducationalCyclesDisciplinesPeriodsGlobal {

    @XmlElement(name = "Id_EducationalCyclesDiscipline")
    protected int idEducationalCyclesDiscipline;
    @XmlElement(name = "UniversitiesDisciplinesFullName")
    protected String universitiesDisciplinesFullName;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesGroup")
    protected int idEducationalCyclesDisciplinesGroup;
    @XmlElement(name = "EducationalCyclesDisciplinesGroupName")
    protected String educationalCyclesDisciplinesGroupName;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesTypes")
    protected int idEducationalCyclesDisciplinesTypes;
    @XmlElement(name = "EducationalCyclesDisciplinesTypeName")
    protected String educationalCyclesDisciplinesTypeName;
    @XmlElement(name = "DiscilineCOunt")
    protected int discilineCOunt;

    /**
     * Gets the value of the idEducationalCyclesDiscipline property.
     * 
     */
    public int getIdEducationalCyclesDiscipline() {
        return idEducationalCyclesDiscipline;
    }

    /**
     * Sets the value of the idEducationalCyclesDiscipline property.
     * 
     */
    public void setIdEducationalCyclesDiscipline(int value) {
        this.idEducationalCyclesDiscipline = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesFullName() {
        return universitiesDisciplinesFullName;
    }

    /**
     * Sets the value of the universitiesDisciplinesFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesFullName(String value) {
        this.universitiesDisciplinesFullName = value;
    }

    /**
     * Gets the value of the idEducationalCyclesDisciplinesGroup property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesGroup() {
        return idEducationalCyclesDisciplinesGroup;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesGroup property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesGroup(int value) {
        this.idEducationalCyclesDisciplinesGroup = value;
    }

    /**
     * Gets the value of the educationalCyclesDisciplinesGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesDisciplinesGroupName() {
        return educationalCyclesDisciplinesGroupName;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesDisciplinesGroupName(String value) {
        this.educationalCyclesDisciplinesGroupName = value;
    }

    /**
     * Gets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesTypes() {
        return idEducationalCyclesDisciplinesTypes;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesTypes(int value) {
        this.idEducationalCyclesDisciplinesTypes = value;
    }

    /**
     * Gets the value of the educationalCyclesDisciplinesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesDisciplinesTypeName() {
        return educationalCyclesDisciplinesTypeName;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesDisciplinesTypeName(String value) {
        this.educationalCyclesDisciplinesTypeName = value;
    }

    /**
     * Gets the value of the discilineCOunt property.
     * 
     */
    public int getDiscilineCOunt() {
        return discilineCOunt;
    }

    /**
     * Sets the value of the discilineCOunt property.
     * 
     */
    public void setDiscilineCOunt(int value) {
        this.discilineCOunt = value;
    }

}
