
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicAttestationGlobalStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicAttestationGlobalStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicAttestationGlobalStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicAttestationGlobalStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicAttestationGlobalStatusType", propOrder = {
    "idAcademicAttestationGlobalStatusType",
    "academicAttestationGlobalStatusTypeName"
})
public class DAcademicAttestationGlobalStatusType {

    @XmlElement(name = "Id_AcademicAttestationGlobalStatusType")
    protected int idAcademicAttestationGlobalStatusType;
    @XmlElement(name = "AcademicAttestationGlobalStatusTypeName")
    protected String academicAttestationGlobalStatusTypeName;

    /**
     * Gets the value of the idAcademicAttestationGlobalStatusType property.
     * 
     */
    public int getIdAcademicAttestationGlobalStatusType() {
        return idAcademicAttestationGlobalStatusType;
    }

    /**
     * Sets the value of the idAcademicAttestationGlobalStatusType property.
     * 
     */
    public void setIdAcademicAttestationGlobalStatusType(int value) {
        this.idAcademicAttestationGlobalStatusType = value;
    }

    /**
     * Gets the value of the academicAttestationGlobalStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAttestationGlobalStatusTypeName() {
        return academicAttestationGlobalStatusTypeName;
    }

    /**
     * Sets the value of the academicAttestationGlobalStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAttestationGlobalStatusTypeName(String value) {
        this.academicAttestationGlobalStatusTypeName = value;
    }

}
