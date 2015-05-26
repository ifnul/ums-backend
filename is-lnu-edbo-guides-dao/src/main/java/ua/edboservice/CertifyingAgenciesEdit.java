
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
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CertifyingAgenciesNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertifyingAgenciesNamesInDocuments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertifyingAgenciesIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sort" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idCertifyingAgencies",
    "certifyingAgenciesNames",
    "parentOrganisation",
    "city",
    "countryName",
    "certifyingAgenciesNamesInDocuments",
    "certifyingAgenciesIsActive",
    "dateBegin",
    "dateEnd",
    "sort"
})
@XmlRootElement(name = "CertifyingAgenciesEdit")
public class CertifyingAgenciesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "CertifyingAgenciesNames")
    protected String certifyingAgenciesNames;
    @XmlElement(name = "ParentOrganisation")
    protected String parentOrganisation;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "CertifyingAgenciesNamesInDocuments")
    protected String certifyingAgenciesNamesInDocuments;
    @XmlElement(name = "CertifyingAgenciesIsActive")
    protected int certifyingAgenciesIsActive;
    @XmlElement(name = "DateBegin")
    protected String dateBegin;
    @XmlElement(name = "DateEnd")
    protected String dateEnd;
    @XmlElement(name = "Sort")
    protected int sort;

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
     * Gets the value of the idCertifyingAgencies property.
     * 
     */
    public int getIdCertifyingAgencies() {
        return idCertifyingAgencies;
    }

    /**
     * Sets the value of the idCertifyingAgencies property.
     * 
     */
    public void setIdCertifyingAgencies(int value) {
        this.idCertifyingAgencies = value;
    }

    /**
     * Gets the value of the certifyingAgenciesNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifyingAgenciesNames() {
        return certifyingAgenciesNames;
    }

    /**
     * Sets the value of the certifyingAgenciesNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifyingAgenciesNames(String value) {
        this.certifyingAgenciesNames = value;
    }

    /**
     * Gets the value of the parentOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrganisation() {
        return parentOrganisation;
    }

    /**
     * Sets the value of the parentOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrganisation(String value) {
        this.parentOrganisation = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the certifyingAgenciesNamesInDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifyingAgenciesNamesInDocuments() {
        return certifyingAgenciesNamesInDocuments;
    }

    /**
     * Sets the value of the certifyingAgenciesNamesInDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifyingAgenciesNamesInDocuments(String value) {
        this.certifyingAgenciesNamesInDocuments = value;
    }

    /**
     * Gets the value of the certifyingAgenciesIsActive property.
     * 
     */
    public int getCertifyingAgenciesIsActive() {
        return certifyingAgenciesIsActive;
    }

    /**
     * Sets the value of the certifyingAgenciesIsActive property.
     * 
     */
    public void setCertifyingAgenciesIsActive(int value) {
        this.certifyingAgenciesIsActive = value;
    }

    /**
     * Gets the value of the dateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateBegin() {
        return dateBegin;
    }

    /**
     * Sets the value of the dateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateBegin(String value) {
        this.dateBegin = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEnd(String value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     */
    public int getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     */
    public void setSort(int value) {
        this.sort = value;
    }

}
