
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
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RolesPrefixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdminWorkLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateMailboxPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idLanguage",
    "universityKode",
    "rolesPrefixName",
    "universityAdminLogin",
    "universityAdminPassword",
    "universityAdminFIO",
    "universityAdminEmail",
    "universityAdminWorkPhone",
    "universityAdminMobilePhone",
    "universityAdminWorkLevel",
    "createMailboxPassword"
})
@XmlRootElement(name = "UniversitiesCreateExtendedParameters")
public class UniversitiesCreateExtendedParameters {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "RolesPrefixName")
    protected String rolesPrefixName;
    @XmlElement(name = "UniversityAdminLogin")
    protected String universityAdminLogin;
    @XmlElement(name = "UniversityAdminPassword")
    protected String universityAdminPassword;
    @XmlElement(name = "UniversityAdminFIO")
    protected String universityAdminFIO;
    @XmlElement(name = "UniversityAdminEmail")
    protected String universityAdminEmail;
    @XmlElement(name = "UniversityAdminWorkPhone")
    protected String universityAdminWorkPhone;
    @XmlElement(name = "UniversityAdminMobilePhone")
    protected String universityAdminMobilePhone;
    @XmlElement(name = "UniversityAdminWorkLevel")
    protected String universityAdminWorkLevel;
    @XmlElement(name = "CreateMailboxPassword")
    protected String createMailboxPassword;

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
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
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
     * Gets the value of the rolesPrefixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolesPrefixName() {
        return rolesPrefixName;
    }

    /**
     * Sets the value of the rolesPrefixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolesPrefixName(String value) {
        this.rolesPrefixName = value;
    }

    /**
     * Gets the value of the universityAdminLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminLogin() {
        return universityAdminLogin;
    }

    /**
     * Sets the value of the universityAdminLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminLogin(String value) {
        this.universityAdminLogin = value;
    }

    /**
     * Gets the value of the universityAdminPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminPassword() {
        return universityAdminPassword;
    }

    /**
     * Sets the value of the universityAdminPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminPassword(String value) {
        this.universityAdminPassword = value;
    }

    /**
     * Gets the value of the universityAdminFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminFIO() {
        return universityAdminFIO;
    }

    /**
     * Sets the value of the universityAdminFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminFIO(String value) {
        this.universityAdminFIO = value;
    }

    /**
     * Gets the value of the universityAdminEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminEmail() {
        return universityAdminEmail;
    }

    /**
     * Sets the value of the universityAdminEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminEmail(String value) {
        this.universityAdminEmail = value;
    }

    /**
     * Gets the value of the universityAdminWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminWorkPhone() {
        return universityAdminWorkPhone;
    }

    /**
     * Sets the value of the universityAdminWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminWorkPhone(String value) {
        this.universityAdminWorkPhone = value;
    }

    /**
     * Gets the value of the universityAdminMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminMobilePhone() {
        return universityAdminMobilePhone;
    }

    /**
     * Sets the value of the universityAdminMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminMobilePhone(String value) {
        this.universityAdminMobilePhone = value;
    }

    /**
     * Gets the value of the universityAdminWorkLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdminWorkLevel() {
        return universityAdminWorkLevel;
    }

    /**
     * Sets the value of the universityAdminWorkLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdminWorkLevel(String value) {
        this.universityAdminWorkLevel = value;
    }

    /**
     * Gets the value of the createMailboxPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateMailboxPassword() {
        return createMailboxPassword;
    }

    /**
     * Sets the value of the createMailboxPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateMailboxPassword(String value) {
        this.createMailboxPassword = value;
    }

}
