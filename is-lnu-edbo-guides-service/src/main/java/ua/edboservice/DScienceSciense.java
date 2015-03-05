
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dScienceSciense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dScienceSciense">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ScienceSciense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceScienseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceScienseClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceScienseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dScienceSciense", propOrder = {
    "idScienceSciense",
    "scienceScienseCode",
    "scienceScienseClasifierCode",
    "scienceIndustryCode",
    "scienceScienseName",
    "olddta"
})
public class DScienceSciense {

    @XmlElement(name = "Id_ScienceSciense")
    protected int idScienceSciense;
    @XmlElement(name = "ScienceScienseCode")
    protected String scienceScienseCode;
    @XmlElement(name = "ScienceScienseClasifierCode")
    protected String scienceScienseClasifierCode;
    @XmlElement(name = "ScienceIndustryCode")
    protected String scienceIndustryCode;
    @XmlElement(name = "ScienceScienseName")
    protected String scienceScienseName;
    protected int olddta;

    /**
     * Gets the value of the idScienceSciense property.
     * 
     */
    public int getIdScienceSciense() {
        return idScienceSciense;
    }

    /**
     * Sets the value of the idScienceSciense property.
     * 
     */
    public void setIdScienceSciense(int value) {
        this.idScienceSciense = value;
    }

    /**
     * Gets the value of the scienceScienseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceScienseCode() {
        return scienceScienseCode;
    }

    /**
     * Sets the value of the scienceScienseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceScienseCode(String value) {
        this.scienceScienseCode = value;
    }

    /**
     * Gets the value of the scienceScienseClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceScienseClasifierCode() {
        return scienceScienseClasifierCode;
    }

    /**
     * Sets the value of the scienceScienseClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceScienseClasifierCode(String value) {
        this.scienceScienseClasifierCode = value;
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
     * Gets the value of the scienceScienseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceScienseName() {
        return scienceScienseName;
    }

    /**
     * Sets the value of the scienceScienseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceScienseName(String value) {
        this.scienceScienseName = value;
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
