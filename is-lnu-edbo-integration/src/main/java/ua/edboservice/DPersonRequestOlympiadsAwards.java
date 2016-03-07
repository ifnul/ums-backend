
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonRequestOlympiadsAwards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestOlympiadsAwards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestOlympiadAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonOlympiadAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestOlympiadAwardBonus" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DateLastChangePersonRequestOlympiadAward" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OlympiadAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OlympiadAwardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Olimpiad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OlimpiadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestOlympiadsAwards", propOrder = {
    "idPersonRequestOlympiadAward",
    "idPersonRequest",
    "idPersonOlympiadAward",
    "personRequestOlympiadAwardBonus",
    "dateLastChangePersonRequestOlympiadAward",
    "idPerson",
    "idOlympiadAward",
    "olympiadAwardName",
    "idOlimpiad",
    "idPersonRequestSeasons",
    "olimpiadName"
})
public class DPersonRequestOlympiadsAwards {

    @XmlElement(name = "Id_PersonRequestOlympiadAward")
    protected int idPersonRequestOlympiadAward;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_PersonOlympiadAward")
    protected int idPersonOlympiadAward;
    @XmlElement(name = "PersonRequestOlympiadAwardBonus", required = true)
    protected BigDecimal personRequestOlympiadAwardBonus;
    @XmlElement(name = "DateLastChangePersonRequestOlympiadAward", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChangePersonRequestOlympiadAward;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Id_OlympiadAward")
    protected int idOlympiadAward;
    @XmlElement(name = "OlympiadAwardName")
    protected String olympiadAwardName;
    @XmlElement(name = "Id_Olimpiad")
    protected int idOlimpiad;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "OlimpiadName")
    protected String olimpiadName;

    /**
     * Gets the value of the idPersonRequestOlympiadAward property.
     * 
     */
    public int getIdPersonRequestOlympiadAward() {
        return idPersonRequestOlympiadAward;
    }

    /**
     * Sets the value of the idPersonRequestOlympiadAward property.
     * 
     */
    public void setIdPersonRequestOlympiadAward(int value) {
        this.idPersonRequestOlympiadAward = value;
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
     * Gets the value of the idPersonOlympiadAward property.
     * 
     */
    public int getIdPersonOlympiadAward() {
        return idPersonOlympiadAward;
    }

    /**
     * Sets the value of the idPersonOlympiadAward property.
     * 
     */
    public void setIdPersonOlympiadAward(int value) {
        this.idPersonOlympiadAward = value;
    }

    /**
     * Gets the value of the personRequestOlympiadAwardBonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPersonRequestOlympiadAwardBonus() {
        return personRequestOlympiadAwardBonus;
    }

    /**
     * Sets the value of the personRequestOlympiadAwardBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPersonRequestOlympiadAwardBonus(BigDecimal value) {
        this.personRequestOlympiadAwardBonus = value;
    }

    /**
     * Gets the value of the dateLastChangePersonRequestOlympiadAward property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChangePersonRequestOlympiadAward() {
        return dateLastChangePersonRequestOlympiadAward;
    }

    /**
     * Sets the value of the dateLastChangePersonRequestOlympiadAward property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChangePersonRequestOlympiadAward(XMLGregorianCalendar value) {
        this.dateLastChangePersonRequestOlympiadAward = value;
    }

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the idOlympiadAward property.
     * 
     */
    public int getIdOlympiadAward() {
        return idOlympiadAward;
    }

    /**
     * Sets the value of the idOlympiadAward property.
     * 
     */
    public void setIdOlympiadAward(int value) {
        this.idOlympiadAward = value;
    }

    /**
     * Gets the value of the olympiadAwardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlympiadAwardName() {
        return olympiadAwardName;
    }

    /**
     * Sets the value of the olympiadAwardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlympiadAwardName(String value) {
        this.olympiadAwardName = value;
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
     * Gets the value of the olimpiadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlimpiadName() {
        return olimpiadName;
    }

    /**
     * Sets the value of the olimpiadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlimpiadName(String value) {
        this.olimpiadName = value;
    }

}
