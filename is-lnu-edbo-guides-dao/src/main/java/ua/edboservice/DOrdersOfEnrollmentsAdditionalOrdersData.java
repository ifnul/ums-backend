
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrdersOfEnrollmentsAdditionalOrdersData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrdersOfEnrollmentsAdditionalOrdersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrdersData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfEnrollmentData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrdersDataCauseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDataCauseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDataCauseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrdersOfEnrollmentsAdditionalOrdersData", propOrder = {
    "idOrdersOfEnrollmentsAdditionalOrdersData",
    "idOrdersOfEnrollmentsAdditionalOrders",
    "idOrderOfEnrollmentData",
    "idPersonRequest",
    "personCodeU",
    "idPerson",
    "birthday",
    "fio",
    "idOrdersOfEnrollmentsAdditionalOrdersDataCauseType",
    "ordersOfEnrollmentsAdditionalOrdersDataCauseDate",
    "ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName"
})
public class DOrdersOfEnrollmentsAdditionalOrdersData {

    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrdersData")
    protected int idOrdersOfEnrollmentsAdditionalOrdersData;
    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrders")
    protected int idOrdersOfEnrollmentsAdditionalOrders;
    @XmlElement(name = "Id_OrderOfEnrollmentData")
    protected int idOrderOfEnrollmentData;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrdersDataCauseType")
    protected int idOrdersOfEnrollmentsAdditionalOrdersDataCauseType;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDataCauseDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordersOfEnrollmentsAdditionalOrdersDataCauseDate;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDataCauseTypeName")
    protected String ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName;

    /**
     * Gets the value of the idOrdersOfEnrollmentsAdditionalOrdersData property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAdditionalOrdersData() {
        return idOrdersOfEnrollmentsAdditionalOrdersData;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAdditionalOrdersData property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAdditionalOrdersData(int value) {
        this.idOrdersOfEnrollmentsAdditionalOrdersData = value;
    }

    /**
     * Gets the value of the idOrdersOfEnrollmentsAdditionalOrders property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAdditionalOrders() {
        return idOrdersOfEnrollmentsAdditionalOrders;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAdditionalOrders property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAdditionalOrders(int value) {
        this.idOrdersOfEnrollmentsAdditionalOrders = value;
    }

    /**
     * Gets the value of the idOrderOfEnrollmentData property.
     * 
     */
    public int getIdOrderOfEnrollmentData() {
        return idOrderOfEnrollmentData;
    }

    /**
     * Sets the value of the idOrderOfEnrollmentData property.
     * 
     */
    public void setIdOrderOfEnrollmentData(int value) {
        this.idOrderOfEnrollmentData = value;
    }

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
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
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
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
     * Gets the value of the idOrdersOfEnrollmentsAdditionalOrdersDataCauseType property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAdditionalOrdersDataCauseType() {
        return idOrdersOfEnrollmentsAdditionalOrdersDataCauseType;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAdditionalOrdersDataCauseType property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAdditionalOrdersDataCauseType(int value) {
        this.idOrdersOfEnrollmentsAdditionalOrdersDataCauseType = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdersOfEnrollmentsAdditionalOrdersDataCauseDate() {
        return ordersOfEnrollmentsAdditionalOrdersDataCauseDate;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDataCauseDate(XMLGregorianCalendar value) {
        this.ordersOfEnrollmentsAdditionalOrdersDataCauseDate = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersDataCauseTypeName() {
        return ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDataCauseTypeName(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersDataCauseTypeName = value;
    }

}
