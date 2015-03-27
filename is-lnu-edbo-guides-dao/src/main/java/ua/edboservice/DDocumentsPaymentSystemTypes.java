
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dDocumentsPaymentSystemTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDocumentsPaymentSystemTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_DocumentsPaymentSystemType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentsPaymentSystemTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDocumentsPaymentSystemTypes", propOrder = {
    "idDocumentsPaymentSystemType",
    "documentsPaymentSystemTypeName"
})
public class DDocumentsPaymentSystemTypes {

    @XmlElement(name = "Id_DocumentsPaymentSystemType")
    protected int idDocumentsPaymentSystemType;
    @XmlElement(name = "DocumentsPaymentSystemTypeName")
    protected String documentsPaymentSystemTypeName;

    /**
     * Gets the value of the idDocumentsPaymentSystemType property.
     * 
     */
    public int getIdDocumentsPaymentSystemType() {
        return idDocumentsPaymentSystemType;
    }

    /**
     * Sets the value of the idDocumentsPaymentSystemType property.
     * 
     */
    public void setIdDocumentsPaymentSystemType(int value) {
        this.idDocumentsPaymentSystemType = value;
    }

    /**
     * Gets the value of the documentsPaymentSystemTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsPaymentSystemTypeName() {
        return documentsPaymentSystemTypeName;
    }

    /**
     * Sets the value of the documentsPaymentSystemTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsPaymentSystemTypeName(String value) {
        this.documentsPaymentSystemTypeName = value;
    }

}
