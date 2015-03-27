
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfEnrollmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfEnrollmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfEnrollmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsNumberProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsDateRishenya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsDatePriyoma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsStudentsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsKorse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "universityKode",
    "idPersonRequestSeasons",
    "orderOfEnrollmentNumber",
    "orderOfEnrollmentDate",
    "orderOfEnrollmentDescription",
    "universityFacultetKode",
    "idPersonEducationForm",
    "idQualification",
    "idPaymentType",
    "ordersOfEnrollmentsNumberProtocol",
    "ordersOfEnrollmentsDateRishenya",
    "ordersOfEnrollmentsDatePriyoma",
    "ordersOfEnrollmentsStudentsType",
    "ordersOfEnrollmentsKorse",
    "idAcademicYear",
    "budjetYear"
})
@XmlRootElement(name = "OrdersOfEnrollmentsAdd")
public class OrdersOfEnrollmentsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "OrderOfEnrollmentNumber")
    protected String orderOfEnrollmentNumber;
    @XmlElement(name = "OrderOfEnrollmentDate")
    protected String orderOfEnrollmentDate;
    @XmlElement(name = "OrderOfEnrollmentDescription")
    protected String orderOfEnrollmentDescription;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "Id_PaymentType")
    protected int idPaymentType;
    @XmlElement(name = "OrdersOfEnrollmentsNumberProtocol")
    protected String ordersOfEnrollmentsNumberProtocol;
    @XmlElement(name = "OrdersOfEnrollmentsDateRishenya")
    protected String ordersOfEnrollmentsDateRishenya;
    @XmlElement(name = "OrdersOfEnrollmentsDatePriyoma")
    protected String ordersOfEnrollmentsDatePriyoma;
    @XmlElement(name = "OrdersOfEnrollmentsStudentsType")
    protected int ordersOfEnrollmentsStudentsType;
    @XmlElement(name = "OrdersOfEnrollmentsKorse")
    protected int ordersOfEnrollmentsKorse;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "BudjetYear")
    protected int budjetYear;

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
     *     {@link String }
     *     
     */
    public String getOrderOfEnrollmentDate() {
        return orderOfEnrollmentDate;
    }

    /**
     * Sets the value of the orderOfEnrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfEnrollmentDate(String value) {
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
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsDateRishenya() {
        return ordersOfEnrollmentsDateRishenya;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsDateRishenya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsDateRishenya(String value) {
        this.ordersOfEnrollmentsDateRishenya = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsDatePriyoma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsDatePriyoma() {
        return ordersOfEnrollmentsDatePriyoma;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsDatePriyoma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsDatePriyoma(String value) {
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
