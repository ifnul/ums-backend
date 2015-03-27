
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
 *         &lt;element name="PersonRequestCancellationDataAddResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personRequestCancellationDataAddResult"
})
@XmlRootElement(name = "PersonRequestCancellationDataAddResponse")
public class PersonRequestCancellationDataAddResponse {

    @XmlElement(name = "PersonRequestCancellationDataAddResult")
    protected String personRequestCancellationDataAddResult;

    /**
     * Gets the value of the personRequestCancellationDataAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestCancellationDataAddResult() {
        return personRequestCancellationDataAddResult;
    }

    /**
     * Sets the value of the personRequestCancellationDataAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestCancellationDataAddResult(String value) {
        this.personRequestCancellationDataAddResult = value;
    }

}
