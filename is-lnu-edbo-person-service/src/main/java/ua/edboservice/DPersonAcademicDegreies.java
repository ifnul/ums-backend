
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonAcademicDegreies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonAcademicDegreies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonAcademicDegreies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationDegreType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationDegreTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiplomDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CertifyingAgenciesNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateResolve" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberResolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadaDateResolve" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RadaNumberResolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonAcademicDegreiesScan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationDegreDetailFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonAcademicDegreies", propOrder = {
    "idPersonAcademicDegreies",
    "idAcademicEducationDegreType",
    "academicEducationDegreTypeName",
    "personCodeU",
    "idPersonName",
    "fio",
    "diplomSeries",
    "diplomNumber",
    "diplomDateGet",
    "idCertifyingAgencies",
    "certifyingAgenciesNames",
    "dateResolve",
    "numberResolve",
    "academicCouncilNumber",
    "academicCouncilOrganisation",
    "radaDateResolve",
    "radaNumberResolve",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "idUserAdd",
    "idUserEdit",
    "dateCreate",
    "dateLastChange",
    "idPersonAcademicDegreiesScan",
    "idAcademicEducationDegreDetailType",
    "academicEducationDegreDetailFullName",
    "academicEducationDegreDetailShortName"
})
public class DPersonAcademicDegreies {

    @XmlElement(name = "Id_PersonAcademicDegreies")
    protected int idPersonAcademicDegreies;
    @XmlElement(name = "Id_AcademicEducationDegreType")
    protected int idAcademicEducationDegreType;
    @XmlElement(name = "AcademicEducationDegreTypeName")
    protected String academicEducationDegreTypeName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "DiplomSeries")
    protected String diplomSeries;
    @XmlElement(name = "DiplomNumber")
    protected String diplomNumber;
    @XmlElement(name = "DiplomDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar diplomDateGet;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "CertifyingAgenciesNames")
    protected String certifyingAgenciesNames;
    @XmlElement(name = "DateResolve", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateResolve;
    @XmlElement(name = "NumberResolve")
    protected String numberResolve;
    @XmlElement(name = "AcademicCouncilNumber")
    protected String academicCouncilNumber;
    @XmlElement(name = "AcademicCouncilOrganisation")
    protected String academicCouncilOrganisation;
    @XmlElement(name = "RadaDateResolve", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar radaDateResolve;
    @XmlElement(name = "RadaNumberResolve")
    protected String radaNumberResolve;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "Id_UserEdit")
    protected int idUserEdit;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_PersonAcademicDegreiesScan")
    protected int idPersonAcademicDegreiesScan;
    @XmlElement(name = "Id_AcademicEducationDegreDetailType")
    protected int idAcademicEducationDegreDetailType;
    @XmlElement(name = "AcademicEducationDegreDetailFullName")
    protected String academicEducationDegreDetailFullName;
    @XmlElement(name = "AcademicEducationDegreDetailShortName")
    protected String academicEducationDegreDetailShortName;

    /**
     * Gets the value of the idPersonAcademicDegreies property.
     * 
     */
    public int getIdPersonAcademicDegreies() {
        return idPersonAcademicDegreies;
    }

    /**
     * Sets the value of the idPersonAcademicDegreies property.
     * 
     */
    public void setIdPersonAcademicDegreies(int value) {
        this.idPersonAcademicDegreies = value;
    }

    /**
     * Gets the value of the idAcademicEducationDegreType property.
     * 
     */
    public int getIdAcademicEducationDegreType() {
        return idAcademicEducationDegreType;
    }

    /**
     * Sets the value of the idAcademicEducationDegreType property.
     * 
     */
    public void setIdAcademicEducationDegreType(int value) {
        this.idAcademicEducationDegreType = value;
    }

    /**
     * Gets the value of the academicEducationDegreTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreTypeName() {
        return academicEducationDegreTypeName;
    }

    /**
     * Sets the value of the academicEducationDegreTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreTypeName(String value) {
        this.academicEducationDegreTypeName = value;
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
     * Gets the value of the diplomSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiplomSeries() {
        return diplomSeries;
    }

    /**
     * Sets the value of the diplomSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiplomSeries(String value) {
        this.diplomSeries = value;
    }

    /**
     * Gets the value of the diplomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiplomNumber() {
        return diplomNumber;
    }

    /**
     * Sets the value of the diplomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiplomNumber(String value) {
        this.diplomNumber = value;
    }

    /**
     * Gets the value of the diplomDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiplomDateGet() {
        return diplomDateGet;
    }

    /**
     * Sets the value of the diplomDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiplomDateGet(XMLGregorianCalendar value) {
        this.diplomDateGet = value;
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
     * Gets the value of the dateResolve property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateResolve() {
        return dateResolve;
    }

    /**
     * Sets the value of the dateResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateResolve(XMLGregorianCalendar value) {
        this.dateResolve = value;
    }

    /**
     * Gets the value of the numberResolve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberResolve() {
        return numberResolve;
    }

    /**
     * Sets the value of the numberResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberResolve(String value) {
        this.numberResolve = value;
    }

    /**
     * Gets the value of the academicCouncilNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilNumber() {
        return academicCouncilNumber;
    }

    /**
     * Sets the value of the academicCouncilNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilNumber(String value) {
        this.academicCouncilNumber = value;
    }

    /**
     * Gets the value of the academicCouncilOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilOrganisation() {
        return academicCouncilOrganisation;
    }

    /**
     * Sets the value of the academicCouncilOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilOrganisation(String value) {
        this.academicCouncilOrganisation = value;
    }

    /**
     * Gets the value of the radaDateResolve property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRadaDateResolve() {
        return radaDateResolve;
    }

    /**
     * Sets the value of the radaDateResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRadaDateResolve(XMLGregorianCalendar value) {
        this.radaDateResolve = value;
    }

    /**
     * Gets the value of the radaNumberResolve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadaNumberResolve() {
        return radaNumberResolve;
    }

    /**
     * Sets the value of the radaNumberResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadaNumberResolve(String value) {
        this.radaNumberResolve = value;
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
     * Gets the value of the scienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityClasifierCode() {
        return scienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the scienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityClasifierCode(String value) {
        this.scienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityName() {
        return scienceSpecialityName;
    }

    /**
     * Sets the value of the scienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityName(String value) {
        this.scienceSpecialityName = value;
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
     * Gets the value of the idPersonAcademicDegreiesScan property.
     * 
     */
    public int getIdPersonAcademicDegreiesScan() {
        return idPersonAcademicDegreiesScan;
    }

    /**
     * Sets the value of the idPersonAcademicDegreiesScan property.
     * 
     */
    public void setIdPersonAcademicDegreiesScan(int value) {
        this.idPersonAcademicDegreiesScan = value;
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
     * Gets the value of the academicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreDetailShortName() {
        return academicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the academicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreDetailShortName(String value) {
        this.academicEducationDegreDetailShortName = value;
    }

}
