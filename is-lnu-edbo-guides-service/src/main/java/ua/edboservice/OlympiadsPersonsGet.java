
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
 *         &lt;element name="Id_Olimpiad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OlympiadPersonsSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idOlimpiad",
    "idOlympiadPersonsSubject"
})
@XmlRootElement(name = "OlympiadsPersonsGet")
public class OlympiadsPersonsGet {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Olimpiad")
    protected int idOlimpiad;
    @XmlElement(name = "Id_OlympiadPersonsSubject")
    protected int idOlympiadPersonsSubject;

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
     * Gets the value of the idOlimpiad property.
     * 
     */
    public int getIdOlimpiad() {
        return idOlimpiad;
    }

    /**
     * Sets the value of the idOlimpiad property.
     * 
     */
    public void setIdOlimpiad(int value) {
        this.idOlimpiad = value;
    }

    /**
     * Gets the value of the idOlympiadPersonsSubject property.
     * 
     */
    public int getIdOlympiadPersonsSubject() {
        return idOlympiadPersonsSubject;
    }

    /**
     * Sets the value of the idOlympiadPersonsSubject property.
     * 
     */
    public void setIdOlympiadPersonsSubject(int value) {
        this.idOlympiadPersonsSubject = value;
    }

}
