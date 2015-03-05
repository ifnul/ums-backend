
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonAcademicRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonAcademicRank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonAcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicRankType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicRankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicRankTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CertifyingAgenciesNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataResolve" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberRsolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KafedraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonAcademicRankScan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonAcademicRank", propOrder = {
    "idPersonAcademicRank",
    "fio",
    "idAcademicRank",
    "idAcademicRankType",
    "academicRankName",
    "academicRankTypeName",
    "personCodeU",
    "idPersonName",
    "attestatSeries",
    "attestatNumber",
    "attestatDateGet",
    "idCertifyingAgencies",
    "certifyingAgenciesNames",
    "dataResolve",
    "numberRsolve",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "kafedraName",
    "idUserAdd",
    "idUserEdit",
    "dateCreate",
    "dateLastChange",
    "idPersonAcademicRankScan"
})
public class DPersonAcademicRank {

    @XmlElement(name = "Id_PersonAcademicRank")
    protected int idPersonAcademicRank;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Id_AcademicRank")
    protected int idAcademicRank;
    @XmlElement(name = "Id_AcademicRankType")
    protected int idAcademicRankType;
    @XmlElement(name = "AcademicRankName")
    protected String academicRankName;
    @XmlElement(name = "AcademicRankTypeName")
    protected String academicRankTypeName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "AttestatSeries")
    protected String attestatSeries;
    @XmlElement(name = "AttestatNumber")
    protected String attestatNumber;
    @XmlElement(name = "AttestatDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attestatDateGet;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "CertifyingAgenciesNames")
    protected String certifyingAgenciesNames;
    @XmlElement(name = "DataResolve", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataResolve;
    @XmlElement(name = "NumberRsolve")
    protected String numberRsolve;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "KafedraName")
    protected String kafedraName;
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
    @XmlElement(name = "Id_PersonAcademicRankScan")
    protected int idPersonAcademicRankScan;

    /**
     * Gets the value of the idPersonAcademicRank property.
     * 
     */
    public int getIdPersonAcademicRank() {
        return idPersonAcademicRank;
    }

    /**
     * Sets the value of the idPersonAcademicRank property.
     * 
     */
    public void setIdPersonAcademicRank(int value) {
        this.idPersonAcademicRank = value;
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
     * Gets the value of the academicRankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankName() {
        return academicRankName;
    }

    /**
     * Sets the value of the academicRankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankName(String value) {
        this.academicRankName = value;
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
     * Gets the value of the attestatSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestatSeries() {
        return attestatSeries;
    }

    /**
     * Sets the value of the attestatSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatSeries(String value) {
        this.attestatSeries = value;
    }

    /**
     * Gets the value of the attestatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestatNumber() {
        return attestatNumber;
    }

    /**
     * Sets the value of the attestatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatNumber(String value) {
        this.attestatNumber = value;
    }

    /**
     * Gets the value of the attestatDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttestatDateGet() {
        return attestatDateGet;
    }

    /**
     * Sets the value of the attestatDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttestatDateGet(XMLGregorianCalendar value) {
        this.attestatDateGet = value;
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
     * Gets the value of the dataResolve property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataResolve() {
        return dataResolve;
    }

    /**
     * Sets the value of the dataResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataResolve(XMLGregorianCalendar value) {
        this.dataResolve = value;
    }

    /**
     * Gets the value of the numberRsolve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRsolve() {
        return numberRsolve;
    }

    /**
     * Sets the value of the numberRsolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRsolve(String value) {
        this.numberRsolve = value;
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
     * Gets the value of the kafedraName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKafedraName() {
        return kafedraName;
    }

    /**
     * Sets the value of the kafedraName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKafedraName(String value) {
        this.kafedraName = value;
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
     * Gets the value of the idPersonAcademicRankScan property.
     * 
     */
    public int getIdPersonAcademicRankScan() {
        return idPersonAcademicRankScan;
    }

    /**
     * Sets the value of the idPersonAcademicRankScan property.
     * 
     */
    public void setIdPersonAcademicRankScan(int value) {
        this.idPersonAcademicRankScan = value;
    }

}
