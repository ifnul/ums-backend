
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityTypes", propOrder = {
    "idUniversityType",
    "universityTypeName"
})
public class DUniversityTypes {

    @XmlElement(name = "Id_UniversityType")
    protected int idUniversityType;
    @XmlElement(name = "UniversityTypeName")
    protected String universityTypeName;

    /**
     * Gets the value of the idUniversityType property.
     * 
     */
    public int getIdUniversityType() {
        return idUniversityType;
    }

    /**
     * Sets the value of the idUniversityType property.
     * 
     */
    public void setIdUniversityType(int value) {
        this.idUniversityType = value;
    }

    /**
     * Gets the value of the universityTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityTypeName() {
        return universityTypeName;
    }

    /**
     * Sets the value of the universityTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityTypeName(String value) {
        this.universityTypeName = value;
    }

}
