
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAlertsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAlertsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AlertsDetail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Alert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsReadet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlertDataLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AlertDateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AlertDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AlertDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AlertDateReaded" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIOTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIOFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAlertsDetails", propOrder = {
    "idAlertsDetail",
    "idAlert",
    "idUserFrom",
    "universityKode",
    "idUserTo",
    "isActive",
    "isReadet",
    "alertDataLastChange",
    "alertDateCreate",
    "alertDateBegin",
    "alertDateEnd",
    "alertDateReaded",
    "idUniversity",
    "universityFullName",
    "fioTo",
    "fioFrom"
})
public class DAlertsDetails {

    @XmlElement(name = "Id_AlertsDetail")
    protected int idAlertsDetail;
    @XmlElement(name = "Id_Alert")
    protected int idAlert;
    @XmlElement(name = "Id_UserFrom")
    protected int idUserFrom;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_UserTo")
    protected int idUserTo;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "IsReadet")
    protected int isReadet;
    @XmlElement(name = "AlertDataLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertDataLastChange;
    @XmlElement(name = "AlertDateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertDateCreate;
    @XmlElement(name = "AlertDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertDateBegin;
    @XmlElement(name = "AlertDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertDateEnd;
    @XmlElement(name = "AlertDateReaded", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertDateReaded;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "FIOTo")
    protected String fioTo;
    @XmlElement(name = "FIOFrom")
    protected String fioFrom;

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
     * Gets the value of the idUserFrom property.
     * 
     */
    public int getIdUserFrom() {
        return idUserFrom;
    }

    /**
     * Sets the value of the idUserFrom property.
     * 
     */
    public void setIdUserFrom(int value) {
        this.idUserFrom = value;
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
     * Gets the value of the idUserTo property.
     * 
     */
    public int getIdUserTo() {
        return idUserTo;
    }

    /**
     * Sets the value of the idUserTo property.
     * 
     */
    public void setIdUserTo(int value) {
        this.idUserTo = value;
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
     * Gets the value of the alertDataLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertDataLastChange() {
        return alertDataLastChange;
    }

    /**
     * Sets the value of the alertDataLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertDataLastChange(XMLGregorianCalendar value) {
        this.alertDataLastChange = value;
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
     * Gets the value of the alertDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertDateBegin() {
        return alertDateBegin;
    }

    /**
     * Sets the value of the alertDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertDateBegin(XMLGregorianCalendar value) {
        this.alertDateBegin = value;
    }

    /**
     * Gets the value of the alertDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertDateEnd() {
        return alertDateEnd;
    }

    /**
     * Sets the value of the alertDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertDateEnd(XMLGregorianCalendar value) {
        this.alertDateEnd = value;
    }

    /**
     * Gets the value of the alertDateReaded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertDateReaded() {
        return alertDateReaded;
    }

    /**
     * Sets the value of the alertDateReaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertDateReaded(XMLGregorianCalendar value) {
        this.alertDateReaded = value;
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
     * Gets the value of the fioTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOTo() {
        return fioTo;
    }

    /**
     * Sets the value of the fioTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOTo(String value) {
        this.fioTo = value;
    }

    /**
     * Gets the value of the fioFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOFrom() {
        return fioFrom;
    }

    /**
     * Sets the value of the fioFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOFrom(String value) {
        this.fioFrom = value;
    }

}
