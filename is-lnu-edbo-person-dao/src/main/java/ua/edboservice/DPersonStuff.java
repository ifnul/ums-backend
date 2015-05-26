
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonStuff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonStuff">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Resident" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonSexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonTypeDict" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonWorkDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonWorkDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonWorkDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonStuff", propOrder = {
    "idPerson",
    "resident",
    "personCodeU",
    "birthday",
    "dateLastChange",
    "lastName",
    "firstName",
    "middleName",
    "idPersonSex",
    "personSexName",
    "idPersonTypeDict",
    "personTypeName",
    "documentSeries",
    "passportNumber",
    "idPersonWorks",
    "universityFacultetKode",
    "universityFacultetFullName",
    "personWorkName",
    "personWorkPosition",
    "personWorkDateBegin",
    "personWorkDateEnd",
    "personWorkDateLastChange",
    "personWorkDescription",
    "idPersonWorkType",
    "personWorkTypeName",
    "universityKode"
})
public class DPersonStuff {

    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Resident")
    protected boolean resident;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "PersonSexName")
    protected String personSexName;
    @XmlElement(name = "Id_PersonTypeDict")
    protected int idPersonTypeDict;
    @XmlElement(name = "PersonTypeName")
    protected String personTypeName;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "PassportNumber")
    protected String passportNumber;
    @XmlElement(name = "Id_PersonWorks")
    protected int idPersonWorks;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "PersonWorkName")
    protected String personWorkName;
    @XmlElement(name = "PersonWorkPosition")
    protected String personWorkPosition;
    @XmlElement(name = "PersonWorkDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personWorkDateBegin;
    @XmlElement(name = "PersonWorkDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personWorkDateEnd;
    @XmlElement(name = "PersonWorkDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personWorkDateLastChange;
    @XmlElement(name = "PersonWorkDescription")
    protected String personWorkDescription;
    @XmlElement(name = "Id_PersonWorkType")
    protected int idPersonWorkType;
    @XmlElement(name = "PersonWorkTypeName")
    protected String personWorkTypeName;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;

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
    public boolean isResident() {
        return resident;
    }

    /**
     * Sets the value of the resident property.
     * 
     */
    public void setResident(boolean value) {
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
     * Gets the value of the idPersonTypeDict property.
     * 
     */
    public int getIdPersonTypeDict() {
        return idPersonTypeDict;
    }

    /**
     * Sets the value of the idPersonTypeDict property.
     * 
     */
    public void setIdPersonTypeDict(int value) {
        this.idPersonTypeDict = value;
    }

    /**
     * Gets the value of the personTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonTypeName() {
        return personTypeName;
    }

    /**
     * Sets the value of the personTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonTypeName(String value) {
        this.personTypeName = value;
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
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the idPersonWorks property.
     * 
     */
    public int getIdPersonWorks() {
        return idPersonWorks;
    }

    /**
     * Sets the value of the idPersonWorks property.
     * 
     */
    public void setIdPersonWorks(int value) {
        this.idPersonWorks = value;
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
     * Gets the value of the personWorkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkName() {
        return personWorkName;
    }

    /**
     * Sets the value of the personWorkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkName(String value) {
        this.personWorkName = value;
    }

    /**
     * Gets the value of the personWorkPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkPosition() {
        return personWorkPosition;
    }

    /**
     * Sets the value of the personWorkPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkPosition(String value) {
        this.personWorkPosition = value;
    }

    /**
     * Gets the value of the personWorkDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonWorkDateBegin() {
        return personWorkDateBegin;
    }

    /**
     * Sets the value of the personWorkDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonWorkDateBegin(XMLGregorianCalendar value) {
        this.personWorkDateBegin = value;
    }

    /**
     * Gets the value of the personWorkDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonWorkDateEnd() {
        return personWorkDateEnd;
    }

    /**
     * Sets the value of the personWorkDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonWorkDateEnd(XMLGregorianCalendar value) {
        this.personWorkDateEnd = value;
    }

    /**
     * Gets the value of the personWorkDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonWorkDateLastChange() {
        return personWorkDateLastChange;
    }

    /**
     * Sets the value of the personWorkDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonWorkDateLastChange(XMLGregorianCalendar value) {
        this.personWorkDateLastChange = value;
    }

    /**
     * Gets the value of the personWorkDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkDescription() {
        return personWorkDescription;
    }

    /**
     * Sets the value of the personWorkDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkDescription(String value) {
        this.personWorkDescription = value;
    }

    /**
     * Gets the value of the idPersonWorkType property.
     * 
     */
    public int getIdPersonWorkType() {
        return idPersonWorkType;
    }

    /**
     * Sets the value of the idPersonWorkType property.
     * 
     */
    public void setIdPersonWorkType(int value) {
        this.idPersonWorkType = value;
    }

    /**
     * Gets the value of the personWorkTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkTypeName() {
        return personWorkTypeName;
    }

    /**
     * Sets the value of the personWorkTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkTypeName(String value) {
        this.personWorkTypeName = value;
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

}
