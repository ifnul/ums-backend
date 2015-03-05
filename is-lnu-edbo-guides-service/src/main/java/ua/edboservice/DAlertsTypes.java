
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAlertsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAlertsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AlertsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlertsTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAlertsTypes", propOrder = {
    "idAlertsType",
    "alertsTypeName"
})
public class DAlertsTypes {

    @XmlElement(name = "Id_AlertsType")
    protected int idAlertsType;
    @XmlElement(name = "AlertsTypeName")
    protected String alertsTypeName;

    /**
     * Gets the value of the idAlertsType property.
     * 
     */
    public int getIdAlertsType() {
        return idAlertsType;
    }

    /**
     * Sets the value of the idAlertsType property.
     * 
     */
    public void setIdAlertsType(int value) {
        this.idAlertsType = value;
    }

    /**
     * Gets the value of the alertsTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertsTypeName() {
        return alertsTypeName;
    }

    /**
     * Sets the value of the alertsTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertsTypeName(String value) {
        this.alertsTypeName = value;
    }

}
