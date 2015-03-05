
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dScienceSpeciality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dScienceSpeciality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScienceScienseClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceScienseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_ScienceSpeciality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceScienseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="olddta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dScienceSpeciality", propOrder = {
    "scienceScienseClasifierCode",
    "scienceScienseName",
    "scienceIndustryClasifierCode",
    "scienceIndustryName",
    "idScienceSpeciality",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceScienseCode",
    "scienceIndustryCode",
    "scienceSpecialityName",
    "olddta"
})
public class DScienceSpeciality {

    @XmlElement(name = "ScienceScienseClasifierCode")
    protected String scienceScienseClasifierCode;
    @XmlElement(name = "ScienceScienseName")
    protected String scienceScienseName;
    @XmlElement(name = "ScienceIndustryClasifierCode")
    protected String scienceIndustryClasifierCode;
    @XmlElement(name = "ScienceIndustryName")
    protected String scienceIndustryName;
    @XmlElement(name = "Id_ScienceSpeciality")
    protected int idScienceSpeciality;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceScienseCode")
    protected String scienceScienseCode;
    @XmlElement(name = "ScienceIndustryCode")
    protected String scienceIndustryCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    protected int olddta;

    /**
     * Gets the value of the scienceScienseClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceScienseClasifierCode() {
        return scienceScienseClasifierCode;
    }

    /**
     * Sets the value of the scienceScienseClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceScienseClasifierCode(String value) {
        this.scienceScienseClasifierCode = value;
    }

    /**
     * Gets the value of the scienceScienseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceScienseName() {
        return scienceScienseName;
    }

    /**
     * Sets the value of the scienceScienseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceScienseName(String value) {
        this.scienceScienseName = value;
    }

    /**
     * Gets the value of the scienceIndustryClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryClasifierCode() {
        return scienceIndustryClasifierCode;
    }

    /**
     * Sets the value of the scienceIndustryClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryClasifierCode(String value) {
        this.scienceIndustryClasifierCode = value;
    }

    /**
     * Gets the value of the scienceIndustryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryName() {
        return scienceIndustryName;
    }

    /**
     * Sets the value of the scienceIndustryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryName(String value) {
        this.scienceIndustryName = value;
    }

    /**
     * Gets the value of the idScienceSpeciality property.
     * 
     */
    public int getIdScienceSpeciality() {
        return idScienceSpeciality;
    }

    /**
     * Sets the value of the idScienceSpeciality property.
     * 
     */
    public void setIdScienceSpeciality(int value) {
        this.idScienceSpeciality = value;
    }

    /**
     * Gets the value of the scienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityCode() {
        return scienceSpecialityCode;
    }

    /**
     * Sets the value of the scienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityCode(String value) {
        this.scienceSpecialityCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityClasifierCode() {
        return scienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the scienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityClasifierCode(String value) {
        this.scienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the scienceScienseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceScienseCode() {
        return scienceScienseCode;
    }

    /**
     * Sets the value of the scienceScienseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceScienseCode(String value) {
        this.scienceScienseCode = value;
    }

    /**
     * Gets the value of the scienceIndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryCode() {
        return scienceIndustryCode;
    }

    /**
     * Sets the value of the scienceIndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryCode(String value) {
        this.scienceIndustryCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityName() {
        return scienceSpecialityName;
    }

    /**
     * Sets the value of the scienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityName(String value) {
        this.scienceSpecialityName = value;
    }

    /**
     * Gets the value of the olddta property.
     * 
     */
    public int getOlddta() {
        return olddta;
    }

    /**
     * Sets the value of the olddta property.
     * 
     */
    public void setOlddta(int value) {
        this.olddta = value;
    }

}
