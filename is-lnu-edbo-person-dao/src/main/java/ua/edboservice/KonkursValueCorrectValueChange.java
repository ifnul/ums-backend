
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
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KonkursValueCorrectValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KonkursValueCorrectValueDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonRequest",
    "konkursValueCorrectValue",
    "konkursValueCorrectValueDescription"
})
@XmlRootElement(name = "KonkursValueCorrectValueChange")
public class KonkursValueCorrectValueChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "KonkursValueCorrectValue")
    protected String konkursValueCorrectValue;
    @XmlElement(name = "KonkursValueCorrectValueDescription")
    protected String konkursValueCorrectValueDescription;

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
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the konkursValueCorrectValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonkursValueCorrectValue() {
        return konkursValueCorrectValue;
    }

    /**
     * Sets the value of the konkursValueCorrectValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonkursValueCorrectValue(String value) {
        this.konkursValueCorrectValue = value;
    }

    /**
     * Gets the value of the konkursValueCorrectValueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonkursValueCorrectValueDescription() {
        return konkursValueCorrectValueDescription;
    }

    /**
     * Sets the value of the konkursValueCorrectValueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonkursValueCorrectValueDescription(String value) {
        this.konkursValueCorrectValueDescription = value;
    }

}
