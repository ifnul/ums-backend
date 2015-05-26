
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dReportEmploymentsOperators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReportEmploymentsOperators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_ReportEmployment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReportEmploymentDateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReportEmploymentDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MonCheck" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FIOVikonavca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReportEmploymentsOperators", propOrder = {
    "idUniversity",
    "universityFullName",
    "idReportEmployment",
    "universityKode",
    "year",
    "reportEmploymentDateCreate",
    "reportEmploymentDateLastChange",
    "monCheck",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "regulationDocumentVerificationHistoryDateLastChange",
    "fioVikonavca",
    "regulationDocumentVerificationHistoryDescription"
})
public class DReportEmploymentsOperators {

    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Id_ReportEmployment")
    protected int idReportEmployment;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "ReportEmploymentDateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportEmploymentDateCreate;
    @XmlElement(name = "ReportEmploymentDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportEmploymentDateLastChange;
    @XmlElement(name = "MonCheck")
    protected int monCheck;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "IsVerified")
    protected int isVerified;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistoryType")
    protected int idRegulationDocumentVerificationHistoryType;
    @XmlElement(name = "RegulationDocumentVerificationHistoryTypeName")
    protected String regulationDocumentVerificationHistoryTypeName;
    @XmlElement(name = "IsExistFile")
    protected int isExistFile;
    @XmlElement(name = "RegulationDocumentVerificationHistoryDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentVerificationHistoryDateLastChange;
    @XmlElement(name = "FIOVikonavca")
    protected String fioVikonavca;
    @XmlElement(name = "RegulationDocumentVerificationHistoryDescription")
    protected String regulationDocumentVerificationHistoryDescription;

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the idReportEmployment property.
     * 
     */
    public int getIdReportEmployment() {
        return idReportEmployment;
    }

    /**
     * Sets the value of the idReportEmployment property.
     * 
     */
    public void setIdReportEmployment(int value) {
        this.idReportEmployment = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the reportEmploymentDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportEmploymentDateCreate() {
        return reportEmploymentDateCreate;
    }

    /**
     * Sets the value of the reportEmploymentDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportEmploymentDateCreate(XMLGregorianCalendar value) {
        this.reportEmploymentDateCreate = value;
    }

    /**
     * Gets the value of the reportEmploymentDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportEmploymentDateLastChange() {
        return reportEmploymentDateLastChange;
    }

    /**
     * Sets the value of the reportEmploymentDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportEmploymentDateLastChange(XMLGregorianCalendar value) {
        this.reportEmploymentDateLastChange = value;
    }

    /**
     * Gets the value of the monCheck property.
     * 
     */
    public int getMonCheck() {
        return monCheck;
    }

    /**
     * Sets the value of the monCheck property.
     * 
     */
    public void setMonCheck(int value) {
        this.monCheck = value;
    }

    /**
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the isVerified property.
     * 
     */
    public int getIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     */
    public void setIsVerified(int value) {
        this.isVerified = value;
    }

    /**
     * Gets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public int getIdRegulationDocumentVerificationHistoryType() {
        return idRegulationDocumentVerificationHistoryType;
    }

    /**
     * Sets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public void setIdRegulationDocumentVerificationHistoryType(int value) {
        this.idRegulationDocumentVerificationHistoryType = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryTypeName() {
        return regulationDocumentVerificationHistoryTypeName;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryTypeName(String value) {
        this.regulationDocumentVerificationHistoryTypeName = value;
    }

    /**
     * Gets the value of the isExistFile property.
     * 
     */
    public int getIsExistFile() {
        return isExistFile;
    }

    /**
     * Sets the value of the isExistFile property.
     * 
     */
    public void setIsExistFile(int value) {
        this.isExistFile = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentVerificationHistoryDateLastChange() {
        return regulationDocumentVerificationHistoryDateLastChange;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentVerificationHistoryDateLastChange(XMLGregorianCalendar value) {
        this.regulationDocumentVerificationHistoryDateLastChange = value;
    }

    /**
     * Gets the value of the fioVikonavca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOVikonavca() {
        return fioVikonavca;
    }

    /**
     * Sets the value of the fioVikonavca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOVikonavca(String value) {
        this.fioVikonavca = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryDescription() {
        return regulationDocumentVerificationHistoryDescription;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryDescription(String value) {
        this.regulationDocumentVerificationHistoryDescription = value;
    }

}
