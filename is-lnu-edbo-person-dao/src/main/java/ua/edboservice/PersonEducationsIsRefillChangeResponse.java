
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
 *         &lt;element name="PersonEducationsIsRefillChangeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsIsRefillChangeResult"
})
@XmlRootElement(name = "PersonEducationsIsRefillChangeResponse")
public class PersonEducationsIsRefillChangeResponse {

    @XmlElement(name = "PersonEducationsIsRefillChangeResult")
    protected String personEducationsIsRefillChangeResult;

    /**
     * Gets the value of the personEducationsIsRefillChangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsIsRefillChangeResult() {
        return personEducationsIsRefillChangeResult;
    }

    /**
     * Sets the value of the personEducationsIsRefillChangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsIsRefillChangeResult(String value) {
        this.personEducationsIsRefillChangeResult = value;
    }

}
