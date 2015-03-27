
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
 *         &lt;element name="Id_OrderOfDocumentsSendPackageData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentsSendPackageDataStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idOrderOfDocumentsSendPackageData",
    "idOrderOfDocumentsSendPackageDataStatusType"
})
@XmlRootElement(name = "OrderOfDocumentsSendPackageDataStatusChange")
public class OrderOfDocumentsSendPackageDataStatusChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackageData")
    protected int idOrderOfDocumentsSendPackageData;
    @XmlElement(name = "Id_OrderOfDocumentsSendPackageDataStatusType")
    protected int idOrderOfDocumentsSendPackageDataStatusType;

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
     * Gets the value of the idOrderOfDocumentsSendPackageData property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackageData() {
        return idOrderOfDocumentsSendPackageData;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackageData property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackageData(int value) {
        this.idOrderOfDocumentsSendPackageData = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentsSendPackageDataStatusType property.
     * 
     */
    public int getIdOrderOfDocumentsSendPackageDataStatusType() {
        return idOrderOfDocumentsSendPackageDataStatusType;
    }

    /**
     * Sets the value of the idOrderOfDocumentsSendPackageDataStatusType property.
     * 
     */
    public void setIdOrderOfDocumentsSendPackageDataStatusType(int value) {
        this.idOrderOfDocumentsSendPackageDataStatusType = value;
    }

}
