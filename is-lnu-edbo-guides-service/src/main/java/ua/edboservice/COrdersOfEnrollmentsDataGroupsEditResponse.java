
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="cOrdersOfEnrollmentsDataGroupsEditResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cOrdersOfEnrollmentsDataGroupsEditResult"
})
@XmlRootElement(name = "cOrdersOfEnrollmentsDataGroupsEditResponse")
public class COrdersOfEnrollmentsDataGroupsEditResponse {

    protected String cOrdersOfEnrollmentsDataGroupsEditResult;

    /**
     * Gets the value of the cOrdersOfEnrollmentsDataGroupsEditResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOrdersOfEnrollmentsDataGroupsEditResult() {
        return cOrdersOfEnrollmentsDataGroupsEditResult;
    }

    /**
     * Sets the value of the cOrdersOfEnrollmentsDataGroupsEditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOrdersOfEnrollmentsDataGroupsEditResult(String value) {
        this.cOrdersOfEnrollmentsDataGroupsEditResult = value;
    }

}
