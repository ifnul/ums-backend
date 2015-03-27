
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
 *         &lt;element name="Id_PersonEducationHistoryOrdersRequestsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryOrdersRequestsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryOrdersRequestsDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateSetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idPersonEducationHistoryOrdersRequestsTypes",
    "personEducationHistoryOrdersRequestsNumber",
    "personEducationHistoryOrdersRequestsDate",
    "universityKode",
    "idUniversityFrom",
    "dateSetType",
    "idAcademicYear"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersRequestsAdd")
public class PersonEducationHistoryOrdersRequestsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonEducationHistoryOrdersRequestsTypes")
    protected int idPersonEducationHistoryOrdersRequestsTypes;
    @XmlElement(name = "PersonEducationHistoryOrdersRequestsNumber")
    protected String personEducationHistoryOrdersRequestsNumber;
    @XmlElement(name = "PersonEducationHistoryOrdersRequestsDate")
    protected String personEducationHistoryOrdersRequestsDate;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_UniversityFrom")
    protected int idUniversityFrom;
    @XmlElement(name = "DateSetType")
    protected String dateSetType;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;

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
     * Gets the value of the idPersonEducationHistoryOrdersRequestsTypes property.
     * 
     */
    public int getIdPersonEducationHistoryOrdersRequestsTypes() {
        return idPersonEducationHistoryOrdersRequestsTypes;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrdersRequestsTypes property.
     * 
     */
    public void setIdPersonEducationHistoryOrdersRequestsTypes(int value) {
        this.idPersonEducationHistoryOrdersRequestsTypes = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrdersRequestsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryOrdersRequestsNumber() {
        return personEducationHistoryOrdersRequestsNumber;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersRequestsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryOrdersRequestsNumber(String value) {
        this.personEducationHistoryOrdersRequestsNumber = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrdersRequestsDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryOrdersRequestsDate() {
        return personEducationHistoryOrdersRequestsDate;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersRequestsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryOrdersRequestsDate(String value) {
        this.personEducationHistoryOrdersRequestsDate = value;
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
     * Gets the value of the idUniversityFrom property.
     * 
     */
    public int getIdUniversityFrom() {
        return idUniversityFrom;
    }

    /**
     * Sets the value of the idUniversityFrom property.
     * 
     */
    public void setIdUniversityFrom(int value) {
        this.idUniversityFrom = value;
    }

    /**
     * Gets the value of the dateSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSetType() {
        return dateSetType;
    }

    /**
     * Sets the value of the dateSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSetType(String value) {
        this.dateSetType = value;
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

}
