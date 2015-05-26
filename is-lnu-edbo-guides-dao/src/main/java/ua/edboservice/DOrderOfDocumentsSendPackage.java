
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrderOfDocumentsSendPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrderOfDocumentsSendPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrderOfDocumentsSendPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentsSendPackagDateCteate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataCout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankMFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentsBlankTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentChipSeriesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentsPaymentSystemTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Bank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DocumentsBlnakTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DocumentChipSeriesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DocumentsPaymentSystemType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentTypeSp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationFormSp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumentsSendPackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrderOfDocumentsSendPackageStatuse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrderOfDocumentsSendPackageStatuseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentsSendPackageStatuseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKodeNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrderOfDocumentsSendPackage", propOrder = {
    "idOrderOfDocumentsSendPackage",
    "idOrderOfDocument",
    "orderOfDocumentsSendPackagDateCteate",
    "idUser",
    "dataCout",
    "bankName",
    "bankMFO",
    "documentsBlankTypeName",
    "documentChipSeriesTypeName",
    "documentsPaymentSystemTypeName",
    "idBank",
    "idDocumentsBlnakTypes",
    "idDocumentChipSeriesType",
    "idDocumentsPaymentSystemType",
    "idPersonDocumentTypeSp",
    "idPersonEducationFormSp",
    "universityFacultetKode",
    "universityFacultetKodeName",
    "idUniversityGroup",
    "universityGroupName",
    "orderOfDocumentsSendPackageDescription",
    "idOrderOfDocumentsSendPackageStatuse",
    "universityKode",
    "fio",
    "idOrderOfDocumentsSendPackageStatuseType",
    "orderOfDocumentsSendPackageStatuseTypeName",
    "universityFullName",
    "universityFullNameEn",
    "universityFacultetKodeNameEn",
    "changeCount"
})
public class DOrderOfDocumentsSendPackage {

    @XmlElement(name = "Id_OrderOfDocumentsSendPackage")
    protected int idOrderOfDocumentsSendPackage;
    @XmlElement(name = "Id_OrderOfDocument")
    protected int idOrderOfDocument;
    @XmlElement(name = "OrderOfDocumentsSendPackagDateCteate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfDocumentsSendPackagDateCteate;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "DataCout")
    protected int dataCout;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "BankMFO")
    protected String bankMFO;
    @XmlElement(name = "DocumentsBlankTypeName")
    protected String documentsBlankTypeName;
    @XmlElement(name = "DocumentChipSeriesTypeName")
    protected String documentChipSeriesTypeName;
    @XmlElement(name = "DocumentsPaymentSystemTypeName")
    protected String documentsPaymentSystemTypeName;
    @XmlElement(name = "Id_Bank")
    protected int idBank;
    @XmlElement(name = "Id_DocumentsBlnakTypes")
    protected int idDocumentsBlnakTypes;
    @XmlElement(name = "Id_DocumentChipSeriesType")
    protected int idDocumentChipSeriesType;
    @XmlElement(name = "Id_DocumentsPaymentSystemType")
    protected int idDocumentsPaymentSystemType;
    @XmlElement(name = "Id_PersonDocumentTypeSp")
    protected int idPersonDocumentTypeSp;
    @XmlElement(name = "Id_PersonEducationFormSp")
    protected int idPersonEducationFormSp;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetKodeName")
    protected String universityFacultetKodeName;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "UniversityGroupName")
    protected String universityGroupName;
    @XmlElement(name = "OrderOfDocumentsSendPackageDescription")
    protected String orderOfDocumentsSendPackageDescription;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackageStatuse")
    protected int idOrderOfDocumentsSendPackageStatuse;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackageStatuseType")
    protected int idOrderOfDocumentsSendPackageStatuseType;
    @XmlElement(name = "OrderOfDocumentsSendPackageStatuseTypeName")
    protected String orderOfDocumentsSendPackageStatuseTypeName;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityFullNameEn")
    protected String universityFullNameEn;
    @XmlElement(name = "UniversityFacultetKodeNameEn")
    protected String universityFacultetKodeNameEn;
    @XmlElement(name = "ChangeCount")
    protected int changeCount;

    /**
     * Gets the value of the idOrderOfDocumentsSendPackage property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackage() {
        return idOrderOfDocumentsSendPackage;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackage property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackage(int value) {
        this.idOrderOfDocumentsSendPackage = value;
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
     * Gets the value of the orderOfDocumentsSendPackagDateCteate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfDocumentsSendPackagDateCteate() {
        return orderOfDocumentsSendPackagDateCteate;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackagDateCteate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfDocumentsSendPackagDateCteate(XMLGregorianCalendar value) {
        this.orderOfDocumentsSendPackagDateCteate = value;
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
     * Gets the value of the dataCout property.
     * 
     */
    public int getDataCout() {
        return dataCout;
    }

    /**
     * Sets the value of the dataCout property.
     * 
     */
    public void setDataCout(int value) {
        this.dataCout = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankMFO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankMFO() {
        return bankMFO;
    }

    /**
     * Sets the value of the bankMFO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankMFO(String value) {
        this.bankMFO = value;
    }

    /**
     * Gets the value of the documentsBlankTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsBlankTypeName() {
        return documentsBlankTypeName;
    }

    /**
     * Sets the value of the documentsBlankTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsBlankTypeName(String value) {
        this.documentsBlankTypeName = value;
    }

    /**
     * Gets the value of the documentChipSeriesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentChipSeriesTypeName() {
        return documentChipSeriesTypeName;
    }

    /**
     * Sets the value of the documentChipSeriesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentChipSeriesTypeName(String value) {
        this.documentChipSeriesTypeName = value;
    }

    /**
     * Gets the value of the documentsPaymentSystemTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsPaymentSystemTypeName() {
        return documentsPaymentSystemTypeName;
    }

    /**
     * Sets the value of the documentsPaymentSystemTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsPaymentSystemTypeName(String value) {
        this.documentsPaymentSystemTypeName = value;
    }

    /**
     * Gets the value of the idBank property.
     * 
     */
    public int getIdBank() {
        return idBank;
    }

    /**
     * Sets the value of the idBank property.
     * 
     */
    public void setIdBank(int value) {
        this.idBank = value;
    }

    /**
     * Gets the value of the idDocumentsBlnakTypes property.
     * 
     */
    public int getIdDocumentsBlnakTypes() {
        return idDocumentsBlnakTypes;
    }

    /**
     * Sets the value of the idDocumentsBlnakTypes property.
     * 
     */
    public void setIdDocumentsBlnakTypes(int value) {
        this.idDocumentsBlnakTypes = value;
    }

    /**
     * Gets the value of the idDocumentChipSeriesType property.
     * 
     */
    public int getIdDocumentChipSeriesType() {
        return idDocumentChipSeriesType;
    }

    /**
     * Sets the value of the idDocumentChipSeriesType property.
     * 
     */
    public void setIdDocumentChipSeriesType(int value) {
        this.idDocumentChipSeriesType = value;
    }

    /**
     * Gets the value of the idDocumentsPaymentSystemType property.
     * 
     */
    public int getIdDocumentsPaymentSystemType() {
        return idDocumentsPaymentSystemType;
    }

    /**
     * Sets the value of the idDocumentsPaymentSystemType property.
     * 
     */
    public void setIdDocumentsPaymentSystemType(int value) {
        this.idDocumentsPaymentSystemType = value;
    }

    /**
     * Gets the value of the idPersonDocumentTypeSp property.
     * 
     */
    public int getIdPersonDocumentTypeSp() {
        return idPersonDocumentTypeSp;
    }

    /**
     * Sets the value of the idPersonDocumentTypeSp property.
     * 
     */
    public void setIdPersonDocumentTypeSp(int value) {
        this.idPersonDocumentTypeSp = value;
    }

    /**
     * Gets the value of the idPersonEducationFormSp property.
     * 
     */
    public int getIdPersonEducationFormSp() {
        return idPersonEducationFormSp;
    }

    /**
     * Sets the value of the idPersonEducationFormSp property.
     * 
     */
    public void setIdPersonEducationFormSp(int value) {
        this.idPersonEducationFormSp = value;
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
     * Gets the value of the universityFacultetKodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKodeName() {
        return universityFacultetKodeName;
    }

    /**
     * Sets the value of the universityFacultetKodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKodeName(String value) {
        this.universityFacultetKodeName = value;
    }

    /**
     * Gets the value of the idUniversityGroup property.
     * 
     */
    public int getIdUniversityGroup() {
        return idUniversityGroup;
    }

    /**
     * Sets the value of the idUniversityGroup property.
     * 
     */
    public void setIdUniversityGroup(int value) {
        this.idUniversityGroup = value;
    }

    /**
     * Gets the value of the universityGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupName() {
        return universityGroupName;
    }

    /**
     * Sets the value of the universityGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupName(String value) {
        this.universityGroupName = value;
    }

    /**
     * Gets the value of the orderOfDocumentsSendPackageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentsSendPackageDescription() {
        return orderOfDocumentsSendPackageDescription;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentsSendPackageDescription(String value) {
        this.orderOfDocumentsSendPackageDescription = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentsSendPackageStatuse property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackageStatuse() {
        return idOrderOfDocumentsSendPackageStatuse;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackageStatuse property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackageStatuse(int value) {
        this.idOrderOfDocumentsSendPackageStatuse = value;
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
     * Gets the value of the idOrderOfDocumentsSendPackageStatuseType property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackageStatuseType() {
        return idOrderOfDocumentsSendPackageStatuseType;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackageStatuseType property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackageStatuseType(int value) {
        this.idOrderOfDocumentsSendPackageStatuseType = value;
    }

    /**
     * Gets the value of the orderOfDocumentsSendPackageStatuseTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentsSendPackageStatuseTypeName() {
        return orderOfDocumentsSendPackageStatuseTypeName;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackageStatuseTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentsSendPackageStatuseTypeName(String value) {
        this.orderOfDocumentsSendPackageStatuseTypeName = value;
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
     * Gets the value of the universityFullNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameEn() {
        return universityFullNameEn;
    }

    /**
     * Sets the value of the universityFullNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameEn(String value) {
        this.universityFullNameEn = value;
    }

    /**
     * Gets the value of the universityFacultetKodeNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKodeNameEn() {
        return universityFacultetKodeNameEn;
    }

    /**
     * Sets the value of the universityFacultetKodeNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKodeNameEn(String value) {
        this.universityFacultetKodeNameEn = value;
    }

    /**
     * Gets the value of the changeCount property.
     * 
     */
    public int getChangeCount() {
        return changeCount;
    }

    /**
     * Sets the value of the changeCount property.
     * 
     */
    public void setChangeCount(int value) {
        this.changeCount = value;
    }

}
