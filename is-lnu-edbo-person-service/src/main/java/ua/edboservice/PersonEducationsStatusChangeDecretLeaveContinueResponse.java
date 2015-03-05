
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
 *         &lt;element name="PersonEducationsStatusChangeDecretLeaveContinueResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeDecretLeaveContinueResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeDecretLeaveContinueResponse")
public class PersonEducationsStatusChangeDecretLeaveContinueResponse {

    @XmlElement(name = "PersonEducationsStatusChangeDecretLeaveContinueResult")
    protected String personEducationsStatusChangeDecretLeaveContinueResult;

    /**
     * Gets the value of the personEducationsStatusChangeDecretLeaveContinueResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeDecretLeaveContinueResult() {
        return personEducationsStatusChangeDecretLeaveContinueResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeDecretLeaveContinueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeDecretLeaveContinueResult(String value) {
        this.personEducationsStatusChangeDecretLeaveContinueResult = value;
    }

}
