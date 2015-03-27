
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dSpecSpecializationRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSpecSpecializationRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_SpecScecializationRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecializationRequestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecializationRequestDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BindType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecScecializationRequestsGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecScecializationRequestsGroupDataLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecScecializationRequestsGroupStatuses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecScecializationRequestsGroupStatuseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BindTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSpecSpecializationRequests", propOrder = {
    "idSpecScecializationRequests",
    "specSpecialityCode",
    "specSpecialityClasifierCode",
    "specSpecialityName",
    "specScecializationCode",
    "specializationRequestName",
    "specializationRequestDateLastChange",
    "bindType",
    "idSpecScecializationRequestsGroup",
    "specScecializationRequestsGroupDataLastChange",
    "idUser",
    "universityKode",
    "idSpecScecializationRequestsGroupStatuses",
    "specScecializationRequestsGroupStatuseName",
    "idUniversity",
    "universityFullName",
    "login",
    "fio",
    "userMobilePhone",
    "userWorkPhone",
    "email",
    "specScecializationName",
    "bindTypeDescription"
})
public class DSpecSpecializationRequests {

    @XmlElement(name = "Id_SpecScecializationRequests")
    protected int idSpecScecializationRequests;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;
    @XmlElement(name = "SpecializationRequestName")
    protected String specializationRequestName;
    @XmlElement(name = "SpecializationRequestDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specializationRequestDateLastChange;
    @XmlElement(name = "BindType")
    protected int bindType;
    @XmlElement(name = "Id_SpecScecializationRequestsGroup")
    protected int idSpecScecializationRequestsGroup;
    @XmlElement(name = "SpecScecializationRequestsGroupDataLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specScecializationRequestsGroupDataLastChange;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_SpecScecializationRequestsGroupStatuses")
    protected int idSpecScecializationRequestsGroupStatuses;
    @XmlElement(name = "SpecScecializationRequestsGroupStatuseName")
    protected String specScecializationRequestsGroupStatuseName;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Login")
    protected String login;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "UserMobilePhone")
    protected String userMobilePhone;
    @XmlElement(name = "UserWorkPhone")
    protected String userWorkPhone;
    protected String email;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;
    @XmlElement(name = "BindTypeDescription")
    protected String bindTypeDescription;

    /**
     * Gets the value of the idSpecScecializationRequests property.
     * 
     */
    public int getIdSpecScecializationRequests() {
        return idSpecScecializationRequests;
    }

    /**
     * Sets the value of the idSpecScecializationRequests property.
     * 
     */
    public void setIdSpecScecializationRequests(int value) {
        this.idSpecScecializationRequests = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
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
     * Gets the value of the specScecializationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationCode() {
        return specScecializationCode;
    }

    /**
     * Sets the value of the specScecializationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationCode(String value) {
        this.specScecializationCode = value;
    }

    /**
     * Gets the value of the specializationRequestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecializationRequestName() {
        return specializationRequestName;
    }

    /**
     * Sets the value of the specializationRequestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecializationRequestName(String value) {
        this.specializationRequestName = value;
    }

    /**
     * Gets the value of the specializationRequestDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecializationRequestDateLastChange() {
        return specializationRequestDateLastChange;
    }

    /**
     * Sets the value of the specializationRequestDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecializationRequestDateLastChange(XMLGregorianCalendar value) {
        this.specializationRequestDateLastChange = value;
    }

    /**
     * Gets the value of the bindType property.
     * 
     */
    public int getBindType() {
        return bindType;
    }

    /**
     * Sets the value of the bindType property.
     * 
     */
    public void setBindType(int value) {
        this.bindType = value;
    }

    /**
     * Gets the value of the idSpecScecializationRequestsGroup property.
     * 
     */
    public int getIdSpecScecializationRequestsGroup() {
        return idSpecScecializationRequestsGroup;
    }

    /**
     * Sets the value of the idSpecScecializationRequestsGroup property.
     * 
     */
    public void setIdSpecScecializationRequestsGroup(int value) {
        this.idSpecScecializationRequestsGroup = value;
    }

    /**
     * Gets the value of the specScecializationRequestsGroupDataLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecScecializationRequestsGroupDataLastChange() {
        return specScecializationRequestsGroupDataLastChange;
    }

    /**
     * Sets the value of the specScecializationRequestsGroupDataLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecScecializationRequestsGroupDataLastChange(XMLGregorianCalendar value) {
        this.specScecializationRequestsGroupDataLastChange = value;
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
     * Gets the value of the idSpecScecializationRequestsGroupStatuses property.
     * 
     */
    public int getIdSpecScecializationRequestsGroupStatuses() {
        return idSpecScecializationRequestsGroupStatuses;
    }

    /**
     * Sets the value of the idSpecScecializationRequestsGroupStatuses property.
     * 
     */
    public void setIdSpecScecializationRequestsGroupStatuses(int value) {
        this.idSpecScecializationRequestsGroupStatuses = value;
    }

    /**
     * Gets the value of the specScecializationRequestsGroupStatuseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationRequestsGroupStatuseName() {
        return specScecializationRequestsGroupStatuseName;
    }

    /**
     * Sets the value of the specScecializationRequestsGroupStatuseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationRequestsGroupStatuseName(String value) {
        this.specScecializationRequestsGroupStatuseName = value;
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
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
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
     * Gets the value of the userMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMobilePhone() {
        return userMobilePhone;
    }

    /**
     * Sets the value of the userMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMobilePhone(String value) {
        this.userMobilePhone = value;
    }

    /**
     * Gets the value of the userWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserWorkPhone() {
        return userWorkPhone;
    }

    /**
     * Sets the value of the userWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserWorkPhone(String value) {
        this.userWorkPhone = value;
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
     * Gets the value of the specScecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationName() {
        return specScecializationName;
    }

    /**
     * Sets the value of the specScecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationName(String value) {
        this.specScecializationName = value;
    }

    /**
     * Gets the value of the bindTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindTypeDescription() {
        return bindTypeDescription;
    }

    /**
     * Sets the value of the bindTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindTypeDescription(String value) {
        this.bindTypeDescription = value;
    }

}
