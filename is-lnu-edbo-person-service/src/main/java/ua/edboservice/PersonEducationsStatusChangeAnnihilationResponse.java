
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
 *         &lt;element name="PersonEducationsStatusChangeAnnihilationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeAnnihilationResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeAnnihilationResponse")
public class PersonEducationsStatusChangeAnnihilationResponse {

    @XmlElement(name = "PersonEducationsStatusChangeAnnihilationResult")
    protected String personEducationsStatusChangeAnnihilationResult;

    /**
     * Gets the value of the personEducationsStatusChangeAnnihilationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeAnnihilationResult() {
        return personEducationsStatusChangeAnnihilationResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeAnnihilationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeAnnihilationResult(String value) {
        this.personEducationsStatusChangeAnnihilationResult = value;
    }

}
