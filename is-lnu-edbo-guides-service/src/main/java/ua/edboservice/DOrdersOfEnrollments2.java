
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrdersOfEnrollments2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrdersOfEnrollments2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrderOfEnrollment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfEnrollmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfEnrollmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderOfEnrollmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfEnrollmentDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsNumberProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsDateRishenya" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrdersOfEnrollmentsDatePriyoma" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrdersOfEnrollmentsStudentsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsKorse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerify" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsNeedVerify" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DodatPageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsConfirmed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OperatorFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamePersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BudjetYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrdersOfEnrollments2", propOrder = {
    "idOrderOfEnrollment",
    "idPersonRequestSeasons",
    "orderOfEnrollmentNumber",
    "orderOfEnrollmentDate",
    "orderOfEnrollmentDescription",
    "orderOfEnrollmentDateLastChange",
    "universityKode",
    "universityFacultetKode",
    "idPersonEducationForm",
    "idQualification",
    "personEducationFormName",
    "qualificationName",
    "universityFacultetFullName",
    "idPaymentType",
    "ordersOfEnrollmentsNumberProtocol",
    "ordersOfEnrollmentsDateRishenya",
    "ordersOfEnrollmentsDatePriyoma",
    "ordersOfEnrollmentsStudentsType",
    "ordersOfEnrollmentsKorse",
    "isVerify",
    "isNeedVerify",
    "dodatPageCount",
    "isConfirmed",
    "idAcademicYear",
    "academicYearName",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "regulationDocumentVerificationHistoryDateLastChange",
    "operatorFIO",
    "namePersonRequestSeasons",
    "budjetYear"
})
public class DOrdersOfEnrollments2 {

    @XmlElement(name = "Id_OrderOfEnrollment")
    protected int idOrderOfEnrollment;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "OrderOfEnrollmentNumber")
    protected String orderOfEnrollmentNumber;
    @XmlElement(name = "OrderOfEnrollmentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfEnrollmentDate;
    @XmlElement(name = "OrderOfEnrollmentDescription")
    protected String orderOfEnrollmentDescription;
    @XmlElement(name = "OrderOfEnrollmentDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfEnrollmentDateLastChange;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "Id_PaymentType")
    protected int idPaymentType;
    @XmlElement(name = "OrdersOfEnrollmentsNumberProtocol")
    protected String ordersOfEnrollmentsNumberProtocol;
    @XmlElement(name = "OrdersOfEnrollmentsDateRishenya", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordersOfEnrollmentsDateRishenya;
    @XmlElement(name = "OrdersOfEnrollmentsDatePriyoma", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordersOfEnrollmentsDatePriyoma;
    @XmlElement(name = "OrdersOfEnrollmentsStudentsType")
    protected int ordersOfEnrollmentsStudentsType;
    @XmlElement(name = "OrdersOfEnrollmentsKorse")
    protected int ordersOfEnrollmentsKorse;
    @XmlElement(name = "IsVerify")
    protected int isVerify;
    @XmlElement(name = "IsNeedVerify")
    protected int isNeedVerify;
    @XmlElement(name = "DodatPageCount")
    protected int dodatPageCount;
    @XmlElement(name = "IsConfirmed")
    protected int isConfirmed;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
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
    @XmlElement(name = "OperatorFIO")
    protected String operatorFIO;
    @XmlElement(name = "NamePersonRequestSeasons")
    protected String namePersonRequestSeasons;
    @XmlElement(name = "BudjetYear")
    protected int budjetYear;

    /**
     * Gets the value of the idOrderOfEnrollment property.
     * 
     */
    public int getIdOrderOfEnrollment() {
        return idOrderOfEnrollment;
    }

    /**
     * Sets the value of the idOrderOfEnrollment property.
     * 
     */
    public void setIdOrderOfEnrollment(int value) {
        this.idOrderOfEnrollment = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
    }

    /**
     * Gets the value of the orderOfEnrollmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfEnrollmentNumber() {
        return orderOfEnrollmentNumber;
    }

    /**
     * Sets the value of the orderOfEnrollmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfEnrollmentNumber(String value) {
        this.orderOfEnrollmentNumber = value;
    }

    /**
     * Gets the value of the orderOfEnrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfEnrollmentDate() {
        return orderOfEnrollmentDate;
    }

    /**
     * Sets the value of the orderOfEnrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfEnrollmentDate(XMLGregorianCalendar value) {
        this.orderOfEnrollmentDate = value;
    }

    /**
     * Gets the value of the orderOfEnrollmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfEnrollmentDescription() {
        return orderOfEnrollmentDescription;
    }

    /**
     * Sets the value of the orderOfEnrollmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfEnrollmentDescription(String value) {
        this.orderOfEnrollmentDescription = value;
    }

    /**
     * Gets the value of the orderOfEnrollmentDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfEnrollmentDateLastChange() {
        return orderOfEnrollmentDateLastChange;
    }

    /**
     * Sets the value of the orderOfEnrollmentDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfEnrollmentDateLastChange(XMLGregorianCalendar value) {
        this.orderOfEnrollmentDateLastChange = value;
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
     * Gets the value of the idPaymentType property.
     * 
     */
    public int getIdPaymentType() {
        return idPaymentType;
    }

    /**
     * Sets the value of the idPaymentType property.
     * 
     */
    public void setIdPaymentType(int value) {
        this.idPaymentType = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsNumberProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsNumberProtocol() {
        return ordersOfEnrollmentsNumberProtocol;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsNumberProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsNumberProtocol(String value) {
        this.ordersOfEnrollmentsNumberProtocol = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsDateRishenya property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdersOfEnrollmentsDateRishenya() {
        return ordersOfEnrollmentsDateRishenya;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsDateRishenya property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdersOfEnrollmentsDateRishenya(XMLGregorianCalendar value) {
        this.ordersOfEnrollmentsDateRishenya = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsDatePriyoma property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdersOfEnrollmentsDatePriyoma() {
        return ordersOfEnrollmentsDatePriyoma;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsDatePriyoma property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdersOfEnrollmentsDatePriyoma(XMLGregorianCalendar value) {
        this.ordersOfEnrollmentsDatePriyoma = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsStudentsType property.
     * 
     */
    public int getOrdersOfEnrollmentsStudentsType() {
        return ordersOfEnrollmentsStudentsType;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsStudentsType property.
     * 
     */
    public void setOrdersOfEnrollmentsStudentsType(int value) {
        this.ordersOfEnrollmentsStudentsType = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsKorse property.
     * 
     */
    public int getOrdersOfEnrollmentsKorse() {
        return ordersOfEnrollmentsKorse;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsKorse property.
     * 
     */
    public void setOrdersOfEnrollmentsKorse(int value) {
        this.ordersOfEnrollmentsKorse = value;
    }

    /**
     * Gets the value of the isVerify property.
     * 
     */
    public int getIsVerify() {
        return isVerify;
    }

    /**
     * Sets the value of the isVerify property.
     * 
     */
    public void setIsVerify(int value) {
        this.isVerify = value;
    }

    /**
     * Gets the value of the isNeedVerify property.
     * 
     */
    public int getIsNeedVerify() {
        return isNeedVerify;
    }

    /**
     * Sets the value of the isNeedVerify property.
     * 
     */
    public void setIsNeedVerify(int value) {
        this.isNeedVerify = value;
    }

    /**
     * Gets the value of the dodatPageCount property.
     * 
     */
    public int getDodatPageCount() {
        return dodatPageCount;
    }

    /**
     * Sets the value of the dodatPageCount property.
     * 
     */
    public void setDodatPageCount(int value) {
        this.dodatPageCount = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     */
    public int getIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     */
    public void setIsConfirmed(int value) {
        this.isConfirmed = value;
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
     * Gets the value of the operatorFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorFIO() {
        return operatorFIO;
    }

    /**
     * Sets the value of the operatorFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorFIO(String value) {
        this.operatorFIO = value;
    }

    /**
     * Gets the value of the namePersonRequestSeasons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePersonRequestSeasons() {
        return namePersonRequestSeasons;
    }

    /**
     * Sets the value of the namePersonRequestSeasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePersonRequestSeasons(String value) {
        this.namePersonRequestSeasons = value;
    }

    /**
     * Gets the value of the budjetYear property.
     * 
     */
    public int getBudjetYear() {
        return budjetYear;
    }

    /**
     * Sets the value of the budjetYear property.
     * 
     */
    public void setBudjetYear(int value) {
        this.budjetYear = value;
    }

}
