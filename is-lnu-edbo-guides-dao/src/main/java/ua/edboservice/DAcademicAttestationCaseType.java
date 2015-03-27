
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicAttestationCaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicAttestationCaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicAttestationCaseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicAttestationCaseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicAttestationCaseType", propOrder = {
    "idAcademicAttestationCaseType",
    "academicAttestationCaseTypeName"
})
public class DAcademicAttestationCaseType {

    @XmlElement(name = "Id_AcademicAttestationCaseType")
    protected int idAcademicAttestationCaseType;
    @XmlElement(name = "AcademicAttestationCaseTypeName")
    protected String academicAttestationCaseTypeName;

    /**
     * Gets the value of the idAcademicAttestationCaseType property.
     * 
     */
    public int getIdAcademicAttestationCaseType() {
        return idAcademicAttestationCaseType;
    }

    /**
     * Sets the value of the idAcademicAttestationCaseType property.
     * 
     */
    public void setIdAcademicAttestationCaseType(int value) {
        this.idAcademicAttestationCaseType = value;
    }

    /**
     * Gets the value of the academicAttestationCaseTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAttestationCaseTypeName() {
        return academicAttestationCaseTypeName;
    }

    /**
     * Sets the value of the academicAttestationCaseTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAttestationCaseTypeName(String value) {
        this.academicAttestationCaseTypeName = value;
    }

}
