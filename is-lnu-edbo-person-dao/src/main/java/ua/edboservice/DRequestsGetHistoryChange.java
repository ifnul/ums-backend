
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dRequestsGetHistoryChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRequestsGetHistoryChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateStartAction" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRequestsGetHistoryChange", propOrder = {
    "idPersonRequest",
    "idPersonRequestStatus",
    "idPersonRequestStatusType",
    "dateStartAction",
    "universityFullName",
    "universityFacultetFullName",
    "specDirectionName",
    "specSpecialityName",
    "specSpecializationName",
    "loginEmail",
    "email",
    "descryption"
})
public class DRequestsGetHistoryChange {

    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_PersonRequestStatus")
    protected int idPersonRequestStatus;
    @XmlElement(name = "Id_PersonRequestStatusType")
    protected int idPersonRequestStatusType;
    @XmlElement(name = "DateStartAction", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateStartAction;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecSpecializationName")
    protected String specSpecializationName;
    @XmlElement(name = "LoginEmail")
    protected String loginEmail;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Descryption")
    protected String descryption;

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the idPersonRequestStatus property.
     * 
     */
    public int getIdPersonRequestStatus() {
        return idPersonRequestStatus;
    }

    /**
     * Sets the value of the idPersonRequestStatus property.
     * 
     */
    public void setIdPersonRequestStatus(int value) {
        this.idPersonRequestStatus = value;
    }

    /**
     * Gets the value of the idPersonRequestStatusType property.
     * 
     */
    public int getIdPersonRequestStatusType() {
        return idPersonRequestStatusType;
    }

    /**
     * Sets the value of the idPersonRequestStatusType property.
     * 
     */
    public void setIdPersonRequestStatusType(int value) {
        this.idPersonRequestStatusType = value;
    }

    /**
     * Gets the value of the dateStartAction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStartAction() {
        return dateStartAction;
    }

    /**
     * Sets the value of the dateStartAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStartAction(XMLGregorianCalendar value) {
        this.dateStartAction = value;
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
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the specSpecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecializationName() {
        return specSpecializationName;
    }

    /**
     * Sets the value of the specSpecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecializationName(String value) {
        this.specSpecializationName = value;
    }

    /**
     * Gets the value of the loginEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginEmail() {
        return loginEmail;
    }

    /**
     * Sets the value of the loginEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginEmail(String value) {
        this.loginEmail = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the descryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescryption() {
        return descryption;
    }

    /**
     * Sets the value of the descryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescryption(String value) {
        this.descryption = value;
    }

}
