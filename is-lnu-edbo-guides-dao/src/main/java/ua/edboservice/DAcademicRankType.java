
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicRankType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicRankType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicRankType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicRankTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicRankType", propOrder = {
    "idAcademicRankType",
    "academicRankTypeName"
})
public class DAcademicRankType {

    @XmlElement(name = "Id_AcademicRankType")
    protected int idAcademicRankType;
    @XmlElement(name = "AcademicRankTypeName")
    protected String academicRankTypeName;

    /**
     * Gets the value of the idAcademicRankType property.
     * 
     */
    public int getIdAcademicRankType() {
        return idAcademicRankType;
    }

    /**
     * Sets the value of the idAcademicRankType property.
     * 
     */
    public void setIdAcademicRankType(int value) {
        this.idAcademicRankType = value;
    }

    /**
     * Gets the value of the academicRankTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankTypeName() {
        return academicRankTypeName;
    }

    /**
     * Sets the value of the academicRankTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankTypeName(String value) {
        this.academicRankTypeName = value;
    }

}
