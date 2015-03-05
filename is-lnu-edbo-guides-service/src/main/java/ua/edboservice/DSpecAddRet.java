
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dSpecAddRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSpecAddRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_SpecSpeciality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecSpecialization" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Spec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSpecAddRet", propOrder = {
    "idSpecSpeciality",
    "specSpecialityCode",
    "idSpecSpecialization",
    "specSpecializationCode",
    "specCode",
    "idSpec"
})
public class DSpecAddRet {

    @XmlElement(name = "Id_SpecSpeciality")
    protected int idSpecSpeciality;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "Id_SpecSpecialization")
    protected int idSpecSpecialization;
    @XmlElement(name = "SpecSpecializationCode")
    protected String specSpecializationCode;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "Id_Spec")
    protected int idSpec;

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
     * Gets the value of the idSpec property.
     * 
     */
    public int getIdSpec() {
        return idSpec;
    }

    /**
     * Sets the value of the idSpec property.
     * 
     */
    public void setIdSpec(int value) {
        this.idSpec = value;
    }

}
