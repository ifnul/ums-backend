
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOlympiads2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOlympiads2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Olimpiad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OlimpiadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequestSeasonsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOlympiads2", propOrder = {
    "idOlimpiad",
    "idPersonRequestSeasons",
    "olimpiadName",
    "dateLastChange",
    "requestSeasonsName"
})
public class DOlympiads2 {

    @XmlElement(name = "Id_Olimpiad")
    protected int idOlimpiad;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "OlimpiadName")
    protected String olimpiadName;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "RequestSeasonsName")
    protected String requestSeasonsName;

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

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

    /**
     * Gets the value of the requestSeasonsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestSeasonsName() {
        return requestSeasonsName;
    }

    /**
     * Sets the value of the requestSeasonsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestSeasonsName(String value) {
        this.requestSeasonsName = value;
    }

}
