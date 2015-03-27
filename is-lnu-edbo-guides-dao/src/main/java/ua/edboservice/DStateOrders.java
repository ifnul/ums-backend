
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dStateOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dStateOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_StateOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_StateOrdersTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StateOrdersTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrderIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StateOrderDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dStateOrders", propOrder = {
    "idStateOrder",
    "idStateOrdersTypes",
    "year",
    "idUser",
    "numDoc",
    "stateOrdersTypeName",
    "fio",
    "stateOrderIsActive",
    "stateOrderDateLastChange"
})
public class DStateOrders {

    @XmlElement(name = "Id_StateOrder")
    protected int idStateOrder;
    @XmlElement(name = "Id_StateOrdersTypes")
    protected int idStateOrdersTypes;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "NumDoc")
    protected int numDoc;
    @XmlElement(name = "StateOrdersTypeName")
    protected String stateOrdersTypeName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "StateOrderIsActive")
    protected int stateOrderIsActive;
    @XmlElement(name = "StateOrderDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stateOrderDateLastChange;

    /**
     * Gets the value of the idStateOrder property.
     * 
     */
    public int getIdStateOrder() {
        return idStateOrder;
    }

    /**
     * Sets the value of the idStateOrder property.
     * 
     */
    public void setIdStateOrder(int value) {
        this.idStateOrder = value;
    }

    /**
     * Gets the value of the idStateOrdersTypes property.
     * 
     */
    public int getIdStateOrdersTypes() {
        return idStateOrdersTypes;
    }

    /**
     * Sets the value of the idStateOrdersTypes property.
     * 
     */
    public void setIdStateOrdersTypes(int value) {
        this.idStateOrdersTypes = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
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
     * Gets the value of the numDoc property.
     * 
     */
    public int getNumDoc() {
        return numDoc;
    }

    /**
     * Sets the value of the numDoc property.
     * 
     */
    public void setNumDoc(int value) {
        this.numDoc = value;
    }

    /**
     * Gets the value of the stateOrdersTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrdersTypeName() {
        return stateOrdersTypeName;
    }

    /**
     * Sets the value of the stateOrdersTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrdersTypeName(String value) {
        this.stateOrdersTypeName = value;
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
     * Gets the value of the stateOrderIsActive property.
     * 
     */
    public int getStateOrderIsActive() {
        return stateOrderIsActive;
    }

    /**
     * Sets the value of the stateOrderIsActive property.
     * 
     */
    public void setStateOrderIsActive(int value) {
        this.stateOrderIsActive = value;
    }

    /**
     * Gets the value of the stateOrderDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStateOrderDateLastChange() {
        return stateOrderDateLastChange;
    }

    /**
     * Sets the value of the stateOrderDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStateOrderDateLastChange(XMLGregorianCalendar value) {
        this.stateOrderDateLastChange = value;
    }

}
