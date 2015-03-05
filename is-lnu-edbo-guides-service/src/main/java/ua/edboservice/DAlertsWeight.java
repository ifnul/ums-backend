
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAlertsWeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAlertsWeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AlertsWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlertsWeightName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAlertsWeight", propOrder = {
    "idAlertsWeight",
    "alertsWeightName"
})
public class DAlertsWeight {

    @XmlElement(name = "Id_AlertsWeight")
    protected int idAlertsWeight;
    @XmlElement(name = "AlertsWeightName")
    protected String alertsWeightName;

    /**
     * Gets the value of the idAlertsWeight property.
     * 
     */
    public int getIdAlertsWeight() {
        return idAlertsWeight;
    }

    /**
     * Sets the value of the idAlertsWeight property.
     * 
     */
    public void setIdAlertsWeight(int value) {
        this.idAlertsWeight = value;
    }

    /**
     * Gets the value of the alertsWeightName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertsWeightName() {
        return alertsWeightName;
    }

    /**
     * Sets the value of the alertsWeightName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertsWeightName(String value) {
        this.alertsWeightName = value;
    }

}
