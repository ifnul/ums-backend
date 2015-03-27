
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
 *         &lt;element name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Benefit" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "actualDate",
    "idLanguage",
    "idPerson",
    "idBenefit",
    "benefitsDocumentSeries",
    "benefitsDocumentNumber",
    "benefitsDocumentIssued"
})
@XmlRootElement(name = "PersonBenefitsAdd2")
public class PersonBenefitsAdd2 {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "ActualDate")
    protected String actualDate;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Id_Benefit")
    protected int idBenefit;
    @XmlElement(name = "BenefitsDocumentSeries")
    protected String benefitsDocumentSeries;
    @XmlElement(name = "BenefitsDocumentNumber")
    protected String benefitsDocumentNumber;
    @XmlElement(name = "BenefitsDocumentIssued")
    protected String benefitsDocumentIssued;

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
     * Gets the value of the actualDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualDate() {
        return actualDate;
    }

    /**
     * Sets the value of the actualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDate(String value) {
        this.actualDate = value;
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
