
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonRequestQuotas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestQuotas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestQuotas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitySpecialitiesQuota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChangePersonRequestQuotas" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesQuotaPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesQuotaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChangeUniversitySpecialitiesQuota" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversitySpecialitiesQuotaValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_Quota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuotaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuotaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestQuotas", propOrder = {
    "idPersonRequestQuotas",
    "idPersonRequest",
    "idUniversitySpecialitiesQuota",
    "dateLastChangePersonRequestQuotas",
    "universitySpecialitiesKode",
    "universitySpecialitiesQuotaPriority",
    "universitySpecialitiesQuotaDescription",
    "dateLastChangeUniversitySpecialitiesQuota",
    "universitySpecialitiesQuotaValue",
    "idQuota",
    "quotaName",
    "quotaDescription"
})
public class DPersonRequestQuotas {

    @XmlElement(name = "Id_PersonRequestQuotas")
    protected int idPersonRequestQuotas;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_UniversitySpecialitiesQuota")
    protected int idUniversitySpecialitiesQuota;
    @XmlElement(name = "DateLastChangePersonRequestQuotas", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChangePersonRequestQuotas;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "UniversitySpecialitiesQuotaPriority")
    protected int universitySpecialitiesQuotaPriority;
    @XmlElement(name = "UniversitySpecialitiesQuotaDescription")
    protected String universitySpecialitiesQuotaDescription;
    @XmlElement(name = "DateLastChangeUniversitySpecialitiesQuota", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChangeUniversitySpecialitiesQuota;
    @XmlElement(name = "UniversitySpecialitiesQuotaValue", required = true)
    protected BigDecimal universitySpecialitiesQuotaValue;
    @XmlElement(name = "Id_Quota")
    protected int idQuota;
    @XmlElement(name = "QuotaName")
    protected String quotaName;
    @XmlElement(name = "QuotaDescription")
    protected String quotaDescription;

    /**
     * Gets the value of the idPersonRequestQuotas property.
     * 
     */
    public int getIdPersonRequestQuotas() {
        return idPersonRequestQuotas;
    }

    /**
     * Sets the value of the idPersonRequestQuotas property.
     * 
     */
    public void setIdPersonRequestQuotas(int value) {
        this.idPersonRequestQuotas = value;
    }

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the idUniversitySpecialitiesQuota property.
     * 
     */
    public int getIdUniversitySpecialitiesQuota() {
        return idUniversitySpecialitiesQuota;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesQuota property.
     * 
     */
    public void setIdUniversitySpecialitiesQuota(int value) {
        this.idUniversitySpecialitiesQuota = value;
    }

    /**
     * Gets the value of the dateLastChangePersonRequestQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChangePersonRequestQuotas() {
        return dateLastChangePersonRequestQuotas;
    }

    /**
     * Sets the value of the dateLastChangePersonRequestQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChangePersonRequestQuotas(XMLGregorianCalendar value) {
        this.dateLastChangePersonRequestQuotas = value;
    }

    /**
     * Gets the value of the universitySpecialitiesKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKode() {
        return universitySpecialitiesKode;
    }

    /**
     * Sets the value of the universitySpecialitiesKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKode(String value) {
        this.universitySpecialitiesKode = value;
    }

    /**
     * Gets the value of the universitySpecialitiesQuotaPriority property.
     * 
     */
    public int getUniversitySpecialitiesQuotaPriority() {
        return universitySpecialitiesQuotaPriority;
    }

    /**
     * Sets the value of the universitySpecialitiesQuotaPriority property.
     * 
     */
    public void setUniversitySpecialitiesQuotaPriority(int value) {
        this.universitySpecialitiesQuotaPriority = value;
    }

    /**
     * Gets the value of the universitySpecialitiesQuotaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesQuotaDescription() {
        return universitySpecialitiesQuotaDescription;
    }

    /**
     * Sets the value of the universitySpecialitiesQuotaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesQuotaDescription(String value) {
        this.universitySpecialitiesQuotaDescription = value;
    }

    /**
     * Gets the value of the dateLastChangeUniversitySpecialitiesQuota property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChangeUniversitySpecialitiesQuota() {
        return dateLastChangeUniversitySpecialitiesQuota;
    }

    /**
     * Sets the value of the dateLastChangeUniversitySpecialitiesQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChangeUniversitySpecialitiesQuota(XMLGregorianCalendar value) {
        this.dateLastChangeUniversitySpecialitiesQuota = value;
    }

    /**
     * Gets the value of the universitySpecialitiesQuotaValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUniversitySpecialitiesQuotaValue() {
        return universitySpecialitiesQuotaValue;
    }

    /**
     * Sets the value of the universitySpecialitiesQuotaValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUniversitySpecialitiesQuotaValue(BigDecimal value) {
        this.universitySpecialitiesQuotaValue = value;
    }

    /**
     * Gets the value of the idQuota property.
     * 
     */
    public int getIdQuota() {
        return idQuota;
    }

    /**
     * Sets the value of the idQuota property.
     * 
     */
    public void setIdQuota(int value) {
        this.idQuota = value;
    }

    /**
     * Gets the value of the quotaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaName() {
        return quotaName;
    }

    /**
     * Sets the value of the quotaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaName(String value) {
        this.quotaName = value;
    }

    /**
     * Gets the value of the quotaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaDescription() {
        return quotaDescription;
    }

    /**
     * Sets the value of the quotaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaDescription(String value) {
        this.quotaDescription = value;
    }

}
