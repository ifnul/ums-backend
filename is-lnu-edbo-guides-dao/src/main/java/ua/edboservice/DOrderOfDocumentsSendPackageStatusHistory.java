
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrderOfDocumentsSendPackageStatusHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrderOfDocumentsSendPackageStatusHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrderOfDocumentsSendPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentsSendPackageStatuseDateChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_OrderOfDocumentsSendPackageStatuse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentsSendPackageStatuseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentsSendPackageStatuseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrderOfDocumentsSendPackageStatusHistory", propOrder = {
    "idOrderOfDocumentsSendPackage",
    "orderOfDocumentsSendPackageStatuseDateChange",
    "idOrderOfDocumentsSendPackageStatuse",
    "idOrderOfDocumentsSendPackageStatuseType",
    "orderOfDocumentsSendPackageStatuseTypeName",
    "fio"
})
public class DOrderOfDocumentsSendPackageStatusHistory {

    @XmlElement(name = "Id_OrderOfDocumentsSendPackage")
    protected int idOrderOfDocumentsSendPackage;
    @XmlElement(name = "OrderOfDocumentsSendPackageStatuseDateChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfDocumentsSendPackageStatuseDateChange;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackageStatuse")
    protected int idOrderOfDocumentsSendPackageStatuse;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackageStatuseType")
    protected int idOrderOfDocumentsSendPackageStatuseType;
    @XmlElement(name = "OrderOfDocumentsSendPackageStatuseTypeName")
    protected String orderOfDocumentsSendPackageStatuseTypeName;
    @XmlElement(name = "FIO")
    protected String fio;

    /**
     * Gets the value of the idOrderOfDocumentsSendPackage property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackage() {
        return idOrderOfDocumentsSendPackage;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackage property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackage(int value) {
        this.idOrderOfDocumentsSendPackage = value;
    }

    /**
     * Gets the value of the orderOfDocumentsSendPackageStatuseDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfDocumentsSendPackageStatuseDateChange() {
        return orderOfDocumentsSendPackageStatuseDateChange;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackageStatuseDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfDocumentsSendPackageStatuseDateChange(XMLGregorianCalendar value) {
        this.orderOfDocumentsSendPackageStatuseDateChange = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentsSendPackageStatuse property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackageStatuse() {
        return idOrderOfDocumentsSendPackageStatuse;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackageStatuse property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackageStatuse(int value) {
        this.idOrderOfDocumentsSendPackageStatuse = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentsSendPackageStatuseType property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackageStatuseType() {
        return idOrderOfDocumentsSendPackageStatuseType;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackageStatuseType property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackageStatuseType(int value) {
        this.idOrderOfDocumentsSendPackageStatuseType = value;
    }

    /**
     * Gets the value of the orderOfDocumentsSendPackageStatuseTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentsSendPackageStatuseTypeName() {
        return orderOfDocumentsSendPackageStatuseTypeName;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackageStatuseTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentsSendPackageStatuseTypeName(String value) {
        this.orderOfDocumentsSendPackageStatuseTypeName = value;
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

}
