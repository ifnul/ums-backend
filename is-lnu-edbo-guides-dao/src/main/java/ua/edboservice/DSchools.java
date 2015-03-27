
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dSchools complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSchools">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_School" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationClass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Kode_School" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SchoolDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_SchoolName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SchoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolShortNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StreetTypeShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetTypeFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolBossLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolBossFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolBossMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationOrganizationFullTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationOrganizationShortTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationOrganizationClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSchools", propOrder = {
    "idSchool",
    "idEducationType",
    "idEducationClass",
    "kodeSchool",
    "schoolDateBegin",
    "schoolDateEnd",
    "idSchoolName",
    "schoolName",
    "schoolShortNam",
    "koatuuCode",
    "koatuuFullName",
    "idStreetType",
    "streetTypeShortName",
    "streetTypeFullName",
    "streetName",
    "houceNum",
    "schoolBossLastName",
    "schoolBossFirstName",
    "schoolBossMiddleName",
    "schoolPhone",
    "schoolMobile",
    "schoolEMail",
    "educationOrganizationFullTypeName",
    "educationOrganizationShortTypeName",
    "educationOrganizationClassName",
    "idLanguage"
})
public class DSchools {

    @XmlElement(name = "Id_School")
    protected int idSchool;
    @XmlElement(name = "Id_EducationType")
    protected int idEducationType;
    @XmlElement(name = "Id_EducationClass")
    protected int idEducationClass;
    @XmlElement(name = "Kode_School")
    protected String kodeSchool;
    @XmlElement(name = "SchoolDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar schoolDateBegin;
    @XmlElement(name = "SchoolDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar schoolDateEnd;
    @XmlElement(name = "Id_SchoolName")
    protected int idSchoolName;
    @XmlElement(name = "SchoolName")
    protected String schoolName;
    @XmlElement(name = "SchoolShortNam")
    protected String schoolShortNam;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "KOATUUFullName")
    protected String koatuuFullName;
    @XmlElement(name = "Id_StreetType")
    protected int idStreetType;
    @XmlElement(name = "StreetTypeShortName")
    protected String streetTypeShortName;
    @XmlElement(name = "StreetTypeFullName")
    protected String streetTypeFullName;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "HouceNum")
    protected String houceNum;
    @XmlElement(name = "SchoolBossLastName")
    protected String schoolBossLastName;
    @XmlElement(name = "SchoolBossFirstName")
    protected String schoolBossFirstName;
    @XmlElement(name = "SchoolBossMiddleName")
    protected String schoolBossMiddleName;
    @XmlElement(name = "SchoolPhone")
    protected String schoolPhone;
    @XmlElement(name = "SchoolMobile")
    protected String schoolMobile;
    @XmlElement(name = "SchoolEMail")
    protected String schoolEMail;
    @XmlElement(name = "EducationOrganizationFullTypeName")
    protected String educationOrganizationFullTypeName;
    @XmlElement(name = "EducationOrganizationShortTypeName")
    protected String educationOrganizationShortTypeName;
    @XmlElement(name = "EducationOrganizationClassName")
    protected String educationOrganizationClassName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;

    /**
     * Gets the value of the idSchool property.
     * 
     */
    public int getIdSchool() {
        return idSchool;
    }

    /**
     * Sets the value of the idSchool property.
     * 
     */
    public void setIdSchool(int value) {
        this.idSchool = value;
    }

    /**
     * Gets the value of the idEducationType property.
     * 
     */
    public int getIdEducationType() {
        return idEducationType;
    }

    /**
     * Sets the value of the idEducationType property.
     * 
     */
    public void setIdEducationType(int value) {
        this.idEducationType = value;
    }

    /**
     * Gets the value of the idEducationClass property.
     * 
     */
    public int getIdEducationClass() {
        return idEducationClass;
    }

    /**
     * Sets the value of the idEducationClass property.
     * 
     */
    public void setIdEducationClass(int value) {
        this.idEducationClass = value;
    }

    /**
     * Gets the value of the kodeSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeSchool() {
        return kodeSchool;
    }

    /**
     * Sets the value of the kodeSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeSchool(String value) {
        this.kodeSchool = value;
    }

    /**
     * Gets the value of the schoolDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolDateBegin() {
        return schoolDateBegin;
    }

    /**
     * Sets the value of the schoolDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolDateBegin(XMLGregorianCalendar value) {
        this.schoolDateBegin = value;
    }

    /**
     * Gets the value of the schoolDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolDateEnd() {
        return schoolDateEnd;
    }

    /**
     * Sets the value of the schoolDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolDateEnd(XMLGregorianCalendar value) {
        this.schoolDateEnd = value;
    }

    /**
     * Gets the value of the idSchoolName property.
     * 
     */
    public int getIdSchoolName() {
        return idSchoolName;
    }

    /**
     * Sets the value of the idSchoolName property.
     * 
     */
    public void setIdSchoolName(int value) {
        this.idSchoolName = value;
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

    /**
     * Gets the value of the schoolShortNam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolShortNam() {
        return schoolShortNam;
    }

    /**
     * Sets the value of the schoolShortNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolShortNam(String value) {
        this.schoolShortNam = value;
    }

    /**
     * Gets the value of the koatuuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCode() {
        return koatuuCode;
    }

    /**
     * Sets the value of the koatuuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCode(String value) {
        this.koatuuCode = value;
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
     * Gets the value of the idStreetType property.
     * 
     */
    public int getIdStreetType() {
        return idStreetType;
    }

    /**
     * Sets the value of the idStreetType property.
     * 
     */
    public void setIdStreetType(int value) {
        this.idStreetType = value;
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
     * Gets the value of the houceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouceNum() {
        return houceNum;
    }

    /**
     * Sets the value of the houceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouceNum(String value) {
        this.houceNum = value;
    }

    /**
     * Gets the value of the schoolBossLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolBossLastName() {
        return schoolBossLastName;
    }

    /**
     * Sets the value of the schoolBossLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolBossLastName(String value) {
        this.schoolBossLastName = value;
    }

    /**
     * Gets the value of the schoolBossFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolBossFirstName() {
        return schoolBossFirstName;
    }

    /**
     * Sets the value of the schoolBossFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolBossFirstName(String value) {
        this.schoolBossFirstName = value;
    }

    /**
     * Gets the value of the schoolBossMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolBossMiddleName() {
        return schoolBossMiddleName;
    }

    /**
     * Sets the value of the schoolBossMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolBossMiddleName(String value) {
        this.schoolBossMiddleName = value;
    }

    /**
     * Gets the value of the schoolPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolPhone() {
        return schoolPhone;
    }

    /**
     * Sets the value of the schoolPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolPhone(String value) {
        this.schoolPhone = value;
    }

    /**
     * Gets the value of the schoolMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolMobile() {
        return schoolMobile;
    }

    /**
     * Sets the value of the schoolMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolMobile(String value) {
        this.schoolMobile = value;
    }

    /**
     * Gets the value of the schoolEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolEMail() {
        return schoolEMail;
    }

    /**
     * Sets the value of the schoolEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolEMail(String value) {
        this.schoolEMail = value;
    }

    /**
     * Gets the value of the educationOrganizationFullTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationFullTypeName() {
        return educationOrganizationFullTypeName;
    }

    /**
     * Sets the value of the educationOrganizationFullTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationFullTypeName(String value) {
        this.educationOrganizationFullTypeName = value;
    }

    /**
     * Gets the value of the educationOrganizationShortTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationShortTypeName() {
        return educationOrganizationShortTypeName;
    }

    /**
     * Sets the value of the educationOrganizationShortTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationShortTypeName(String value) {
        this.educationOrganizationShortTypeName = value;
    }

    /**
     * Gets the value of the educationOrganizationClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationClassName() {
        return educationOrganizationClassName;
    }

    /**
     * Sets the value of the educationOrganizationClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationClassName(String value) {
        this.educationOrganizationClassName = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

}
