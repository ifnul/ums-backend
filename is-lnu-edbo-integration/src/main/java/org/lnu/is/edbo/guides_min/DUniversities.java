
package org.lnu.is.edbo.guides_min;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateRegistration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StreetTypeFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetTypeShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossMidleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationClass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationOrganizationFullTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationOrganizationShortTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationOrganizationClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityAcreditatin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityAcreditatinType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiyAcreditatinTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsUniversityVerifed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExistNeedVerification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityGovernanceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGovernanceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityRegistration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityRegistrationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityRegistrationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityRegistrationDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityRegistrationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityRegistrationDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityRegistrationIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityRegistrationusersCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityTypeOfFinansing" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityTypeOfFinansingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKodeParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityPanent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndexU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdressU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetTypeU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HouceNumU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_KOATUUU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUFullNameU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetTypeFullNameU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AllowAccessFromParetn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniverityFacultetNumberKode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityJuristicalType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityJuristicalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityBossOperatedType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBossOperatedTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UniversityCloseStatusTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCloseStatusTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Give23Nk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GiveRaiting" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PtnzLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsPerepidgotovka" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParentOrganisationKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityParentOrganisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameParentOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityRoleType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityRoleTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsResech" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnableEducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsMONGiveBudget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PublishOnWebSite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsProgramDoubleDiploms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsExpirimentKoeficient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU_Boss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossOrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversitiesBossOrderOrganisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesBossOrderOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsGoverningBody" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsGoverningBodyDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UniversityGovernanceTypesCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGovernanceTypesCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityManagmentOrganisationsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityManagmentOrganisationsTypesTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKodeEarlyPreview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityKodeEarlyPreview" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameEarlyPreview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnableDocuemntEWithoutPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsExistVariatDisc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsCustomSpecNameInEDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversities", propOrder = {
    "idUniversity",
    "universityKode",
    "universityDateBegin",
    "universityDateEnd",
    "edrpo",
    "dateRegistration",
    "universityPhone",
    "universityEMail",
    "website",
    "universityBossPhone",
    "universityBossEMail",
    "idUniversityName",
    "universityFullName",
    "universityShortName",
    "koatuuCode",
    "postIndex",
    "koatuuFullName",
    "idStreetType",
    "streetTypeFullName",
    "streetTypeShortName",
    "universityAdress",
    "houceNum",
    "universityBossLastName",
    "universityBossFirstName",
    "universityBossMidleName",
    "idEducationType",
    "idEducationClass",
    "educationOrganizationFullTypeName",
    "educationOrganizationShortTypeName",
    "educationOrganizationClassName",
    "idLanguage",
    "idUniversityAcreditatin",
    "idUniversityAcreditatinType",
    "universitiyAcreditatinTypeCode",
    "isUniversityVerifed",
    "existNeedVerification",
    "idUniversityGovernanceType",
    "universityGovernanceTypeName",
    "idUniversityRegistration",
    "idUniversityRegistrationType",
    "universityRegistrationTypeName",
    "idRegulationDocument",
    "universityRegistrationDateBegin",
    "universityRegistrationDateEnd",
    "universityRegistrationDateLastChange",
    "universityRegistrationIsActive",
    "universityRegistrationusersCount",
    "idUniversityTypeOfFinansing",
    "universityTypeOfFinansingName",
    "universityKodeParent",
    "idUniversityPanent",
    "universityFullNameParent",
    "koatuuCodeU",
    "postIndexU",
    "universityAdressU",
    "idStreetTypeU",
    "houceNumU",
    "idKOATUUU",
    "koatuuFullNameU",
    "streetTypeFullNameU",
    "closed",
    "allowAccessFromParetn",
    "univerityFacultetNumberKode",
    "universityFacultetFullName",
    "idUniversityJuristicalType",
    "universityJuristicalTypeName",
    "idUniversityBossOperatedType",
    "universityBossOperatedTypeName",
    "bossPost",
    "warrantNumber",
    "warrantDate",
    "idUniversityCloseStatusTypes",
    "universityCloseStatusTypesName",
    "give23Nk",
    "giveRaiting",
    "idUniversityType",
    "universityTypeName",
    "ptnzLevel",
    "isPerepidgotovka",
    "parentOrganisationKode",
    "idUniversityParentOrganisation",
    "universityFullNameParentOrganisation",
    "idUniversityRoleType",
    "universityRoleTypeName",
    "isResech",
    "universityFullNameEn",
    "universityShortNameEn",
    "enableEducationalCycles",
    "isMONGiveBudget",
    "publishOnWebSite",
    "isProgramDoubleDiploms",
    "isExpirimentKoeficient",
    "personCodeUBoss",
    "bossOrderNumber",
    "bossOrderDate",
    "ipn",
    "idUniversitiesBossOrderOrganisation",
    "universitiesBossOrderOrganisationName",
    "isGoverningBody",
    "isGoverningBodyDateEnd",
    "idUniversityGovernanceTypesCategory",
    "universityGovernanceTypesCategory",
    "idUniversityManagmentOrganisationsTypes",
    "universityManagmentOrganisationsTypesTypes",
    "universityKodeEarlyPreview",
    "idUniversityKodeEarlyPreview",
    "universityFullNameEarlyPreview",
    "enableDocuemntEWithoutPersons",
    "isExistVariatDisc",
    "isCustomSpecNameInEDocuments"
})
public class DUniversities {

    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityDateBegin;
    @XmlElement(name = "UniversityDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityDateEnd;
    @XmlElement(name = "EDRPO")
    protected String edrpo;
    @XmlElement(name = "DateRegistration", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRegistration;
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
    @XmlElement(name = "Id_UniversityName")
    protected int idUniversityName;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityShortName")
    protected String universityShortName;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "PostIndex")
    protected String postIndex;
    @XmlElement(name = "KOATUUFullName")
    protected String koatuuFullName;
    @XmlElement(name = "Id_StreetType")
    protected int idStreetType;
    @XmlElement(name = "StreetTypeFullName")
    protected String streetTypeFullName;
    @XmlElement(name = "StreetTypeShortName")
    protected String streetTypeShortName;
    @XmlElement(name = "UniversityAdress")
    protected String universityAdress;
    @XmlElement(name = "HouceNum")
    protected String houceNum;
    @XmlElement(name = "UniversityBossLastName")
    protected String universityBossLastName;
    @XmlElement(name = "UniversityBossFirstName")
    protected String universityBossFirstName;
    @XmlElement(name = "UniversityBossMidleName")
    protected String universityBossMidleName;
    @XmlElement(name = "Id_EducationType")
    protected int idEducationType;
    @XmlElement(name = "Id_EducationClass")
    protected int idEducationClass;
    @XmlElement(name = "EducationOrganizationFullTypeName")
    protected String educationOrganizationFullTypeName;
    @XmlElement(name = "EducationOrganizationShortTypeName")
    protected String educationOrganizationShortTypeName;
    @XmlElement(name = "EducationOrganizationClassName")
    protected String educationOrganizationClassName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_UniversityAcreditatin")
    protected int idUniversityAcreditatin;
    @XmlElement(name = "Id_UniversityAcreditatinType")
    protected int idUniversityAcreditatinType;
    @XmlElement(name = "UniversitiyAcreditatinTypeCode")
    protected String universitiyAcreditatinTypeCode;
    @XmlElement(name = "IsUniversityVerifed")
    protected int isUniversityVerifed;
    @XmlElement(name = "ExistNeedVerification")
    protected int existNeedVerification;
    @XmlElement(name = "Id_UniversityGovernanceType")
    protected int idUniversityGovernanceType;
    @XmlElement(name = "UniversityGovernanceTypeName")
    protected String universityGovernanceTypeName;
    @XmlElement(name = "Id_UniversityRegistration")
    protected int idUniversityRegistration;
    @XmlElement(name = "Id_UniversityRegistrationType")
    protected int idUniversityRegistrationType;
    @XmlElement(name = "UniversityRegistrationTypeName")
    protected String universityRegistrationTypeName;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "UniversityRegistrationDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityRegistrationDateBegin;
    @XmlElement(name = "UniversityRegistrationDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityRegistrationDateEnd;
    @XmlElement(name = "UniversityRegistrationDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityRegistrationDateLastChange;
    @XmlElement(name = "UniversityRegistrationIsActive")
    protected int universityRegistrationIsActive;
    @XmlElement(name = "UniversityRegistrationusersCount")
    protected int universityRegistrationusersCount;
    @XmlElement(name = "Id_UniversityTypeOfFinansing")
    protected int idUniversityTypeOfFinansing;
    @XmlElement(name = "UniversityTypeOfFinansingName")
    protected String universityTypeOfFinansingName;
    @XmlElement(name = "UniversityKodeParent")
    protected String universityKodeParent;
    @XmlElement(name = "Id_UniversityPanent")
    protected int idUniversityPanent;
    @XmlElement(name = "UniversityFullNameParent")
    protected String universityFullNameParent;
    @XmlElement(name = "KOATUUCodeU")
    protected String koatuuCodeU;
    @XmlElement(name = "PostIndexU")
    protected String postIndexU;
    @XmlElement(name = "UniversityAdressU")
    protected String universityAdressU;
    @XmlElement(name = "Id_StreetTypeU")
    protected int idStreetTypeU;
    @XmlElement(name = "HouceNumU")
    protected String houceNumU;
    @XmlElement(name = "Id_KOATUUU")
    protected int idKOATUUU;
    @XmlElement(name = "KOATUUFullNameU")
    protected String koatuuFullNameU;
    @XmlElement(name = "StreetTypeFullNameU")
    protected String streetTypeFullNameU;
    @XmlElement(name = "Closed")
    protected int closed;
    @XmlElement(name = "AllowAccessFromParetn")
    protected int allowAccessFromParetn;
    @XmlElement(name = "UniverityFacultetNumberKode")
    protected int univerityFacultetNumberKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "Id_UniversityJuristicalType")
    protected int idUniversityJuristicalType;
    @XmlElement(name = "UniversityJuristicalTypeName")
    protected String universityJuristicalTypeName;
    @XmlElement(name = "Id_UniversityBossOperatedType")
    protected int idUniversityBossOperatedType;
    @XmlElement(name = "UniversityBossOperatedTypeName")
    protected String universityBossOperatedTypeName;
    @XmlElement(name = "BossPost")
    protected String bossPost;
    @XmlElement(name = "WarrantNumber")
    protected String warrantNumber;
    @XmlElement(name = "WarrantDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar warrantDate;
    @XmlElement(name = "Id_UniversityCloseStatusTypes")
    protected int idUniversityCloseStatusTypes;
    @XmlElement(name = "UniversityCloseStatusTypesName")
    protected String universityCloseStatusTypesName;
    @XmlElement(name = "Give23Nk")
    protected int give23Nk;
    @XmlElement(name = "GiveRaiting")
    protected int giveRaiting;
    @XmlElement(name = "Id_UniversityType")
    protected int idUniversityType;
    @XmlElement(name = "UniversityTypeName")
    protected String universityTypeName;
    @XmlElement(name = "PtnzLevel")
    protected int ptnzLevel;
    @XmlElement(name = "IsPerepidgotovka")
    protected int isPerepidgotovka;
    @XmlElement(name = "ParentOrganisationKode")
    protected String parentOrganisationKode;
    @XmlElement(name = "Id_UniversityParentOrganisation")
    protected int idUniversityParentOrganisation;
    @XmlElement(name = "UniversityFullNameParentOrganisation")
    protected String universityFullNameParentOrganisation;
    @XmlElement(name = "Id_UniversityRoleType")
    protected int idUniversityRoleType;
    @XmlElement(name = "UniversityRoleTypeName")
    protected String universityRoleTypeName;
    @XmlElement(name = "IsResech")
    protected int isResech;
    @XmlElement(name = "UniversityFullNameEn")
    protected String universityFullNameEn;
    @XmlElement(name = "UniversityShortNameEn")
    protected String universityShortNameEn;
    @XmlElement(name = "EnableEducationalCycles")
    protected int enableEducationalCycles;
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
    @XmlElement(name = "BossOrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bossOrderDate;
    @XmlElement(name = "IPN")
    protected String ipn;
    @XmlElement(name = "Id_UniversitiesBossOrderOrganisation")
    protected int idUniversitiesBossOrderOrganisation;
    @XmlElement(name = "UniversitiesBossOrderOrganisationName")
    protected String universitiesBossOrderOrganisationName;
    @XmlElement(name = "IsGoverningBody")
    protected int isGoverningBody;
    @XmlElement(name = "IsGoverningBodyDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar isGoverningBodyDateEnd;
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
    @XmlElement(name = "EnableDocuemntEWithoutPersons")
    protected int enableDocuemntEWithoutPersons;
    @XmlElement(name = "IsExistVariatDisc")
    protected int isExistVariatDisc;
    @XmlElement(name = "IsCustomSpecNameInEDocuments")
    protected int isCustomSpecNameInEDocuments;

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
     * Gets the value of the universityDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityDateBegin() {
        return universityDateBegin;
    }

    /**
     * Sets the value of the universityDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityDateBegin(XMLGregorianCalendar value) {
        this.universityDateBegin = value;
    }

    /**
     * Gets the value of the universityDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityDateEnd() {
        return universityDateEnd;
    }

    /**
     * Sets the value of the universityDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityDateEnd(XMLGregorianCalendar value) {
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
     * Gets the value of the idUniversityName property.
     * 
     */
    public int getIdUniversityName() {
        return idUniversityName;
    }

    /**
     * Sets the value of the idUniversityName property.
     * 
     */
    public void setIdUniversityName(int value) {
        this.idUniversityName = value;
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
     * Gets the value of the idEducationClass property.
     * 
     */
    public int getIdEducationClass() {
        return idEducationClass;
    }

    /**
     * Sets the value of the idEducationClass property.
     * 
     */
    public void setIdEducationClass(int value) {
        this.idEducationClass = value;
    }

    /**
     * Gets the value of the educationOrganizationFullTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationFullTypeName() {
        return educationOrganizationFullTypeName;
    }

    /**
     * Sets the value of the educationOrganizationFullTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationFullTypeName(String value) {
        this.educationOrganizationFullTypeName = value;
    }

    /**
     * Gets the value of the educationOrganizationShortTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationShortTypeName() {
        return educationOrganizationShortTypeName;
    }

    /**
     * Sets the value of the educationOrganizationShortTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationShortTypeName(String value) {
        this.educationOrganizationShortTypeName = value;
    }

    /**
     * Gets the value of the educationOrganizationClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationClassName() {
        return educationOrganizationClassName;
    }

    /**
     * Sets the value of the educationOrganizationClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationClassName(String value) {
        this.educationOrganizationClassName = value;
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
     * Gets the value of the idUniversityAcreditatin property.
     * 
     */
    public int getIdUniversityAcreditatin() {
        return idUniversityAcreditatin;
    }

    /**
     * Sets the value of the idUniversityAcreditatin property.
     * 
     */
    public void setIdUniversityAcreditatin(int value) {
        this.idUniversityAcreditatin = value;
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
     * Gets the value of the isUniversityVerifed property.
     * 
     */
    public int getIsUniversityVerifed() {
        return isUniversityVerifed;
    }

    /**
     * Sets the value of the isUniversityVerifed property.
     * 
     */
    public void setIsUniversityVerifed(int value) {
        this.isUniversityVerifed = value;
    }

    /**
     * Gets the value of the existNeedVerification property.
     * 
     */
    public int getExistNeedVerification() {
        return existNeedVerification;
    }

    /**
     * Sets the value of the existNeedVerification property.
     * 
     */
    public void setExistNeedVerification(int value) {
        this.existNeedVerification = value;
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
     * Gets the value of the idUniversityRegistration property.
     * 
     */
    public int getIdUniversityRegistration() {
        return idUniversityRegistration;
    }

    /**
     * Sets the value of the idUniversityRegistration property.
     * 
     */
    public void setIdUniversityRegistration(int value) {
        this.idUniversityRegistration = value;
    }

    /**
     * Gets the value of the idUniversityRegistrationType property.
     * 
     */
    public int getIdUniversityRegistrationType() {
        return idUniversityRegistrationType;
    }

    /**
     * Sets the value of the idUniversityRegistrationType property.
     * 
     */
    public void setIdUniversityRegistrationType(int value) {
        this.idUniversityRegistrationType = value;
    }

    /**
     * Gets the value of the universityRegistrationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityRegistrationTypeName() {
        return universityRegistrationTypeName;
    }

    /**
     * Sets the value of the universityRegistrationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityRegistrationTypeName(String value) {
        this.universityRegistrationTypeName = value;
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
     * Gets the value of the universityRegistrationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityRegistrationDateBegin() {
        return universityRegistrationDateBegin;
    }

    /**
     * Sets the value of the universityRegistrationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityRegistrationDateBegin(XMLGregorianCalendar value) {
        this.universityRegistrationDateBegin = value;
    }

    /**
     * Gets the value of the universityRegistrationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityRegistrationDateEnd() {
        return universityRegistrationDateEnd;
    }

    /**
     * Sets the value of the universityRegistrationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityRegistrationDateEnd(XMLGregorianCalendar value) {
        this.universityRegistrationDateEnd = value;
    }

    /**
     * Gets the value of the universityRegistrationDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityRegistrationDateLastChange() {
        return universityRegistrationDateLastChange;
    }

    /**
     * Sets the value of the universityRegistrationDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityRegistrationDateLastChange(XMLGregorianCalendar value) {
        this.universityRegistrationDateLastChange = value;
    }

    /**
     * Gets the value of the universityRegistrationIsActive property.
     * 
     */
    public int getUniversityRegistrationIsActive() {
        return universityRegistrationIsActive;
    }

    /**
     * Sets the value of the universityRegistrationIsActive property.
     * 
     */
    public void setUniversityRegistrationIsActive(int value) {
        this.universityRegistrationIsActive = value;
    }

    /**
     * Gets the value of the universityRegistrationusersCount property.
     * 
     */
    public int getUniversityRegistrationusersCount() {
        return universityRegistrationusersCount;
    }

    /**
     * Sets the value of the universityRegistrationusersCount property.
     * 
     */
    public void setUniversityRegistrationusersCount(int value) {
        this.universityRegistrationusersCount = value;
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
     * Gets the value of the universityTypeOfFinansingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityTypeOfFinansingName() {
        return universityTypeOfFinansingName;
    }

    /**
     * Sets the value of the universityTypeOfFinansingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityTypeOfFinansingName(String value) {
        this.universityTypeOfFinansingName = value;
    }

    /**
     * Gets the value of the universityKodeParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeParent() {
        return universityKodeParent;
    }

    /**
     * Sets the value of the universityKodeParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeParent(String value) {
        this.universityKodeParent = value;
    }

    /**
     * Gets the value of the idUniversityPanent property.
     * 
     */
    public int getIdUniversityPanent() {
        return idUniversityPanent;
    }

    /**
     * Sets the value of the idUniversityPanent property.
     * 
     */
    public void setIdUniversityPanent(int value) {
        this.idUniversityPanent = value;
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
     * Gets the value of the idKOATUUU property.
     * 
     */
    public int getIdKOATUUU() {
        return idKOATUUU;
    }

    /**
     * Sets the value of the idKOATUUU property.
     * 
     */
    public void setIdKOATUUU(int value) {
        this.idKOATUUU = value;
    }

    /**
     * Gets the value of the koatuuFullNameU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUFullNameU() {
        return koatuuFullNameU;
    }

    /**
     * Sets the value of the koatuuFullNameU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUFullNameU(String value) {
        this.koatuuFullNameU = value;
    }

    /**
     * Gets the value of the streetTypeFullNameU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTypeFullNameU() {
        return streetTypeFullNameU;
    }

    /**
     * Sets the value of the streetTypeFullNameU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTypeFullNameU(String value) {
        this.streetTypeFullNameU = value;
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
     * Gets the value of the allowAccessFromParetn property.
     * 
     */
    public int getAllowAccessFromParetn() {
        return allowAccessFromParetn;
    }

    /**
     * Sets the value of the allowAccessFromParetn property.
     * 
     */
    public void setAllowAccessFromParetn(int value) {
        this.allowAccessFromParetn = value;
    }

    /**
     * Gets the value of the univerityFacultetNumberKode property.
     * 
     */
    public int getUniverityFacultetNumberKode() {
        return univerityFacultetNumberKode;
    }

    /**
     * Sets the value of the univerityFacultetNumberKode property.
     * 
     */
    public void setUniverityFacultetNumberKode(int value) {
        this.univerityFacultetNumberKode = value;
    }

    /**
     * Gets the value of the universityFacultetFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullName() {
        return universityFacultetFullName;
    }

    /**
     * Sets the value of the universityFacultetFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullName(String value) {
        this.universityFacultetFullName = value;
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
     * Gets the value of the universityJuristicalTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityJuristicalTypeName() {
        return universityJuristicalTypeName;
    }

    /**
     * Sets the value of the universityJuristicalTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityJuristicalTypeName(String value) {
        this.universityJuristicalTypeName = value;
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
     * Gets the value of the universityBossOperatedTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossOperatedTypeName() {
        return universityBossOperatedTypeName;
    }

    /**
     * Sets the value of the universityBossOperatedTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossOperatedTypeName(String value) {
        this.universityBossOperatedTypeName = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWarrantDate() {
        return warrantDate;
    }

    /**
     * Sets the value of the warrantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWarrantDate(XMLGregorianCalendar value) {
        this.warrantDate = value;
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
     * Gets the value of the give23Nk property.
     * 
     */
    public int getGive23Nk() {
        return give23Nk;
    }

    /**
     * Sets the value of the give23Nk property.
     * 
     */
    public void setGive23Nk(int value) {
        this.give23Nk = value;
    }

    /**
     * Gets the value of the giveRaiting property.
     * 
     */
    public int getGiveRaiting() {
        return giveRaiting;
    }

    /**
     * Sets the value of the giveRaiting property.
     * 
     */
    public void setGiveRaiting(int value) {
        this.giveRaiting = value;
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
     * Gets the value of the parentOrganisationKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrganisationKode() {
        return parentOrganisationKode;
    }

    /**
     * Sets the value of the parentOrganisationKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrganisationKode(String value) {
        this.parentOrganisationKode = value;
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
     * Gets the value of the universityFullNameParentOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameParentOrganisation() {
        return universityFullNameParentOrganisation;
    }

    /**
     * Sets the value of the universityFullNameParentOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameParentOrganisation(String value) {
        this.universityFullNameParentOrganisation = value;
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
     * Gets the value of the universityRoleTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityRoleTypeName() {
        return universityRoleTypeName;
    }

    /**
     * Sets the value of the universityRoleTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityRoleTypeName(String value) {
        this.universityRoleTypeName = value;
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
     * Gets the value of the enableEducationalCycles property.
     * 
     */
    public int getEnableEducationalCycles() {
        return enableEducationalCycles;
    }

    /**
     * Sets the value of the enableEducationalCycles property.
     * 
     */
    public void setEnableEducationalCycles(int value) {
        this.enableEducationalCycles = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBossOrderDate() {
        return bossOrderDate;
    }

    /**
     * Sets the value of the bossOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBossOrderDate(XMLGregorianCalendar value) {
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
     * Gets the value of the universitiesBossOrderOrganisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesBossOrderOrganisationName() {
        return universitiesBossOrderOrganisationName;
    }

    /**
     * Sets the value of the universitiesBossOrderOrganisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesBossOrderOrganisationName(String value) {
        this.universitiesBossOrderOrganisationName = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsGoverningBodyDateEnd() {
        return isGoverningBodyDateEnd;
    }

    /**
     * Sets the value of the isGoverningBodyDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsGoverningBodyDateEnd(XMLGregorianCalendar value) {
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
     * Gets the value of the enableDocuemntEWithoutPersons property.
     * 
     */
    public int getEnableDocuemntEWithoutPersons() {
        return enableDocuemntEWithoutPersons;
    }

    /**
     * Sets the value of the enableDocuemntEWithoutPersons property.
     * 
     */
    public void setEnableDocuemntEWithoutPersons(int value) {
        this.enableDocuemntEWithoutPersons = value;
    }

    /**
     * Gets the value of the isExistVariatDisc property.
     * 
     */
    public int getIsExistVariatDisc() {
        return isExistVariatDisc;
    }

    /**
     * Sets the value of the isExistVariatDisc property.
     * 
     */
    public void setIsExistVariatDisc(int value) {
        this.isExistVariatDisc = value;
    }

    /**
     * Gets the value of the isCustomSpecNameInEDocuments property.
     * 
     */
    public int getIsCustomSpecNameInEDocuments() {
        return isCustomSpecNameInEDocuments;
    }

    /**
     * Sets the value of the isCustomSpecNameInEDocuments property.
     * 
     */
    public void setIsCustomSpecNameInEDocuments(int value) {
        this.isCustomSpecNameInEDocuments = value;
    }

}
