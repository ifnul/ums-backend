
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dWebPersons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebPersons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EngLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EngFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EngMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDay" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SexTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SexTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Citizen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CitizenCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocSeria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocGiven" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StreetTypeFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetTypeShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouseSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlatNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Country2Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndex2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetType2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StreetType2FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetType2ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouseNum2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouseSection2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlatNum2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SkipMiddleName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MedicalCertificateNumeber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicalCertificateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AllAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_WebPersonsStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsStatusIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsStatusDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebPersonsStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_WebPersonsStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FillType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FillTypeData1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FillTypeData2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ApplicationKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocCountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_WebPersonsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FillDocIdType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_WebPersonStatement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebPersons", propOrder = {
    "idWebPersons",
    "dateCreate",
    "dateLastChange",
    "personCodeU",
    "lastName",
    "firstName",
    "middleName",
    "engLastName",
    "engFirstName",
    "engMiddleName",
    "birthDay",
    "sexTypeID",
    "sexTypeName",
    "citizen",
    "citizenCountryName",
    "uin",
    "docTypeID",
    "docTypeName",
    "docSeria",
    "docNumber",
    "docDate",
    "docGiven",
    "phone1",
    "phone2",
    "phone3",
    "eMail",
    "icq",
    "skype",
    "country",
    "countryName",
    "postIndex",
    "terID",
    "koatuuName",
    "koatuuFullName",
    "streetType",
    "streetTypeFullName",
    "streetTypeShortName",
    "streetName",
    "houseNum",
    "houseSection",
    "flatNum",
    "country2",
    "country2Name",
    "postIndex2",
    "terID2",
    "koatuuName2",
    "koatuuFullName2",
    "streetType2",
    "streetType2FullName",
    "streetType2ShortName",
    "streetName2",
    "houseNum2",
    "houseSection2",
    "flatNum2",
    "skipMiddleName",
    "medicalCertificateNumeber",
    "medicalCertificateDate",
    "allAddress",
    "allAddress2",
    "idWebPersonsStatus",
    "webPersonsStatusIsActive",
    "webPersonsStatusDateLastChange",
    "idUser",
    "userFIO",
    "webPersonsStatusDescription",
    "idWebPersonsStatusType",
    "webPersonsStatusTypeName",
    "fillType",
    "fillTypeData1",
    "fillTypeData2",
    "idUserAdd",
    "idApplicationKey",
    "docCountryId",
    "idWebPersonsType",
    "webPersonsTypeName",
    "fillDocIdType",
    "idUniversity",
    "universityFullName",
    "idWebPersonStatement",
    "universityKode"
})
public class DWebPersons {

    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "EngLastName")
    protected String engLastName;
    @XmlElement(name = "EngFirstName")
    protected String engFirstName;
    @XmlElement(name = "EngMiddleName")
    protected String engMiddleName;
    @XmlElement(name = "BirthDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDay;
    @XmlElement(name = "SexTypeID")
    protected int sexTypeID;
    @XmlElement(name = "SexTypeName")
    protected String sexTypeName;
    @XmlElement(name = "Citizen")
    protected int citizen;
    @XmlElement(name = "CitizenCountryName")
    protected String citizenCountryName;
    @XmlElement(name = "UIN")
    protected String uin;
    @XmlElement(name = "DocTypeID")
    protected int docTypeID;
    @XmlElement(name = "DocTypeName")
    protected String docTypeName;
    @XmlElement(name = "DocSeria")
    protected String docSeria;
    @XmlElement(name = "DocNumber")
    protected String docNumber;
    @XmlElement(name = "DocDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "DocGiven")
    protected String docGiven;
    @XmlElement(name = "Phone1")
    protected String phone1;
    @XmlElement(name = "Phone2")
    protected String phone2;
    @XmlElement(name = "Phone3")
    protected String phone3;
    @XmlElement(name = "EMail")
    protected String eMail;
    @XmlElement(name = "ICQ")
    protected String icq;
    @XmlElement(name = "Skype")
    protected String skype;
    @XmlElement(name = "Country")
    protected int country;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "PostIndex")
    protected String postIndex;
    @XmlElement(name = "TerID")
    protected String terID;
    @XmlElement(name = "KOATUUName")
    protected String koatuuName;
    @XmlElement(name = "KOATUUFullName")
    protected String koatuuFullName;
    @XmlElement(name = "StreetType")
    protected int streetType;
    @XmlElement(name = "StreetTypeFullName")
    protected String streetTypeFullName;
    @XmlElement(name = "StreetTypeShortName")
    protected String streetTypeShortName;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "HouseNum")
    protected String houseNum;
    @XmlElement(name = "HouseSection")
    protected String houseSection;
    @XmlElement(name = "FlatNum")
    protected String flatNum;
    @XmlElement(name = "Country2")
    protected int country2;
    @XmlElement(name = "Country2Name")
    protected String country2Name;
    @XmlElement(name = "PostIndex2")
    protected String postIndex2;
    @XmlElement(name = "TerID2")
    protected String terID2;
    @XmlElement(name = "KOATUUName2")
    protected String koatuuName2;
    @XmlElement(name = "KOATUUFullName2")
    protected String koatuuFullName2;
    @XmlElement(name = "StreetType2")
    protected int streetType2;
    @XmlElement(name = "StreetType2FullName")
    protected String streetType2FullName;
    @XmlElement(name = "StreetType2ShortName")
    protected String streetType2ShortName;
    @XmlElement(name = "StreetName2")
    protected String streetName2;
    @XmlElement(name = "HouseNum2")
    protected String houseNum2;
    @XmlElement(name = "HouseSection2")
    protected String houseSection2;
    @XmlElement(name = "FlatNum2")
    protected String flatNum2;
    @XmlElement(name = "SkipMiddleName")
    protected int skipMiddleName;
    @XmlElement(name = "MedicalCertificateNumeber")
    protected String medicalCertificateNumeber;
    @XmlElement(name = "MedicalCertificateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar medicalCertificateDate;
    @XmlElement(name = "AllAddress")
    protected String allAddress;
    @XmlElement(name = "AllAddress2")
    protected String allAddress2;
    @XmlElement(name = "Id_WebPersonsStatus")
    protected int idWebPersonsStatus;
    @XmlElement(name = "WebPersonsStatusIsActive")
    protected int webPersonsStatusIsActive;
    @XmlElement(name = "WebPersonsStatusDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar webPersonsStatusDateLastChange;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "UserFIO")
    protected String userFIO;
    @XmlElement(name = "WebPersonsStatusDescription")
    protected String webPersonsStatusDescription;
    @XmlElement(name = "Id_WebPersonsStatusType")
    protected int idWebPersonsStatusType;
    @XmlElement(name = "WebPersonsStatusTypeName")
    protected String webPersonsStatusTypeName;
    @XmlElement(name = "FillType")
    protected int fillType;
    @XmlElement(name = "FillTypeData1")
    protected String fillTypeData1;
    @XmlElement(name = "FillTypeData2")
    protected String fillTypeData2;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "Id_ApplicationKey")
    protected int idApplicationKey;
    @XmlElement(name = "DocCountryId")
    protected int docCountryId;
    @XmlElement(name = "Id_WebPersonsType")
    protected int idWebPersonsType;
    @XmlElement(name = "WebPersonsTypeName")
    protected String webPersonsTypeName;
    @XmlElement(name = "FillDocIdType")
    protected int fillDocIdType;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Id_WebPersonStatement")
    protected int idWebPersonStatement;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;

    /**
     * Gets the value of the idWebPersons property.
     * 
     */
    public int getIdWebPersons() {
        return idWebPersons;
    }

    /**
     * Sets the value of the idWebPersons property.
     * 
     */
    public void setIdWebPersons(int value) {
        this.idWebPersons = value;
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
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
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
     * Gets the value of the engLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngLastName() {
        return engLastName;
    }

    /**
     * Sets the value of the engLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngLastName(String value) {
        this.engLastName = value;
    }

    /**
     * Gets the value of the engFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngFirstName() {
        return engFirstName;
    }

    /**
     * Sets the value of the engFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngFirstName(String value) {
        this.engFirstName = value;
    }

    /**
     * Gets the value of the engMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngMiddleName() {
        return engMiddleName;
    }

    /**
     * Sets the value of the engMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngMiddleName(String value) {
        this.engMiddleName = value;
    }

    /**
     * Gets the value of the birthDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDay() {
        return birthDay;
    }

    /**
     * Sets the value of the birthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDay(XMLGregorianCalendar value) {
        this.birthDay = value;
    }

    /**
     * Gets the value of the sexTypeID property.
     * 
     */
    public int getSexTypeID() {
        return sexTypeID;
    }

    /**
     * Sets the value of the sexTypeID property.
     * 
     */
    public void setSexTypeID(int value) {
        this.sexTypeID = value;
    }

    /**
     * Gets the value of the sexTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexTypeName() {
        return sexTypeName;
    }

    /**
     * Sets the value of the sexTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexTypeName(String value) {
        this.sexTypeName = value;
    }

    /**
     * Gets the value of the citizen property.
     * 
     */
    public int getCitizen() {
        return citizen;
    }

    /**
     * Sets the value of the citizen property.
     * 
     */
    public void setCitizen(int value) {
        this.citizen = value;
    }

    /**
     * Gets the value of the citizenCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenCountryName() {
        return citizenCountryName;
    }

    /**
     * Sets the value of the citizenCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenCountryName(String value) {
        this.citizenCountryName = value;
    }

    /**
     * Gets the value of the uin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIN() {
        return uin;
    }

    /**
     * Sets the value of the uin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIN(String value) {
        this.uin = value;
    }

    /**
     * Gets the value of the docTypeID property.
     * 
     */
    public int getDocTypeID() {
        return docTypeID;
    }

    /**
     * Sets the value of the docTypeID property.
     * 
     */
    public void setDocTypeID(int value) {
        this.docTypeID = value;
    }

    /**
     * Gets the value of the docTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeName() {
        return docTypeName;
    }

    /**
     * Sets the value of the docTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeName(String value) {
        this.docTypeName = value;
    }

    /**
     * Gets the value of the docSeria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSeria() {
        return docSeria;
    }

    /**
     * Sets the value of the docSeria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSeria(String value) {
        this.docSeria = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the docGiven property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocGiven() {
        return docGiven;
    }

    /**
     * Sets the value of the docGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocGiven(String value) {
        this.docGiven = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone1(String value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the phone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone3() {
        return phone3;
    }

    /**
     * Sets the value of the phone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone3(String value) {
        this.phone3 = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
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
     * Gets the value of the country property.
     * 
     */
    public int getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     */
    public void setCountry(int value) {
        this.country = value;
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
     * Gets the value of the terID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerID() {
        return terID;
    }

    /**
     * Sets the value of the terID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerID(String value) {
        this.terID = value;
    }

    /**
     * Gets the value of the koatuuName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUName() {
        return koatuuName;
    }

    /**
     * Sets the value of the koatuuName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUName(String value) {
        this.koatuuName = value;
    }

    /**
     * Gets the value of the koatuuFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUFullName() {
        return koatuuFullName;
    }

    /**
     * Sets the value of the koatuuFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUFullName(String value) {
        this.koatuuFullName = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     */
    public int getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     */
    public void setStreetType(int value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the streetTypeFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTypeFullName() {
        return streetTypeFullName;
    }

    /**
     * Sets the value of the streetTypeFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTypeFullName(String value) {
        this.streetTypeFullName = value;
    }

    /**
     * Gets the value of the streetTypeShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTypeShortName() {
        return streetTypeShortName;
    }

    /**
     * Sets the value of the streetTypeShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTypeShortName(String value) {
        this.streetTypeShortName = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the houseNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNum() {
        return houseNum;
    }

    /**
     * Sets the value of the houseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNum(String value) {
        this.houseNum = value;
    }

    /**
     * Gets the value of the houseSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseSection() {
        return houseSection;
    }

    /**
     * Sets the value of the houseSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseSection(String value) {
        this.houseSection = value;
    }

    /**
     * Gets the value of the flatNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatNum() {
        return flatNum;
    }

    /**
     * Sets the value of the flatNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatNum(String value) {
        this.flatNum = value;
    }

    /**
     * Gets the value of the country2 property.
     * 
     */
    public int getCountry2() {
        return country2;
    }

    /**
     * Sets the value of the country2 property.
     * 
     */
    public void setCountry2(int value) {
        this.country2 = value;
    }

    /**
     * Gets the value of the country2Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry2Name() {
        return country2Name;
    }

    /**
     * Sets the value of the country2Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry2Name(String value) {
        this.country2Name = value;
    }

    /**
     * Gets the value of the postIndex2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostIndex2() {
        return postIndex2;
    }

    /**
     * Sets the value of the postIndex2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostIndex2(String value) {
        this.postIndex2 = value;
    }

    /**
     * Gets the value of the terID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerID2() {
        return terID2;
    }

    /**
     * Sets the value of the terID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerID2(String value) {
        this.terID2 = value;
    }

    /**
     * Gets the value of the koatuuName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUName2() {
        return koatuuName2;
    }

    /**
     * Sets the value of the koatuuName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUName2(String value) {
        this.koatuuName2 = value;
    }

    /**
     * Gets the value of the koatuuFullName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUFullName2() {
        return koatuuFullName2;
    }

    /**
     * Sets the value of the koatuuFullName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUFullName2(String value) {
        this.koatuuFullName2 = value;
    }

    /**
     * Gets the value of the streetType2 property.
     * 
     */
    public int getStreetType2() {
        return streetType2;
    }

    /**
     * Sets the value of the streetType2 property.
     * 
     */
    public void setStreetType2(int value) {
        this.streetType2 = value;
    }

    /**
     * Gets the value of the streetType2FullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType2FullName() {
        return streetType2FullName;
    }

    /**
     * Sets the value of the streetType2FullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType2FullName(String value) {
        this.streetType2FullName = value;
    }

    /**
     * Gets the value of the streetType2ShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType2ShortName() {
        return streetType2ShortName;
    }

    /**
     * Sets the value of the streetType2ShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType2ShortName(String value) {
        this.streetType2ShortName = value;
    }

    /**
     * Gets the value of the streetName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName2() {
        return streetName2;
    }

    /**
     * Sets the value of the streetName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName2(String value) {
        this.streetName2 = value;
    }

    /**
     * Gets the value of the houseNum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNum2() {
        return houseNum2;
    }

    /**
     * Sets the value of the houseNum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNum2(String value) {
        this.houseNum2 = value;
    }

    /**
     * Gets the value of the houseSection2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseSection2() {
        return houseSection2;
    }

    /**
     * Sets the value of the houseSection2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseSection2(String value) {
        this.houseSection2 = value;
    }

    /**
     * Gets the value of the flatNum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatNum2() {
        return flatNum2;
    }

    /**
     * Sets the value of the flatNum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatNum2(String value) {
        this.flatNum2 = value;
    }

    /**
     * Gets the value of the skipMiddleName property.
     * 
     */
    public int getSkipMiddleName() {
        return skipMiddleName;
    }

    /**
     * Sets the value of the skipMiddleName property.
     * 
     */
    public void setSkipMiddleName(int value) {
        this.skipMiddleName = value;
    }

    /**
     * Gets the value of the medicalCertificateNumeber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalCertificateNumeber() {
        return medicalCertificateNumeber;
    }

    /**
     * Sets the value of the medicalCertificateNumeber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalCertificateNumeber(String value) {
        this.medicalCertificateNumeber = value;
    }

    /**
     * Gets the value of the medicalCertificateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMedicalCertificateDate() {
        return medicalCertificateDate;
    }

    /**
     * Sets the value of the medicalCertificateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMedicalCertificateDate(XMLGregorianCalendar value) {
        this.medicalCertificateDate = value;
    }

    /**
     * Gets the value of the allAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllAddress() {
        return allAddress;
    }

    /**
     * Sets the value of the allAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllAddress(String value) {
        this.allAddress = value;
    }

    /**
     * Gets the value of the allAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllAddress2() {
        return allAddress2;
    }

    /**
     * Sets the value of the allAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllAddress2(String value) {
        this.allAddress2 = value;
    }

    /**
     * Gets the value of the idWebPersonsStatus property.
     * 
     */
    public int getIdWebPersonsStatus() {
        return idWebPersonsStatus;
    }

    /**
     * Sets the value of the idWebPersonsStatus property.
     * 
     */
    public void setIdWebPersonsStatus(int value) {
        this.idWebPersonsStatus = value;
    }

    /**
     * Gets the value of the webPersonsStatusIsActive property.
     * 
     */
    public int getWebPersonsStatusIsActive() {
        return webPersonsStatusIsActive;
    }

    /**
     * Sets the value of the webPersonsStatusIsActive property.
     * 
     */
    public void setWebPersonsStatusIsActive(int value) {
        this.webPersonsStatusIsActive = value;
    }

    /**
     * Gets the value of the webPersonsStatusDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWebPersonsStatusDateLastChange() {
        return webPersonsStatusDateLastChange;
    }

    /**
     * Sets the value of the webPersonsStatusDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWebPersonsStatusDateLastChange(XMLGregorianCalendar value) {
        this.webPersonsStatusDateLastChange = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the userFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFIO() {
        return userFIO;
    }

    /**
     * Sets the value of the userFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFIO(String value) {
        this.userFIO = value;
    }

    /**
     * Gets the value of the webPersonsStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPersonsStatusDescription() {
        return webPersonsStatusDescription;
    }

    /**
     * Sets the value of the webPersonsStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPersonsStatusDescription(String value) {
        this.webPersonsStatusDescription = value;
    }

    /**
     * Gets the value of the idWebPersonsStatusType property.
     * 
     */
    public int getIdWebPersonsStatusType() {
        return idWebPersonsStatusType;
    }

    /**
     * Sets the value of the idWebPersonsStatusType property.
     * 
     */
    public void setIdWebPersonsStatusType(int value) {
        this.idWebPersonsStatusType = value;
    }

    /**
     * Gets the value of the webPersonsStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPersonsStatusTypeName() {
        return webPersonsStatusTypeName;
    }

    /**
     * Sets the value of the webPersonsStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPersonsStatusTypeName(String value) {
        this.webPersonsStatusTypeName = value;
    }

    /**
     * Gets the value of the fillType property.
     * 
     */
    public int getFillType() {
        return fillType;
    }

    /**
     * Sets the value of the fillType property.
     * 
     */
    public void setFillType(int value) {
        this.fillType = value;
    }

    /**
     * Gets the value of the fillTypeData1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillTypeData1() {
        return fillTypeData1;
    }

    /**
     * Sets the value of the fillTypeData1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillTypeData1(String value) {
        this.fillTypeData1 = value;
    }

    /**
     * Gets the value of the fillTypeData2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillTypeData2() {
        return fillTypeData2;
    }

    /**
     * Sets the value of the fillTypeData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillTypeData2(String value) {
        this.fillTypeData2 = value;
    }

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
    }

    /**
     * Gets the value of the idApplicationKey property.
     * 
     */
    public int getIdApplicationKey() {
        return idApplicationKey;
    }

    /**
     * Sets the value of the idApplicationKey property.
     * 
     */
    public void setIdApplicationKey(int value) {
        this.idApplicationKey = value;
    }

    /**
     * Gets the value of the docCountryId property.
     * 
     */
    public int getDocCountryId() {
        return docCountryId;
    }

    /**
     * Sets the value of the docCountryId property.
     * 
     */
    public void setDocCountryId(int value) {
        this.docCountryId = value;
    }

    /**
     * Gets the value of the idWebPersonsType property.
     * 
     */
    public int getIdWebPersonsType() {
        return idWebPersonsType;
    }

    /**
     * Sets the value of the idWebPersonsType property.
     * 
     */
    public void setIdWebPersonsType(int value) {
        this.idWebPersonsType = value;
    }

    /**
     * Gets the value of the webPersonsTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPersonsTypeName() {
        return webPersonsTypeName;
    }

    /**
     * Sets the value of the webPersonsTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPersonsTypeName(String value) {
        this.webPersonsTypeName = value;
    }

    /**
     * Gets the value of the fillDocIdType property.
     * 
     */
    public int getFillDocIdType() {
        return fillDocIdType;
    }

    /**
     * Sets the value of the fillDocIdType property.
     * 
     */
    public void setFillDocIdType(int value) {
        this.fillDocIdType = value;
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
     * Gets the value of the idWebPersonStatement property.
     * 
     */
    public int getIdWebPersonStatement() {
        return idWebPersonStatement;
    }

    /**
     * Sets the value of the idWebPersonStatement property.
     * 
     */
    public void setIdWebPersonStatement(int value) {
        this.idWebPersonStatement = value;
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

}
