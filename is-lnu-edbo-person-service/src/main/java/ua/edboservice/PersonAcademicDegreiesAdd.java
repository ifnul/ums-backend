
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
 *         &lt;element name="Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiplomSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiplomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiplomDateGet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateResolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberResolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadaDateResolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadaNumberResolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonAcademicDegreiesScan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAcademicEducationDegreDetailType",
    "personCodeU",
    "diplomSeries",
    "diplomNumber",
    "diplomDateGet",
    "idCertifyingAgencies",
    "dateResolve",
    "numberResolve",
    "academicCouncilNumber",
    "academicCouncilOrganisation",
    "radaDateResolve",
    "radaNumberResolve",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "personAcademicDegreiesScan"
})
@XmlRootElement(name = "PersonAcademicDegreiesAdd")
public class PersonAcademicDegreiesAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_AcademicEducationDegreDetailType")
    protected int idAcademicEducationDegreDetailType;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "DiplomSeries")
    protected String diplomSeries;
    @XmlElement(name = "DiplomNumber")
    protected String diplomNumber;
    @XmlElement(name = "DiplomDateGet")
    protected String diplomDateGet;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "DateResolve")
    protected String dateResolve;
    @XmlElement(name = "NumberResolve")
    protected String numberResolve;
    @XmlElement(name = "AcademicCouncilNumber")
    protected String academicCouncilNumber;
    @XmlElement(name = "AcademicCouncilOrganisation")
    protected String academicCouncilOrganisation;
    @XmlElement(name = "RadaDateResolve")
    protected String radaDateResolve;
    @XmlElement(name = "RadaNumberResolve")
    protected String radaNumberResolve;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "PersonAcademicDegreiesScan")
    protected String personAcademicDegreiesScan;

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
     *     {@link String }
     *     
     */
    public String getDiplomDateGet() {
        return diplomDateGet;
    }

    /**
     * Sets the value of the diplomDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiplomDateGet(String value) {
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
     * Gets the value of the dateResolve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateResolve() {
        return dateResolve;
    }

    /**
     * Sets the value of the dateResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateResolve(String value) {
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
     *     {@link String }
     *     
     */
    public String getRadaDateResolve() {
        return radaDateResolve;
    }

    /**
     * Sets the value of the radaDateResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadaDateResolve(String value) {
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
     * Gets the value of the personAcademicDegreiesScan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonAcademicDegreiesScan() {
        return personAcademicDegreiesScan;
    }

    /**
     * Sets the value of the personAcademicDegreiesScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonAcademicDegreiesScan(String value) {
        this.personAcademicDegreiesScan = value;
    }

}
