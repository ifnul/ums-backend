
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
 *         &lt;element name="Id_AcademicAttestationCase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUCode_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationDegreType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicRankType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KafendraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName_dative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName_dative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIddleName_dative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExperienceResearch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KandidatYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KandidatDiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KandidatDiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kandidat_ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kandidat_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Doctor_Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Doctor_DiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doctor_DiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doctor_ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doctor_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SNS_Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SNS_DiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNS_DiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNS_AcademicRankType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SNS_ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNS_KafendaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Docent_DiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_DiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_AcademicRankType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Docent_ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_KafendaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProceedingsFor3Years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Opis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearOfBirth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAcademicAttestationCase",
    "idCertifyingAgencies",
    "koatuuCodeRegion",
    "universityFullName",
    "idAcademicEducationDegreType",
    "idAcademicRank",
    "idAcademicRankType",
    "scienceSpecialityCode",
    "kafendraName",
    "personCodeU",
    "lastName",
    "firstName",
    "mIddleName",
    "lastNameDative",
    "firstNameDative",
    "mIddleNameDative",
    "nationality",
    "idPersonSex",
    "age",
    "workOrganization",
    "workLevel",
    "workLength",
    "experienceResearch",
    "kandidatYear",
    "kandidatDiplomSeries",
    "kandidatDiplomNumber",
    "kandidatScienceSpecialityCode",
    "kandidatIdAcademicEducationDegreDetailType",
    "doctorYear",
    "doctorDiplomSeries",
    "doctorDiplomNumber",
    "doctorScienceSpecialityCode",
    "doctorIdAcademicEducationDegreDetailType",
    "snsYear",
    "snsDiplomSeries",
    "snsDiplomNumber",
    "snsAcademicRankType",
    "snsScienceSpecialityCode",
    "snsKafendaName",
    "docentYear",
    "docentDiplomSeries",
    "docentDiplomNumber",
    "docentAcademicRankType",
    "docentScienceSpecialityCode",
    "docentKafendaName",
    "proceedingsFor3Years",
    "opis",
    "description",
    "caseDate",
    "caseNumber",
    "yearOfBirth",
    "attestatSeries",
    "attestatNumber"
})
@XmlRootElement(name = "AcademicAttestationCaseEdit")
public class AcademicAttestationCaseEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_AcademicAttestationCase")
    protected int idAcademicAttestationCase;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "KOATUUCode_Region")
    protected String koatuuCodeRegion;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Id_AcademicEducationDegreType")
    protected int idAcademicEducationDegreType;
    @XmlElement(name = "Id_AcademicRank")
    protected int idAcademicRank;
    @XmlElement(name = "Id_AcademicRankType")
    protected int idAcademicRankType;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "KafendraName")
    protected String kafendraName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MIddleName")
    protected String mIddleName;
    @XmlElement(name = "LastName_dative")
    protected String lastNameDative;
    @XmlElement(name = "FirstName_dative")
    protected String firstNameDative;
    @XmlElement(name = "MIddleName_dative")
    protected String mIddleNameDative;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "Age")
    protected int age;
    @XmlElement(name = "WorkOrganization")
    protected String workOrganization;
    @XmlElement(name = "WorkLevel")
    protected String workLevel;
    @XmlElement(name = "WorkLength")
    protected String workLength;
    @XmlElement(name = "ExperienceResearch")
    protected int experienceResearch;
    @XmlElement(name = "KandidatYear")
    protected int kandidatYear;
    @XmlElement(name = "KandidatDiplomSeries")
    protected String kandidatDiplomSeries;
    @XmlElement(name = "KandidatDiplomNumber")
    protected String kandidatDiplomNumber;
    @XmlElement(name = "Kandidat_ScienceSpecialityCode")
    protected String kandidatScienceSpecialityCode;
    @XmlElement(name = "Kandidat_Id_AcademicEducationDegreDetailType")
    protected int kandidatIdAcademicEducationDegreDetailType;
    @XmlElement(name = "Doctor_Year")
    protected int doctorYear;
    @XmlElement(name = "Doctor_DiplomSeries")
    protected String doctorDiplomSeries;
    @XmlElement(name = "Doctor_DiplomNumber")
    protected String doctorDiplomNumber;
    @XmlElement(name = "Doctor_ScienceSpecialityCode")
    protected String doctorScienceSpecialityCode;
    @XmlElement(name = "Doctor_Id_AcademicEducationDegreDetailType")
    protected int doctorIdAcademicEducationDegreDetailType;
    @XmlElement(name = "SNS_Year")
    protected int snsYear;
    @XmlElement(name = "SNS_DiplomSeries")
    protected String snsDiplomSeries;
    @XmlElement(name = "SNS_DiplomNumber")
    protected String snsDiplomNumber;
    @XmlElement(name = "SNS_AcademicRankType")
    protected int snsAcademicRankType;
    @XmlElement(name = "SNS_ScienceSpecialityCode")
    protected String snsScienceSpecialityCode;
    @XmlElement(name = "SNS_KafendaName")
    protected String snsKafendaName;
    @XmlElement(name = "Docent_Year")
    protected int docentYear;
    @XmlElement(name = "Docent_DiplomSeries")
    protected String docentDiplomSeries;
    @XmlElement(name = "Docent_DiplomNumber")
    protected String docentDiplomNumber;
    @XmlElement(name = "Docent_AcademicRankType")
    protected int docentAcademicRankType;
    @XmlElement(name = "Docent_ScienceSpecialityCode")
    protected String docentScienceSpecialityCode;
    @XmlElement(name = "Docent_KafendaName")
    protected String docentKafendaName;
    @XmlElement(name = "ProceedingsFor3Years")
    protected int proceedingsFor3Years;
    @XmlElement(name = "Opis")
    protected String opis;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CaseDate")
    protected String caseDate;
    @XmlElement(name = "CaseNumber")
    protected String caseNumber;
    @XmlElement(name = "YearOfBirth")
    protected int yearOfBirth;
    @XmlElement(name = "AttestatSeries")
    protected String attestatSeries;
    @XmlElement(name = "AttestatNumber")
    protected String attestatNumber;

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
     * Gets the value of the idAcademicAttestationCase property.
     * 
     */
    public int getIdAcademicAttestationCase() {
        return idAcademicAttestationCase;
    }

    /**
     * Sets the value of the idAcademicAttestationCase property.
     * 
     */
    public void setIdAcademicAttestationCase(int value) {
        this.idAcademicAttestationCase = value;
    }

    /**
     * Gets the value of the idCertifyingAgencies property.
     * 
     */
    public int getIdCertifyingAgencies() {
        return idCertifyingAgencies;
    }

    /**
     * Sets the value of the idCertifyingAgencies property.
     * 
     */
    public void setIdCertifyingAgencies(int value) {
        this.idCertifyingAgencies = value;
    }

    /**
     * Gets the value of the koatuuCodeRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCodeRegion() {
        return koatuuCodeRegion;
    }

    /**
     * Sets the value of the koatuuCodeRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCodeRegion(String value) {
        this.koatuuCodeRegion = value;
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
     * Gets the value of the idAcademicEducationDegreType property.
     * 
     */
    public int getIdAcademicEducationDegreType() {
        return idAcademicEducationDegreType;
    }

    /**
     * Sets the value of the idAcademicEducationDegreType property.
     * 
     */
    public void setIdAcademicEducationDegreType(int value) {
        this.idAcademicEducationDegreType = value;
    }

    /**
     * Gets the value of the idAcademicRank property.
     * 
     */
    public int getIdAcademicRank() {
        return idAcademicRank;
    }

    /**
     * Sets the value of the idAcademicRank property.
     * 
     */
    public void setIdAcademicRank(int value) {
        this.idAcademicRank = value;
    }

    /**
     * Gets the value of the idAcademicRankType property.
     * 
     */
    public int getIdAcademicRankType() {
        return idAcademicRankType;
    }

    /**
     * Sets the value of the idAcademicRankType property.
     * 
     */
    public void setIdAcademicRankType(int value) {
        this.idAcademicRankType = value;
    }

    /**
     * Gets the value of the scienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityCode() {
        return scienceSpecialityCode;
    }

    /**
     * Sets the value of the scienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityCode(String value) {
        this.scienceSpecialityCode = value;
    }

    /**
     * Gets the value of the kafendraName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKafendraName() {
        return kafendraName;
    }

    /**
     * Sets the value of the kafendraName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKafendraName(String value) {
        this.kafendraName = value;
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
     * Gets the value of the mIddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIddleName() {
        return mIddleName;
    }

    /**
     * Sets the value of the mIddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIddleName(String value) {
        this.mIddleName = value;
    }

    /**
     * Gets the value of the lastNameDative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameDative() {
        return lastNameDative;
    }

    /**
     * Sets the value of the lastNameDative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameDative(String value) {
        this.lastNameDative = value;
    }

    /**
     * Gets the value of the firstNameDative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameDative() {
        return firstNameDative;
    }

    /**
     * Sets the value of the firstNameDative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameDative(String value) {
        this.firstNameDative = value;
    }

    /**
     * Gets the value of the mIddleNameDative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIddleNameDative() {
        return mIddleNameDative;
    }

    /**
     * Sets the value of the mIddleNameDative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIddleNameDative(String value) {
        this.mIddleNameDative = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
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
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the workOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrganization() {
        return workOrganization;
    }

    /**
     * Sets the value of the workOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrganization(String value) {
        this.workOrganization = value;
    }

    /**
     * Gets the value of the workLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkLevel() {
        return workLevel;
    }

    /**
     * Sets the value of the workLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkLevel(String value) {
        this.workLevel = value;
    }

    /**
     * Gets the value of the workLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkLength() {
        return workLength;
    }

    /**
     * Sets the value of the workLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkLength(String value) {
        this.workLength = value;
    }

    /**
     * Gets the value of the experienceResearch property.
     * 
     */
    public int getExperienceResearch() {
        return experienceResearch;
    }

    /**
     * Sets the value of the experienceResearch property.
     * 
     */
    public void setExperienceResearch(int value) {
        this.experienceResearch = value;
    }

    /**
     * Gets the value of the kandidatYear property.
     * 
     */
    public int getKandidatYear() {
        return kandidatYear;
    }

    /**
     * Sets the value of the kandidatYear property.
     * 
     */
    public void setKandidatYear(int value) {
        this.kandidatYear = value;
    }

    /**
     * Gets the value of the kandidatDiplomSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKandidatDiplomSeries() {
        return kandidatDiplomSeries;
    }

    /**
     * Sets the value of the kandidatDiplomSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKandidatDiplomSeries(String value) {
        this.kandidatDiplomSeries = value;
    }

    /**
     * Gets the value of the kandidatDiplomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKandidatDiplomNumber() {
        return kandidatDiplomNumber;
    }

    /**
     * Sets the value of the kandidatDiplomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKandidatDiplomNumber(String value) {
        this.kandidatDiplomNumber = value;
    }

    /**
     * Gets the value of the kandidatScienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKandidatScienceSpecialityCode() {
        return kandidatScienceSpecialityCode;
    }

    /**
     * Sets the value of the kandidatScienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKandidatScienceSpecialityCode(String value) {
        this.kandidatScienceSpecialityCode = value;
    }

    /**
     * Gets the value of the kandidatIdAcademicEducationDegreDetailType property.
     * 
     */
    public int getKandidatIdAcademicEducationDegreDetailType() {
        return kandidatIdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the kandidatIdAcademicEducationDegreDetailType property.
     * 
     */
    public void setKandidatIdAcademicEducationDegreDetailType(int value) {
        this.kandidatIdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the doctorYear property.
     * 
     */
    public int getDoctorYear() {
        return doctorYear;
    }

    /**
     * Sets the value of the doctorYear property.
     * 
     */
    public void setDoctorYear(int value) {
        this.doctorYear = value;
    }

    /**
     * Gets the value of the doctorDiplomSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorDiplomSeries() {
        return doctorDiplomSeries;
    }

    /**
     * Sets the value of the doctorDiplomSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorDiplomSeries(String value) {
        this.doctorDiplomSeries = value;
    }

    /**
     * Gets the value of the doctorDiplomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorDiplomNumber() {
        return doctorDiplomNumber;
    }

    /**
     * Sets the value of the doctorDiplomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorDiplomNumber(String value) {
        this.doctorDiplomNumber = value;
    }

    /**
     * Gets the value of the doctorScienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorScienceSpecialityCode() {
        return doctorScienceSpecialityCode;
    }

    /**
     * Sets the value of the doctorScienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorScienceSpecialityCode(String value) {
        this.doctorScienceSpecialityCode = value;
    }

    /**
     * Gets the value of the doctorIdAcademicEducationDegreDetailType property.
     * 
     */
    public int getDoctorIdAcademicEducationDegreDetailType() {
        return doctorIdAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the doctorIdAcademicEducationDegreDetailType property.
     * 
     */
    public void setDoctorIdAcademicEducationDegreDetailType(int value) {
        this.doctorIdAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the snsYear property.
     * 
     */
    public int getSNSYear() {
        return snsYear;
    }

    /**
     * Sets the value of the snsYear property.
     * 
     */
    public void setSNSYear(int value) {
        this.snsYear = value;
    }

    /**
     * Gets the value of the snsDiplomSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNSDiplomSeries() {
        return snsDiplomSeries;
    }

    /**
     * Sets the value of the snsDiplomSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNSDiplomSeries(String value) {
        this.snsDiplomSeries = value;
    }

    /**
     * Gets the value of the snsDiplomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNSDiplomNumber() {
        return snsDiplomNumber;
    }

    /**
     * Sets the value of the snsDiplomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNSDiplomNumber(String value) {
        this.snsDiplomNumber = value;
    }

    /**
     * Gets the value of the snsAcademicRankType property.
     * 
     */
    public int getSNSAcademicRankType() {
        return snsAcademicRankType;
    }

    /**
     * Sets the value of the snsAcademicRankType property.
     * 
     */
    public void setSNSAcademicRankType(int value) {
        this.snsAcademicRankType = value;
    }

    /**
     * Gets the value of the snsScienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNSScienceSpecialityCode() {
        return snsScienceSpecialityCode;
    }

    /**
     * Sets the value of the snsScienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNSScienceSpecialityCode(String value) {
        this.snsScienceSpecialityCode = value;
    }

    /**
     * Gets the value of the snsKafendaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNSKafendaName() {
        return snsKafendaName;
    }

    /**
     * Sets the value of the snsKafendaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNSKafendaName(String value) {
        this.snsKafendaName = value;
    }

    /**
     * Gets the value of the docentYear property.
     * 
     */
    public int getDocentYear() {
        return docentYear;
    }

    /**
     * Sets the value of the docentYear property.
     * 
     */
    public void setDocentYear(int value) {
        this.docentYear = value;
    }

    /**
     * Gets the value of the docentDiplomSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocentDiplomSeries() {
        return docentDiplomSeries;
    }

    /**
     * Sets the value of the docentDiplomSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocentDiplomSeries(String value) {
        this.docentDiplomSeries = value;
    }

    /**
     * Gets the value of the docentDiplomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocentDiplomNumber() {
        return docentDiplomNumber;
    }

    /**
     * Sets the value of the docentDiplomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocentDiplomNumber(String value) {
        this.docentDiplomNumber = value;
    }

    /**
     * Gets the value of the docentAcademicRankType property.
     * 
     */
    public int getDocentAcademicRankType() {
        return docentAcademicRankType;
    }

    /**
     * Sets the value of the docentAcademicRankType property.
     * 
     */
    public void setDocentAcademicRankType(int value) {
        this.docentAcademicRankType = value;
    }

    /**
     * Gets the value of the docentScienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocentScienceSpecialityCode() {
        return docentScienceSpecialityCode;
    }

    /**
     * Sets the value of the docentScienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocentScienceSpecialityCode(String value) {
        this.docentScienceSpecialityCode = value;
    }

    /**
     * Gets the value of the docentKafendaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocentKafendaName() {
        return docentKafendaName;
    }

    /**
     * Sets the value of the docentKafendaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocentKafendaName(String value) {
        this.docentKafendaName = value;
    }

    /**
     * Gets the value of the proceedingsFor3Years property.
     * 
     */
    public int getProceedingsFor3Years() {
        return proceedingsFor3Years;
    }

    /**
     * Sets the value of the proceedingsFor3Years property.
     * 
     */
    public void setProceedingsFor3Years(int value) {
        this.proceedingsFor3Years = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the caseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseDate() {
        return caseDate;
    }

    /**
     * Sets the value of the caseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseDate(String value) {
        this.caseDate = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the yearOfBirth property.
     * 
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Sets the value of the yearOfBirth property.
     * 
     */
    public void setYearOfBirth(int value) {
        this.yearOfBirth = value;
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

}
