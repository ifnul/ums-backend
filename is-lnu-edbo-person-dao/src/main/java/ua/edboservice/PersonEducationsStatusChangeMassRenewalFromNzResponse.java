
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
 *         &lt;element name="PersonEducationsStatusChangeMassRenewalFromNzResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeMassRenewalFromNzResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeMassRenewalFromNzResponse")
public class PersonEducationsStatusChangeMassRenewalFromNzResponse {

    @XmlElement(name = "PersonEducationsStatusChangeMassRenewalFromNzResult")
    protected String personEducationsStatusChangeMassRenewalFromNzResult;

    /**
     * Gets the value of the personEducationsStatusChangeMassRenewalFromNzResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeMassRenewalFromNzResult() {
        return personEducationsStatusChangeMassRenewalFromNzResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeMassRenewalFromNzResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeMassRenewalFromNzResult(String value) {
        this.personEducationsStatusChangeMassRenewalFromNzResult = value;
    }

}
