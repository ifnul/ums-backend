
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
 *         &lt;element name="Id_UniversityPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AllowProcessedPersonalData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Father" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FatherPhones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotherPhones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguagesAreStudied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Country_Adress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Apartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Housing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonTypeDict" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumnetType_Pasport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PasportSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversityPerson",
    "birthday",
    "idPersonSex",
    "allowProcessedPersonalData",
    "idCountry",
    "firstName",
    "middleName",
    "lastName",
    "firstNameEn",
    "middleNameEn",
    "lastNameEn",
    "father",
    "mother",
    "fatherPhones",
    "motherPhones",
    "birthplace",
    "languagesAreStudied",
    "idCountryAdress",
    "postIndex",
    "koatuuCode",
    "idStreetType",
    "adress",
    "homeNumber",
    "apartment",
    "housing",
    "phone",
    "mobile",
    "email",
    "skype",
    "icq",
    "idPersonTypeDict",
    "idPersonDocumnetTypePasport",
    "pasportSeries",
    "pasportNumber",
    "pasportIssued",
    "pasportDate",
    "inn"
})
@XmlRootElement(name = "UniversityPersonsEdit")
public class UniversityPersonsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_UniversityPerson")
    protected int idUniversityPerson;
    @XmlElement(name = "Birthday")
    protected String birthday;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "AllowProcessedPersonalData")
    protected int allowProcessedPersonalData;
    @XmlElement(name = "Id_Country")
    protected int idCountry;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstNameEn")
    protected String firstNameEn;
    @XmlElement(name = "MiddleNameEn")
    protected String middleNameEn;
    @XmlElement(name = "LastNameEn")
    protected String lastNameEn;
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
    @XmlElement(name = "Id_Country_Adress")
    protected int idCountryAdress;
    @XmlElement(name = "PostIndex")
    protected String postIndex;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "Id_StreetType")
    protected int idStreetType;
    @XmlElement(name = "Adress")
    protected String adress;
    @XmlElement(name = "HomeNumber")
    protected String homeNumber;
    @XmlElement(name = "Apartment")
    protected String apartment;
    @XmlElement(name = "Housing")
    protected String housing;
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
    @XmlElement(name = "Id_PersonDocumnetType_Pasport")
    protected int idPersonDocumnetTypePasport;
    @XmlElement(name = "PasportSeries")
    protected String pasportSeries;
    @XmlElement(name = "PasportNumber")
    protected String pasportNumber;
    @XmlElement(name = "PasportIssued")
    protected String pasportIssued;
    @XmlElement(name = "PasportDate")
    protected String pasportDate;
    @XmlElement(name = "INN")
    protected String inn;

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
     * Gets the value of the idUniversityPerson property.
     * 
     */
    public int getIdUniversityPerson() {
        return idUniversityPerson;
    }

    /**
     * Sets the value of the idUniversityPerson property.
     * 
     */
    public void setIdUniversityPerson(int value) {
        this.idUniversityPerson = value;
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
     * Gets the value of the allowProcessedPersonalData property.
     * 
     */
    public int getAllowProcessedPersonalData() {
        return allowProcessedPersonalData;
    }

    /**
     * Sets the value of the allowProcessedPersonalData property.
     * 
     */
    public void setAllowProcessedPersonalData(int value) {
        this.allowProcessedPersonalData = value;
    }

    /**
     * Gets the value of the idCountry property.
     * 
     */
    public int getIdCountry() {
        return idCountry;
    }

    /**
     * Sets the value of the idCountry property.
     * 
     */
    public void setIdCountry(int value) {
        this.idCountry = value;
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
     * Gets the value of the firstNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameEn() {
        return firstNameEn;
    }

    /**
     * Sets the value of the firstNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameEn(String value) {
        this.firstNameEn = value;
    }

    /**
     * Gets the value of the middleNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleNameEn() {
        return middleNameEn;
    }

    /**
     * Sets the value of the middleNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleNameEn(String value) {
        this.middleNameEn = value;
    }

    /**
     * Gets the value of the lastNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameEn() {
        return lastNameEn;
    }

    /**
     * Sets the value of the lastNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameEn(String value) {
        this.lastNameEn = value;
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
     * Gets the value of the idCountryAdress property.
     * 
     */
    public int getIdCountryAdress() {
        return idCountryAdress;
    }

    /**
     * Sets the value of the idCountryAdress property.
     * 
     */
    public void setIdCountryAdress(int value) {
        this.idCountryAdress = value;
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
     * Gets the value of the apartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the housing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousing() {
        return housing;
    }

    /**
     * Sets the value of the housing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousing(String value) {
        this.housing = value;
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
     * Gets the value of the idPersonDocumnetTypePasport property.
     * 
     */
    public int getIdPersonDocumnetTypePasport() {
        return idPersonDocumnetTypePasport;
    }

    /**
     * Sets the value of the idPersonDocumnetTypePasport property.
     * 
     */
    public void setIdPersonDocumnetTypePasport(int value) {
        this.idPersonDocumnetTypePasport = value;
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
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

}
