
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityOrderRequestsCalendar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityOrderRequestsCalendar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityOrderRequestsCalendar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SteepTimeBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SteepTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SteepSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequestsCalendarSteepType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsOccupied" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OccupiedToAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OccupiedEndDayToAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BlockForUserView" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsTechnikalRelaxInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityOrderRequestsCalendar", propOrder = {
    "idUniversityOrderRequestsCalendar",
    "date",
    "steepTimeBegin",
    "steepTimeEnd",
    "steepSeconds",
    "idUniversityOrderRequestsCalendarSteepType",
    "isOccupied",
    "idUniversityOrderRequests",
    "occupiedToAdd",
    "occupiedEndDayToAdd",
    "blockForUserView",
    "isTechnikalRelaxInterval"
})
public class DUniversityOrderRequestsCalendar {

    @XmlElement(name = "Id_UniversityOrderRequestsCalendar")
    protected int idUniversityOrderRequestsCalendar;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "SteepTimeBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar steepTimeBegin;
    @XmlElement(name = "SteepTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar steepTimeEnd;
    @XmlElement(name = "SteepSeconds")
    protected int steepSeconds;
    @XmlElement(name = "Id_UniversityOrderRequestsCalendarSteepType")
    protected int idUniversityOrderRequestsCalendarSteepType;
    @XmlElement(name = "IsOccupied")
    protected int isOccupied;
    @XmlElement(name = "Id_UniversityOrderRequests")
    protected int idUniversityOrderRequests;
    @XmlElement(name = "OccupiedToAdd")
    protected int occupiedToAdd;
    @XmlElement(name = "OccupiedEndDayToAdd")
    protected int occupiedEndDayToAdd;
    @XmlElement(name = "BlockForUserView")
    protected int blockForUserView;
    @XmlElement(name = "IsTechnikalRelaxInterval")
    protected int isTechnikalRelaxInterval;

    /**
     * Gets the value of the idUniversityOrderRequestsCalendar property.
     * 
     */
    public int getIdUniversityOrderRequestsCalendar() {
        return idUniversityOrderRequestsCalendar;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsCalendar property.
     * 
     */
    public void setIdUniversityOrderRequestsCalendar(int value) {
        this.idUniversityOrderRequestsCalendar = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the steepTimeBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSteepTimeBegin() {
        return steepTimeBegin;
    }

    /**
     * Sets the value of the steepTimeBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSteepTimeBegin(XMLGregorianCalendar value) {
        this.steepTimeBegin = value;
    }

    /**
     * Gets the value of the steepTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSteepTimeEnd() {
        return steepTimeEnd;
    }

    /**
     * Sets the value of the steepTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSteepTimeEnd(XMLGregorianCalendar value) {
        this.steepTimeEnd = value;
    }

    /**
     * Gets the value of the steepSeconds property.
     * 
     */
    public int getSteepSeconds() {
        return steepSeconds;
    }

    /**
     * Sets the value of the steepSeconds property.
     * 
     */
    public void setSteepSeconds(int value) {
        this.steepSeconds = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequestsCalendarSteepType property.
     * 
     */
    public int getIdUniversityOrderRequestsCalendarSteepType() {
        return idUniversityOrderRequestsCalendarSteepType;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsCalendarSteepType property.
     * 
     */
    public void setIdUniversityOrderRequestsCalendarSteepType(int value) {
        this.idUniversityOrderRequestsCalendarSteepType = value;
    }

    /**
     * Gets the value of the isOccupied property.
     * 
     */
    public int getIsOccupied() {
        return isOccupied;
    }

    /**
     * Sets the value of the isOccupied property.
     * 
     */
    public void setIsOccupied(int value) {
        this.isOccupied = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequests property.
     * 
     */
    public int getIdUniversityOrderRequests() {
        return idUniversityOrderRequests;
    }

    /**
     * Sets the value of the idUniversityOrderRequests property.
     * 
     */
    public void setIdUniversityOrderRequests(int value) {
        this.idUniversityOrderRequests = value;
    }

    /**
     * Gets the value of the occupiedToAdd property.
     * 
     */
    public int getOccupiedToAdd() {
        return occupiedToAdd;
    }

    /**
     * Sets the value of the occupiedToAdd property.
     * 
     */
    public void setOccupiedToAdd(int value) {
        this.occupiedToAdd = value;
    }

    /**
     * Gets the value of the occupiedEndDayToAdd property.
     * 
     */
    public int getOccupiedEndDayToAdd() {
        return occupiedEndDayToAdd;
    }

    /**
     * Sets the value of the occupiedEndDayToAdd property.
     * 
     */
    public void setOccupiedEndDayToAdd(int value) {
        this.occupiedEndDayToAdd = value;
    }

    /**
     * Gets the value of the blockForUserView property.
     * 
     */
    public int getBlockForUserView() {
        return blockForUserView;
    }

    /**
     * Sets the value of the blockForUserView property.
     * 
     */
    public void setBlockForUserView(int value) {
        this.blockForUserView = value;
    }

    /**
     * Gets the value of the isTechnikalRelaxInterval property.
     * 
     */
    public int getIsTechnikalRelaxInterval() {
        return isTechnikalRelaxInterval;
    }

    /**
     * Sets the value of the isTechnikalRelaxInterval property.
     * 
     */
    public void setIsTechnikalRelaxInterval(int value) {
        this.isTechnikalRelaxInterval = value;
    }

}
