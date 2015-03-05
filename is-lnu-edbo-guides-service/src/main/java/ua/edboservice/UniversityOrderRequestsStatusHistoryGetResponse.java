
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
 *         &lt;element name="UniversityOrderRequestsStatusHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityOrderRequestsStatusHistory" minOccurs="0"/>
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
    "universityOrderRequestsStatusHistoryGetResult"
})
@XmlRootElement(name = "UniversityOrderRequestsStatusHistoryGetResponse")
public class UniversityOrderRequestsStatusHistoryGetResponse {

    @XmlElement(name = "UniversityOrderRequestsStatusHistoryGetResult")
    protected ArrayOfDUniversityOrderRequestsStatusHistory universityOrderRequestsStatusHistoryGetResult;

    /**
     * Gets the value of the universityOrderRequestsStatusHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityOrderRequestsStatusHistory }
     *     
     */
    public ArrayOfDUniversityOrderRequestsStatusHistory getUniversityOrderRequestsStatusHistoryGetResult() {
        return universityOrderRequestsStatusHistoryGetResult;
    }

    /**
     * Sets the value of the universityOrderRequestsStatusHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityOrderRequestsStatusHistory }
     *     
     */
    public void setUniversityOrderRequestsStatusHistoryGetResult(ArrayOfDUniversityOrderRequestsStatusHistory value) {
        this.universityOrderRequestsStatusHistoryGetResult = value;
    }

}
