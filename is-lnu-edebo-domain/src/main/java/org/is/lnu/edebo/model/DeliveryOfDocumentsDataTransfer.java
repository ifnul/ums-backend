//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.27 at 12:51:32 AM EET 
//


package org.is.lnu.edebo.model;

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
 *         &lt;element name="Id_DeliveryOfDocumentsFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DeliveryOfDocumentsTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DeliveryOfDocumentsDatas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAll" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idDeliveryOfDocumentsFrom",
    "idDeliveryOfDocumentsTo",
    "idDeliveryOfDocumentsDatas",
    "isAll"
})
@XmlRootElement(name = "DeliveryOfDocumentsDataTransfer")
public class DeliveryOfDocumentsDataTransfer {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_DeliveryOfDocumentsFrom")
    protected int idDeliveryOfDocumentsFrom;
    @XmlElement(name = "Id_DeliveryOfDocumentsTo")
    protected int idDeliveryOfDocumentsTo;
    @XmlElement(name = "Id_DeliveryOfDocumentsDatas")
    protected String idDeliveryOfDocumentsDatas;
    protected int isAll;

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
     * Gets the value of the idDeliveryOfDocumentsFrom property.
     * 
     */
    public int getIdDeliveryOfDocumentsFrom() {
        return idDeliveryOfDocumentsFrom;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsFrom property.
     * 
     */
    public void setIdDeliveryOfDocumentsFrom(int value) {
        this.idDeliveryOfDocumentsFrom = value;
    }

    /**
     * Gets the value of the idDeliveryOfDocumentsTo property.
     * 
     */
    public int getIdDeliveryOfDocumentsTo() {
        return idDeliveryOfDocumentsTo;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsTo property.
     * 
     */
    public void setIdDeliveryOfDocumentsTo(int value) {
        this.idDeliveryOfDocumentsTo = value;
    }

    /**
     * Gets the value of the idDeliveryOfDocumentsDatas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDeliveryOfDocumentsDatas() {
        return idDeliveryOfDocumentsDatas;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDeliveryOfDocumentsDatas(String value) {
        this.idDeliveryOfDocumentsDatas = value;
    }

    /**
     * Gets the value of the isAll property.
     * 
     */
    public int getIsAll() {
        return isAll;
    }

    /**
     * Sets the value of the isAll property.
     * 
     */
    public void setIsAll(int value) {
        this.isAll = value;
    }

}
