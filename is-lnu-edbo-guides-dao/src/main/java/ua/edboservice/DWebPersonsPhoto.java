
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dWebPersonsPhoto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebPersonsPhoto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebPersonsPhoto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebPersonsPhoto", propOrder = {
    "idWebPersonsPhoto",
    "idWebPersons",
    "webPersonsPhoto"
})
public class DWebPersonsPhoto {

    @XmlElement(name = "Id_WebPersonsPhoto")
    protected int idWebPersonsPhoto;
    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "WebPersonsPhoto")
    protected String webPersonsPhoto;

    /**
     * Gets the value of the idWebPersonsPhoto property.
     * 
     */
    public int getIdWebPersonsPhoto() {
        return idWebPersonsPhoto;
    }

    /**
     * Sets the value of the idWebPersonsPhoto property.
     * 
     */
    public void setIdWebPersonsPhoto(int value) {
        this.idWebPersonsPhoto = value;
    }

    /**
     * Gets the value of the idWebPersons property.
     * 
     */
    public int getIdWebPersons() {
        return idWebPersons;
    }

    /**
     * Sets the value of the idWebPersons property.
     * 
     */
    public void setIdWebPersons(int value) {
        this.idWebPersons = value;
    }

    /**
     * Gets the value of the webPersonsPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPersonsPhoto() {
        return webPersonsPhoto;
    }

    /**
     * Sets the value of the webPersonsPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPersonsPhoto(String value) {
        this.webPersonsPhoto = value;
    }

}
