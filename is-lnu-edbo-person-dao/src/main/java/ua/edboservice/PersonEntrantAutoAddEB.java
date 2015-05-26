
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
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ZNONumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZNODateGet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZNOPin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthCertificateSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthCertificateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kode_School" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Father" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FatherPhones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotherPhones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguagesAreStudied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EntrantDocumentsAwardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idPersonSex",
    "znoNumbers",
    "znoDateGet",
    "znoPin",
    "attestatSeries",
    "attestatNumber",
    "attestatDate",
    "attestatValue",
    "pasportSeries",
    "pasportNumber",
    "pasportIssued",
    "pasportDate",
    "birthCertificateSeries",
    "birthCertificateNumber",
    "birthCertificateDate",
    "kodeSchool",
    "phone",
    "mobile",
    "email",
    "skype",
    "icq",
    "login",
    "password",
    "father",
    "mother",
    "fatherPhones",
    "motherPhones",
    "birthplace",
    "languagesAreStudied",
    "idEntrantDocumentsAwardType"
})
@XmlRootElement(name = "PersonEntrantAutoAddEB")
public class PersonEntrantAutoAddEB {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "ZNONumbers")
    protected String znoNumbers;
    @XmlElement(name = "ZNODateGet")
    protected String znoDateGet;
    @XmlElement(name = "ZNOPin")
    protected int znoPin;
    @XmlElement(name = "AttestatSeries")
    protected String attestatSeries;
    @XmlElement(name = "AttestatNumber")
    protected String attestatNumber;
    @XmlElement(name = "AttestatDate")
    protected String attestatDate;
    @XmlElement(name = "AttestatValue")
    protected String attestatValue;
    @XmlElement(name = "PasportSeries")
    protected String pasportSeries;
    @XmlElement(name = "PasportNumber")
    protected String pasportNumber;
    @XmlElement(name = "PasportIssued")
    protected String pasportIssued;
    @XmlElement(name = "PasportDate")
    protected String pasportDate;
    @XmlElement(name = "BirthCertificateSeries")
    protected String birthCertificateSeries;
    @XmlElement(name = "BirthCertificateNumber")
    protected String birthCertificateNumber;
    @XmlElement(name = "BirthCertificateDate")
    protected String birthCertificateDate;
    @XmlElement(name = "Kode_School")
    protected String kodeSchool;
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
    @XmlElement(name = "Login")
    protected String login;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Father")
    protected String father;
    @XmlElement(name = "Mother")
    protected String mother;
    @XmlElement(name = "FatherPhones")
    protected String fatherPhones;
    @XmlElement(name = "MotherPhones")
    protected String motherPhones;
    @XmlElement(name = "Birthplace")
    protected String birthplace;
    @XmlElement(name = "LanguagesAreStudied")
    protected String languagesAreStudied;
    @XmlElement(name = "Id_EntrantDocumentsAwardType")
    protected int idEntrantDocumentsAwardType;

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
     * Gets the value of the znoNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZNONumbers() {
        return znoNumbers;
    }

    /**
     * Sets the value of the znoNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZNONumbers(String value) {
        this.znoNumbers = value;
    }

    /**
     * Gets the value of the znoDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZNODateGet() {
        return znoDateGet;
    }

    /**
     * Sets the value of the znoDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZNODateGet(String value) {
        this.znoDateGet = value;
    }

    /**
     * Gets the value of the znoPin property.
     * 
     */
    public int getZNOPin() {
        return znoPin;
    }

    /**
     * Sets the value of the znoPin property.
     * 
     */
    public void setZNOPin(int value) {
        this.znoPin = value;
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
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the father property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFather() {
        return father;
    }

    /**
     * Sets the value of the father property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFather(String value) {
        this.father = value;
    }

    /**
     * Gets the value of the mother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMother() {
        return mother;
    }

    /**
     * Sets the value of the mother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMother(String value) {
        this.mother = value;
    }

    /**
     * Gets the value of the fatherPhones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherPhones() {
        return fatherPhones;
    }

    /**
     * Sets the value of the fatherPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherPhones(String value) {
        this.fatherPhones = value;
    }

    /**
     * Gets the value of the motherPhones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherPhones() {
        return motherPhones;
    }

    /**
     * Sets the value of the motherPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherPhones(String value) {
        this.motherPhones = value;
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
     * Gets the value of the idEntrantDocumentsAwardType property.
     * 
     */
    public int getIdEntrantDocumentsAwardType() {
        return idEntrantDocumentsAwardType;
    }

    /**
     * Sets the value of the idEntrantDocumentsAwardType property.
     * 
     */
    public void setIdEntrantDocumentsAwardType(int value) {
        this.idEntrantDocumentsAwardType = value;
    }

}
