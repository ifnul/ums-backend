
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
 *         &lt;element name="UniversityOrderRequestsCalendarFillResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityOrderRequestsCalendarFillResult"
})
@XmlRootElement(name = "UniversityOrderRequestsCalendarFillResponse")
public class UniversityOrderRequestsCalendarFillResponse {

    @XmlElement(name = "UniversityOrderRequestsCalendarFillResult")
    protected int universityOrderRequestsCalendarFillResult;

    /**
     * Gets the value of the universityOrderRequestsCalendarFillResult property.
     * 
     */
    public int getUniversityOrderRequestsCalendarFillResult() {
        return universityOrderRequestsCalendarFillResult;
    }

    /**
     * Sets the value of the universityOrderRequestsCalendarFillResult property.
     * 
     */
    public void setUniversityOrderRequestsCalendarFillResult(int value) {
        this.universityOrderRequestsCalendarFillResult = value;
    }

}
