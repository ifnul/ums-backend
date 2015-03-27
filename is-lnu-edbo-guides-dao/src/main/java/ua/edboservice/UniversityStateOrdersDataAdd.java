
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityStateOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_StateOrdersOsnovaType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specialization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "idUniversityStateOrder",
    "idStateOrdersOsnovaType",
    "idQualificationGroup",
    "specDirectionsCode",
    "specSpecialityCode",
    "scienceIndustryCode",
    "specialization"
})
@XmlRootElement(name = "UniversityStateOrdersDataAdd")
public class UniversityStateOrdersDataAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityStateOrder")
    protected int idUniversityStateOrder;
    @XmlElement(name = "Id_StateOrdersOsnovaType")
    protected int idStateOrdersOsnovaType;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "ScienceIndustryCode")
    protected String scienceIndustryCode;
    @XmlElement(name = "Specialization")
    protected String specialization;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idUniversityStateOrder property.
     * 
     */
    public int getIdUniversityStateOrder() {
        return idUniversityStateOrder;
    }

    /**
     * Sets the value of the idUniversityStateOrder property.
     * 
     */
    public void setIdUniversityStateOrder(int value) {
        this.idUniversityStateOrder = value;
    }

    /**
     * Gets the value of the idStateOrdersOsnovaType property.
     * 
     */
    public int getIdStateOrdersOsnovaType() {
        return idStateOrdersOsnovaType;
    }

    /**
     * Sets the value of the idStateOrdersOsnovaType property.
     * 
     */
    public void setIdStateOrdersOsnovaType(int value) {
        this.idStateOrdersOsnovaType = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

    /**
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the scienceIndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryCode() {
        return scienceIndustryCode;
    }

    /**
     * Sets the value of the scienceIndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryCode(String value) {
        this.scienceIndustryCode = value;
    }

    /**
     * Gets the value of the specialization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the value of the specialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialization(String value) {
        this.specialization = value;
    }

}
