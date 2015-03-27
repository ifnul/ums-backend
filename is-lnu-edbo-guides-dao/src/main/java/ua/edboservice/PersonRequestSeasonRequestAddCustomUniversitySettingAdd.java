
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
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestAddDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestAddDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SettingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonRequestSeasons",
    "universityKode",
    "requestAddDateBegin",
    "requestAddDateEnd",
    "accessType",
    "settingDescription"
})
@XmlRootElement(name = "PersonRequestSeasonRequestAddCustomUniversitySettingAdd")
public class PersonRequestSeasonRequestAddCustomUniversitySettingAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "RequestAddDateBegin")
    protected String requestAddDateBegin;
    @XmlElement(name = "RequestAddDateEnd")
    protected String requestAddDateEnd;
    @XmlElement(name = "AccessType")
    protected int accessType;
    @XmlElement(name = "SettingDescription")
    protected String settingDescription;

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
     * Gets the value of the requestAddDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAddDateBegin() {
        return requestAddDateBegin;
    }

    /**
     * Sets the value of the requestAddDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAddDateBegin(String value) {
        this.requestAddDateBegin = value;
    }

    /**
     * Gets the value of the requestAddDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAddDateEnd() {
        return requestAddDateEnd;
    }

    /**
     * Sets the value of the requestAddDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAddDateEnd(String value) {
        this.requestAddDateEnd = value;
    }

    /**
     * Gets the value of the accessType property.
     * 
     */
    public int getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     */
    public void setAccessType(int value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the settingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingDescription() {
        return settingDescription;
    }

    /**
     * Sets the value of the settingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingDescription(String value) {
        this.settingDescription = value;
    }

}
