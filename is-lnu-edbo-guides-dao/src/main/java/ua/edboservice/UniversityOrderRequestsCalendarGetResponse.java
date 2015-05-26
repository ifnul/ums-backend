
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
 *         &lt;element name="UniversityOrderRequestsCalendarGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityOrderRequestsCalendar" minOccurs="0"/>
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
    "universityOrderRequestsCalendarGetResult"
})
@XmlRootElement(name = "UniversityOrderRequestsCalendarGetResponse")
public class UniversityOrderRequestsCalendarGetResponse {

    @XmlElement(name = "UniversityOrderRequestsCalendarGetResult")
    protected ArrayOfDUniversityOrderRequestsCalendar universityOrderRequestsCalendarGetResult;

    /**
     * Gets the value of the universityOrderRequestsCalendarGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityOrderRequestsCalendar }
     *     
     */
    public ArrayOfDUniversityOrderRequestsCalendar getUniversityOrderRequestsCalendarGetResult() {
        return universityOrderRequestsCalendarGetResult;
    }

    /**
     * Sets the value of the universityOrderRequestsCalendarGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityOrderRequestsCalendar }
     *     
     */
    public void setUniversityOrderRequestsCalendarGetResult(ArrayOfDUniversityOrderRequestsCalendar value) {
        this.universityOrderRequestsCalendarGetResult = value;
    }

}
