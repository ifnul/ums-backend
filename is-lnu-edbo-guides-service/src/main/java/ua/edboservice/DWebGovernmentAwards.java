
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dWebGovernmentAwards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebGovernmentAwards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebGovernmentAwards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GovernmentAwardsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GovernmentAwardsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocimentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GovernmentAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GovernmentAwardsTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebGovernmentAwards", propOrder = {
    "idWebGovernmentAwards",
    "idGovernmentAwardsTypes",
    "governmentAwardsName",
    "organNam",
    "orderNumber",
    "orderDate",
    "docimentSeries",
    "documentNumber",
    "signNumber",
    "idWebPersons",
    "idGovernmentAward",
    "governmentAwardsTypesName"
})
public class DWebGovernmentAwards {

    @XmlElement(name = "Id_WebGovernmentAwards")
    protected int idWebGovernmentAwards;
    @XmlElement(name = "Id_GovernmentAwardsTypes")
    protected int idGovernmentAwardsTypes;
    @XmlElement(name = "GovernmentAwardsName")
    protected String governmentAwardsName;
    @XmlElement(name = "OrganNam")
    protected String organNam;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "DocimentSeries")
    protected String docimentSeries;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "SignNumber")
    protected String signNumber;
    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "Id_GovernmentAward")
    protected int idGovernmentAward;
    @XmlElement(name = "GovernmentAwardsTypesName")
    protected String governmentAwardsTypesName;

    /**
     * Gets the value of the idWebGovernmentAwards property.
     * 
     */
    public int getIdWebGovernmentAwards() {
        return idWebGovernmentAwards;
    }

    /**
     * Sets the value of the idWebGovernmentAwards property.
     * 
     */
    public void setIdWebGovernmentAwards(int value) {
        this.idWebGovernmentAwards = value;
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
     * Gets the value of the governmentAwardsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentAwardsName() {
        return governmentAwardsName;
    }

    /**
     * Sets the value of the governmentAwardsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentAwardsName(String value) {
        this.governmentAwardsName = value;
    }

    /**
     * Gets the value of the organNam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganNam() {
        return organNam;
    }

    /**
     * Sets the value of the organNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganNam(String value) {
        this.organNam = value;
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
     * Gets the value of the docimentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocimentSeries() {
        return docimentSeries;
    }

    /**
     * Sets the value of the docimentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocimentSeries(String value) {
        this.docimentSeries = value;
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
     * Gets the value of the idWebPersons property.
     * 
     */
    public int getIdWebPersons() {
        return idWebPersons;
    }

    /**
     * Sets the value of the idWebPersons property.
     * 
     */
    public void setIdWebPersons(int value) {
        this.idWebPersons = value;
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

}
