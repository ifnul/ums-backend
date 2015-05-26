
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
 *         &lt;element name="AlertsClientSetReadedResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "alertsClientSetReadedResult"
})
@XmlRootElement(name = "AlertsClientSetReadedResponse")
public class AlertsClientSetReadedResponse {

    @XmlElement(name = "AlertsClientSetReadedResult")
    protected int alertsClientSetReadedResult;

    /**
     * Gets the value of the alertsClientSetReadedResult property.
     * 
     */
    public int getAlertsClientSetReadedResult() {
        return alertsClientSetReadedResult;
    }

    /**
     * Sets the value of the alertsClientSetReadedResult property.
     * 
     */
    public void setAlertsClientSetReadedResult(int value) {
        this.alertsClientSetReadedResult = value;
    }

}
