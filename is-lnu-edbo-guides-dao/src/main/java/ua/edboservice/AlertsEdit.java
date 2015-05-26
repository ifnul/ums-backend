
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
 *         &lt;element name="Id_Alert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlertName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AlertsWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EditTextForAll" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlertDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAlert",
    "alertName",
    "idAlertsWeight",
    "editTextForAll",
    "alertDetailText"
})
@XmlRootElement(name = "AlertsEdit")
public class AlertsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Alert")
    protected int idAlert;
    @XmlElement(name = "AlertName")
    protected String alertName;
    @XmlElement(name = "Id_AlertsWeight")
    protected int idAlertsWeight;
    @XmlElement(name = "EditTextForAll")
    protected int editTextForAll;
    @XmlElement(name = "AlertDetailText")
    protected String alertDetailText;

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
     * Gets the value of the idAlert property.
     * 
     */
    public int getIdAlert() {
        return idAlert;
    }

    /**
     * Sets the value of the idAlert property.
     * 
     */
    public void setIdAlert(int value) {
        this.idAlert = value;
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
     * Gets the value of the editTextForAll property.
     * 
     */
    public int getEditTextForAll() {
        return editTextForAll;
    }

    /**
     * Sets the value of the editTextForAll property.
     * 
     */
    public void setEditTextForAll(int value) {
        this.editTextForAll = value;
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

}
