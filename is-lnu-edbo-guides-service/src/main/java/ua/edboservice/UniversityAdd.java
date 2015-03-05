
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
 *         &lt;element name="Id_EducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityAcreditatinType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossMidleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HouceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RolesPrefixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminWorkLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGovernanceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CreateMailboxPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityTypeOfFinansing" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PostIndexU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdressU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetTypeU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HouceNumU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityJuristicalType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBossOperatedType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BossPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PtnzLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsPerepidgotovka" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityParentOrganisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityRoleType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsResech" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMONGiveBudget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PublishOnWebSite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsProgramDoubleDiploms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsExpirimentKoeficient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU_Boss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversitiesBossOrderOrganisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsGoverningBody" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsGoverningBodyDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGovernanceTypesCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityManagmentOrganisationsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityKodeEarlyPreview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idEducationType",
    "idUniversityAcreditatinType",
    "universityDateBegin",
    "universityDateEnd",
    "edrpo",
    "dateRegistration",
    "postIndex",
    "koatuuCode",
    "universityPhone",
    "universityEMail",
    "website",
    "universityBossPhone",
    "universityBossEMail",
    "universityFullName",
    "universityShortName",
    "universityAdress",
    "universityBossLastName",
    "universityBossFirstName",
    "universityBossMidleName",
    "idStreetType",
    "houceNum",
    "idLanguage",
    "rolesPrefixName",
    "universityAdminLogin",
    "universityAdminPassword",
    "universityAdminFIO",
    "universityAdminEmail",
    "universityAdminWorkPhone",
    "universityAdminMobilePhone",
    "universityAdminWorkLevel",
    "idUniversityGovernanceType",
    "createMailboxPassword",
    "idUniversityTypeOfFinansing",
    "postIndexU",
    "koatuuCodeU",
    "universityAdressU",
    "idStreetTypeU",
    "houceNumU",
    "idUniversityJuristicalType",
    "idUniversityBossOperatedType",
    "bossPost",
    "warrantNumber",
    "warrantDate",
    "idUniversityType",
    "ptnzLevel",
    "isPerepidgotovka",
    "idUniversityParentOrganisation",
    "idUniversityRoleType",
    "isResech",
    "universityFullNameEn",
    "universityShortNameEn",
    "isMONGiveBudget",
    "publishOnWebSite",
    "isProgramDoubleDiploms",
    "isExpirimentKoeficient",
    "personCodeUBoss",
    "bossOrderNumber",
    "bossOrderDate",
    "ipn",
    "idUniversitiesBossOrderOrganisation",
    "isGoverningBody",
    "isGoverningBodyDateEnd",
    "idUniversityGovernanceTypesCategory",
    "idUniversityManagmentOrganisationsTypes",
    "idUniversityKodeEarlyPreview"
})
@XmlRootElement(name = "UniversityAdd")
public class UniversityAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationType")
    protected int idEducationType;
    @XmlElement(name = "Id_UniversityAcreditatinType")
    protected int idUniversityAcreditatinType;
    @XmlElement(name = "UniversityDateBegin")
    protected String universityDateBegin;
    @XmlElement(name = "UniversityDateEnd")
    protected String universityDateEnd;
    @XmlElement(name = "EDRPO")
    protected String edrpo;
    @XmlElement(name = "DateRegistration")
    protected String dateRegistration;
    @XmlElement(name = "PostIndex")
    protected String postIndex;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "UniversityPhone")
    protected String universityPhone;
    @XmlElement(name = "UniversityEMail")
    protected String universityEMail;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "UniversityBossPhone")
    protected String universityBossPhone;
    @XmlElement(name = "UniversityBossEMail")
    protected String universityBossEMail;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityShortName")
    protected String universityShortName;
    @XmlElement(name = "UniversityAdress")
    protected String universityAdress;
    @XmlElement(name = "UniversityBossLastName")
    protected String universityBossLastName;
    @XmlElement(name = "UniversityBossFirstName")
    protected String universityBossFirstName;
    @XmlElement(name = "UniversityBossMidleName")
    protected String universityBossMidleName;
    @XmlElement(name = "Id_StreetType")
    protected int idStreetType;
    @XmlElement(name = "HouceNum")
    protected String houceNum;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "RolesPrefixName")
    protected String rolesPrefixName;
    @XmlElement(name = "UniversityAdminLogin")
    protected String universityAdminLogin;
    @XmlElement(name = "UniversityAdminPassword")
    protected String universityAdminPassword;
    @XmlElement(name = "UniversityAdminFIO")
    protected String universityAdminFIO;
    @XmlElement(name = "UniversityAdminEmail")
    protected String universityAdminEmail;
    @XmlElement(name = "UniversityAdminWorkPhone")
    protected String universityAdminWorkPhone;
    @XmlElement(name = "UniversityAdminMobilePhone")
    protected String universityAdminMobilePhone;
    @XmlElement(name = "UniversityAdminWorkLevel")
    protected String universityAdminWorkLevel;
    @XmlElement(name = "Id_UniversityGovernanceType")
    protected int idUniversityGovernanceType;
    @XmlElement(name = "CreateMailboxPassword")
    protected String createMailboxPassword;
    @XmlElement(name = "Id_UniversityTypeOfFinansing")
    protected int idUniversityTypeOfFinansing;
    @XmlElement(name = "PostIndexU")
    protected String postIndexU;
    @XmlElement(name = "KOATUUCodeU")
    protected String koatuuCodeU;
    @XmlElement(name = "UniversityAdressU")
    protected String universityAdressU;
    @XmlElement(name = "Id_StreetTypeU")
    protected int idStreetTypeU;
    @XmlElement(name = "HouceNumU")
    protected String houceNumU;
    @XmlElement(name = "Id_UniversityJuristicalType")
    protected int idUniversityJuristicalType;
    @XmlElement(name = "Id_UniversityBossOperatedType")
    protected int idUniversityBossOperatedType;
    @XmlElement(name = "BossPost")
    protected String bossPost;
    @XmlElement(name = "WarrantNumber")
    protected String warrantNumber;
    @XmlElement(name = "WarrantDate")
    protected String warrantDate;
    @XmlElement(name = "Id_UniversityType")
    protected int idUniversityType;
    @XmlElement(name = "PtnzLevel")
    protected int ptnzLevel;
    @XmlElement(name = "IsPerepidgotovka")
    protected int isPerepidgotovka;
    @XmlElement(name = "Id_UniversityParentOrganisation")
    protected int idUniversityParentOrganisation;
    @XmlElement(name = "Id_UniversityRoleType")
    protected int idUniversityRoleType;
    @XmlElement(name = "IsResech")
    protected int isResech;
    @XmlElement(name = "UniversityFullNameEn")
    protected String universityFullNameEn;
    @XmlElement(name = "UniversityShortNameEn")
    protected String universityShortNameEn;
    @XmlElement(name = "IsMONGiveBudget")
    protected int isMONGiveBudget;
    @XmlElement(name = "PublishOnWebSite")
    protected int publishOnWebSite;
    @XmlElement(name = "IsProgramDoubleDiploms")
    protected int isProgramDoubleDiploms;
    @XmlElement(name = "IsExpirimentKoeficient")
    protected int isExpirimentKoeficient;
    @XmlElement(name = "PersonCodeU_Boss")
    protected String personCodeUBoss;
    @XmlElement(name = "BossOrderNumber")
    protected String bossOrderNumber;
    @XmlElement(name = "BossOrderDate")
    protected String bossOrderDate;
    @XmlElement(name = "IPN")
    protected String ipn;
    @XmlElement(name = "Id_UniversitiesBossOrderOrganisation")
    protected int idUniversitiesBossOrderOrganisation;
    @XmlElement(name = "IsGoverningBody")
    protected int isGoverningBody;
    @XmlElement(name = "IsGoverningBodyDateEnd")
    protected String isGoverningBodyDateEnd;
    @XmlElement(name = "Id_UniversityGovernanceTypesCategory")
    protected int idUniversityGovernanceTypesCategory;
    @XmlElement(name = "Id_UniversityManagmentOrganisationsTypes")
    protected int idUniversityManagmentOrganisationsTypes;
    @XmlElement(name = "Id_UniversityKodeEarlyPreview")
    protected String idUniversityKodeEarlyPreview;

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
     * Gets the value of the idEducationType property.
     * 
     */
    public int getIdEducationType() {
        return idEducationType;
    }

    /**
     * Sets the value of the idEducationType property.
     * 
     */
    public void setIdEducationType(int value) {
        this.idEducationType = value;
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
     * Gets the value of the universityDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDateBegin() {
        return universityDateBegin;
    }

    /**
     * Sets the value of the universityDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDateBegin(String value) {
        this.universityDateBegin = value;
    }

    /**
     * Gets the value of the universityDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDateEnd() {
        return universityDateEnd;
    }

    /**
     * Sets the value of the universityDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDateEnd(String value) {
        this.universityDateEnd = value;
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
     *     {@link String }
     *     
     */
    public String getDateRegistration() {
        return dateRegistration;
    }

    /**
     * Sets the value of the dateRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRegistration(String value) {
        this.dateRegistration = value;
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
     * Gets the value of the universityBossEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossEMail() {
        return universityBossEMail;
    }

    /**
     * Sets the value of the universityBossEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossEMail(String value) {
        this.universityBossEMail = value;
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
     * Gets the value of the universityShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityShortName() {
        return universityShortName;
    }

    /**
     * Sets the value of the universityShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityShortName(String value) {
        this.universityShortName = value;
    }

    /**
     * Gets the value of the universityAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdress() {
        return universityAdress;
    }

    /**
     * Sets the value of the universityAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdress(String value) {
        this.universityAdress = value;
    }

    /**
     * Gets the value of the universityBossLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossLastName() {
        return universityBossLastName;
    }

    /**
     * Sets the value of the universityBossLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossLastName(String value) {
        this.universityBossLastName = value;
    }

    /**
     * Gets the value of the universityBossFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossFirstName() {
        return universityBossFirstName;
    }

    /**
     * Sets the value of the universityBossFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossFirstName(String value) {
        this.universityBossFirstName = value;
    }

    /**
     * Gets the value of the universityBossMidleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossMidleName() {
        return universityBossMidleName;
    }

    /**
     * Sets the value of the universityBossMidleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossMidleName(String value) {
        this.universityBossMidleName = value;
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
     * Gets the value of the houceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouceNum() {
        return houceNum;
    }

    /**
     * Sets the value of the houceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouceNum(String value) {
        this.houceNum = value;
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
     * Gets the value of the rolesPrefixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolesPrefixName() {
        return rolesPrefixName;
    }

    /**
     * Sets the value of the rolesPrefixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolesPrefixName(String value) {
        this.rolesPrefixName = value;
    }

    /**
     * Gets the value of the universityAdminLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminLogin() {
        return universityAdminLogin;
    }

    /**
     * Sets the value of the universityAdminLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminLogin(String value) {
        this.universityAdminLogin = value;
    }

    /**
     * Gets the value of the universityAdminPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminPassword() {
        return universityAdminPassword;
    }

    /**
     * Sets the value of the universityAdminPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminPassword(String value) {
        this.universityAdminPassword = value;
    }

    /**
     * Gets the value of the universityAdminFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminFIO() {
        return universityAdminFIO;
    }

    /**
     * Sets the value of the universityAdminFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminFIO(String value) {
        this.universityAdminFIO = value;
    }

    /**
     * Gets the value of the universityAdminEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminEmail() {
        return universityAdminEmail;
    }

    /**
     * Sets the value of the universityAdminEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminEmail(String value) {
        this.universityAdminEmail = value;
    }

    /**
     * Gets the value of the universityAdminWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminWorkPhone() {
        return universityAdminWorkPhone;
    }

    /**
     * Sets the value of the universityAdminWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminWorkPhone(String value) {
        this.universityAdminWorkPhone = value;
    }

    /**
     * Gets the value of the universityAdminMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminMobilePhone() {
        return universityAdminMobilePhone;
    }

    /**
     * Sets the value of the universityAdminMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminMobilePhone(String value) {
        this.universityAdminMobilePhone = value;
    }

    /**
     * Gets the value of the universityAdminWorkLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminWorkLevel() {
        return universityAdminWorkLevel;
    }

    /**
     * Sets the value of the universityAdminWorkLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminWorkLevel(String value) {
        this.universityAdminWorkLevel = value;
    }

    /**
     * Gets the value of the idUniversityGovernanceType property.
     * 
     */
    public int getIdUniversityGovernanceType() {
        return idUniversityGovernanceType;
    }

    /**
     * Sets the value of the idUniversityGovernanceType property.
     * 
     */
    public void setIdUniversityGovernanceType(int value) {
        this.idUniversityGovernanceType = value;
    }

    /**
     * Gets the value of the createMailboxPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateMailboxPassword() {
        return createMailboxPassword;
    }

    /**
     * Sets the value of the createMailboxPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateMailboxPassword(String value) {
        this.createMailboxPassword = value;
    }

    /**
     * Gets the value of the idUniversityTypeOfFinansing property.
     * 
     */
    public int getIdUniversityTypeOfFinansing() {
        return idUniversityTypeOfFinansing;
    }

    /**
     * Sets the value of the idUniversityTypeOfFinansing property.
     * 
     */
    public void setIdUniversityTypeOfFinansing(int value) {
        this.idUniversityTypeOfFinansing = value;
    }

    /**
     * Gets the value of the postIndexU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostIndexU() {
        return postIndexU;
    }

    /**
     * Sets the value of the postIndexU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostIndexU(String value) {
        this.postIndexU = value;
    }

    /**
     * Gets the value of the koatuuCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCodeU() {
        return koatuuCodeU;
    }

    /**
     * Sets the value of the koatuuCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCodeU(String value) {
        this.koatuuCodeU = value;
    }

    /**
     * Gets the value of the universityAdressU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdressU() {
        return universityAdressU;
    }

    /**
     * Sets the value of the universityAdressU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdressU(String value) {
        this.universityAdressU = value;
    }

    /**
     * Gets the value of the idStreetTypeU property.
     * 
     */
    public int getIdStreetTypeU() {
        return idStreetTypeU;
    }

    /**
     * Sets the value of the idStreetTypeU property.
     * 
     */
    public void setIdStreetTypeU(int value) {
        this.idStreetTypeU = value;
    }

    /**
     * Gets the value of the houceNumU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouceNumU() {
        return houceNumU;
    }

    /**
     * Sets the value of the houceNumU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouceNumU(String value) {
        this.houceNumU = value;
    }

    /**
     * Gets the value of the idUniversityJuristicalType property.
     * 
     */
    public int getIdUniversityJuristicalType() {
        return idUniversityJuristicalType;
    }

    /**
     * Sets the value of the idUniversityJuristicalType property.
     * 
     */
    public void setIdUniversityJuristicalType(int value) {
        this.idUniversityJuristicalType = value;
    }

    /**
     * Gets the value of the idUniversityBossOperatedType property.
     * 
     */
    public int getIdUniversityBossOperatedType() {
        return idUniversityBossOperatedType;
    }

    /**
     * Sets the value of the idUniversityBossOperatedType property.
     * 
     */
    public void setIdUniversityBossOperatedType(int value) {
        this.idUniversityBossOperatedType = value;
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
     * Gets the value of the warrantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantNumber() {
        return warrantNumber;
    }

    /**
     * Sets the value of the warrantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantNumber(String value) {
        this.warrantNumber = value;
    }

    /**
     * Gets the value of the warrantDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantDate() {
        return warrantDate;
    }

    /**
     * Sets the value of the warrantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantDate(String value) {
        this.warrantDate = value;
    }

    /**
     * Gets the value of the idUniversityType property.
     * 
     */
    public int getIdUniversityType() {
        return idUniversityType;
    }

    /**
     * Sets the value of the idUniversityType property.
     * 
     */
    public void setIdUniversityType(int value) {
        this.idUniversityType = value;
    }

    /**
     * Gets the value of the ptnzLevel property.
     * 
     */
    public int getPtnzLevel() {
        return ptnzLevel;
    }

    /**
     * Sets the value of the ptnzLevel property.
     * 
     */
    public void setPtnzLevel(int value) {
        this.ptnzLevel = value;
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
     * Gets the value of the idUniversityParentOrganisation property.
     * 
     */
    public int getIdUniversityParentOrganisation() {
        return idUniversityParentOrganisation;
    }

    /**
     * Sets the value of the idUniversityParentOrganisation property.
     * 
     */
    public void setIdUniversityParentOrganisation(int value) {
        this.idUniversityParentOrganisation = value;
    }

    /**
     * Gets the value of the idUniversityRoleType property.
     * 
     */
    public int getIdUniversityRoleType() {
        return idUniversityRoleType;
    }

    /**
     * Sets the value of the idUniversityRoleType property.
     * 
     */
    public void setIdUniversityRoleType(int value) {
        this.idUniversityRoleType = value;
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
     * Gets the value of the universityFullNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameEn() {
        return universityFullNameEn;
    }

    /**
     * Sets the value of the universityFullNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameEn(String value) {
        this.universityFullNameEn = value;
    }

    /**
     * Gets the value of the universityShortNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityShortNameEn() {
        return universityShortNameEn;
    }

    /**
     * Sets the value of the universityShortNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityShortNameEn(String value) {
        this.universityShortNameEn = value;
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
     * Gets the value of the publishOnWebSite property.
     * 
     */
    public int getPublishOnWebSite() {
        return publishOnWebSite;
    }

    /**
     * Sets the value of the publishOnWebSite property.
     * 
     */
    public void setPublishOnWebSite(int value) {
        this.publishOnWebSite = value;
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
     * Gets the value of the isExpirimentKoeficient property.
     * 
     */
    public int getIsExpirimentKoeficient() {
        return isExpirimentKoeficient;
    }

    /**
     * Sets the value of the isExpirimentKoeficient property.
     * 
     */
    public void setIsExpirimentKoeficient(int value) {
        this.isExpirimentKoeficient = value;
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
     * Gets the value of the bossOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossOrderNumber() {
        return bossOrderNumber;
    }

    /**
     * Sets the value of the bossOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossOrderNumber(String value) {
        this.bossOrderNumber = value;
    }

    /**
     * Gets the value of the bossOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossOrderDate() {
        return bossOrderDate;
    }

    /**
     * Sets the value of the bossOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossOrderDate(String value) {
        this.bossOrderDate = value;
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
     * Gets the value of the idUniversitiesBossOrderOrganisation property.
     * 
     */
    public int getIdUniversitiesBossOrderOrganisation() {
        return idUniversitiesBossOrderOrganisation;
    }

    /**
     * Sets the value of the idUniversitiesBossOrderOrganisation property.
     * 
     */
    public void setIdUniversitiesBossOrderOrganisation(int value) {
        this.idUniversitiesBossOrderOrganisation = value;
    }

    /**
     * Gets the value of the isGoverningBody property.
     * 
     */
    public int getIsGoverningBody() {
        return isGoverningBody;
    }

    /**
     * Sets the value of the isGoverningBody property.
     * 
     */
    public void setIsGoverningBody(int value) {
        this.isGoverningBody = value;
    }

    /**
     * Gets the value of the isGoverningBodyDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsGoverningBodyDateEnd() {
        return isGoverningBodyDateEnd;
    }

    /**
     * Sets the value of the isGoverningBodyDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsGoverningBodyDateEnd(String value) {
        this.isGoverningBodyDateEnd = value;
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
     * Gets the value of the idUniversityKodeEarlyPreview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUniversityKodeEarlyPreview() {
        return idUniversityKodeEarlyPreview;
    }

    /**
     * Sets the value of the idUniversityKodeEarlyPreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUniversityKodeEarlyPreview(String value) {
        this.idUniversityKodeEarlyPreview = value;
    }

}
