
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonWorkOrdersData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonWorkOrdersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonWorkHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WorkDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkPost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkPostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkCharge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkChargeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkTariffType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkTariffTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkHistoryDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WorkHistoryDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonWorkOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkHistoryIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Plurality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserAddEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserAddEditFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsSciense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkCancelationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkCancelationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkCancelationOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UniversityFacultetKode_Kafedra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName_Kafedra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoursCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonWorkOrdersData", propOrder = {
    "idPersonWorkHistory",
    "idPersonWork",
    "universityKode",
    "workDateBegin",
    "workDateEnd",
    "personCodeU",
    "birthday",
    "idPersonName",
    "fio",
    "idPersonWorkType",
    "universityFacultetKode",
    "universityFacultetFullName",
    "universityFacultetShortName",
    "idPersonWorkPost",
    "personWorkPostName",
    "idPersonWorkCharge",
    "personWorkChargeName",
    "idPersonWorkTariffType",
    "personWorkTariffTypesName",
    "workHistoryDateBegin",
    "workHistoryDateEnd",
    "idPersonWorkOrder",
    "personWorkHistoryIsActive",
    "plurality",
    "idUserAddEdit",
    "userAddEditFIO",
    "personWorkHistoryDescription",
    "personWorkHistoryUniversityOrderNumber",
    "personWorkHistoryUniversityOrderDate",
    "isSciense",
    "isWork",
    "idPersonWorkCancelationType",
    "personWorkCancelationTypeName",
    "personWorkCancelationOther",
    "tariffValue",
    "universityFacultetKodeKafedra",
    "universityFacultetFullNameKafedra",
    "hoursCount"
})
public class DPersonWorkOrdersData {

    @XmlElement(name = "Id_PersonWorkHistory")
    protected int idPersonWorkHistory;
    @XmlElement(name = "Id_PersonWork")
    protected int idPersonWork;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "WorkDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workDateBegin;
    @XmlElement(name = "WorkDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workDateEnd;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Id_PersonWorkType")
    protected int idPersonWorkType;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityFacultetShortName")
    protected String universityFacultetShortName;
    @XmlElement(name = "Id_PersonWorkPost")
    protected int idPersonWorkPost;
    @XmlElement(name = "PersonWorkPostName")
    protected String personWorkPostName;
    @XmlElement(name = "Id_PersonWorkCharge")
    protected int idPersonWorkCharge;
    @XmlElement(name = "PersonWorkChargeName")
    protected String personWorkChargeName;
    @XmlElement(name = "Id_PersonWorkTariffType")
    protected int idPersonWorkTariffType;
    @XmlElement(name = "PersonWorkTariffTypesName")
    protected String personWorkTariffTypesName;
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
    @XmlElement(name = "UserAddEditFIO")
    protected String userAddEditFIO;
    @XmlElement(name = "PersonWorkHistoryDescription")
    protected String personWorkHistoryDescription;
    @XmlElement(name = "PersonWorkHistoryUniversityOrderNumber")
    protected String personWorkHistoryUniversityOrderNumber;
    @XmlElement(name = "PersonWorkHistoryUniversityOrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personWorkHistoryUniversityOrderDate;
    @XmlElement(name = "IsSciense")
    protected int isSciense;
    @XmlElement(name = "IsWork")
    protected int isWork;
    @XmlElement(name = "Id_PersonWorkCancelationType")
    protected int idPersonWorkCancelationType;
    @XmlElement(name = "PersonWorkCancelationTypeName")
    protected String personWorkCancelationTypeName;
    @XmlElement(name = "PersonWorkCancelationOther")
    protected String personWorkCancelationOther;
    @XmlElement(name = "TariffValue", required = true)
    protected BigDecimal tariffValue;
    @XmlElement(name = "UniversityFacultetKode_Kafedra")
    protected String universityFacultetKodeKafedra;
    @XmlElement(name = "UniversityFacultetFullName_Kafedra")
    protected String universityFacultetFullNameKafedra;
    @XmlElement(name = "HoursCount")
    protected int hoursCount;

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
     * Gets the value of the universityFacultetShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetShortName() {
        return universityFacultetShortName;
    }

    /**
     * Sets the value of the universityFacultetShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetShortName(String value) {
        this.universityFacultetShortName = value;
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
     * Gets the value of the userAddEditFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAddEditFIO() {
        return userAddEditFIO;
    }

    /**
     * Sets the value of the userAddEditFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAddEditFIO(String value) {
        this.userAddEditFIO = value;
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

}
