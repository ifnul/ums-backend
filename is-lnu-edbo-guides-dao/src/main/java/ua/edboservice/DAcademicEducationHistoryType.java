
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicEducationHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicEducationHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicEducationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicEducationHistoryType", propOrder = {
    "idAcademicEducationHistoryType",
    "academicEducationHistoryTypeName"
})
public class DAcademicEducationHistoryType {

    @XmlElement(name = "Id_AcademicEducationHistoryType")
    protected int idAcademicEducationHistoryType;
    @XmlElement(name = "AcademicEducationHistoryTypeName")
    protected String academicEducationHistoryTypeName;

    /**
     * Gets the value of the idAcademicEducationHistoryType property.
     * 
     */
    public int getIdAcademicEducationHistoryType() {
        return idAcademicEducationHistoryType;
    }

    /**
     * Sets the value of the idAcademicEducationHistoryType property.
     * 
     */
    public void setIdAcademicEducationHistoryType(int value) {
        this.idAcademicEducationHistoryType = value;
    }

    /**
     * Gets the value of the academicEducationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationHistoryTypeName() {
        return academicEducationHistoryTypeName;
    }

    /**
     * Sets the value of the academicEducationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationHistoryTypeName(String value) {
        this.academicEducationHistoryTypeName = value;
    }

}
