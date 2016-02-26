
package org.lnu.is.edbo.person_min;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonDocumentTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonDocumentTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentTypeNames" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsEntrantDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonDocumentTypes", propOrder = {
    "idPersonDocumentType",
    "idPersonDocumentTypeNames",
    "personDocumentTypeName",
    "idLanguage",
    "isEntrantDocument"
})
public class DPersonDocumentTypes {

    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "Id_PersonDocumentTypeNames")
    protected int idPersonDocumentTypeNames;
    @XmlElement(name = "PersonDocumentTypeName")
    protected String personDocumentTypeName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "IsEntrantDocument")
    protected int isEntrantDocument;

    /**
     * Gets the value of the idPersonDocumentType property.
     * 
     */
    public int getIdPersonDocumentType() {
        return idPersonDocumentType;
    }

    /**
     * Sets the value of the idPersonDocumentType property.
     * 
     */
    public void setIdPersonDocumentType(int value) {
        this.idPersonDocumentType = value;
    }

    /**
     * Gets the value of the idPersonDocumentTypeNames property.
     * 
     */
    public int getIdPersonDocumentTypeNames() {
        return idPersonDocumentTypeNames;
    }

    /**
     * Sets the value of the idPersonDocumentTypeNames property.
     * 
     */
    public void setIdPersonDocumentTypeNames(int value) {
        this.idPersonDocumentTypeNames = value;
    }

    /**
     * Gets the value of the personDocumentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentTypeName() {
        return personDocumentTypeName;
    }

    /**
     * Sets the value of the personDocumentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentTypeName(String value) {
        this.personDocumentTypeName = value;
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
     * Gets the value of the isEntrantDocument property.
     * 
     */
    public int getIsEntrantDocument() {
        return isEntrantDocument;
    }

    /**
     * Sets the value of the isEntrantDocument property.
     * 
     */
    public void setIsEntrantDocument(int value) {
        this.isEntrantDocument = value;
    }

}
