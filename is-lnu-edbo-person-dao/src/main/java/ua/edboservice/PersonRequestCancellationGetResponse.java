
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
 *         &lt;element name="PersonRequestCancellationGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestCancellation" minOccurs="0"/>
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
    "personRequestCancellationGetResult"
})
@XmlRootElement(name = "PersonRequestCancellationGetResponse")
public class PersonRequestCancellationGetResponse {

    @XmlElement(name = "PersonRequestCancellationGetResult")
    protected ArrayOfDPersonRequestCancellation personRequestCancellationGetResult;

    /**
     * Gets the value of the personRequestCancellationGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestCancellation }
     *     
     */
    public ArrayOfDPersonRequestCancellation getPersonRequestCancellationGetResult() {
        return personRequestCancellationGetResult;
    }

    /**
     * Sets the value of the personRequestCancellationGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestCancellation }
     *     
     */
    public void setPersonRequestCancellationGetResult(ArrayOfDPersonRequestCancellation value) {
        this.personRequestCancellationGetResult = value;
    }

}
