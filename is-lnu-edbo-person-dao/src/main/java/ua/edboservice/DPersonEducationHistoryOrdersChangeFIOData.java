
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonEducationHistoryOrdersChangeFIOData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationHistoryOrdersChangeFIOData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationHistoryOrdersAdditionalData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationHistoryOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIODateChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistInEDBO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonFIOType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIOSkeepCreateDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationHistoryOrdersChangeFIOData", propOrder = {
    "idPersonEducationHistoryOrdersAdditionalData",
    "idPersonEducationHistoryOrders",
    "firstName",
    "middleName",
    "lastName",
    "documentSeries",
    "documentNumbers",
    "documentDateGet",
    "documentIssued",
    "documentDescription",
    "fioDateChange",
    "personCodeU",
    "currentFIO",
    "existInEDBO",
    "idPersonDocumentType",
    "personFIOType",
    "fioSkeepCreateDocuments",
    "lastNameEn",
    "firstNameEn",
    "middleNameEn",
    "oldFIO"
})
public class DPersonEducationHistoryOrdersChangeFIOData {

    @XmlElement(name = "Id_PersonEducationHistoryOrdersAdditionalData")
    protected int idPersonEducationHistoryOrdersAdditionalData;
    @XmlElement(name = "Id_PersonEducationHistoryOrders")
    protected int idPersonEducationHistoryOrders;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumbers")
    protected String documentNumbers;
    @XmlElement(name = "DocumentDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGet;
    @XmlElement(name = "DocumentIssued")
    protected String documentIssued;
    @XmlElement(name = "DocumentDescription")
    protected String documentDescription;
    @XmlElement(name = "FIODateChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fioDateChange;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "CurrentFIO")
    protected String currentFIO;
    @XmlElement(name = "ExistInEDBO")
    protected int existInEDBO;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "PersonFIOType")
    protected int personFIOType;
    @XmlElement(name = "FIOSkeepCreateDocuments")
    protected int fioSkeepCreateDocuments;
    @XmlElement(name = "LastNameEn")
    protected String lastNameEn;
    @XmlElement(name = "FirstNameEn")
    protected String firstNameEn;
    @XmlElement(name = "MiddleNameEn")
    protected String middleNameEn;
    @XmlElement(name = "OldFIO")
    protected String oldFIO;

    /**
     * Gets the value of the idPersonEducationHistoryOrdersAdditionalData property.
     * 
     */
    public int getIdPersonEducationHistoryOrdersAdditionalData() {
        return idPersonEducationHistoryOrdersAdditionalData;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrdersAdditionalData property.
     * 
     */
    public void setIdPersonEducationHistoryOrdersAdditionalData(int value) {
        this.idPersonEducationHistoryOrdersAdditionalData = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public int getIdPersonEducationHistoryOrders() {
        return idPersonEducationHistoryOrders;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public void setIdPersonEducationHistoryOrders(int value) {
        this.idPersonEducationHistoryOrders = value;
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
     * Gets the value of the documentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Sets the value of the documentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDescription(String value) {
        this.documentDescription = value;
    }

    /**
     * Gets the value of the fioDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFIODateChange() {
        return fioDateChange;
    }

    /**
     * Sets the value of the fioDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFIODateChange(XMLGregorianCalendar value) {
        this.fioDateChange = value;
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
     * Gets the value of the currentFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFIO() {
        return currentFIO;
    }

    /**
     * Sets the value of the currentFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFIO(String value) {
        this.currentFIO = value;
    }

    /**
     * Gets the value of the existInEDBO property.
     * 
     */
    public int getExistInEDBO() {
        return existInEDBO;
    }

    /**
     * Sets the value of the existInEDBO property.
     * 
     */
    public void setExistInEDBO(int value) {
        this.existInEDBO = value;
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
     * Gets the value of the personFIOType property.
     * 
     */
    public int getPersonFIOType() {
        return personFIOType;
    }

    /**
     * Sets the value of the personFIOType property.
     * 
     */
    public void setPersonFIOType(int value) {
        this.personFIOType = value;
    }

    /**
     * Gets the value of the fioSkeepCreateDocuments property.
     * 
     */
    public int getFIOSkeepCreateDocuments() {
        return fioSkeepCreateDocuments;
    }

    /**
     * Sets the value of the fioSkeepCreateDocuments property.
     * 
     */
    public void setFIOSkeepCreateDocuments(int value) {
        this.fioSkeepCreateDocuments = value;
    }

    /**
     * Gets the value of the lastNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameEn() {
        return lastNameEn;
    }

    /**
     * Sets the value of the lastNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameEn(String value) {
        this.lastNameEn = value;
    }

    /**
     * Gets the value of the firstNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameEn() {
        return firstNameEn;
    }

    /**
     * Sets the value of the firstNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameEn(String value) {
        this.firstNameEn = value;
    }

    /**
     * Gets the value of the middleNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleNameEn() {
        return middleNameEn;
    }

    /**
     * Sets the value of the middleNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleNameEn(String value) {
        this.middleNameEn = value;
    }

    /**
     * Gets the value of the oldFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldFIO() {
        return oldFIO;
    }

    /**
     * Sets the value of the oldFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldFIO(String value) {
        this.oldFIO = value;
    }

}
