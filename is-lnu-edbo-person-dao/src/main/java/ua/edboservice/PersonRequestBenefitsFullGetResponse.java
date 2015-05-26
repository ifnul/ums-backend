
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
 *         &lt;element name="PersonRequestBenefitsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestBenefitsFull" minOccurs="0"/>
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
    "personRequestBenefitsFullGetResult"
})
@XmlRootElement(name = "PersonRequestBenefitsFullGetResponse")
public class PersonRequestBenefitsFullGetResponse {

    @XmlElement(name = "PersonRequestBenefitsFullGetResult")
    protected ArrayOfDPersonRequestBenefitsFull personRequestBenefitsFullGetResult;

    /**
     * Gets the value of the personRequestBenefitsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestBenefitsFull }
     *     
     */
    public ArrayOfDPersonRequestBenefitsFull getPersonRequestBenefitsFullGetResult() {
        return personRequestBenefitsFullGetResult;
    }

    /**
     * Sets the value of the personRequestBenefitsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestBenefitsFull }
     *     
     */
    public void setPersonRequestBenefitsFullGetResult(ArrayOfDPersonRequestBenefitsFull value) {
        this.personRequestBenefitsFullGetResult = value;
    }

}
