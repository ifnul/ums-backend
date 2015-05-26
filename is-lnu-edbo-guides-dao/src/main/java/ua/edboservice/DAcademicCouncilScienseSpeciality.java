
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicCouncilScienseSpeciality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicCouncilScienseSpeciality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicCouncilScienseSpeciality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicCouncil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicCouncilScienseSpeciality", propOrder = {
    "idAcademicCouncilScienseSpeciality",
    "idAcademicCouncil",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName"
})
public class DAcademicCouncilScienseSpeciality {

    @XmlElement(name = "Id_AcademicCouncilScienseSpeciality")
    protected int idAcademicCouncilScienseSpeciality;
    @XmlElement(name = "Id_AcademicCouncil")
    protected int idAcademicCouncil;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;

    /**
     * Gets the value of the idAcademicCouncilScienseSpeciality property.
     * 
     */
    public int getIdAcademicCouncilScienseSpeciality() {
        return idAcademicCouncilScienseSpeciality;
    }

    /**
     * Sets the value of the idAcademicCouncilScienseSpeciality property.
     * 
     */
    public void setIdAcademicCouncilScienseSpeciality(int value) {
        this.idAcademicCouncilScienseSpeciality = value;
    }

    /**
     * Gets the value of the idAcademicCouncil property.
     * 
     */
    public int getIdAcademicCouncil() {
        return idAcademicCouncil;
    }

    /**
     * Sets the value of the idAcademicCouncil property.
     * 
     */
    public void setIdAcademicCouncil(int value) {
        this.idAcademicCouncil = value;
    }

    /**
     * Gets the value of the scienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityCode() {
        return scienceSpecialityCode;
    }

    /**
     * Sets the value of the scienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityCode(String value) {
        this.scienceSpecialityCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityClasifierCode() {
        return scienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the scienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityClasifierCode(String value) {
        this.scienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityName() {
        return scienceSpecialityName;
    }

    /**
     * Sets the value of the scienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityName(String value) {
        this.scienceSpecialityName = value;
    }

}
