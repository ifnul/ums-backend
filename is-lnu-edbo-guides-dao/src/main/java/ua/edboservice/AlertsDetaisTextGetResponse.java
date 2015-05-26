
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
 *         &lt;element name="AlertsDetaisTextGetResult" type="{http://edboservice.ua/}ArrayOfDAlertsDetaisText" minOccurs="0"/>
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
    "alertsDetaisTextGetResult"
})
@XmlRootElement(name = "AlertsDetaisTextGetResponse")
public class AlertsDetaisTextGetResponse {

    @XmlElement(name = "AlertsDetaisTextGetResult")
    protected ArrayOfDAlertsDetaisText alertsDetaisTextGetResult;

    /**
     * Gets the value of the alertsDetaisTextGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAlertsDetaisText }
     *     
     */
    public ArrayOfDAlertsDetaisText getAlertsDetaisTextGetResult() {
        return alertsDetaisTextGetResult;
    }

    /**
     * Sets the value of the alertsDetaisTextGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAlertsDetaisText }
     *     
     */
    public void setAlertsDetaisTextGetResult(ArrayOfDAlertsDetaisText value) {
        this.alertsDetaisTextGetResult = value;
    }

}
