
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
 *         &lt;element name="Id_PersonAcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatDateGet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataResolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberRsolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KafedraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonAcademicRank",
    "attestatSeries",
    "attestatNumber",
    "attestatDateGet",
    "idCertifyingAgencies",
    "dataResolve",
    "numberRsolve",
    "scienceSpecialityCode",
    "kafedraName",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName"
})
@XmlRootElement(name = "PersonAcademicRankEdit")
public class PersonAcademicRankEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonAcademicRank")
    protected int idPersonAcademicRank;
    @XmlElement(name = "AttestatSeries")
    protected String attestatSeries;
    @XmlElement(name = "AttestatNumber")
    protected String attestatNumber;
    @XmlElement(name = "AttestatDateGet")
    protected String attestatDateGet;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "DataResolve")
    protected String dataResolve;
    @XmlElement(name = "NumberRsolve")
    protected String numberRsolve;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "KafedraName")
    protected String kafedraName;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;

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
     *     {@link String }
     *     
     */
    public String getAttestatDateGet() {
        return attestatDateGet;
    }

    /**
     * Sets the value of the attestatDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatDateGet(String value) {
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
     * Gets the value of the dataResolve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataResolve() {
        return dataResolve;
    }

    /**
     * Sets the value of the dataResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataResolve(String value) {
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

}
