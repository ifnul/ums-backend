
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
 *         &lt;element name="PersonEducationsStatusChangeCancelEducationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeCancelEducationResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeCancelEducationResponse")
public class PersonEducationsStatusChangeCancelEducationResponse {

    @XmlElement(name = "PersonEducationsStatusChangeCancelEducationResult")
    protected String personEducationsStatusChangeCancelEducationResult;

    /**
     * Gets the value of the personEducationsStatusChangeCancelEducationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeCancelEducationResult() {
        return personEducationsStatusChangeCancelEducationResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeCancelEducationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeCancelEducationResult(String value) {
        this.personEducationsStatusChangeCancelEducationResult = value;
    }

}
