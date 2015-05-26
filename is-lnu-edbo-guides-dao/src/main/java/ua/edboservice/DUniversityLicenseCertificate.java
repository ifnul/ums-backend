
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityLicenseCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicenseCertificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicenseCertificate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicenseCertificateType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicenseCertificateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateDateRishenny" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CertificateOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateDateGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UniversityAcreditatinType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiyAcreditatinTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateDateExpired" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Minister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CertificateNumberRishenny" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Ministers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateOrder" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityLicensesOrganisations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensesOrganisationsRishen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesOrganisationsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicensesOrganisationsRishenDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPerepidgotovka" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GlobalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GlobalRishen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsTeacher" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicenseCertificateProlongationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicenseCertificateProlongationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_GlobalRishen_Prolongation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberRishenProlongation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateRishenProlongation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityLicenseCertificateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsProlongation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsImported" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicenseCertificate", propOrder = {
    "idUniversityLicenseCertificate",
    "idUniversityLicenseCertificateType",
    "universityLicenseCertificateTypeName",
    "universityKode",
    "universityFullName",
    "certificateSeries",
    "certificateNumber",
    "certificateDateRishenny",
    "certificateOrder",
    "certificateDateGive",
    "idUniversityAcreditatinType",
    "universitiyAcreditatinTypeCode",
    "certificateDateExpired",
    "minister",
    "ipn",
    "adress",
    "bank",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "certificateNumberRishenny",
    "idMinisters",
    "dateOrder",
    "numberOrder",
    "idUniversityLicensesOrganisations",
    "idUniversityLicensesOrganisationsRishen",
    "universityLicensesOrganisationsName",
    "universityLicensesOrganisationsRishenDisplayName",
    "isRequest",
    "dateLastChange",
    "idUniversity",
    "specDir",
    "registrationNumber",
    "isPerepidgotovka",
    "idGlobalOrders",
    "idGlobalRishen",
    "region",
    "isTeacher",
    "idUniversityLicenseCertificateProlongationType",
    "universityLicenseCertificateProlongationTypeName",
    "idGlobalRishenProlongation",
    "numberRishenProlongation",
    "dateRishenProlongation",
    "universityLicenseCertificateDescription",
    "isProlongation",
    "dateCreate",
    "isImported"
})
public class DUniversityLicenseCertificate {

    @XmlElement(name = "Id_UniversityLicenseCertificate")
    protected int idUniversityLicenseCertificate;
    @XmlElement(name = "Id_UniversityLicenseCertificateType")
    protected int idUniversityLicenseCertificateType;
    @XmlElement(name = "UniversityLicenseCertificateTypeName")
    protected String universityLicenseCertificateTypeName;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "CertificateSeries")
    protected String certificateSeries;
    @XmlElement(name = "CertificateNumber")
    protected String certificateNumber;
    @XmlElement(name = "CertificateDateRishenny", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar certificateDateRishenny;
    @XmlElement(name = "CertificateOrder")
    protected String certificateOrder;
    @XmlElement(name = "CertificateDateGive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar certificateDateGive;
    @XmlElement(name = "Id_UniversityAcreditatinType")
    protected int idUniversityAcreditatinType;
    @XmlElement(name = "UniversitiyAcreditatinTypeCode")
    protected String universitiyAcreditatinTypeCode;
    @XmlElement(name = "CertificateDateExpired", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar certificateDateExpired;
    @XmlElement(name = "Minister")
    protected String minister;
    @XmlElement(name = "IPN")
    protected String ipn;
    @XmlElement(name = "Adress")
    protected String adress;
    @XmlElement(name = "Bank")
    protected String bank;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "IsVerified")
    protected int isVerified;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistoryType")
    protected int idRegulationDocumentVerificationHistoryType;
    @XmlElement(name = "RegulationDocumentVerificationHistoryTypeName")
    protected String regulationDocumentVerificationHistoryTypeName;
    @XmlElement(name = "IsExistFile")
    protected int isExistFile;
    @XmlElement(name = "CertificateNumberRishenny")
    protected String certificateNumberRishenny;
    @XmlElement(name = "Id_Ministers")
    protected int idMinisters;
    @XmlElement(name = "DateOrder", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOrder;
    @XmlElement(name = "NumberOrder")
    protected String numberOrder;
    @XmlElement(name = "Id_UniversityLicensesOrganisations")
    protected int idUniversityLicensesOrganisations;
    @XmlElement(name = "Id_UniversityLicensesOrganisationsRishen")
    protected int idUniversityLicensesOrganisationsRishen;
    @XmlElement(name = "UniversityLicensesOrganisationsName")
    protected String universityLicensesOrganisationsName;
    @XmlElement(name = "UniversityLicensesOrganisationsRishenDisplayName")
    protected String universityLicensesOrganisationsRishenDisplayName;
    @XmlElement(name = "IsRequest")
    protected int isRequest;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "SpecDir")
    protected String specDir;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "IsPerepidgotovka")
    protected int isPerepidgotovka;
    @XmlElement(name = "Id_GlobalOrders")
    protected int idGlobalOrders;
    @XmlElement(name = "Id_GlobalRishen")
    protected int idGlobalRishen;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "IsTeacher")
    protected int isTeacher;
    @XmlElement(name = "Id_UniversityLicenseCertificateProlongationType")
    protected int idUniversityLicenseCertificateProlongationType;
    @XmlElement(name = "UniversityLicenseCertificateProlongationTypeName")
    protected String universityLicenseCertificateProlongationTypeName;
    @XmlElement(name = "Id_GlobalRishen_Prolongation")
    protected int idGlobalRishenProlongation;
    @XmlElement(name = "NumberRishenProlongation")
    protected String numberRishenProlongation;
    @XmlElement(name = "DateRishenProlongation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRishenProlongation;
    @XmlElement(name = "UniversityLicenseCertificateDescription")
    protected String universityLicenseCertificateDescription;
    @XmlElement(name = "IsProlongation")
    protected int isProlongation;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "IsImported")
    protected int isImported;

    /**
     * Gets the value of the idUniversityLicenseCertificate property.
     * 
     */
    public int getIdUniversityLicenseCertificate() {
        return idUniversityLicenseCertificate;
    }

    /**
     * Sets the value of the idUniversityLicenseCertificate property.
     * 
     */
    public void setIdUniversityLicenseCertificate(int value) {
        this.idUniversityLicenseCertificate = value;
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
     * Gets the value of the universityLicenseCertificateTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseCertificateTypeName() {
        return universityLicenseCertificateTypeName;
    }

    /**
     * Sets the value of the universityLicenseCertificateTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseCertificateTypeName(String value) {
        this.universityLicenseCertificateTypeName = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateDateRishenny() {
        return certificateDateRishenny;
    }

    /**
     * Sets the value of the certificateDateRishenny property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateDateRishenny(XMLGregorianCalendar value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateDateGive() {
        return certificateDateGive;
    }

    /**
     * Sets the value of the certificateDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateDateGive(XMLGregorianCalendar value) {
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
     * Gets the value of the universitiyAcreditatinTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiyAcreditatinTypeCode() {
        return universitiyAcreditatinTypeCode;
    }

    /**
     * Sets the value of the universitiyAcreditatinTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiyAcreditatinTypeCode(String value) {
        this.universitiyAcreditatinTypeCode = value;
    }

    /**
     * Gets the value of the certificateDateExpired property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateDateExpired() {
        return certificateDateExpired;
    }

    /**
     * Sets the value of the certificateDateExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateDateExpired(XMLGregorianCalendar value) {
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
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the isVerified property.
     * 
     */
    public int getIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     */
    public void setIsVerified(int value) {
        this.isVerified = value;
    }

    /**
     * Gets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public int getIdRegulationDocumentVerificationHistoryType() {
        return idRegulationDocumentVerificationHistoryType;
    }

    /**
     * Sets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public void setIdRegulationDocumentVerificationHistoryType(int value) {
        this.idRegulationDocumentVerificationHistoryType = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryTypeName() {
        return regulationDocumentVerificationHistoryTypeName;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryTypeName(String value) {
        this.regulationDocumentVerificationHistoryTypeName = value;
    }

    /**
     * Gets the value of the isExistFile property.
     * 
     */
    public int getIsExistFile() {
        return isExistFile;
    }

    /**
     * Sets the value of the isExistFile property.
     * 
     */
    public void setIsExistFile(int value) {
        this.isExistFile = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOrder() {
        return dateOrder;
    }

    /**
     * Sets the value of the dateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOrder(XMLGregorianCalendar value) {
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
     * Gets the value of the universityLicensesOrganisationsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesOrganisationsName() {
        return universityLicensesOrganisationsName;
    }

    /**
     * Sets the value of the universityLicensesOrganisationsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesOrganisationsName(String value) {
        this.universityLicensesOrganisationsName = value;
    }

    /**
     * Gets the value of the universityLicensesOrganisationsRishenDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesOrganisationsRishenDisplayName() {
        return universityLicensesOrganisationsRishenDisplayName;
    }

    /**
     * Sets the value of the universityLicensesOrganisationsRishenDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesOrganisationsRishenDisplayName(String value) {
        this.universityLicensesOrganisationsRishenDisplayName = value;
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
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

    /**
     * Gets the value of the specDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDir() {
        return specDir;
    }

    /**
     * Sets the value of the specDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDir(String value) {
        this.specDir = value;
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
     * Gets the value of the isPerepidgotovka property.
     * 
     */
    public int getIsPerepidgotovka() {
        return isPerepidgotovka;
    }

    /**
     * Sets the value of the isPerepidgotovka property.
     * 
     */
    public void setIsPerepidgotovka(int value) {
        this.isPerepidgotovka = value;
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
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the isTeacher property.
     * 
     */
    public int getIsTeacher() {
        return isTeacher;
    }

    /**
     * Sets the value of the isTeacher property.
     * 
     */
    public void setIsTeacher(int value) {
        this.isTeacher = value;
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
     * Gets the value of the universityLicenseCertificateProlongationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseCertificateProlongationTypeName() {
        return universityLicenseCertificateProlongationTypeName;
    }

    /**
     * Sets the value of the universityLicenseCertificateProlongationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseCertificateProlongationTypeName(String value) {
        this.universityLicenseCertificateProlongationTypeName = value;
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

    /**
     * Gets the value of the numberRishenProlongation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRishenProlongation() {
        return numberRishenProlongation;
    }

    /**
     * Sets the value of the numberRishenProlongation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRishenProlongation(String value) {
        this.numberRishenProlongation = value;
    }

    /**
     * Gets the value of the dateRishenProlongation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRishenProlongation() {
        return dateRishenProlongation;
    }

    /**
     * Sets the value of the dateRishenProlongation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRishenProlongation(XMLGregorianCalendar value) {
        this.dateRishenProlongation = value;
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
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the isImported property.
     * 
     */
    public int getIsImported() {
        return isImported;
    }

    /**
     * Sets the value of the isImported property.
     * 
     */
    public void setIsImported(int value) {
        this.isImported = value;
    }

}
