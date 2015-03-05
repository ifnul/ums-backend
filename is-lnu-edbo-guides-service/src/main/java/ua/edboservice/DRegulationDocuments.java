
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dRegulationDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentFormat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegulationDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentAuthor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingPosition1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingFIO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingPosition2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingFIO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSignPosition3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingFIO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSignPosition4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingFIO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegulationDocumentDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegulationDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentDateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocumentRekvisites" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegDocRekInputNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekDateRegistration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekSuprovodNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegDocRekSendNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekDateSend" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekVozvrat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegDocRekDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserRekvizit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO_rec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Login_rec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekDateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekDateRecive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekPaperCopy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CertificatesGiveToUser" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocuments", propOrder = {
    "idRegulationDocument",
    "idRegulationDocumentType",
    "idRegulationDocumentFormat",
    "regulationDocumentName",
    "regulationDocumentData",
    "regulationDocumentNumber",
    "regulationDocumentAuthor",
    "regulationDocumentSingPosition1",
    "regulationDocumentSingFIO1",
    "regulationDocumentSingPosition2",
    "regulationDocumentSingFIO2",
    "regulationDocumentSignPosition3",
    "regulationDocumentSingFIO3",
    "regulationDocumentSignPosition4",
    "regulationDocumentSingFIO4",
    "regulationDocumentDateLastChange",
    "universityKode",
    "regulationDocumentDateBegin",
    "regulationDocumentDateEnd",
    "regulationDocumentTypeName",
    "idRegulationDocumentVerificationHistory",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "fio",
    "userMobilePhone",
    "userWorkPhone",
    "email",
    "isExistFile",
    "regulationDocumentDateCreate",
    "regulationDocumentVerificationHistoryDateLastChange",
    "idUniversity",
    "universityFullName",
    "idRegulationDocumentRekvisites",
    "regDocRekInputNumber",
    "regDocRekDateRegistration",
    "regDocRekSuprovodNumber",
    "regDocRekPages",
    "regDocRekSendNumber",
    "regDocRekDateSend",
    "regDocRekVozvrat",
    "regDocRekDescription",
    "idUserRekvizit",
    "fioRec",
    "loginRec",
    "regDocRekDateCreate",
    "regDocRekDateLastChange",
    "regDocRekDateRecive",
    "regDocRekPaperCopy",
    "certificatesGiveToUser"
})
public class DRegulationDocuments {

    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "Id_RegulationDocumentType")
    protected int idRegulationDocumentType;
    @XmlElement(name = "Id_RegulationDocumentFormat")
    protected int idRegulationDocumentFormat;
    @XmlElement(name = "RegulationDocumentName")
    protected String regulationDocumentName;
    @XmlElement(name = "RegulationDocumentData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentData;
    @XmlElement(name = "RegulationDocumentNumber")
    protected String regulationDocumentNumber;
    @XmlElement(name = "RegulationDocumentAuthor")
    protected String regulationDocumentAuthor;
    @XmlElement(name = "RegulationDocumentSingPosition1")
    protected String regulationDocumentSingPosition1;
    @XmlElement(name = "RegulationDocumentSingFIO1")
    protected String regulationDocumentSingFIO1;
    @XmlElement(name = "RegulationDocumentSingPosition2")
    protected String regulationDocumentSingPosition2;
    @XmlElement(name = "RegulationDocumentSingFIO2")
    protected String regulationDocumentSingFIO2;
    @XmlElement(name = "RegulationDocumentSignPosition3")
    protected String regulationDocumentSignPosition3;
    @XmlElement(name = "RegulationDocumentSingFIO3")
    protected String regulationDocumentSingFIO3;
    @XmlElement(name = "RegulationDocumentSignPosition4")
    protected String regulationDocumentSignPosition4;
    @XmlElement(name = "RegulationDocumentSingFIO4")
    protected String regulationDocumentSingFIO4;
    @XmlElement(name = "RegulationDocumentDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentDateLastChange;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "RegulationDocumentDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentDateBegin;
    @XmlElement(name = "RegulationDocumentDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentDateEnd;
    @XmlElement(name = "RegulationDocumentTypeName")
    protected String regulationDocumentTypeName;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistory")
    protected int idRegulationDocumentVerificationHistory;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistoryType")
    protected int idRegulationDocumentVerificationHistoryType;
    @XmlElement(name = "RegulationDocumentVerificationHistoryTypeName")
    protected String regulationDocumentVerificationHistoryTypeName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "UserMobilePhone")
    protected String userMobilePhone;
    @XmlElement(name = "UserWorkPhone")
    protected String userWorkPhone;
    protected String email;
    @XmlElement(name = "IsExistFile")
    protected int isExistFile;
    @XmlElement(name = "RegulationDocumentDateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentDateCreate;
    @XmlElement(name = "RegulationDocumentVerificationHistoryDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentVerificationHistoryDateLastChange;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Id_RegulationDocumentRekvisites")
    protected int idRegulationDocumentRekvisites;
    @XmlElement(name = "RegDocRekInputNumber")
    protected String regDocRekInputNumber;
    @XmlElement(name = "RegDocRekDateRegistration", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateRegistration;
    @XmlElement(name = "RegDocRekSuprovodNumber")
    protected String regDocRekSuprovodNumber;
    @XmlElement(name = "RegDocRekPages")
    protected int regDocRekPages;
    @XmlElement(name = "RegDocRekSendNumber")
    protected String regDocRekSendNumber;
    @XmlElement(name = "RegDocRekDateSend", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateSend;
    @XmlElement(name = "RegDocRekVozvrat")
    protected int regDocRekVozvrat;
    @XmlElement(name = "RegDocRekDescription")
    protected String regDocRekDescription;
    @XmlElement(name = "Id_UserRekvizit")
    protected int idUserRekvizit;
    @XmlElement(name = "FIO_rec")
    protected String fioRec;
    @XmlElement(name = "Login_rec")
    protected String loginRec;
    @XmlElement(name = "RegDocRekDateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateCreate;
    @XmlElement(name = "RegDocRekDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateLastChange;
    @XmlElement(name = "RegDocRekDateRecive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateRecive;
    @XmlElement(name = "RegDocRekPaperCopy")
    protected int regDocRekPaperCopy;
    @XmlElement(name = "CertificatesGiveToUser")
    protected int certificatesGiveToUser;

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
     * Gets the value of the idRegulationDocumentType property.
     * 
     */
    public int getIdRegulationDocumentType() {
        return idRegulationDocumentType;
    }

    /**
     * Sets the value of the idRegulationDocumentType property.
     * 
     */
    public void setIdRegulationDocumentType(int value) {
        this.idRegulationDocumentType = value;
    }

    /**
     * Gets the value of the idRegulationDocumentFormat property.
     * 
     */
    public int getIdRegulationDocumentFormat() {
        return idRegulationDocumentFormat;
    }

    /**
     * Sets the value of the idRegulationDocumentFormat property.
     * 
     */
    public void setIdRegulationDocumentFormat(int value) {
        this.idRegulationDocumentFormat = value;
    }

    /**
     * Gets the value of the regulationDocumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentName() {
        return regulationDocumentName;
    }

    /**
     * Sets the value of the regulationDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentName(String value) {
        this.regulationDocumentName = value;
    }

    /**
     * Gets the value of the regulationDocumentData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentData() {
        return regulationDocumentData;
    }

    /**
     * Sets the value of the regulationDocumentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentData(XMLGregorianCalendar value) {
        this.regulationDocumentData = value;
    }

    /**
     * Gets the value of the regulationDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentNumber() {
        return regulationDocumentNumber;
    }

    /**
     * Sets the value of the regulationDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentNumber(String value) {
        this.regulationDocumentNumber = value;
    }

    /**
     * Gets the value of the regulationDocumentAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentAuthor() {
        return regulationDocumentAuthor;
    }

    /**
     * Sets the value of the regulationDocumentAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentAuthor(String value) {
        this.regulationDocumentAuthor = value;
    }

    /**
     * Gets the value of the regulationDocumentSingPosition1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingPosition1() {
        return regulationDocumentSingPosition1;
    }

    /**
     * Sets the value of the regulationDocumentSingPosition1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingPosition1(String value) {
        this.regulationDocumentSingPosition1 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingFIO1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingFIO1() {
        return regulationDocumentSingFIO1;
    }

    /**
     * Sets the value of the regulationDocumentSingFIO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingFIO1(String value) {
        this.regulationDocumentSingFIO1 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingPosition2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingPosition2() {
        return regulationDocumentSingPosition2;
    }

    /**
     * Sets the value of the regulationDocumentSingPosition2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingPosition2(String value) {
        this.regulationDocumentSingPosition2 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingFIO2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingFIO2() {
        return regulationDocumentSingFIO2;
    }

    /**
     * Sets the value of the regulationDocumentSingFIO2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingFIO2(String value) {
        this.regulationDocumentSingFIO2 = value;
    }

    /**
     * Gets the value of the regulationDocumentSignPosition3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSignPosition3() {
        return regulationDocumentSignPosition3;
    }

    /**
     * Sets the value of the regulationDocumentSignPosition3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSignPosition3(String value) {
        this.regulationDocumentSignPosition3 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingFIO3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingFIO3() {
        return regulationDocumentSingFIO3;
    }

    /**
     * Sets the value of the regulationDocumentSingFIO3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingFIO3(String value) {
        this.regulationDocumentSingFIO3 = value;
    }

    /**
     * Gets the value of the regulationDocumentSignPosition4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSignPosition4() {
        return regulationDocumentSignPosition4;
    }

    /**
     * Sets the value of the regulationDocumentSignPosition4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSignPosition4(String value) {
        this.regulationDocumentSignPosition4 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingFIO4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingFIO4() {
        return regulationDocumentSingFIO4;
    }

    /**
     * Sets the value of the regulationDocumentSingFIO4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingFIO4(String value) {
        this.regulationDocumentSingFIO4 = value;
    }

    /**
     * Gets the value of the regulationDocumentDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentDateLastChange() {
        return regulationDocumentDateLastChange;
    }

    /**
     * Sets the value of the regulationDocumentDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentDateLastChange(XMLGregorianCalendar value) {
        this.regulationDocumentDateLastChange = value;
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
     * Gets the value of the regulationDocumentDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentDateBegin() {
        return regulationDocumentDateBegin;
    }

    /**
     * Sets the value of the regulationDocumentDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentDateBegin(XMLGregorianCalendar value) {
        this.regulationDocumentDateBegin = value;
    }

    /**
     * Gets the value of the regulationDocumentDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentDateEnd() {
        return regulationDocumentDateEnd;
    }

    /**
     * Sets the value of the regulationDocumentDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentDateEnd(XMLGregorianCalendar value) {
        this.regulationDocumentDateEnd = value;
    }

    /**
     * Gets the value of the regulationDocumentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentTypeName() {
        return regulationDocumentTypeName;
    }

    /**
     * Sets the value of the regulationDocumentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentTypeName(String value) {
        this.regulationDocumentTypeName = value;
    }

    /**
     * Gets the value of the idRegulationDocumentVerificationHistory property.
     * 
     */
    public int getIdRegulationDocumentVerificationHistory() {
        return idRegulationDocumentVerificationHistory;
    }

    /**
     * Sets the value of the idRegulationDocumentVerificationHistory property.
     * 
     */
    public void setIdRegulationDocumentVerificationHistory(int value) {
        this.idRegulationDocumentVerificationHistory = value;
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
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the userMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMobilePhone() {
        return userMobilePhone;
    }

    /**
     * Sets the value of the userMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMobilePhone(String value) {
        this.userMobilePhone = value;
    }

    /**
     * Gets the value of the userWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserWorkPhone() {
        return userWorkPhone;
    }

    /**
     * Sets the value of the userWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserWorkPhone(String value) {
        this.userWorkPhone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the regulationDocumentDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentDateCreate() {
        return regulationDocumentDateCreate;
    }

    /**
     * Sets the value of the regulationDocumentDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentDateCreate(XMLGregorianCalendar value) {
        this.regulationDocumentDateCreate = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentVerificationHistoryDateLastChange() {
        return regulationDocumentVerificationHistoryDateLastChange;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentVerificationHistoryDateLastChange(XMLGregorianCalendar value) {
        this.regulationDocumentVerificationHistoryDateLastChange = value;
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
     * Gets the value of the idRegulationDocumentRekvisites property.
     * 
     */
    public int getIdRegulationDocumentRekvisites() {
        return idRegulationDocumentRekvisites;
    }

    /**
     * Sets the value of the idRegulationDocumentRekvisites property.
     * 
     */
    public void setIdRegulationDocumentRekvisites(int value) {
        this.idRegulationDocumentRekvisites = value;
    }

    /**
     * Gets the value of the regDocRekInputNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekInputNumber() {
        return regDocRekInputNumber;
    }

    /**
     * Sets the value of the regDocRekInputNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekInputNumber(String value) {
        this.regDocRekInputNumber = value;
    }

    /**
     * Gets the value of the regDocRekDateRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateRegistration() {
        return regDocRekDateRegistration;
    }

    /**
     * Sets the value of the regDocRekDateRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateRegistration(XMLGregorianCalendar value) {
        this.regDocRekDateRegistration = value;
    }

    /**
     * Gets the value of the regDocRekSuprovodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekSuprovodNumber() {
        return regDocRekSuprovodNumber;
    }

    /**
     * Sets the value of the regDocRekSuprovodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekSuprovodNumber(String value) {
        this.regDocRekSuprovodNumber = value;
    }

    /**
     * Gets the value of the regDocRekPages property.
     * 
     */
    public int getRegDocRekPages() {
        return regDocRekPages;
    }

    /**
     * Sets the value of the regDocRekPages property.
     * 
     */
    public void setRegDocRekPages(int value) {
        this.regDocRekPages = value;
    }

    /**
     * Gets the value of the regDocRekSendNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekSendNumber() {
        return regDocRekSendNumber;
    }

    /**
     * Sets the value of the regDocRekSendNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekSendNumber(String value) {
        this.regDocRekSendNumber = value;
    }

    /**
     * Gets the value of the regDocRekDateSend property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateSend() {
        return regDocRekDateSend;
    }

    /**
     * Sets the value of the regDocRekDateSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateSend(XMLGregorianCalendar value) {
        this.regDocRekDateSend = value;
    }

    /**
     * Gets the value of the regDocRekVozvrat property.
     * 
     */
    public int getRegDocRekVozvrat() {
        return regDocRekVozvrat;
    }

    /**
     * Sets the value of the regDocRekVozvrat property.
     * 
     */
    public void setRegDocRekVozvrat(int value) {
        this.regDocRekVozvrat = value;
    }

    /**
     * Gets the value of the regDocRekDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekDescription() {
        return regDocRekDescription;
    }

    /**
     * Sets the value of the regDocRekDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekDescription(String value) {
        this.regDocRekDescription = value;
    }

    /**
     * Gets the value of the idUserRekvizit property.
     * 
     */
    public int getIdUserRekvizit() {
        return idUserRekvizit;
    }

    /**
     * Sets the value of the idUserRekvizit property.
     * 
     */
    public void setIdUserRekvizit(int value) {
        this.idUserRekvizit = value;
    }

    /**
     * Gets the value of the fioRec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIORec() {
        return fioRec;
    }

    /**
     * Sets the value of the fioRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIORec(String value) {
        this.fioRec = value;
    }

    /**
     * Gets the value of the loginRec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginRec() {
        return loginRec;
    }

    /**
     * Sets the value of the loginRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginRec(String value) {
        this.loginRec = value;
    }

    /**
     * Gets the value of the regDocRekDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateCreate() {
        return regDocRekDateCreate;
    }

    /**
     * Sets the value of the regDocRekDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateCreate(XMLGregorianCalendar value) {
        this.regDocRekDateCreate = value;
    }

    /**
     * Gets the value of the regDocRekDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateLastChange() {
        return regDocRekDateLastChange;
    }

    /**
     * Sets the value of the regDocRekDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateLastChange(XMLGregorianCalendar value) {
        this.regDocRekDateLastChange = value;
    }

    /**
     * Gets the value of the regDocRekDateRecive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateRecive() {
        return regDocRekDateRecive;
    }

    /**
     * Sets the value of the regDocRekDateRecive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateRecive(XMLGregorianCalendar value) {
        this.regDocRekDateRecive = value;
    }

    /**
     * Gets the value of the regDocRekPaperCopy property.
     * 
     */
    public int getRegDocRekPaperCopy() {
        return regDocRekPaperCopy;
    }

    /**
     * Sets the value of the regDocRekPaperCopy property.
     * 
     */
    public void setRegDocRekPaperCopy(int value) {
        this.regDocRekPaperCopy = value;
    }

    /**
     * Gets the value of the certificatesGiveToUser property.
     * 
     */
    public int getCertificatesGiveToUser() {
        return certificatesGiveToUser;
    }

    /**
     * Sets the value of the certificatesGiveToUser property.
     * 
     */
    public void setCertificatesGiveToUser(int value) {
        this.certificatesGiveToUser = value;
    }

}
