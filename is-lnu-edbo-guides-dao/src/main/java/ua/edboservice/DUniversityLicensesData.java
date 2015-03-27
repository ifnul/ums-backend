
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityLicensesData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicenseData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseDataDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DayFormValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ZaochFormValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExternFormValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="VeshirFormValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DistancFormValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UniversityLicenseDataDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityLicenseDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityLicenseIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicensesActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeSpec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicenseForNoResident" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKodeChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityChild" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityLicensesSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesSubTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OKR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GlobalRishen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberRishen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateRishen" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicensesData", propOrder = {
    "idUniversityLicenseData",
    "idUniversityLicense",
    "universityFacultetKode",
    "specDirectionsCode",
    "specClasifierCode",
    "specDirectionName",
    "specSpecialityCode",
    "specSpecialityClasifierCode",
    "specSpecialityName",
    "specIndastryCode",
    "specIndastryClasifierCode",
    "specIndastryName",
    "universityLicenseDataDateEnd",
    "dayFormValue",
    "zaochFormValue",
    "externFormValue",
    "veshirFormValue",
    "distancFormValue",
    "universityLicenseDataDateLastChange",
    "universityFacultetFullName",
    "universityFacultetTypeName",
    "universityKode",
    "universityFullName",
    "universityLicenseSeries",
    "universityLicenseNumber",
    "universityLicenseDecision",
    "universityLicenseDateGet",
    "universityLicenseDateLastChange",
    "universityLicenseIsActive",
    "code",
    "name",
    "universityLicensesActivities",
    "typeSpec",
    "universityLicenseForNoResident",
    "universityKodeChild",
    "idUniversityChild",
    "universityFullNameChild",
    "specScecializationCode",
    "specScecializationName",
    "idUniversityLicensesSubTypes",
    "universityLicensesSubTypesName",
    "okr",
    "isPed",
    "idGlobalRishen",
    "numberRishen",
    "dateRishen"
})
public class DUniversityLicensesData {

    @XmlElement(name = "Id_UniversityLicenseData")
    protected int idUniversityLicenseData;
    @XmlElement(name = "Id_UniversityLicense")
    protected int idUniversityLicense;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecIndastryCode")
    protected String specIndastryCode;
    @XmlElement(name = "SpecIndastryClasifierCode")
    protected String specIndastryClasifierCode;
    @XmlElement(name = "SpecIndastryName")
    protected String specIndastryName;
    @XmlElement(name = "UniversityLicenseDataDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicenseDataDateEnd;
    @XmlElement(name = "DayFormValue", required = true)
    protected BigDecimal dayFormValue;
    @XmlElement(name = "ZaochFormValue", required = true)
    protected BigDecimal zaochFormValue;
    @XmlElement(name = "ExternFormValue", required = true)
    protected BigDecimal externFormValue;
    @XmlElement(name = "VeshirFormValue", required = true)
    protected BigDecimal veshirFormValue;
    @XmlElement(name = "DistancFormValue", required = true)
    protected BigDecimal distancFormValue;
    @XmlElement(name = "UniversityLicenseDataDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicenseDataDateLastChange;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityFacultetTypeName")
    protected String universityFacultetTypeName;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityLicenseSeries")
    protected String universityLicenseSeries;
    @XmlElement(name = "UniversityLicenseNumber")
    protected String universityLicenseNumber;
    @XmlElement(name = "UniversityLicenseDecision")
    protected String universityLicenseDecision;
    @XmlElement(name = "UniversityLicenseDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicenseDateGet;
    @XmlElement(name = "UniversityLicenseDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicenseDateLastChange;
    @XmlElement(name = "UniversityLicenseIsActive")
    protected int universityLicenseIsActive;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "UniversityLicensesActivities")
    protected String universityLicensesActivities;
    @XmlElement(name = "TypeSpec")
    protected int typeSpec;
    @XmlElement(name = "UniversityLicenseForNoResident")
    protected int universityLicenseForNoResident;
    @XmlElement(name = "UniversityKodeChild")
    protected String universityKodeChild;
    @XmlElement(name = "Id_UniversityChild")
    protected int idUniversityChild;
    @XmlElement(name = "UniversityFullNameChild")
    protected String universityFullNameChild;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;
    @XmlElement(name = "Id_UniversityLicensesSubTypes")
    protected int idUniversityLicensesSubTypes;
    @XmlElement(name = "UniversityLicensesSubTypesName")
    protected String universityLicensesSubTypesName;
    @XmlElement(name = "OKR")
    protected String okr;
    @XmlElement(name = "IsPed")
    protected int isPed;
    @XmlElement(name = "Id_GlobalRishen")
    protected int idGlobalRishen;
    @XmlElement(name = "NumberRishen")
    protected String numberRishen;
    @XmlElement(name = "DateRishen", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRishen;

    /**
     * Gets the value of the idUniversityLicenseData property.
     * 
     */
    public int getIdUniversityLicenseData() {
        return idUniversityLicenseData;
    }

    /**
     * Sets the value of the idUniversityLicenseData property.
     * 
     */
    public void setIdUniversityLicenseData(int value) {
        this.idUniversityLicenseData = value;
    }

    /**
     * Gets the value of the idUniversityLicense property.
     * 
     */
    public int getIdUniversityLicense() {
        return idUniversityLicense;
    }

    /**
     * Sets the value of the idUniversityLicense property.
     * 
     */
    public void setIdUniversityLicense(int value) {
        this.idUniversityLicense = value;
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
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

    /**
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the specIndastryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryCode() {
        return specIndastryCode;
    }

    /**
     * Sets the value of the specIndastryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryCode(String value) {
        this.specIndastryCode = value;
    }

    /**
     * Gets the value of the specIndastryClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryClasifierCode() {
        return specIndastryClasifierCode;
    }

    /**
     * Sets the value of the specIndastryClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryClasifierCode(String value) {
        this.specIndastryClasifierCode = value;
    }

    /**
     * Gets the value of the specIndastryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryName() {
        return specIndastryName;
    }

    /**
     * Sets the value of the specIndastryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryName(String value) {
        this.specIndastryName = value;
    }

    /**
     * Gets the value of the universityLicenseDataDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicenseDataDateEnd() {
        return universityLicenseDataDateEnd;
    }

    /**
     * Sets the value of the universityLicenseDataDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicenseDataDateEnd(XMLGregorianCalendar value) {
        this.universityLicenseDataDateEnd = value;
    }

    /**
     * Gets the value of the dayFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayFormValue() {
        return dayFormValue;
    }

    /**
     * Sets the value of the dayFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayFormValue(BigDecimal value) {
        this.dayFormValue = value;
    }

    /**
     * Gets the value of the zaochFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZaochFormValue() {
        return zaochFormValue;
    }

    /**
     * Sets the value of the zaochFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZaochFormValue(BigDecimal value) {
        this.zaochFormValue = value;
    }

    /**
     * Gets the value of the externFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExternFormValue() {
        return externFormValue;
    }

    /**
     * Sets the value of the externFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExternFormValue(BigDecimal value) {
        this.externFormValue = value;
    }

    /**
     * Gets the value of the veshirFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVeshirFormValue() {
        return veshirFormValue;
    }

    /**
     * Sets the value of the veshirFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVeshirFormValue(BigDecimal value) {
        this.veshirFormValue = value;
    }

    /**
     * Gets the value of the distancFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistancFormValue() {
        return distancFormValue;
    }

    /**
     * Sets the value of the distancFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistancFormValue(BigDecimal value) {
        this.distancFormValue = value;
    }

    /**
     * Gets the value of the universityLicenseDataDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicenseDataDateLastChange() {
        return universityLicenseDataDateLastChange;
    }

    /**
     * Sets the value of the universityLicenseDataDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicenseDataDateLastChange(XMLGregorianCalendar value) {
        this.universityLicenseDataDateLastChange = value;
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
     * Gets the value of the universityFacultetTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetTypeName() {
        return universityFacultetTypeName;
    }

    /**
     * Sets the value of the universityFacultetTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetTypeName(String value) {
        this.universityFacultetTypeName = value;
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
     * Gets the value of the universityLicenseSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseSeries() {
        return universityLicenseSeries;
    }

    /**
     * Sets the value of the universityLicenseSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseSeries(String value) {
        this.universityLicenseSeries = value;
    }

    /**
     * Gets the value of the universityLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseNumber() {
        return universityLicenseNumber;
    }

    /**
     * Sets the value of the universityLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseNumber(String value) {
        this.universityLicenseNumber = value;
    }

    /**
     * Gets the value of the universityLicenseDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseDecision() {
        return universityLicenseDecision;
    }

    /**
     * Sets the value of the universityLicenseDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseDecision(String value) {
        this.universityLicenseDecision = value;
    }

    /**
     * Gets the value of the universityLicenseDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicenseDateGet() {
        return universityLicenseDateGet;
    }

    /**
     * Sets the value of the universityLicenseDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicenseDateGet(XMLGregorianCalendar value) {
        this.universityLicenseDateGet = value;
    }

    /**
     * Gets the value of the universityLicenseDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicenseDateLastChange() {
        return universityLicenseDateLastChange;
    }

    /**
     * Sets the value of the universityLicenseDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicenseDateLastChange(XMLGregorianCalendar value) {
        this.universityLicenseDateLastChange = value;
    }

    /**
     * Gets the value of the universityLicenseIsActive property.
     * 
     */
    public int getUniversityLicenseIsActive() {
        return universityLicenseIsActive;
    }

    /**
     * Sets the value of the universityLicenseIsActive property.
     * 
     */
    public void setUniversityLicenseIsActive(int value) {
        this.universityLicenseIsActive = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the universityLicensesActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesActivities() {
        return universityLicensesActivities;
    }

    /**
     * Sets the value of the universityLicensesActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesActivities(String value) {
        this.universityLicensesActivities = value;
    }

    /**
     * Gets the value of the typeSpec property.
     * 
     */
    public int getTypeSpec() {
        return typeSpec;
    }

    /**
     * Sets the value of the typeSpec property.
     * 
     */
    public void setTypeSpec(int value) {
        this.typeSpec = value;
    }

    /**
     * Gets the value of the universityLicenseForNoResident property.
     * 
     */
    public int getUniversityLicenseForNoResident() {
        return universityLicenseForNoResident;
    }

    /**
     * Sets the value of the universityLicenseForNoResident property.
     * 
     */
    public void setUniversityLicenseForNoResident(int value) {
        this.universityLicenseForNoResident = value;
    }

    /**
     * Gets the value of the universityKodeChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeChild() {
        return universityKodeChild;
    }

    /**
     * Sets the value of the universityKodeChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeChild(String value) {
        this.universityKodeChild = value;
    }

    /**
     * Gets the value of the idUniversityChild property.
     * 
     */
    public int getIdUniversityChild() {
        return idUniversityChild;
    }

    /**
     * Sets the value of the idUniversityChild property.
     * 
     */
    public void setIdUniversityChild(int value) {
        this.idUniversityChild = value;
    }

    /**
     * Gets the value of the universityFullNameChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameChild() {
        return universityFullNameChild;
    }

    /**
     * Sets the value of the universityFullNameChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameChild(String value) {
        this.universityFullNameChild = value;
    }

    /**
     * Gets the value of the specScecializationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationCode() {
        return specScecializationCode;
    }

    /**
     * Sets the value of the specScecializationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationCode(String value) {
        this.specScecializationCode = value;
    }

    /**
     * Gets the value of the specScecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationName() {
        return specScecializationName;
    }

    /**
     * Sets the value of the specScecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationName(String value) {
        this.specScecializationName = value;
    }

    /**
     * Gets the value of the idUniversityLicensesSubTypes property.
     * 
     */
    public int getIdUniversityLicensesSubTypes() {
        return idUniversityLicensesSubTypes;
    }

    /**
     * Sets the value of the idUniversityLicensesSubTypes property.
     * 
     */
    public void setIdUniversityLicensesSubTypes(int value) {
        this.idUniversityLicensesSubTypes = value;
    }

    /**
     * Gets the value of the universityLicensesSubTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesSubTypesName() {
        return universityLicensesSubTypesName;
    }

    /**
     * Sets the value of the universityLicensesSubTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesSubTypesName(String value) {
        this.universityLicensesSubTypesName = value;
    }

    /**
     * Gets the value of the okr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKR() {
        return okr;
    }

    /**
     * Sets the value of the okr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKR(String value) {
        this.okr = value;
    }

    /**
     * Gets the value of the isPed property.
     * 
     */
    public int getIsPed() {
        return isPed;
    }

    /**
     * Sets the value of the isPed property.
     * 
     */
    public void setIsPed(int value) {
        this.isPed = value;
    }

    /**
     * Gets the value of the idGlobalRishen property.
     * 
     */
    public int getIdGlobalRishen() {
        return idGlobalRishen;
    }

    /**
     * Sets the value of the idGlobalRishen property.
     * 
     */
    public void setIdGlobalRishen(int value) {
        this.idGlobalRishen = value;
    }

    /**
     * Gets the value of the numberRishen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRishen() {
        return numberRishen;
    }

    /**
     * Sets the value of the numberRishen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRishen(String value) {
        this.numberRishen = value;
    }

    /**
     * Gets the value of the dateRishen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRishen() {
        return dateRishen;
    }

    /**
     * Sets the value of the dateRishen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRishen(XMLGregorianCalendar value) {
        this.dateRishen = value;
    }

}
