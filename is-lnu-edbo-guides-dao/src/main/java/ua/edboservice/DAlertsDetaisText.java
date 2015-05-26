
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAlertsDetaisText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAlertsDetaisText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAlertsDetaisText", propOrder = {
    "alertDetailText"
})
public class DAlertsDetaisText {

    @XmlElement(name = "AlertDetailText")
    protected String alertDetailText;

    /**
     * Gets the value of the alertDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertDetailText() {
        return alertDetailText;
    }

    /**
     * Sets the value of the alertDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertDetailText(String value) {
        this.alertDetailText = value;
    }

}
