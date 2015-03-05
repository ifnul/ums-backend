
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
 *         &lt;element name="PersonRequestCancellationDataDelResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personRequestCancellationDataDelResult"
})
@XmlRootElement(name = "PersonRequestCancellationDataDelResponse")
public class PersonRequestCancellationDataDelResponse {

    @XmlElement(name = "PersonRequestCancellationDataDelResult")
    protected String personRequestCancellationDataDelResult;

    /**
     * Gets the value of the personRequestCancellationDataDelResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestCancellationDataDelResult() {
        return personRequestCancellationDataDelResult;
    }

    /**
     * Sets the value of the personRequestCancellationDataDelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestCancellationDataDelResult(String value) {
        this.personRequestCancellationDataDelResult = value;
    }

}
