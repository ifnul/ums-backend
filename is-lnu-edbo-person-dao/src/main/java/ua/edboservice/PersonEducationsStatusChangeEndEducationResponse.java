
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
 *         &lt;element name="PersonEducationsStatusChangeEndEducationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeEndEducationResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeEndEducationResponse")
public class PersonEducationsStatusChangeEndEducationResponse {

    @XmlElement(name = "PersonEducationsStatusChangeEndEducationResult")
    protected String personEducationsStatusChangeEndEducationResult;

    /**
     * Gets the value of the personEducationsStatusChangeEndEducationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeEndEducationResult() {
        return personEducationsStatusChangeEndEducationResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeEndEducationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeEndEducationResult(String value) {
        this.personEducationsStatusChangeEndEducationResult = value;
    }

}
