
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
 *         &lt;element name="AlertsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDAlertsTypes" minOccurs="0"/>
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
    "alertsTypesGetResult"
})
@XmlRootElement(name = "AlertsTypesGetResponse")
public class AlertsTypesGetResponse {

    @XmlElement(name = "AlertsTypesGetResult")
    protected ArrayOfDAlertsTypes alertsTypesGetResult;

    /**
     * Gets the value of the alertsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAlertsTypes }
     *     
     */
    public ArrayOfDAlertsTypes getAlertsTypesGetResult() {
        return alertsTypesGetResult;
    }

    /**
     * Sets the value of the alertsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAlertsTypes }
     *     
     */
    public void setAlertsTypesGetResult(ArrayOfDAlertsTypes value) {
        this.alertsTypesGetResult = value;
    }

}
