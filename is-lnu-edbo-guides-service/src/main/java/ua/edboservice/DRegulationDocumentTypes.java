
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dRegulationDocumentTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocumentTypeGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentTypes", propOrder = {
    "idRegulationDocumentType",
    "regulationDocumentTypeName",
    "idRegulationDocumentTypeGroup"
})
public class DRegulationDocumentTypes {

    @XmlElement(name = "Id_RegulationDocumentType")
    protected int idRegulationDocumentType;
    @XmlElement(name = "RegulationDocumentTypeName")
    protected String regulationDocumentTypeName;
    @XmlElement(name = "Id_RegulationDocumentTypeGroup")
    protected int idRegulationDocumentTypeGroup;

    /**
     * Gets the value of the idRegulationDocumentType property.
     * 
     */
    public int getIdRegulationDocumentType() {
        return idRegulationDocumentType;
    }

    /**
     * Sets the value of the idRegulationDocumentType property.
     * 
     */
    public void setIdRegulationDocumentType(int value) {
        this.idRegulationDocumentType = value;
    }

    /**
     * Gets the value of the regulationDocumentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentTypeName() {
        return regulationDocumentTypeName;
    }

    /**
     * Sets the value of the regulationDocumentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentTypeName(String value) {
        this.regulationDocumentTypeName = value;
    }

    /**
     * Gets the value of the idRegulationDocumentTypeGroup property.
     * 
     */
    public int getIdRegulationDocumentTypeGroup() {
        return idRegulationDocumentTypeGroup;
    }

    /**
     * Sets the value of the idRegulationDocumentTypeGroup property.
     * 
     */
    public void setIdRegulationDocumentTypeGroup(int value) {
        this.idRegulationDocumentTypeGroup = value;
    }

}
