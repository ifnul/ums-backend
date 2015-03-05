
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityCloseStatusTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityCloseStatusTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityCloseStatusTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCloseStatusTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityCloseStatusTypes", propOrder = {
    "idUniversityCloseStatusTypes",
    "universityCloseStatusTypesName"
})
public class DUniversityCloseStatusTypes {

    @XmlElement(name = "Id_UniversityCloseStatusTypes")
    protected int idUniversityCloseStatusTypes;
    @XmlElement(name = "UniversityCloseStatusTypesName")
    protected String universityCloseStatusTypesName;

    /**
     * Gets the value of the idUniversityCloseStatusTypes property.
     * 
     */
    public int getIdUniversityCloseStatusTypes() {
        return idUniversityCloseStatusTypes;
    }

    /**
     * Sets the value of the idUniversityCloseStatusTypes property.
     * 
     */
    public void setIdUniversityCloseStatusTypes(int value) {
        this.idUniversityCloseStatusTypes = value;
    }

    /**
     * Gets the value of the universityCloseStatusTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCloseStatusTypesName() {
        return universityCloseStatusTypesName;
    }

    /**
     * Sets the value of the universityCloseStatusTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCloseStatusTypesName(String value) {
        this.universityCloseStatusTypesName = value;
    }

}
