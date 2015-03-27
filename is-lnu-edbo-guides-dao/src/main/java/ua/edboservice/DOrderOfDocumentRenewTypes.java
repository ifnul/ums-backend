
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dOrderOfDocumentRenewTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrderOfDocumentRenewTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrderOfDocumentRenewType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentRenewTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrderOfDocumentRenewTypes", propOrder = {
    "idOrderOfDocumentRenewType",
    "orderOfDocumentRenewTypeName"
})
public class DOrderOfDocumentRenewTypes {

    @XmlElement(name = "Id_OrderOfDocumentRenewType")
    protected int idOrderOfDocumentRenewType;
    @XmlElement(name = "OrderOfDocumentRenewTypeName")
    protected String orderOfDocumentRenewTypeName;

    /**
     * Gets the value of the idOrderOfDocumentRenewType property.
     * 
     */
    public int getIdOrderOfDocumentRenewType() {
        return idOrderOfDocumentRenewType;
    }

    /**
     * Sets the value of the idOrderOfDocumentRenewType property.
     * 
     */
    public void setIdOrderOfDocumentRenewType(int value) {
        this.idOrderOfDocumentRenewType = value;
    }

    /**
     * Gets the value of the orderOfDocumentRenewTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentRenewTypeName() {
        return orderOfDocumentRenewTypeName;
    }

    /**
     * Sets the value of the orderOfDocumentRenewTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentRenewTypeName(String value) {
        this.orderOfDocumentRenewTypeName = value;
    }

}
