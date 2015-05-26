
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicEducationDegreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicEducationDegreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicEducationDegreType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationDegreTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicEducationDegreType", propOrder = {
    "idAcademicEducationDegreType",
    "academicEducationDegreTypeName"
})
public class DAcademicEducationDegreType {

    @XmlElement(name = "Id_AcademicEducationDegreType")
    protected int idAcademicEducationDegreType;
    @XmlElement(name = "AcademicEducationDegreTypeName")
    protected String academicEducationDegreTypeName;

    /**
     * Gets the value of the idAcademicEducationDegreType property.
     * 
     */
    public int getIdAcademicEducationDegreType() {
        return idAcademicEducationDegreType;
    }

    /**
     * Sets the value of the idAcademicEducationDegreType property.
     * 
     */
    public void setIdAcademicEducationDegreType(int value) {
        this.idAcademicEducationDegreType = value;
    }

    /**
     * Gets the value of the academicEducationDegreTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreTypeName() {
        return academicEducationDegreTypeName;
    }

    /**
     * Sets the value of the academicEducationDegreTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreTypeName(String value) {
        this.academicEducationDegreTypeName = value;
    }

}
