
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicRank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicRankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicRank", propOrder = {
    "idAcademicRank",
    "academicRankName"
})
public class DAcademicRank {

    @XmlElement(name = "Id_AcademicRank")
    protected int idAcademicRank;
    @XmlElement(name = "AcademicRankName")
    protected String academicRankName;

    /**
     * Gets the value of the idAcademicRank property.
     * 
     */
    public int getIdAcademicRank() {
        return idAcademicRank;
    }

    /**
     * Sets the value of the idAcademicRank property.
     * 
     */
    public void setIdAcademicRank(int value) {
        this.idAcademicRank = value;
    }

    /**
     * Gets the value of the academicRankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankName() {
        return academicRankName;
    }

    /**
     * Sets the value of the academicRankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankName(String value) {
        this.academicRankName = value;
    }

}
