
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dExtAttestats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dExtAttestats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ExtAttestat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SchoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ASeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentNumberInOsvita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDataInOsvita" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityBossFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kvalification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PasportSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasportNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDocumentDateExpired" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ImportDocTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dExtAttestats", propOrder = {
    "idExtAttestat",
    "schoolName",
    "aDate",
    "aSeries",
    "aNumber",
    "fio",
    "firstName",
    "middleName",
    "lastName",
    "type",
    "dateCreate",
    "documentNumberInOsvita",
    "documentDataInOsvita",
    "universityBossFIO",
    "universityBossPost",
    "specialityKode",
    "specialityName",
    "kvalification",
    "profession",
    "idPersonSex",
    "birthday",
    "inn",
    "pasportType",
    "pasportSeries",
    "pasportNumbers",
    "educationDocumentDateExpired",
    "importDocTypeName"
})
public class DExtAttestats {

    @XmlElement(name = "Id_ExtAttestat")
    protected int idExtAttestat;
    @XmlElement(name = "SchoolName")
    protected String schoolName;
    @XmlElement(name = "ADate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aDate;
    @XmlElement(name = "ASeries")
    protected String aSeries;
    @XmlElement(name = "ANumber")
    protected String aNumber;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Type")
    protected int type;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DocumentNumberInOsvita")
    protected String documentNumberInOsvita;
    @XmlElement(name = "DocumentDataInOsvita", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDataInOsvita;
    @XmlElement(name = "UniversityBossFIO")
    protected String universityBossFIO;
    @XmlElement(name = "UniversityBossPost")
    protected String universityBossPost;
    @XmlElement(name = "SpecialityKode")
    protected String specialityKode;
    @XmlElement(name = "SpecialityName")
    protected String specialityName;
    @XmlElement(name = "Kvalification")
    protected String kvalification;
    @XmlElement(name = "Profession")
    protected String profession;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "PasportType")
    protected int pasportType;
    @XmlElement(name = "PasportSeries")
    protected String pasportSeries;
    @XmlElement(name = "PasportNumbers")
    protected String pasportNumbers;
    @XmlElement(name = "EducationDocumentDateExpired", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDocumentDateExpired;
    @XmlElement(name = "ImportDocTypeName")
    protected String importDocTypeName;

    /**
     * Gets the value of the idExtAttestat property.
     * 
     */
    public int getIdExtAttestat() {
        return idExtAttestat;
    }

    /**
     * Sets the value of the idExtAttestat property.
     * 
     */
    public void setIdExtAttestat(int value) {
        this.idExtAttestat = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the aDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getADate() {
        return aDate;
    }

    /**
     * Sets the value of the aDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setADate(XMLGregorianCalendar value) {
        this.aDate = value;
    }

    /**
     * Gets the value of the aSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASeries() {
        return aSeries;
    }

    /**
     * Sets the value of the aSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASeries(String value) {
        this.aSeries = value;
    }

    /**
     * Gets the value of the aNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANumber() {
        return aNumber;
    }

    /**
     * Sets the value of the aNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANumber(String value) {
        this.aNumber = value;
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
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
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
     * Gets the value of the documentNumberInOsvita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumberInOsvita() {
        return documentNumberInOsvita;
    }

    /**
     * Sets the value of the documentNumberInOsvita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumberInOsvita(String value) {
        this.documentNumberInOsvita = value;
    }

    /**
     * Gets the value of the documentDataInOsvita property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDataInOsvita() {
        return documentDataInOsvita;
    }

    /**
     * Sets the value of the documentDataInOsvita property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDataInOsvita(XMLGregorianCalendar value) {
        this.documentDataInOsvita = value;
    }

    /**
     * Gets the value of the universityBossFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossFIO() {
        return universityBossFIO;
    }

    /**
     * Sets the value of the universityBossFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossFIO(String value) {
        this.universityBossFIO = value;
    }

    /**
     * Gets the value of the universityBossPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossPost() {
        return universityBossPost;
    }

    /**
     * Sets the value of the universityBossPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossPost(String value) {
        this.universityBossPost = value;
    }

    /**
     * Gets the value of the specialityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityKode() {
        return specialityKode;
    }

    /**
     * Sets the value of the specialityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityKode(String value) {
        this.specialityKode = value;
    }

    /**
     * Gets the value of the specialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityName() {
        return specialityName;
    }

    /**
     * Sets the value of the specialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityName(String value) {
        this.specialityName = value;
    }

    /**
     * Gets the value of the kvalification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvalification() {
        return kvalification;
    }

    /**
     * Sets the value of the kvalification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvalification(String value) {
        this.kvalification = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfession(String value) {
        this.profession = value;
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

    /**
     * Gets the value of the pasportType property.
     * 
     */
    public int getPasportType() {
        return pasportType;
    }

    /**
     * Sets the value of the pasportType property.
     * 
     */
    public void setPasportType(int value) {
        this.pasportType = value;
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
     * Gets the value of the pasportNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasportNumbers() {
        return pasportNumbers;
    }

    /**
     * Sets the value of the pasportNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasportNumbers(String value) {
        this.pasportNumbers = value;
    }

    /**
     * Gets the value of the educationDocumentDateExpired property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationDocumentDateExpired() {
        return educationDocumentDateExpired;
    }

    /**
     * Sets the value of the educationDocumentDateExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationDocumentDateExpired(XMLGregorianCalendar value) {
        this.educationDocumentDateExpired = value;
    }

    /**
     * Gets the value of the importDocTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDocTypeName() {
        return importDocTypeName;
    }

    /**
     * Sets the value of the importDocTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDocTypeName(String value) {
        this.importDocTypeName = value;
    }

}
