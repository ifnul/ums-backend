
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicCouncilType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicCouncilType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicCouncilType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicCouncilTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicCouncilType", propOrder = {
    "idAcademicCouncilType",
    "academicCouncilTypeName"
})
public class DAcademicCouncilType {

    @XmlElement(name = "Id_AcademicCouncilType")
    protected int idAcademicCouncilType;
    @XmlElement(name = "AcademicCouncilTypeName")
    protected String academicCouncilTypeName;

    /**
     * Gets the value of the idAcademicCouncilType property.
     * 
     */
    public int getIdAcademicCouncilType() {
        return idAcademicCouncilType;
    }

    /**
     * Sets the value of the idAcademicCouncilType property.
     * 
     */
    public void setIdAcademicCouncilType(int value) {
        this.idAcademicCouncilType = value;
    }

    /**
     * Gets the value of the academicCouncilTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilTypeName() {
        return academicCouncilTypeName;
    }

    /**
     * Sets the value of the academicCouncilTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilTypeName(String value) {
        this.academicCouncilTypeName = value;
    }

}
