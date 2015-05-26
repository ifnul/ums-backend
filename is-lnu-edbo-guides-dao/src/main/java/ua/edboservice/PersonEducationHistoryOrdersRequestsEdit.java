
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
 *         &lt;element name="Id_PersonEducationHistoryOrdersRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryOrdersRequestsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryOrdersRequestsDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonEducationHistoryOrdersRequests",
    "personEducationHistoryOrdersRequestsNumber",
    "personEducationHistoryOrdersRequestsDate",
    "dateSetType",
    "idAcademicYear"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersRequestsEdit")
public class PersonEducationHistoryOrdersRequestsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonEducationHistoryOrdersRequests")
    protected int idPersonEducationHistoryOrdersRequests;
    @XmlElement(name = "PersonEducationHistoryOrdersRequestsNumber")
    protected String personEducationHistoryOrdersRequestsNumber;
    @XmlElement(name = "PersonEducationHistoryOrdersRequestsDate")
    protected String personEducationHistoryOrdersRequestsDate;
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
     * Gets the value of the idPersonEducationHistoryOrdersRequests property.
     * 
     */
    public int getIdPersonEducationHistoryOrdersRequests() {
        return idPersonEducationHistoryOrdersRequests;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrdersRequests property.
     * 
     */
    public void setIdPersonEducationHistoryOrdersRequests(int value) {
        this.idPersonEducationHistoryOrdersRequests = value;
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
