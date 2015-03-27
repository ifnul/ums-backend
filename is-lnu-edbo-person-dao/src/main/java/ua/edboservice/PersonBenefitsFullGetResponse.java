
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
 *         &lt;element name="PersonBenefitsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonBenefitsFull" minOccurs="0"/>
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
    "personBenefitsFullGetResult"
})
@XmlRootElement(name = "PersonBenefitsFullGetResponse")
public class PersonBenefitsFullGetResponse {

    @XmlElement(name = "PersonBenefitsFullGetResult")
    protected ArrayOfDPersonBenefitsFull personBenefitsFullGetResult;

    /**
     * Gets the value of the personBenefitsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonBenefitsFull }
     *     
     */
    public ArrayOfDPersonBenefitsFull getPersonBenefitsFullGetResult() {
        return personBenefitsFullGetResult;
    }

    /**
     * Sets the value of the personBenefitsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonBenefitsFull }
     *     
     */
    public void setPersonBenefitsFullGetResult(ArrayOfDPersonBenefitsFull value) {
        this.personBenefitsFullGetResult = value;
    }

}
