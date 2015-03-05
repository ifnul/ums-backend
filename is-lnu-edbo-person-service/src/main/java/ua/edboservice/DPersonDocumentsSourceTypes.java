
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonDocumentsSourceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonDocumentsSourceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDocumentSourceTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentSourceTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonDocumentsSourceTypes", propOrder = {
    "idPersonDocumentSourceTypes",
    "personDocumentSourceTypesName"
})
public class DPersonDocumentsSourceTypes {

    @XmlElement(name = "Id_PersonDocumentSourceTypes")
    protected int idPersonDocumentSourceTypes;
    @XmlElement(name = "PersonDocumentSourceTypesName")
    protected String personDocumentSourceTypesName;

    /**
     * Gets the value of the idPersonDocumentSourceTypes property.
     * 
     */
    public int getIdPersonDocumentSourceTypes() {
        return idPersonDocumentSourceTypes;
    }

    /**
     * Sets the value of the idPersonDocumentSourceTypes property.
     * 
     */
    public void setIdPersonDocumentSourceTypes(int value) {
        this.idPersonDocumentSourceTypes = value;
    }

    /**
     * Gets the value of the personDocumentSourceTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentSourceTypesName() {
        return personDocumentSourceTypesName;
    }

    /**
     * Sets the value of the personDocumentSourceTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentSourceTypesName(String value) {
        this.personDocumentSourceTypesName = value;
    }

}
