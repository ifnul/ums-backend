
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonRequestSeasonRequestAddCustomUniversitySetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestSeasonRequestAddCustomUniversitySetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestSeasonRequestAddCustomUniversitySetting" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestAddDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequestAddDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fdel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AccessType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccessTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestSeasonRequestAddCustomUniversitySetting", propOrder = {
    "idPersonRequestSeasonRequestAddCustomUniversitySetting",
    "idPersonRequestSeasons",
    "universityKode",
    "requestAddDateBegin",
    "requestAddDateEnd",
    "fdel",
    "dateLastChange",
    "accessType",
    "accessTypeName",
    "settingDescription"
})
public class DPersonRequestSeasonRequestAddCustomUniversitySetting {

    @XmlElement(name = "Id_PersonRequestSeasonRequestAddCustomUniversitySetting")
    protected int idPersonRequestSeasonRequestAddCustomUniversitySetting;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "RequestAddDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestAddDateBegin;
    @XmlElement(name = "RequestAddDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestAddDateEnd;
    protected int fdel;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "AccessType")
    protected int accessType;
    @XmlElement(name = "AccessTypeName")
    protected String accessTypeName;
    @XmlElement(name = "SettingDescription")
    protected String settingDescription;

    /**
     * Gets the value of the idPersonRequestSeasonRequestAddCustomUniversitySetting property.
     * 
     */
    public int getIdPersonRequestSeasonRequestAddCustomUniversitySetting() {
        return idPersonRequestSeasonRequestAddCustomUniversitySetting;
    }

    /**
     * Sets the value of the idPersonRequestSeasonRequestAddCustomUniversitySetting property.
     * 
     */
    public void setIdPersonRequestSeasonRequestAddCustomUniversitySetting(int value) {
        this.idPersonRequestSeasonRequestAddCustomUniversitySetting = value;
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
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the requestAddDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestAddDateBegin() {
        return requestAddDateBegin;
    }

    /**
     * Sets the value of the requestAddDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestAddDateBegin(XMLGregorianCalendar value) {
        this.requestAddDateBegin = value;
    }

    /**
     * Gets the value of the requestAddDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestAddDateEnd() {
        return requestAddDateEnd;
    }

    /**
     * Sets the value of the requestAddDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestAddDateEnd(XMLGregorianCalendar value) {
        this.requestAddDateEnd = value;
    }

    /**
     * Gets the value of the fdel property.
     * 
     */
    public int getFdel() {
        return fdel;
    }

    /**
     * Sets the value of the fdel property.
     * 
     */
    public void setFdel(int value) {
        this.fdel = value;
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
     * Gets the value of the accessType property.
     * 
     */
    public int getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     */
    public void setAccessType(int value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the accessTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessTypeName() {
        return accessTypeName;
    }

    /**
     * Sets the value of the accessTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessTypeName(String value) {
        this.accessTypeName = value;
    }

    /**
     * Gets the value of the settingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingDescription() {
        return settingDescription;
    }

    /**
     * Sets the value of the settingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingDescription(String value) {
        this.settingDescription = value;
    }

}
