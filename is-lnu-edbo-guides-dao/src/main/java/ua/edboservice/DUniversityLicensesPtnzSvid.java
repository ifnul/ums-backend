
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityLicensesPtnzSvid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesPtnzSvid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicensePtnzSvid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicensePtnzSvidSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicensePtnzSvidNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicensePtnzSvidDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicensePtnzSvidDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityLicensePtnzSvidDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityLicensePtnzSvidIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesPtnzSvidActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityLicensesSubTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityLicensesOrganisations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesOrganisationsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateRishen" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberRishen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOrder" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityLicensesOrganisationsRishen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesOrganisationsRishenDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Ministers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinistersSmallFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseDateExpired" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerifyStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VerifyStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsVerify" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_GlobalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GlobalRishen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dUniversityLicensesPtnzSvid", propOrder = {
    "idUniversityLicensePtnzSvid",
    "universityKode",
    "universityLicensePtnzSvidSeries",
    "universityLicensePtnzSvidNumber",
    "universityLicensePtnzSvidDecision",
    "universityLicensePtnzSvidDateGet",
    "universityLicensePtnzSvidDateLastChange",
    "universityLicensePtnzSvidIsActive",
    "universityLicensesPtnzSvidActivities",
    "idUniversityLicensesSubTypes",
    "idUniversityLicensesOrganisations",
    "universityLicensesOrganisationsName",
    "dateRishen",
    "numberRishen",
    "dateOrder",
    "numberOrder",
    "idUniversityLicensesOrganisationsRishen",
    "universityLicensesOrganisationsRishenDisplayName",
    "isRequest",
    "idMinisters",
    "ministersSmallFIO",
    "ipn",
    "universityLicenseDateExpired",
    "universityFullName",
    "adress",
    "verifyStatus",
    "verifyStatusName",
    "isVerify",
    "idRegulationDocument",
    "isExistFile",
    "idUniversity",
    "registrationNumber",
    "registrationNumbers",
    "idGlobalOrders",
    "idGlobalRishen",
    "region",
    "dateCreate",
    "isImported"
})
public class DUniversityLicensesPtnzSvid {

    @XmlElement(name = "Id_UniversityLicensePtnzSvid")
    protected int idUniversityLicensePtnzSvid;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityLicensePtnzSvidSeries")
    protected String universityLicensePtnzSvidSeries;
    @XmlElement(name = "UniversityLicensePtnzSvidNumber")
    protected String universityLicensePtnzSvidNumber;
    @XmlElement(name = "UniversityLicensePtnzSvidDecision")
    protected String universityLicensePtnzSvidDecision;
    @XmlElement(name = "UniversityLicensePtnzSvidDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicensePtnzSvidDateGet;
    @XmlElement(name = "UniversityLicensePtnzSvidDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicensePtnzSvidDateLastChange;
    @XmlElement(name = "UniversityLicensePtnzSvidIsActive")
    protected int universityLicensePtnzSvidIsActive;
    @XmlElement(name = "UniversityLicensesPtnzSvidActivities")
    protected String universityLicensesPtnzSvidActivities;
    @XmlElement(name = "Id_UniversityLicensesSubTypes")
    protected String idUniversityLicensesSubTypes;
    @XmlElement(name = "Id_UniversityLicensesOrganisations")
    protected int idUniversityLicensesOrganisations;
    @XmlElement(name = "UniversityLicensesOrganisationsName")
    protected String universityLicensesOrganisationsName;
    @XmlElement(name = "DateRishen", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRishen;
    @XmlElement(name = "NumberRishen")
    protected String numberRishen;
    @XmlElement(name = "DateOrder", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOrder;
    @XmlElement(name = "NumberOrder")
    protected String numberOrder;
    @XmlElement(name = "Id_UniversityLicensesOrganisationsRishen")
    protected int idUniversityLicensesOrganisationsRishen;
    @XmlElement(name = "UniversityLicensesOrganisationsRishenDisplayName")
    protected String universityLicensesOrganisationsRishenDisplayName;
    @XmlElement(name = "IsRequest")
    protected int isRequest;
    @XmlElement(name = "Id_Ministers")
    protected int idMinisters;
    @XmlElement(name = "MinistersSmallFIO")
    protected String ministersSmallFIO;
    @XmlElement(name = "IPN")
    protected String ipn;
    @XmlElement(name = "UniversityLicenseDateExpired", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicenseDateExpired;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Adress")
    protected String adress;
    @XmlElement(name = "VerifyStatus")
    protected int verifyStatus;
    @XmlElement(name = "VerifyStatusName")
    protected String verifyStatusName;
    @XmlElement(name = "IsVerify")
    protected int isVerify;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "IsExistFile")
    protected int isExistFile;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "RegistrationNumbers")
    protected String registrationNumbers;
    @XmlElement(name = "Id_GlobalOrders")
    protected int idGlobalOrders;
    @XmlElement(name = "Id_GlobalRishen")
    protected int idGlobalRishen;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "IsImported")
    protected int isImported;

    /**
     * Gets the value of the idUniversityLicensePtnzSvid property.
     * 
     */
    public int getIdUniversityLicensePtnzSvid() {
        return idUniversityLicensePtnzSvid;
    }

    /**
     * Sets the value of the idUniversityLicensePtnzSvid property.
     * 
     */
    public void setIdUniversityLicensePtnzSvid(int value) {
        this.idUniversityLicensePtnzSvid = value;
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
     * Gets the value of the universityLicensePtnzSvidSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensePtnzSvidSeries() {
        return universityLicensePtnzSvidSeries;
    }

    /**
     * Sets the value of the universityLicensePtnzSvidSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensePtnzSvidSeries(String value) {
        this.universityLicensePtnzSvidSeries = value;
    }

    /**
     * Gets the value of the universityLicensePtnzSvidNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensePtnzSvidNumber() {
        return universityLicensePtnzSvidNumber;
    }

    /**
     * Sets the value of the universityLicensePtnzSvidNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensePtnzSvidNumber(String value) {
        this.universityLicensePtnzSvidNumber = value;
    }

    /**
     * Gets the value of the universityLicensePtnzSvidDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensePtnzSvidDecision() {
        return universityLicensePtnzSvidDecision;
    }

    /**
     * Sets the value of the universityLicensePtnzSvidDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensePtnzSvidDecision(String value) {
        this.universityLicensePtnzSvidDecision = value;
    }

    /**
     * Gets the value of the universityLicensePtnzSvidDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicensePtnzSvidDateGet() {
        return universityLicensePtnzSvidDateGet;
    }

    /**
     * Sets the value of the universityLicensePtnzSvidDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicensePtnzSvidDateGet(XMLGregorianCalendar value) {
        this.universityLicensePtnzSvidDateGet = value;
    }

    /**
     * Gets the value of the universityLicensePtnzSvidDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicensePtnzSvidDateLastChange() {
        return universityLicensePtnzSvidDateLastChange;
    }

    /**
     * Sets the value of the universityLicensePtnzSvidDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicensePtnzSvidDateLastChange(XMLGregorianCalendar value) {
        this.universityLicensePtnzSvidDateLastChange = value;
    }

    /**
     * Gets the value of the universityLicensePtnzSvidIsActive property.
     * 
     */
    public int getUniversityLicensePtnzSvidIsActive() {
        return universityLicensePtnzSvidIsActive;
    }

    /**
     * Sets the value of the universityLicensePtnzSvidIsActive property.
     * 
     */
    public void setUniversityLicensePtnzSvidIsActive(int value) {
        this.universityLicensePtnzSvidIsActive = value;
    }

    /**
     * Gets the value of the universityLicensesPtnzSvidActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesPtnzSvidActivities() {
        return universityLicensesPtnzSvidActivities;
    }

    /**
     * Sets the value of the universityLicensesPtnzSvidActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesPtnzSvidActivities(String value) {
        this.universityLicensesPtnzSvidActivities = value;
    }

    /**
     * Gets the value of the idUniversityLicensesSubTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUniversityLicensesSubTypes() {
        return idUniversityLicensesSubTypes;
    }

    /**
     * Sets the value of the idUniversityLicensesSubTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUniversityLicensesSubTypes(String value) {
        this.idUniversityLicensesSubTypes = value;
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
     * Gets the value of the dateRishen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRishen() {
        return dateRishen;
    }

    /**
     * Sets the value of the dateRishen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRishen(XMLGregorianCalendar value) {
        this.dateRishen = value;
    }

    /**
     * Gets the value of the numberRishen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRishen() {
        return numberRishen;
    }

    /**
     * Sets the value of the numberRishen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRishen(String value) {
        this.numberRishen = value;
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
     * Gets the value of the ministersSmallFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinistersSmallFIO() {
        return ministersSmallFIO;
    }

    /**
     * Sets the value of the ministersSmallFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinistersSmallFIO(String value) {
        this.ministersSmallFIO = value;
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
     * Gets the value of the universityLicenseDateExpired property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicenseDateExpired() {
        return universityLicenseDateExpired;
    }

    /**
     * Sets the value of the universityLicenseDateExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicenseDateExpired(XMLGregorianCalendar value) {
        this.universityLicenseDateExpired = value;
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
     * Gets the value of the verifyStatus property.
     * 
     */
    public int getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * Sets the value of the verifyStatus property.
     * 
     */
    public void setVerifyStatus(int value) {
        this.verifyStatus = value;
    }

    /**
     * Gets the value of the verifyStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyStatusName() {
        return verifyStatusName;
    }

    /**
     * Sets the value of the verifyStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyStatusName(String value) {
        this.verifyStatusName = value;
    }

    /**
     * Gets the value of the isVerify property.
     * 
     */
    public int getIsVerify() {
        return isVerify;
    }

    /**
     * Sets the value of the isVerify property.
     * 
     */
    public void setIsVerify(int value) {
        this.isVerify = value;
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
     * Gets the value of the registrationNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumbers() {
        return registrationNumbers;
    }

    /**
     * Sets the value of the registrationNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumbers(String value) {
        this.registrationNumbers = value;
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
