
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldPersonWorkPostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkCharge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkTariffType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Plurality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSciense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkHistoryUniversityCancelOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityCancelOrderData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkCancelationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkCancelationOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoursCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateEndContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "personCodeU",
    "oldOrganisationName",
    "oldPersonWorkPostName",
    "idPersonWorkCharge",
    "idPersonWorkTariffType",
    "workDateBegin",
    "workDateEnd",
    "plurality",
    "personWorkHistoryDescription",
    "personWorkHistoryUniversityOrderNumber",
    "personWorkHistoryUniversityOrderDate",
    "isSciense",
    "isWork",
    "personWorkHistoryUniversityCancelOrderNumber",
    "personWorkHistoryUniversityCancelOrderData",
    "idPersonWorkCancelationType",
    "personWorkCancelationOther",
    "idAcademicYear",
    "hoursCount",
    "dateEndContract",
    "tariffValue"
})
@XmlRootElement(name = "PersonWorkAdd")
public class PersonWorkAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    protected String oldOrganisationName;
    protected String oldPersonWorkPostName;
    @XmlElement(name = "Id_PersonWorkCharge")
    protected int idPersonWorkCharge;
    @XmlElement(name = "Id_PersonWorkTariffType")
    protected int idPersonWorkTariffType;
    @XmlElement(name = "WorkDateBegin")
    protected String workDateBegin;
    @XmlElement(name = "WorkDateEnd")
    protected String workDateEnd;
    @XmlElement(name = "Plurality")
    protected int plurality;
    @XmlElement(name = "PersonWorkHistoryDescription")
    protected String personWorkHistoryDescription;
    @XmlElement(name = "PersonWorkHistoryUniversityOrderNumber")
    protected String personWorkHistoryUniversityOrderNumber;
    @XmlElement(name = "PersonWorkHistoryUniversityOrderDate")
    protected String personWorkHistoryUniversityOrderDate;
    @XmlElement(name = "IsSciense")
    protected int isSciense;
    @XmlElement(name = "IsWork")
    protected int isWork;
    @XmlElement(name = "PersonWorkHistoryUniversityCancelOrderNumber")
    protected String personWorkHistoryUniversityCancelOrderNumber;
    @XmlElement(name = "PersonWorkHistoryUniversityCancelOrderData")
    protected String personWorkHistoryUniversityCancelOrderData;
    @XmlElement(name = "Id_PersonWorkCancelationType")
    protected int idPersonWorkCancelationType;
    @XmlElement(name = "PersonWorkCancelationOther")
    protected String personWorkCancelationOther;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "HoursCount")
    protected int hoursCount;
    @XmlElement(name = "DateEndContract")
    protected String dateEndContract;
    @XmlElement(name = "TariffValue")
    protected String tariffValue;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
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
     * Gets the value of the oldOrganisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldOrganisationName() {
        return oldOrganisationName;
    }

    /**
     * Sets the value of the oldOrganisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldOrganisationName(String value) {
        this.oldOrganisationName = value;
    }

    /**
     * Gets the value of the oldPersonWorkPostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPersonWorkPostName() {
        return oldPersonWorkPostName;
    }

    /**
     * Sets the value of the oldPersonWorkPostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPersonWorkPostName(String value) {
        this.oldPersonWorkPostName = value;
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
     * Gets the value of the workDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDateBegin() {
        return workDateBegin;
    }

    /**
     * Sets the value of the workDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDateBegin(String value) {
        this.workDateBegin = value;
    }

    /**
     * Gets the value of the workDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDateEnd() {
        return workDateEnd;
    }

    /**
     * Sets the value of the workDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDateEnd(String value) {
        this.workDateEnd = value;
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
     *     {@link String }
     *     
     */
    public String getPersonWorkHistoryUniversityOrderDate() {
        return personWorkHistoryUniversityOrderDate;
    }

    /**
     * Sets the value of the personWorkHistoryUniversityOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkHistoryUniversityOrderDate(String value) {
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
     *     {@link String }
     *     
     */
    public String getPersonWorkHistoryUniversityCancelOrderData() {
        return personWorkHistoryUniversityCancelOrderData;
    }

    /**
     * Sets the value of the personWorkHistoryUniversityCancelOrderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkHistoryUniversityCancelOrderData(String value) {
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
     *     {@link String }
     *     
     */
    public String getDateEndContract() {
        return dateEndContract;
    }

    /**
     * Sets the value of the dateEndContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEndContract(String value) {
        this.dateEndContract = value;
    }

    /**
     * Gets the value of the tariffValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffValue() {
        return tariffValue;
    }

    /**
     * Sets the value of the tariffValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffValue(String value) {
        this.tariffValue = value;
    }

}
