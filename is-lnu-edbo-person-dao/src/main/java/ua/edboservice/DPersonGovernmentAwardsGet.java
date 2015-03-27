
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonGovernmentAwardsGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonGovernmentAwardsGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonGovernmentAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_GovernmentAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GovernmentAwardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_GovernmentAwardsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GovernmentAwardsTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonGovernmentAwardDateLsatChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonGovernmentAwardsGet", propOrder = {
    "idPersonGovernmentAward",
    "personCodeU",
    "idGovernmentAward",
    "governmentAwardName",
    "idGovernmentAwardsTypes",
    "governmentAwardsTypesName",
    "personGovernmentAwardDateLsatChange",
    "organization",
    "orderNumber",
    "orderDate",
    "documentSeries",
    "documentNumber",
    "signNumber",
    "idUserAdd",
    "fio",
    "universityKode",
    "idUniversity",
    "universityFullName"
})
public class DPersonGovernmentAwardsGet {

    @XmlElement(name = "Id_PersonGovernmentAward")
    protected int idPersonGovernmentAward;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_GovernmentAward")
    protected int idGovernmentAward;
    @XmlElement(name = "GovernmentAwardName")
    protected String governmentAwardName;
    @XmlElement(name = "Id_GovernmentAwardsTypes")
    protected int idGovernmentAwardsTypes;
    @XmlElement(name = "GovernmentAwardsTypesName")
    protected String governmentAwardsTypesName;
    @XmlElement(name = "PersonGovernmentAwardDateLsatChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personGovernmentAwardDateLsatChange;
    @XmlElement(name = "Organization")
    protected String organization;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "SignNumber")
    protected String signNumber;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;

    /**
     * Gets the value of the idPersonGovernmentAward property.
     * 
     */
    public int getIdPersonGovernmentAward() {
        return idPersonGovernmentAward;
    }

    /**
     * Sets the value of the idPersonGovernmentAward property.
     * 
     */
    public void setIdPersonGovernmentAward(int value) {
        this.idPersonGovernmentAward = value;
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
     * Gets the value of the idGovernmentAward property.
     * 
     */
    public int getIdGovernmentAward() {
        return idGovernmentAward;
    }

    /**
     * Sets the value of the idGovernmentAward property.
     * 
     */
    public void setIdGovernmentAward(int value) {
        this.idGovernmentAward = value;
    }

    /**
     * Gets the value of the governmentAwardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentAwardName() {
        return governmentAwardName;
    }

    /**
     * Sets the value of the governmentAwardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentAwardName(String value) {
        this.governmentAwardName = value;
    }

    /**
     * Gets the value of the idGovernmentAwardsTypes property.
     * 
     */
    public int getIdGovernmentAwardsTypes() {
        return idGovernmentAwardsTypes;
    }

    /**
     * Sets the value of the idGovernmentAwardsTypes property.
     * 
     */
    public void setIdGovernmentAwardsTypes(int value) {
        this.idGovernmentAwardsTypes = value;
    }

    /**
     * Gets the value of the governmentAwardsTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentAwardsTypesName() {
        return governmentAwardsTypesName;
    }

    /**
     * Sets the value of the governmentAwardsTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentAwardsTypesName(String value) {
        this.governmentAwardsTypesName = value;
    }

    /**
     * Gets the value of the personGovernmentAwardDateLsatChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonGovernmentAwardDateLsatChange() {
        return personGovernmentAwardDateLsatChange;
    }

    /**
     * Sets the value of the personGovernmentAwardDateLsatChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonGovernmentAwardDateLsatChange(XMLGregorianCalendar value) {
        this.personGovernmentAwardDateLsatChange = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the documentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSeries() {
        return documentSeries;
    }

    /**
     * Sets the value of the documentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSeries(String value) {
        this.documentSeries = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the signNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignNumber() {
        return signNumber;
    }

    /**
     * Sets the value of the signNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignNumber(String value) {
        this.signNumber = value;
    }

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
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

}
