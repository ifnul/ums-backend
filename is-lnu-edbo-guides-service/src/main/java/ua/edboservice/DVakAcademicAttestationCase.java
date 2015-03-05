
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dVakAcademicAttestationCase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dVakAcademicAttestationCase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicAttestationCase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CertifyingAgenciesNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLetter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NimberLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicAttestationGlobalStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicAttestationGlobalStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicAttestationGlobalStatisDateChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_AcademicAttestationCaseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicAttestationCaseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCode_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicConsilDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ProtovcolNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationDegreType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationDegreTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicRankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicRankType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicRankTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KafendraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName_dative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName_dative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIddleName_dative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonSexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExperienceResearch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KandidatYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KandidatDiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KandidatDiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kandidat_ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kandidat_ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kandidat_ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kandidat_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Doctor_Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Doctor_DiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doctor_DiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doctor_ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doctor_ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doctor_ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doctor_Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SNS_Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SNS_DiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNS_DiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNS_AcademicRankType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SNS_ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNS_ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNS_ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNS_KafendaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Docent_DiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_DiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_AcademicRankType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Docent_ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docent_KafendaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProceedingsFor3Years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Opis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResolutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_AcademicBoard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicBoardOrderCreateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicCouncilSpecDecision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicAttestationCaseSatusHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Printed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearOfBirth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicAttestationCaseSatusHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dVakAcademicAttestationCase", propOrder = {
    "idAcademicAttestationCase",
    "universityKode",
    "dateCreate",
    "idUserAdd",
    "idCertifyingAgencies",
    "certifyingAgenciesNames",
    "dateLetter",
    "nimberLetter",
    "idAcademicAttestationGlobalStatusType",
    "academicAttestationGlobalStatusTypeName",
    "academicAttestationGlobalStatisDateChange",
    "idAcademicAttestationCaseType",
    "academicAttestationCaseTypeName",
    "koatuuCodeRegion",
    "koatuuFullName",
    "universityFullName",
    "academicConsilDate",
    "protovcolNumber",
    "idAcademicEducationDegreType",
    "academicEducationDegreTypeName",
    "idAcademicRank",
    "academicRankName",
    "idAcademicRankType",
    "academicRankTypeName",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "kafendraName",
    "personCodeU",
    "idPersonName",
    "lastName",
    "firstName",
    "mIddleName",
    "lastNameDative",
    "firstNameDative",
    "mIddleNameDative",
    "nationality",
    "idPersonSex",
    "personSexName",
    "age",
    "workOrganization",
    "workLevel",
    "workLength",
    "experienceResearch",
    "kandidatYear",
    "kandidatDiplomSeries",
    "kandidatDiplomNumber",
    "kandidatScienceSpecialityCode",
    "kandidatScienceSpecialityClasifierCode",
    "kandidatScienceSpecialityName",
    "kandidatIdAcademicEducationDegreDetailType",
    "doctorYear",
    "doctorDiplomSeries",
    "doctorDiplomNumber",
    "doctorScienceSpecialityCode",
    "doctorScienceSpecialityClasifierCode",
    "doctorScienceSpecialityName",
    "doctorIdAcademicEducationDegreDetailType",
    "snsYear",
    "snsDiplomSeries",
    "snsDiplomNumber",
    "snsAcademicRankType",
    "snsScienceSpecialityCode",
    "snsScienceSpecialityClasifierCode",
    "snsScienceSpecialityName",
    "snsKafendaName",
    "docentYear",
    "docentDiplomSeries",
    "docentDiplomNumber",
    "docentAcademicRankType",
    "docentScienceSpecialityCode",
    "docentScienceSpecialityClasifierCode",
    "docentScienceSpecialityName",
    "docentKafendaName",
    "proceedingsFor3Years",
    "opis",
    "description",
    "resolution",
    "resolutionDate",
    "idAcademicBoard",
    "academicBoardOrderCreateNumber",
    "idAcademicCards",
    "idAcademicCouncilSpecDecision",
    "idAcademicAttestationCaseSatusHistoryType",
    "printed",
    "caseDate",
    "caseNumber",
    "yearOfBirth",
    "attestatSeries",
    "attestatNumber",
    "academicAttestationCaseSatusHistoryTypeName"
})
public class DVakAcademicAttestationCase {

    @XmlElement(name = "Id_AcademicAttestationCase")
    protected int idAcademicAttestationCase;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "CertifyingAgenciesNames")
    protected String certifyingAgenciesNames;
    @XmlElement(name = "DateLetter", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLetter;
    @XmlElement(name = "NimberLetter")
    protected String nimberLetter;
    @XmlElement(name = "Id_AcademicAttestationGlobalStatusType")
    protected int idAcademicAttestationGlobalStatusType;
    @XmlElement(name = "AcademicAttestationGlobalStatusTypeName")
    protected String academicAttestationGlobalStatusTypeName;
    @XmlElement(name = "AcademicAttestationGlobalStatisDateChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicAttestationGlobalStatisDateChange;
    @XmlElement(name = "Id_AcademicAttestationCaseType")
    protected int idAcademicAttestationCaseType;
    @XmlElement(name = "AcademicAttestationCaseTypeName")
    protected String academicAttestationCaseTypeName;
    @XmlElement(name = "KOATUUCode_Region")
    protected String koatuuCodeRegion;
    @XmlElement(name = "KOATUUFullName")
    protected String koatuuFullName;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "AcademicConsilDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicConsilDate;
    @XmlElement(name = "ProtovcolNumber")
    protected String protovcolNumber;
    @XmlElement(name = "Id_AcademicEducationDegreType")
    protected int idAcademicEducationDegreType;
    @XmlElement(name = "AcademicEducationDegreTypeName")
    protected String academicEducationDegreTypeName;
    @XmlElement(name = "Id_AcademicRank")
    protected int idAcademicRank;
    @XmlElement(name = "AcademicRankName")
    protected String academicRankName;
    @XmlElement(name = "Id_AcademicRankType")
    protected int idAcademicRankType;
    @XmlElement(name = "AcademicRankTypeName")
    protected String academicRankTypeName;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "KafendraName")
    protected String kafendraName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
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
    @XmlElement(name = "PersonSexName")
    protected String personSexName;
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
    @XmlElement(name = "Kandidat_ScienceSpecialityClasifierCode")
    protected String kandidatScienceSpecialityClasifierCode;
    @XmlElement(name = "Kandidat_ScienceSpecialityName")
    protected String kandidatScienceSpecialityName;
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
    @XmlElement(name = "Doctor_ScienceSpecialityClasifierCode")
    protected String doctorScienceSpecialityClasifierCode;
    @XmlElement(name = "Doctor_ScienceSpecialityName")
    protected String doctorScienceSpecialityName;
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
    @XmlElement(name = "SNS_ScienceSpecialityClasifierCode")
    protected String snsScienceSpecialityClasifierCode;
    @XmlElement(name = "SNS_ScienceSpecialityName")
    protected String snsScienceSpecialityName;
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
    @XmlElement(name = "Docent_ScienceSpecialityClasifierCode")
    protected String docentScienceSpecialityClasifierCode;
    @XmlElement(name = "Docent_ScienceSpecialityName")
    protected String docentScienceSpecialityName;
    @XmlElement(name = "Docent_KafendaName")
    protected String docentKafendaName;
    @XmlElement(name = "ProceedingsFor3Years")
    protected int proceedingsFor3Years;
    @XmlElement(name = "Opis")
    protected String opis;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElement(name = "ResolutionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolutionDate;
    @XmlElement(name = "Id_AcademicBoard")
    protected int idAcademicBoard;
    @XmlElement(name = "AcademicBoardOrderCreateNumber")
    protected String academicBoardOrderCreateNumber;
    @XmlElement(name = "Id_AcademicCards")
    protected int idAcademicCards;
    @XmlElement(name = "Id_AcademicCouncilSpecDecision")
    protected int idAcademicCouncilSpecDecision;
    @XmlElement(name = "Id_AcademicAttestationCaseSatusHistoryType")
    protected int idAcademicAttestationCaseSatusHistoryType;
    @XmlElement(name = "Printed")
    protected int printed;
    @XmlElement(name = "CaseDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caseDate;
    @XmlElement(name = "CaseNumber")
    protected String caseNumber;
    @XmlElement(name = "YearOfBirth")
    protected int yearOfBirth;
    @XmlElement(name = "AttestatSeries")
    protected String attestatSeries;
    @XmlElement(name = "AttestatNumber")
    protected String attestatNumber;
    @XmlElement(name = "AcademicAttestationCaseSatusHistoryTypeName")
    protected String academicAttestationCaseSatusHistoryTypeName;

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
     * Gets the value of the certifyingAgenciesNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifyingAgenciesNames() {
        return certifyingAgenciesNames;
    }

    /**
     * Sets the value of the certifyingAgenciesNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifyingAgenciesNames(String value) {
        this.certifyingAgenciesNames = value;
    }

    /**
     * Gets the value of the dateLetter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLetter() {
        return dateLetter;
    }

    /**
     * Sets the value of the dateLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLetter(XMLGregorianCalendar value) {
        this.dateLetter = value;
    }

    /**
     * Gets the value of the nimberLetter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNimberLetter() {
        return nimberLetter;
    }

    /**
     * Sets the value of the nimberLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNimberLetter(String value) {
        this.nimberLetter = value;
    }

    /**
     * Gets the value of the idAcademicAttestationGlobalStatusType property.
     * 
     */
    public int getIdAcademicAttestationGlobalStatusType() {
        return idAcademicAttestationGlobalStatusType;
    }

    /**
     * Sets the value of the idAcademicAttestationGlobalStatusType property.
     * 
     */
    public void setIdAcademicAttestationGlobalStatusType(int value) {
        this.idAcademicAttestationGlobalStatusType = value;
    }

    /**
     * Gets the value of the academicAttestationGlobalStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAttestationGlobalStatusTypeName() {
        return academicAttestationGlobalStatusTypeName;
    }

    /**
     * Sets the value of the academicAttestationGlobalStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAttestationGlobalStatusTypeName(String value) {
        this.academicAttestationGlobalStatusTypeName = value;
    }

    /**
     * Gets the value of the academicAttestationGlobalStatisDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicAttestationGlobalStatisDateChange() {
        return academicAttestationGlobalStatisDateChange;
    }

    /**
     * Sets the value of the academicAttestationGlobalStatisDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicAttestationGlobalStatisDateChange(XMLGregorianCalendar value) {
        this.academicAttestationGlobalStatisDateChange = value;
    }

    /**
     * Gets the value of the idAcademicAttestationCaseType property.
     * 
     */
    public int getIdAcademicAttestationCaseType() {
        return idAcademicAttestationCaseType;
    }

    /**
     * Sets the value of the idAcademicAttestationCaseType property.
     * 
     */
    public void setIdAcademicAttestationCaseType(int value) {
        this.idAcademicAttestationCaseType = value;
    }

    /**
     * Gets the value of the academicAttestationCaseTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAttestationCaseTypeName() {
        return academicAttestationCaseTypeName;
    }

    /**
     * Sets the value of the academicAttestationCaseTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAttestationCaseTypeName(String value) {
        this.academicAttestationCaseTypeName = value;
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
     * Gets the value of the academicConsilDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicConsilDate() {
        return academicConsilDate;
    }

    /**
     * Sets the value of the academicConsilDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicConsilDate(XMLGregorianCalendar value) {
        this.academicConsilDate = value;
    }

    /**
     * Gets the value of the protovcolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtovcolNumber() {
        return protovcolNumber;
    }

    /**
     * Sets the value of the protovcolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtovcolNumber(String value) {
        this.protovcolNumber = value;
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
     * Gets the value of the academicEducationDegreTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreTypeName() {
        return academicEducationDegreTypeName;
    }

    /**
     * Sets the value of the academicEducationDegreTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreTypeName(String value) {
        this.academicEducationDegreTypeName = value;
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
     * Gets the value of the academicRankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankName() {
        return academicRankName;
    }

    /**
     * Sets the value of the academicRankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankName(String value) {
        this.academicRankName = value;
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
     * Gets the value of the academicRankTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankTypeName() {
        return academicRankTypeName;
    }

    /**
     * Sets the value of the academicRankTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankTypeName(String value) {
        this.academicRankTypeName = value;
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
     * Gets the value of the scienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityClasifierCode() {
        return scienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the scienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityClasifierCode(String value) {
        this.scienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityName() {
        return scienceSpecialityName;
    }

    /**
     * Sets the value of the scienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityName(String value) {
        this.scienceSpecialityName = value;
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
     * Gets the value of the idPersonName property.
     * 
     */
    public int getIdPersonName() {
        return idPersonName;
    }

    /**
     * Sets the value of the idPersonName property.
     * 
     */
    public void setIdPersonName(int value) {
        this.idPersonName = value;
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
     * Gets the value of the personSexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSexName() {
        return personSexName;
    }

    /**
     * Sets the value of the personSexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSexName(String value) {
        this.personSexName = value;
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
     * Gets the value of the kandidatScienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKandidatScienceSpecialityClasifierCode() {
        return kandidatScienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the kandidatScienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKandidatScienceSpecialityClasifierCode(String value) {
        this.kandidatScienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the kandidatScienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKandidatScienceSpecialityName() {
        return kandidatScienceSpecialityName;
    }

    /**
     * Sets the value of the kandidatScienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKandidatScienceSpecialityName(String value) {
        this.kandidatScienceSpecialityName = value;
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
     * Gets the value of the doctorScienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorScienceSpecialityClasifierCode() {
        return doctorScienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the doctorScienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorScienceSpecialityClasifierCode(String value) {
        this.doctorScienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the doctorScienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorScienceSpecialityName() {
        return doctorScienceSpecialityName;
    }

    /**
     * Sets the value of the doctorScienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorScienceSpecialityName(String value) {
        this.doctorScienceSpecialityName = value;
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
     * Gets the value of the snsScienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNSScienceSpecialityClasifierCode() {
        return snsScienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the snsScienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNSScienceSpecialityClasifierCode(String value) {
        this.snsScienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the snsScienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNSScienceSpecialityName() {
        return snsScienceSpecialityName;
    }

    /**
     * Sets the value of the snsScienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNSScienceSpecialityName(String value) {
        this.snsScienceSpecialityName = value;
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
     * Gets the value of the docentScienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocentScienceSpecialityClasifierCode() {
        return docentScienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the docentScienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocentScienceSpecialityClasifierCode(String value) {
        this.docentScienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the docentScienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocentScienceSpecialityName() {
        return docentScienceSpecialityName;
    }

    /**
     * Sets the value of the docentScienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocentScienceSpecialityName(String value) {
        this.docentScienceSpecialityName = value;
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
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the resolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Sets the value of the resolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolutionDate(XMLGregorianCalendar value) {
        this.resolutionDate = value;
    }

    /**
     * Gets the value of the idAcademicBoard property.
     * 
     */
    public int getIdAcademicBoard() {
        return idAcademicBoard;
    }

    /**
     * Sets the value of the idAcademicBoard property.
     * 
     */
    public void setIdAcademicBoard(int value) {
        this.idAcademicBoard = value;
    }

    /**
     * Gets the value of the academicBoardOrderCreateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicBoardOrderCreateNumber() {
        return academicBoardOrderCreateNumber;
    }

    /**
     * Sets the value of the academicBoardOrderCreateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicBoardOrderCreateNumber(String value) {
        this.academicBoardOrderCreateNumber = value;
    }

    /**
     * Gets the value of the idAcademicCards property.
     * 
     */
    public int getIdAcademicCards() {
        return idAcademicCards;
    }

    /**
     * Sets the value of the idAcademicCards property.
     * 
     */
    public void setIdAcademicCards(int value) {
        this.idAcademicCards = value;
    }

    /**
     * Gets the value of the idAcademicCouncilSpecDecision property.
     * 
     */
    public int getIdAcademicCouncilSpecDecision() {
        return idAcademicCouncilSpecDecision;
    }

    /**
     * Sets the value of the idAcademicCouncilSpecDecision property.
     * 
     */
    public void setIdAcademicCouncilSpecDecision(int value) {
        this.idAcademicCouncilSpecDecision = value;
    }

    /**
     * Gets the value of the idAcademicAttestationCaseSatusHistoryType property.
     * 
     */
    public int getIdAcademicAttestationCaseSatusHistoryType() {
        return idAcademicAttestationCaseSatusHistoryType;
    }

    /**
     * Sets the value of the idAcademicAttestationCaseSatusHistoryType property.
     * 
     */
    public void setIdAcademicAttestationCaseSatusHistoryType(int value) {
        this.idAcademicAttestationCaseSatusHistoryType = value;
    }

    /**
     * Gets the value of the printed property.
     * 
     */
    public int getPrinted() {
        return printed;
    }

    /**
     * Sets the value of the printed property.
     * 
     */
    public void setPrinted(int value) {
        this.printed = value;
    }

    /**
     * Gets the value of the caseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaseDate() {
        return caseDate;
    }

    /**
     * Sets the value of the caseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaseDate(XMLGregorianCalendar value) {
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

    /**
     * Gets the value of the academicAttestationCaseSatusHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAttestationCaseSatusHistoryTypeName() {
        return academicAttestationCaseSatusHistoryTypeName;
    }

    /**
     * Sets the value of the academicAttestationCaseSatusHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAttestationCaseSatusHistoryTypeName(String value) {
        this.academicAttestationCaseSatusHistoryTypeName = value;
    }

}
