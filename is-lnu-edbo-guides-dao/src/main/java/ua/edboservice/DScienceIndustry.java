
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dScienceIndustry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dScienceIndustry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ScienceIndustry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceIndustryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="olddta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dScienceIndustry", propOrder = {
    "idScienceIndustry",
    "scienceIndustryCode",
    "scienceIndustryClasifierCode",
    "scienceIndustryName",
    "olddta"
})
public class DScienceIndustry {

    @XmlElement(name = "Id_ScienceIndustry")
    protected int idScienceIndustry;
    @XmlElement(name = "ScienceIndustryCode")
    protected String scienceIndustryCode;
    @XmlElement(name = "ScienceIndustryClasifierCode")
    protected String scienceIndustryClasifierCode;
    @XmlElement(name = "ScienceIndustryName")
    protected String scienceIndustryName;
    protected int olddta;

    /**
     * Gets the value of the idScienceIndustry property.
     * 
     */
    public int getIdScienceIndustry() {
        return idScienceIndustry;
    }

    /**
     * Sets the value of the idScienceIndustry property.
     * 
     */
    public void setIdScienceIndustry(int value) {
        this.idScienceIndustry = value;
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
     * Gets the value of the scienceIndustryClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryClasifierCode() {
        return scienceIndustryClasifierCode;
    }

    /**
     * Sets the value of the scienceIndustryClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryClasifierCode(String value) {
        this.scienceIndustryClasifierCode = value;
    }

    /**
     * Gets the value of the scienceIndustryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryName() {
        return scienceIndustryName;
    }

    /**
     * Sets the value of the scienceIndustryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryName(String value) {
        this.scienceIndustryName = value;
    }

    /**
     * Gets the value of the olddta property.
     * 
     */
    public int getOlddta() {
        return olddta;
    }

    /**
     * Sets the value of the olddta property.
     * 
     */
    public void setOlddta(int value) {
        this.olddta = value;
    }

}
