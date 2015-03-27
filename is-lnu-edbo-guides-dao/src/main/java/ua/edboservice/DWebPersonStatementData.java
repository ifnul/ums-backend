
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dWebPersonStatementData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebPersonStatementData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EngLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EngFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EngMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDay" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SexTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Citizen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocSeria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocGiven" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorImport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorImportDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonSexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_WebPersonsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebPersonStatementData", propOrder = {
    "idWebPersons",
    "personCodeU",
    "lastName",
    "firstName",
    "middleName",
    "engLastName",
    "engFirstName",
    "engMiddleName",
    "birthDay",
    "sexTypeID",
    "citizen",
    "docTypeID",
    "docSeria",
    "docNumber",
    "docDate",
    "docGiven",
    "errorImport",
    "errorImportDescription",
    "statusType",
    "statusTypeName",
    "personDocumentTypeName",
    "personSexName",
    "countryName",
    "universityKode",
    "idWebPersonsType"
})
public class DWebPersonStatementData {

    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "EngLastName")
    protected String engLastName;
    @XmlElement(name = "EngFirstName")
    protected String engFirstName;
    @XmlElement(name = "EngMiddleName")
    protected String engMiddleName;
    @XmlElement(name = "BirthDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDay;
    @XmlElement(name = "SexTypeID")
    protected int sexTypeID;
    @XmlElement(name = "Citizen")
    protected int citizen;
    @XmlElement(name = "DocTypeID")
    protected int docTypeID;
    @XmlElement(name = "DocSeria")
    protected String docSeria;
    @XmlElement(name = "DocNumber")
    protected String docNumber;
    @XmlElement(name = "DocDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "DocGiven")
    protected String docGiven;
    @XmlElement(name = "ErrorImport")
    protected int errorImport;
    @XmlElement(name = "ErrorImportDescription")
    protected String errorImportDescription;
    @XmlElement(name = "StatusType")
    protected int statusType;
    @XmlElement(name = "StatusTypeName")
    protected String statusTypeName;
    @XmlElement(name = "PersonDocumentTypeName")
    protected String personDocumentTypeName;
    @XmlElement(name = "PersonSexName")
    protected String personSexName;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_WebPersonsType")
    protected int idWebPersonsType;

    /**
     * Gets the value of the idWebPersons property.
     * 
     */
    public int getIdWebPersons() {
        return idWebPersons;
    }

    /**
     * Sets the value of the idWebPersons property.
     * 
     */
    public void setIdWebPersons(int value) {
        this.idWebPersons = value;
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
     * Gets the value of the engLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngLastName() {
        return engLastName;
    }

    /**
     * Sets the value of the engLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngLastName(String value) {
        this.engLastName = value;
    }

    /**
     * Gets the value of the engFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngFirstName() {
        return engFirstName;
    }

    /**
     * Sets the value of the engFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngFirstName(String value) {
        this.engFirstName = value;
    }

    /**
     * Gets the value of the engMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngMiddleName() {
        return engMiddleName;
    }

    /**
     * Sets the value of the engMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngMiddleName(String value) {
        this.engMiddleName = value;
    }

    /**
     * Gets the value of the birthDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDay() {
        return birthDay;
    }

    /**
     * Sets the value of the birthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDay(XMLGregorianCalendar value) {
        this.birthDay = value;
    }

    /**
     * Gets the value of the sexTypeID property.
     * 
     */
    public int getSexTypeID() {
        return sexTypeID;
    }

    /**
     * Sets the value of the sexTypeID property.
     * 
     */
    public void setSexTypeID(int value) {
        this.sexTypeID = value;
    }

    /**
     * Gets the value of the citizen property.
     * 
     */
    public int getCitizen() {
        return citizen;
    }

    /**
     * Sets the value of the citizen property.
     * 
     */
    public void setCitizen(int value) {
        this.citizen = value;
    }

    /**
     * Gets the value of the docTypeID property.
     * 
     */
    public int getDocTypeID() {
        return docTypeID;
    }

    /**
     * Sets the value of the docTypeID property.
     * 
     */
    public void setDocTypeID(int value) {
        this.docTypeID = value;
    }

    /**
     * Gets the value of the docSeria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSeria() {
        return docSeria;
    }

    /**
     * Sets the value of the docSeria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSeria(String value) {
        this.docSeria = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the docGiven property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocGiven() {
        return docGiven;
    }

    /**
     * Sets the value of the docGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocGiven(String value) {
        this.docGiven = value;
    }

    /**
     * Gets the value of the errorImport property.
     * 
     */
    public int getErrorImport() {
        return errorImport;
    }

    /**
     * Sets the value of the errorImport property.
     * 
     */
    public void setErrorImport(int value) {
        this.errorImport = value;
    }

    /**
     * Gets the value of the errorImportDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorImportDescription() {
        return errorImportDescription;
    }

    /**
     * Sets the value of the errorImportDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorImportDescription(String value) {
        this.errorImportDescription = value;
    }

    /**
     * Gets the value of the statusType property.
     * 
     */
    public int getStatusType() {
        return statusType;
    }

    /**
     * Sets the value of the statusType property.
     * 
     */
    public void setStatusType(int value) {
        this.statusType = value;
    }

    /**
     * Gets the value of the statusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusTypeName() {
        return statusTypeName;
    }

    /**
     * Sets the value of the statusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusTypeName(String value) {
        this.statusTypeName = value;
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
     * Gets the value of the idWebPersonsType property.
     * 
     */
    public int getIdWebPersonsType() {
        return idWebPersonsType;
    }

    /**
     * Sets the value of the idWebPersonsType property.
     * 
     */
    public void setIdWebPersonsType(int value) {
        this.idWebPersonsType = value;
    }

}
