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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityBossOrderOrganisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBossOrderOrganisation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversitiesBossOrderOrganisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesBossOrderOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityBossOrderOrganisation", propOrder = {
    "idUniversitiesBossOrderOrganisation",
    "universitiesBossOrderOrganisationName"
})
public class DUniversityBossOrderOrganisation {

    @XmlElement(name = "Id_UniversitiesBossOrderOrganisation")
    protected int idUniversitiesBossOrderOrganisation;
    @XmlElement(name = "UniversitiesBossOrderOrganisationName")
    protected String universitiesBossOrderOrganisationName;

    /**
     * Gets the value of the idUniversitiesBossOrderOrganisation property.
     * 
     */
    public int getIdUniversitiesBossOrderOrganisation() {
        return idUniversitiesBossOrderOrganisation;
    }

    /**
     * Sets the value of the idUniversitiesBossOrderOrganisation property.
     * 
     */
    public void setIdUniversitiesBossOrderOrganisation(int value) {
        this.idUniversitiesBossOrderOrganisation = value;
    }

    /**
     * Gets the value of the universitiesBossOrderOrganisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesBossOrderOrganisationName() {
        return universitiesBossOrderOrganisationName;
    }

    /**
     * Sets the value of the universitiesBossOrderOrganisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesBossOrderOrganisationName(String value) {
        this.universitiesBossOrderOrganisationName = value;
    }

}
