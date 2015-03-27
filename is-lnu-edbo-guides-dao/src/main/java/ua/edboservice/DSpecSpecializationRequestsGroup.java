
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dSpecSpecializationRequestsGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSpecSpecializationRequestsGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSpecSpecializationRequestsGroup", propOrder = {
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
    "email"
})
public class DSpecSpecializationRequestsGroup {

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

}
