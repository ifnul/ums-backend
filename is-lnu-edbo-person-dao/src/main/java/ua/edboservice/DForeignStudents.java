
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dForeignStudents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dForeignStudents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ForeignStudent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ForeignStudentInviteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignStudentInviteDateGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ForeignStudentInviteDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rejected" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonEducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecComplexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationPaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationPaymentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_ForeignStudentsOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ForeignStudentsStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ForeignStudentsStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignStudentsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKodeNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullNameNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dForeignStudents", propOrder = {
    "idForeignStudent",
    "foreignStudentInviteNumber",
    "foreignStudentInviteDateGive",
    "foreignStudentInviteDateEnd",
    "dateLastChange",
    "personCodeU",
    "universityKode",
    "dateCreate",
    "idPersonEducation",
    "idPersonEducationHistory",
    "rejected",
    "idUserAdd",
    "idUserEdit",
    "idPersonName",
    "birthday",
    "idPerson",
    "fio",
    "idCountry",
    "countryName",
    "personEducationDateBegin",
    "personEducationDateEnd",
    "personEducationFormName",
    "idQualification",
    "qualificationName",
    "universityFacultetFullName",
    "universityGroupFullName",
    "universityGroupShortName",
    "specComplexName",
    "idPersonEducationPaymentType",
    "personEducationPaymentTypeName",
    "idForeignStudentsOrder",
    "idForeignStudentsStatusType",
    "foreignStudentsStatusTypeName",
    "foreignStudentsDescription",
    "universityKodeNew",
    "universityFullNameNew"
})
public class DForeignStudents {

    @XmlElement(name = "Id_ForeignStudent")
    protected int idForeignStudent;
    @XmlElement(name = "ForeignStudentInviteNumber")
    protected String foreignStudentInviteNumber;
    @XmlElement(name = "ForeignStudentInviteDateGive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar foreignStudentInviteDateGive;
    @XmlElement(name = "ForeignStudentInviteDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar foreignStudentInviteDateEnd;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "Id_PersonEducationHistory")
    protected int idPersonEducationHistory;
    @XmlElement(name = "Rejected")
    protected int rejected;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "Id_UserEdit")
    protected int idUserEdit;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Id_Country")
    protected int idCountry;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "PersonEducationDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationDateBegin;
    @XmlElement(name = "PersonEducationDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationDateEnd;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityGroupFullName")
    protected String universityGroupFullName;
    @XmlElement(name = "UniversityGroupShortName")
    protected String universityGroupShortName;
    @XmlElement(name = "SpecComplexName")
    protected String specComplexName;
    @XmlElement(name = "Id_PersonEducationPaymentType")
    protected int idPersonEducationPaymentType;
    @XmlElement(name = "PersonEducationPaymentTypeName")
    protected String personEducationPaymentTypeName;
    @XmlElement(name = "Id_ForeignStudentsOrder")
    protected int idForeignStudentsOrder;
    @XmlElement(name = "Id_ForeignStudentsStatusType")
    protected int idForeignStudentsStatusType;
    @XmlElement(name = "ForeignStudentsStatusTypeName")
    protected String foreignStudentsStatusTypeName;
    @XmlElement(name = "ForeignStudentsDescription")
    protected String foreignStudentsDescription;
    @XmlElement(name = "UniversityKodeNew")
    protected String universityKodeNew;
    @XmlElement(name = "UniversityFullNameNew")
    protected String universityFullNameNew;

    /**
     * Gets the value of the idForeignStudent property.
     * 
     */
    public int getIdForeignStudent() {
        return idForeignStudent;
    }

    /**
     * Sets the value of the idForeignStudent property.
     * 
     */
    public void setIdForeignStudent(int value) {
        this.idForeignStudent = value;
    }

    /**
     * Gets the value of the foreignStudentInviteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStudentInviteNumber() {
        return foreignStudentInviteNumber;
    }

    /**
     * Sets the value of the foreignStudentInviteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStudentInviteNumber(String value) {
        this.foreignStudentInviteNumber = value;
    }

    /**
     * Gets the value of the foreignStudentInviteDateGive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForeignStudentInviteDateGive() {
        return foreignStudentInviteDateGive;
    }

    /**
     * Sets the value of the foreignStudentInviteDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForeignStudentInviteDateGive(XMLGregorianCalendar value) {
        this.foreignStudentInviteDateGive = value;
    }

    /**
     * Gets the value of the foreignStudentInviteDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForeignStudentInviteDateEnd() {
        return foreignStudentInviteDateEnd;
    }

    /**
     * Sets the value of the foreignStudentInviteDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForeignStudentInviteDateEnd(XMLGregorianCalendar value) {
        this.foreignStudentInviteDateEnd = value;
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
     * Gets the value of the idPersonEducationHistory property.
     * 
     */
    public int getIdPersonEducationHistory() {
        return idPersonEducationHistory;
    }

    /**
     * Sets the value of the idPersonEducationHistory property.
     * 
     */
    public void setIdPersonEducationHistory(int value) {
        this.idPersonEducationHistory = value;
    }

    /**
     * Gets the value of the rejected property.
     * 
     */
    public int getRejected() {
        return rejected;
    }

    /**
     * Sets the value of the rejected property.
     * 
     */
    public void setRejected(int value) {
        this.rejected = value;
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
     * Gets the value of the idUserEdit property.
     * 
     */
    public int getIdUserEdit() {
        return idUserEdit;
    }

    /**
     * Sets the value of the idUserEdit property.
     * 
     */
    public void setIdUserEdit(int value) {
        this.idUserEdit = value;
    }

    /**
     * Gets the value of the idPersonName property.
     * 
     */
    public int getIdPersonName() {
        return idPersonName;
    }

    /**
     * Sets the value of the idPersonName property.
     * 
     */
    public void setIdPersonName(int value) {
        this.idPersonName = value;
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
     * Gets the value of the idCountry property.
     * 
     */
    public int getIdCountry() {
        return idCountry;
    }

    /**
     * Sets the value of the idCountry property.
     * 
     */
    public void setIdCountry(int value) {
        this.idCountry = value;
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
     * Gets the value of the universityGroupFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupFullName() {
        return universityGroupFullName;
    }

    /**
     * Sets the value of the universityGroupFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupFullName(String value) {
        this.universityGroupFullName = value;
    }

    /**
     * Gets the value of the universityGroupShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupShortName() {
        return universityGroupShortName;
    }

    /**
     * Sets the value of the universityGroupShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupShortName(String value) {
        this.universityGroupShortName = value;
    }

    /**
     * Gets the value of the specComplexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecComplexName() {
        return specComplexName;
    }

    /**
     * Sets the value of the specComplexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecComplexName(String value) {
        this.specComplexName = value;
    }

    /**
     * Gets the value of the idPersonEducationPaymentType property.
     * 
     */
    public int getIdPersonEducationPaymentType() {
        return idPersonEducationPaymentType;
    }

    /**
     * Sets the value of the idPersonEducationPaymentType property.
     * 
     */
    public void setIdPersonEducationPaymentType(int value) {
        this.idPersonEducationPaymentType = value;
    }

    /**
     * Gets the value of the personEducationPaymentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationPaymentTypeName() {
        return personEducationPaymentTypeName;
    }

    /**
     * Sets the value of the personEducationPaymentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationPaymentTypeName(String value) {
        this.personEducationPaymentTypeName = value;
    }

    /**
     * Gets the value of the idForeignStudentsOrder property.
     * 
     */
    public int getIdForeignStudentsOrder() {
        return idForeignStudentsOrder;
    }

    /**
     * Sets the value of the idForeignStudentsOrder property.
     * 
     */
    public void setIdForeignStudentsOrder(int value) {
        this.idForeignStudentsOrder = value;
    }

    /**
     * Gets the value of the idForeignStudentsStatusType property.
     * 
     */
    public int getIdForeignStudentsStatusType() {
        return idForeignStudentsStatusType;
    }

    /**
     * Sets the value of the idForeignStudentsStatusType property.
     * 
     */
    public void setIdForeignStudentsStatusType(int value) {
        this.idForeignStudentsStatusType = value;
    }

    /**
     * Gets the value of the foreignStudentsStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStudentsStatusTypeName() {
        return foreignStudentsStatusTypeName;
    }

    /**
     * Sets the value of the foreignStudentsStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStudentsStatusTypeName(String value) {
        this.foreignStudentsStatusTypeName = value;
    }

    /**
     * Gets the value of the foreignStudentsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStudentsDescription() {
        return foreignStudentsDescription;
    }

    /**
     * Sets the value of the foreignStudentsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStudentsDescription(String value) {
        this.foreignStudentsDescription = value;
    }

    /**
     * Gets the value of the universityKodeNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeNew() {
        return universityKodeNew;
    }

    /**
     * Sets the value of the universityKodeNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeNew(String value) {
        this.universityKodeNew = value;
    }

    /**
     * Gets the value of the universityFullNameNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameNew() {
        return universityFullNameNew;
    }

    /**
     * Sets the value of the universityFullNameNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameNew(String value) {
        this.universityFullNameNew = value;
    }

}
