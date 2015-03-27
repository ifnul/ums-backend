
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicEducationCancelationTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicEducationCancelationTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicEducationCancelationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationCancelationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicEducationCancelationTypes", propOrder = {
    "idAcademicEducationCancelationType",
    "academicEducationCancelationTypeName"
})
public class DAcademicEducationCancelationTypes {

    @XmlElement(name = "Id_AcademicEducationCancelationType")
    protected int idAcademicEducationCancelationType;
    @XmlElement(name = "AcademicEducationCancelationTypeName")
    protected String academicEducationCancelationTypeName;

    /**
     * Gets the value of the idAcademicEducationCancelationType property.
     * 
     */
    public int getIdAcademicEducationCancelationType() {
        return idAcademicEducationCancelationType;
    }

    /**
     * Sets the value of the idAcademicEducationCancelationType property.
     * 
     */
    public void setIdAcademicEducationCancelationType(int value) {
        this.idAcademicEducationCancelationType = value;
    }

    /**
     * Gets the value of the academicEducationCancelationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationCancelationTypeName() {
        return academicEducationCancelationTypeName;
    }

    /**
     * Sets the value of the academicEducationCancelationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationCancelationTypeName(String value) {
        this.academicEducationCancelationTypeName = value;
    }

}
