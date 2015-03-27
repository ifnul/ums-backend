
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
 *         &lt;element name="Id_DeliveryOfDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dateIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateExpired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idDeliveryOfDocuments",
    "dateIssued",
    "dateExpired",
    "filters"
})
@XmlRootElement(name = "DeliveryOfDocumentsDatesEdit")
public class DeliveryOfDocumentsDatesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_DeliveryOfDocuments")
    protected int idDeliveryOfDocuments;
    protected String dateIssued;
    protected String dateExpired;
    protected String filters;

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
     * Gets the value of the idDeliveryOfDocuments property.
     * 
     */
    public int getIdDeliveryOfDocuments() {
        return idDeliveryOfDocuments;
    }

    /**
     * Sets the value of the idDeliveryOfDocuments property.
     * 
     */
    public void setIdDeliveryOfDocuments(int value) {
        this.idDeliveryOfDocuments = value;
    }

    /**
     * Gets the value of the dateIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateIssued() {
        return dateIssued;
    }

    /**
     * Sets the value of the dateIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateIssued(String value) {
        this.dateIssued = value;
    }

    /**
     * Gets the value of the dateExpired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateExpired() {
        return dateExpired;
    }

    /**
     * Sets the value of the dateExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateExpired(String value) {
        this.dateExpired = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilters(String value) {
        this.filters = value;
    }

}
