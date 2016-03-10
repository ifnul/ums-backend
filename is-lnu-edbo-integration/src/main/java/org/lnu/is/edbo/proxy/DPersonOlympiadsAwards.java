
package org.lnu.is.edbo.proxy;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonOlympiadsAwards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonOlympiadsAwards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonOlympiadAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OlympiadAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChangePersonOlympiadAward" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OlympiadAwardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OlympiadAwardBonus" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "dPersonOlympiadsAwards", propOrder = {
    "idPersonOlympiadAward",
    "idPerson",
    "idOlympiadAward",
    "dateLastChangePersonOlympiadAward",
    "olympiadAwardName",
    "olympiadAwardBonus",
    "idOlimpiad",
    "idPersonRequestSeasons",
    "olimpiadName"
})
public class DPersonOlympiadsAwards {

    @XmlElement(name = "Id_PersonOlympiadAward")
    protected int idPersonOlympiadAward;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Id_OlympiadAward")
    protected int idOlympiadAward;
    @XmlElement(name = "DateLastChangePersonOlympiadAward", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChangePersonOlympiadAward;
    @XmlElement(name = "OlympiadAwardName")
    protected String olympiadAwardName;
    @XmlElement(name = "OlympiadAwardBonus", required = true)
    protected BigDecimal olympiadAwardBonus;
    @XmlElement(name = "Id_Olimpiad")
    protected int idOlimpiad;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "OlimpiadName")
    protected String olimpiadName;

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
     * Gets the value of the dateLastChangePersonOlympiadAward property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChangePersonOlympiadAward() {
        return dateLastChangePersonOlympiadAward;
    }

    /**
     * Sets the value of the dateLastChangePersonOlympiadAward property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChangePersonOlympiadAward(XMLGregorianCalendar value) {
        this.dateLastChangePersonOlympiadAward = value;
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
     * Gets the value of the olympiadAwardBonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOlympiadAwardBonus() {
        return olympiadAwardBonus;
    }

    /**
     * Sets the value of the olympiadAwardBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOlympiadAwardBonus(BigDecimal value) {
        this.olympiadAwardBonus = value;
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
