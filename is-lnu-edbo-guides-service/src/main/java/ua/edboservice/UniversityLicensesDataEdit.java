
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
 *         &lt;element name="Id_UniversityLicenseData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseDataDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayFormValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZaochFormValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternFormValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VeshirFormValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistancFormValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKodeChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityLicensesSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsPed" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idUniversityLicenseData",
    "universityFacultetKode",
    "specDirectionsCode",
    "specSpecialityCode",
    "universityLicenseDataDateEnd",
    "dayFormValue",
    "zaochFormValue",
    "externFormValue",
    "veshirFormValue",
    "distancFormValue",
    "universityKodeChild",
    "specScecializationCode",
    "specScecializationName",
    "idUniversityLicensesSubTypes",
    "isPed"
})
@XmlRootElement(name = "UniversityLicensesDataEdit")
public class UniversityLicensesDataEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityLicenseData")
    protected int idUniversityLicenseData;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "UniversityLicenseDataDateEnd")
    protected String universityLicenseDataDateEnd;
    @XmlElement(name = "DayFormValue")
    protected String dayFormValue;
    @XmlElement(name = "ZaochFormValue")
    protected String zaochFormValue;
    @XmlElement(name = "ExternFormValue")
    protected String externFormValue;
    @XmlElement(name = "VeshirFormValue")
    protected String veshirFormValue;
    @XmlElement(name = "DistancFormValue")
    protected String distancFormValue;
    @XmlElement(name = "UniversityKodeChild")
    protected String universityKodeChild;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;
    @XmlElement(name = "Id_UniversityLicensesSubTypes")
    protected int idUniversityLicensesSubTypes;
    @XmlElement(name = "IsPed")
    protected int isPed;

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
     * Gets the value of the universityLicenseDataDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseDataDateEnd() {
        return universityLicenseDataDateEnd;
    }

    /**
     * Sets the value of the universityLicenseDataDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseDataDateEnd(String value) {
        this.universityLicenseDataDateEnd = value;
    }

    /**
     * Gets the value of the dayFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayFormValue() {
        return dayFormValue;
    }

    /**
     * Sets the value of the dayFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayFormValue(String value) {
        this.dayFormValue = value;
    }

    /**
     * Gets the value of the zaochFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZaochFormValue() {
        return zaochFormValue;
    }

    /**
     * Sets the value of the zaochFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZaochFormValue(String value) {
        this.zaochFormValue = value;
    }

    /**
     * Gets the value of the externFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternFormValue() {
        return externFormValue;
    }

    /**
     * Sets the value of the externFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternFormValue(String value) {
        this.externFormValue = value;
    }

    /**
     * Gets the value of the veshirFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeshirFormValue() {
        return veshirFormValue;
    }

    /**
     * Sets the value of the veshirFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeshirFormValue(String value) {
        this.veshirFormValue = value;
    }

    /**
     * Gets the value of the distancFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistancFormValue() {
        return distancFormValue;
    }

    /**
     * Sets the value of the distancFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistancFormValue(String value) {
        this.distancFormValue = value;
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

}
