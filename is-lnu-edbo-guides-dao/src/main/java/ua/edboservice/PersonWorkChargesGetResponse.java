
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
 *         &lt;element name="PersonWorkChargesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonWorkCharges" minOccurs="0"/>
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
    "personWorkChargesGetResult"
})
@XmlRootElement(name = "PersonWorkChargesGetResponse")
public class PersonWorkChargesGetResponse {

    @XmlElement(name = "PersonWorkChargesGetResult")
    protected ArrayOfDPersonWorkCharges personWorkChargesGetResult;

    /**
     * Gets the value of the personWorkChargesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonWorkCharges }
     *     
     */
    public ArrayOfDPersonWorkCharges getPersonWorkChargesGetResult() {
        return personWorkChargesGetResult;
    }

    /**
     * Sets the value of the personWorkChargesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonWorkCharges }
     *     
     */
    public void setPersonWorkChargesGetResult(ArrayOfDPersonWorkCharges value) {
        this.personWorkChargesGetResult = value;
    }

}
