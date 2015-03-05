
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
 *         &lt;element name="Id_UniversityOrderRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequestsDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SourceOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idUniversityOrderRequests",
    "idUniversityOrderRequestsDataType",
    "idSourceOrder"
})
@XmlRootElement(name = "UniversityOrderRequestsDataAdd")
public class UniversityOrderRequestsDataAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityOrderRequests")
    protected int idUniversityOrderRequests;
    @XmlElement(name = "Id_UniversityOrderRequestsDataType")
    protected int idUniversityOrderRequestsDataType;
    @XmlElement(name = "Id_SourceOrder")
    protected int idSourceOrder;

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
     * Gets the value of the idUniversityOrderRequests property.
     * 
     */
    public int getIdUniversityOrderRequests() {
        return idUniversityOrderRequests;
    }

    /**
     * Sets the value of the idUniversityOrderRequests property.
     * 
     */
    public void setIdUniversityOrderRequests(int value) {
        this.idUniversityOrderRequests = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequestsDataType property.
     * 
     */
    public int getIdUniversityOrderRequestsDataType() {
        return idUniversityOrderRequestsDataType;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsDataType property.
     * 
     */
    public void setIdUniversityOrderRequestsDataType(int value) {
        this.idUniversityOrderRequestsDataType = value;
    }

    /**
     * Gets the value of the idSourceOrder property.
     * 
     */
    public int getIdSourceOrder() {
        return idSourceOrder;
    }

    /**
     * Sets the value of the idSourceOrder property.
     * 
     */
    public void setIdSourceOrder(int value) {
        this.idSourceOrder = value;
    }

}
