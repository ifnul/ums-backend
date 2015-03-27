
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
 *         &lt;element name="Id_AlertsWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AlertsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlertName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SendEmailInnerAdreses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SendEmailOutherAdreses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SendSms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SmsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityParametesrs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAlertsWeight",
    "idAlertsType",
    "alertName",
    "alertDetailText",
    "alertDateBegin",
    "alertDateEnd",
    "sendEmail",
    "sendEmailInnerAdreses",
    "sendEmailOutherAdreses",
    "sendSms",
    "smsText",
    "universityParametesrs"
})
@XmlRootElement(name = "AlertsAdd")
public class AlertsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_AlertsWeight")
    protected int idAlertsWeight;
    @XmlElement(name = "Id_AlertsType")
    protected int idAlertsType;
    @XmlElement(name = "AlertName")
    protected String alertName;
    @XmlElement(name = "AlertDetailText")
    protected String alertDetailText;
    @XmlElement(name = "AlertDateBegin")
    protected String alertDateBegin;
    @XmlElement(name = "AlertDateEnd")
    protected String alertDateEnd;
    @XmlElement(name = "SendEmail")
    protected int sendEmail;
    @XmlElement(name = "SendEmailInnerAdreses")
    protected int sendEmailInnerAdreses;
    @XmlElement(name = "SendEmailOutherAdreses")
    protected int sendEmailOutherAdreses;
    @XmlElement(name = "SendSms")
    protected int sendSms;
    @XmlElement(name = "SmsText")
    protected String smsText;
    @XmlElement(name = "UniversityParametesrs")
    protected String universityParametesrs;

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
     * Gets the value of the idAlertsWeight property.
     * 
     */
    public int getIdAlertsWeight() {
        return idAlertsWeight;
    }

    /**
     * Sets the value of the idAlertsWeight property.
     * 
     */
    public void setIdAlertsWeight(int value) {
        this.idAlertsWeight = value;
    }

    /**
     * Gets the value of the idAlertsType property.
     * 
     */
    public int getIdAlertsType() {
        return idAlertsType;
    }

    /**
     * Sets the value of the idAlertsType property.
     * 
     */
    public void setIdAlertsType(int value) {
        this.idAlertsType = value;
    }

    /**
     * Gets the value of the alertName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertName() {
        return alertName;
    }

    /**
     * Sets the value of the alertName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertName(String value) {
        this.alertName = value;
    }

    /**
     * Gets the value of the alertDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertDetailText() {
        return alertDetailText;
    }

    /**
     * Sets the value of the alertDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertDetailText(String value) {
        this.alertDetailText = value;
    }

    /**
     * Gets the value of the alertDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertDateBegin() {
        return alertDateBegin;
    }

    /**
     * Sets the value of the alertDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertDateBegin(String value) {
        this.alertDateBegin = value;
    }

    /**
     * Gets the value of the alertDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertDateEnd() {
        return alertDateEnd;
    }

    /**
     * Sets the value of the alertDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertDateEnd(String value) {
        this.alertDateEnd = value;
    }

    /**
     * Gets the value of the sendEmail property.
     * 
     */
    public int getSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     */
    public void setSendEmail(int value) {
        this.sendEmail = value;
    }

    /**
     * Gets the value of the sendEmailInnerAdreses property.
     * 
     */
    public int getSendEmailInnerAdreses() {
        return sendEmailInnerAdreses;
    }

    /**
     * Sets the value of the sendEmailInnerAdreses property.
     * 
     */
    public void setSendEmailInnerAdreses(int value) {
        this.sendEmailInnerAdreses = value;
    }

    /**
     * Gets the value of the sendEmailOutherAdreses property.
     * 
     */
    public int getSendEmailOutherAdreses() {
        return sendEmailOutherAdreses;
    }

    /**
     * Sets the value of the sendEmailOutherAdreses property.
     * 
     */
    public void setSendEmailOutherAdreses(int value) {
        this.sendEmailOutherAdreses = value;
    }

    /**
     * Gets the value of the sendSms property.
     * 
     */
    public int getSendSms() {
        return sendSms;
    }

    /**
     * Sets the value of the sendSms property.
     * 
     */
    public void setSendSms(int value) {
        this.sendSms = value;
    }

    /**
     * Gets the value of the smsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsText() {
        return smsText;
    }

    /**
     * Sets the value of the smsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsText(String value) {
        this.smsText = value;
    }

    /**
     * Gets the value of the universityParametesrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityParametesrs() {
        return universityParametesrs;
    }

    /**
     * Sets the value of the universityParametesrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityParametesrs(String value) {
        this.universityParametesrs = value;
    }

}
