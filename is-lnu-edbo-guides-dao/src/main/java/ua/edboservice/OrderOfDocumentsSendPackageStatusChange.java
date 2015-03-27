
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
 *         &lt;element name="Id_OrderOfDocumentsSendPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentsSendPackageStatuseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idOrderOfDocumentsSendPackage",
    "idOrderOfDocumentsSendPackageStatuseType"
})
@XmlRootElement(name = "OrderOfDocumentsSendPackageStatusChange")
public class OrderOfDocumentsSendPackageStatusChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackage")
    protected int idOrderOfDocumentsSendPackage;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackageStatuseType")
    protected int idOrderOfDocumentsSendPackageStatuseType;

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

}
