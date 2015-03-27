
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
 *         &lt;element name="PersonRequestQuotasFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestQuotasFull" minOccurs="0"/>
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
    "personRequestQuotasFullGetResult"
})
@XmlRootElement(name = "PersonRequestQuotasFullGetResponse")
public class PersonRequestQuotasFullGetResponse {

    @XmlElement(name = "PersonRequestQuotasFullGetResult")
    protected ArrayOfDPersonRequestQuotasFull personRequestQuotasFullGetResult;

    /**
     * Gets the value of the personRequestQuotasFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestQuotasFull }
     *     
     */
    public ArrayOfDPersonRequestQuotasFull getPersonRequestQuotasFullGetResult() {
        return personRequestQuotasFullGetResult;
    }

    /**
     * Sets the value of the personRequestQuotasFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestQuotasFull }
     *     
     */
    public void setPersonRequestQuotasFullGetResult(ArrayOfDPersonRequestQuotasFull value) {
        this.personRequestQuotasFullGetResult = value;
    }

}
