
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
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityOrderRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AllCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ForMove" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "year",
    "month",
    "universityKode",
    "idUniversityOrderRequests",
    "startDate",
    "dayCount",
    "allCount",
    "forMove"
})
@XmlRootElement(name = "UniversityOrderRequestsCalendarGet")
public class UniversityOrderRequestsCalendarGet {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_UniversityOrderRequests")
    protected int idUniversityOrderRequests;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "DayCount")
    protected int dayCount;
    @XmlElement(name = "AllCount")
    protected int allCount;
    @XmlElement(name = "ForMove")
    protected int forMove;

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
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the dayCount property.
     * 
     */
    public int getDayCount() {
        return dayCount;
    }

    /**
     * Sets the value of the dayCount property.
     * 
     */
    public void setDayCount(int value) {
        this.dayCount = value;
    }

    /**
     * Gets the value of the allCount property.
     * 
     */
    public int getAllCount() {
        return allCount;
    }

    /**
     * Sets the value of the allCount property.
     * 
     */
    public void setAllCount(int value) {
        this.allCount = value;
    }

    /**
     * Gets the value of the forMove property.
     * 
     */
    public int getForMove() {
        return forMove;
    }

    /**
     * Sets the value of the forMove property.
     * 
     */
    public void setForMove(int value) {
        this.forMove = value;
    }

}
