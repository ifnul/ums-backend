
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
 *         &lt;element name="GovernmentAwardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GovernmentAwardDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GovernmentAwardDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_GovernmentAwardsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "governmentAwardName",
    "governmentAwardDateBegin",
    "governmentAwardDateEnd",
    "idGovernmentAwardsTypes"
})
@XmlRootElement(name = "GovernmentAwardsAdd")
public class GovernmentAwardsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "GovernmentAwardName")
    protected String governmentAwardName;
    @XmlElement(name = "GovernmentAwardDateBegin")
    protected String governmentAwardDateBegin;
    @XmlElement(name = "GovernmentAwardDateEnd")
    protected String governmentAwardDateEnd;
    @XmlElement(name = "Id_GovernmentAwardsTypes")
    protected int idGovernmentAwardsTypes;

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
     * Gets the value of the governmentAwardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentAwardName() {
        return governmentAwardName;
    }

    /**
     * Sets the value of the governmentAwardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentAwardName(String value) {
        this.governmentAwardName = value;
    }

    /**
     * Gets the value of the governmentAwardDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentAwardDateBegin() {
        return governmentAwardDateBegin;
    }

    /**
     * Sets the value of the governmentAwardDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentAwardDateBegin(String value) {
        this.governmentAwardDateBegin = value;
    }

    /**
     * Gets the value of the governmentAwardDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentAwardDateEnd() {
        return governmentAwardDateEnd;
    }

    /**
     * Sets the value of the governmentAwardDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentAwardDateEnd(String value) {
        this.governmentAwardDateEnd = value;
    }

    /**
     * Gets the value of the idGovernmentAwardsTypes property.
     * 
     */
    public int getIdGovernmentAwardsTypes() {
        return idGovernmentAwardsTypes;
    }

    /**
     * Sets the value of the idGovernmentAwardsTypes property.
     * 
     */
    public void setIdGovernmentAwardsTypes(int value) {
        this.idGovernmentAwardsTypes = value;
    }

}
