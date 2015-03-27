
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAlertsClientText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAlertsClientText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AlertsDetail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Alert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsReadet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlertDateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AlertName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dAlertsClientText", propOrder = {
    "idAlertsDetail",
    "idAlert",
    "isActive",
    "isReadet",
    "alertDateCreate",
    "alertName",
    "alertDetailText"
})
public class DAlertsClientText {

    @XmlElement(name = "Id_AlertsDetail")
    protected int idAlertsDetail;
    @XmlElement(name = "Id_Alert")
    protected int idAlert;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "IsReadet")
    protected int isReadet;
    @XmlElement(name = "AlertDateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertDateCreate;
    @XmlElement(name = "AlertName")
    protected String alertName;
    @XmlElement(name = "AlertDetailText")
    protected String alertDetailText;

    /**
     * Gets the value of the idAlertsDetail property.
     * 
     */
    public int getIdAlertsDetail() {
        return idAlertsDetail;
    }

    /**
     * Sets the value of the idAlertsDetail property.
     * 
     */
    public void setIdAlertsDetail(int value) {
        this.idAlertsDetail = value;
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
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isReadet property.
     * 
     */
    public int getIsReadet() {
        return isReadet;
    }

    /**
     * Sets the value of the isReadet property.
     * 
     */
    public void setIsReadet(int value) {
        this.isReadet = value;
    }

    /**
     * Gets the value of the alertDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertDateCreate() {
        return alertDateCreate;
    }

    /**
     * Sets the value of the alertDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertDateCreate(XMLGregorianCalendar value) {
        this.alertDateCreate = value;
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

}
