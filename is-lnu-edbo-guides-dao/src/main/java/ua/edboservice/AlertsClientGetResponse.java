
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
 *         &lt;element name="AlertsClientGetResult" type="{http://edboservice.ua/}ArrayOfDAlertsClient" minOccurs="0"/>
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
    "alertsClientGetResult"
})
@XmlRootElement(name = "AlertsClientGetResponse")
public class AlertsClientGetResponse {

    @XmlElement(name = "AlertsClientGetResult")
    protected ArrayOfDAlertsClient alertsClientGetResult;

    /**
     * Gets the value of the alertsClientGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAlertsClient }
     *     
     */
    public ArrayOfDAlertsClient getAlertsClientGetResult() {
        return alertsClientGetResult;
    }

    /**
     * Sets the value of the alertsClientGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAlertsClient }
     *     
     */
    public void setAlertsClientGetResult(ArrayOfDAlertsClient value) {
        this.alertsClientGetResult = value;
    }

}
