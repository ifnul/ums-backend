
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dDeliveryOfDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDeliveryOfDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_DeliveryOfDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DeliveryOfDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DeliveryOfDocumentsImportType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryOfDocumentsDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DeliveryOfDocumentsDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DeliveryOfDocumentsDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryOfDocumentsImportTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryOfDocumentStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorDataCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsTemporary" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentSourceTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentSourceTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_DeliveryOfDocumentsDocumentTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryOfDocumentsDocumentTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDeliveryOfDocuments", propOrder = {
    "idDeliveryOfDocuments",
    "idPersonDocumentType",
    "idOrderOfDocument",
    "idAcademicYear",
    "idDeliveryOfDocumentStatus",
    "idDeliveryOfDocumentsImportType",
    "idPersonEducationForm",
    "idQualification",
    "deliveryOfDocumentsDateBegin",
    "deliveryOfDocumentsDateEnd",
    "deliveryOfDocumentsDateLastChange",
    "universityKode",
    "universityFacultetKode",
    "idCourse",
    "deliveryOfDocumentsImportTypeName",
    "deliveryOfDocumentStatusName",
    "personDocumentTypeName",
    "personEducationFormName",
    "qualificationName",
    "universityFacultetFullName",
    "hasError",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "dataCount",
    "dateCreate",
    "academicYearName",
    "errorDataCount",
    "isTemporary",
    "idPersonDocumentSourceTypes",
    "personDocumentSourceTypesName",
    "idDeliveryOfDocumentsDocumentTypes",
    "deliveryOfDocumentsDocumentTypesName",
    "idUniversity",
    "universityFullName",
    "region"
})
public class DDeliveryOfDocuments {

    @XmlElement(name = "Id_DeliveryOfDocuments")
    protected int idDeliveryOfDocuments;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "Id_OrderOfDocument")
    protected int idOrderOfDocument;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_DeliveryOfDocumentStatus")
    protected int idDeliveryOfDocumentStatus;
    @XmlElement(name = "Id_DeliveryOfDocumentsImportType")
    protected int idDeliveryOfDocumentsImportType;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "DeliveryOfDocumentsDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryOfDocumentsDateBegin;
    @XmlElement(name = "DeliveryOfDocumentsDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryOfDocumentsDateEnd;
    @XmlElement(name = "DeliveryOfDocumentsDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryOfDocumentsDateLastChange;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "DeliveryOfDocumentsImportTypeName")
    protected String deliveryOfDocumentsImportTypeName;
    @XmlElement(name = "DeliveryOfDocumentStatusName")
    protected String deliveryOfDocumentStatusName;
    @XmlElement(name = "PersonDocumentTypeName")
    protected String personDocumentTypeName;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "HasError")
    protected int hasError;
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
    @XmlElement(name = "DataCount")
    protected int dataCount;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "ErrorDataCount")
    protected int errorDataCount;
    @XmlElement(name = "IsTemporary")
    protected int isTemporary;
    @XmlElement(name = "Id_PersonDocumentSourceTypes")
    protected int idPersonDocumentSourceTypes;
    @XmlElement(name = "PersonDocumentSourceTypesName")
    protected String personDocumentSourceTypesName;
    @XmlElement(name = "Id_DeliveryOfDocumentsDocumentTypes")
    protected int idDeliveryOfDocumentsDocumentTypes;
    @XmlElement(name = "DeliveryOfDocumentsDocumentTypesName")
    protected String deliveryOfDocumentsDocumentTypesName;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Region")
    protected String region;

    /**
     * Gets the value of the idDeliveryOfDocuments property.
     * 
     */
    public int getIdDeliveryOfDocuments() {
        return idDeliveryOfDocuments;
    }

    /**
     * Sets the value of the idDeliveryOfDocuments property.
     * 
     */
    public void setIdDeliveryOfDocuments(int value) {
        this.idDeliveryOfDocuments = value;
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
     * Gets the value of the idOrderOfDocument property.
     * 
     */
    public int getIdOrderOfDocument() {
        return idOrderOfDocument;
    }

    /**
     * Sets the value of the idOrderOfDocument property.
     * 
     */
    public void setIdOrderOfDocument(int value) {
        this.idOrderOfDocument = value;
    }

    /**
     * Gets the value of the idAcademicYear property.
     * 
     */
    public int getIdAcademicYear() {
        return idAcademicYear;
    }

    /**
     * Sets the value of the idAcademicYear property.
     * 
     */
    public void setIdAcademicYear(int value) {
        this.idAcademicYear = value;
    }

    /**
     * Gets the value of the idDeliveryOfDocumentStatus property.
     * 
     */
    public int getIdDeliveryOfDocumentStatus() {
        return idDeliveryOfDocumentStatus;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentStatus property.
     * 
     */
    public void setIdDeliveryOfDocumentStatus(int value) {
        this.idDeliveryOfDocumentStatus = value;
    }

    /**
     * Gets the value of the idDeliveryOfDocumentsImportType property.
     * 
     */
    public int getIdDeliveryOfDocumentsImportType() {
        return idDeliveryOfDocumentsImportType;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsImportType property.
     * 
     */
    public void setIdDeliveryOfDocumentsImportType(int value) {
        this.idDeliveryOfDocumentsImportType = value;
    }

    /**
     * Gets the value of the idPersonEducationForm property.
     * 
     */
    public int getIdPersonEducationForm() {
        return idPersonEducationForm;
    }

    /**
     * Sets the value of the idPersonEducationForm property.
     * 
     */
    public void setIdPersonEducationForm(int value) {
        this.idPersonEducationForm = value;
    }

    /**
     * Gets the value of the idQualification property.
     * 
     */
    public int getIdQualification() {
        return idQualification;
    }

    /**
     * Sets the value of the idQualification property.
     * 
     */
    public void setIdQualification(int value) {
        this.idQualification = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryOfDocumentsDateBegin() {
        return deliveryOfDocumentsDateBegin;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryOfDocumentsDateBegin(XMLGregorianCalendar value) {
        this.deliveryOfDocumentsDateBegin = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryOfDocumentsDateEnd() {
        return deliveryOfDocumentsDateEnd;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryOfDocumentsDateEnd(XMLGregorianCalendar value) {
        this.deliveryOfDocumentsDateEnd = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryOfDocumentsDateLastChange() {
        return deliveryOfDocumentsDateLastChange;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryOfDocumentsDateLastChange(XMLGregorianCalendar value) {
        this.deliveryOfDocumentsDateLastChange = value;
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
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
    }

    /**
     * Gets the value of the idCourse property.
     * 
     */
    public int getIdCourse() {
        return idCourse;
    }

    /**
     * Sets the value of the idCourse property.
     * 
     */
    public void setIdCourse(int value) {
        this.idCourse = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsImportTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOfDocumentsImportTypeName() {
        return deliveryOfDocumentsImportTypeName;
    }

    /**
     * Sets the value of the deliveryOfDocumentsImportTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOfDocumentsImportTypeName(String value) {
        this.deliveryOfDocumentsImportTypeName = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOfDocumentStatusName() {
        return deliveryOfDocumentStatusName;
    }

    /**
     * Sets the value of the deliveryOfDocumentStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOfDocumentStatusName(String value) {
        this.deliveryOfDocumentStatusName = value;
    }

    /**
     * Gets the value of the personDocumentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentTypeName() {
        return personDocumentTypeName;
    }

    /**
     * Sets the value of the personDocumentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentTypeName(String value) {
        this.personDocumentTypeName = value;
    }

    /**
     * Gets the value of the personEducationFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationFormName() {
        return personEducationFormName;
    }

    /**
     * Sets the value of the personEducationFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationFormName(String value) {
        this.personEducationFormName = value;
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
     * Gets the value of the universityFacultetFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullName() {
        return universityFacultetFullName;
    }

    /**
     * Sets the value of the universityFacultetFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullName(String value) {
        this.universityFacultetFullName = value;
    }

    /**
     * Gets the value of the hasError property.
     * 
     */
    public int getHasError() {
        return hasError;
    }

    /**
     * Sets the value of the hasError property.
     * 
     */
    public void setHasError(int value) {
        this.hasError = value;
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
     * Gets the value of the dataCount property.
     * 
     */
    public int getDataCount() {
        return dataCount;
    }

    /**
     * Sets the value of the dataCount property.
     * 
     */
    public void setDataCount(int value) {
        this.dataCount = value;
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
     * Gets the value of the academicYearName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearName() {
        return academicYearName;
    }

    /**
     * Sets the value of the academicYearName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearName(String value) {
        this.academicYearName = value;
    }

    /**
     * Gets the value of the errorDataCount property.
     * 
     */
    public int getErrorDataCount() {
        return errorDataCount;
    }

    /**
     * Sets the value of the errorDataCount property.
     * 
     */
    public void setErrorDataCount(int value) {
        this.errorDataCount = value;
    }

    /**
     * Gets the value of the isTemporary property.
     * 
     */
    public int getIsTemporary() {
        return isTemporary;
    }

    /**
     * Sets the value of the isTemporary property.
     * 
     */
    public void setIsTemporary(int value) {
        this.isTemporary = value;
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
     * Gets the value of the idDeliveryOfDocumentsDocumentTypes property.
     * 
     */
    public int getIdDeliveryOfDocumentsDocumentTypes() {
        return idDeliveryOfDocumentsDocumentTypes;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsDocumentTypes property.
     * 
     */
    public void setIdDeliveryOfDocumentsDocumentTypes(int value) {
        this.idDeliveryOfDocumentsDocumentTypes = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsDocumentTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOfDocumentsDocumentTypesName() {
        return deliveryOfDocumentsDocumentTypesName;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDocumentTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOfDocumentsDocumentTypesName(String value) {
        this.deliveryOfDocumentsDocumentTypesName = value;
    }

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
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
