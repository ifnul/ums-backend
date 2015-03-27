
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicAttestationCaseSatusHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicAttestationCaseSatusHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicAttestationCaseSatusHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicAttestationCaseSatusHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicAttestationCaseSatusHistoryType", propOrder = {
    "idAcademicAttestationCaseSatusHistoryType",
    "academicAttestationCaseSatusHistoryTypeName"
})
public class DAcademicAttestationCaseSatusHistoryType {

    @XmlElement(name = "Id_AcademicAttestationCaseSatusHistoryType")
    protected int idAcademicAttestationCaseSatusHistoryType;
    @XmlElement(name = "AcademicAttestationCaseSatusHistoryTypeName")
    protected String academicAttestationCaseSatusHistoryTypeName;

    /**
     * Gets the value of the idAcademicAttestationCaseSatusHistoryType property.
     * 
     */
    public int getIdAcademicAttestationCaseSatusHistoryType() {
        return idAcademicAttestationCaseSatusHistoryType;
    }

    /**
     * Sets the value of the idAcademicAttestationCaseSatusHistoryType property.
     * 
     */
    public void setIdAcademicAttestationCaseSatusHistoryType(int value) {
        this.idAcademicAttestationCaseSatusHistoryType = value;
    }

    /**
     * Gets the value of the academicAttestationCaseSatusHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAttestationCaseSatusHistoryTypeName() {
        return academicAttestationCaseSatusHistoryTypeName;
    }

    /**
     * Sets the value of the academicAttestationCaseSatusHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAttestationCaseSatusHistoryTypeName(String value) {
        this.academicAttestationCaseSatusHistoryTypeName = value;
    }

}
