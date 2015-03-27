
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityStructureSpecialitiesHierarcare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityStructureSpecialitiesHierarcare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecIndastry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecIndastryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecDirections" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecSpeciality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecSpecialization" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityStructureSpecialitiesHierarcare", propOrder = {
    "specCode",
    "specClasifierCode",
    "idSpecIndastry",
    "specIndastryCode",
    "specIndastryName",
    "idSpecDirections",
    "specDirectionsCode",
    "specDirectionName",
    "idSpecSpeciality",
    "specSpecialityCode",
    "specSpecialityName",
    "idSpecSpecialization",
    "specSpecializationCode",
    "specSpecializationName"
})
public class DUniversityStructureSpecialitiesHierarcare {

    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "Id_SpecIndastry")
    protected int idSpecIndastry;
    @XmlElement(name = "SpecIndastryCode")
    protected String specIndastryCode;
    @XmlElement(name = "SpecIndastryName")
    protected String specIndastryName;
    @XmlElement(name = "Id_SpecDirections")
    protected int idSpecDirections;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "Id_SpecSpeciality")
    protected int idSpecSpeciality;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "Id_SpecSpecialization")
    protected int idSpecSpecialization;
    @XmlElement(name = "SpecSpecializationCode")
    protected String specSpecializationCode;
    @XmlElement(name = "SpecSpecializationName")
    protected String specSpecializationName;

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

    /**
     * Gets the value of the idSpecIndastry property.
     * 
     */
    public int getIdSpecIndastry() {
        return idSpecIndastry;
    }

    /**
     * Sets the value of the idSpecIndastry property.
     * 
     */
    public void setIdSpecIndastry(int value) {
        this.idSpecIndastry = value;
    }

    /**
     * Gets the value of the specIndastryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryCode() {
        return specIndastryCode;
    }

    /**
     * Sets the value of the specIndastryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryCode(String value) {
        this.specIndastryCode = value;
    }

    /**
     * Gets the value of the specIndastryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryName() {
        return specIndastryName;
    }

    /**
     * Sets the value of the specIndastryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryName(String value) {
        this.specIndastryName = value;
    }

    /**
     * Gets the value of the idSpecDirections property.
     * 
     */
    public int getIdSpecDirections() {
        return idSpecDirections;
    }

    /**
     * Sets the value of the idSpecDirections property.
     * 
     */
    public void setIdSpecDirections(int value) {
        this.idSpecDirections = value;
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
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the idSpecSpeciality property.
     * 
     */
    public int getIdSpecSpeciality() {
        return idSpecSpeciality;
    }

    /**
     * Sets the value of the idSpecSpeciality property.
     * 
     */
    public void setIdSpecSpeciality(int value) {
        this.idSpecSpeciality = value;
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
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the idSpecSpecialization property.
     * 
     */
    public int getIdSpecSpecialization() {
        return idSpecSpecialization;
    }

    /**
     * Sets the value of the idSpecSpecialization property.
     * 
     */
    public void setIdSpecSpecialization(int value) {
        this.idSpecSpecialization = value;
    }

    /**
     * Gets the value of the specSpecializationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecializationCode() {
        return specSpecializationCode;
    }

    /**
     * Sets the value of the specSpecializationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecializationCode(String value) {
        this.specSpecializationCode = value;
    }

    /**
     * Gets the value of the specSpecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecializationName() {
        return specSpecializationName;
    }

    /**
     * Sets the value of the specSpecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecializationName(String value) {
        this.specSpecializationName = value;
    }

}
