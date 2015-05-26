
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityLicenseCertificateType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateDateRishenny" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateDateGive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityAcreditatinType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CertificateDateExpired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Minister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateNumberRishenny" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Ministers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityLicensesOrganisationsRishen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensesOrganisations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_GlobalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GlobalRishen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsProlongation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicenseCertificateProlongationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicenseCertificateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_GlobalRishen_Prolongation" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityKode",
    "idUniversityLicenseCertificateType",
    "universityFullName",
    "certificateSeries",
    "certificateNumber",
    "certificateDateRishenny",
    "certificateOrder",
    "certificateDateGive",
    "idUniversityAcreditatinType",
    "certificateDateExpired",
    "minister",
    "ipn",
    "adress",
    "bank",
    "certificateNumberRishenny",
    "idMinisters",
    "dateOrder",
    "numberOrder",
    "idUniversityLicensesOrganisationsRishen",
    "idUniversityLicensesOrganisations",
    "isRequest",
    "registrationNumber",
    "idGlobalOrders",
    "idGlobalRishen",
    "isProlongation",
    "idUniversityLicenseCertificateProlongationType",
    "universityLicenseCertificateDescription",
    "idGlobalRishenProlongation"
})
@XmlRootElement(name = "UniversityLicenseCertificateAdd")
public class UniversityLicenseCertificateAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_UniversityLicenseCertificateType")
    protected int idUniversityLicenseCertificateType;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "CertificateSeries")
    protected String certificateSeries;
    @XmlElement(name = "CertificateNumber")
    protected String certificateNumber;
    @XmlElement(name = "CertificateDateRishenny")
    protected String certificateDateRishenny;
    @XmlElement(name = "CertificateOrder")
    protected String certificateOrder;
    @XmlElement(name = "CertificateDateGive")
    protected String certificateDateGive;
    @XmlElement(name = "Id_UniversityAcreditatinType")
    protected int idUniversityAcreditatinType;
    @XmlElement(name = "CertificateDateExpired")
    protected String certificateDateExpired;
    @XmlElement(name = "Minister")
    protected String minister;
    @XmlElement(name = "IPN")
    protected String ipn;
    @XmlElement(name = "Adress")
    protected String adress;
    @XmlElement(name = "Bank")
    protected String bank;
    @XmlElement(name = "CertificateNumberRishenny")
    protected String certificateNumberRishenny;
    @XmlElement(name = "Id_Ministers")
    protected int idMinisters;
    @XmlElement(name = "DateOrder")
    protected String dateOrder;
    @XmlElement(name = "NumberOrder")
    protected String numberOrder;
    @XmlElement(name = "Id_UniversityLicensesOrganisationsRishen")
    protected int idUniversityLicensesOrganisationsRishen;
    @XmlElement(name = "Id_UniversityLicensesOrganisations")
    protected int idUniversityLicensesOrganisations;
    @XmlElement(name = "IsRequest")
    protected int isRequest;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "Id_GlobalOrders")
    protected int idGlobalOrders;
    @XmlElement(name = "Id_GlobalRishen")
    protected int idGlobalRishen;
    @XmlElement(name = "IsProlongation")
    protected int isProlongation;
    @XmlElement(name = "Id_UniversityLicenseCertificateProlongationType")
    protected int idUniversityLicenseCertificateProlongationType;
    @XmlElement(name = "UniversityLicenseCertificateDescription")
    protected String universityLicenseCertificateDescription;
    @XmlElement(name = "Id_GlobalRishen_Prolongation")
    protected int idGlobalRishenProlongation;

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
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the idUniversityLicenseCertificateType property.
     * 
     */
    public int getIdUniversityLicenseCertificateType() {
        return idUniversityLicenseCertificateType;
    }

    /**
     * Sets the value of the idUniversityLicenseCertificateType property.
     * 
     */
    public void setIdUniversityLicenseCertificateType(int value) {
        this.idUniversityLicenseCertificateType = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the certificateSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateSeries() {
        return certificateSeries;
    }

    /**
     * Sets the value of the certificateSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateSeries(String value) {
        this.certificateSeries = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the certificateDateRishenny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateDateRishenny() {
        return certificateDateRishenny;
    }

    /**
     * Sets the value of the certificateDateRishenny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateDateRishenny(String value) {
        this.certificateDateRishenny = value;
    }

    /**
     * Gets the value of the certificateOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateOrder() {
        return certificateOrder;
    }

    /**
     * Sets the value of the certificateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateOrder(String value) {
        this.certificateOrder = value;
    }

    /**
     * Gets the value of the certificateDateGive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateDateGive() {
        return certificateDateGive;
    }

    /**
     * Sets the value of the certificateDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateDateGive(String value) {
        this.certificateDateGive = value;
    }

    /**
     * Gets the value of the idUniversityAcreditatinType property.
     * 
     */
    public int getIdUniversityAcreditatinType() {
        return idUniversityAcreditatinType;
    }

    /**
     * Sets the value of the idUniversityAcreditatinType property.
     * 
     */
    public void setIdUniversityAcreditatinType(int value) {
        this.idUniversityAcreditatinType = value;
    }

    /**
     * Gets the value of the certificateDateExpired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateDateExpired() {
        return certificateDateExpired;
    }

    /**
     * Sets the value of the certificateDateExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateDateExpired(String value) {
        this.certificateDateExpired = value;
    }

    /**
     * Gets the value of the minister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinister() {
        return minister;
    }

    /**
     * Sets the value of the minister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinister(String value) {
        this.minister = value;
    }

    /**
     * Gets the value of the ipn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPN() {
        return ipn;
    }

    /**
     * Sets the value of the ipn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPN(String value) {
        this.ipn = value;
    }

    /**
     * Gets the value of the adress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the value of the adress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdress(String value) {
        this.adress = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBank(String value) {
        this.bank = value;
    }

    /**
     * Gets the value of the certificateNumberRishenny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumberRishenny() {
        return certificateNumberRishenny;
    }

    /**
     * Sets the value of the certificateNumberRishenny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumberRishenny(String value) {
        this.certificateNumberRishenny = value;
    }

    /**
     * Gets the value of the idMinisters property.
     * 
     */
    public int getIdMinisters() {
        return idMinisters;
    }

    /**
     * Sets the value of the idMinisters property.
     * 
     */
    public void setIdMinisters(int value) {
        this.idMinisters = value;
    }

    /**
     * Gets the value of the dateOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOrder() {
        return dateOrder;
    }

    /**
     * Sets the value of the dateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOrder(String value) {
        this.dateOrder = value;
    }

    /**
     * Gets the value of the numberOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOrder() {
        return numberOrder;
    }

    /**
     * Sets the value of the numberOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOrder(String value) {
        this.numberOrder = value;
    }

    /**
     * Gets the value of the idUniversityLicensesOrganisationsRishen property.
     * 
     */
    public int getIdUniversityLicensesOrganisationsRishen() {
        return idUniversityLicensesOrganisationsRishen;
    }

    /**
     * Sets the value of the idUniversityLicensesOrganisationsRishen property.
     * 
     */
    public void setIdUniversityLicensesOrganisationsRishen(int value) {
        this.idUniversityLicensesOrganisationsRishen = value;
    }

    /**
     * Gets the value of the idUniversityLicensesOrganisations property.
     * 
     */
    public int getIdUniversityLicensesOrganisations() {
        return idUniversityLicensesOrganisations;
    }

    /**
     * Sets the value of the idUniversityLicensesOrganisations property.
     * 
     */
    public void setIdUniversityLicensesOrganisations(int value) {
        this.idUniversityLicensesOrganisations = value;
    }

    /**
     * Gets the value of the isRequest property.
     * 
     */
    public int getIsRequest() {
        return isRequest;
    }

    /**
     * Sets the value of the isRequest property.
     * 
     */
    public void setIsRequest(int value) {
        this.isRequest = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the idGlobalOrders property.
     * 
     */
    public int getIdGlobalOrders() {
        return idGlobalOrders;
    }

    /**
     * Sets the value of the idGlobalOrders property.
     * 
     */
    public void setIdGlobalOrders(int value) {
        this.idGlobalOrders = value;
    }

    /**
     * Gets the value of the idGlobalRishen property.
     * 
     */
    public int getIdGlobalRishen() {
        return idGlobalRishen;
    }

    /**
     * Sets the value of the idGlobalRishen property.
     * 
     */
    public void setIdGlobalRishen(int value) {
        this.idGlobalRishen = value;
    }

    /**
     * Gets the value of the isProlongation property.
     * 
     */
    public int getIsProlongation() {
        return isProlongation;
    }

    /**
     * Sets the value of the isProlongation property.
     * 
     */
    public void setIsProlongation(int value) {
        this.isProlongation = value;
    }

    /**
     * Gets the value of the idUniversityLicenseCertificateProlongationType property.
     * 
     */
    public int getIdUniversityLicenseCertificateProlongationType() {
        return idUniversityLicenseCertificateProlongationType;
    }

    /**
     * Sets the value of the idUniversityLicenseCertificateProlongationType property.
     * 
     */
    public void setIdUniversityLicenseCertificateProlongationType(int value) {
        this.idUniversityLicenseCertificateProlongationType = value;
    }

    /**
     * Gets the value of the universityLicenseCertificateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseCertificateDescription() {
        return universityLicenseCertificateDescription;
    }

    /**
     * Sets the value of the universityLicenseCertificateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseCertificateDescription(String value) {
        this.universityLicenseCertificateDescription = value;
    }

    /**
     * Gets the value of the idGlobalRishenProlongation property.
     * 
     */
    public int getIdGlobalRishenProlongation() {
        return idGlobalRishenProlongation;
    }

    /**
     * Sets the value of the idGlobalRishenProlongation property.
     * 
     */
    public void setIdGlobalRishenProlongation(int value) {
        this.idGlobalRishenProlongation = value;
    }

}
