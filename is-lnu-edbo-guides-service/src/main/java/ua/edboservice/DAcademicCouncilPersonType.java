
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicCouncilPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicCouncilPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicCouncilPersonType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicCouncilPersonTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicCouncilPersonType", propOrder = {
    "idAcademicCouncilPersonType",
    "academicCouncilPersonTypeName"
})
public class DAcademicCouncilPersonType {

    @XmlElement(name = "Id_AcademicCouncilPersonType")
    protected int idAcademicCouncilPersonType;
    @XmlElement(name = "AcademicCouncilPersonTypeName")
    protected String academicCouncilPersonTypeName;

    /**
     * Gets the value of the idAcademicCouncilPersonType property.
     * 
     */
    public int getIdAcademicCouncilPersonType() {
        return idAcademicCouncilPersonType;
    }

    /**
     * Sets the value of the idAcademicCouncilPersonType property.
     * 
     */
    public void setIdAcademicCouncilPersonType(int value) {
        this.idAcademicCouncilPersonType = value;
    }

    /**
     * Gets the value of the academicCouncilPersonTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilPersonTypeName() {
        return academicCouncilPersonTypeName;
    }

    /**
     * Sets the value of the academicCouncilPersonTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilPersonTypeName(String value) {
        this.academicCouncilPersonTypeName = value;
    }

}
