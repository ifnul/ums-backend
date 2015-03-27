
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
 *         &lt;element name="Id_PersonPhoto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonPhotoBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonPhoto",
    "personPhotoBase64String"
})
@XmlRootElement(name = "PersonPhotoChane")
public class PersonPhotoChane {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonPhoto")
    protected int idPersonPhoto;
    @XmlElement(name = "PersonPhotoBase64String")
    protected String personPhotoBase64String;

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
     * Gets the value of the idPersonPhoto property.
     * 
     */
    public int getIdPersonPhoto() {
        return idPersonPhoto;
    }

    /**
     * Sets the value of the idPersonPhoto property.
     * 
     */
    public void setIdPersonPhoto(int value) {
        this.idPersonPhoto = value;
    }

    /**
     * Gets the value of the personPhotoBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonPhotoBase64String() {
        return personPhotoBase64String;
    }

    /**
     * Sets the value of the personPhotoBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonPhotoBase64String(String value) {
        this.personPhotoBase64String = value;
    }

}
