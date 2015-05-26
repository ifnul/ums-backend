
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
 *         &lt;element name="ActionNamen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "actionNamen",
    "actionText"
})
@XmlRootElement(name = "SaveHistory")
public class SaveHistory {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "ActionNamen")
    protected String actionNamen;
    @XmlElement(name = "ActionText")
    protected String actionText;

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
     * Gets the value of the actionNamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionNamen() {
        return actionNamen;
    }

    /**
     * Sets the value of the actionNamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionNamen(String value) {
        this.actionNamen = value;
    }

    /**
     * Gets the value of the actionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionText() {
        return actionText;
    }

    /**
     * Sets the value of the actionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionText(String value) {
        this.actionText = value;
    }

}
