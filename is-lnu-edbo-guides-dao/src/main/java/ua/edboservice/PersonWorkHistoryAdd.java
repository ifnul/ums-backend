
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkPost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkCharge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkTariffType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkHistoryDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Plurality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSciense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkCancelationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkCancelationOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoursCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateEndContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryScans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode_Kafedra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "universityKode",
    "idPersonWork",
    "idPersonWorkType",
    "universityFacultetKode",
    "idPersonWorkPost",
    "idPersonWorkCharge",
    "idPersonWorkTariffType",
    "workHistoryDateBegin",
    "idPersonWorkOrder",
    "plurality",
    "personWorkHistoryDescription",
    "personWorkHistoryUniversityOrderNumber",
    "personWorkHistoryUniversityOrderDate",
    "isSciense",
    "isWork",
    "idPersonWorkCancelationType",
    "personWorkCancelationOther",
    "idAcademicYear",
    "hoursCount",
    "dateEndContract",
    "personWorkHistoryScans",
    "tariffValue",
    "universityFacultetKodeKafedra"
})
@XmlRootElement(name = "PersonWorkHistoryAdd")
public class PersonWorkHistoryAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_PersonWork")
    protected int idPersonWork;
    @XmlElement(name = "Id_PersonWorkType")
    protected int idPersonWorkType;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_PersonWorkPost")
    protected int idPersonWorkPost;
    @XmlElement(name = "Id_PersonWorkCharge")
    protected int idPersonWorkCharge;
    @XmlElement(name = "Id_PersonWorkTariffType")
    protected int idPersonWorkTariffType;
    @XmlElement(name = "WorkHistoryDateBegin")
    protected String workHistoryDateBegin;
    @XmlElement(name = "Id_PersonWorkOrder")
    protected int idPersonWorkOrder;
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
    @XmlElement(name = "PersonWorkHistoryScans")
    protected String personWorkHistoryScans;
    @XmlElement(name = "TariffValue")
    protected String tariffValue;
    @XmlElement(name = "UniversityFacultetKode_Kafedra")
    protected String universityFacultetKodeKafedra;

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
     *     {@link String }
     *     
     */
    public String getWorkHistoryDateBegin() {
        return workHistoryDateBegin;
    }

    /**
     * Sets the value of the workHistoryDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkHistoryDateBegin(String value) {
        this.workHistoryDateBegin = value;
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
     * Gets the value of the personWorkHistoryScans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkHistoryScans() {
        return personWorkHistoryScans;
    }

    /**
     * Sets the value of the personWorkHistoryScans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkHistoryScans(String value) {
        this.personWorkHistoryScans = value;
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

}
