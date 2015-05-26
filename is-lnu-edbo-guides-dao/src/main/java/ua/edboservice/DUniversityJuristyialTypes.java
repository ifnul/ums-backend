
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityJuristyialTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityJuristyialTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityJuristicalType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityJuristicalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityJuristyialTypes", propOrder = {
    "idUniversityJuristicalType",
    "universityJuristicalTypeName"
})
public class DUniversityJuristyialTypes {

    @XmlElement(name = "Id_UniversityJuristicalType")
    protected int idUniversityJuristicalType;
    @XmlElement(name = "UniversityJuristicalTypeName")
    protected String universityJuristicalTypeName;

    /**
     * Gets the value of the idUniversityJuristicalType property.
     * 
     */
    public int getIdUniversityJuristicalType() {
        return idUniversityJuristicalType;
    }

    /**
     * Sets the value of the idUniversityJuristicalType property.
     * 
     */
    public void setIdUniversityJuristicalType(int value) {
        this.idUniversityJuristicalType = value;
    }

    /**
     * Gets the value of the universityJuristicalTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityJuristicalTypeName() {
        return universityJuristicalTypeName;
    }

    /**
     * Sets the value of the universityJuristicalTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityJuristicalTypeName(String value) {
        this.universityJuristicalTypeName = value;
    }

}
