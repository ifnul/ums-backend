
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversitiesChild complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversitiesChild">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fdel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityCloseStatusTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGovernanceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityTypeOfFinfnsingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OblastUr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RayonUr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_Ur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdressUr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OblastFak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RayonFak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_Fak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdressFak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsVSP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU_Boss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateRegistration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversitiyAcreditatinTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityParent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPerepidgotovka" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsMONGiveBudget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsResech" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsProgramDoubleDiploms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityGovernanceTypesCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGovernanceTypesCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityManagmentOrganisationsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityManagmentOrganisationsTypesTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKodeEarlyPreview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityKodeEarlyPreview" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameEarlyPreview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCloseStatusTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateClosed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CloseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversitiesChild", propOrder = {
    "idUniversity",
    "universityFullName",
    "universityKode",
    "fdel",
    "closed",
    "idUniversityCloseStatusTypes",
    "universityGovernanceTypeName",
    "universityTypeOfFinfnsingName",
    "oblastUr",
    "rayonUr",
    "cityUr",
    "adressUr",
    "oblastFak",
    "rayonFak",
    "cityFak",
    "adressFak",
    "isVSP",
    "personCodeUBoss",
    "fio",
    "universityBossPhone",
    "universityEMail",
    "website",
    "universityPhone",
    "universityTypeName",
    "edrpo",
    "dateRegistration",
    "universitiyAcreditatinTypeCode",
    "idUniversityParent",
    "universityFullNameParent",
    "bossPost",
    "isPerepidgotovka",
    "isMONGiveBudget",
    "isResech",
    "isProgramDoubleDiploms",
    "idUniversityGovernanceTypesCategory",
    "universityGovernanceTypesCategory",
    "idUniversityManagmentOrganisationsTypes",
    "universityManagmentOrganisationsTypesTypes",
    "universityKodeEarlyPreview",
    "idUniversityKodeEarlyPreview",
    "universityFullNameEarlyPreview",
    "universityCloseStatusTypesName",
    "dateClosed",
    "closeReason"
})
public class DUniversitiesChild {

    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    protected int fdel;
    @XmlElement(name = "Closed")
    protected int closed;
    @XmlElement(name = "Id_UniversityCloseStatusTypes")
    protected int idUniversityCloseStatusTypes;
    @XmlElement(name = "UniversityGovernanceTypeName")
    protected String universityGovernanceTypeName;
    @XmlElement(name = "UniversityTypeOfFinfnsingName")
    protected String universityTypeOfFinfnsingName;
    @XmlElement(name = "OblastUr")
    protected String oblastUr;
    @XmlElement(name = "RayonUr")
    protected String rayonUr;
    @XmlElement(name = "City_Ur")
    protected String cityUr;
    @XmlElement(name = "AdressUr")
    protected String adressUr;
    @XmlElement(name = "OblastFak")
    protected String oblastFak;
    @XmlElement(name = "RayonFak")
    protected String rayonFak;
    @XmlElement(name = "City_Fak")
    protected String cityFak;
    @XmlElement(name = "AdressFak")
    protected String adressFak;
    @XmlElement(name = "IsVSP")
    protected int isVSP;
    @XmlElement(name = "PersonCodeU_Boss")
    protected String personCodeUBoss;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "UniversityBossPhone")
    protected String universityBossPhone;
    @XmlElement(name = "UniversityEMail")
    protected String universityEMail;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "UniversityPhone")
    protected String universityPhone;
    @XmlElement(name = "UniversityTypeName")
    protected String universityTypeName;
    @XmlElement(name = "EDRPO")
    protected String edrpo;
    @XmlElement(name = "DateRegistration", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRegistration;
    @XmlElement(name = "UniversitiyAcreditatinTypeCode")
    protected String universitiyAcreditatinTypeCode;
    @XmlElement(name = "Id_UniversityParent")
    protected int idUniversityParent;
    @XmlElement(name = "UniversityFullNameParent")
    protected String universityFullNameParent;
    @XmlElement(name = "BossPost")
    protected String bossPost;
    @XmlElement(name = "IsPerepidgotovka")
    protected int isPerepidgotovka;
    @XmlElement(name = "IsMONGiveBudget")
    protected int isMONGiveBudget;
    @XmlElement(name = "IsResech")
    protected int isResech;
    @XmlElement(name = "IsProgramDoubleDiploms")
    protected int isProgramDoubleDiploms;
    @XmlElement(name = "Id_UniversityGovernanceTypesCategory")
    protected int idUniversityGovernanceTypesCategory;
    @XmlElement(name = "UniversityGovernanceTypesCategory")
    protected String universityGovernanceTypesCategory;
    @XmlElement(name = "Id_UniversityManagmentOrganisationsTypes")
    protected int idUniversityManagmentOrganisationsTypes;
    @XmlElement(name = "UniversityManagmentOrganisationsTypesTypes")
    protected String universityManagmentOrganisationsTypesTypes;
    @XmlElement(name = "UniversityKodeEarlyPreview")
    protected String universityKodeEarlyPreview;
    @XmlElement(name = "Id_UniversityKodeEarlyPreview")
    protected int idUniversityKodeEarlyPreview;
    @XmlElement(name = "UniversityFullNameEarlyPreview")
    protected String universityFullNameEarlyPreview;
    @XmlElement(name = "UniversityCloseStatusTypesName")
    protected String universityCloseStatusTypesName;
    @XmlElement(name = "DateClosed", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateClosed;
    @XmlElement(name = "CloseReason")
    protected String closeReason;

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
     * Gets the value of the fdel property.
     * 
     */
    public int getFdel() {
        return fdel;
    }

    /**
     * Sets the value of the fdel property.
     * 
     */
    public void setFdel(int value) {
        this.fdel = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     */
    public int getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     */
    public void setClosed(int value) {
        this.closed = value;
    }

    /**
     * Gets the value of the idUniversityCloseStatusTypes property.
     * 
     */
    public int getIdUniversityCloseStatusTypes() {
        return idUniversityCloseStatusTypes;
    }

    /**
     * Sets the value of the idUniversityCloseStatusTypes property.
     * 
     */
    public void setIdUniversityCloseStatusTypes(int value) {
        this.idUniversityCloseStatusTypes = value;
    }

    /**
     * Gets the value of the universityGovernanceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGovernanceTypeName() {
        return universityGovernanceTypeName;
    }

    /**
     * Sets the value of the universityGovernanceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGovernanceTypeName(String value) {
        this.universityGovernanceTypeName = value;
    }

    /**
     * Gets the value of the universityTypeOfFinfnsingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityTypeOfFinfnsingName() {
        return universityTypeOfFinfnsingName;
    }

    /**
     * Sets the value of the universityTypeOfFinfnsingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityTypeOfFinfnsingName(String value) {
        this.universityTypeOfFinfnsingName = value;
    }

    /**
     * Gets the value of the oblastUr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblastUr() {
        return oblastUr;
    }

    /**
     * Sets the value of the oblastUr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblastUr(String value) {
        this.oblastUr = value;
    }

    /**
     * Gets the value of the rayonUr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRayonUr() {
        return rayonUr;
    }

    /**
     * Sets the value of the rayonUr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRayonUr(String value) {
        this.rayonUr = value;
    }

    /**
     * Gets the value of the cityUr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityUr() {
        return cityUr;
    }

    /**
     * Sets the value of the cityUr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityUr(String value) {
        this.cityUr = value;
    }

    /**
     * Gets the value of the adressUr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressUr() {
        return adressUr;
    }

    /**
     * Sets the value of the adressUr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressUr(String value) {
        this.adressUr = value;
    }

    /**
     * Gets the value of the oblastFak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblastFak() {
        return oblastFak;
    }

    /**
     * Sets the value of the oblastFak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblastFak(String value) {
        this.oblastFak = value;
    }

    /**
     * Gets the value of the rayonFak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRayonFak() {
        return rayonFak;
    }

    /**
     * Sets the value of the rayonFak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRayonFak(String value) {
        this.rayonFak = value;
    }

    /**
     * Gets the value of the cityFak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityFak() {
        return cityFak;
    }

    /**
     * Sets the value of the cityFak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityFak(String value) {
        this.cityFak = value;
    }

    /**
     * Gets the value of the adressFak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressFak() {
        return adressFak;
    }

    /**
     * Sets the value of the adressFak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressFak(String value) {
        this.adressFak = value;
    }

    /**
     * Gets the value of the isVSP property.
     * 
     */
    public int getIsVSP() {
        return isVSP;
    }

    /**
     * Sets the value of the isVSP property.
     * 
     */
    public void setIsVSP(int value) {
        this.isVSP = value;
    }

    /**
     * Gets the value of the personCodeUBoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeUBoss() {
        return personCodeUBoss;
    }

    /**
     * Sets the value of the personCodeUBoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeUBoss(String value) {
        this.personCodeUBoss = value;
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
     * Gets the value of the universityBossPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossPhone() {
        return universityBossPhone;
    }

    /**
     * Sets the value of the universityBossPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossPhone(String value) {
        this.universityBossPhone = value;
    }

    /**
     * Gets the value of the universityEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityEMail() {
        return universityEMail;
    }

    /**
     * Sets the value of the universityEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityEMail(String value) {
        this.universityEMail = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the universityPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityPhone() {
        return universityPhone;
    }

    /**
     * Sets the value of the universityPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityPhone(String value) {
        this.universityPhone = value;
    }

    /**
     * Gets the value of the universityTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityTypeName() {
        return universityTypeName;
    }

    /**
     * Sets the value of the universityTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityTypeName(String value) {
        this.universityTypeName = value;
    }

    /**
     * Gets the value of the edrpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDRPO() {
        return edrpo;
    }

    /**
     * Sets the value of the edrpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDRPO(String value) {
        this.edrpo = value;
    }

    /**
     * Gets the value of the dateRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRegistration() {
        return dateRegistration;
    }

    /**
     * Sets the value of the dateRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRegistration(XMLGregorianCalendar value) {
        this.dateRegistration = value;
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
     * Gets the value of the idUniversityParent property.
     * 
     */
    public int getIdUniversityParent() {
        return idUniversityParent;
    }

    /**
     * Sets the value of the idUniversityParent property.
     * 
     */
    public void setIdUniversityParent(int value) {
        this.idUniversityParent = value;
    }

    /**
     * Gets the value of the universityFullNameParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameParent() {
        return universityFullNameParent;
    }

    /**
     * Sets the value of the universityFullNameParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameParent(String value) {
        this.universityFullNameParent = value;
    }

    /**
     * Gets the value of the bossPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossPost() {
        return bossPost;
    }

    /**
     * Sets the value of the bossPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossPost(String value) {
        this.bossPost = value;
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
     * Gets the value of the isMONGiveBudget property.
     * 
     */
    public int getIsMONGiveBudget() {
        return isMONGiveBudget;
    }

    /**
     * Sets the value of the isMONGiveBudget property.
     * 
     */
    public void setIsMONGiveBudget(int value) {
        this.isMONGiveBudget = value;
    }

    /**
     * Gets the value of the isResech property.
     * 
     */
    public int getIsResech() {
        return isResech;
    }

    /**
     * Sets the value of the isResech property.
     * 
     */
    public void setIsResech(int value) {
        this.isResech = value;
    }

    /**
     * Gets the value of the isProgramDoubleDiploms property.
     * 
     */
    public int getIsProgramDoubleDiploms() {
        return isProgramDoubleDiploms;
    }

    /**
     * Sets the value of the isProgramDoubleDiploms property.
     * 
     */
    public void setIsProgramDoubleDiploms(int value) {
        this.isProgramDoubleDiploms = value;
    }

    /**
     * Gets the value of the idUniversityGovernanceTypesCategory property.
     * 
     */
    public int getIdUniversityGovernanceTypesCategory() {
        return idUniversityGovernanceTypesCategory;
    }

    /**
     * Sets the value of the idUniversityGovernanceTypesCategory property.
     * 
     */
    public void setIdUniversityGovernanceTypesCategory(int value) {
        this.idUniversityGovernanceTypesCategory = value;
    }

    /**
     * Gets the value of the universityGovernanceTypesCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGovernanceTypesCategory() {
        return universityGovernanceTypesCategory;
    }

    /**
     * Sets the value of the universityGovernanceTypesCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGovernanceTypesCategory(String value) {
        this.universityGovernanceTypesCategory = value;
    }

    /**
     * Gets the value of the idUniversityManagmentOrganisationsTypes property.
     * 
     */
    public int getIdUniversityManagmentOrganisationsTypes() {
        return idUniversityManagmentOrganisationsTypes;
    }

    /**
     * Sets the value of the idUniversityManagmentOrganisationsTypes property.
     * 
     */
    public void setIdUniversityManagmentOrganisationsTypes(int value) {
        this.idUniversityManagmentOrganisationsTypes = value;
    }

    /**
     * Gets the value of the universityManagmentOrganisationsTypesTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityManagmentOrganisationsTypesTypes() {
        return universityManagmentOrganisationsTypesTypes;
    }

    /**
     * Sets the value of the universityManagmentOrganisationsTypesTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityManagmentOrganisationsTypesTypes(String value) {
        this.universityManagmentOrganisationsTypesTypes = value;
    }

    /**
     * Gets the value of the universityKodeEarlyPreview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeEarlyPreview() {
        return universityKodeEarlyPreview;
    }

    /**
     * Sets the value of the universityKodeEarlyPreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeEarlyPreview(String value) {
        this.universityKodeEarlyPreview = value;
    }

    /**
     * Gets the value of the idUniversityKodeEarlyPreview property.
     * 
     */
    public int getIdUniversityKodeEarlyPreview() {
        return idUniversityKodeEarlyPreview;
    }

    /**
     * Sets the value of the idUniversityKodeEarlyPreview property.
     * 
     */
    public void setIdUniversityKodeEarlyPreview(int value) {
        this.idUniversityKodeEarlyPreview = value;
    }

    /**
     * Gets the value of the universityFullNameEarlyPreview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameEarlyPreview() {
        return universityFullNameEarlyPreview;
    }

    /**
     * Sets the value of the universityFullNameEarlyPreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameEarlyPreview(String value) {
        this.universityFullNameEarlyPreview = value;
    }

    /**
     * Gets the value of the universityCloseStatusTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCloseStatusTypesName() {
        return universityCloseStatusTypesName;
    }

    /**
     * Sets the value of the universityCloseStatusTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCloseStatusTypesName(String value) {
        this.universityCloseStatusTypesName = value;
    }

    /**
     * Gets the value of the dateClosed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateClosed() {
        return dateClosed;
    }

    /**
     * Sets the value of the dateClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateClosed(XMLGregorianCalendar value) {
        this.dateClosed = value;
    }

    /**
     * Gets the value of the closeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseReason() {
        return closeReason;
    }

    /**
     * Sets the value of the closeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseReason(String value) {
        this.closeReason = value;
    }

}
