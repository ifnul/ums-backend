
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
 *         &lt;element name="Id_Risk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConfirmetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descriptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idRisk",
    "confirmetType",
    "descriptions"
})
@XmlRootElement(name = "RisksConfirmChange")
public class RisksConfirmChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Risk")
    protected int idRisk;
    @XmlElement(name = "ConfirmetType")
    protected int confirmetType;
    @XmlElement(name = "Descriptions")
    protected String descriptions;

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
     * Gets the value of the idRisk property.
     * 
     */
    public int getIdRisk() {
        return idRisk;
    }

    /**
     * Sets the value of the idRisk property.
     * 
     */
    public void setIdRisk(int value) {
        this.idRisk = value;
    }

    /**
     * Gets the value of the confirmetType property.
     * 
     */
    public int getConfirmetType() {
        return confirmetType;
    }

    /**
     * Sets the value of the confirmetType property.
     * 
     */
    public void setConfirmetType(int value) {
        this.confirmetType = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptions(String value) {
        this.descriptions = value;
    }

}
