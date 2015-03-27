
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
 *         &lt;element name="Id_PersonBenefit" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idPersonBenefit",
    "benefitsDocumentSeries",
    "benefitsDocumentNumber",
    "benefitsDocumentIssued"
})
@XmlRootElement(name = "PersonBenefitsEdit")
public class PersonBenefitsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonBenefit")
    protected int idPersonBenefit;
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
