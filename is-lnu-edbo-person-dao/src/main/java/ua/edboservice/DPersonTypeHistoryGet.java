
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonTypeHistoryGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonTypeHistoryGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonTypeDict" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descriptyon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonTypeHistoryGet", propOrder = {
    "idPersonType",
    "personCodeU",
    "idPersonTypeDict",
    "dateLastChange",
    "isActive",
    "personTypeName",
    "descriptyon"
})
public class DPersonTypeHistoryGet {

    @XmlElement(name = "Id_PersonType")
    protected int idPersonType;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_PersonTypeDict")
    protected int idPersonTypeDict;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "PersonTypeName")
    protected String personTypeName;
    @XmlElement(name = "Descriptyon")
    protected String descriptyon;

    /**
     * Gets the value of the idPersonType property.
     * 
     */
    public int getIdPersonType() {
        return idPersonType;
    }

    /**
     * Sets the value of the idPersonType property.
     * 
     */
    public void setIdPersonType(int value) {
        this.idPersonType = value;
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
     * Gets the value of the idPersonTypeDict property.
     * 
     */
    public int getIdPersonTypeDict() {
        return idPersonTypeDict;
    }

    /**
     * Sets the value of the idPersonTypeDict property.
     * 
     */
    public void setIdPersonTypeDict(int value) {
        this.idPersonTypeDict = value;
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
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the personTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonTypeName() {
        return personTypeName;
    }

    /**
     * Sets the value of the personTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonTypeName(String value) {
        this.personTypeName = value;
    }

    /**
     * Gets the value of the descriptyon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptyon() {
        return descriptyon;
    }

    /**
     * Sets the value of the descriptyon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptyon(String value) {
        this.descriptyon = value;
    }

}
