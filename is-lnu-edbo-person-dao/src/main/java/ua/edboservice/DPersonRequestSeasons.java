
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonRequestSeasons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestSeasons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestPerPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasonDetails" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateBeginPersonRequestSeason" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateEndPersonRequestSeason" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestSeasons", propOrder = {
    "idPersonRequestSeasons",
    "name",
    "requestPerPerson",
    "closed",
    "idPersonRequestSeasonDetails",
    "idPersonEducationForm",
    "personEducationFormName",
    "dateBeginPersonRequestSeason",
    "dateEndPersonRequestSeason"
})
public class DPersonRequestSeasons {

    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RequestPerPerson")
    protected int requestPerPerson;
    @XmlElement(name = "Closed")
    protected int closed;
    @XmlElement(name = "Id_PersonRequestSeasonDetails")
    protected int idPersonRequestSeasonDetails;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "DateBeginPersonRequestSeason", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBeginPersonRequestSeason;
    @XmlElement(name = "DateEndPersonRequestSeason", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEndPersonRequestSeason;

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the requestPerPerson property.
     * 
     */
    public int getRequestPerPerson() {
        return requestPerPerson;
    }

    /**
     * Sets the value of the requestPerPerson property.
     * 
     */
    public void setRequestPerPerson(int value) {
        this.requestPerPerson = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     */
    public int getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     */
    public void setClosed(int value) {
        this.closed = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasonDetails property.
     * 
     */
    public int getIdPersonRequestSeasonDetails() {
        return idPersonRequestSeasonDetails;
    }

    /**
     * Sets the value of the idPersonRequestSeasonDetails property.
     * 
     */
    public void setIdPersonRequestSeasonDetails(int value) {
        this.idPersonRequestSeasonDetails = value;
    }

    /**
     * Gets the value of the idPersonEducationForm property.
     * 
     */
    public int getIdPersonEducationForm() {
        return idPersonEducationForm;
    }

    /**
     * Sets the value of the idPersonEducationForm property.
     * 
     */
    public void setIdPersonEducationForm(int value) {
        this.idPersonEducationForm = value;
    }

    /**
     * Gets the value of the personEducationFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationFormName() {
        return personEducationFormName;
    }

    /**
     * Sets the value of the personEducationFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationFormName(String value) {
        this.personEducationFormName = value;
    }

    /**
     * Gets the value of the dateBeginPersonRequestSeason property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBeginPersonRequestSeason() {
        return dateBeginPersonRequestSeason;
    }

    /**
     * Sets the value of the dateBeginPersonRequestSeason property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBeginPersonRequestSeason(XMLGregorianCalendar value) {
        this.dateBeginPersonRequestSeason = value;
    }

    /**
     * Gets the value of the dateEndPersonRequestSeason property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEndPersonRequestSeason() {
        return dateEndPersonRequestSeason;
    }

    /**
     * Sets the value of the dateEndPersonRequestSeason property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEndPersonRequestSeason(XMLGregorianCalendar value) {
        this.dateEndPersonRequestSeason = value;
    }

}
