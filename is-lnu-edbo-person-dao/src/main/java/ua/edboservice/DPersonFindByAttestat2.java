
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonFindByAttestat2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonFindByAttestat2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Resident" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtestatDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AtestatBall" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIOEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonFindByAttestat2", propOrder = {
    "idPerson",
    "resident",
    "personCodeU",
    "birthday",
    "lastName",
    "firstName",
    "middleName",
    "fio",
    "atestatSeries",
    "atestatNumber",
    "atestatDate",
    "idPersonSex",
    "atestatBall",
    "idPersonDocument",
    "lastNameEn",
    "firstNameEn",
    "middleNameEn",
    "fioEn"
})
public class DPersonFindByAttestat2 {

    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Resident")
    protected int resident;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "AtestatSeries")
    protected String atestatSeries;
    @XmlElement(name = "AtestatNumber")
    protected String atestatNumber;
    @XmlElement(name = "AtestatDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar atestatDate;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "AtestatBall", required = true)
    protected BigDecimal atestatBall;
    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "LastNameEn")
    protected String lastNameEn;
    @XmlElement(name = "FirstNameEn")
    protected String firstNameEn;
    @XmlElement(name = "MiddleNameEn")
    protected String middleNameEn;
    @XmlElement(name = "FIOEn")
    protected String fioEn;

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
     * Gets the value of the atestatSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtestatSeries() {
        return atestatSeries;
    }

    /**
     * Sets the value of the atestatSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtestatSeries(String value) {
        this.atestatSeries = value;
    }

    /**
     * Gets the value of the atestatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtestatNumber() {
        return atestatNumber;
    }

    /**
     * Sets the value of the atestatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtestatNumber(String value) {
        this.atestatNumber = value;
    }

    /**
     * Gets the value of the atestatDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAtestatDate() {
        return atestatDate;
    }

    /**
     * Sets the value of the atestatDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAtestatDate(XMLGregorianCalendar value) {
        this.atestatDate = value;
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
     * Gets the value of the atestatBall property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAtestatBall() {
        return atestatBall;
    }

    /**
     * Sets the value of the atestatBall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAtestatBall(BigDecimal value) {
        this.atestatBall = value;
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
     * Gets the value of the fioEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOEn() {
        return fioEn;
    }

    /**
     * Sets the value of the fioEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOEn(String value) {
        this.fioEn = value;
    }

}
