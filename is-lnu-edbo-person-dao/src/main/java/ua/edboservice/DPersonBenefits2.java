
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonBenefits2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonBenefits2">
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
 *         &lt;element name="BenefitsDocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenefitsDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenefitsDocumentIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonBenefits2", propOrder = {
    "idPersonBenefit",
    "idPerson",
    "idBenefit",
    "idBenefitGroup",
    "key",
    "idBenefitName",
    "benefitName",
    "benefitsGroupsName",
    "idLanguage",
    "benefitsDocumentSeries",
    "benefitsDocumentNumber",
    "benefitsDocumentIssued"
})
public class DPersonBenefits2 {

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
    @XmlElement(name = "BenefitsDocumentSeries")
    protected String benefitsDocumentSeries;
    @XmlElement(name = "BenefitsDocumentNumber")
    protected String benefitsDocumentNumber;
    @XmlElement(name = "BenefitsDocumentIssued")
    protected String benefitsDocumentIssued;

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

    /**
     * Gets the value of the benefitsDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitsDocumentSeries() {
        return benefitsDocumentSeries;
    }

    /**
     * Sets the value of the benefitsDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitsDocumentSeries(String value) {
        this.benefitsDocumentSeries = value;
    }

    /**
     * Gets the value of the benefitsDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitsDocumentNumber() {
        return benefitsDocumentNumber;
    }

    /**
     * Sets the value of the benefitsDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitsDocumentNumber(String value) {
        this.benefitsDocumentNumber = value;
    }

    /**
     * Gets the value of the benefitsDocumentIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitsDocumentIssued() {
        return benefitsDocumentIssued;
    }

    /**
     * Sets the value of the benefitsDocumentIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitsDocumentIssued(String value) {
        this.benefitsDocumentIssued = value;
    }

}
