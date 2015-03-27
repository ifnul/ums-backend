
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dWebAcademicDegreies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebAcademicDegreies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebAcademicDegreies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebAcademicDegreiesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicDegreiesDiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicDegreiesDiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicDegreiesDiplomData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrganName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganProtocolNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganProtocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SpecRadaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecRadaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecRadaDateRish" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SpecRadaNumberProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationDegreDetailFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertifyingAgenciesNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertifyingAgenciesAdditionalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebAcademicDegreies", propOrder = {
    "idWebAcademicDegreies",
    "webAcademicDegreiesName",
    "academicDegreiesDiplomSeries",
    "academicDegreiesDiplomNumber",
    "academicDegreiesDiplomData",
    "organName",
    "organProtocolNumber",
    "organProtocolDate",
    "specRadaName",
    "specRadaCode",
    "specRadaDateRish",
    "specRadaNumberProt",
    "specCode",
    "specName",
    "idWebPersons",
    "idAcademicEducationDegreDetailType",
    "idCertifyingAgencies",
    "scienceSpecialityCode",
    "academicEducationDegreDetailFullName",
    "certifyingAgenciesNames",
    "universityKodeCertifyingAgencies",
    "certifyingAgenciesAdditionalName"
})
public class DWebAcademicDegreies {

    @XmlElement(name = "Id_WebAcademicDegreies")
    protected int idWebAcademicDegreies;
    @XmlElement(name = "WebAcademicDegreiesName")
    protected String webAcademicDegreiesName;
    @XmlElement(name = "AcademicDegreiesDiplomSeries")
    protected String academicDegreiesDiplomSeries;
    @XmlElement(name = "AcademicDegreiesDiplomNumber")
    protected String academicDegreiesDiplomNumber;
    @XmlElement(name = "AcademicDegreiesDiplomData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicDegreiesDiplomData;
    @XmlElement(name = "OrganName")
    protected String organName;
    @XmlElement(name = "OrganProtocolNumber")
    protected String organProtocolNumber;
    @XmlElement(name = "OrganProtocolDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar organProtocolDate;
    @XmlElement(name = "SpecRadaName")
    protected String specRadaName;
    @XmlElement(name = "SpecRadaCode")
    protected String specRadaCode;
    @XmlElement(name = "SpecRadaDateRish", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specRadaDateRish;
    @XmlElement(name = "SpecRadaNumberProt")
    protected String specRadaNumberProt;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "SpecName")
    protected String specName;
    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "Id_AcademicEducationDegreDetailType")
    protected int idAcademicEducationDegreDetailType;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "AcademicEducationDegreDetailFullName")
    protected String academicEducationDegreDetailFullName;
    @XmlElement(name = "CertifyingAgenciesNames")
    protected String certifyingAgenciesNames;
    @XmlElement(name = "UniversityKode_CertifyingAgencies")
    protected String universityKodeCertifyingAgencies;
    @XmlElement(name = "CertifyingAgenciesAdditionalName")
    protected String certifyingAgenciesAdditionalName;

    /**
     * Gets the value of the idWebAcademicDegreies property.
     * 
     */
    public int getIdWebAcademicDegreies() {
        return idWebAcademicDegreies;
    }

    /**
     * Sets the value of the idWebAcademicDegreies property.
     * 
     */
    public void setIdWebAcademicDegreies(int value) {
        this.idWebAcademicDegreies = value;
    }

    /**
     * Gets the value of the webAcademicDegreiesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAcademicDegreiesName() {
        return webAcademicDegreiesName;
    }

    /**
     * Sets the value of the webAcademicDegreiesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAcademicDegreiesName(String value) {
        this.webAcademicDegreiesName = value;
    }

    /**
     * Gets the value of the academicDegreiesDiplomSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicDegreiesDiplomSeries() {
        return academicDegreiesDiplomSeries;
    }

    /**
     * Sets the value of the academicDegreiesDiplomSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicDegreiesDiplomSeries(String value) {
        this.academicDegreiesDiplomSeries = value;
    }

    /**
     * Gets the value of the academicDegreiesDiplomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicDegreiesDiplomNumber() {
        return academicDegreiesDiplomNumber;
    }

    /**
     * Sets the value of the academicDegreiesDiplomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicDegreiesDiplomNumber(String value) {
        this.academicDegreiesDiplomNumber = value;
    }

    /**
     * Gets the value of the academicDegreiesDiplomData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicDegreiesDiplomData() {
        return academicDegreiesDiplomData;
    }

    /**
     * Sets the value of the academicDegreiesDiplomData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicDegreiesDiplomData(XMLGregorianCalendar value) {
        this.academicDegreiesDiplomData = value;
    }

    /**
     * Gets the value of the organName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * Sets the value of the organName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganName(String value) {
        this.organName = value;
    }

    /**
     * Gets the value of the organProtocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganProtocolNumber() {
        return organProtocolNumber;
    }

    /**
     * Sets the value of the organProtocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganProtocolNumber(String value) {
        this.organProtocolNumber = value;
    }

    /**
     * Gets the value of the organProtocolDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrganProtocolDate() {
        return organProtocolDate;
    }

    /**
     * Sets the value of the organProtocolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrganProtocolDate(XMLGregorianCalendar value) {
        this.organProtocolDate = value;
    }

    /**
     * Gets the value of the specRadaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecRadaName() {
        return specRadaName;
    }

    /**
     * Sets the value of the specRadaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecRadaName(String value) {
        this.specRadaName = value;
    }

    /**
     * Gets the value of the specRadaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecRadaCode() {
        return specRadaCode;
    }

    /**
     * Sets the value of the specRadaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecRadaCode(String value) {
        this.specRadaCode = value;
    }

    /**
     * Gets the value of the specRadaDateRish property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecRadaDateRish() {
        return specRadaDateRish;
    }

    /**
     * Sets the value of the specRadaDateRish property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecRadaDateRish(XMLGregorianCalendar value) {
        this.specRadaDateRish = value;
    }

    /**
     * Gets the value of the specRadaNumberProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecRadaNumberProt() {
        return specRadaNumberProt;
    }

    /**
     * Sets the value of the specRadaNumberProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecRadaNumberProt(String value) {
        this.specRadaNumberProt = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the specName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * Sets the value of the specName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecName(String value) {
        this.specName = value;
    }

    /**
     * Gets the value of the idWebPersons property.
     * 
     */
    public int getIdWebPersons() {
        return idWebPersons;
    }

    /**
     * Sets the value of the idWebPersons property.
     * 
     */
    public void setIdWebPersons(int value) {
        this.idWebPersons = value;
    }

    /**
     * Gets the value of the idAcademicEducationDegreDetailType property.
     * 
     */
    public int getIdAcademicEducationDegreDetailType() {
        return idAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the idAcademicEducationDegreDetailType property.
     * 
     */
    public void setIdAcademicEducationDegreDetailType(int value) {
        this.idAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the idCertifyingAgencies property.
     * 
     */
    public int getIdCertifyingAgencies() {
        return idCertifyingAgencies;
    }

    /**
     * Sets the value of the idCertifyingAgencies property.
     * 
     */
    public void setIdCertifyingAgencies(int value) {
        this.idCertifyingAgencies = value;
    }

    /**
     * Gets the value of the scienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityCode() {
        return scienceSpecialityCode;
    }

    /**
     * Sets the value of the scienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityCode(String value) {
        this.scienceSpecialityCode = value;
    }

    /**
     * Gets the value of the academicEducationDegreDetailFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreDetailFullName() {
        return academicEducationDegreDetailFullName;
    }

    /**
     * Sets the value of the academicEducationDegreDetailFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreDetailFullName(String value) {
        this.academicEducationDegreDetailFullName = value;
    }

    /**
     * Gets the value of the certifyingAgenciesNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifyingAgenciesNames() {
        return certifyingAgenciesNames;
    }

    /**
     * Sets the value of the certifyingAgenciesNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifyingAgenciesNames(String value) {
        this.certifyingAgenciesNames = value;
    }

    /**
     * Gets the value of the universityKodeCertifyingAgencies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeCertifyingAgencies() {
        return universityKodeCertifyingAgencies;
    }

    /**
     * Sets the value of the universityKodeCertifyingAgencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeCertifyingAgencies(String value) {
        this.universityKodeCertifyingAgencies = value;
    }

    /**
     * Gets the value of the certifyingAgenciesAdditionalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifyingAgenciesAdditionalName() {
        return certifyingAgenciesAdditionalName;
    }

    /**
     * Sets the value of the certifyingAgenciesAdditionalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifyingAgenciesAdditionalName(String value) {
        this.certifyingAgenciesAdditionalName = value;
    }

}
