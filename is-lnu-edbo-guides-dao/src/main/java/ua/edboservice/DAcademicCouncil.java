
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcademicCouncil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicCouncil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicCouncil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicCouncilOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilOrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicCouncilDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicCouncilPersonDateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicCouncilType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicCouncilNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicCouncilTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserAddFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU_Head" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_Head" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU_HeadDeputy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_HeadDeputy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU_Secretary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_Secretary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsSingle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicCouncil", propOrder = {
    "idAcademicCouncil",
    "academicCouncilOrderNumber",
    "academicCouncilOrderDate",
    "universityKode",
    "academicCouncilDateBegin",
    "academicCouncilDateEnd",
    "academicCouncilPersonDateCreate",
    "idUserAdd",
    "universityFacultetKode",
    "idAcademicCouncilType",
    "academicCouncilNumber",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "academicCouncilTypeName",
    "universityFacultetFullName",
    "userAddFIO",
    "address",
    "phone",
    "fax",
    "email",
    "web",
    "personCodeUHead",
    "fioHead",
    "personCodeUHeadDeputy",
    "fioHeadDeputy",
    "personCodeUSecretary",
    "fioSecretary",
    "isActive",
    "isSingle",
    "idUniversity",
    "universityFullName"
})
public class DAcademicCouncil {

    @XmlElement(name = "Id_AcademicCouncil")
    protected int idAcademicCouncil;
    @XmlElement(name = "AcademicCouncilOrderNumber")
    protected String academicCouncilOrderNumber;
    @XmlElement(name = "AcademicCouncilOrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicCouncilOrderDate;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "AcademicCouncilDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicCouncilDateBegin;
    @XmlElement(name = "AcademicCouncilDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicCouncilDateEnd;
    @XmlElement(name = "AcademicCouncilPersonDateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicCouncilPersonDateCreate;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_AcademicCouncilType")
    protected int idAcademicCouncilType;
    @XmlElement(name = "AcademicCouncilNumber")
    protected String academicCouncilNumber;
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
    @XmlElement(name = "AcademicCouncilTypeName")
    protected String academicCouncilTypeName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UserAddFIO")
    protected String userAddFIO;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Web")
    protected String web;
    @XmlElement(name = "PersonCodeU_Head")
    protected String personCodeUHead;
    @XmlElement(name = "FIO_Head")
    protected String fioHead;
    @XmlElement(name = "PersonCodeU_HeadDeputy")
    protected String personCodeUHeadDeputy;
    @XmlElement(name = "FIO_HeadDeputy")
    protected String fioHeadDeputy;
    @XmlElement(name = "PersonCodeU_Secretary")
    protected String personCodeUSecretary;
    @XmlElement(name = "FIO_Secretary")
    protected String fioSecretary;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "IsSingle")
    protected int isSingle;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;

    /**
     * Gets the value of the idAcademicCouncil property.
     * 
     */
    public int getIdAcademicCouncil() {
        return idAcademicCouncil;
    }

    /**
     * Sets the value of the idAcademicCouncil property.
     * 
     */
    public void setIdAcademicCouncil(int value) {
        this.idAcademicCouncil = value;
    }

    /**
     * Gets the value of the academicCouncilOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilOrderNumber() {
        return academicCouncilOrderNumber;
    }

    /**
     * Sets the value of the academicCouncilOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilOrderNumber(String value) {
        this.academicCouncilOrderNumber = value;
    }

    /**
     * Gets the value of the academicCouncilOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicCouncilOrderDate() {
        return academicCouncilOrderDate;
    }

    /**
     * Sets the value of the academicCouncilOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicCouncilOrderDate(XMLGregorianCalendar value) {
        this.academicCouncilOrderDate = value;
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
     * Gets the value of the academicCouncilDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicCouncilDateBegin() {
        return academicCouncilDateBegin;
    }

    /**
     * Sets the value of the academicCouncilDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicCouncilDateBegin(XMLGregorianCalendar value) {
        this.academicCouncilDateBegin = value;
    }

    /**
     * Gets the value of the academicCouncilDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicCouncilDateEnd() {
        return academicCouncilDateEnd;
    }

    /**
     * Sets the value of the academicCouncilDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicCouncilDateEnd(XMLGregorianCalendar value) {
        this.academicCouncilDateEnd = value;
    }

    /**
     * Gets the value of the academicCouncilPersonDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicCouncilPersonDateCreate() {
        return academicCouncilPersonDateCreate;
    }

    /**
     * Sets the value of the academicCouncilPersonDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicCouncilPersonDateCreate(XMLGregorianCalendar value) {
        this.academicCouncilPersonDateCreate = value;
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
     * Gets the value of the idAcademicCouncilType property.
     * 
     */
    public int getIdAcademicCouncilType() {
        return idAcademicCouncilType;
    }

    /**
     * Sets the value of the idAcademicCouncilType property.
     * 
     */
    public void setIdAcademicCouncilType(int value) {
        this.idAcademicCouncilType = value;
    }

    /**
     * Gets the value of the academicCouncilNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilNumber() {
        return academicCouncilNumber;
    }

    /**
     * Sets the value of the academicCouncilNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilNumber(String value) {
        this.academicCouncilNumber = value;
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
     * Gets the value of the academicCouncilTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilTypeName() {
        return academicCouncilTypeName;
    }

    /**
     * Sets the value of the academicCouncilTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilTypeName(String value) {
        this.academicCouncilTypeName = value;
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
     * Gets the value of the userAddFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAddFIO() {
        return userAddFIO;
    }

    /**
     * Sets the value of the userAddFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAddFIO(String value) {
        this.userAddFIO = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Gets the value of the personCodeUHead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeUHead() {
        return personCodeUHead;
    }

    /**
     * Sets the value of the personCodeUHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeUHead(String value) {
        this.personCodeUHead = value;
    }

    /**
     * Gets the value of the fioHead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOHead() {
        return fioHead;
    }

    /**
     * Sets the value of the fioHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOHead(String value) {
        this.fioHead = value;
    }

    /**
     * Gets the value of the personCodeUHeadDeputy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeUHeadDeputy() {
        return personCodeUHeadDeputy;
    }

    /**
     * Sets the value of the personCodeUHeadDeputy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeUHeadDeputy(String value) {
        this.personCodeUHeadDeputy = value;
    }

    /**
     * Gets the value of the fioHeadDeputy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOHeadDeputy() {
        return fioHeadDeputy;
    }

    /**
     * Sets the value of the fioHeadDeputy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOHeadDeputy(String value) {
        this.fioHeadDeputy = value;
    }

    /**
     * Gets the value of the personCodeUSecretary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeUSecretary() {
        return personCodeUSecretary;
    }

    /**
     * Sets the value of the personCodeUSecretary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeUSecretary(String value) {
        this.personCodeUSecretary = value;
    }

    /**
     * Gets the value of the fioSecretary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOSecretary() {
        return fioSecretary;
    }

    /**
     * Sets the value of the fioSecretary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOSecretary(String value) {
        this.fioSecretary = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isSingle property.
     * 
     */
    public int getIsSingle() {
        return isSingle;
    }

    /**
     * Sets the value of the isSingle property.
     * 
     */
    public void setIsSingle(int value) {
        this.isSingle = value;
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

}
