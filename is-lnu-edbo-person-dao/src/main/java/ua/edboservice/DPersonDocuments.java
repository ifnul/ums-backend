
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InstitutionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstitutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonEducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationTypeName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentExpiredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonDocumentEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ZNOBall" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="PersonDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AtestatValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ZNOPin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCheckForPaperCopy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsForeinghEntrantDocumet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsNotCheckAttestat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsEntrantDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentsAwardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentsAwardTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cancellad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonDocuments", propOrder = {
    "idPersonDocument",
    "idPerson",
    "idPersonDocumentType",
    "idPersonEducation",
    "institutionCode",
    "institutionName",
    "personEducationDateBegin",
    "personEducationDateEnd",
    "idPersonEducationForm",
    "idPersonEducationFormName",
    "personEducationFormName",
    "idPersonEducationType",
    "idPersonEducationTypeName",
    "personEducationTypeName",
    "documentSeries",
    "documentNumbers",
    "documentDateGet",
    "documentExpiredDate",
    "documentIssued",
    "description",
    "personDocumentBegin",
    "personDocumentEnd",
    "znoBall",
    "personDocumentTypeName",
    "idLanguage",
    "atestatValue",
    "znoPin",
    "personCodeU",
    "isCheckForPaperCopy",
    "isForeinghEntrantDocumet",
    "isNotCheckAttestat",
    "isEntrantDocument",
    "idPersonDocumentsAwardType",
    "personDocumentsAwardTypeName",
    "cancellad"
})
public class DPersonDocuments {

    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "InstitutionCode")
    protected String institutionCode;
    @XmlElement(name = "InstitutionName")
    protected String institutionName;
    @XmlElement(name = "PersonEducationDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationDateBegin;
    @XmlElement(name = "PersonEducationDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationDateEnd;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "Id_PersonEducationFormName")
    protected int idPersonEducationFormName;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "Id_PersonEducationType")
    protected int idPersonEducationType;
    @XmlElement(name = "Id_PersonEducationTypeName")
    protected int idPersonEducationTypeName;
    @XmlElement(name = "PersonEducationTypeName")
    protected String personEducationTypeName;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumbers")
    protected String documentNumbers;
    @XmlElement(name = "DocumentDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGet;
    @XmlElement(name = "DocumentExpiredDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentExpiredDate;
    @XmlElement(name = "DocumentIssued")
    protected String documentIssued;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PersonDocumentBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personDocumentBegin;
    @XmlElement(name = "PersonDocumentEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personDocumentEnd;
    @XmlElement(name = "ZNOBall")
    protected float znoBall;
    @XmlElement(name = "PersonDocumentTypeName")
    protected String personDocumentTypeName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "AtestatValue", required = true)
    protected BigDecimal atestatValue;
    @XmlElement(name = "ZNOPin")
    protected int znoPin;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "IsCheckForPaperCopy")
    protected int isCheckForPaperCopy;
    @XmlElement(name = "IsForeinghEntrantDocumet")
    protected int isForeinghEntrantDocumet;
    @XmlElement(name = "IsNotCheckAttestat")
    protected int isNotCheckAttestat;
    @XmlElement(name = "IsEntrantDocument")
    protected int isEntrantDocument;
    @XmlElement(name = "Id_PersonDocumentsAwardType")
    protected int idPersonDocumentsAwardType;
    @XmlElement(name = "PersonDocumentsAwardTypeName")
    protected String personDocumentsAwardTypeName;
    @XmlElement(name = "Cancellad")
    protected int cancellad;

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
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
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
     * Gets the value of the idPersonEducation property.
     * 
     */
    public int getIdPersonEducation() {
        return idPersonEducation;
    }

    /**
     * Sets the value of the idPersonEducation property.
     * 
     */
    public void setIdPersonEducation(int value) {
        this.idPersonEducation = value;
    }

    /**
     * Gets the value of the institutionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionCode() {
        return institutionCode;
    }

    /**
     * Sets the value of the institutionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionCode(String value) {
        this.institutionCode = value;
    }

    /**
     * Gets the value of the institutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Sets the value of the institutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionName(String value) {
        this.institutionName = value;
    }

    /**
     * Gets the value of the personEducationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationDateBegin() {
        return personEducationDateBegin;
    }

    /**
     * Sets the value of the personEducationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationDateBegin(XMLGregorianCalendar value) {
        this.personEducationDateBegin = value;
    }

    /**
     * Gets the value of the personEducationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationDateEnd() {
        return personEducationDateEnd;
    }

    /**
     * Sets the value of the personEducationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationDateEnd(XMLGregorianCalendar value) {
        this.personEducationDateEnd = value;
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
     * Gets the value of the idPersonEducationFormName property.
     * 
     */
    public int getIdPersonEducationFormName() {
        return idPersonEducationFormName;
    }

    /**
     * Sets the value of the idPersonEducationFormName property.
     * 
     */
    public void setIdPersonEducationFormName(int value) {
        this.idPersonEducationFormName = value;
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
     * Gets the value of the idPersonEducationType property.
     * 
     */
    public int getIdPersonEducationType() {
        return idPersonEducationType;
    }

    /**
     * Sets the value of the idPersonEducationType property.
     * 
     */
    public void setIdPersonEducationType(int value) {
        this.idPersonEducationType = value;
    }

    /**
     * Gets the value of the idPersonEducationTypeName property.
     * 
     */
    public int getIdPersonEducationTypeName() {
        return idPersonEducationTypeName;
    }

    /**
     * Sets the value of the idPersonEducationTypeName property.
     * 
     */
    public void setIdPersonEducationTypeName(int value) {
        this.idPersonEducationTypeName = value;
    }

    /**
     * Gets the value of the personEducationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationTypeName() {
        return personEducationTypeName;
    }

    /**
     * Sets the value of the personEducationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationTypeName(String value) {
        this.personEducationTypeName = value;
    }

    /**
     * Gets the value of the documentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSeries() {
        return documentSeries;
    }

    /**
     * Sets the value of the documentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSeries(String value) {
        this.documentSeries = value;
    }

    /**
     * Gets the value of the documentNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumbers() {
        return documentNumbers;
    }

    /**
     * Sets the value of the documentNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumbers(String value) {
        this.documentNumbers = value;
    }

    /**
     * Gets the value of the documentDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDateGet() {
        return documentDateGet;
    }

    /**
     * Sets the value of the documentDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDateGet(XMLGregorianCalendar value) {
        this.documentDateGet = value;
    }

    /**
     * Gets the value of the documentExpiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentExpiredDate() {
        return documentExpiredDate;
    }

    /**
     * Sets the value of the documentExpiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentExpiredDate(XMLGregorianCalendar value) {
        this.documentExpiredDate = value;
    }

    /**
     * Gets the value of the documentIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssued() {
        return documentIssued;
    }

    /**
     * Sets the value of the documentIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssued(String value) {
        this.documentIssued = value;
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
     * Gets the value of the personDocumentBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonDocumentBegin() {
        return personDocumentBegin;
    }

    /**
     * Sets the value of the personDocumentBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonDocumentBegin(XMLGregorianCalendar value) {
        this.personDocumentBegin = value;
    }

    /**
     * Gets the value of the personDocumentEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonDocumentEnd() {
        return personDocumentEnd;
    }

    /**
     * Sets the value of the personDocumentEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonDocumentEnd(XMLGregorianCalendar value) {
        this.personDocumentEnd = value;
    }

    /**
     * Gets the value of the znoBall property.
     * 
     */
    public float getZNOBall() {
        return znoBall;
    }

    /**
     * Sets the value of the znoBall property.
     * 
     */
    public void setZNOBall(float value) {
        this.znoBall = value;
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
     * Gets the value of the atestatValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAtestatValue() {
        return atestatValue;
    }

    /**
     * Sets the value of the atestatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAtestatValue(BigDecimal value) {
        this.atestatValue = value;
    }

    /**
     * Gets the value of the znoPin property.
     * 
     */
    public int getZNOPin() {
        return znoPin;
    }

    /**
     * Sets the value of the znoPin property.
     * 
     */
    public void setZNOPin(int value) {
        this.znoPin = value;
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
     * Gets the value of the isEntrantDocument property.
     * 
     */
    public int getIsEntrantDocument() {
        return isEntrantDocument;
    }

    /**
     * Sets the value of the isEntrantDocument property.
     * 
     */
    public void setIsEntrantDocument(int value) {
        this.isEntrantDocument = value;
    }

    /**
     * Gets the value of the idPersonDocumentsAwardType property.
     * 
     */
    public int getIdPersonDocumentsAwardType() {
        return idPersonDocumentsAwardType;
    }

    /**
     * Sets the value of the idPersonDocumentsAwardType property.
     * 
     */
    public void setIdPersonDocumentsAwardType(int value) {
        this.idPersonDocumentsAwardType = value;
    }

    /**
     * Gets the value of the personDocumentsAwardTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentsAwardTypeName() {
        return personDocumentsAwardTypeName;
    }

    /**
     * Sets the value of the personDocumentsAwardTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentsAwardTypeName(String value) {
        this.personDocumentsAwardTypeName = value;
    }

    /**
     * Gets the value of the cancellad property.
     * 
     */
    public int getCancellad() {
        return cancellad;
    }

    /**
     * Sets the value of the cancellad property.
     * 
     */
    public void setCancellad(int value) {
        this.cancellad = value;
    }

}
