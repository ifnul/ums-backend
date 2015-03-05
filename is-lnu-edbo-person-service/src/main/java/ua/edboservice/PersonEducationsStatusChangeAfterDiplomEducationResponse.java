
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
 *         &lt;element name="PersonEducationsStatusChangeAfterDiplomEducationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeAfterDiplomEducationResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeAfterDiplomEducationResponse")
public class PersonEducationsStatusChangeAfterDiplomEducationResponse {

    @XmlElement(name = "PersonEducationsStatusChangeAfterDiplomEducationResult")
    protected String personEducationsStatusChangeAfterDiplomEducationResult;

    /**
     * Gets the value of the personEducationsStatusChangeAfterDiplomEducationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeAfterDiplomEducationResult() {
        return personEducationsStatusChangeAfterDiplomEducationResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeAfterDiplomEducationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeAfterDiplomEducationResult(String value) {
        this.personEducationsStatusChangeAfterDiplomEducationResult = value;
    }

}
