
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dOrderOfDocumentsAddRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrderOfDocumentsAddRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrderOfDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Errors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrderOfDocumentsAddRet", propOrder = {
    "idOrderOfDocument",
    "errors"
})
public class DOrderOfDocumentsAddRet {

    @XmlElement(name = "Id_OrderOfDocument")
    protected int idOrderOfDocument;
    @XmlElement(name = "Errors")
    protected String errors;

    /**
     * Gets the value of the idOrderOfDocument property.
     * 
     */
    public int getIdOrderOfDocument() {
        return idOrderOfDocument;
    }

    /**
     * Sets the value of the idOrderOfDocument property.
     * 
     */
    public void setIdOrderOfDocument(int value) {
        this.idOrderOfDocument = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrors(String value) {
        this.errors = value;
    }

}
