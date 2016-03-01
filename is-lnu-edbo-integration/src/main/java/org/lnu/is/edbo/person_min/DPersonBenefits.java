
package org.lnu.is.edbo.person_min;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonBenefits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonBenefits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonBenefit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Benefit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_BenefitGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_BenefitName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BenefitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenefitsGroupsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonBenefits", propOrder = {
    "idPersonBenefit",
    "idPerson",
    "idBenefit",
    "idBenefitGroup",
    "key",
    "idBenefitName",
    "benefitName",
    "benefitsGroupsName",
    "idLanguage"
})
public class DPersonBenefits {

    @XmlElement(name = "Id_PersonBenefit")
    protected int idPersonBenefit;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Id_Benefit")
    protected int idBenefit;
    @XmlElement(name = "Id_BenefitGroup")
    protected int idBenefitGroup;
    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Id_BenefitName")
    protected int idBenefitName;
    @XmlElement(name = "BenefitName")
    protected String benefitName;
    @XmlElement(name = "BenefitsGroupsName")
    protected String benefitsGroupsName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;

    /**
     * Gets the value of the idPersonBenefit property.
     * 
     */
    public int getIdPersonBenefit() {
        return idPersonBenefit;
    }

    /**
     * Sets the value of the idPersonBenefit property.
     * 
     */
    public void setIdPersonBenefit(int value) {
        this.idPersonBenefit = value;
    }

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the idBenefit property.
     * 
     */
    public int getIdBenefit() {
        return idBenefit;
    }

    /**
     * Sets the value of the idBenefit property.
     * 
     */
    public void setIdBenefit(int value) {
        this.idBenefit = value;
    }

    /**
     * Gets the value of the idBenefitGroup property.
     * 
     */
    public int getIdBenefitGroup() {
        return idBenefitGroup;
    }

    /**
     * Sets the value of the idBenefitGroup property.
     * 
     */
    public void setIdBenefitGroup(int value) {
        this.idBenefitGroup = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the idBenefitName property.
     * 
     */
    public int getIdBenefitName() {
        return idBenefitName;
    }

    /**
     * Sets the value of the idBenefitName property.
     * 
     */
    public void setIdBenefitName(int value) {
        this.idBenefitName = value;
    }

    /**
     * Gets the value of the benefitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitName() {
        return benefitName;
    }

    /**
     * Sets the value of the benefitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitName(String value) {
        this.benefitName = value;
    }

    /**
     * Gets the value of the benefitsGroupsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitsGroupsName() {
        return benefitsGroupsName;
    }

    /**
     * Sets the value of the benefitsGroupsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitsGroupsName(String value) {
        this.benefitsGroupsName = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

}
