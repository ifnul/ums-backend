
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dSupportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSupportRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_SupportRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SupportRequestType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportRequestDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SupportRequestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportRequestTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIOOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FIOVikonavca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_ApplicationModuleAction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterfaceModuleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportRequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SupportRequestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSupportRequest", propOrder = {
    "idSupportRequest",
    "idSupportRequestType",
    "idUser",
    "universityKode",
    "supportRequestDateLastChange",
    "supportRequestDescription",
    "supportRequestTypeName",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "fioOperator",
    "regulationDocumentVerificationHistoryDateLastChange",
    "fioVikonavca",
    "regulationDocumentVerificationHistoryDescription",
    "idApplicationModuleAction",
    "interfaceModuleName",
    "supportRequestDate",
    "supportRequestNumber"
})
public class DSupportRequest {

    @XmlElement(name = "Id_SupportRequest")
    protected int idSupportRequest;
    @XmlElement(name = "Id_SupportRequestType")
    protected int idSupportRequestType;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "SupportRequestDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar supportRequestDateLastChange;
    @XmlElement(name = "SupportRequestDescription")
    protected String supportRequestDescription;
    @XmlElement(name = "SupportRequestTypeName")
    protected String supportRequestTypeName;
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
    @XmlElement(name = "FIOOperator")
    protected String fioOperator;
    @XmlElement(name = "RegulationDocumentVerificationHistoryDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentVerificationHistoryDateLastChange;
    @XmlElement(name = "FIOVikonavca")
    protected String fioVikonavca;
    @XmlElement(name = "RegulationDocumentVerificationHistoryDescription")
    protected String regulationDocumentVerificationHistoryDescription;
    @XmlElement(name = "id_ApplicationModuleAction")
    protected int idApplicationModuleAction;
    @XmlElement(name = "InterfaceModuleName")
    protected String interfaceModuleName;
    @XmlElement(name = "SupportRequestDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar supportRequestDate;
    @XmlElement(name = "SupportRequestNumber")
    protected String supportRequestNumber;

    /**
     * Gets the value of the idSupportRequest property.
     * 
     */
    public int getIdSupportRequest() {
        return idSupportRequest;
    }

    /**
     * Sets the value of the idSupportRequest property.
     * 
     */
    public void setIdSupportRequest(int value) {
        this.idSupportRequest = value;
    }

    /**
     * Gets the value of the idSupportRequestType property.
     * 
     */
    public int getIdSupportRequestType() {
        return idSupportRequestType;
    }

    /**
     * Sets the value of the idSupportRequestType property.
     * 
     */
    public void setIdSupportRequestType(int value) {
        this.idSupportRequestType = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
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
     * Gets the value of the supportRequestDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSupportRequestDateLastChange() {
        return supportRequestDateLastChange;
    }

    /**
     * Sets the value of the supportRequestDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSupportRequestDateLastChange(XMLGregorianCalendar value) {
        this.supportRequestDateLastChange = value;
    }

    /**
     * Gets the value of the supportRequestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportRequestDescription() {
        return supportRequestDescription;
    }

    /**
     * Sets the value of the supportRequestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportRequestDescription(String value) {
        this.supportRequestDescription = value;
    }

    /**
     * Gets the value of the supportRequestTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportRequestTypeName() {
        return supportRequestTypeName;
    }

    /**
     * Sets the value of the supportRequestTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportRequestTypeName(String value) {
        this.supportRequestTypeName = value;
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
     * Gets the value of the fioOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOOperator() {
        return fioOperator;
    }

    /**
     * Sets the value of the fioOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOOperator(String value) {
        this.fioOperator = value;
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

    /**
     * Gets the value of the idApplicationModuleAction property.
     * 
     */
    public int getIdApplicationModuleAction() {
        return idApplicationModuleAction;
    }

    /**
     * Sets the value of the idApplicationModuleAction property.
     * 
     */
    public void setIdApplicationModuleAction(int value) {
        this.idApplicationModuleAction = value;
    }

    /**
     * Gets the value of the interfaceModuleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceModuleName() {
        return interfaceModuleName;
    }

    /**
     * Sets the value of the interfaceModuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceModuleName(String value) {
        this.interfaceModuleName = value;
    }

    /**
     * Gets the value of the supportRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSupportRequestDate() {
        return supportRequestDate;
    }

    /**
     * Sets the value of the supportRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSupportRequestDate(XMLGregorianCalendar value) {
        this.supportRequestDate = value;
    }

    /**
     * Gets the value of the supportRequestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportRequestNumber() {
        return supportRequestNumber;
    }

    /**
     * Sets the value of the supportRequestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportRequestNumber(String value) {
        this.supportRequestNumber = value;
    }

}
