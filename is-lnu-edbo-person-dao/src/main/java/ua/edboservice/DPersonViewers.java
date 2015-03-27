
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonViewers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonViewers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonViewers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_ApplicationKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonViewersInfoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonViewersInfoAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonViewers", propOrder = {
    "idPersonViewers",
    "personCodeU",
    "idUser",
    "userFIO",
    "idApplicationKey",
    "applicationName",
    "dateLastChange",
    "idUniversity",
    "universityFullName",
    "info",
    "personViewersInfoType",
    "personViewersInfoAdditionalInfo"
})
public class DPersonViewers {

    @XmlElement(name = "Id_PersonViewers")
    protected int idPersonViewers;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "UserFIO")
    protected String userFIO;
    @XmlElement(name = "Id_ApplicationKey")
    protected int idApplicationKey;
    @XmlElement(name = "ApplicationName")
    protected String applicationName;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Info")
    protected String info;
    @XmlElement(name = "PersonViewersInfoType")
    protected String personViewersInfoType;
    @XmlElement(name = "PersonViewersInfoAdditionalInfo")
    protected String personViewersInfoAdditionalInfo;

    /**
     * Gets the value of the idPersonViewers property.
     * 
     */
    public int getIdPersonViewers() {
        return idPersonViewers;
    }

    /**
     * Sets the value of the idPersonViewers property.
     * 
     */
    public void setIdPersonViewers(int value) {
        this.idPersonViewers = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
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
     * Gets the value of the userFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFIO() {
        return userFIO;
    }

    /**
     * Sets the value of the userFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFIO(String value) {
        this.userFIO = value;
    }

    /**
     * Gets the value of the idApplicationKey property.
     * 
     */
    public int getIdApplicationKey() {
        return idApplicationKey;
    }

    /**
     * Sets the value of the idApplicationKey property.
     * 
     */
    public void setIdApplicationKey(int value) {
        this.idApplicationKey = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
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
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Gets the value of the personViewersInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonViewersInfoType() {
        return personViewersInfoType;
    }

    /**
     * Sets the value of the personViewersInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonViewersInfoType(String value) {
        this.personViewersInfoType = value;
    }

    /**
     * Gets the value of the personViewersInfoAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonViewersInfoAdditionalInfo() {
        return personViewersInfoAdditionalInfo;
    }

    /**
     * Sets the value of the personViewersInfoAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonViewersInfoAdditionalInfo(String value) {
        this.personViewersInfoAdditionalInfo = value;
    }

}
