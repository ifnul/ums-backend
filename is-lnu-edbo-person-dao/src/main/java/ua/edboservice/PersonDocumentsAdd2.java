
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
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZNOPin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttestatValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCheckForPaperCopy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentsAwardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsNotCheckAttestat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsForeinghEntrantDocumet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentValueType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuailificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocumentSourceTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idLanguage",
    "idPerson",
    "idPersonDocumentType",
    "idPersonEducation",
    "documentSeries",
    "documentNumbers",
    "documentDateGet",
    "documentIssued",
    "description",
    "znoPin",
    "attestatValue",
    "isCheckForPaperCopy",
    "idPersonDocumentsAwardType",
    "isNotCheckAttestat",
    "isForeinghEntrantDocumet",
    "idPersonDocumentValueType",
    "idCountry",
    "yearEnd",
    "specClasifierCode",
    "specClasifierName",
    "quailificationName",
    "idPersonDocumentSourceTypes"
})
@XmlRootElement(name = "PersonDocumentsAdd2")
public class PersonDocumentsAdd2 {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumbers")
    protected String documentNumbers;
    @XmlElement(name = "DocumentDateGet")
    protected String documentDateGet;
    @XmlElement(name = "DocumentIssued")
    protected String documentIssued;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ZNOPin")
    protected int znoPin;
    @XmlElement(name = "AttestatValue")
    protected String attestatValue;
    @XmlElement(name = "IsCheckForPaperCopy")
    protected int isCheckForPaperCopy;
    @XmlElement(name = "Id_PersonDocumentsAwardType")
    protected int idPersonDocumentsAwardType;
    @XmlElement(name = "IsNotCheckAttestat")
    protected int isNotCheckAttestat;
    @XmlElement(name = "IsForeinghEntrantDocumet")
    protected int isForeinghEntrantDocumet;
    @XmlElement(name = "Id_PersonDocumentValueType")
    protected int idPersonDocumentValueType;
    @XmlElement(name = "Id_Country")
    protected int idCountry;
    @XmlElement(name = "YearEnd")
    protected int yearEnd;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecClasifierName")
    protected String specClasifierName;
    @XmlElement(name = "QuailificationName")
    protected String quailificationName;
    @XmlElement(name = "Id_PersonDocumentSourceTypes")
    protected int idPersonDocumentSourceTypes;

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

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the idPersonDocumentType property.
     * 
     */
    public int getIdPersonDocumentType() {
        return idPersonDocumentType;
    }

    /**
     * Sets the value of the idPersonDocumentType property.
     * 
     */
    public void setIdPersonDocumentType(int value) {
        this.idPersonDocumentType = value;
    }

    /**
     * Gets the value of the idPersonEducation property.
     * 
     */
    public int getIdPersonEducation() {
        return idPersonEducation;
    }

    /**
     * Sets the value of the idPersonEducation property.
     * 
     */
    public void setIdPersonEducation(int value) {
        this.idPersonEducation = value;
    }

    /**
     * Gets the value of the documentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSeries() {
        return documentSeries;
    }

    /**
     * Sets the value of the documentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSeries(String value) {
        this.documentSeries = value;
    }

    /**
     * Gets the value of the documentNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumbers() {
        return documentNumbers;
    }

    /**
     * Sets the value of the documentNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumbers(String value) {
        this.documentNumbers = value;
    }

    /**
     * Gets the value of the documentDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDateGet() {
        return documentDateGet;
    }

    /**
     * Sets the value of the documentDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDateGet(String value) {
        this.documentDateGet = value;
    }

    /**
     * Gets the value of the documentIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssued() {
        return documentIssued;
    }

    /**
     * Sets the value of the documentIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssued(String value) {
        this.documentIssued = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the znoPin property.
     * 
     */
    public int getZNOPin() {
        return znoPin;
    }

    /**
     * Sets the value of the znoPin property.
     * 
     */
    public void setZNOPin(int value) {
        this.znoPin = value;
    }

    /**
     * Gets the value of the attestatValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestatValue() {
        return attestatValue;
    }

    /**
     * Sets the value of the attestatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatValue(String value) {
        this.attestatValue = value;
    }

    /**
     * Gets the value of the isCheckForPaperCopy property.
     * 
     */
    public int getIsCheckForPaperCopy() {
        return isCheckForPaperCopy;
    }

    /**
     * Sets the value of the isCheckForPaperCopy property.
     * 
     */
    public void setIsCheckForPaperCopy(int value) {
        this.isCheckForPaperCopy = value;
    }

    /**
     * Gets the value of the idPersonDocumentsAwardType property.
     * 
     */
    public int getIdPersonDocumentsAwardType() {
        return idPersonDocumentsAwardType;
    }

    /**
     * Sets the value of the idPersonDocumentsAwardType property.
     * 
     */
    public void setIdPersonDocumentsAwardType(int value) {
        this.idPersonDocumentsAwardType = value;
    }

    /**
     * Gets the value of the isNotCheckAttestat property.
     * 
     */
    public int getIsNotCheckAttestat() {
        return isNotCheckAttestat;
    }

    /**
     * Sets the value of the isNotCheckAttestat property.
     * 
     */
    public void setIsNotCheckAttestat(int value) {
        this.isNotCheckAttestat = value;
    }

    /**
     * Gets the value of the isForeinghEntrantDocumet property.
     * 
     */
    public int getIsForeinghEntrantDocumet() {
        return isForeinghEntrantDocumet;
    }

    /**
     * Sets the value of the isForeinghEntrantDocumet property.
     * 
     */
    public void setIsForeinghEntrantDocumet(int value) {
        this.isForeinghEntrantDocumet = value;
    }

    /**
     * Gets the value of the idPersonDocumentValueType property.
     * 
     */
    public int getIdPersonDocumentValueType() {
        return idPersonDocumentValueType;
    }

    /**
     * Sets the value of the idPersonDocumentValueType property.
     * 
     */
    public void setIdPersonDocumentValueType(int value) {
        this.idPersonDocumentValueType = value;
    }

    /**
     * Gets the value of the idCountry property.
     * 
     */
    public int getIdCountry() {
        return idCountry;
    }

    /**
     * Sets the value of the idCountry property.
     * 
     */
    public void setIdCountry(int value) {
        this.idCountry = value;
    }

    /**
     * Gets the value of the yearEnd property.
     * 
     */
    public int getYearEnd() {
        return yearEnd;
    }

    /**
     * Sets the value of the yearEnd property.
     * 
     */
    public void setYearEnd(int value) {
        this.yearEnd = value;
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
     * Gets the value of the specClasifierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierName() {
        return specClasifierName;
    }

    /**
     * Sets the value of the specClasifierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierName(String value) {
        this.specClasifierName = value;
    }

    /**
     * Gets the value of the quailificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuailificationName() {
        return quailificationName;
    }

    /**
     * Sets the value of the quailificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuailificationName(String value) {
        this.quailificationName = value;
    }

    /**
     * Gets the value of the idPersonDocumentSourceTypes property.
     * 
     */
    public int getIdPersonDocumentSourceTypes() {
        return idPersonDocumentSourceTypes;
    }

    /**
     * Sets the value of the idPersonDocumentSourceTypes property.
     * 
     */
    public void setIdPersonDocumentSourceTypes(int value) {
        this.idPersonDocumentSourceTypes = value;
    }

}
