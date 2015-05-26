
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dRegulationDocumentTypesGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentTypesGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocumentTypeGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentTypeGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentTypesGroups", propOrder = {
    "idRegulationDocumentTypeGroup",
    "regulationDocumentTypeGroupName"
})
public class DRegulationDocumentTypesGroups {

    @XmlElement(name = "Id_RegulationDocumentTypeGroup")
    protected int idRegulationDocumentTypeGroup;
    @XmlElement(name = "RegulationDocumentTypeGroupName")
    protected String regulationDocumentTypeGroupName;

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

    /**
     * Gets the value of the regulationDocumentTypeGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentTypeGroupName() {
        return regulationDocumentTypeGroupName;
    }

    /**
     * Sets the value of the regulationDocumentTypeGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentTypeGroupName(String value) {
        this.regulationDocumentTypeGroupName = value;
    }

}
