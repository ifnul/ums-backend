
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dExtAttestatsZNOFind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dExtAttestatsZNOFind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ImportDocData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityNameInOsvita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDocumentDateGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EducationDocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABirthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="APersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ImportDocType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExtZNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthdey" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Subject1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ball1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_Subject2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ball2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_Subject3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ball3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_Subject4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ball4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_Subject5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ball5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Houce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Appartmen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUIDSchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetTypeFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetTypeShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dExtAttestatsZNOFind", propOrder = {
    "idImportDocData",
    "universityNameInOsvita",
    "educationDocumentDateGive",
    "educationDocumentSeries",
    "educationDocumentNumber",
    "aFirstName",
    "aMiddleName",
    "aLastName",
    "aBirthday",
    "aPersonSex",
    "idImportDocType",
    "idExtZNO",
    "year",
    "number",
    "pin",
    "lastName",
    "firstName",
    "middleName",
    "birthdey",
    "idSubject1",
    "subjectName1",
    "ball1",
    "idSubject2",
    "subjectName2",
    "ball2",
    "idSubject3",
    "subjectName3",
    "ball3",
    "idSubject4",
    "subjectName4",
    "ball4",
    "idSubject5",
    "subjectName5",
    "ball5",
    "postIndex",
    "koatuu",
    "streetType",
    "streetName",
    "houce",
    "appartmen",
    "guidSchool",
    "streetTypeFullName",
    "streetTypeShortName",
    "koatuuFullName",
    "schoolName"
})
public class DExtAttestatsZNOFind {

    @XmlElement(name = "Id_ImportDocData")
    protected int idImportDocData;
    @XmlElement(name = "UniversityNameInOsvita")
    protected String universityNameInOsvita;
    @XmlElement(name = "EducationDocumentDateGive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDocumentDateGive;
    @XmlElement(name = "EducationDocumentSeries")
    protected String educationDocumentSeries;
    @XmlElement(name = "EducationDocumentNumber")
    protected String educationDocumentNumber;
    @XmlElement(name = "AFirstName")
    protected String aFirstName;
    @XmlElement(name = "AMiddleName")
    protected String aMiddleName;
    @XmlElement(name = "ALastName")
    protected String aLastName;
    @XmlElement(name = "ABirthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aBirthday;
    @XmlElement(name = "APersonSex")
    protected int aPersonSex;
    @XmlElement(name = "Id_ImportDocType")
    protected int idImportDocType;
    @XmlElement(name = "Id_ExtZNO")
    protected int idExtZNO;
    @XmlElement(name = "Year")
    protected String year;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Pin")
    protected String pin;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Birthdey", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdey;
    @XmlElement(name = "Id_Subject1")
    protected int idSubject1;
    @XmlElement(name = "SubjectName1")
    protected String subjectName1;
    @XmlElement(name = "Ball1", required = true)
    protected BigDecimal ball1;
    @XmlElement(name = "Id_Subject2")
    protected int idSubject2;
    @XmlElement(name = "SubjectName2")
    protected String subjectName2;
    @XmlElement(name = "Ball2", required = true)
    protected BigDecimal ball2;
    @XmlElement(name = "Id_Subject3")
    protected int idSubject3;
    @XmlElement(name = "SubjectName3")
    protected String subjectName3;
    @XmlElement(name = "Ball3", required = true)
    protected BigDecimal ball3;
    @XmlElement(name = "Id_Subject4")
    protected int idSubject4;
    @XmlElement(name = "SubjectName4")
    protected String subjectName4;
    @XmlElement(name = "Ball4", required = true)
    protected BigDecimal ball4;
    @XmlElement(name = "Id_Subject5")
    protected int idSubject5;
    @XmlElement(name = "SubjectName5")
    protected String subjectName5;
    @XmlElement(name = "Ball5", required = true)
    protected BigDecimal ball5;
    @XmlElement(name = "PostIndex")
    protected String postIndex;
    @XmlElement(name = "KOATUU")
    protected String koatuu;
    @XmlElement(name = "StreetType")
    protected int streetType;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "Houce")
    protected String houce;
    @XmlElement(name = "Appartmen")
    protected String appartmen;
    @XmlElement(name = "GUIDSchool")
    protected String guidSchool;
    @XmlElement(name = "StreetTypeFullName")
    protected String streetTypeFullName;
    @XmlElement(name = "StreetTypeShortName")
    protected String streetTypeShortName;
    @XmlElement(name = "KOATUUFullName")
    protected String koatuuFullName;
    @XmlElement(name = "SchoolName")
    protected String schoolName;

    /**
     * Gets the value of the idImportDocData property.
     * 
     */
    public int getIdImportDocData() {
        return idImportDocData;
    }

    /**
     * Sets the value of the idImportDocData property.
     * 
     */
    public void setIdImportDocData(int value) {
        this.idImportDocData = value;
    }

    /**
     * Gets the value of the universityNameInOsvita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityNameInOsvita() {
        return universityNameInOsvita;
    }

    /**
     * Sets the value of the universityNameInOsvita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityNameInOsvita(String value) {
        this.universityNameInOsvita = value;
    }

    /**
     * Gets the value of the educationDocumentDateGive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationDocumentDateGive() {
        return educationDocumentDateGive;
    }

    /**
     * Sets the value of the educationDocumentDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationDocumentDateGive(XMLGregorianCalendar value) {
        this.educationDocumentDateGive = value;
    }

    /**
     * Gets the value of the educationDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDocumentSeries() {
        return educationDocumentSeries;
    }

    /**
     * Sets the value of the educationDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDocumentSeries(String value) {
        this.educationDocumentSeries = value;
    }

    /**
     * Gets the value of the educationDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDocumentNumber() {
        return educationDocumentNumber;
    }

    /**
     * Sets the value of the educationDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDocumentNumber(String value) {
        this.educationDocumentNumber = value;
    }

    /**
     * Gets the value of the aFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAFirstName() {
        return aFirstName;
    }

    /**
     * Sets the value of the aFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAFirstName(String value) {
        this.aFirstName = value;
    }

    /**
     * Gets the value of the aMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMiddleName() {
        return aMiddleName;
    }

    /**
     * Sets the value of the aMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMiddleName(String value) {
        this.aMiddleName = value;
    }

    /**
     * Gets the value of the aLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALastName() {
        return aLastName;
    }

    /**
     * Sets the value of the aLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALastName(String value) {
        this.aLastName = value;
    }

    /**
     * Gets the value of the aBirthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getABirthday() {
        return aBirthday;
    }

    /**
     * Sets the value of the aBirthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setABirthday(XMLGregorianCalendar value) {
        this.aBirthday = value;
    }

    /**
     * Gets the value of the aPersonSex property.
     * 
     */
    public int getAPersonSex() {
        return aPersonSex;
    }

    /**
     * Sets the value of the aPersonSex property.
     * 
     */
    public void setAPersonSex(int value) {
        this.aPersonSex = value;
    }

    /**
     * Gets the value of the idImportDocType property.
     * 
     */
    public int getIdImportDocType() {
        return idImportDocType;
    }

    /**
     * Sets the value of the idImportDocType property.
     * 
     */
    public void setIdImportDocType(int value) {
        this.idImportDocType = value;
    }

    /**
     * Gets the value of the idExtZNO property.
     * 
     */
    public int getIdExtZNO() {
        return idExtZNO;
    }

    /**
     * Sets the value of the idExtZNO property.
     * 
     */
    public void setIdExtZNO(int value) {
        this.idExtZNO = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
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
     * Gets the value of the birthdey property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdey() {
        return birthdey;
    }

    /**
     * Sets the value of the birthdey property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdey(XMLGregorianCalendar value) {
        this.birthdey = value;
    }

    /**
     * Gets the value of the idSubject1 property.
     * 
     */
    public int getIdSubject1() {
        return idSubject1;
    }

    /**
     * Sets the value of the idSubject1 property.
     * 
     */
    public void setIdSubject1(int value) {
        this.idSubject1 = value;
    }

    /**
     * Gets the value of the subjectName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName1() {
        return subjectName1;
    }

    /**
     * Sets the value of the subjectName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName1(String value) {
        this.subjectName1 = value;
    }

    /**
     * Gets the value of the ball1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBall1() {
        return ball1;
    }

    /**
     * Sets the value of the ball1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBall1(BigDecimal value) {
        this.ball1 = value;
    }

    /**
     * Gets the value of the idSubject2 property.
     * 
     */
    public int getIdSubject2() {
        return idSubject2;
    }

    /**
     * Sets the value of the idSubject2 property.
     * 
     */
    public void setIdSubject2(int value) {
        this.idSubject2 = value;
    }

    /**
     * Gets the value of the subjectName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName2() {
        return subjectName2;
    }

    /**
     * Sets the value of the subjectName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName2(String value) {
        this.subjectName2 = value;
    }

    /**
     * Gets the value of the ball2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBall2() {
        return ball2;
    }

    /**
     * Sets the value of the ball2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBall2(BigDecimal value) {
        this.ball2 = value;
    }

    /**
     * Gets the value of the idSubject3 property.
     * 
     */
    public int getIdSubject3() {
        return idSubject3;
    }

    /**
     * Sets the value of the idSubject3 property.
     * 
     */
    public void setIdSubject3(int value) {
        this.idSubject3 = value;
    }

    /**
     * Gets the value of the subjectName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName3() {
        return subjectName3;
    }

    /**
     * Sets the value of the subjectName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName3(String value) {
        this.subjectName3 = value;
    }

    /**
     * Gets the value of the ball3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBall3() {
        return ball3;
    }

    /**
     * Sets the value of the ball3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBall3(BigDecimal value) {
        this.ball3 = value;
    }

    /**
     * Gets the value of the idSubject4 property.
     * 
     */
    public int getIdSubject4() {
        return idSubject4;
    }

    /**
     * Sets the value of the idSubject4 property.
     * 
     */
    public void setIdSubject4(int value) {
        this.idSubject4 = value;
    }

    /**
     * Gets the value of the subjectName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName4() {
        return subjectName4;
    }

    /**
     * Sets the value of the subjectName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName4(String value) {
        this.subjectName4 = value;
    }

    /**
     * Gets the value of the ball4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBall4() {
        return ball4;
    }

    /**
     * Sets the value of the ball4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBall4(BigDecimal value) {
        this.ball4 = value;
    }

    /**
     * Gets the value of the idSubject5 property.
     * 
     */
    public int getIdSubject5() {
        return idSubject5;
    }

    /**
     * Sets the value of the idSubject5 property.
     * 
     */
    public void setIdSubject5(int value) {
        this.idSubject5 = value;
    }

    /**
     * Gets the value of the subjectName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName5() {
        return subjectName5;
    }

    /**
     * Sets the value of the subjectName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName5(String value) {
        this.subjectName5 = value;
    }

    /**
     * Gets the value of the ball5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBall5() {
        return ball5;
    }

    /**
     * Sets the value of the ball5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBall5(BigDecimal value) {
        this.ball5 = value;
    }

    /**
     * Gets the value of the postIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostIndex() {
        return postIndex;
    }

    /**
     * Sets the value of the postIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostIndex(String value) {
        this.postIndex = value;
    }

    /**
     * Gets the value of the koatuu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUU() {
        return koatuu;
    }

    /**
     * Sets the value of the koatuu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUU(String value) {
        this.koatuu = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     */
    public int getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     */
    public void setStreetType(int value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the houce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouce() {
        return houce;
    }

    /**
     * Sets the value of the houce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouce(String value) {
        this.houce = value;
    }

    /**
     * Gets the value of the appartmen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppartmen() {
        return appartmen;
    }

    /**
     * Sets the value of the appartmen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppartmen(String value) {
        this.appartmen = value;
    }

    /**
     * Gets the value of the guidSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUIDSchool() {
        return guidSchool;
    }

    /**
     * Sets the value of the guidSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUIDSchool(String value) {
        this.guidSchool = value;
    }

    /**
     * Gets the value of the streetTypeFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTypeFullName() {
        return streetTypeFullName;
    }

    /**
     * Sets the value of the streetTypeFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTypeFullName(String value) {
        this.streetTypeFullName = value;
    }

    /**
     * Gets the value of the streetTypeShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTypeShortName() {
        return streetTypeShortName;
    }

    /**
     * Sets the value of the streetTypeShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTypeShortName(String value) {
        this.streetTypeShortName = value;
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

}
