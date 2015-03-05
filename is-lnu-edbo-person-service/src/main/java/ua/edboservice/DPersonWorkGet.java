
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonWorkGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonWorkGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WorkDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonWorkHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkPost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkCharge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkTariffType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkHistoryDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WorkHistoryDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonWorkOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkHistoryIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Plurality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserAddEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkTariffTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkChargeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkPostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsSciense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonWorkHistoryUniversityCancelOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityCancelOrderData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonWorkCancelationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkCancelationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkCancelationOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoursCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateEndContract" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistScan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TariffValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_Country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode_Kafedra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName_Kafedra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonWorkGet", propOrder = {
    "idPersonWork",
    "workDateBegin",
    "workDateEnd",
    "idPersonWorkHistory",
    "idPersonWorkType",
    "idPersonName",
    "universityFacultetKode",
    "idPersonWorkPost",
    "idPersonWorkCharge",
    "idPersonWorkTariffType",
    "workHistoryDateBegin",
    "workHistoryDateEnd",
    "idPersonWorkOrder",
    "personWorkHistoryIsActive",
    "plurality",
    "idUserAddEdit",
    "personWorkHistoryDescription",
    "universityFacultetFullName",
    "personWorkTariffTypesName",
    "personWorkTypeName",
    "personWorkChargeName",
    "idUniversity",
    "universityFullName",
    "personWorkPostName",
    "personCodeU",
    "fio",
    "birthday",
    "isSciense",
    "isWork",
    "personWorkHistoryUniversityOrderNumber",
    "personWorkHistoryUniversityOrderDate",
    "personWorkHistoryUniversityCancelOrderNumber",
    "personWorkHistoryUniversityCancelOrderData",
    "idPersonWorkCancelationType",
    "personWorkCancelationTypeName",
    "personWorkCancelationOther",
    "firstName",
    "middleName",
    "lastName",
    "hoursCount",
    "dateEndContract",
    "idAcademicYear",
    "academicYearName",
    "existScan",
    "tariffValue",
    "idCountry",
    "idPersonSex",
    "universityFacultetKodeKafedra",
    "universityFacultetFullNameKafedra"
})
public class DPersonWorkGet {

    @XmlElement(name = "Id_PersonWork")
    protected int idPersonWork;
    @XmlElement(name = "WorkDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workDateBegin;
    @XmlElement(name = "WorkDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workDateEnd;
    @XmlElement(name = "Id_PersonWorkHistory")
    protected int idPersonWorkHistory;
    @XmlElement(name = "Id_PersonWorkType")
    protected int idPersonWorkType;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_PersonWorkPost")
    protected int idPersonWorkPost;
    @XmlElement(name = "Id_PersonWorkCharge")
    protected int idPersonWorkCharge;
    @XmlElement(name = "Id_PersonWorkTariffType")
    protected int idPersonWorkTariffType;
    @XmlElement(name = "WorkHistoryDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workHistoryDateBegin;
    @XmlElement(name = "WorkHistoryDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workHistoryDateEnd;
    @XmlElement(name = "Id_PersonWorkOrder")
    protected int idPersonWorkOrder;
    @XmlElement(name = "PersonWorkHistoryIsActive")
    protected int personWorkHistoryIsActive;
    @XmlElement(name = "Plurality")
    protected int plurality;
    @XmlElement(name = "Id_UserAddEdit")
    protected int idUserAddEdit;
    @XmlElement(name = "PersonWorkHistoryDescription")
    protected String personWorkHistoryDescription;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "PersonWorkTariffTypesName")
    protected String personWorkTariffTypesName;
    @XmlElement(name = "PersonWorkTypeName")
    protected String personWorkTypeName;
    @XmlElement(name = "PersonWorkChargeName")
    protected String personWorkChargeName;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "PersonWorkPostName")
    protected String personWorkPostName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "IsSciense")
    protected int isSciense;
    @XmlElement(name = "IsWork")
    protected int isWork;
    @XmlElement(name = "PersonWorkHistoryUniversityOrderNumber")
    protected String personWorkHistoryUniversityOrderNumber;
    @XmlElement(name = "PersonWorkHistoryUniversityOrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personWorkHistoryUniversityOrderDate;
    @XmlElement(name = "PersonWorkHistoryUniversityCancelOrderNumber")
    protected String personWorkHistoryUniversityCancelOrderNumber;
    @XmlElement(name = "PersonWorkHistoryUniversityCancelOrderData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personWorkHistoryUniversityCancelOrderData;
    @XmlElement(name = "Id_PersonWorkCancelationType")
    protected int idPersonWorkCancelationType;
    @XmlElement(name = "PersonWorkCancelationTypeName")
    protected String personWorkCancelationTypeName;
    @XmlElement(name = "PersonWorkCancelationOther")
    protected String personWorkCancelationOther;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "HoursCount")
    protected int hoursCount;
    @XmlElement(name = "DateEndContract", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEndContract;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "ExistScan")
    protected int existScan;
    @XmlElement(name = "TariffValue", required = true)
    protected BigDecimal tariffValue;
    @XmlElement(name = "Id_Country")
    protected int idCountry;
    @XmlElement(name = "Id_PersonSex")
    protected int idPersonSex;
    @XmlElement(name = "UniversityFacultetKode_Kafedra")
    protected String universityFacultetKodeKafedra;
    @XmlElement(name = "UniversityFacultetFullName_Kafedra")
    protected String universityFacultetFullNameKafedra;

    /**
     * Gets the value of the idPersonWork property.
     * 
     */
    public int getIdPersonWork() {
        return idPersonWork;
    }

    /**
     * Sets the value of the idPersonWork property.
     * 
     */
    public void setIdPersonWork(int value) {
        this.idPersonWork = value;
    }

    /**
     * Gets the value of the workDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkDateBegin() {
        return workDateBegin;
    }

    /**
     * Sets the value of the workDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkDateBegin(XMLGregorianCalendar value) {
        this.workDateBegin = value;
    }

    /**
     * Gets the value of the workDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkDateEnd() {
        return workDateEnd;
    }

    /**
     * Sets the value of the workDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkDateEnd(XMLGregorianCalendar value) {
        this.workDateEnd = value;
    }

    /**
     * Gets the value of the idPersonWorkHistory property.
     * 
     */
    public int getIdPersonWorkHistory() {
        return idPersonWorkHistory;
    }

    /**
     * Sets the value of the idPersonWorkHistory property.
     * 
     */
    public void setIdPersonWorkHistory(int value) {
        this.idPersonWorkHistory = value;
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
     * Gets the value of the idPersonWorkPost property.
     * 
     */
    public int getIdPersonWorkPost() {
        return idPersonWorkPost;
    }

    /**
     * Sets the value of the idPersonWorkPost property.
     * 
     */
    public void setIdPersonWorkPost(int value) {
        this.idPersonWorkPost = value;
    }

    /**
     * Gets the value of the idPersonWorkCharge property.
     * 
     */
    public int getIdPersonWorkCharge() {
        return idPersonWorkCharge;
    }

    /**
     * Sets the value of the idPersonWorkCharge property.
     * 
     */
    public void setIdPersonWorkCharge(int value) {
        this.idPersonWorkCharge = value;
    }

    /**
     * Gets the value of the idPersonWorkTariffType property.
     * 
     */
    public int getIdPersonWorkTariffType() {
        return idPersonWorkTariffType;
    }

    /**
     * Sets the value of the idPersonWorkTariffType property.
     * 
     */
    public void setIdPersonWorkTariffType(int value) {
        this.idPersonWorkTariffType = value;
    }

    /**
     * Gets the value of the workHistoryDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkHistoryDateBegin() {
        return workHistoryDateBegin;
    }

    /**
     * Sets the value of the workHistoryDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkHistoryDateBegin(XMLGregorianCalendar value) {
        this.workHistoryDateBegin = value;
    }

    /**
     * Gets the value of the workHistoryDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkHistoryDateEnd() {
        return workHistoryDateEnd;
    }

    /**
     * Sets the value of the workHistoryDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkHistoryDateEnd(XMLGregorianCalendar value) {
        this.workHistoryDateEnd = value;
    }

    /**
     * Gets the value of the idPersonWorkOrder property.
     * 
     */
    public int getIdPersonWorkOrder() {
        return idPersonWorkOrder;
    }

    /**
     * Sets the value of the idPersonWorkOrder property.
     * 
     */
    public void setIdPersonWorkOrder(int value) {
        this.idPersonWorkOrder = value;
    }

    /**
     * Gets the value of the personWorkHistoryIsActive property.
     * 
     */
    public int getPersonWorkHistoryIsActive() {
        return personWorkHistoryIsActive;
    }

    /**
     * Sets the value of the personWorkHistoryIsActive property.
     * 
     */
    public void setPersonWorkHistoryIsActive(int value) {
        this.personWorkHistoryIsActive = value;
    }

    /**
     * Gets the value of the plurality property.
     * 
     */
    public int getPlurality() {
        return plurality;
    }

    /**
     * Sets the value of the plurality property.
     * 
     */
    public void setPlurality(int value) {
        this.plurality = value;
    }

    /**
     * Gets the value of the idUserAddEdit property.
     * 
     */
    public int getIdUserAddEdit() {
        return idUserAddEdit;
    }

    /**
     * Sets the value of the idUserAddEdit property.
     * 
     */
    public void setIdUserAddEdit(int value) {
        this.idUserAddEdit = value;
    }

    /**
     * Gets the value of the personWorkHistoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkHistoryDescription() {
        return personWorkHistoryDescription;
    }

    /**
     * Sets the value of the personWorkHistoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkHistoryDescription(String value) {
        this.personWorkHistoryDescription = value;
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
     * Gets the value of the personWorkTariffTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkTariffTypesName() {
        return personWorkTariffTypesName;
    }

    /**
     * Sets the value of the personWorkTariffTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkTariffTypesName(String value) {
        this.personWorkTariffTypesName = value;
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
     * Gets the value of the personWorkChargeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkChargeName() {
        return personWorkChargeName;
    }

    /**
     * Sets the value of the personWorkChargeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkChargeName(String value) {
        this.personWorkChargeName = value;
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
     * Gets the value of the personWorkPostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkPostName() {
        return personWorkPostName;
    }

    /**
     * Sets the value of the personWorkPostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkPostName(String value) {
        this.personWorkPostName = value;
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
     * Gets the value of the isSciense property.
     * 
     */
    public int getIsSciense() {
        return isSciense;
    }

    /**
     * Sets the value of the isSciense property.
     * 
     */
    public void setIsSciense(int value) {
        this.isSciense = value;
    }

    /**
     * Gets the value of the isWork property.
     * 
     */
    public int getIsWork() {
        return isWork;
    }

    /**
     * Sets the value of the isWork property.
     * 
     */
    public void setIsWork(int value) {
        this.isWork = value;
    }

    /**
     * Gets the value of the personWorkHistoryUniversityOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkHistoryUniversityOrderNumber() {
        return personWorkHistoryUniversityOrderNumber;
    }

    /**
     * Sets the value of the personWorkHistoryUniversityOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkHistoryUniversityOrderNumber(String value) {
        this.personWorkHistoryUniversityOrderNumber = value;
    }

    /**
     * Gets the value of the personWorkHistoryUniversityOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonWorkHistoryUniversityOrderDate() {
        return personWorkHistoryUniversityOrderDate;
    }

    /**
     * Sets the value of the personWorkHistoryUniversityOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonWorkHistoryUniversityOrderDate(XMLGregorianCalendar value) {
        this.personWorkHistoryUniversityOrderDate = value;
    }

    /**
     * Gets the value of the personWorkHistoryUniversityCancelOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkHistoryUniversityCancelOrderNumber() {
        return personWorkHistoryUniversityCancelOrderNumber;
    }

    /**
     * Sets the value of the personWorkHistoryUniversityCancelOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkHistoryUniversityCancelOrderNumber(String value) {
        this.personWorkHistoryUniversityCancelOrderNumber = value;
    }

    /**
     * Gets the value of the personWorkHistoryUniversityCancelOrderData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonWorkHistoryUniversityCancelOrderData() {
        return personWorkHistoryUniversityCancelOrderData;
    }

    /**
     * Sets the value of the personWorkHistoryUniversityCancelOrderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonWorkHistoryUniversityCancelOrderData(XMLGregorianCalendar value) {
        this.personWorkHistoryUniversityCancelOrderData = value;
    }

    /**
     * Gets the value of the idPersonWorkCancelationType property.
     * 
     */
    public int getIdPersonWorkCancelationType() {
        return idPersonWorkCancelationType;
    }

    /**
     * Sets the value of the idPersonWorkCancelationType property.
     * 
     */
    public void setIdPersonWorkCancelationType(int value) {
        this.idPersonWorkCancelationType = value;
    }

    /**
     * Gets the value of the personWorkCancelationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkCancelationTypeName() {
        return personWorkCancelationTypeName;
    }

    /**
     * Sets the value of the personWorkCancelationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkCancelationTypeName(String value) {
        this.personWorkCancelationTypeName = value;
    }

    /**
     * Gets the value of the personWorkCancelationOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkCancelationOther() {
        return personWorkCancelationOther;
    }

    /**
     * Sets the value of the personWorkCancelationOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkCancelationOther(String value) {
        this.personWorkCancelationOther = value;
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
     * Gets the value of the hoursCount property.
     * 
     */
    public int getHoursCount() {
        return hoursCount;
    }

    /**
     * Sets the value of the hoursCount property.
     * 
     */
    public void setHoursCount(int value) {
        this.hoursCount = value;
    }

    /**
     * Gets the value of the dateEndContract property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEndContract() {
        return dateEndContract;
    }

    /**
     * Sets the value of the dateEndContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEndContract(XMLGregorianCalendar value) {
        this.dateEndContract = value;
    }

    /**
     * Gets the value of the idAcademicYear property.
     * 
     */
    public int getIdAcademicYear() {
        return idAcademicYear;
    }

    /**
     * Sets the value of the idAcademicYear property.
     * 
     */
    public void setIdAcademicYear(int value) {
        this.idAcademicYear = value;
    }

    /**
     * Gets the value of the academicYearName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearName() {
        return academicYearName;
    }

    /**
     * Sets the value of the academicYearName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearName(String value) {
        this.academicYearName = value;
    }

    /**
     * Gets the value of the existScan property.
     * 
     */
    public int getExistScan() {
        return existScan;
    }

    /**
     * Sets the value of the existScan property.
     * 
     */
    public void setExistScan(int value) {
        this.existScan = value;
    }

    /**
     * Gets the value of the tariffValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTariffValue() {
        return tariffValue;
    }

    /**
     * Sets the value of the tariffValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTariffValue(BigDecimal value) {
        this.tariffValue = value;
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
     * Gets the value of the universityFacultetKodeKafedra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKodeKafedra() {
        return universityFacultetKodeKafedra;
    }

    /**
     * Sets the value of the universityFacultetKodeKafedra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKodeKafedra(String value) {
        this.universityFacultetKodeKafedra = value;
    }

    /**
     * Gets the value of the universityFacultetFullNameKafedra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullNameKafedra() {
        return universityFacultetFullNameKafedra;
    }

    /**
     * Sets the value of the universityFacultetFullNameKafedra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullNameKafedra(String value) {
        this.universityFacultetFullNameKafedra = value;
    }

}
