
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dWebPersonsTrustee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebPersonsTrustee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebPersonsTrustee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_WebPersonsTrusteeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsTrusteeTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="AllAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebPersonsTrustee", propOrder = {
    "idWebPersonsTrustee",
    "idWebPersons",
    "idWebPersonsTrusteeType",
    "webPersonsTrusteeTypeName",
    "lastName",
    "firstName",
    "middleName",
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
    "allAddress"
})
public class DWebPersonsTrustee {

    @XmlElement(name = "Id_WebPersonsTrustee")
    protected int idWebPersonsTrustee;
    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "Id_WebPersonsTrusteeType")
    protected int idWebPersonsTrusteeType;
    @XmlElement(name = "WebPersonsTrusteeTypeName")
    protected String webPersonsTrusteeTypeName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
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
    @XmlElement(name = "AllAddress")
    protected String allAddress;

    /**
     * Gets the value of the idWebPersonsTrustee property.
     * 
     */
    public int getIdWebPersonsTrustee() {
        return idWebPersonsTrustee;
    }

    /**
     * Sets the value of the idWebPersonsTrustee property.
     * 
     */
    public void setIdWebPersonsTrustee(int value) {
        this.idWebPersonsTrustee = value;
    }

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
     * Gets the value of the idWebPersonsTrusteeType property.
     * 
     */
    public int getIdWebPersonsTrusteeType() {
        return idWebPersonsTrusteeType;
    }

    /**
     * Sets the value of the idWebPersonsTrusteeType property.
     * 
     */
    public void setIdWebPersonsTrusteeType(int value) {
        this.idWebPersonsTrusteeType = value;
    }

    /**
     * Gets the value of the webPersonsTrusteeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPersonsTrusteeTypeName() {
        return webPersonsTrusteeTypeName;
    }

    /**
     * Sets the value of the webPersonsTrusteeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPersonsTrusteeTypeName(String value) {
        this.webPersonsTrusteeTypeName = value;
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

}
