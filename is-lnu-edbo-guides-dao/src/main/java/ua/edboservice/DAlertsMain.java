
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAlertsMain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAlertsMain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Alert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AlertsWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AlertsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlertLastDateChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AlertName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIOOeprator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertsTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertsWeightName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAlertsMain", propOrder = {
    "idAlert",
    "idAlertsWeight",
    "idAlertsType",
    "idUser",
    "alertLastDateChange",
    "alertName",
    "fioOeprator",
    "alertsTypeName",
    "alertsWeightName"
})
public class DAlertsMain {

    @XmlElement(name = "Id_Alert")
    protected int idAlert;
    @XmlElement(name = "Id_AlertsWeight")
    protected int idAlertsWeight;
    @XmlElement(name = "Id_AlertsType")
    protected int idAlertsType;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "AlertLastDateChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertLastDateChange;
    @XmlElement(name = "AlertName")
    protected String alertName;
    @XmlElement(name = "FIOOeprator")
    protected String fioOeprator;
    @XmlElement(name = "AlertsTypeName")
    protected String alertsTypeName;
    @XmlElement(name = "AlertsWeightName")
    protected String alertsWeightName;

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
     * Gets the value of the alertLastDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertLastDateChange() {
        return alertLastDateChange;
    }

    /**
     * Sets the value of the alertLastDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertLastDateChange(XMLGregorianCalendar value) {
        this.alertLastDateChange = value;
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
     * Gets the value of the fioOeprator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOOeprator() {
        return fioOeprator;
    }

    /**
     * Sets the value of the fioOeprator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOOeprator(String value) {
        this.fioOeprator = value;
    }

    /**
     * Gets the value of the alertsTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertsTypeName() {
        return alertsTypeName;
    }

    /**
     * Sets the value of the alertsTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertsTypeName(String value) {
        this.alertsTypeName = value;
    }

    /**
     * Gets the value of the alertsWeightName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertsWeightName() {
        return alertsWeightName;
    }

    /**
     * Sets the value of the alertsWeightName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertsWeightName(String value) {
        this.alertsWeightName = value;
    }

}
