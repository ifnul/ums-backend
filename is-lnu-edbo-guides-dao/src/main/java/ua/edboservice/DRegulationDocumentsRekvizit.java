
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dRegulationDocumentsRekvizit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentsRekvizit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocumentRekvisites" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegDocRekInputNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekDateRegistration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekSuprovodNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegDocRekSendNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekDateSend" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekVozvrat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegDocRekDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekDateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekDateRecive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegDocRekPaperCopy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentsRekvizit", propOrder = {
    "idRegulationDocumentRekvisites",
    "idRegulationDocument",
    "regDocRekInputNumber",
    "regDocRekDateRegistration",
    "regDocRekSuprovodNumber",
    "regDocRekPages",
    "regDocRekSendNumber",
    "regDocRekDateSend",
    "regDocRekVozvrat",
    "regDocRekDescription",
    "idUser",
    "fio",
    "login",
    "regDocRekDateCreate",
    "regDocRekDateLastChange",
    "regDocRekDateRecive",
    "regDocRekPaperCopy"
})
public class DRegulationDocumentsRekvizit {

    @XmlElement(name = "Id_RegulationDocumentRekvisites")
    protected int idRegulationDocumentRekvisites;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "RegDocRekInputNumber")
    protected String regDocRekInputNumber;
    @XmlElement(name = "RegDocRekDateRegistration", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateRegistration;
    @XmlElement(name = "RegDocRekSuprovodNumber")
    protected String regDocRekSuprovodNumber;
    @XmlElement(name = "RegDocRekPages")
    protected int regDocRekPages;
    @XmlElement(name = "RegDocRekSendNumber")
    protected String regDocRekSendNumber;
    @XmlElement(name = "RegDocRekDateSend", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateSend;
    @XmlElement(name = "RegDocRekVozvrat")
    protected int regDocRekVozvrat;
    @XmlElement(name = "RegDocRekDescription")
    protected String regDocRekDescription;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Login")
    protected String login;
    @XmlElement(name = "RegDocRekDateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateCreate;
    @XmlElement(name = "RegDocRekDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateLastChange;
    @XmlElement(name = "RegDocRekDateRecive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDocRekDateRecive;
    @XmlElement(name = "RegDocRekPaperCopy")
    protected int regDocRekPaperCopy;

    /**
     * Gets the value of the idRegulationDocumentRekvisites property.
     * 
     */
    public int getIdRegulationDocumentRekvisites() {
        return idRegulationDocumentRekvisites;
    }

    /**
     * Sets the value of the idRegulationDocumentRekvisites property.
     * 
     */
    public void setIdRegulationDocumentRekvisites(int value) {
        this.idRegulationDocumentRekvisites = value;
    }

    /**
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the regDocRekInputNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekInputNumber() {
        return regDocRekInputNumber;
    }

    /**
     * Sets the value of the regDocRekInputNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekInputNumber(String value) {
        this.regDocRekInputNumber = value;
    }

    /**
     * Gets the value of the regDocRekDateRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateRegistration() {
        return regDocRekDateRegistration;
    }

    /**
     * Sets the value of the regDocRekDateRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateRegistration(XMLGregorianCalendar value) {
        this.regDocRekDateRegistration = value;
    }

    /**
     * Gets the value of the regDocRekSuprovodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekSuprovodNumber() {
        return regDocRekSuprovodNumber;
    }

    /**
     * Sets the value of the regDocRekSuprovodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekSuprovodNumber(String value) {
        this.regDocRekSuprovodNumber = value;
    }

    /**
     * Gets the value of the regDocRekPages property.
     * 
     */
    public int getRegDocRekPages() {
        return regDocRekPages;
    }

    /**
     * Sets the value of the regDocRekPages property.
     * 
     */
    public void setRegDocRekPages(int value) {
        this.regDocRekPages = value;
    }

    /**
     * Gets the value of the regDocRekSendNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekSendNumber() {
        return regDocRekSendNumber;
    }

    /**
     * Sets the value of the regDocRekSendNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekSendNumber(String value) {
        this.regDocRekSendNumber = value;
    }

    /**
     * Gets the value of the regDocRekDateSend property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateSend() {
        return regDocRekDateSend;
    }

    /**
     * Sets the value of the regDocRekDateSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateSend(XMLGregorianCalendar value) {
        this.regDocRekDateSend = value;
    }

    /**
     * Gets the value of the regDocRekVozvrat property.
     * 
     */
    public int getRegDocRekVozvrat() {
        return regDocRekVozvrat;
    }

    /**
     * Sets the value of the regDocRekVozvrat property.
     * 
     */
    public void setRegDocRekVozvrat(int value) {
        this.regDocRekVozvrat = value;
    }

    /**
     * Gets the value of the regDocRekDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekDescription() {
        return regDocRekDescription;
    }

    /**
     * Sets the value of the regDocRekDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekDescription(String value) {
        this.regDocRekDescription = value;
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
     * Gets the value of the regDocRekDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateCreate() {
        return regDocRekDateCreate;
    }

    /**
     * Sets the value of the regDocRekDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateCreate(XMLGregorianCalendar value) {
        this.regDocRekDateCreate = value;
    }

    /**
     * Gets the value of the regDocRekDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateLastChange() {
        return regDocRekDateLastChange;
    }

    /**
     * Sets the value of the regDocRekDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateLastChange(XMLGregorianCalendar value) {
        this.regDocRekDateLastChange = value;
    }

    /**
     * Gets the value of the regDocRekDateRecive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDocRekDateRecive() {
        return regDocRekDateRecive;
    }

    /**
     * Sets the value of the regDocRekDateRecive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDocRekDateRecive(XMLGregorianCalendar value) {
        this.regDocRekDateRecive = value;
    }

    /**
     * Gets the value of the regDocRekPaperCopy property.
     * 
     */
    public int getRegDocRekPaperCopy() {
        return regDocRekPaperCopy;
    }

    /**
     * Sets the value of the regDocRekPaperCopy property.
     * 
     */
    public void setRegDocRekPaperCopy(int value) {
        this.regDocRekPaperCopy = value;
    }

}
