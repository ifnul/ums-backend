
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
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Resident" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kode_School" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsForeinghAttestat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsNotCheckAttestat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BirthCertificateSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthCertificateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthCertificateIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonTypeDict" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguagesAreStudied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AttestatAwardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idLanguage",
    "resident",
    "birthday",
    "idPersonSex",
    "firstName",
    "middleName",
    "lastName",
    "koatuuCode",
    "idStreetType",
    "adress",
    "homeNumber",
    "pasportSeries",
    "pasportNumber",
    "pasportIssued",
    "pasportDate",
    "attestatSeries",
    "attestatNumber",
    "attestatDate",
    "attestatValue",
    "kodeSchool",
    "schoolName",
    "isForeinghAttestat",
    "isNotCheckAttestat",
    "birthCertificateSeries",
    "birthCertificateNumber",
    "birthCertificateDate",
    "birthCertificateIssued",
    "inNumber",
    "phone",
    "mobile",
    "email",
    "skype",
    "icq",
    "idPersonTypeDict",
    "postIndex",
    "birthplace",
    "languagesAreStudied",
    "idAttestatAwardType"
})
@XmlRootElement(name = "PersonAdd")
public class PersonAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Resident")
    protected int resident;
    @XmlElement(name = "Birthday")
    protected String birthday;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "Id_StreetType")
    protected int idStreetType;
    @XmlElement(name = "Adress")
    protected String adress;
    @XmlElement(name = "HomeNumber")
    protected String homeNumber;
    @XmlElement(name = "PasportSeries")
    protected String pasportSeries;
    @XmlElement(name = "PasportNumber")
    protected String pasportNumber;
    @XmlElement(name = "PasportIssued")
    protected String pasportIssued;
    @XmlElement(name = "PasportDate")
    protected String pasportDate;
    @XmlElement(name = "AttestatSeries")
    protected String attestatSeries;
    @XmlElement(name = "AttestatNumber")
    protected String attestatNumber;
    @XmlElement(name = "AttestatDate")
    protected String attestatDate;
    @XmlElement(name = "AttestatValue")
    protected String attestatValue;
    @XmlElement(name = "Kode_School")
    protected String kodeSchool;
    @XmlElement(name = "SchoolName")
    protected String schoolName;
    @XmlElement(name = "IsForeinghAttestat")
    protected int isForeinghAttestat;
    @XmlElement(name = "IsNotCheckAttestat")
    protected int isNotCheckAttestat;
    @XmlElement(name = "BirthCertificateSeries")
    protected String birthCertificateSeries;
    @XmlElement(name = "BirthCertificateNumber")
    protected String birthCertificateNumber;
    @XmlElement(name = "BirthCertificateDate")
    protected String birthCertificateDate;
    @XmlElement(name = "BirthCertificateIssued")
    protected String birthCertificateIssued;
    @XmlElement(name = "INNumber")
    protected String inNumber;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Skype")
    protected String skype;
    @XmlElement(name = "ICQ")
    protected String icq;
    @XmlElement(name = "Id_PersonTypeDict")
    protected int idPersonTypeDict;
    @XmlElement(name = "PostIndex")
    protected String postIndex;
    @XmlElement(name = "Birthplace")
    protected String birthplace;
    @XmlElement(name = "LanguagesAreStudied")
    protected String languagesAreStudied;
    @XmlElement(name = "Id_AttestatAwardType")
    protected int idAttestatAwardType;

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
     * Gets the value of the resident property.
     * 
     */
    public int getResident() {
        return resident;
    }

    /**
     * Sets the value of the resident property.
     * 
     */
    public void setResident(int value) {
        this.resident = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the idPersonSex property.
     * 
     */
    public int getIdPersonSex() {
        return idPersonSex;
    }

    /**
     * Sets the value of the idPersonSex property.
     * 
     */
    public void setIdPersonSex(int value) {
        this.idPersonSex = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the koatuuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCode() {
        return koatuuCode;
    }

    /**
     * Sets the value of the koatuuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCode(String value) {
        this.koatuuCode = value;
    }

    /**
     * Gets the value of the idStreetType property.
     * 
     */
    public int getIdStreetType() {
        return idStreetType;
    }

    /**
     * Sets the value of the idStreetType property.
     * 
     */
    public void setIdStreetType(int value) {
        this.idStreetType = value;
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
     * Gets the value of the homeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeNumber() {
        return homeNumber;
    }

    /**
     * Sets the value of the homeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeNumber(String value) {
        this.homeNumber = value;
    }

    /**
     * Gets the value of the pasportSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportSeries() {
        return pasportSeries;
    }

    /**
     * Sets the value of the pasportSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportSeries(String value) {
        this.pasportSeries = value;
    }

    /**
     * Gets the value of the pasportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportNumber() {
        return pasportNumber;
    }

    /**
     * Sets the value of the pasportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportNumber(String value) {
        this.pasportNumber = value;
    }

    /**
     * Gets the value of the pasportIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportIssued() {
        return pasportIssued;
    }

    /**
     * Sets the value of the pasportIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportIssued(String value) {
        this.pasportIssued = value;
    }

    /**
     * Gets the value of the pasportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportDate() {
        return pasportDate;
    }

    /**
     * Sets the value of the pasportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportDate(String value) {
        this.pasportDate = value;
    }

    /**
     * Gets the value of the attestatSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestatSeries() {
        return attestatSeries;
    }

    /**
     * Sets the value of the attestatSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatSeries(String value) {
        this.attestatSeries = value;
    }

    /**
     * Gets the value of the attestatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestatNumber() {
        return attestatNumber;
    }

    /**
     * Sets the value of the attestatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatNumber(String value) {
        this.attestatNumber = value;
    }

    /**
     * Gets the value of the attestatDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestatDate() {
        return attestatDate;
    }

    /**
     * Sets the value of the attestatDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatDate(String value) {
        this.attestatDate = value;
    }

    /**
     * Gets the value of the attestatValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestatValue() {
        return attestatValue;
    }

    /**
     * Sets the value of the attestatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatValue(String value) {
        this.attestatValue = value;
    }

    /**
     * Gets the value of the kodeSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeSchool() {
        return kodeSchool;
    }

    /**
     * Sets the value of the kodeSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeSchool(String value) {
        this.kodeSchool = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the isForeinghAttestat property.
     * 
     */
    public int getIsForeinghAttestat() {
        return isForeinghAttestat;
    }

    /**
     * Sets the value of the isForeinghAttestat property.
     * 
     */
    public void setIsForeinghAttestat(int value) {
        this.isForeinghAttestat = value;
    }

    /**
     * Gets the value of the isNotCheckAttestat property.
     * 
     */
    public int getIsNotCheckAttestat() {
        return isNotCheckAttestat;
    }

    /**
     * Sets the value of the isNotCheckAttestat property.
     * 
     */
    public void setIsNotCheckAttestat(int value) {
        this.isNotCheckAttestat = value;
    }

    /**
     * Gets the value of the birthCertificateSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCertificateSeries() {
        return birthCertificateSeries;
    }

    /**
     * Sets the value of the birthCertificateSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCertificateSeries(String value) {
        this.birthCertificateSeries = value;
    }

    /**
     * Gets the value of the birthCertificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCertificateNumber() {
        return birthCertificateNumber;
    }

    /**
     * Sets the value of the birthCertificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCertificateNumber(String value) {
        this.birthCertificateNumber = value;
    }

    /**
     * Gets the value of the birthCertificateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCertificateDate() {
        return birthCertificateDate;
    }

    /**
     * Sets the value of the birthCertificateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCertificateDate(String value) {
        this.birthCertificateDate = value;
    }

    /**
     * Gets the value of the birthCertificateIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCertificateIssued() {
        return birthCertificateIssued;
    }

    /**
     * Sets the value of the birthCertificateIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCertificateIssued(String value) {
        this.birthCertificateIssued = value;
    }

    /**
     * Gets the value of the inNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINNumber() {
        return inNumber;
    }

    /**
     * Sets the value of the inNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINNumber(String value) {
        this.inNumber = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
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
     * Gets the value of the skype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkype() {
        return skype;
    }

    /**
     * Sets the value of the skype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkype(String value) {
        this.skype = value;
    }

    /**
     * Gets the value of the icq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICQ() {
        return icq;
    }

    /**
     * Sets the value of the icq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICQ(String value) {
        this.icq = value;
    }

    /**
     * Gets the value of the idPersonTypeDict property.
     * 
     */
    public int getIdPersonTypeDict() {
        return idPersonTypeDict;
    }

    /**
     * Sets the value of the idPersonTypeDict property.
     * 
     */
    public void setIdPersonTypeDict(int value) {
        this.idPersonTypeDict = value;
    }

    /**
     * Gets the value of the postIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostIndex() {
        return postIndex;
    }

    /**
     * Sets the value of the postIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostIndex(String value) {
        this.postIndex = value;
    }

    /**
     * Gets the value of the birthplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * Sets the value of the birthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthplace(String value) {
        this.birthplace = value;
    }

    /**
     * Gets the value of the languagesAreStudied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguagesAreStudied() {
        return languagesAreStudied;
    }

    /**
     * Sets the value of the languagesAreStudied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguagesAreStudied(String value) {
        this.languagesAreStudied = value;
    }

    /**
     * Gets the value of the idAttestatAwardType property.
     * 
     */
    public int getIdAttestatAwardType() {
        return idAttestatAwardType;
    }

    /**
     * Sets the value of the idAttestatAwardType property.
     * 
     */
    public void setIdAttestatAwardType(int value) {
        this.idAttestatAwardType = value;
    }

}
