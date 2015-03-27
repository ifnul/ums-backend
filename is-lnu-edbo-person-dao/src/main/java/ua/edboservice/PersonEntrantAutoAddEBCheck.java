
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
 *         &lt;element name="ZNONumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZNODateGet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZNOPin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "znoNumbers",
    "znoDateGet",
    "znoPin",
    "attestatSeries",
    "attestatNumber",
    "login"
})
@XmlRootElement(name = "PersonEntrantAutoAddEBCheck")
public class PersonEntrantAutoAddEBCheck {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "ZNONumbers")
    protected String znoNumbers;
    @XmlElement(name = "ZNODateGet")
    protected String znoDateGet;
    @XmlElement(name = "ZNOPin")
    protected int znoPin;
    @XmlElement(name = "AttestatSeries")
    protected String attestatSeries;
    @XmlElement(name = "AttestatNumber")
    protected String attestatNumber;
    @XmlElement(name = "Login")
    protected String login;

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
     * Gets the value of the znoNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZNONumbers() {
        return znoNumbers;
    }

    /**
     * Sets the value of the znoNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZNONumbers(String value) {
        this.znoNumbers = value;
    }

    /**
     * Gets the value of the znoDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZNODateGet() {
        return znoDateGet;
    }

    /**
     * Sets the value of the znoDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZNODateGet(String value) {
        this.znoDateGet = value;
    }

    /**
     * Gets the value of the znoPin property.
     * 
     */
    public int getZNOPin() {
        return znoPin;
    }

    /**
     * Sets the value of the znoPin property.
     * 
     */
    public void setZNOPin(int value) {
        this.znoPin = value;
    }

    /**
     * Gets the value of the attestatSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestatSeries() {
        return attestatSeries;
    }

    /**
     * Sets the value of the attestatSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatSeries(String value) {
        this.attestatSeries = value;
    }

    /**
     * Gets the value of the attestatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestatNumber() {
        return attestatNumber;
    }

    /**
     * Sets the value of the attestatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestatNumber(String value) {
        this.attestatNumber = value;
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

}
