
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityStateOrdersTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityStateOrdersTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityStateOrdersType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityStateOrdersTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityStateOrdersTypes", propOrder = {
    "idUniversityStateOrdersType",
    "universityStateOrdersTypeName"
})
public class DUniversityStateOrdersTypes {

    @XmlElement(name = "Id_UniversityStateOrdersType")
    protected int idUniversityStateOrdersType;
    @XmlElement(name = "UniversityStateOrdersTypeName")
    protected String universityStateOrdersTypeName;

    /**
     * Gets the value of the idUniversityStateOrdersType property.
     * 
     */
    public int getIdUniversityStateOrdersType() {
        return idUniversityStateOrdersType;
    }

    /**
     * Sets the value of the idUniversityStateOrdersType property.
     * 
     */
    public void setIdUniversityStateOrdersType(int value) {
        this.idUniversityStateOrdersType = value;
    }

    /**
     * Gets the value of the universityStateOrdersTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityStateOrdersTypeName() {
        return universityStateOrdersTypeName;
    }

    /**
     * Sets the value of the universityStateOrdersTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityStateOrdersTypeName(String value) {
        this.universityStateOrdersTypeName = value;
    }

}
