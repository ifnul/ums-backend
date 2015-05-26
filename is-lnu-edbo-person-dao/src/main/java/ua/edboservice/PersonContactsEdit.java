
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
 *         &lt;element name="Id_PersonContact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonContactType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonContact",
    "idPersonContactType",
    "value"
})
@XmlRootElement(name = "PersonContactsEdit")
public class PersonContactsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonContact")
    protected int idPersonContact;
    @XmlElement(name = "Id_PersonContactType")
    protected int idPersonContactType;
    @XmlElement(name = "Value")
    protected String value;

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
     * Gets the value of the idPersonContact property.
     * 
     */
    public int getIdPersonContact() {
        return idPersonContact;
    }

    /**
     * Sets the value of the idPersonContact property.
     * 
     */
    public void setIdPersonContact(int value) {
        this.idPersonContact = value;
    }

    /**
     * Gets the value of the idPersonContactType property.
     * 
     */
    public int getIdPersonContactType() {
        return idPersonContactType;
    }

    /**
     * Sets the value of the idPersonContactType property.
     * 
     */
    public void setIdPersonContactType(int value) {
        this.idPersonContactType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
