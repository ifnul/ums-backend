
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
 *         &lt;element name="AlertsDetailsGetResult" type="{http://edboservice.ua/}ArrayOfDAlertsDetails" minOccurs="0"/>
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
    "alertsDetailsGetResult"
})
@XmlRootElement(name = "AlertsDetailsGetResponse")
public class AlertsDetailsGetResponse {

    @XmlElement(name = "AlertsDetailsGetResult")
    protected ArrayOfDAlertsDetails alertsDetailsGetResult;

    /**
     * Gets the value of the alertsDetailsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAlertsDetails }
     *     
     */
    public ArrayOfDAlertsDetails getAlertsDetailsGetResult() {
        return alertsDetailsGetResult;
    }

    /**
     * Sets the value of the alertsDetailsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAlertsDetails }
     *     
     */
    public void setAlertsDetailsGetResult(ArrayOfDAlertsDetails value) {
        this.alertsDetailsGetResult = value;
    }

}
