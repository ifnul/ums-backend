
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dReceptionConditionAdditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAddition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReceptionConditionAdditionDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonRequestSeasonsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserFio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dodatok1Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dodatok2Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dodatok3Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dodatok4Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dodatok5Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dodatok6Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dodatok7Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dodatok8Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONCheck" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeasonYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationOrganizationFullTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityParent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditions", propOrder = {
    "idReceptionConditionAddition",
    "universityKode",
    "idUser",
    "idPersonRequestSeasons",
    "receptionConditionAdditionDateLastChange",
    "personRequestSeasonsName",
    "userFio",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "universityFacultetKode",
    "universityFacultetFullName",
    "dodatok1Description",
    "dodatok2Description",
    "dodatok3Description",
    "dodatok4Description",
    "dodatok5Description",
    "dodatok6Description",
    "dodatok7Description",
    "dodatok8Description",
    "monCheck",
    "idUniversity",
    "universityFullName",
    "seasonYear",
    "region",
    "universityTypeName",
    "educationOrganizationFullTypeName",
    "vsp",
    "idUniversityParent"
})
public class DReceptionConditionAdditions {

    @XmlElement(name = "Id_ReceptionConditionAddition")
    protected int idReceptionConditionAddition;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "ReceptionConditionAdditionDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receptionConditionAdditionDateLastChange;
    @XmlElement(name = "PersonRequestSeasonsName")
    protected String personRequestSeasonsName;
    @XmlElement(name = "UserFio")
    protected String userFio;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "IsVerified")
    protected int isVerified;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistoryType")
    protected int idRegulationDocumentVerificationHistoryType;
    @XmlElement(name = "RegulationDocumentVerificationHistoryTypeName")
    protected String regulationDocumentVerificationHistoryTypeName;
    @XmlElement(name = "IsExistFile")
    protected int isExistFile;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "Dodatok1Description")
    protected String dodatok1Description;
    @XmlElement(name = "Dodatok2Description")
    protected String dodatok2Description;
    @XmlElement(name = "Dodatok3Description")
    protected String dodatok3Description;
    @XmlElement(name = "Dodatok4Description")
    protected String dodatok4Description;
    @XmlElement(name = "Dodatok5Description")
    protected String dodatok5Description;
    @XmlElement(name = "Dodatok6Description")
    protected String dodatok6Description;
    @XmlElement(name = "Dodatok7Description")
    protected String dodatok7Description;
    @XmlElement(name = "Dodatok8Description")
    protected String dodatok8Description;
    @XmlElement(name = "MONCheck")
    protected int monCheck;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "SeasonYear")
    protected int seasonYear;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "UniversityTypeName")
    protected String universityTypeName;
    @XmlElement(name = "EducationOrganizationFullTypeName")
    protected String educationOrganizationFullTypeName;
    @XmlElement(name = "VSP")
    protected String vsp;
    @XmlElement(name = "Id_UniversityParent")
    protected int idUniversityParent;

    /**
     * Gets the value of the idReceptionConditionAddition property.
     * 
     */
    public int getIdReceptionConditionAddition() {
        return idReceptionConditionAddition;
    }

    /**
     * Sets the value of the idReceptionConditionAddition property.
     * 
     */
    public void setIdReceptionConditionAddition(int value) {
        this.idReceptionConditionAddition = value;
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
     * Gets the value of the receptionConditionAdditionDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceptionConditionAdditionDateLastChange() {
        return receptionConditionAdditionDateLastChange;
    }

    /**
     * Sets the value of the receptionConditionAdditionDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceptionConditionAdditionDateLastChange(XMLGregorianCalendar value) {
        this.receptionConditionAdditionDateLastChange = value;
    }

    /**
     * Gets the value of the personRequestSeasonsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestSeasonsName() {
        return personRequestSeasonsName;
    }

    /**
     * Sets the value of the personRequestSeasonsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestSeasonsName(String value) {
        this.personRequestSeasonsName = value;
    }

    /**
     * Gets the value of the userFio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFio() {
        return userFio;
    }

    /**
     * Sets the value of the userFio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFio(String value) {
        this.userFio = value;
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
     * Gets the value of the isVerified property.
     * 
     */
    public int getIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     */
    public void setIsVerified(int value) {
        this.isVerified = value;
    }

    /**
     * Gets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public int getIdRegulationDocumentVerificationHistoryType() {
        return idRegulationDocumentVerificationHistoryType;
    }

    /**
     * Sets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public void setIdRegulationDocumentVerificationHistoryType(int value) {
        this.idRegulationDocumentVerificationHistoryType = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryTypeName() {
        return regulationDocumentVerificationHistoryTypeName;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryTypeName(String value) {
        this.regulationDocumentVerificationHistoryTypeName = value;
    }

    /**
     * Gets the value of the isExistFile property.
     * 
     */
    public int getIsExistFile() {
        return isExistFile;
    }

    /**
     * Sets the value of the isExistFile property.
     * 
     */
    public void setIsExistFile(int value) {
        this.isExistFile = value;
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
     * Gets the value of the dodatok1Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodatok1Description() {
        return dodatok1Description;
    }

    /**
     * Sets the value of the dodatok1Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodatok1Description(String value) {
        this.dodatok1Description = value;
    }

    /**
     * Gets the value of the dodatok2Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodatok2Description() {
        return dodatok2Description;
    }

    /**
     * Sets the value of the dodatok2Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodatok2Description(String value) {
        this.dodatok2Description = value;
    }

    /**
     * Gets the value of the dodatok3Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodatok3Description() {
        return dodatok3Description;
    }

    /**
     * Sets the value of the dodatok3Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodatok3Description(String value) {
        this.dodatok3Description = value;
    }

    /**
     * Gets the value of the dodatok4Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodatok4Description() {
        return dodatok4Description;
    }

    /**
     * Sets the value of the dodatok4Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodatok4Description(String value) {
        this.dodatok4Description = value;
    }

    /**
     * Gets the value of the dodatok5Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodatok5Description() {
        return dodatok5Description;
    }

    /**
     * Sets the value of the dodatok5Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodatok5Description(String value) {
        this.dodatok5Description = value;
    }

    /**
     * Gets the value of the dodatok6Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodatok6Description() {
        return dodatok6Description;
    }

    /**
     * Sets the value of the dodatok6Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodatok6Description(String value) {
        this.dodatok6Description = value;
    }

    /**
     * Gets the value of the dodatok7Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodatok7Description() {
        return dodatok7Description;
    }

    /**
     * Sets the value of the dodatok7Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodatok7Description(String value) {
        this.dodatok7Description = value;
    }

    /**
     * Gets the value of the dodatok8Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodatok8Description() {
        return dodatok8Description;
    }

    /**
     * Sets the value of the dodatok8Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodatok8Description(String value) {
        this.dodatok8Description = value;
    }

    /**
     * Gets the value of the monCheck property.
     * 
     */
    public int getMONCheck() {
        return monCheck;
    }

    /**
     * Sets the value of the monCheck property.
     * 
     */
    public void setMONCheck(int value) {
        this.monCheck = value;
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
     * Gets the value of the seasonYear property.
     * 
     */
    public int getSeasonYear() {
        return seasonYear;
    }

    /**
     * Sets the value of the seasonYear property.
     * 
     */
    public void setSeasonYear(int value) {
        this.seasonYear = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
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
     * Gets the value of the vsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSP() {
        return vsp;
    }

    /**
     * Sets the value of the vsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSP(String value) {
        this.vsp = value;
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

}
