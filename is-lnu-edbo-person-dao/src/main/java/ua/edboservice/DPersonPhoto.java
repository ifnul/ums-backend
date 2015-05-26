
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonPhoto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonPhoto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonPhoto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonPhotoDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonPhotoIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dPersonPhoto", propOrder = {
    "idPersonPhoto",
    "personPhotoDateLastChange",
    "personPhotoIsActive",
    "personCodeU",
    "personPhotoBase64String"
})
public class DPersonPhoto {

    @XmlElement(name = "Id_PersonPhoto")
    protected int idPersonPhoto;
    @XmlElement(name = "PersonPhotoDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personPhotoDateLastChange;
    @XmlElement(name = "PersonPhotoIsActive")
    protected int personPhotoIsActive;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "PersonPhotoBase64String")
    protected String personPhotoBase64String;

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
     * Gets the value of the personPhotoDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonPhotoDateLastChange() {
        return personPhotoDateLastChange;
    }

    /**
     * Sets the value of the personPhotoDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonPhotoDateLastChange(XMLGregorianCalendar value) {
        this.personPhotoDateLastChange = value;
    }

    /**
     * Gets the value of the personPhotoIsActive property.
     * 
     */
    public int getPersonPhotoIsActive() {
        return personPhotoIsActive;
    }

    /**
     * Sets the value of the personPhotoIsActive property.
     * 
     */
    public void setPersonPhotoIsActive(int value) {
        this.personPhotoIsActive = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
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
