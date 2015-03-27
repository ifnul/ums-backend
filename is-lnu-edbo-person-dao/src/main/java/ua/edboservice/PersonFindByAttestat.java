
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
 *         &lt;element name="AtestatSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtestatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "atestatSeries",
    "atestatNumber"
})
@XmlRootElement(name = "PersonFindByAttestat")
public class PersonFindByAttestat {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "AtestatSeries")
    protected String atestatSeries;
    @XmlElement(name = "AtestatNumber")
    protected String atestatNumber;

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
     * Gets the value of the atestatSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtestatSeries() {
        return atestatSeries;
    }

    /**
     * Sets the value of the atestatSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtestatSeries(String value) {
        this.atestatSeries = value;
    }

    /**
     * Gets the value of the atestatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtestatNumber() {
        return atestatNumber;
    }

    /**
     * Sets the value of the atestatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtestatNumber(String value) {
        this.atestatNumber = value;
    }

}
