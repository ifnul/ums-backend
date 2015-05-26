
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityFacultetsRequests2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityFacultetsRequests2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameRequestSeason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestPerPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitySpecialities" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversitySpecialitiesDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalDocumentsAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsNeedHostel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodeOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEnteranceTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEnteranceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestExaminationCause" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestExaminationCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsContract" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBudget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KonkursValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="KonkursValueSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KonkursValueCorrectValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="KonkursValueCorrectValueDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonRequestSeasonDetails" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntrantDocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrantDocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrantDocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EntrantDocumentIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrantDocumentValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IsCheckForPaperCopy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsNotCheckAttestat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsForeinghEntrantDocumet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestEnteranseCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityEntrantWave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestStatusIsBudejt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestStatusIsContract" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityEntrantWaveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsHigherEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SkipDocumentValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EntrantDocumentAwardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntrantDocumentAwardTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistBenefitsPershocherg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExistBenefitsPozacherg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ZNOSubjects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_LanguageEx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LanguageExName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsForeignWay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ForeignType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ForeignTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExistQuotasCiloviy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Resident" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KoatuType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntranceCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityFacultetsRequests2", propOrder = {
    "idPersonRequest",
    "idPersonRequestSeasons",
    "personCodeU",
    "fio",
    "universitySpecialitiesKode",
    "nameRequestSeason",
    "requestPerPerson",
    "idUniversitySpecialities",
    "universitySpecialitiesDateBegin",
    "universitySpecialitiesDateEnd",
    "universityKode",
    "universityFullName",
    "universityShortName",
    "universityFacultetKode",
    "universityFacultetFullName",
    "universityFacultetShortName",
    "specCode",
    "specClasifierCode",
    "specIndastryName",
    "specDirectionName",
    "specSpecialityName",
    "idLanguage",
    "specScecializationCode",
    "specScecializationName",
    "originalDocumentsAdd",
    "idPersonRequestStatus",
    "idPersonRequestStatusType",
    "personRequestStatusCode",
    "idPersonRequestStatusTypeName",
    "personRequestStatusTypeName",
    "descryption",
    "dateLastChange",
    "isNeedHostel",
    "codeOfBusiness",
    "idPersonEnteranceTypes",
    "personEnteranceTypeName",
    "idPersonRequestExaminationCause",
    "personRequestExaminationCauseName",
    "isContract",
    "isBudget",
    "idPersonEducationForm",
    "personEducationFormName",
    "konkursValue",
    "konkursValueSource",
    "priorityRequest",
    "konkursValueCorrectValue",
    "konkursValueCorrectValueDescription",
    "dateCreate",
    "idPersonRequestSeasonDetails",
    "idQualification",
    "qualificationName",
    "idPersonDocumentType",
    "personDocumentTypeName",
    "idPersonDocument",
    "entrantDocumentSeries",
    "entrantDocumentNumbers",
    "entrantDocumentDateGet",
    "entrantDocumentIssued",
    "entrantDocumentValue",
    "isCheckForPaperCopy",
    "isNotCheckAttestat",
    "isForeinghEntrantDocumet",
    "requestEnteranseCodes",
    "idUniversityEntrantWave",
    "requestStatusIsBudejt",
    "requestStatusIsContract",
    "universityEntrantWaveName",
    "isHigherEducation",
    "skipDocumentValue",
    "idEntrantDocumentAwardType",
    "entrantDocumentAwardTypeName",
    "specSpecialityClasifierCode",
    "existBenefitsPershocherg",
    "existBenefitsPozacherg",
    "znoSubjects",
    "idLanguageEx",
    "languageExName",
    "isEz",
    "isForeignWay",
    "idForeignType",
    "foreignTypeName",
    "idCourse",
    "existQuotasCiloviy",
    "idPersonSex",
    "resident",
    "koatuType",
    "countryName",
    "birthday",
    "contactPhone",
    "contactMobile",
    "entranceCodes",
    "requestPriority"
})
public class DUniversityFacultetsRequests2 {

    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "NameRequestSeason")
    protected String nameRequestSeason;
    @XmlElement(name = "RequestPerPerson")
    protected int requestPerPerson;
    @XmlElement(name = "Id_UniversitySpecialities")
    protected int idUniversitySpecialities;
    @XmlElement(name = "UniversitySpecialitiesDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universitySpecialitiesDateBegin;
    @XmlElement(name = "UniversitySpecialitiesDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universitySpecialitiesDateEnd;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityShortName")
    protected String universityShortName;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityFacultetShortName")
    protected String universityFacultetShortName;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecIndastryName")
    protected String specIndastryName;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;
    @XmlElement(name = "OriginalDocumentsAdd")
    protected int originalDocumentsAdd;
    @XmlElement(name = "Id_PersonRequestStatus")
    protected int idPersonRequestStatus;
    @XmlElement(name = "Id_PersonRequestStatusType")
    protected int idPersonRequestStatusType;
    @XmlElement(name = "PersonRequestStatusCode")
    protected String personRequestStatusCode;
    @XmlElement(name = "Id_PersonRequestStatusTypeName")
    protected int idPersonRequestStatusTypeName;
    @XmlElement(name = "PersonRequestStatusTypeName")
    protected String personRequestStatusTypeName;
    @XmlElement(name = "Descryption")
    protected String descryption;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "IsNeedHostel")
    protected int isNeedHostel;
    @XmlElement(name = "CodeOfBusiness")
    protected String codeOfBusiness;
    @XmlElement(name = "Id_PersonEnteranceTypes")
    protected int idPersonEnteranceTypes;
    @XmlElement(name = "PersonEnteranceTypeName")
    protected String personEnteranceTypeName;
    @XmlElement(name = "Id_PersonRequestExaminationCause")
    protected int idPersonRequestExaminationCause;
    @XmlElement(name = "PersonRequestExaminationCauseName")
    protected String personRequestExaminationCauseName;
    @XmlElement(name = "IsContract")
    protected int isContract;
    @XmlElement(name = "IsBudget")
    protected int isBudget;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "KonkursValue", required = true)
    protected BigDecimal konkursValue;
    @XmlElement(name = "KonkursValueSource")
    protected String konkursValueSource;
    @XmlElement(name = "PriorityRequest")
    protected int priorityRequest;
    @XmlElement(name = "KonkursValueCorrectValue", required = true)
    protected BigDecimal konkursValueCorrectValue;
    @XmlElement(name = "KonkursValueCorrectValueDescription")
    protected String konkursValueCorrectValueDescription;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "Id_PersonRequestSeasonDetails")
    protected int idPersonRequestSeasonDetails;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "PersonDocumentTypeName")
    protected String personDocumentTypeName;
    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "EntrantDocumentSeries")
    protected String entrantDocumentSeries;
    @XmlElement(name = "EntrantDocumentNumbers")
    protected String entrantDocumentNumbers;
    @XmlElement(name = "EntrantDocumentDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entrantDocumentDateGet;
    @XmlElement(name = "EntrantDocumentIssued")
    protected String entrantDocumentIssued;
    @XmlElement(name = "EntrantDocumentValue", required = true)
    protected BigDecimal entrantDocumentValue;
    @XmlElement(name = "IsCheckForPaperCopy")
    protected int isCheckForPaperCopy;
    @XmlElement(name = "IsNotCheckAttestat")
    protected int isNotCheckAttestat;
    @XmlElement(name = "IsForeinghEntrantDocumet")
    protected int isForeinghEntrantDocumet;
    @XmlElement(name = "RequestEnteranseCodes")
    protected String requestEnteranseCodes;
    @XmlElement(name = "Id_UniversityEntrantWave")
    protected int idUniversityEntrantWave;
    @XmlElement(name = "RequestStatusIsBudejt")
    protected int requestStatusIsBudejt;
    @XmlElement(name = "RequestStatusIsContract")
    protected int requestStatusIsContract;
    @XmlElement(name = "UniversityEntrantWaveName")
    protected String universityEntrantWaveName;
    @XmlElement(name = "IsHigherEducation")
    protected int isHigherEducation;
    @XmlElement(name = "SkipDocumentValue")
    protected int skipDocumentValue;
    @XmlElement(name = "Id_EntrantDocumentAwardType")
    protected int idEntrantDocumentAwardType;
    @XmlElement(name = "EntrantDocumentAwardTypeName")
    protected String entrantDocumentAwardTypeName;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;
    @XmlElement(name = "ExistBenefitsPershocherg")
    protected int existBenefitsPershocherg;
    @XmlElement(name = "ExistBenefitsPozacherg")
    protected int existBenefitsPozacherg;
    @XmlElement(name = "ZNOSubjects")
    protected String znoSubjects;
    @XmlElement(name = "Id_LanguageEx")
    protected int idLanguageEx;
    @XmlElement(name = "LanguageExName")
    protected String languageExName;
    @XmlElement(name = "IsEz")
    protected int isEz;
    @XmlElement(name = "IsForeignWay")
    protected int isForeignWay;
    @XmlElement(name = "Id_ForeignType")
    protected int idForeignType;
    @XmlElement(name = "ForeignTypeName")
    protected String foreignTypeName;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "ExistQuotasCiloviy")
    protected int existQuotasCiloviy;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "Resident")
    protected int resident;
    @XmlElement(name = "KoatuType")
    protected String koatuType;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "ContactPhone")
    protected String contactPhone;
    @XmlElement(name = "ContactMobile")
    protected String contactMobile;
    @XmlElement(name = "EntranceCodes")
    protected String entranceCodes;
    @XmlElement(name = "RequestPriority")
    protected int requestPriority;

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
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
     * Gets the value of the universitySpecialitiesKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKode() {
        return universitySpecialitiesKode;
    }

    /**
     * Sets the value of the universitySpecialitiesKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKode(String value) {
        this.universitySpecialitiesKode = value;
    }

    /**
     * Gets the value of the nameRequestSeason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameRequestSeason() {
        return nameRequestSeason;
    }

    /**
     * Sets the value of the nameRequestSeason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameRequestSeason(String value) {
        this.nameRequestSeason = value;
    }

    /**
     * Gets the value of the requestPerPerson property.
     * 
     */
    public int getRequestPerPerson() {
        return requestPerPerson;
    }

    /**
     * Sets the value of the requestPerPerson property.
     * 
     */
    public void setRequestPerPerson(int value) {
        this.requestPerPerson = value;
    }

    /**
     * Gets the value of the idUniversitySpecialities property.
     * 
     */
    public int getIdUniversitySpecialities() {
        return idUniversitySpecialities;
    }

    /**
     * Sets the value of the idUniversitySpecialities property.
     * 
     */
    public void setIdUniversitySpecialities(int value) {
        this.idUniversitySpecialities = value;
    }

    /**
     * Gets the value of the universitySpecialitiesDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversitySpecialitiesDateBegin() {
        return universitySpecialitiesDateBegin;
    }

    /**
     * Sets the value of the universitySpecialitiesDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversitySpecialitiesDateBegin(XMLGregorianCalendar value) {
        this.universitySpecialitiesDateBegin = value;
    }

    /**
     * Gets the value of the universitySpecialitiesDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversitySpecialitiesDateEnd() {
        return universitySpecialitiesDateEnd;
    }

    /**
     * Sets the value of the universitySpecialitiesDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversitySpecialitiesDateEnd(XMLGregorianCalendar value) {
        this.universitySpecialitiesDateEnd = value;
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
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
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
     * Gets the value of the universityFacultetShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetShortName() {
        return universityFacultetShortName;
    }

    /**
     * Sets the value of the universityFacultetShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetShortName(String value) {
        this.universityFacultetShortName = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

    /**
     * Gets the value of the specIndastryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryName() {
        return specIndastryName;
    }

    /**
     * Sets the value of the specIndastryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryName(String value) {
        this.specIndastryName = value;
    }

    /**
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
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
     * Gets the value of the specScecializationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationCode() {
        return specScecializationCode;
    }

    /**
     * Sets the value of the specScecializationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationCode(String value) {
        this.specScecializationCode = value;
    }

    /**
     * Gets the value of the specScecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationName() {
        return specScecializationName;
    }

    /**
     * Sets the value of the specScecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationName(String value) {
        this.specScecializationName = value;
    }

    /**
     * Gets the value of the originalDocumentsAdd property.
     * 
     */
    public int getOriginalDocumentsAdd() {
        return originalDocumentsAdd;
    }

    /**
     * Sets the value of the originalDocumentsAdd property.
     * 
     */
    public void setOriginalDocumentsAdd(int value) {
        this.originalDocumentsAdd = value;
    }

    /**
     * Gets the value of the idPersonRequestStatus property.
     * 
     */
    public int getIdPersonRequestStatus() {
        return idPersonRequestStatus;
    }

    /**
     * Sets the value of the idPersonRequestStatus property.
     * 
     */
    public void setIdPersonRequestStatus(int value) {
        this.idPersonRequestStatus = value;
    }

    /**
     * Gets the value of the idPersonRequestStatusType property.
     * 
     */
    public int getIdPersonRequestStatusType() {
        return idPersonRequestStatusType;
    }

    /**
     * Sets the value of the idPersonRequestStatusType property.
     * 
     */
    public void setIdPersonRequestStatusType(int value) {
        this.idPersonRequestStatusType = value;
    }

    /**
     * Gets the value of the personRequestStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestStatusCode() {
        return personRequestStatusCode;
    }

    /**
     * Sets the value of the personRequestStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestStatusCode(String value) {
        this.personRequestStatusCode = value;
    }

    /**
     * Gets the value of the idPersonRequestStatusTypeName property.
     * 
     */
    public int getIdPersonRequestStatusTypeName() {
        return idPersonRequestStatusTypeName;
    }

    /**
     * Sets the value of the idPersonRequestStatusTypeName property.
     * 
     */
    public void setIdPersonRequestStatusTypeName(int value) {
        this.idPersonRequestStatusTypeName = value;
    }

    /**
     * Gets the value of the personRequestStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestStatusTypeName() {
        return personRequestStatusTypeName;
    }

    /**
     * Sets the value of the personRequestStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestStatusTypeName(String value) {
        this.personRequestStatusTypeName = value;
    }

    /**
     * Gets the value of the descryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescryption() {
        return descryption;
    }

    /**
     * Sets the value of the descryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescryption(String value) {
        this.descryption = value;
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
     * Gets the value of the isNeedHostel property.
     * 
     */
    public int getIsNeedHostel() {
        return isNeedHostel;
    }

    /**
     * Sets the value of the isNeedHostel property.
     * 
     */
    public void setIsNeedHostel(int value) {
        this.isNeedHostel = value;
    }

    /**
     * Gets the value of the codeOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOfBusiness() {
        return codeOfBusiness;
    }

    /**
     * Sets the value of the codeOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOfBusiness(String value) {
        this.codeOfBusiness = value;
    }

    /**
     * Gets the value of the idPersonEnteranceTypes property.
     * 
     */
    public int getIdPersonEnteranceTypes() {
        return idPersonEnteranceTypes;
    }

    /**
     * Sets the value of the idPersonEnteranceTypes property.
     * 
     */
    public void setIdPersonEnteranceTypes(int value) {
        this.idPersonEnteranceTypes = value;
    }

    /**
     * Gets the value of the personEnteranceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEnteranceTypeName() {
        return personEnteranceTypeName;
    }

    /**
     * Sets the value of the personEnteranceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEnteranceTypeName(String value) {
        this.personEnteranceTypeName = value;
    }

    /**
     * Gets the value of the idPersonRequestExaminationCause property.
     * 
     */
    public int getIdPersonRequestExaminationCause() {
        return idPersonRequestExaminationCause;
    }

    /**
     * Sets the value of the idPersonRequestExaminationCause property.
     * 
     */
    public void setIdPersonRequestExaminationCause(int value) {
        this.idPersonRequestExaminationCause = value;
    }

    /**
     * Gets the value of the personRequestExaminationCauseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestExaminationCauseName() {
        return personRequestExaminationCauseName;
    }

    /**
     * Sets the value of the personRequestExaminationCauseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestExaminationCauseName(String value) {
        this.personRequestExaminationCauseName = value;
    }

    /**
     * Gets the value of the isContract property.
     * 
     */
    public int getIsContract() {
        return isContract;
    }

    /**
     * Sets the value of the isContract property.
     * 
     */
    public void setIsContract(int value) {
        this.isContract = value;
    }

    /**
     * Gets the value of the isBudget property.
     * 
     */
    public int getIsBudget() {
        return isBudget;
    }

    /**
     * Sets the value of the isBudget property.
     * 
     */
    public void setIsBudget(int value) {
        this.isBudget = value;
    }

    /**
     * Gets the value of the idPersonEducationForm property.
     * 
     */
    public int getIdPersonEducationForm() {
        return idPersonEducationForm;
    }

    /**
     * Sets the value of the idPersonEducationForm property.
     * 
     */
    public void setIdPersonEducationForm(int value) {
        this.idPersonEducationForm = value;
    }

    /**
     * Gets the value of the personEducationFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationFormName() {
        return personEducationFormName;
    }

    /**
     * Sets the value of the personEducationFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationFormName(String value) {
        this.personEducationFormName = value;
    }

    /**
     * Gets the value of the konkursValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKonkursValue() {
        return konkursValue;
    }

    /**
     * Sets the value of the konkursValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKonkursValue(BigDecimal value) {
        this.konkursValue = value;
    }

    /**
     * Gets the value of the konkursValueSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonkursValueSource() {
        return konkursValueSource;
    }

    /**
     * Sets the value of the konkursValueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonkursValueSource(String value) {
        this.konkursValueSource = value;
    }

    /**
     * Gets the value of the priorityRequest property.
     * 
     */
    public int getPriorityRequest() {
        return priorityRequest;
    }

    /**
     * Sets the value of the priorityRequest property.
     * 
     */
    public void setPriorityRequest(int value) {
        this.priorityRequest = value;
    }

    /**
     * Gets the value of the konkursValueCorrectValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKonkursValueCorrectValue() {
        return konkursValueCorrectValue;
    }

    /**
     * Sets the value of the konkursValueCorrectValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKonkursValueCorrectValue(BigDecimal value) {
        this.konkursValueCorrectValue = value;
    }

    /**
     * Gets the value of the konkursValueCorrectValueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonkursValueCorrectValueDescription() {
        return konkursValueCorrectValueDescription;
    }

    /**
     * Sets the value of the konkursValueCorrectValueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonkursValueCorrectValueDescription(String value) {
        this.konkursValueCorrectValueDescription = value;
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
     * Gets the value of the idPersonRequestSeasonDetails property.
     * 
     */
    public int getIdPersonRequestSeasonDetails() {
        return idPersonRequestSeasonDetails;
    }

    /**
     * Sets the value of the idPersonRequestSeasonDetails property.
     * 
     */
    public void setIdPersonRequestSeasonDetails(int value) {
        this.idPersonRequestSeasonDetails = value;
    }

    /**
     * Gets the value of the idQualification property.
     * 
     */
    public int getIdQualification() {
        return idQualification;
    }

    /**
     * Sets the value of the idQualification property.
     * 
     */
    public void setIdQualification(int value) {
        this.idQualification = value;
    }

    /**
     * Gets the value of the qualificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationName() {
        return qualificationName;
    }

    /**
     * Sets the value of the qualificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationName(String value) {
        this.qualificationName = value;
    }

    /**
     * Gets the value of the idPersonDocumentType property.
     * 
     */
    public int getIdPersonDocumentType() {
        return idPersonDocumentType;
    }

    /**
     * Sets the value of the idPersonDocumentType property.
     * 
     */
    public void setIdPersonDocumentType(int value) {
        this.idPersonDocumentType = value;
    }

    /**
     * Gets the value of the personDocumentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentTypeName() {
        return personDocumentTypeName;
    }

    /**
     * Sets the value of the personDocumentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentTypeName(String value) {
        this.personDocumentTypeName = value;
    }

    /**
     * Gets the value of the idPersonDocument property.
     * 
     */
    public int getIdPersonDocument() {
        return idPersonDocument;
    }

    /**
     * Sets the value of the idPersonDocument property.
     * 
     */
    public void setIdPersonDocument(int value) {
        this.idPersonDocument = value;
    }

    /**
     * Gets the value of the entrantDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrantDocumentSeries() {
        return entrantDocumentSeries;
    }

    /**
     * Sets the value of the entrantDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrantDocumentSeries(String value) {
        this.entrantDocumentSeries = value;
    }

    /**
     * Gets the value of the entrantDocumentNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrantDocumentNumbers() {
        return entrantDocumentNumbers;
    }

    /**
     * Sets the value of the entrantDocumentNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrantDocumentNumbers(String value) {
        this.entrantDocumentNumbers = value;
    }

    /**
     * Gets the value of the entrantDocumentDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntrantDocumentDateGet() {
        return entrantDocumentDateGet;
    }

    /**
     * Sets the value of the entrantDocumentDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntrantDocumentDateGet(XMLGregorianCalendar value) {
        this.entrantDocumentDateGet = value;
    }

    /**
     * Gets the value of the entrantDocumentIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrantDocumentIssued() {
        return entrantDocumentIssued;
    }

    /**
     * Sets the value of the entrantDocumentIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrantDocumentIssued(String value) {
        this.entrantDocumentIssued = value;
    }

    /**
     * Gets the value of the entrantDocumentValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntrantDocumentValue() {
        return entrantDocumentValue;
    }

    /**
     * Sets the value of the entrantDocumentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEntrantDocumentValue(BigDecimal value) {
        this.entrantDocumentValue = value;
    }

    /**
     * Gets the value of the isCheckForPaperCopy property.
     * 
     */
    public int getIsCheckForPaperCopy() {
        return isCheckForPaperCopy;
    }

    /**
     * Sets the value of the isCheckForPaperCopy property.
     * 
     */
    public void setIsCheckForPaperCopy(int value) {
        this.isCheckForPaperCopy = value;
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
     * Gets the value of the isForeinghEntrantDocumet property.
     * 
     */
    public int getIsForeinghEntrantDocumet() {
        return isForeinghEntrantDocumet;
    }

    /**
     * Sets the value of the isForeinghEntrantDocumet property.
     * 
     */
    public void setIsForeinghEntrantDocumet(int value) {
        this.isForeinghEntrantDocumet = value;
    }

    /**
     * Gets the value of the requestEnteranseCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestEnteranseCodes() {
        return requestEnteranseCodes;
    }

    /**
     * Sets the value of the requestEnteranseCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestEnteranseCodes(String value) {
        this.requestEnteranseCodes = value;
    }

    /**
     * Gets the value of the idUniversityEntrantWave property.
     * 
     */
    public int getIdUniversityEntrantWave() {
        return idUniversityEntrantWave;
    }

    /**
     * Sets the value of the idUniversityEntrantWave property.
     * 
     */
    public void setIdUniversityEntrantWave(int value) {
        this.idUniversityEntrantWave = value;
    }

    /**
     * Gets the value of the requestStatusIsBudejt property.
     * 
     */
    public int getRequestStatusIsBudejt() {
        return requestStatusIsBudejt;
    }

    /**
     * Sets the value of the requestStatusIsBudejt property.
     * 
     */
    public void setRequestStatusIsBudejt(int value) {
        this.requestStatusIsBudejt = value;
    }

    /**
     * Gets the value of the requestStatusIsContract property.
     * 
     */
    public int getRequestStatusIsContract() {
        return requestStatusIsContract;
    }

    /**
     * Sets the value of the requestStatusIsContract property.
     * 
     */
    public void setRequestStatusIsContract(int value) {
        this.requestStatusIsContract = value;
    }

    /**
     * Gets the value of the universityEntrantWaveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityEntrantWaveName() {
        return universityEntrantWaveName;
    }

    /**
     * Sets the value of the universityEntrantWaveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityEntrantWaveName(String value) {
        this.universityEntrantWaveName = value;
    }

    /**
     * Gets the value of the isHigherEducation property.
     * 
     */
    public int getIsHigherEducation() {
        return isHigherEducation;
    }

    /**
     * Sets the value of the isHigherEducation property.
     * 
     */
    public void setIsHigherEducation(int value) {
        this.isHigherEducation = value;
    }

    /**
     * Gets the value of the skipDocumentValue property.
     * 
     */
    public int getSkipDocumentValue() {
        return skipDocumentValue;
    }

    /**
     * Sets the value of the skipDocumentValue property.
     * 
     */
    public void setSkipDocumentValue(int value) {
        this.skipDocumentValue = value;
    }

    /**
     * Gets the value of the idEntrantDocumentAwardType property.
     * 
     */
    public int getIdEntrantDocumentAwardType() {
        return idEntrantDocumentAwardType;
    }

    /**
     * Sets the value of the idEntrantDocumentAwardType property.
     * 
     */
    public void setIdEntrantDocumentAwardType(int value) {
        this.idEntrantDocumentAwardType = value;
    }

    /**
     * Gets the value of the entrantDocumentAwardTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrantDocumentAwardTypeName() {
        return entrantDocumentAwardTypeName;
    }

    /**
     * Sets the value of the entrantDocumentAwardTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrantDocumentAwardTypeName(String value) {
        this.entrantDocumentAwardTypeName = value;
    }

    /**
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the existBenefitsPershocherg property.
     * 
     */
    public int getExistBenefitsPershocherg() {
        return existBenefitsPershocherg;
    }

    /**
     * Sets the value of the existBenefitsPershocherg property.
     * 
     */
    public void setExistBenefitsPershocherg(int value) {
        this.existBenefitsPershocherg = value;
    }

    /**
     * Gets the value of the existBenefitsPozacherg property.
     * 
     */
    public int getExistBenefitsPozacherg() {
        return existBenefitsPozacherg;
    }

    /**
     * Sets the value of the existBenefitsPozacherg property.
     * 
     */
    public void setExistBenefitsPozacherg(int value) {
        this.existBenefitsPozacherg = value;
    }

    /**
     * Gets the value of the znoSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZNOSubjects() {
        return znoSubjects;
    }

    /**
     * Sets the value of the znoSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZNOSubjects(String value) {
        this.znoSubjects = value;
    }

    /**
     * Gets the value of the idLanguageEx property.
     * 
     */
    public int getIdLanguageEx() {
        return idLanguageEx;
    }

    /**
     * Sets the value of the idLanguageEx property.
     * 
     */
    public void setIdLanguageEx(int value) {
        this.idLanguageEx = value;
    }

    /**
     * Gets the value of the languageExName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageExName() {
        return languageExName;
    }

    /**
     * Sets the value of the languageExName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageExName(String value) {
        this.languageExName = value;
    }

    /**
     * Gets the value of the isEz property.
     * 
     */
    public int getIsEz() {
        return isEz;
    }

    /**
     * Sets the value of the isEz property.
     * 
     */
    public void setIsEz(int value) {
        this.isEz = value;
    }

    /**
     * Gets the value of the isForeignWay property.
     * 
     */
    public int getIsForeignWay() {
        return isForeignWay;
    }

    /**
     * Sets the value of the isForeignWay property.
     * 
     */
    public void setIsForeignWay(int value) {
        this.isForeignWay = value;
    }

    /**
     * Gets the value of the idForeignType property.
     * 
     */
    public int getIdForeignType() {
        return idForeignType;
    }

    /**
     * Sets the value of the idForeignType property.
     * 
     */
    public void setIdForeignType(int value) {
        this.idForeignType = value;
    }

    /**
     * Gets the value of the foreignTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignTypeName() {
        return foreignTypeName;
    }

    /**
     * Sets the value of the foreignTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignTypeName(String value) {
        this.foreignTypeName = value;
    }

    /**
     * Gets the value of the idCourse property.
     * 
     */
    public int getIdCourse() {
        return idCourse;
    }

    /**
     * Sets the value of the idCourse property.
     * 
     */
    public void setIdCourse(int value) {
        this.idCourse = value;
    }

    /**
     * Gets the value of the existQuotasCiloviy property.
     * 
     */
    public int getExistQuotasCiloviy() {
        return existQuotasCiloviy;
    }

    /**
     * Sets the value of the existQuotasCiloviy property.
     * 
     */
    public void setExistQuotasCiloviy(int value) {
        this.existQuotasCiloviy = value;
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
     * Gets the value of the koatuType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoatuType() {
        return koatuType;
    }

    /**
     * Sets the value of the koatuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoatuType(String value) {
        this.koatuType = value;
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
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * Sets the value of the contactMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMobile(String value) {
        this.contactMobile = value;
    }

    /**
     * Gets the value of the entranceCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntranceCodes() {
        return entranceCodes;
    }

    /**
     * Sets the value of the entranceCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntranceCodes(String value) {
        this.entranceCodes = value;
    }

    /**
     * Gets the value of the requestPriority property.
     * 
     */
    public int getRequestPriority() {
        return requestPriority;
    }

    /**
     * Sets the value of the requestPriority property.
     * 
     */
    public void setRequestPriority(int value) {
        this.requestPriority = value;
    }

}
