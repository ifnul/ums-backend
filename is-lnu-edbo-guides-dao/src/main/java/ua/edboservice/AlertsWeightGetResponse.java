
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
 *         &lt;element name="AlertsWeightGetResult" type="{http://edboservice.ua/}ArrayOfDAlertsWeight" minOccurs="0"/>
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
    "alertsWeightGetResult"
})
@XmlRootElement(name = "AlertsWeightGetResponse")
public class AlertsWeightGetResponse {

    @XmlElement(name = "AlertsWeightGetResult")
    protected ArrayOfDAlertsWeight alertsWeightGetResult;

    /**
     * Gets the value of the alertsWeightGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAlertsWeight }
     *     
     */
    public ArrayOfDAlertsWeight getAlertsWeightGetResult() {
        return alertsWeightGetResult;
    }

    /**
     * Sets the value of the alertsWeightGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAlertsWeight }
     *     
     */
    public void setAlertsWeightGetResult(ArrayOfDAlertsWeight value) {
        this.alertsWeightGetResult = value;
    }

}
