
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
 *         &lt;element name="DeyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlockForUserView" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "deyDate",
    "blockForUserView"
})
@XmlRootElement(name = "UniversityOrderRequestsCalendarDayUserVisibleChange")
public class UniversityOrderRequestsCalendarDayUserVisibleChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "DeyDate")
    protected String deyDate;
    @XmlElement(name = "BlockForUserView")
    protected int blockForUserView;

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
     * Gets the value of the deyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeyDate() {
        return deyDate;
    }

    /**
     * Sets the value of the deyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeyDate(String value) {
        this.deyDate = value;
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

}
