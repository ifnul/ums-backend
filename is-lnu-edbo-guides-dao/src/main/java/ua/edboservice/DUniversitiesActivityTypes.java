
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversitiesActivityTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversitiesActivityTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversitiesActivityTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesActivityTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesActivityTypesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversitiesActivityTypes", propOrder = {
    "idUniversitiesActivityTypes",
    "universitiesActivityTypes",
    "universitiesActivityTypesCode"
})
public class DUniversitiesActivityTypes {

    @XmlElement(name = "Id_UniversitiesActivityTypes")
    protected int idUniversitiesActivityTypes;
    @XmlElement(name = "UniversitiesActivityTypes")
    protected String universitiesActivityTypes;
    @XmlElement(name = "UniversitiesActivityTypesCode")
    protected String universitiesActivityTypesCode;

    /**
     * Gets the value of the idUniversitiesActivityTypes property.
     * 
     */
    public int getIdUniversitiesActivityTypes() {
        return idUniversitiesActivityTypes;
    }

    /**
     * Sets the value of the idUniversitiesActivityTypes property.
     * 
     */
    public void setIdUniversitiesActivityTypes(int value) {
        this.idUniversitiesActivityTypes = value;
    }

    /**
     * Gets the value of the universitiesActivityTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesActivityTypes() {
        return universitiesActivityTypes;
    }

    /**
     * Sets the value of the universitiesActivityTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesActivityTypes(String value) {
        this.universitiesActivityTypes = value;
    }

    /**
     * Gets the value of the universitiesActivityTypesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesActivityTypesCode() {
        return universitiesActivityTypesCode;
    }

    /**
     * Sets the value of the universitiesActivityTypesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesActivityTypesCode(String value) {
        this.universitiesActivityTypesCode = value;
    }

}
