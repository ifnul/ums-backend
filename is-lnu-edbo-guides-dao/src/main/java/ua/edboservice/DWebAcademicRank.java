
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dWebAcademicRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebAcademicRank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebAcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebAcademicRankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicRankType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicRankAttestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicRankAttestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicRankAttestatDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrganName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganProtocolNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganProtocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicRankKafedra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicRankSpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicRankSpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicRankTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dWebAcademicRank", propOrder = {
    "idWebAcademicRank",
    "webAcademicRankName",
    "idAcademicRankType",
    "academicRankAttestatSeries",
    "academicRankAttestatNumber",
    "academicRankAttestatDate",
    "organName",
    "organProtocolNumber",
    "organProtocolDate",
    "academicRankKafedra",
    "academicRankSpecClasifierCode",
    "academicRankSpecName",
    "idWebPersons",
    "idAcademicRank",
    "idCertifyingAgencies",
    "scienceSpecialityCode",
    "academicRankTypeName",
    "certifyingAgenciesNames",
    "universityKodeCertifyingAgencies",
    "certifyingAgenciesAdditionalName"
})
public class DWebAcademicRank {

    @XmlElement(name = "Id_WebAcademicRank")
    protected int idWebAcademicRank;
    @XmlElement(name = "WebAcademicRankName")
    protected String webAcademicRankName;
    @XmlElement(name = "Id_AcademicRankType")
    protected int idAcademicRankType;
    @XmlElement(name = "AcademicRankAttestatSeries")
    protected String academicRankAttestatSeries;
    @XmlElement(name = "AcademicRankAttestatNumber")
    protected String academicRankAttestatNumber;
    @XmlElement(name = "AcademicRankAttestatDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicRankAttestatDate;
    @XmlElement(name = "OrganName")
    protected String organName;
    @XmlElement(name = "OrganProtocolNumber")
    protected String organProtocolNumber;
    @XmlElement(name = "OrganProtocolDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar organProtocolDate;
    @XmlElement(name = "AcademicRankKafedra")
    protected String academicRankKafedra;
    @XmlElement(name = "AcademicRankSpecClasifierCode")
    protected String academicRankSpecClasifierCode;
    @XmlElement(name = "AcademicRankSpecName")
    protected String academicRankSpecName;
    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "Id_AcademicRank")
    protected int idAcademicRank;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "AcademicRankTypeName")
    protected String academicRankTypeName;
    @XmlElement(name = "CertifyingAgenciesNames")
    protected String certifyingAgenciesNames;
    @XmlElement(name = "UniversityKode_CertifyingAgencies")
    protected String universityKodeCertifyingAgencies;
    @XmlElement(name = "CertifyingAgenciesAdditionalName")
    protected String certifyingAgenciesAdditionalName;

    /**
     * Gets the value of the idWebAcademicRank property.
     * 
     */
    public int getIdWebAcademicRank() {
        return idWebAcademicRank;
    }

    /**
     * Sets the value of the idWebAcademicRank property.
     * 
     */
    public void setIdWebAcademicRank(int value) {
        this.idWebAcademicRank = value;
    }

    /**
     * Gets the value of the webAcademicRankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAcademicRankName() {
        return webAcademicRankName;
    }

    /**
     * Sets the value of the webAcademicRankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAcademicRankName(String value) {
        this.webAcademicRankName = value;
    }

    /**
     * Gets the value of the idAcademicRankType property.
     * 
     */
    public int getIdAcademicRankType() {
        return idAcademicRankType;
    }

    /**
     * Sets the value of the idAcademicRankType property.
     * 
     */
    public void setIdAcademicRankType(int value) {
        this.idAcademicRankType = value;
    }

    /**
     * Gets the value of the academicRankAttestatSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankAttestatSeries() {
        return academicRankAttestatSeries;
    }

    /**
     * Sets the value of the academicRankAttestatSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankAttestatSeries(String value) {
        this.academicRankAttestatSeries = value;
    }

    /**
     * Gets the value of the academicRankAttestatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankAttestatNumber() {
        return academicRankAttestatNumber;
    }

    /**
     * Sets the value of the academicRankAttestatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankAttestatNumber(String value) {
        this.academicRankAttestatNumber = value;
    }

    /**
     * Gets the value of the academicRankAttestatDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicRankAttestatDate() {
        return academicRankAttestatDate;
    }

    /**
     * Sets the value of the academicRankAttestatDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicRankAttestatDate(XMLGregorianCalendar value) {
        this.academicRankAttestatDate = value;
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
     * Gets the value of the academicRankKafedra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankKafedra() {
        return academicRankKafedra;
    }

    /**
     * Sets the value of the academicRankKafedra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankKafedra(String value) {
        this.academicRankKafedra = value;
    }

    /**
     * Gets the value of the academicRankSpecClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankSpecClasifierCode() {
        return academicRankSpecClasifierCode;
    }

    /**
     * Sets the value of the academicRankSpecClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankSpecClasifierCode(String value) {
        this.academicRankSpecClasifierCode = value;
    }

    /**
     * Gets the value of the academicRankSpecName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankSpecName() {
        return academicRankSpecName;
    }

    /**
     * Sets the value of the academicRankSpecName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankSpecName(String value) {
        this.academicRankSpecName = value;
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
     * Gets the value of the idAcademicRank property.
     * 
     */
    public int getIdAcademicRank() {
        return idAcademicRank;
    }

    /**
     * Sets the value of the idAcademicRank property.
     * 
     */
    public void setIdAcademicRank(int value) {
        this.idAcademicRank = value;
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
     * Gets the value of the academicRankTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankTypeName() {
        return academicRankTypeName;
    }

    /**
     * Sets the value of the academicRankTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankTypeName(String value) {
        this.academicRankTypeName = value;
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
