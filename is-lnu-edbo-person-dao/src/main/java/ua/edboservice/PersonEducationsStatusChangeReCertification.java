
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
 *         &lt;element name="PersonEducationReCertificateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationHistoryOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryDesciption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationPaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationReCertificateDate",
    "idPersonEducationHistoryOrders",
    "personEducationHistoryDesciption",
    "idPersonEducations",
    "idAcademicYear",
    "idPersonEducationForm",
    "specCode",
    "idPersonEducationPaymentType"
})
@XmlRootElement(name = "PersonEducationsStatusChangeReCertification")
public class PersonEducationsStatusChangeReCertification {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "PersonEducationReCertificateDate")
    protected String personEducationReCertificateDate;
    @XmlElement(name = "Id_PersonEducationHistoryOrders")
    protected int idPersonEducationHistoryOrders;
    @XmlElement(name = "PersonEducationHistoryDesciption")
    protected String personEducationHistoryDesciption;
    @XmlElement(name = "Id_PersonEducations")
    protected String idPersonEducations;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "Id_PersonEducationPaymentType")
    protected int idPersonEducationPaymentType;

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
     * Gets the value of the personEducationReCertificateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationReCertificateDate() {
        return personEducationReCertificateDate;
    }

    /**
     * Sets the value of the personEducationReCertificateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationReCertificateDate(String value) {
        this.personEducationReCertificateDate = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public int getIdPersonEducationHistoryOrders() {
        return idPersonEducationHistoryOrders;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public void setIdPersonEducationHistoryOrders(int value) {
        this.idPersonEducationHistoryOrders = value;
    }

    /**
     * Gets the value of the personEducationHistoryDesciption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryDesciption() {
        return personEducationHistoryDesciption;
    }

    /**
     * Sets the value of the personEducationHistoryDesciption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryDesciption(String value) {
        this.personEducationHistoryDesciption = value;
    }

    /**
     * Gets the value of the idPersonEducations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPersonEducations() {
        return idPersonEducations;
    }

    /**
     * Sets the value of the idPersonEducations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPersonEducations(String value) {
        this.idPersonEducations = value;
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
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the idPersonEducationPaymentType property.
     * 
     */
    public int getIdPersonEducationPaymentType() {
        return idPersonEducationPaymentType;
    }

    /**
     * Sets the value of the idPersonEducationPaymentType property.
     * 
     */
    public void setIdPersonEducationPaymentType(int value) {
        this.idPersonEducationPaymentType = value;
    }

}
