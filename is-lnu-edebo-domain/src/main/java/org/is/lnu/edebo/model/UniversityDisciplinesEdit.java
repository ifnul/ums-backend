//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.27 at 12:51:32 AM EET 
//


package org.is.lnu.edebo.model;

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
 *         &lt;element name="Id_UniversitiesDisciplines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesDisciplinesFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesSmallName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesSmallNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversitiesDisciplinesCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsOld" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Params" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversitiesDisciplines",
    "universitiesDisciplinesFullName",
    "universitiesDisciplinesSmallName",
    "universitiesDisciplinesFullNameEn",
    "universitiesDisciplinesSmallNameEn",
    "idUniversitiesDisciplinesCategory",
    "isOld",
    "params"
})
@XmlRootElement(name = "UniversityDisciplinesEdit")
public class UniversityDisciplinesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversitiesDisciplines")
    protected int idUniversitiesDisciplines;
    @XmlElement(name = "UniversitiesDisciplinesFullName")
    protected String universitiesDisciplinesFullName;
    @XmlElement(name = "UniversitiesDisciplinesSmallName")
    protected String universitiesDisciplinesSmallName;
    @XmlElement(name = "UniversitiesDisciplinesFullNameEn")
    protected String universitiesDisciplinesFullNameEn;
    @XmlElement(name = "UniversitiesDisciplinesSmallNameEn")
    protected String universitiesDisciplinesSmallNameEn;
    @XmlElement(name = "Id_UniversitiesDisciplinesCategory")
    protected int idUniversitiesDisciplinesCategory;
    @XmlElement(name = "IsOld")
    protected int isOld;
    @XmlElement(name = "Params")
    protected String params;

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
     * Gets the value of the idUniversitiesDisciplines property.
     * 
     */
    public int getIdUniversitiesDisciplines() {
        return idUniversitiesDisciplines;
    }

    /**
     * Sets the value of the idUniversitiesDisciplines property.
     * 
     */
    public void setIdUniversitiesDisciplines(int value) {
        this.idUniversitiesDisciplines = value;
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
     * Gets the value of the universitiesDisciplinesSmallName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesSmallName() {
        return universitiesDisciplinesSmallName;
    }

    /**
     * Sets the value of the universitiesDisciplinesSmallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesSmallName(String value) {
        this.universitiesDisciplinesSmallName = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesFullNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesFullNameEn() {
        return universitiesDisciplinesFullNameEn;
    }

    /**
     * Sets the value of the universitiesDisciplinesFullNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesFullNameEn(String value) {
        this.universitiesDisciplinesFullNameEn = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesSmallNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesSmallNameEn() {
        return universitiesDisciplinesSmallNameEn;
    }

    /**
     * Sets the value of the universitiesDisciplinesSmallNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesSmallNameEn(String value) {
        this.universitiesDisciplinesSmallNameEn = value;
    }

    /**
     * Gets the value of the idUniversitiesDisciplinesCategory property.
     * 
     */
    public int getIdUniversitiesDisciplinesCategory() {
        return idUniversitiesDisciplinesCategory;
    }

    /**
     * Sets the value of the idUniversitiesDisciplinesCategory property.
     * 
     */
    public void setIdUniversitiesDisciplinesCategory(int value) {
        this.idUniversitiesDisciplinesCategory = value;
    }

    /**
     * Gets the value of the isOld property.
     * 
     */
    public int getIsOld() {
        return isOld;
    }

    /**
     * Sets the value of the isOld property.
     * 
     */
    public void setIsOld(int value) {
        this.isOld = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParams(String value) {
        this.params = value;
    }

}
