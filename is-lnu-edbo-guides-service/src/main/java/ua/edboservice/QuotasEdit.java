
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
 *         &lt;element name="Id_Quota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuotaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuotaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idQuota",
    "quotaName",
    "quotaDescription"
})
@XmlRootElement(name = "QuotasEdit")
public class QuotasEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Quota")
    protected int idQuota;
    @XmlElement(name = "QuotaName")
    protected String quotaName;
    @XmlElement(name = "QuotaDescription")
    protected String quotaDescription;

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
     * Gets the value of the idQuota property.
     * 
     */
    public int getIdQuota() {
        return idQuota;
    }

    /**
     * Sets the value of the idQuota property.
     * 
     */
    public void setIdQuota(int value) {
        this.idQuota = value;
    }

    /**
     * Gets the value of the quotaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaName() {
        return quotaName;
    }

    /**
     * Sets the value of the quotaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaName(String value) {
        this.quotaName = value;
    }

    /**
     * Gets the value of the quotaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaDescription() {
        return quotaDescription;
    }

    /**
     * Sets the value of the quotaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaDescription(String value) {
        this.quotaDescription = value;
    }

}
