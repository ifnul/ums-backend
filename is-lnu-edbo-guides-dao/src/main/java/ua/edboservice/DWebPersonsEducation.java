
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dWebPersonsEducation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebPersonsEducation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebPersonsEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EduDocTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EduDocTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EduDocSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EduDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EduDocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EduEOID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EduEOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EduInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearEndEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentValueType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentSourceTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentsAwardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentsAwardTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentSourceTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentValueTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebPersonsEducation", propOrder = {
    "idWebPersonsEducation",
    "idWebPersons",
    "eduDocTypeID",
    "eduDocTypeName",
    "eduDocSeries",
    "eduDocNumber",
    "eduDocDate",
    "eduEOID",
    "eduEOName",
    "eduInfo",
    "yearEndEducation",
    "idPersonDocumentValueType",
    "value",
    "specClasifierCode",
    "specName",
    "qualificationName",
    "countryId",
    "idPersonDocumentSourceTypes",
    "idPersonDocumentsAwardType",
    "personDocumentsAwardTypeName",
    "personDocumentSourceTypesName",
    "countryName",
    "personDocumentValueTypeName"
})
public class DWebPersonsEducation {

    @XmlElement(name = "Id_WebPersonsEducation")
    protected int idWebPersonsEducation;
    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "EduDocTypeID")
    protected int eduDocTypeID;
    @XmlElement(name = "EduDocTypeName")
    protected String eduDocTypeName;
    @XmlElement(name = "EduDocSeries")
    protected String eduDocSeries;
    @XmlElement(name = "EduDocNumber")
    protected String eduDocNumber;
    @XmlElement(name = "EduDocDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eduDocDate;
    @XmlElement(name = "EduEOID")
    protected String eduEOID;
    @XmlElement(name = "EduEOName")
    protected String eduEOName;
    @XmlElement(name = "EduInfo")
    protected String eduInfo;
    @XmlElement(name = "YearEndEducation")
    protected int yearEndEducation;
    @XmlElement(name = "Id_PersonDocumentValueType")
    protected int idPersonDocumentValueType;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecName")
    protected String specName;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "CountryId")
    protected int countryId;
    @XmlElement(name = "Id_PersonDocumentSourceTypes")
    protected int idPersonDocumentSourceTypes;
    @XmlElement(name = "Id_PersonDocumentsAwardType")
    protected int idPersonDocumentsAwardType;
    @XmlElement(name = "PersonDocumentsAwardTypeName")
    protected String personDocumentsAwardTypeName;
    @XmlElement(name = "PersonDocumentSourceTypesName")
    protected String personDocumentSourceTypesName;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "PersonDocumentValueTypeName")
    protected String personDocumentValueTypeName;

    /**
     * Gets the value of the idWebPersonsEducation property.
     * 
     */
    public int getIdWebPersonsEducation() {
        return idWebPersonsEducation;
    }

    /**
     * Sets the value of the idWebPersonsEducation property.
     * 
     */
    public void setIdWebPersonsEducation(int value) {
        this.idWebPersonsEducation = value;
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
     * Gets the value of the eduDocTypeID property.
     * 
     */
    public int getEduDocTypeID() {
        return eduDocTypeID;
    }

    /**
     * Sets the value of the eduDocTypeID property.
     * 
     */
    public void setEduDocTypeID(int value) {
        this.eduDocTypeID = value;
    }

    /**
     * Gets the value of the eduDocTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduDocTypeName() {
        return eduDocTypeName;
    }

    /**
     * Sets the value of the eduDocTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduDocTypeName(String value) {
        this.eduDocTypeName = value;
    }

    /**
     * Gets the value of the eduDocSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduDocSeries() {
        return eduDocSeries;
    }

    /**
     * Sets the value of the eduDocSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduDocSeries(String value) {
        this.eduDocSeries = value;
    }

    /**
     * Gets the value of the eduDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduDocNumber() {
        return eduDocNumber;
    }

    /**
     * Sets the value of the eduDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduDocNumber(String value) {
        this.eduDocNumber = value;
    }

    /**
     * Gets the value of the eduDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEduDocDate() {
        return eduDocDate;
    }

    /**
     * Sets the value of the eduDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEduDocDate(XMLGregorianCalendar value) {
        this.eduDocDate = value;
    }

    /**
     * Gets the value of the eduEOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduEOID() {
        return eduEOID;
    }

    /**
     * Sets the value of the eduEOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduEOID(String value) {
        this.eduEOID = value;
    }

    /**
     * Gets the value of the eduEOName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduEOName() {
        return eduEOName;
    }

    /**
     * Sets the value of the eduEOName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduEOName(String value) {
        this.eduEOName = value;
    }

    /**
     * Gets the value of the eduInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduInfo() {
        return eduInfo;
    }

    /**
     * Sets the value of the eduInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduInfo(String value) {
        this.eduInfo = value;
    }

    /**
     * Gets the value of the yearEndEducation property.
     * 
     */
    public int getYearEndEducation() {
        return yearEndEducation;
    }

    /**
     * Sets the value of the yearEndEducation property.
     * 
     */
    public void setYearEndEducation(int value) {
        this.yearEndEducation = value;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
     * Gets the value of the qualificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationName() {
        return qualificationName;
    }

    /**
     * Sets the value of the qualificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationName(String value) {
        this.qualificationName = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(int value) {
        this.countryId = value;
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
     * Gets the value of the personDocumentsAwardTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentsAwardTypeName() {
        return personDocumentsAwardTypeName;
    }

    /**
     * Sets the value of the personDocumentsAwardTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentsAwardTypeName(String value) {
        this.personDocumentsAwardTypeName = value;
    }

    /**
     * Gets the value of the personDocumentSourceTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentSourceTypesName() {
        return personDocumentSourceTypesName;
    }

    /**
     * Sets the value of the personDocumentSourceTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentSourceTypesName(String value) {
        this.personDocumentSourceTypesName = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the personDocumentValueTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentValueTypeName() {
        return personDocumentValueTypeName;
    }

    /**
     * Sets the value of the personDocumentValueTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentValueTypeName(String value) {
        this.personDocumentValueTypeName = value;
    }

}
